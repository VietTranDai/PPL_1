# Generated from main/MiniGo.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B")
        buf.write("\u0266\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31")
        buf.write("\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36")
        buf.write("\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t")
        buf.write("&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4")
        buf.write("/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t\64")
        buf.write("\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t")
        buf.write(";\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\t")
        buf.write("D\3\2\6\2\u008a\n\2\r\2\16\2\u008b\3\2\3\2\3\3\3\3\3\3")
        buf.write("\3\3\3\3\5\3\u0095\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009d")
        buf.write("\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a4\n\5\3\5\3\5\5\5\u00a8")
        buf.write("\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3")
        buf.write("\7\3\b\3\b\3\b\3\b\3\b\5\b\u00bc\n\b\3\b\3\b\3\b\5\b\u00c1")
        buf.write("\n\b\3\b\3\b\5\b\u00c5\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n")
        buf.write("\3\n\3\n\3\n\3\n\5\n\u00d2\n\n\3\13\3\13\3\f\3\f\3\f\6")
        buf.write("\f\u00d9\n\f\r\f\16\f\u00da\3\f\3\f\3\r\3\r\3\r\7\r\u00e2")
        buf.write("\n\r\f\r\16\r\u00e5\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3")
        buf.write("\17\3\17\6\17\u00ef\n\17\r\17\16\17\u00f0\3\17\3\17\3")
        buf.write("\20\3\20\3\20\7\20\u00f8\n\20\f\20\16\20\u00fb\13\20\3")
        buf.write("\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u0106")
        buf.write("\n\22\3\23\3\23\5\23\u010a\n\23\3\24\6\24\u010d\n\24\r")
        buf.write("\24\16\24\u010e\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26")
        buf.write("\3\27\3\27\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27")
        buf.write("\3\30\3\30\3\30\7\30\u0124\n\30\f\30\16\30\u0127\13\30")
        buf.write("\3\30\3\30\3\31\3\31\3\31\3\31\3\32\7\32\u0130\n\32\f")
        buf.write("\32\16\32\u0133\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3")
        buf.write("\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33")
        buf.write("\5\33\u0146\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3")
        buf.write("\36\3\36\3\36\3\36\3\36\5\36\u0154\n\36\3\36\3\36\3\37")
        buf.write("\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0160\n\37\3")
        buf.write("\37\5\37\u0163\n\37\3 \3 \3 \5 \u0168\n \3!\3!\3!\3!\3")
        buf.write("!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0178\n\"\3#")
        buf.write("\3#\3#\3#\5#\u017e\n#\3$\3$\5$\u0182\n$\3%\3%\3%\3%\3")
        buf.write("&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u0193\n\'\3(\3")
        buf.write("(\3)\3)\3*\3*\5*\u019b\n*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3")
        buf.write(",\7,\u01a7\n,\f,\16,\u01aa\13,\3-\3-\3-\3-\3-\3-\7-\u01b2")
        buf.write("\n-\f-\16-\u01b5\13-\3.\3.\3.\3.\3.\3.\7.\u01bd\n.\f.")
        buf.write("\16.\u01c0\13.\3/\3/\3/\3/\3/\3/\7/\u01c8\n/\f/\16/\u01cb")
        buf.write("\13/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u01d3\n\60\f\60")
        buf.write("\16\60\u01d6\13\60\3\61\3\61\3\61\3\61\3\61\3\61\7\61")
        buf.write("\u01de\n\61\f\61\16\61\u01e1\13\61\3\62\3\62\3\62\5\62")
        buf.write("\u01e6\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5")
        buf.write("\63\u01f0\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63")
        buf.write("\3\63\3\63\7\63\u01fc\n\63\f\63\16\63\u01ff\13\63\3\64")
        buf.write("\3\64\5\64\u0203\n\64\3\64\3\64\3\65\3\65\3\65\7\65\u020a")
        buf.write("\n\65\f\65\16\65\u020d\13\65\3\66\3\66\3\66\3\67\3\67")
        buf.write("\7\67\u0214\n\67\f\67\16\67\u0217\13\67\38\38\38\38\3")
        buf.write("8\38\58\u021f\n8\39\39\3:\3:\5:\u0225\n:\3;\3;\3;\3<\3")
        buf.write("<\3<\3<\3=\3=\3=\7=\u0231\n=\f=\16=\u0234\13=\3=\5=\u0237")
        buf.write("\n=\3>\3>\5>\u023b\n>\3>\3>\3>\3>\5>\u0241\n>\3?\3?\3")
        buf.write("?\3?\3@\3@\3@\5@\u024a\n@\3A\3A\3A\3B\3B\5B\u0251\nB\3")
        buf.write("B\3B\3C\3C\3C\7C\u0258\nC\fC\16C\u025b\13C\3C\5C\u025e")
        buf.write("\nC\3D\3D\5D\u0262\nD\3D\3D\3D\2\tVXZ\\^`dE\2\4\6\b\n")
        buf.write("\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<")
        buf.write(">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086")
        buf.write("\2\13\3\2\16\21\4\288<<\3\2&,\3\2\37 \3\2!$\3\2\30\31")
        buf.write("\3\2\32\34\4\2\31\31%%\5\2\25\2799<=\2\u026e\2\u0089\3")
        buf.write("\2\2\2\4\u0094\3\2\2\2\6\u0096\3\2\2\2\b\u009e\3\2\2\2")
        buf.write("\n\u00ab\3\2\2\2\f\u00b1\3\2\2\2\16\u00b6\3\2\2\2\20\u00c9")
        buf.write("\3\2\2\2\22\u00d1\3\2\2\2\24\u00d3\3\2\2\2\26\u00d5\3")
        buf.write("\2\2\2\30\u00de\3\2\2\2\32\u00e8\3\2\2\2\34\u00eb\3\2")
        buf.write("\2\2\36\u00f4\3\2\2\2 \u00fe\3\2\2\2\"\u0105\3\2\2\2$")
        buf.write("\u0109\3\2\2\2&\u010c\3\2\2\2(\u0112\3\2\2\2*\u0116\3")
        buf.write("\2\2\2,\u0118\3\2\2\2.\u0120\3\2\2\2\60\u012a\3\2\2\2")
        buf.write("\62\u0131\3\2\2\2\64\u0145\3\2\2\2\66\u0147\3\2\2\28\u014b")
        buf.write("\3\2\2\2:\u014d\3\2\2\2<\u0162\3\2\2\2>\u0167\3\2\2\2")
        buf.write("@\u0169\3\2\2\2B\u0177\3\2\2\2D\u017d\3\2\2\2F\u0181\3")
        buf.write("\2\2\2H\u0183\3\2\2\2J\u0187\3\2\2\2L\u0192\3\2\2\2N\u0194")
        buf.write("\3\2\2\2P\u0196\3\2\2\2R\u0198\3\2\2\2T\u019e\3\2\2\2")
        buf.write("V\u01a0\3\2\2\2X\u01ab\3\2\2\2Z\u01b6\3\2\2\2\\\u01c1")
        buf.write("\3\2\2\2^\u01cc\3\2\2\2`\u01d7\3\2\2\2b\u01e5\3\2\2\2")
        buf.write("d\u01ef\3\2\2\2f\u0200\3\2\2\2h\u0206\3\2\2\2j\u020e\3")
        buf.write("\2\2\2l\u0211\3\2\2\2n\u021e\3\2\2\2p\u0220\3\2\2\2r\u0224")
        buf.write("\3\2\2\2t\u0226\3\2\2\2v\u0229\3\2\2\2x\u022d\3\2\2\2")
        buf.write("z\u023a\3\2\2\2|\u0242\3\2\2\2~\u0249\3\2\2\2\u0080\u024b")
        buf.write("\3\2\2\2\u0082\u024e\3\2\2\2\u0084\u0254\3\2\2\2\u0086")
        buf.write("\u0261\3\2\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2\2\2")
        buf.write("\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3")
        buf.write("\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\2\2\3\u008e\3")
        buf.write("\3\2\2\2\u008f\u0095\5\6\4\2\u0090\u0095\5\b\5\2\u0091")
        buf.write("\u0095\5\n\6\2\u0092\u0095\5\f\7\2\u0093\u0095\5\16\b")
        buf.write("\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091")
        buf.write("\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095")
        buf.write("\5\3\2\2\2\u0096\u0097\7\n\2\2\u0097\u0098\7\3\2\2\u0098")
        buf.write("\u0099\7\61\2\2\u0099\u009a\7\62\2\2\u009a\u009c\5\60")
        buf.write("\31\2\u009b\u009d\7\64\2\2\u009c\u009b\3\2\2\2\u009c\u009d")
        buf.write("\3\2\2\2\u009d\7\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a7")
        buf.write("\78\2\2\u00a0\u00a3\5\22\n\2\u00a1\u00a2\7&\2\2\u00a2")
        buf.write("\u00a4\5T+\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4")
        buf.write("\u00a8\3\2\2\2\u00a5\u00a6\7&\2\2\u00a6\u00a8\5T+\2\u00a7")
        buf.write("\u00a0\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\3\2\2\2")
        buf.write("\u00a9\u00aa\7\64\2\2\u00aa\t\3\2\2\2\u00ab\u00ac\7\5")
        buf.write("\2\2\u00ac\u00ad\78\2\2\u00ad\u00ae\7&\2\2\u00ae\u00af")
        buf.write("\5T+\2\u00af\u00b0\7\64\2\2\u00b0\13\3\2\2\2\u00b1\u00b2")
        buf.write("\7\13\2\2\u00b2\u00b3\78\2\2\u00b3\u00b4\5\22\n\2\u00b4")
        buf.write("\u00b5\7\64\2\2\u00b5\r\3\2\2\2\u00b6\u00bb\7\n\2\2\u00b7")
        buf.write("\u00b8\7\61\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\7\62")
        buf.write("\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00bc")
        buf.write("\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\78\2\2\u00be")
        buf.write("\u00c0\7\61\2\2\u00bf\u00c1\5,\27\2\u00c0\u00bf\3\2\2")
        buf.write("\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4")
        buf.write("\7\62\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c3\3\2\2\2\u00c4")
        buf.write("\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5\60\31")
        buf.write("\2\u00c7\u00c8\7\64\2\2\u00c8\17\3\2\2\2\u00c9\u00ca\7")
        buf.write("8\2\2\u00ca\u00cb\78\2\2\u00cb\21\3\2\2\2\u00cc\u00d2")
        buf.write("\5\24\13\2\u00cd\u00d2\5\26\f\2\u00ce\u00d2\5\34\17\2")
        buf.write("\u00cf\u00d2\5&\24\2\u00d0\u00d2\78\2\2\u00d1\u00cc\3")
        buf.write("\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf")
        buf.write("\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d4")
        buf.write("\t\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d8")
        buf.write("\7/\2\2\u00d7\u00d9\5\30\r\2\u00d8\u00d7\3\2\2\2\u00d9")
        buf.write("\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2")
        buf.write("\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd\27\3\2")
        buf.write("\2\2\u00de\u00e3\5\32\16\2\u00df\u00e0\7\64\2\2\u00e0")
        buf.write("\u00e2\5\32\16\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2")
        buf.write("\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6")
        buf.write("\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\64\2\2\u00e7")
        buf.write("\31\3\2\2\2\u00e8\u00e9\78\2\2\u00e9\u00ea\5\22\n\2\u00ea")
        buf.write("\33\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec\u00ee\7/\2\2\u00ed")
        buf.write("\u00ef\5\36\20\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2")
        buf.write("\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2")
        buf.write("\3\2\2\2\u00f2\u00f3\7\60\2\2\u00f3\35\3\2\2\2\u00f4\u00f9")
        buf.write("\5 \21\2\u00f5\u00f6\7\64\2\2\u00f6\u00f8\5 \21\2\u00f7")
        buf.write("\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2")
        buf.write("\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3")
        buf.write("\2\2\2\u00fc\u00fd\7\64\2\2\u00fd\37\3\2\2\2\u00fe\u00ff")
        buf.write("\78\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\5\"\22\2\u0101")
        buf.write("\u0102\7\62\2\2\u0102\u0103\5$\23\2\u0103!\3\2\2\2\u0104")
        buf.write("\u0106\5,\27\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2")
        buf.write("\u0106#\3\2\2\2\u0107\u010a\5\22\n\2\u0108\u010a\3\2\2")
        buf.write("\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a%\3\2")
        buf.write("\2\2\u010b\u010d\5(\25\2\u010c\u010b\3\2\2\2\u010d\u010e")
        buf.write("\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f")
        buf.write("\u0110\3\2\2\2\u0110\u0111\5\22\n\2\u0111\'\3\2\2\2\u0112")
        buf.write("\u0113\7-\2\2\u0113\u0114\5*\26\2\u0114\u0115\7.\2\2\u0115")
        buf.write(")\3\2\2\2\u0116\u0117\t\3\2\2\u0117+\3\2\2\2\u0118\u011d")
        buf.write("\5.\30\2\u0119\u011a\7\63\2\2\u011a\u011c\5.\30\2\u011b")
        buf.write("\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2")
        buf.write("\u011d\u011e\3\2\2\2\u011e-\3\2\2\2\u011f\u011d\3\2\2")
        buf.write("\2\u0120\u0125\78\2\2\u0121\u0122\7\63\2\2\u0122\u0124")
        buf.write("\78\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125")
        buf.write("\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2")
        buf.write("\u0127\u0125\3\2\2\2\u0128\u0129\5\22\n\2\u0129/\3\2\2")
        buf.write("\2\u012a\u012b\7/\2\2\u012b\u012c\5\62\32\2\u012c\u012d")
        buf.write("\7\60\2\2\u012d\61\3\2\2\2\u012e\u0130\5\64\33\2\u012f")
        buf.write("\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2")
        buf.write("\u0131\u0132\3\2\2\2\u0132\63\3\2\2\2\u0133\u0131\3\2")
        buf.write("\2\2\u0134\u0146\5\b\5\2\u0135\u0146\5\n\6\2\u0136\u0137")
        buf.write("\5\66\34\2\u0137\u0138\7\64\2\2\u0138\u0146\3\2\2\2\u0139")
        buf.write("\u0146\5:\36\2\u013a\u013b\5> \2\u013b\u013c\7\64\2\2")
        buf.write("\u013c\u0146\3\2\2\2\u013d\u013e\5N(\2\u013e\u013f\7\64")
        buf.write("\2\2\u013f\u0146\3\2\2\2\u0140\u0141\5P)\2\u0141\u0142")
        buf.write("\7\64\2\2\u0142\u0146\3\2\2\2\u0143\u0146\5R*\2\u0144")
        buf.write("\u0146\5j\66\2\u0145\u0134\3\2\2\2\u0145\u0135\3\2\2\2")
        buf.write("\u0145\u0136\3\2\2\2\u0145\u0139\3\2\2\2\u0145\u013a\3")
        buf.write("\2\2\2\u0145\u013d\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0143")
        buf.write("\3\2\2\2\u0145\u0144\3\2\2\2\u0146\65\3\2\2\2\u0147\u0148")
        buf.write("\5l\67\2\u0148\u0149\58\35\2\u0149\u014a\5T+\2\u014a\67")
        buf.write("\3\2\2\2\u014b\u014c\t\4\2\2\u014c9\3\2\2\2\u014d\u014e")
        buf.write("\7\6\2\2\u014e\u014f\7\61\2\2\u014f\u0150\5T+\2\u0150")
        buf.write("\u0153\7\62\2\2\u0151\u0154\5\60\31\2\u0152\u0154\5\64")
        buf.write("\33\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155")
        buf.write("\3\2\2\2\u0155\u0156\5<\37\2\u0156;\3\2\2\2\u0157\u015f")
        buf.write("\7\7\2\2\u0158\u0160\5:\36\2\u0159\u015a\5\64\33\2\u015a")
        buf.write("\u015b\7\64\2\2\u015b\u0160\3\2\2\2\u015c\u015d\5\60\31")
        buf.write("\2\u015d\u015e\7\64\2\2\u015e\u0160\3\2\2\2\u015f\u0158")
        buf.write("\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015c\3\2\2\2\u0160")
        buf.write("\u0163\3\2\2\2\u0161\u0163\7\64\2\2\u0162\u0157\3\2\2")
        buf.write("\2\u0162\u0161\3\2\2\2\u0163=\3\2\2\2\u0164\u0168\5@!")
        buf.write("\2\u0165\u0168\5H%\2\u0166\u0168\5J&\2\u0167\u0164\3\2")
        buf.write("\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168?\3")
        buf.write("\2\2\2\u0169\u016a\7\b\2\2\u016a\u016b\5B\"\2\u016b\u016c")
        buf.write("\5D#\2\u016c\u016d\5F$\2\u016d\u016e\5\60\31\2\u016eA")
        buf.write("\3\2\2\2\u016f\u0178\5\b\5\2\u0170\u0171\5\66\34\2\u0171")
        buf.write("\u0172\7\64\2\2\u0172\u0178\3\2\2\2\u0173\u0174\5T+\2")
        buf.write("\u0174\u0175\7\64\2\2\u0175\u0178\3\2\2\2\u0176\u0178")
        buf.write("\7\64\2\2\u0177\u016f\3\2\2\2\u0177\u0170\3\2\2\2\u0177")
        buf.write("\u0173\3\2\2\2\u0177\u0176\3\2\2\2\u0178C\3\2\2\2\u0179")
        buf.write("\u017a\5T+\2\u017a\u017b\7\64\2\2\u017b\u017e\3\2\2\2")
        buf.write("\u017c\u017e\7\64\2\2\u017d\u0179\3\2\2\2\u017d\u017c")
        buf.write("\3\2\2\2\u017eE\3\2\2\2\u017f\u0182\5\66\34\2\u0180\u0182")
        buf.write("\5T+\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182G")
        buf.write("\3\2\2\2\u0183\u0184\7\b\2\2\u0184\u0185\5T+\2\u0185\u0186")
        buf.write("\5\60\31\2\u0186I\3\2\2\2\u0187\u0188\7\b\2\2\u0188\u0189")
        buf.write("\78\2\2\u0189\u018a\5L\'\2\u018a\u018b\7,\2\2\u018b\u018c")
        buf.write("\7\24\2\2\u018c\u018d\5T+\2\u018d\u018e\5\60\31\2\u018e")
        buf.write("K\3\2\2\2\u018f\u0190\7\63\2\2\u0190\u0193\78\2\2\u0191")
        buf.write("\u0193\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0191\3\2\2\2")
        buf.write("\u0193M\3\2\2\2\u0194\u0195\7\23\2\2\u0195O\3\2\2\2\u0196")
        buf.write("\u0197\7\22\2\2\u0197Q\3\2\2\2\u0198\u019a\7\t\2\2\u0199")
        buf.write("\u019b\5T+\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b")
        buf.write("\u019c\3\2\2\2\u019c\u019d\7\64\2\2\u019dS\3\2\2\2\u019e")
        buf.write("\u019f\5V,\2\u019fU\3\2\2\2\u01a0\u01a1\b,\1\2\u01a1\u01a2")
        buf.write("\5X-\2\u01a2\u01a8\3\2\2\2\u01a3\u01a4\f\4\2\2\u01a4\u01a5")
        buf.write("\7\36\2\2\u01a5\u01a7\5X-\2\u01a6\u01a3\3\2\2\2\u01a7")
        buf.write("\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2")
        buf.write("\u01a9W\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\b-\1\2")
        buf.write("\u01ac\u01ad\5Z.\2\u01ad\u01b3\3\2\2\2\u01ae\u01af\f\4")
        buf.write("\2\2\u01af\u01b0\7\35\2\2\u01b0\u01b2\5Z.\2\u01b1\u01ae")
        buf.write("\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3")
        buf.write("\u01b4\3\2\2\2\u01b4Y\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6")
        buf.write("\u01b7\b.\1\2\u01b7\u01b8\5\\/\2\u01b8\u01be\3\2\2\2\u01b9")
        buf.write("\u01ba\f\4\2\2\u01ba\u01bb\t\5\2\2\u01bb\u01bd\5\\/\2")
        buf.write("\u01bc\u01b9\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3")
        buf.write("\2\2\2\u01be\u01bf\3\2\2\2\u01bf[\3\2\2\2\u01c0\u01be")
        buf.write("\3\2\2\2\u01c1\u01c2\b/\1\2\u01c2\u01c3\5^\60\2\u01c3")
        buf.write("\u01c9\3\2\2\2\u01c4\u01c5\f\4\2\2\u01c5\u01c6\t\6\2\2")
        buf.write("\u01c6\u01c8\5^\60\2\u01c7\u01c4\3\2\2\2\u01c8\u01cb\3")
        buf.write("\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca]")
        buf.write("\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\b\60\1\2\u01cd")
        buf.write("\u01ce\5`\61\2\u01ce\u01d4\3\2\2\2\u01cf\u01d0\f\4\2\2")
        buf.write("\u01d0\u01d1\t\7\2\2\u01d1\u01d3\5`\61\2\u01d2\u01cf\3")
        buf.write("\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5")
        buf.write("\3\2\2\2\u01d5_\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8")
        buf.write("\b\61\1\2\u01d8\u01d9\5b\62\2\u01d9\u01df\3\2\2\2\u01da")
        buf.write("\u01db\f\4\2\2\u01db\u01dc\t\b\2\2\u01dc\u01de\5b\62\2")
        buf.write("\u01dd\u01da\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3")
        buf.write("\2\2\2\u01df\u01e0\3\2\2\2\u01e0a\3\2\2\2\u01e1\u01df")
        buf.write("\3\2\2\2\u01e2\u01e3\t\t\2\2\u01e3\u01e6\5b\62\2\u01e4")
        buf.write("\u01e6\5d\63\2\u01e5\u01e2\3\2\2\2\u01e5\u01e4\3\2\2\2")
        buf.write("\u01e6c\3\2\2\2\u01e7\u01e8\b\63\1\2\u01e8\u01f0\5r:\2")
        buf.write("\u01e9\u01f0\5p9\2\u01ea\u01f0\5l\67\2\u01eb\u01ec\7\61")
        buf.write("\2\2\u01ec\u01ed\5T+\2\u01ed\u01ee\7\62\2\2\u01ee\u01f0")
        buf.write("\3\2\2\2\u01ef\u01e7\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef")
        buf.write("\u01ea\3\2\2\2\u01ef\u01eb\3\2\2\2\u01f0\u01fd\3\2\2\2")
        buf.write("\u01f1\u01f2\f\6\2\2\u01f2\u01f3\7-\2\2\u01f3\u01f4\5")
        buf.write("T+\2\u01f4\u01f5\7.\2\2\u01f5\u01fc\3\2\2\2\u01f6\u01f7")
        buf.write("\f\5\2\2\u01f7\u01f8\7\66\2\2\u01f8\u01fc\78\2\2\u01f9")
        buf.write("\u01fa\f\4\2\2\u01fa\u01fc\5f\64\2\u01fb\u01f1\3\2\2\2")
        buf.write("\u01fb\u01f6\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3")
        buf.write("\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fee")
        buf.write("\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7\61\2\2\u0201")
        buf.write("\u0203\5h\65\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2")
        buf.write("\u0203\u0204\3\2\2\2\u0204\u0205\7\62\2\2\u0205g\3\2\2")
        buf.write("\2\u0206\u020b\5T+\2\u0207\u0208\7\63\2\2\u0208\u020a")
        buf.write("\5T+\2\u0209\u0207\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209")
        buf.write("\3\2\2\2\u020b\u020c\3\2\2\2\u020ci\3\2\2\2\u020d\u020b")
        buf.write("\3\2\2\2\u020e\u020f\5d\63\2\u020f\u0210\7\64\2\2\u0210")
        buf.write("k\3\2\2\2\u0211\u0215\78\2\2\u0212\u0214\5n8\2\u0213\u0212")
        buf.write("\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215")
        buf.write("\u0216\3\2\2\2\u0216m\3\2\2\2\u0217\u0215\3\2\2\2\u0218")
        buf.write("\u0219\7-\2\2\u0219\u021a\5T+\2\u021a\u021b\7.\2\2\u021b")
        buf.write("\u021f\3\2\2\2\u021c\u021d\7\66\2\2\u021d\u021f\78\2\2")
        buf.write("\u021e\u0218\3\2\2\2\u021e\u021c\3\2\2\2\u021fo\3\2\2")
        buf.write("\2\u0220\u0221\t\n\2\2\u0221q\3\2\2\2\u0222\u0225\5t;")
        buf.write("\2\u0223\u0225\5\u0080A\2\u0224\u0222\3\2\2\2\u0224\u0223")
        buf.write("\3\2\2\2\u0225s\3\2\2\2\u0226\u0227\5&\24\2\u0227\u0228")
        buf.write("\5v<\2\u0228u\3\2\2\2\u0229\u022a\7/\2\2\u022a\u022b\5")
        buf.write("x=\2\u022b\u022c\7\60\2\2\u022cw\3\2\2\2\u022d\u0232\5")
        buf.write("z>\2\u022e\u022f\7\63\2\2\u022f\u0231\5z>\2\u0230\u022e")
        buf.write("\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232")
        buf.write("\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2")
        buf.write("\u0235\u0237\7\63\2\2\u0236\u0235\3\2\2\2\u0236\u0237")
        buf.write("\3\2\2\2\u0237y\3\2\2\2\u0238\u0239\78\2\2\u0239\u023b")
        buf.write("\7\65\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b")
        buf.write("\u0240\3\2\2\2\u023c\u0241\5p9\2\u023d\u0241\78\2\2\u023e")
        buf.write("\u0241\5|?\2\u023f\u0241\5\u0080A\2\u0240\u023c\3\2\2")
        buf.write("\2\u0240\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f")
        buf.write("\3\2\2\2\u0241{\3\2\2\2\u0242\u0243\7/\2\2\u0243\u0244")
        buf.write("\5x=\2\u0244\u0245\7\60\2\2\u0245}\3\2\2\2\u0246\u024a")
        buf.write("\5\26\f\2\u0247\u024a\5\34\17\2\u0248\u024a\78\2\2\u0249")
        buf.write("\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2")
        buf.write("\u024a\177\3\2\2\2\u024b\u024c\5~@\2\u024c\u024d\5\u0082")
        buf.write("B\2\u024d\u0081\3\2\2\2\u024e\u0250\7/\2\2\u024f\u0251")
        buf.write("\5\u0084C\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251")
        buf.write("\u0252\3\2\2\2\u0252\u0253\7\60\2\2\u0253\u0083\3\2\2")
        buf.write("\2\u0254\u0259\5\u0086D\2\u0255\u0256\7\63\2\2\u0256\u0258")
        buf.write("\5\u0086D\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259")
        buf.write("\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d\3\2\2\2")
        buf.write("\u025b\u0259\3\2\2\2\u025c\u025e\7\63\2\2\u025d\u025c")
        buf.write("\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0085\3\2\2\2\u025f")
        buf.write("\u0260\78\2\2\u0260\u0262\7\65\2\2\u0261\u025f\3\2\2\2")
        buf.write("\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\5")
        buf.write("T+\2\u0264\u0087\3\2\2\2\67\u008b\u0094\u009c\u00a3\u00a7")
        buf.write("\u00bb\u00c0\u00c4\u00d1\u00da\u00e3\u00f0\u00f9\u0105")
        buf.write("\u0109\u010e\u011d\u0125\u0131\u0145\u0153\u015f\u0162")
        buf.write("\u0167\u0177\u017d\u0181\u0192\u019a\u01a8\u01b3\u01be")
        buf.write("\u01c9\u01d4\u01df\u01e5\u01ef\u01fb\u01fd\u0202\u020b")
        buf.write("\u0215\u021e\u0224\u0232\u0236\u023a\u0240\u0249\u0250")
        buf.write("\u0259\u025d\u0261")
        return buf.getvalue()


class MiniGoParser ( Parser ):

    grammarFileName = "MiniGo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'main'", "'var'", "'const'", "'if'", 
                     "'else'", "'for'", "'return'", "'func'", "'type'", 
                     "'struct'", "'interface'", "'string'", "'int'", "'float'", 
                     "'boolean'", "'continue'", "'break'", "'range'", "'true'", 
                     "'false'", "'nil'", "'+'", "'-'", "'*'", "'/'", "'%'", 
                     "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", 
                     "'>='", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", 
                     "'%='", "':='", "'['", "']'", "'{'", "'}'", "'('", 
                     "')'", "','", "';'", "':'", "'.'", "'_'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "VAR", "CONST", "IF", "ELSE", 
                      "FOR", "RETURN", "FUNCTION", "TYPE", "STRUCT", "INTERFACE", 
                      "STRING_TYPE", "INT_TYPE", "FLOAT_TYPE", "BOOLEAN_TYPE", 
                      "CONTINUE", "BREAK", "RANGE", "TRUE", "FALSE", "NIL", 
                      "ADD", "SUB", "MUL", "DIV", "MOD", "AND", "OR", "EQ", 
                      "NOT_EQ", "LT", "GT", "LTE", "GTE", "NEGATION", "ASSIGN", 
                      "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
                      "MODASSIGN", "ASSIGN_COLON", "LBRACK", "RBRACK", "LBRACE", 
                      "RBRACE", "LPAREN", "RPAREN", "COMMA", "SEMI_COLON", 
                      "COLON", "DOT", "UNDERSCORE", "IDENTIFIER", "STRINGLIT", 
                      "UNCLOSE_STRING", "ILLEGAL_ESCAPE", "INT", "FLOAT", 
                      "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "NL", 
                      "WS", "ERROR_CHAR" ]

    RULE_program = 0
    RULE_decl = 1
    RULE_mainFuncDecl = 2
    RULE_vardecl = 3
    RULE_constdecl = 4
    RULE_typedecl = 5
    RULE_funcdecl = 6
    RULE_receiver = 7
    RULE_typeDef = 8
    RULE_basictype = 9
    RULE_structType = 10
    RULE_fieldList = 11
    RULE_field = 12
    RULE_interfaceType = 13
    RULE_methodList = 14
    RULE_method = 15
    RULE_method_param_opt = 16
    RULE_method_type_opt = 17
    RULE_arrayType = 18
    RULE_dim = 19
    RULE_intExpr = 20
    RULE_paramList = 21
    RULE_param = 22
    RULE_block = 23
    RULE_stmt_list = 24
    RULE_stmt = 25
    RULE_assignment = 26
    RULE_assign_op = 27
    RULE_ifStmt = 28
    RULE_ifStmt_else_opt = 29
    RULE_forStmt = 30
    RULE_forClauseComplex = 31
    RULE_forClause_init = 32
    RULE_forClause_cond = 33
    RULE_forClause_update = 34
    RULE_forClauseSimple = 35
    RULE_forRangeStmt = 36
    RULE_forRange_tail = 37
    RULE_break_stmt = 38
    RULE_continue_stmt = 39
    RULE_return_stmt = 40
    RULE_expr = 41
    RULE_logicalOrExpr = 42
    RULE_logicalAndExpr = 43
    RULE_equalityExpr = 44
    RULE_relationalExpr = 45
    RULE_additiveExpr = 46
    RULE_multiplicativeExpr = 47
    RULE_unaryExpr = 48
    RULE_primaryExpr = 49
    RULE_arguments = 50
    RULE_argumentList = 51
    RULE_callStmt = 52
    RULE_lhs = 53
    RULE_arrayOrStructAccess = 54
    RULE_literal = 55
    RULE_compositeLiteral = 56
    RULE_arrayCompositeLiteral = 57
    RULE_arrayLiteralBody = 58
    RULE_arrayLiteralElementList = 59
    RULE_arrayLiteralElement = 60
    RULE_arrayLiteral = 61
    RULE_nonArrayTypeDef = 62
    RULE_structCompositeLiteral = 63
    RULE_structLiteralBody = 64
    RULE_structLiteralElementList = 65
    RULE_structLiteralElement = 66

    ruleNames =  [ "program", "decl", "mainFuncDecl", "vardecl", "constdecl", 
                   "typedecl", "funcdecl", "receiver", "typeDef", "basictype", 
                   "structType", "fieldList", "field", "interfaceType", 
                   "methodList", "method", "method_param_opt", "method_type_opt", 
                   "arrayType", "dim", "intExpr", "paramList", "param", 
                   "block", "stmt_list", "stmt", "assignment", "assign_op", 
                   "ifStmt", "ifStmt_else_opt", "forStmt", "forClauseComplex", 
                   "forClause_init", "forClause_cond", "forClause_update", 
                   "forClauseSimple", "forRangeStmt", "forRange_tail", "break_stmt", 
                   "continue_stmt", "return_stmt", "expr", "logicalOrExpr", 
                   "logicalAndExpr", "equalityExpr", "relationalExpr", "additiveExpr", 
                   "multiplicativeExpr", "unaryExpr", "primaryExpr", "arguments", 
                   "argumentList", "callStmt", "lhs", "arrayOrStructAccess", 
                   "literal", "compositeLiteral", "arrayCompositeLiteral", 
                   "arrayLiteralBody", "arrayLiteralElementList", "arrayLiteralElement", 
                   "arrayLiteral", "nonArrayTypeDef", "structCompositeLiteral", 
                   "structLiteralBody", "structLiteralElementList", "structLiteralElement" ]

    EOF = Token.EOF
    T__0=1
    VAR=2
    CONST=3
    IF=4
    ELSE=5
    FOR=6
    RETURN=7
    FUNCTION=8
    TYPE=9
    STRUCT=10
    INTERFACE=11
    STRING_TYPE=12
    INT_TYPE=13
    FLOAT_TYPE=14
    BOOLEAN_TYPE=15
    CONTINUE=16
    BREAK=17
    RANGE=18
    TRUE=19
    FALSE=20
    NIL=21
    ADD=22
    SUB=23
    MUL=24
    DIV=25
    MOD=26
    AND=27
    OR=28
    EQ=29
    NOT_EQ=30
    LT=31
    GT=32
    LTE=33
    GTE=34
    NEGATION=35
    ASSIGN=36
    ADDASSIGN=37
    SUBASSIGN=38
    MULASSIGN=39
    DIVASSIGN=40
    MODASSIGN=41
    ASSIGN_COLON=42
    LBRACK=43
    RBRACK=44
    LBRACE=45
    RBRACE=46
    LPAREN=47
    RPAREN=48
    COMMA=49
    SEMI_COLON=50
    COLON=51
    DOT=52
    UNDERSCORE=53
    IDENTIFIER=54
    STRINGLIT=55
    UNCLOSE_STRING=56
    ILLEGAL_ESCAPE=57
    INT=58
    FLOAT=59
    SINGLE_LINE_COMMENT=60
    MULTI_LINE_COMMENT=61
    NL=62
    WS=63
    ERROR_CHAR=64

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MiniGoParser.EOF, 0)

        def decl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.DeclContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.DeclContext,i)


        def getRuleIndex(self):
            return MiniGoParser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = MiniGoParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 135 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 134
                self.decl()
                self.state = 137 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.VAR) | (1 << MiniGoParser.CONST) | (1 << MiniGoParser.FUNCTION) | (1 << MiniGoParser.TYPE))) != 0)):
                    break

            self.state = 139
            self.match(MiniGoParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def mainFuncDecl(self):
            return self.getTypedRuleContext(MiniGoParser.MainFuncDeclContext,0)


        def vardecl(self):
            return self.getTypedRuleContext(MiniGoParser.VardeclContext,0)


        def constdecl(self):
            return self.getTypedRuleContext(MiniGoParser.ConstdeclContext,0)


        def typedecl(self):
            return self.getTypedRuleContext(MiniGoParser.TypedeclContext,0)


        def funcdecl(self):
            return self.getTypedRuleContext(MiniGoParser.FuncdeclContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_decl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDecl" ):
                return visitor.visitDecl(self)
            else:
                return visitor.visitChildren(self)




    def decl(self):

        localctx = MiniGoParser.DeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_decl)
        try:
            self.state = 146
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 141
                self.mainFuncDecl()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 142
                self.vardecl()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 143
                self.constdecl()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 144
                self.typedecl()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 145
                self.funcdecl()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MainFuncDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION(self):
            return self.getToken(MiniGoParser.FUNCTION, 0)

        def LPAREN(self):
            return self.getToken(MiniGoParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(MiniGoParser.RPAREN, 0)

        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_mainFuncDecl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMainFuncDecl" ):
                return visitor.visitMainFuncDecl(self)
            else:
                return visitor.visitChildren(self)




    def mainFuncDecl(self):

        localctx = MiniGoParser.MainFuncDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_mainFuncDecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 148
            self.match(MiniGoParser.FUNCTION)
            self.state = 149
            self.match(MiniGoParser.T__0)
            self.state = 150
            self.match(MiniGoParser.LPAREN)
            self.state = 151
            self.match(MiniGoParser.RPAREN)
            self.state = 152
            self.block()
            self.state = 154
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==MiniGoParser.SEMI_COLON:
                self.state = 153
                self.match(MiniGoParser.SEMI_COLON)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VardeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(MiniGoParser.VAR, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def ASSIGN(self):
            return self.getToken(MiniGoParser.ASSIGN, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_vardecl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVardecl" ):
                return visitor.visitVardecl(self)
            else:
                return visitor.visitChildren(self)




    def vardecl(self):

        localctx = MiniGoParser.VardeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_vardecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.match(MiniGoParser.VAR)
            self.state = 157
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 165
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.STRUCT, MiniGoParser.INTERFACE, MiniGoParser.STRING_TYPE, MiniGoParser.INT_TYPE, MiniGoParser.FLOAT_TYPE, MiniGoParser.BOOLEAN_TYPE, MiniGoParser.LBRACK, MiniGoParser.IDENTIFIER]:
                self.state = 158
                self.typeDef()
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==MiniGoParser.ASSIGN:
                    self.state = 159
                    self.match(MiniGoParser.ASSIGN)
                    self.state = 160
                    self.expr()


                pass
            elif token in [MiniGoParser.ASSIGN]:
                self.state = 163
                self.match(MiniGoParser.ASSIGN)
                self.state = 164
                self.expr()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 167
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConstdeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONST(self):
            return self.getToken(MiniGoParser.CONST, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def ASSIGN(self):
            return self.getToken(MiniGoParser.ASSIGN, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_constdecl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConstdecl" ):
                return visitor.visitConstdecl(self)
            else:
                return visitor.visitChildren(self)




    def constdecl(self):

        localctx = MiniGoParser.ConstdeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_constdecl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 169
            self.match(MiniGoParser.CONST)
            self.state = 170
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 171
            self.match(MiniGoParser.ASSIGN)
            self.state = 172
            self.expr()
            self.state = 173
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypedeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE(self):
            return self.getToken(MiniGoParser.TYPE, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_typedecl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypedecl" ):
                return visitor.visitTypedecl(self)
            else:
                return visitor.visitChildren(self)




    def typedecl(self):

        localctx = MiniGoParser.TypedeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_typedecl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 175
            self.match(MiniGoParser.TYPE)
            self.state = 176
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 177
            self.typeDef()
            self.state = 178
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncdeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION(self):
            return self.getToken(MiniGoParser.FUNCTION, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def LPAREN(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.LPAREN)
            else:
                return self.getToken(MiniGoParser.LPAREN, i)

        def RPAREN(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.RPAREN)
            else:
                return self.getToken(MiniGoParser.RPAREN, i)

        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def receiver(self):
            return self.getTypedRuleContext(MiniGoParser.ReceiverContext,0)


        def paramList(self):
            return self.getTypedRuleContext(MiniGoParser.ParamListContext,0)


        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_funcdecl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncdecl" ):
                return visitor.visitFuncdecl(self)
            else:
                return visitor.visitChildren(self)




    def funcdecl(self):

        localctx = MiniGoParser.FuncdeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_funcdecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            self.match(MiniGoParser.FUNCTION)
            self.state = 185
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==MiniGoParser.LPAREN:
                self.state = 181
                self.match(MiniGoParser.LPAREN)
                self.state = 182
                self.receiver()
                self.state = 183
                self.match(MiniGoParser.RPAREN)


            self.state = 187
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 188
            self.match(MiniGoParser.LPAREN)
            self.state = 190
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==MiniGoParser.IDENTIFIER:
                self.state = 189
                self.paramList()


            self.state = 192
            self.match(MiniGoParser.RPAREN)
            self.state = 194
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.STRUCT) | (1 << MiniGoParser.INTERFACE) | (1 << MiniGoParser.STRING_TYPE) | (1 << MiniGoParser.INT_TYPE) | (1 << MiniGoParser.FLOAT_TYPE) | (1 << MiniGoParser.BOOLEAN_TYPE) | (1 << MiniGoParser.LBRACK) | (1 << MiniGoParser.IDENTIFIER))) != 0):
                self.state = 193
                self.typeDef()


            self.state = 196
            self.block()
            self.state = 197
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ReceiverContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.IDENTIFIER)
            else:
                return self.getToken(MiniGoParser.IDENTIFIER, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_receiver

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReceiver" ):
                return visitor.visitReceiver(self)
            else:
                return visitor.visitChildren(self)




    def receiver(self):

        localctx = MiniGoParser.ReceiverContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_receiver)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 199
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 200
            self.match(MiniGoParser.IDENTIFIER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def basictype(self):
            return self.getTypedRuleContext(MiniGoParser.BasictypeContext,0)


        def structType(self):
            return self.getTypedRuleContext(MiniGoParser.StructTypeContext,0)


        def interfaceType(self):
            return self.getTypedRuleContext(MiniGoParser.InterfaceTypeContext,0)


        def arrayType(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayTypeContext,0)


        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_typeDef

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypeDef" ):
                return visitor.visitTypeDef(self)
            else:
                return visitor.visitChildren(self)




    def typeDef(self):

        localctx = MiniGoParser.TypeDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_typeDef)
        try:
            self.state = 207
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.STRING_TYPE, MiniGoParser.INT_TYPE, MiniGoParser.FLOAT_TYPE, MiniGoParser.BOOLEAN_TYPE]:
                self.enterOuterAlt(localctx, 1)
                self.state = 202
                self.basictype()
                pass
            elif token in [MiniGoParser.STRUCT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 203
                self.structType()
                pass
            elif token in [MiniGoParser.INTERFACE]:
                self.enterOuterAlt(localctx, 3)
                self.state = 204
                self.interfaceType()
                pass
            elif token in [MiniGoParser.LBRACK]:
                self.enterOuterAlt(localctx, 4)
                self.state = 205
                self.arrayType()
                pass
            elif token in [MiniGoParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 5)
                self.state = 206
                self.match(MiniGoParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BasictypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT_TYPE(self):
            return self.getToken(MiniGoParser.INT_TYPE, 0)

        def FLOAT_TYPE(self):
            return self.getToken(MiniGoParser.FLOAT_TYPE, 0)

        def STRING_TYPE(self):
            return self.getToken(MiniGoParser.STRING_TYPE, 0)

        def BOOLEAN_TYPE(self):
            return self.getToken(MiniGoParser.BOOLEAN_TYPE, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_basictype

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBasictype" ):
                return visitor.visitBasictype(self)
            else:
                return visitor.visitChildren(self)




    def basictype(self):

        localctx = MiniGoParser.BasictypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_basictype)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 209
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.STRING_TYPE) | (1 << MiniGoParser.INT_TYPE) | (1 << MiniGoParser.FLOAT_TYPE) | (1 << MiniGoParser.BOOLEAN_TYPE))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructTypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRUCT(self):
            return self.getToken(MiniGoParser.STRUCT, 0)

        def LBRACE(self):
            return self.getToken(MiniGoParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(MiniGoParser.RBRACE, 0)

        def fieldList(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.FieldListContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.FieldListContext,i)


        def getRuleIndex(self):
            return MiniGoParser.RULE_structType

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStructType" ):
                return visitor.visitStructType(self)
            else:
                return visitor.visitChildren(self)




    def structType(self):

        localctx = MiniGoParser.StructTypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_structType)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 211
            self.match(MiniGoParser.STRUCT)
            self.state = 212
            self.match(MiniGoParser.LBRACE)
            self.state = 214 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 213
                self.fieldList()
                self.state = 216 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==MiniGoParser.IDENTIFIER):
                    break

            self.state = 218
            self.match(MiniGoParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FieldListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def field(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.FieldContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.FieldContext,i)


        def SEMI_COLON(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.SEMI_COLON)
            else:
                return self.getToken(MiniGoParser.SEMI_COLON, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_fieldList

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFieldList" ):
                return visitor.visitFieldList(self)
            else:
                return visitor.visitChildren(self)




    def fieldList(self):

        localctx = MiniGoParser.FieldListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_fieldList)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 220
            self.field()
            self.state = 225
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 221
                    self.match(MiniGoParser.SEMI_COLON)
                    self.state = 222
                    self.field() 
                self.state = 227
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

            self.state = 228
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FieldContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_field

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitField" ):
                return visitor.visitField(self)
            else:
                return visitor.visitChildren(self)




    def field(self):

        localctx = MiniGoParser.FieldContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_field)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 230
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 231
            self.typeDef()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InterfaceTypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INTERFACE(self):
            return self.getToken(MiniGoParser.INTERFACE, 0)

        def LBRACE(self):
            return self.getToken(MiniGoParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(MiniGoParser.RBRACE, 0)

        def methodList(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.MethodListContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.MethodListContext,i)


        def getRuleIndex(self):
            return MiniGoParser.RULE_interfaceType

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInterfaceType" ):
                return visitor.visitInterfaceType(self)
            else:
                return visitor.visitChildren(self)




    def interfaceType(self):

        localctx = MiniGoParser.InterfaceTypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_interfaceType)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 233
            self.match(MiniGoParser.INTERFACE)
            self.state = 234
            self.match(MiniGoParser.LBRACE)
            self.state = 236 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 235
                self.methodList()
                self.state = 238 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==MiniGoParser.IDENTIFIER):
                    break

            self.state = 240
            self.match(MiniGoParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def method(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.MethodContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.MethodContext,i)


        def SEMI_COLON(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.SEMI_COLON)
            else:
                return self.getToken(MiniGoParser.SEMI_COLON, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_methodList

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethodList" ):
                return visitor.visitMethodList(self)
            else:
                return visitor.visitChildren(self)




    def methodList(self):

        localctx = MiniGoParser.MethodListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_methodList)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 242
            self.method()
            self.state = 247
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,12,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 243
                    self.match(MiniGoParser.SEMI_COLON)
                    self.state = 244
                    self.method() 
                self.state = 249
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

            self.state = 250
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def LPAREN(self):
            return self.getToken(MiniGoParser.LPAREN, 0)

        def method_param_opt(self):
            return self.getTypedRuleContext(MiniGoParser.Method_param_optContext,0)


        def RPAREN(self):
            return self.getToken(MiniGoParser.RPAREN, 0)

        def method_type_opt(self):
            return self.getTypedRuleContext(MiniGoParser.Method_type_optContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_method

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod" ):
                return visitor.visitMethod(self)
            else:
                return visitor.visitChildren(self)




    def method(self):

        localctx = MiniGoParser.MethodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_method)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 252
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 253
            self.match(MiniGoParser.LPAREN)
            self.state = 254
            self.method_param_opt()
            self.state = 255
            self.match(MiniGoParser.RPAREN)
            self.state = 256
            self.method_type_opt()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_param_optContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def paramList(self):
            return self.getTypedRuleContext(MiniGoParser.ParamListContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_method_param_opt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod_param_opt" ):
                return visitor.visitMethod_param_opt(self)
            else:
                return visitor.visitChildren(self)




    def method_param_opt(self):

        localctx = MiniGoParser.Method_param_optContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_method_param_opt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 259
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==MiniGoParser.IDENTIFIER:
                self.state = 258
                self.paramList()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_type_optContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_method_type_opt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod_type_opt" ):
                return visitor.visitMethod_type_opt(self)
            else:
                return visitor.visitChildren(self)




    def method_type_opt(self):

        localctx = MiniGoParser.Method_type_optContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_method_type_opt)
        try:
            self.state = 263
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.STRUCT, MiniGoParser.INTERFACE, MiniGoParser.STRING_TYPE, MiniGoParser.INT_TYPE, MiniGoParser.FLOAT_TYPE, MiniGoParser.BOOLEAN_TYPE, MiniGoParser.LBRACK, MiniGoParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 261
                self.typeDef()
                pass
            elif token in [MiniGoParser.SEMI_COLON]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayTypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def dim(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.DimContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.DimContext,i)


        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayType

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayType" ):
                return visitor.visitArrayType(self)
            else:
                return visitor.visitChildren(self)




    def arrayType(self):

        localctx = MiniGoParser.ArrayTypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_arrayType)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 266 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 265
                    self.dim()

                else:
                    raise NoViableAltException(self)
                self.state = 268 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,15,self._ctx)

            self.state = 270
            self.typeDef()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DimContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACK(self):
            return self.getToken(MiniGoParser.LBRACK, 0)

        def intExpr(self):
            return self.getTypedRuleContext(MiniGoParser.IntExprContext,0)


        def RBRACK(self):
            return self.getToken(MiniGoParser.RBRACK, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_dim

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDim" ):
                return visitor.visitDim(self)
            else:
                return visitor.visitChildren(self)




    def dim(self):

        localctx = MiniGoParser.DimContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_dim)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 272
            self.match(MiniGoParser.LBRACK)
            self.state = 273
            self.intExpr()
            self.state = 274
            self.match(MiniGoParser.RBRACK)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IntExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(MiniGoParser.INT, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_intExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIntExpr" ):
                return visitor.visitIntExpr(self)
            else:
                return visitor.visitChildren(self)




    def intExpr(self):

        localctx = MiniGoParser.IntExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_intExpr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 276
            _la = self._input.LA(1)
            if not(_la==MiniGoParser.IDENTIFIER or _la==MiniGoParser.INT):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def param(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.ParamContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.ParamContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.COMMA)
            else:
                return self.getToken(MiniGoParser.COMMA, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_paramList

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParamList" ):
                return visitor.visitParamList(self)
            else:
                return visitor.visitChildren(self)




    def paramList(self):

        localctx = MiniGoParser.ParamListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_paramList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 278
            self.param()
            self.state = 283
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==MiniGoParser.COMMA:
                self.state = 279
                self.match(MiniGoParser.COMMA)
                self.state = 280
                self.param()
                self.state = 285
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.IDENTIFIER)
            else:
                return self.getToken(MiniGoParser.IDENTIFIER, i)

        def typeDef(self):
            return self.getTypedRuleContext(MiniGoParser.TypeDefContext,0)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.COMMA)
            else:
                return self.getToken(MiniGoParser.COMMA, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_param

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParam" ):
                return visitor.visitParam(self)
            else:
                return visitor.visitChildren(self)




    def param(self):

        localctx = MiniGoParser.ParamContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_param)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 286
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 291
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==MiniGoParser.COMMA:
                self.state = 287
                self.match(MiniGoParser.COMMA)
                self.state = 288
                self.match(MiniGoParser.IDENTIFIER)
                self.state = 293
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 294
            self.typeDef()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACE(self):
            return self.getToken(MiniGoParser.LBRACE, 0)

        def stmt_list(self):
            return self.getTypedRuleContext(MiniGoParser.Stmt_listContext,0)


        def RBRACE(self):
            return self.getToken(MiniGoParser.RBRACE, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_block

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)




    def block(self):

        localctx = MiniGoParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 296
            self.match(MiniGoParser.LBRACE)
            self.state = 297
            self.stmt_list()
            self.state = 298
            self.match(MiniGoParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Stmt_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.StmtContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.StmtContext,i)


        def getRuleIndex(self):
            return MiniGoParser.RULE_stmt_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStmt_list" ):
                return visitor.visitStmt_list(self)
            else:
                return visitor.visitChildren(self)




    def stmt_list(self):

        localctx = MiniGoParser.Stmt_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_stmt_list)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 303
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.VAR) | (1 << MiniGoParser.CONST) | (1 << MiniGoParser.IF) | (1 << MiniGoParser.FOR) | (1 << MiniGoParser.RETURN) | (1 << MiniGoParser.STRUCT) | (1 << MiniGoParser.INTERFACE) | (1 << MiniGoParser.CONTINUE) | (1 << MiniGoParser.BREAK) | (1 << MiniGoParser.TRUE) | (1 << MiniGoParser.FALSE) | (1 << MiniGoParser.NIL) | (1 << MiniGoParser.LBRACK) | (1 << MiniGoParser.LPAREN) | (1 << MiniGoParser.IDENTIFIER) | (1 << MiniGoParser.STRINGLIT) | (1 << MiniGoParser.INT) | (1 << MiniGoParser.FLOAT))) != 0):
                self.state = 300
                self.stmt()
                self.state = 305
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vardecl(self):
            return self.getTypedRuleContext(MiniGoParser.VardeclContext,0)


        def constdecl(self):
            return self.getTypedRuleContext(MiniGoParser.ConstdeclContext,0)


        def assignment(self):
            return self.getTypedRuleContext(MiniGoParser.AssignmentContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def ifStmt(self):
            return self.getTypedRuleContext(MiniGoParser.IfStmtContext,0)


        def forStmt(self):
            return self.getTypedRuleContext(MiniGoParser.ForStmtContext,0)


        def break_stmt(self):
            return self.getTypedRuleContext(MiniGoParser.Break_stmtContext,0)


        def continue_stmt(self):
            return self.getTypedRuleContext(MiniGoParser.Continue_stmtContext,0)


        def return_stmt(self):
            return self.getTypedRuleContext(MiniGoParser.Return_stmtContext,0)


        def callStmt(self):
            return self.getTypedRuleContext(MiniGoParser.CallStmtContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_stmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStmt" ):
                return visitor.visitStmt(self)
            else:
                return visitor.visitChildren(self)




    def stmt(self):

        localctx = MiniGoParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_stmt)
        try:
            self.state = 323
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 306
                self.vardecl()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 307
                self.constdecl()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 308
                self.assignment()
                self.state = 309
                self.match(MiniGoParser.SEMI_COLON)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 311
                self.ifStmt()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 312
                self.forStmt()
                self.state = 313
                self.match(MiniGoParser.SEMI_COLON)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 315
                self.break_stmt()
                self.state = 316
                self.match(MiniGoParser.SEMI_COLON)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 318
                self.continue_stmt()
                self.state = 319
                self.match(MiniGoParser.SEMI_COLON)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 321
                self.return_stmt()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 322
                self.callStmt()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lhs(self):
            return self.getTypedRuleContext(MiniGoParser.LhsContext,0)


        def assign_op(self):
            return self.getTypedRuleContext(MiniGoParser.Assign_opContext,0)


        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_assignment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)




    def assignment(self):

        localctx = MiniGoParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 325
            self.lhs()
            self.state = 326
            self.assign_op()
            self.state = 327
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assign_opContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ASSIGN(self):
            return self.getToken(MiniGoParser.ASSIGN, 0)

        def ASSIGN_COLON(self):
            return self.getToken(MiniGoParser.ASSIGN_COLON, 0)

        def ADDASSIGN(self):
            return self.getToken(MiniGoParser.ADDASSIGN, 0)

        def SUBASSIGN(self):
            return self.getToken(MiniGoParser.SUBASSIGN, 0)

        def MULASSIGN(self):
            return self.getToken(MiniGoParser.MULASSIGN, 0)

        def DIVASSIGN(self):
            return self.getToken(MiniGoParser.DIVASSIGN, 0)

        def MODASSIGN(self):
            return self.getToken(MiniGoParser.MODASSIGN, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_assign_op

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign_op" ):
                return visitor.visitAssign_op(self)
            else:
                return visitor.visitChildren(self)




    def assign_op(self):

        localctx = MiniGoParser.Assign_opContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_assign_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 329
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.ASSIGN) | (1 << MiniGoParser.ADDASSIGN) | (1 << MiniGoParser.SUBASSIGN) | (1 << MiniGoParser.MULASSIGN) | (1 << MiniGoParser.DIVASSIGN) | (1 << MiniGoParser.MODASSIGN) | (1 << MiniGoParser.ASSIGN_COLON))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(MiniGoParser.IF, 0)

        def LPAREN(self):
            return self.getToken(MiniGoParser.LPAREN, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def RPAREN(self):
            return self.getToken(MiniGoParser.RPAREN, 0)

        def ifStmt_else_opt(self):
            return self.getTypedRuleContext(MiniGoParser.IfStmt_else_optContext,0)


        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def stmt(self):
            return self.getTypedRuleContext(MiniGoParser.StmtContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_ifStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfStmt" ):
                return visitor.visitIfStmt(self)
            else:
                return visitor.visitChildren(self)




    def ifStmt(self):

        localctx = MiniGoParser.IfStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_ifStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 331
            self.match(MiniGoParser.IF)
            self.state = 332
            self.match(MiniGoParser.LPAREN)
            self.state = 333
            self.expr()
            self.state = 334
            self.match(MiniGoParser.RPAREN)
            self.state = 337
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.LBRACE]:
                self.state = 335
                self.block()
                pass
            elif token in [MiniGoParser.VAR, MiniGoParser.CONST, MiniGoParser.IF, MiniGoParser.FOR, MiniGoParser.RETURN, MiniGoParser.STRUCT, MiniGoParser.INTERFACE, MiniGoParser.CONTINUE, MiniGoParser.BREAK, MiniGoParser.TRUE, MiniGoParser.FALSE, MiniGoParser.NIL, MiniGoParser.LBRACK, MiniGoParser.LPAREN, MiniGoParser.IDENTIFIER, MiniGoParser.STRINGLIT, MiniGoParser.INT, MiniGoParser.FLOAT]:
                self.state = 336
                self.stmt()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 339
            self.ifStmt_else_opt()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStmt_else_optContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ELSE(self):
            return self.getToken(MiniGoParser.ELSE, 0)

        def ifStmt(self):
            return self.getTypedRuleContext(MiniGoParser.IfStmtContext,0)


        def stmt(self):
            return self.getTypedRuleContext(MiniGoParser.StmtContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_ifStmt_else_opt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfStmt_else_opt" ):
                return visitor.visitIfStmt_else_opt(self)
            else:
                return visitor.visitChildren(self)




    def ifStmt_else_opt(self):

        localctx = MiniGoParser.IfStmt_else_optContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_ifStmt_else_opt)
        try:
            self.state = 352
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.ELSE]:
                self.enterOuterAlt(localctx, 1)
                self.state = 341
                self.match(MiniGoParser.ELSE)
                self.state = 349
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
                if la_ == 1:
                    self.state = 342
                    self.ifStmt()
                    pass

                elif la_ == 2:
                    self.state = 343
                    self.stmt()
                    self.state = 344
                    self.match(MiniGoParser.SEMI_COLON)
                    pass

                elif la_ == 3:
                    self.state = 346
                    self.block()
                    self.state = 347
                    self.match(MiniGoParser.SEMI_COLON)
                    pass


                pass
            elif token in [MiniGoParser.SEMI_COLON]:
                self.enterOuterAlt(localctx, 2)
                self.state = 351
                self.match(MiniGoParser.SEMI_COLON)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def forClauseComplex(self):
            return self.getTypedRuleContext(MiniGoParser.ForClauseComplexContext,0)


        def forClauseSimple(self):
            return self.getTypedRuleContext(MiniGoParser.ForClauseSimpleContext,0)


        def forRangeStmt(self):
            return self.getTypedRuleContext(MiniGoParser.ForRangeStmtContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_forStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForStmt" ):
                return visitor.visitForStmt(self)
            else:
                return visitor.visitChildren(self)




    def forStmt(self):

        localctx = MiniGoParser.ForStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_forStmt)
        try:
            self.state = 357
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,23,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 354
                self.forClauseComplex()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 355
                self.forClauseSimple()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 356
                self.forRangeStmt()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForClauseComplexContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(MiniGoParser.FOR, 0)

        def forClause_init(self):
            return self.getTypedRuleContext(MiniGoParser.ForClause_initContext,0)


        def forClause_cond(self):
            return self.getTypedRuleContext(MiniGoParser.ForClause_condContext,0)


        def forClause_update(self):
            return self.getTypedRuleContext(MiniGoParser.ForClause_updateContext,0)


        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_forClauseComplex

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForClauseComplex" ):
                return visitor.visitForClauseComplex(self)
            else:
                return visitor.visitChildren(self)




    def forClauseComplex(self):

        localctx = MiniGoParser.ForClauseComplexContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_forClauseComplex)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 359
            self.match(MiniGoParser.FOR)
            self.state = 360
            self.forClause_init()
            self.state = 361
            self.forClause_cond()
            self.state = 362
            self.forClause_update()
            self.state = 363
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForClause_initContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vardecl(self):
            return self.getTypedRuleContext(MiniGoParser.VardeclContext,0)


        def assignment(self):
            return self.getTypedRuleContext(MiniGoParser.AssignmentContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_forClause_init

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForClause_init" ):
                return visitor.visitForClause_init(self)
            else:
                return visitor.visitChildren(self)




    def forClause_init(self):

        localctx = MiniGoParser.ForClause_initContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_forClause_init)
        try:
            self.state = 373
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,24,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 365
                self.vardecl()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 366
                self.assignment()
                self.state = 367
                self.match(MiniGoParser.SEMI_COLON)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 369
                self.expr()
                self.state = 370
                self.match(MiniGoParser.SEMI_COLON)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 372
                self.match(MiniGoParser.SEMI_COLON)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForClause_condContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_forClause_cond

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForClause_cond" ):
                return visitor.visitForClause_cond(self)
            else:
                return visitor.visitChildren(self)




    def forClause_cond(self):

        localctx = MiniGoParser.ForClause_condContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_forClause_cond)
        try:
            self.state = 379
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.STRUCT, MiniGoParser.INTERFACE, MiniGoParser.TRUE, MiniGoParser.FALSE, MiniGoParser.NIL, MiniGoParser.SUB, MiniGoParser.NEGATION, MiniGoParser.LBRACK, MiniGoParser.LPAREN, MiniGoParser.IDENTIFIER, MiniGoParser.STRINGLIT, MiniGoParser.INT, MiniGoParser.FLOAT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 375
                self.expr()
                self.state = 376
                self.match(MiniGoParser.SEMI_COLON)
                pass
            elif token in [MiniGoParser.SEMI_COLON]:
                self.enterOuterAlt(localctx, 2)
                self.state = 378
                self.match(MiniGoParser.SEMI_COLON)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForClause_updateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(MiniGoParser.AssignmentContext,0)


        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_forClause_update

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForClause_update" ):
                return visitor.visitForClause_update(self)
            else:
                return visitor.visitChildren(self)




    def forClause_update(self):

        localctx = MiniGoParser.ForClause_updateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_forClause_update)
        try:
            self.state = 383
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,26,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 381
                self.assignment()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 382
                self.expr()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForClauseSimpleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(MiniGoParser.FOR, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_forClauseSimple

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForClauseSimple" ):
                return visitor.visitForClauseSimple(self)
            else:
                return visitor.visitChildren(self)




    def forClauseSimple(self):

        localctx = MiniGoParser.ForClauseSimpleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_forClauseSimple)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 385
            self.match(MiniGoParser.FOR)
            self.state = 386
            self.expr()
            self.state = 387
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForRangeStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(MiniGoParser.FOR, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def forRange_tail(self):
            return self.getTypedRuleContext(MiniGoParser.ForRange_tailContext,0)


        def ASSIGN_COLON(self):
            return self.getToken(MiniGoParser.ASSIGN_COLON, 0)

        def RANGE(self):
            return self.getToken(MiniGoParser.RANGE, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def block(self):
            return self.getTypedRuleContext(MiniGoParser.BlockContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_forRangeStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForRangeStmt" ):
                return visitor.visitForRangeStmt(self)
            else:
                return visitor.visitChildren(self)




    def forRangeStmt(self):

        localctx = MiniGoParser.ForRangeStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_forRangeStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 389
            self.match(MiniGoParser.FOR)
            self.state = 390
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 391
            self.forRange_tail()
            self.state = 392
            self.match(MiniGoParser.ASSIGN_COLON)
            self.state = 393
            self.match(MiniGoParser.RANGE)
            self.state = 394
            self.expr()
            self.state = 395
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForRange_tailContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMA(self):
            return self.getToken(MiniGoParser.COMMA, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_forRange_tail

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForRange_tail" ):
                return visitor.visitForRange_tail(self)
            else:
                return visitor.visitChildren(self)




    def forRange_tail(self):

        localctx = MiniGoParser.ForRange_tailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_forRange_tail)
        try:
            self.state = 400
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.COMMA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 397
                self.match(MiniGoParser.COMMA)
                self.state = 398
                self.match(MiniGoParser.IDENTIFIER)
                pass
            elif token in [MiniGoParser.ASSIGN_COLON]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Break_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BREAK(self):
            return self.getToken(MiniGoParser.BREAK, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_break_stmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBreak_stmt" ):
                return visitor.visitBreak_stmt(self)
            else:
                return visitor.visitChildren(self)




    def break_stmt(self):

        localctx = MiniGoParser.Break_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 76, self.RULE_break_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 402
            self.match(MiniGoParser.BREAK)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Continue_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONTINUE(self):
            return self.getToken(MiniGoParser.CONTINUE, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_continue_stmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitContinue_stmt" ):
                return visitor.visitContinue_stmt(self)
            else:
                return visitor.visitChildren(self)




    def continue_stmt(self):

        localctx = MiniGoParser.Continue_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 78, self.RULE_continue_stmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 404
            self.match(MiniGoParser.CONTINUE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Return_stmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(MiniGoParser.RETURN, 0)

        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_return_stmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturn_stmt" ):
                return visitor.visitReturn_stmt(self)
            else:
                return visitor.visitChildren(self)




    def return_stmt(self):

        localctx = MiniGoParser.Return_stmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 80, self.RULE_return_stmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 406
            self.match(MiniGoParser.RETURN)
            self.state = 408
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.STRUCT) | (1 << MiniGoParser.INTERFACE) | (1 << MiniGoParser.TRUE) | (1 << MiniGoParser.FALSE) | (1 << MiniGoParser.NIL) | (1 << MiniGoParser.SUB) | (1 << MiniGoParser.NEGATION) | (1 << MiniGoParser.LBRACK) | (1 << MiniGoParser.LPAREN) | (1 << MiniGoParser.IDENTIFIER) | (1 << MiniGoParser.STRINGLIT) | (1 << MiniGoParser.INT) | (1 << MiniGoParser.FLOAT))) != 0):
                self.state = 407
                self.expr()


            self.state = 410
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def logicalOrExpr(self):
            return self.getTypedRuleContext(MiniGoParser.LogicalOrExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_expr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = MiniGoParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 82, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 412
            self.logicalOrExpr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LogicalOrExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def logicalAndExpr(self):
            return self.getTypedRuleContext(MiniGoParser.LogicalAndExprContext,0)


        def logicalOrExpr(self):
            return self.getTypedRuleContext(MiniGoParser.LogicalOrExprContext,0)


        def OR(self):
            return self.getToken(MiniGoParser.OR, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_logicalOrExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogicalOrExpr" ):
                return visitor.visitLogicalOrExpr(self)
            else:
                return visitor.visitChildren(self)



    def logicalOrExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.LogicalOrExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 84
        self.enterRecursionRule(localctx, 84, self.RULE_logicalOrExpr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 415
            self.logicalAndExpr(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 422
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,29,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniGoParser.LogicalOrExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_logicalOrExpr)
                    self.state = 417
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 418
                    self.match(MiniGoParser.OR)
                    self.state = 419
                    self.logicalAndExpr(0) 
                self.state = 424
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,29,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class LogicalAndExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def equalityExpr(self):
            return self.getTypedRuleContext(MiniGoParser.EqualityExprContext,0)


        def logicalAndExpr(self):
            return self.getTypedRuleContext(MiniGoParser.LogicalAndExprContext,0)


        def AND(self):
            return self.getToken(MiniGoParser.AND, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_logicalAndExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogicalAndExpr" ):
                return visitor.visitLogicalAndExpr(self)
            else:
                return visitor.visitChildren(self)



    def logicalAndExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.LogicalAndExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 86
        self.enterRecursionRule(localctx, 86, self.RULE_logicalAndExpr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 426
            self.equalityExpr(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 433
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,30,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniGoParser.LogicalAndExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_logicalAndExpr)
                    self.state = 428
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 429
                    self.match(MiniGoParser.AND)
                    self.state = 430
                    self.equalityExpr(0) 
                self.state = 435
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,30,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class EqualityExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def relationalExpr(self):
            return self.getTypedRuleContext(MiniGoParser.RelationalExprContext,0)


        def equalityExpr(self):
            return self.getTypedRuleContext(MiniGoParser.EqualityExprContext,0)


        def EQ(self):
            return self.getToken(MiniGoParser.EQ, 0)

        def NOT_EQ(self):
            return self.getToken(MiniGoParser.NOT_EQ, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_equalityExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEqualityExpr" ):
                return visitor.visitEqualityExpr(self)
            else:
                return visitor.visitChildren(self)



    def equalityExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.EqualityExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 88
        self.enterRecursionRule(localctx, 88, self.RULE_equalityExpr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 437
            self.relationalExpr(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 444
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,31,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniGoParser.EqualityExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_equalityExpr)
                    self.state = 439
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 440
                    _la = self._input.LA(1)
                    if not(_la==MiniGoParser.EQ or _la==MiniGoParser.NOT_EQ):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 441
                    self.relationalExpr(0) 
                self.state = 446
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,31,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class RelationalExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def additiveExpr(self):
            return self.getTypedRuleContext(MiniGoParser.AdditiveExprContext,0)


        def relationalExpr(self):
            return self.getTypedRuleContext(MiniGoParser.RelationalExprContext,0)


        def LT(self):
            return self.getToken(MiniGoParser.LT, 0)

        def LTE(self):
            return self.getToken(MiniGoParser.LTE, 0)

        def GT(self):
            return self.getToken(MiniGoParser.GT, 0)

        def GTE(self):
            return self.getToken(MiniGoParser.GTE, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_relationalExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRelationalExpr" ):
                return visitor.visitRelationalExpr(self)
            else:
                return visitor.visitChildren(self)



    def relationalExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.RelationalExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 90
        self.enterRecursionRule(localctx, 90, self.RULE_relationalExpr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 448
            self.additiveExpr(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 455
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,32,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniGoParser.RelationalExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_relationalExpr)
                    self.state = 450
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 451
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.LT) | (1 << MiniGoParser.GT) | (1 << MiniGoParser.LTE) | (1 << MiniGoParser.GTE))) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 452
                    self.additiveExpr(0) 
                self.state = 457
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,32,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class AdditiveExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def multiplicativeExpr(self):
            return self.getTypedRuleContext(MiniGoParser.MultiplicativeExprContext,0)


        def additiveExpr(self):
            return self.getTypedRuleContext(MiniGoParser.AdditiveExprContext,0)


        def ADD(self):
            return self.getToken(MiniGoParser.ADD, 0)

        def SUB(self):
            return self.getToken(MiniGoParser.SUB, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_additiveExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAdditiveExpr" ):
                return visitor.visitAdditiveExpr(self)
            else:
                return visitor.visitChildren(self)



    def additiveExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.AdditiveExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 92
        self.enterRecursionRule(localctx, 92, self.RULE_additiveExpr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 459
            self.multiplicativeExpr(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 466
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,33,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniGoParser.AdditiveExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_additiveExpr)
                    self.state = 461
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 462
                    _la = self._input.LA(1)
                    if not(_la==MiniGoParser.ADD or _la==MiniGoParser.SUB):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 463
                    self.multiplicativeExpr(0) 
                self.state = 468
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,33,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class MultiplicativeExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unaryExpr(self):
            return self.getTypedRuleContext(MiniGoParser.UnaryExprContext,0)


        def multiplicativeExpr(self):
            return self.getTypedRuleContext(MiniGoParser.MultiplicativeExprContext,0)


        def MUL(self):
            return self.getToken(MiniGoParser.MUL, 0)

        def DIV(self):
            return self.getToken(MiniGoParser.DIV, 0)

        def MOD(self):
            return self.getToken(MiniGoParser.MOD, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_multiplicativeExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultiplicativeExpr" ):
                return visitor.visitMultiplicativeExpr(self)
            else:
                return visitor.visitChildren(self)



    def multiplicativeExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.MultiplicativeExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 94
        self.enterRecursionRule(localctx, 94, self.RULE_multiplicativeExpr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 470
            self.unaryExpr()
            self._ctx.stop = self._input.LT(-1)
            self.state = 477
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,34,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniGoParser.MultiplicativeExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_multiplicativeExpr)
                    self.state = 472
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 473
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.MUL) | (1 << MiniGoParser.DIV) | (1 << MiniGoParser.MOD))) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 474
                    self.unaryExpr() 
                self.state = 479
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,34,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class UnaryExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unaryExpr(self):
            return self.getTypedRuleContext(MiniGoParser.UnaryExprContext,0)


        def NEGATION(self):
            return self.getToken(MiniGoParser.NEGATION, 0)

        def SUB(self):
            return self.getToken(MiniGoParser.SUB, 0)

        def primaryExpr(self):
            return self.getTypedRuleContext(MiniGoParser.PrimaryExprContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_unaryExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnaryExpr" ):
                return visitor.visitUnaryExpr(self)
            else:
                return visitor.visitChildren(self)




    def unaryExpr(self):

        localctx = MiniGoParser.UnaryExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 96, self.RULE_unaryExpr)
        self._la = 0 # Token type
        try:
            self.state = 483
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.SUB, MiniGoParser.NEGATION]:
                self.enterOuterAlt(localctx, 1)
                self.state = 480
                _la = self._input.LA(1)
                if not(_la==MiniGoParser.SUB or _la==MiniGoParser.NEGATION):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 481
                self.unaryExpr()
                pass
            elif token in [MiniGoParser.STRUCT, MiniGoParser.INTERFACE, MiniGoParser.TRUE, MiniGoParser.FALSE, MiniGoParser.NIL, MiniGoParser.LBRACK, MiniGoParser.LPAREN, MiniGoParser.IDENTIFIER, MiniGoParser.STRINGLIT, MiniGoParser.INT, MiniGoParser.FLOAT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 482
                self.primaryExpr(0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrimaryExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def compositeLiteral(self):
            return self.getTypedRuleContext(MiniGoParser.CompositeLiteralContext,0)


        def literal(self):
            return self.getTypedRuleContext(MiniGoParser.LiteralContext,0)


        def lhs(self):
            return self.getTypedRuleContext(MiniGoParser.LhsContext,0)


        def LPAREN(self):
            return self.getToken(MiniGoParser.LPAREN, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def RPAREN(self):
            return self.getToken(MiniGoParser.RPAREN, 0)

        def primaryExpr(self):
            return self.getTypedRuleContext(MiniGoParser.PrimaryExprContext,0)


        def LBRACK(self):
            return self.getToken(MiniGoParser.LBRACK, 0)

        def RBRACK(self):
            return self.getToken(MiniGoParser.RBRACK, 0)

        def DOT(self):
            return self.getToken(MiniGoParser.DOT, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def arguments(self):
            return self.getTypedRuleContext(MiniGoParser.ArgumentsContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_primaryExpr

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrimaryExpr" ):
                return visitor.visitPrimaryExpr(self)
            else:
                return visitor.visitChildren(self)



    def primaryExpr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniGoParser.PrimaryExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 98
        self.enterRecursionRule(localctx, 98, self.RULE_primaryExpr, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 493
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,36,self._ctx)
            if la_ == 1:
                self.state = 486
                self.compositeLiteral()
                pass

            elif la_ == 2:
                self.state = 487
                self.literal()
                pass

            elif la_ == 3:
                self.state = 488
                self.lhs()
                pass

            elif la_ == 4:
                self.state = 489
                self.match(MiniGoParser.LPAREN)
                self.state = 490
                self.expr()
                self.state = 491
                self.match(MiniGoParser.RPAREN)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 507
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,38,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 505
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
                    if la_ == 1:
                        localctx = MiniGoParser.PrimaryExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_primaryExpr)
                        self.state = 495
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 496
                        self.match(MiniGoParser.LBRACK)
                        self.state = 497
                        self.expr()
                        self.state = 498
                        self.match(MiniGoParser.RBRACK)
                        pass

                    elif la_ == 2:
                        localctx = MiniGoParser.PrimaryExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_primaryExpr)
                        self.state = 500
                        if not self.precpred(self._ctx, 3):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 3)")
                        self.state = 501
                        self.match(MiniGoParser.DOT)
                        self.state = 502
                        self.match(MiniGoParser.IDENTIFIER)
                        pass

                    elif la_ == 3:
                        localctx = MiniGoParser.PrimaryExprContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_primaryExpr)
                        self.state = 503
                        if not self.precpred(self._ctx, 2):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                        self.state = 504
                        self.arguments()
                        pass

             
                self.state = 509
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,38,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class ArgumentsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LPAREN(self):
            return self.getToken(MiniGoParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(MiniGoParser.RPAREN, 0)

        def argumentList(self):
            return self.getTypedRuleContext(MiniGoParser.ArgumentListContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_arguments

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArguments" ):
                return visitor.visitArguments(self)
            else:
                return visitor.visitChildren(self)




    def arguments(self):

        localctx = MiniGoParser.ArgumentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 100, self.RULE_arguments)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 510
            self.match(MiniGoParser.LPAREN)
            self.state = 512
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.STRUCT) | (1 << MiniGoParser.INTERFACE) | (1 << MiniGoParser.TRUE) | (1 << MiniGoParser.FALSE) | (1 << MiniGoParser.NIL) | (1 << MiniGoParser.SUB) | (1 << MiniGoParser.NEGATION) | (1 << MiniGoParser.LBRACK) | (1 << MiniGoParser.LPAREN) | (1 << MiniGoParser.IDENTIFIER) | (1 << MiniGoParser.STRINGLIT) | (1 << MiniGoParser.INT) | (1 << MiniGoParser.FLOAT))) != 0):
                self.state = 511
                self.argumentList()


            self.state = 514
            self.match(MiniGoParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.ExprContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.COMMA)
            else:
                return self.getToken(MiniGoParser.COMMA, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_argumentList

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgumentList" ):
                return visitor.visitArgumentList(self)
            else:
                return visitor.visitChildren(self)




    def argumentList(self):

        localctx = MiniGoParser.ArgumentListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 102, self.RULE_argumentList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 516
            self.expr()
            self.state = 521
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==MiniGoParser.COMMA:
                self.state = 517
                self.match(MiniGoParser.COMMA)
                self.state = 518
                self.expr()
                self.state = 523
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CallStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def primaryExpr(self):
            return self.getTypedRuleContext(MiniGoParser.PrimaryExprContext,0)


        def SEMI_COLON(self):
            return self.getToken(MiniGoParser.SEMI_COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_callStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCallStmt" ):
                return visitor.visitCallStmt(self)
            else:
                return visitor.visitChildren(self)




    def callStmt(self):

        localctx = MiniGoParser.CallStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 104, self.RULE_callStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 524
            self.primaryExpr(0)
            self.state = 525
            self.match(MiniGoParser.SEMI_COLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LhsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def arrayOrStructAccess(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.ArrayOrStructAccessContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.ArrayOrStructAccessContext,i)


        def getRuleIndex(self):
            return MiniGoParser.RULE_lhs

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLhs" ):
                return visitor.visitLhs(self)
            else:
                return visitor.visitChildren(self)




    def lhs(self):

        localctx = MiniGoParser.LhsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 106, self.RULE_lhs)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 527
            self.match(MiniGoParser.IDENTIFIER)
            self.state = 531
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,41,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 528
                    self.arrayOrStructAccess() 
                self.state = 533
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,41,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayOrStructAccessContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACK(self):
            return self.getToken(MiniGoParser.LBRACK, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def RBRACK(self):
            return self.getToken(MiniGoParser.RBRACK, 0)

        def DOT(self):
            return self.getToken(MiniGoParser.DOT, 0)

        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayOrStructAccess

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayOrStructAccess" ):
                return visitor.visitArrayOrStructAccess(self)
            else:
                return visitor.visitChildren(self)




    def arrayOrStructAccess(self):

        localctx = MiniGoParser.ArrayOrStructAccessContext(self, self._ctx, self.state)
        self.enterRule(localctx, 108, self.RULE_arrayOrStructAccess)
        try:
            self.state = 540
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.LBRACK]:
                self.enterOuterAlt(localctx, 1)
                self.state = 534
                self.match(MiniGoParser.LBRACK)
                self.state = 535
                self.expr()
                self.state = 536
                self.match(MiniGoParser.RBRACK)
                pass
            elif token in [MiniGoParser.DOT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 538
                self.match(MiniGoParser.DOT)
                self.state = 539
                self.match(MiniGoParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(MiniGoParser.INT, 0)

        def FLOAT(self):
            return self.getToken(MiniGoParser.FLOAT, 0)

        def TRUE(self):
            return self.getToken(MiniGoParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(MiniGoParser.FALSE, 0)

        def STRINGLIT(self):
            return self.getToken(MiniGoParser.STRINGLIT, 0)

        def NIL(self):
            return self.getToken(MiniGoParser.NIL, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLiteral" ):
                return visitor.visitLiteral(self)
            else:
                return visitor.visitChildren(self)




    def literal(self):

        localctx = MiniGoParser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 110, self.RULE_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 542
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.TRUE) | (1 << MiniGoParser.FALSE) | (1 << MiniGoParser.NIL) | (1 << MiniGoParser.STRINGLIT) | (1 << MiniGoParser.INT) | (1 << MiniGoParser.FLOAT))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompositeLiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arrayCompositeLiteral(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayCompositeLiteralContext,0)


        def structCompositeLiteral(self):
            return self.getTypedRuleContext(MiniGoParser.StructCompositeLiteralContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_compositeLiteral

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompositeLiteral" ):
                return visitor.visitCompositeLiteral(self)
            else:
                return visitor.visitChildren(self)




    def compositeLiteral(self):

        localctx = MiniGoParser.CompositeLiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 112, self.RULE_compositeLiteral)
        try:
            self.state = 546
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.LBRACK]:
                self.enterOuterAlt(localctx, 1)
                self.state = 544
                self.arrayCompositeLiteral()
                pass
            elif token in [MiniGoParser.STRUCT, MiniGoParser.INTERFACE, MiniGoParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 545
                self.structCompositeLiteral()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayCompositeLiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arrayType(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayTypeContext,0)


        def arrayLiteralBody(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayLiteralBodyContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayCompositeLiteral

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayCompositeLiteral" ):
                return visitor.visitArrayCompositeLiteral(self)
            else:
                return visitor.visitChildren(self)




    def arrayCompositeLiteral(self):

        localctx = MiniGoParser.ArrayCompositeLiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 114, self.RULE_arrayCompositeLiteral)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 548
            self.arrayType()
            self.state = 549
            self.arrayLiteralBody()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayLiteralBodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACE(self):
            return self.getToken(MiniGoParser.LBRACE, 0)

        def arrayLiteralElementList(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayLiteralElementListContext,0)


        def RBRACE(self):
            return self.getToken(MiniGoParser.RBRACE, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayLiteralBody

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayLiteralBody" ):
                return visitor.visitArrayLiteralBody(self)
            else:
                return visitor.visitChildren(self)




    def arrayLiteralBody(self):

        localctx = MiniGoParser.ArrayLiteralBodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 116, self.RULE_arrayLiteralBody)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 551
            self.match(MiniGoParser.LBRACE)
            self.state = 552
            self.arrayLiteralElementList()
            self.state = 553
            self.match(MiniGoParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayLiteralElementListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def arrayLiteralElement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.ArrayLiteralElementContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.ArrayLiteralElementContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.COMMA)
            else:
                return self.getToken(MiniGoParser.COMMA, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayLiteralElementList

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayLiteralElementList" ):
                return visitor.visitArrayLiteralElementList(self)
            else:
                return visitor.visitChildren(self)




    def arrayLiteralElementList(self):

        localctx = MiniGoParser.ArrayLiteralElementListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 118, self.RULE_arrayLiteralElementList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 555
            self.arrayLiteralElement()
            self.state = 560
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,44,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 556
                    self.match(MiniGoParser.COMMA)
                    self.state = 557
                    self.arrayLiteralElement() 
                self.state = 562
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,44,self._ctx)

            self.state = 564
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==MiniGoParser.COMMA:
                self.state = 563
                self.match(MiniGoParser.COMMA)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayLiteralElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def literal(self):
            return self.getTypedRuleContext(MiniGoParser.LiteralContext,0)


        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.IDENTIFIER)
            else:
                return self.getToken(MiniGoParser.IDENTIFIER, i)

        def arrayLiteral(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayLiteralContext,0)


        def structCompositeLiteral(self):
            return self.getTypedRuleContext(MiniGoParser.StructCompositeLiteralContext,0)


        def COLON(self):
            return self.getToken(MiniGoParser.COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayLiteralElement

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayLiteralElement" ):
                return visitor.visitArrayLiteralElement(self)
            else:
                return visitor.visitChildren(self)




    def arrayLiteralElement(self):

        localctx = MiniGoParser.ArrayLiteralElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 120, self.RULE_arrayLiteralElement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 568
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,46,self._ctx)
            if la_ == 1:
                self.state = 566
                self.match(MiniGoParser.IDENTIFIER)
                self.state = 567
                self.match(MiniGoParser.COLON)


            self.state = 574
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,47,self._ctx)
            if la_ == 1:
                self.state = 570
                self.literal()
                pass

            elif la_ == 2:
                self.state = 571
                self.match(MiniGoParser.IDENTIFIER)
                pass

            elif la_ == 3:
                self.state = 572
                self.arrayLiteral()
                pass

            elif la_ == 4:
                self.state = 573
                self.structCompositeLiteral()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayLiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACE(self):
            return self.getToken(MiniGoParser.LBRACE, 0)

        def arrayLiteralElementList(self):
            return self.getTypedRuleContext(MiniGoParser.ArrayLiteralElementListContext,0)


        def RBRACE(self):
            return self.getToken(MiniGoParser.RBRACE, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_arrayLiteral

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArrayLiteral" ):
                return visitor.visitArrayLiteral(self)
            else:
                return visitor.visitChildren(self)




    def arrayLiteral(self):

        localctx = MiniGoParser.ArrayLiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 122, self.RULE_arrayLiteral)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 576
            self.match(MiniGoParser.LBRACE)
            self.state = 577
            self.arrayLiteralElementList()
            self.state = 578
            self.match(MiniGoParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NonArrayTypeDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def structType(self):
            return self.getTypedRuleContext(MiniGoParser.StructTypeContext,0)


        def interfaceType(self):
            return self.getTypedRuleContext(MiniGoParser.InterfaceTypeContext,0)


        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_nonArrayTypeDef

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNonArrayTypeDef" ):
                return visitor.visitNonArrayTypeDef(self)
            else:
                return visitor.visitChildren(self)




    def nonArrayTypeDef(self):

        localctx = MiniGoParser.NonArrayTypeDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 124, self.RULE_nonArrayTypeDef)
        try:
            self.state = 583
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [MiniGoParser.STRUCT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 580
                self.structType()
                pass
            elif token in [MiniGoParser.INTERFACE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 581
                self.interfaceType()
                pass
            elif token in [MiniGoParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 3)
                self.state = 582
                self.match(MiniGoParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructCompositeLiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def nonArrayTypeDef(self):
            return self.getTypedRuleContext(MiniGoParser.NonArrayTypeDefContext,0)


        def structLiteralBody(self):
            return self.getTypedRuleContext(MiniGoParser.StructLiteralBodyContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_structCompositeLiteral

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStructCompositeLiteral" ):
                return visitor.visitStructCompositeLiteral(self)
            else:
                return visitor.visitChildren(self)




    def structCompositeLiteral(self):

        localctx = MiniGoParser.StructCompositeLiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 126, self.RULE_structCompositeLiteral)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 585
            self.nonArrayTypeDef()
            self.state = 586
            self.structLiteralBody()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructLiteralBodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACE(self):
            return self.getToken(MiniGoParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(MiniGoParser.RBRACE, 0)

        def structLiteralElementList(self):
            return self.getTypedRuleContext(MiniGoParser.StructLiteralElementListContext,0)


        def getRuleIndex(self):
            return MiniGoParser.RULE_structLiteralBody

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStructLiteralBody" ):
                return visitor.visitStructLiteralBody(self)
            else:
                return visitor.visitChildren(self)




    def structLiteralBody(self):

        localctx = MiniGoParser.StructLiteralBodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 128, self.RULE_structLiteralBody)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 588
            self.match(MiniGoParser.LBRACE)
            self.state = 590
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << MiniGoParser.STRUCT) | (1 << MiniGoParser.INTERFACE) | (1 << MiniGoParser.TRUE) | (1 << MiniGoParser.FALSE) | (1 << MiniGoParser.NIL) | (1 << MiniGoParser.SUB) | (1 << MiniGoParser.NEGATION) | (1 << MiniGoParser.LBRACK) | (1 << MiniGoParser.LPAREN) | (1 << MiniGoParser.IDENTIFIER) | (1 << MiniGoParser.STRINGLIT) | (1 << MiniGoParser.INT) | (1 << MiniGoParser.FLOAT))) != 0):
                self.state = 589
                self.structLiteralElementList()


            self.state = 592
            self.match(MiniGoParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructLiteralElementListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def structLiteralElement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGoParser.StructLiteralElementContext)
            else:
                return self.getTypedRuleContext(MiniGoParser.StructLiteralElementContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGoParser.COMMA)
            else:
                return self.getToken(MiniGoParser.COMMA, i)

        def getRuleIndex(self):
            return MiniGoParser.RULE_structLiteralElementList

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStructLiteralElementList" ):
                return visitor.visitStructLiteralElementList(self)
            else:
                return visitor.visitChildren(self)




    def structLiteralElementList(self):

        localctx = MiniGoParser.StructLiteralElementListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 130, self.RULE_structLiteralElementList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 594
            self.structLiteralElement()
            self.state = 599
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,50,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 595
                    self.match(MiniGoParser.COMMA)
                    self.state = 596
                    self.structLiteralElement() 
                self.state = 601
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,50,self._ctx)

            self.state = 603
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==MiniGoParser.COMMA:
                self.state = 602
                self.match(MiniGoParser.COMMA)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructLiteralElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(MiniGoParser.ExprContext,0)


        def IDENTIFIER(self):
            return self.getToken(MiniGoParser.IDENTIFIER, 0)

        def COLON(self):
            return self.getToken(MiniGoParser.COLON, 0)

        def getRuleIndex(self):
            return MiniGoParser.RULE_structLiteralElement

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStructLiteralElement" ):
                return visitor.visitStructLiteralElement(self)
            else:
                return visitor.visitChildren(self)




    def structLiteralElement(self):

        localctx = MiniGoParser.StructLiteralElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 132, self.RULE_structLiteralElement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 607
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,52,self._ctx)
            if la_ == 1:
                self.state = 605
                self.match(MiniGoParser.IDENTIFIER)
                self.state = 606
                self.match(MiniGoParser.COLON)


            self.state = 609
            self.expr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[42] = self.logicalOrExpr_sempred
        self._predicates[43] = self.logicalAndExpr_sempred
        self._predicates[44] = self.equalityExpr_sempred
        self._predicates[45] = self.relationalExpr_sempred
        self._predicates[46] = self.additiveExpr_sempred
        self._predicates[47] = self.multiplicativeExpr_sempred
        self._predicates[49] = self.primaryExpr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def logicalOrExpr_sempred(self, localctx:LogicalOrExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         

    def logicalAndExpr_sempred(self, localctx:LogicalAndExprContext, predIndex:int):
            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         

    def equalityExpr_sempred(self, localctx:EqualityExprContext, predIndex:int):
            if predIndex == 2:
                return self.precpred(self._ctx, 2)
         

    def relationalExpr_sempred(self, localctx:RelationalExprContext, predIndex:int):
            if predIndex == 3:
                return self.precpred(self._ctx, 2)
         

    def additiveExpr_sempred(self, localctx:AdditiveExprContext, predIndex:int):
            if predIndex == 4:
                return self.precpred(self._ctx, 2)
         

    def multiplicativeExpr_sempred(self, localctx:MultiplicativeExprContext, predIndex:int):
            if predIndex == 5:
                return self.precpred(self._ctx, 2)
         

    def primaryExpr_sempred(self, localctx:PrimaryExprContext, predIndex:int):
            if predIndex == 6:
                return self.precpred(self._ctx, 4)
         

            if predIndex == 7:
                return self.precpred(self._ctx, 3)
         

            if predIndex == 8:
                return self.precpred(self._ctx, 2)
         




