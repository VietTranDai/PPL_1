//2213951
grammar MiniGo;

@lexer::header {
#2213951
from lexererr import *
}

@lexer::members {
def __init__(self, input: InputStream, output: TextIO = sys.stdout):
    super().__init__(input, output)
    self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
    self._actions = None
    self._predicates = None
    self.previousTokenType = None  # Khởi tạo biến ghi nhớ token trước

def emit(self):
    tk = self.type
    self.previousTokenType = tk
    if tk == self.UNCLOSE_STRING:
        result = super().emit()
        raise UncloseString(result.text)
    elif tk == self.ILLEGAL_ESCAPE:
        result = super().emit()
        raise IllegalEscape(result.text)
    elif tk == self.ERROR_CHAR:
        result = super().emit()
        raise ErrorToken(result.text)
    else:
        return super().emit()
}

// Các option cho Python3
options { language = Python3; }

//---------------------------------------------------------------------
// CẤU TRÚC CHƯƠNG TRÌNH
//
// Một chương trình MiniGo là một file đơn chứa các khai báo (const, var, type, func)
// theo thứ tự tùy ý, trong đó bắt buộc phải có hàm main làm entry point.
//---------------------------------------------------------------------
program : decl+ EOF ;

decl 
    : mainFuncDecl
    | vardecl
    | constdecl
    | typedecl
    | funcdecl
    ;

// Hàm main: bắt buộc không có tham số và không có kiểu trả về.
mainFuncDecl : FUNCTION 'main' '(' ')' block SEMI_COLON? ;

//---------------------------------------------------------------------
// KHẢI BÁO BIẾN, HẰNG SỐ, KIỂU, VÀ HÀM
//---------------------------------------------------------------------

// Khai báo biến: var identifier ( typeDef ( '=' expr )? | '=' expr ) SEMI_COLON
vardecl : VAR IDENTIFIER ( typeDef ( ASSIGN expr )? | ASSIGN expr ) SEMI_COLON ;

// Khai báo hằng: const identifier '=' expr SEMI_COLON
constdecl : CONST IDENTIFIER ASSIGN expr SEMI_COLON ;

// Khai báo kiểu: type identifier typeDef SEMI_COLON?
typedecl : TYPE IDENTIFIER typeDef SEMI_COLON ;

// Khai báo hàm (cho phép có receiver cho method, danh sách tham số và kiểu trả về tùy chọn)
funcdecl : FUNCTION ( '(' receiver ')' )? IDENTIFIER '(' paramList? ')' typeDef? block SEMI_COLON ;

receiver : IDENTIFIER IDENTIFIER ;

//---------------------------------------------------------------------
// KIỂU DỮ LIỆU
//---------------------------------------------------------------------
typeDef 
    : basictype
    | structType
    | interfaceType
    | arrayType
    | IDENTIFIER
    ;

basictype 
    : INT_TYPE
    | FLOAT_TYPE
    | STRING_TYPE
    | BOOLEAN_TYPE
    ;

// Struct: khai báo kiểu struct với các trường bên trong block
structType : STRUCT LBRACE fieldList+ RBRACE ;
fieldList : field (SEMI_COLON field)* SEMI_COLON ;
field : IDENTIFIER typeDef ;

// Interface: khai báo interface với danh sách method
interfaceType : INTERFACE LBRACE methodList+ RBRACE ;
methodList : method (SEMI_COLON method)* SEMI_COLON ;
method : IDENTIFIER LPAREN method_param_opt RPAREN method_type_opt ;
method_param_opt : paramList? ;
method_type_opt : typeDef | /* empty */ ;

// Array: khai báo mảng với một hoặc nhiều kích thước theo sau là kiểu.
// Một kích thước (dim) được định nghĩa dưới dạng một intExpr chỉ cho phép INT hoặc IDENTIFIER.
arrayType : dim+ typeDef ;
dim : LBRACK intExpr RBRACK ;
intExpr : INT | IDENTIFIER ;

// Danh sách tham số: mỗi tham số có thể gồm nhiều tên chia sẻ cùng kiểu
paramList : param (COMMA param)* ;
param : IDENTIFIER (COMMA IDENTIFIER)* typeDef ;

//---------------------------------------------------------------------
// BLOCK VÀ CÂU LỆNH
//---------------------------------------------------------------------
block : LBRACE stmt_list RBRACE ;
stmt_list : stmt* ;

stmt 
    : vardecl
    | constdecl
    | assignment SEMI_COLON
    | ifStmt
    | forStmt SEMI_COLON
    | break_stmt SEMI_COLON
    | continue_stmt SEMI_COLON
    | return_stmt
    | callStmt
    ;

// Assignment: lhs assign_op expr
assignment : lhs assign_op expr ;
assign_op : ASSIGN | ASSIGN_COLON | ADDASSIGN | SUBASSIGN | MULASSIGN | DIVASSIGN | MODASSIGN ;

// If: ép buộc cả phần then và else phải là block.
ifStmt : IF LPAREN expr RPAREN (block | stmt) ifStmt_else_opt;

ifStmt_else_opt : ELSE (ifStmt | stmt SEMI_COLON | block SEMI_COLON) | SEMI_COLON;

// For statement: hỗ trợ 3 dạng: phức tạp (init; cond; update), đơn giản (cond) và for-range
forStmt 
    : forClauseComplex
    | forClauseSimple
    | forRangeStmt
    ;
forClauseComplex : FOR forClause_init forClause_cond forClause_update block ;
forClause_init : vardecl | assignment SEMI_COLON | expr SEMI_COLON | SEMI_COLON ;
forClause_cond : expr SEMI_COLON | SEMI_COLON ;
forClause_update : assignment | expr ;
forClauseSimple : FOR expr block ;
forRangeStmt : FOR IDENTIFIER forRange_tail ASSIGN_COLON RANGE expr block ;
forRange_tail : COMMA IDENTIFIER | /* empty */ ;

// Các câu lệnh điều khiển
break_stmt : BREAK ;
continue_stmt : CONTINUE ;
return_stmt : RETURN expr? SEMI_COLON ;

//---------------------------------------------------------------------
// BIỂU THỨC
// Định nghĩa thứ tự ưu tiên các toán tử từ cao đến thấp.
//---------------------------------------------------------------------
expr : logicalOrExpr ;
logicalOrExpr : logicalOrExpr OR logicalAndExpr
              | logicalAndExpr ;
logicalAndExpr : logicalAndExpr AND equalityExpr
               | equalityExpr ;
equalityExpr : equalityExpr (EQ | NOT_EQ) relationalExpr
             | relationalExpr ;
relationalExpr : relationalExpr (LT | LTE | GT | GTE) additiveExpr
               | additiveExpr ;
additiveExpr : additiveExpr (ADD | SUB) multiplicativeExpr
             | multiplicativeExpr ;
multiplicativeExpr : multiplicativeExpr (MUL | DIV | MOD) unaryExpr
                   | unaryExpr ;
unaryExpr : (NEGATION | SUB) unaryExpr
          | primaryExpr ;
primaryExpr 
    : compositeLiteral
    | literal
    | lhs
    | primaryExpr LBRACK expr RBRACK
    | primaryExpr DOT IDENTIFIER
    | primaryExpr arguments
    | LPAREN expr RPAREN
    ;
    
arguments : LPAREN argumentList? RPAREN ;
argumentList : expr (COMMA expr)* ;

callStmt : primaryExpr SEMI_COLON;

lhs : IDENTIFIER arrayOrStructAccess*;

arrayOrStructAccess : LBRACK expr RBRACK  |  DOT IDENTIFIER;

literal 
    : INT
    | FLOAT
    | TRUE
    | FALSE
    | STRINGLIT
    | NIL
    ;

//---------------------------------------------------------------------
// COMPOSITE LITERAL
// Tách riêng 2 trường hợp: array literal và struct (non-array) literal.
//---------------------------------------------------------------------
compositeLiteral 
    : arrayCompositeLiteral
    | structCompositeLiteral
    ;

// Array literal: chỉ cho phép phần tử là literal (ngoại trừ composite literal mảng) hoặc hằng số (ID)
// hoặc một composite literal lồng (nested) không phải là mảng.
arrayCompositeLiteral : arrayType arrayLiteralBody ;
arrayLiteralBody : LBRACE arrayLiteralElementList RBRACE ;
arrayLiteralElementList : arrayLiteralElement (COMMA arrayLiteralElement)* (COMMA)? ;
arrayLiteralElement : (IDENTIFIER COLON)? (literal | IDENTIFIER | arrayLiteral | structCompositeLiteral) ;

arrayLiteral : LBRACE arrayLiteralElementList RBRACE ;
nonArrayTypeDef : structType | interfaceType | IDENTIFIER ; // Không bao gồm basictype

// Struct literal: cho phép các biểu thức tổng quát
structCompositeLiteral : nonArrayTypeDef structLiteralBody ;
structLiteralBody : LBRACE structLiteralElementList? RBRACE ;
structLiteralElementList : structLiteralElement (COMMA structLiteralElement)* (COMMA)? ;
structLiteralElement : (IDENTIFIER COLON)? expr ;

//---------------------------------------------------------------------
// LEXER RULES
//---------------------------------------------------------------------
// Keywords
VAR : 'var';
CONST : 'const';
IF : 'if';
ELSE : 'else';
FOR : 'for';
RETURN : 'return';
FUNCTION : 'func';
TYPE : 'type';
STRUCT : 'struct';
INTERFACE : 'interface';
STRING_TYPE : 'string';
INT_TYPE : 'int';
FLOAT_TYPE : 'float';
BOOLEAN_TYPE : 'boolean';
CONTINUE : 'continue';
BREAK : 'break';
RANGE : 'range';
TRUE : 'true';
FALSE : 'false';
NIL : 'nil';

// Operators
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
AND : '&&';
OR : '||';
EQ : '==';
NOT_EQ : '!=';
LT : '<';
GT : '>';
LTE : '<=';
GTE : '>=';
NEGATION : '!';
ASSIGN : '=';
ADDASSIGN : '+=';
SUBASSIGN : '-=';
MULASSIGN : '*=';
DIVASSIGN : '/=';
MODASSIGN : '%=';
ASSIGN_COLON : ':=';

// Separators
LBRACK : '[';
RBRACK : ']';
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
COMMA : ',';
SEMI_COLON : ';';
COLON : ':';
DOT : '.';
UNDERSCORE : '_';

// Identifier: bắt đầu bằng chữ hoặc gạch dưới, theo sau là chữ, số hoặc gạch dưới.
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;

//---------------------------------------------------------------------
// Literals & Xử lý chuỗi
//---------------------------------------------------------------------
// Fragment cho escape sequence hợp lệ: \n, \t, \r, \" , \\
fragment ESC : '\\' [ntr"\\];

// Fragment cho ký tự hợp lệ trong chuỗi: bất kỳ ký tự nào ngoại trừ " , \ , \r, \n, hoặc escape sequence hợp lệ.
fragment VALID_CHAR : ~["\\\r\n] | ESC;

// STRINGLIT: chuỗi hợp lệ có bắt đầu và kết thúc bằng dấu "
STRINGLIT : '"' VALID_CHAR* '"' ;

// UNCLOSE_STRING: chuỗi bắt đầu bằng " nhưng không kết thúc đúng (kết thúc bởi EOF hoặc newline)
UNCLOSE_STRING 
    : '"' VALID_CHAR* (EOF | ('\r'? '\n'))
      {
          text = self.text;
          if text.endswith("\r\n"):
              text = text[:-2];
          elif text.endswith("\n"):
              text = text[:-1];
          raise UncloseString(text);
      }
    ;

// ILLEGAL_ESCAPE: chuỗi có chứa escape sequence không hợp lệ
ILLEGAL_ESCAPE
    : '"' VALID_CHAR* '\\' ~[ntr"\\]
      {
          text = self.text;
          raise IllegalEscape(text);
      }
    ;

// Số nguyên: hỗ trợ hệ thập phân, nhị phân, bát phân và thập lục phân.
fragment DEC_INT : [1-9][0-9]* | '0';
fragment BIN_INT : '0b' [01]+ | '0B' [01]+;
fragment OCT_INT : '0o' [0-7]+ | '0O' [0-7]+;
fragment HEX_INT : '0x' [0-9a-fA-F]+ | '0X' [0-9a-fA-F]+;
INT : BIN_INT | OCT_INT | HEX_INT | DEC_INT ;

// Số thực
FLOAT : [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)? ;

//---------------------------------------------------------------------
// COMMENTS
//---------------------------------------------------------------------
// Comment 1 dòng
SINGLE_LINE_COMMENT : '//' ~[\r\n\f]* -> skip ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/' -> skip ;
    
//---------------------------------------------------------------------
// Newline dùng cho semicolon insertion (tự chèn ';' khi cần)
//---------------------------------------------------------------------
NL : ('\r'? '\n')
    {
        if self.previousTokenType in [
            type(self).IDENTIFIER, type(self).TRUE, type(self).FALSE, type(self).NIL,
            type(self).INT, type(self).FLOAT, type(self).STRINGLIT,
            type(self).RETURN, type(self).CONTINUE, type(self).BREAK,
            type(self).RBRACE, type(self).RBRACK, type(self).RPAREN,
            type(self).STRING_TYPE, type(self).INT_TYPE, type(self).FLOAT_TYPE, type(self).BOOLEAN_TYPE
        ]:
            self.type = type(self).SEMI_COLON;
            self.text = ';';
            return self.emit();
        else:
            self.skip();
    }
;

// Whitespace
WS : [ \t\f\r]+ -> skip ;

// Token bắt lỗi cho các ký tự không xác định
ERROR_CHAR : . { raise ErrorToken(self.text); } ;
