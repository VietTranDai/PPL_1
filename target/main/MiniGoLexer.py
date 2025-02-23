# Generated from main/MiniGo.g4 by ANTLR 4.9.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


#2213951
from lexererr import *



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B")
        buf.write("\u020f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%")
        buf.write("\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.")
        buf.write("\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64")
        buf.write("\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:")
        buf.write("\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\t")
        buf.write("C\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3\2\3\2\3\2\3\3\3\3")
        buf.write("\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3")
        buf.write("\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b")
        buf.write("\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13")
        buf.write("\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3")
        buf.write("\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16")
        buf.write("\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20")
        buf.write("\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23")
        buf.write("\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25")
        buf.write("\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31")
        buf.write("\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35")
        buf.write("\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"")
        buf.write("\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3")
        buf.write(")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60")
        buf.write("\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65")
        buf.write("\3\66\3\66\3\67\3\67\7\67\u0158\n\67\f\67\16\67\u015b")
        buf.write("\13\67\38\38\38\39\39\59\u0162\n9\3:\3:\7:\u0166\n:\f")
        buf.write(":\16:\u0169\13:\3:\3:\3;\3;\7;\u016f\n;\f;\16;\u0172\13")
        buf.write(";\3;\3;\5;\u0176\n;\3;\5;\u0179\n;\3;\3;\3<\3<\7<\u017f")
        buf.write("\n<\f<\16<\u0182\13<\3<\3<\3<\3<\3=\3=\7=\u018a\n=\f=")
        buf.write("\16=\u018d\13=\3=\5=\u0190\n=\3>\3>\3>\3>\6>\u0196\n>")
        buf.write("\r>\16>\u0197\3>\3>\3>\3>\6>\u019e\n>\r>\16>\u019f\5>")
        buf.write("\u01a2\n>\3?\3?\3?\3?\6?\u01a8\n?\r?\16?\u01a9\3?\3?\3")
        buf.write("?\3?\6?\u01b0\n?\r?\16?\u01b1\5?\u01b4\n?\3@\3@\3@\3@")
        buf.write("\6@\u01ba\n@\r@\16@\u01bb\3@\3@\3@\3@\6@\u01c2\n@\r@\16")
        buf.write("@\u01c3\5@\u01c6\n@\3A\3A\3A\3A\5A\u01cc\nA\3B\6B\u01cf")
        buf.write("\nB\rB\16B\u01d0\3B\3B\7B\u01d5\nB\fB\16B\u01d8\13B\3")
        buf.write("B\3B\5B\u01dc\nB\3B\6B\u01df\nB\rB\16B\u01e0\5B\u01e3")
        buf.write("\nB\3C\3C\3C\3C\7C\u01e9\nC\fC\16C\u01ec\13C\3C\3C\3D")
        buf.write("\3D\3D\3D\3D\7D\u01f5\nD\fD\16D\u01f8\13D\3D\3D\3D\3D")
        buf.write("\3D\3E\5E\u0200\nE\3E\3E\3E\3E\3F\6F\u0207\nF\rF\16F\u0208")
        buf.write("\3F\3F\3G\3G\3G\3\u01f6\2H\3\3\5\4\7\5\t\6\13\7\r\b\17")
        buf.write("\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23")
        buf.write("%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36")
        buf.write(";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63")
        buf.write("e\64g\65i\66k\67m8o\2q\2s9u:w;y\2{\2}\2\177\2\u0081<\u0083")
        buf.write("=\u0085>\u0087?\u0089@\u008bA\u008dB\3\2\17\5\2C\\aac")
        buf.write("|\6\2\62;C\\aac|\7\2$$^^ppttvv\6\2\f\f\17\17$$^^\3\2\63")
        buf.write(";\3\2\62;\3\2\62\63\3\2\629\5\2\62;CHch\4\2GGgg\4\2--")
        buf.write("//\4\2\f\f\16\17\5\2\13\13\16\17\"\"\2\u0227\2\3\3\2\2")
        buf.write("\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2")
        buf.write("\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25")
        buf.write("\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3")
        buf.write("\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2")
        buf.write("\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2")
        buf.write("\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2")
        buf.write("9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2")
        buf.write("\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2")
        buf.write("\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2")
        buf.write("\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3")
        buf.write("\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i")
        buf.write("\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2")
        buf.write("w\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2")
        buf.write("\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2")
        buf.write("\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0094\3\2\2\2\7\u0098")
        buf.write("\3\2\2\2\t\u009e\3\2\2\2\13\u00a1\3\2\2\2\r\u00a6\3\2")
        buf.write("\2\2\17\u00aa\3\2\2\2\21\u00b1\3\2\2\2\23\u00b6\3\2\2")
        buf.write("\2\25\u00bb\3\2\2\2\27\u00c2\3\2\2\2\31\u00cc\3\2\2\2")
        buf.write("\33\u00d3\3\2\2\2\35\u00d7\3\2\2\2\37\u00dd\3\2\2\2!\u00e5")
        buf.write("\3\2\2\2#\u00ee\3\2\2\2%\u00f4\3\2\2\2\'\u00fa\3\2\2\2")
        buf.write(")\u00ff\3\2\2\2+\u0105\3\2\2\2-\u0109\3\2\2\2/\u010b\3")
        buf.write("\2\2\2\61\u010d\3\2\2\2\63\u010f\3\2\2\2\65\u0111\3\2")
        buf.write("\2\2\67\u0113\3\2\2\29\u0116\3\2\2\2;\u0119\3\2\2\2=\u011c")
        buf.write("\3\2\2\2?\u011f\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2")
        buf.write("E\u0126\3\2\2\2G\u0129\3\2\2\2I\u012b\3\2\2\2K\u012d\3")
        buf.write("\2\2\2M\u0130\3\2\2\2O\u0133\3\2\2\2Q\u0136\3\2\2\2S\u0139")
        buf.write("\3\2\2\2U\u013c\3\2\2\2W\u013f\3\2\2\2Y\u0141\3\2\2\2")
        buf.write("[\u0143\3\2\2\2]\u0145\3\2\2\2_\u0147\3\2\2\2a\u0149\3")
        buf.write("\2\2\2c\u014b\3\2\2\2e\u014d\3\2\2\2g\u014f\3\2\2\2i\u0151")
        buf.write("\3\2\2\2k\u0153\3\2\2\2m\u0155\3\2\2\2o\u015c\3\2\2\2")
        buf.write("q\u0161\3\2\2\2s\u0163\3\2\2\2u\u016c\3\2\2\2w\u017c\3")
        buf.write("\2\2\2y\u018f\3\2\2\2{\u01a1\3\2\2\2}\u01b3\3\2\2\2\177")
        buf.write("\u01c5\3\2\2\2\u0081\u01cb\3\2\2\2\u0083\u01ce\3\2\2\2")
        buf.write("\u0085\u01e4\3\2\2\2\u0087\u01ef\3\2\2\2\u0089\u01ff\3")
        buf.write("\2\2\2\u008b\u0206\3\2\2\2\u008d\u020c\3\2\2\2\u008f\u0090")
        buf.write("\7o\2\2\u0090\u0091\7c\2\2\u0091\u0092\7k\2\2\u0092\u0093")
        buf.write("\7p\2\2\u0093\4\3\2\2\2\u0094\u0095\7x\2\2\u0095\u0096")
        buf.write("\7c\2\2\u0096\u0097\7t\2\2\u0097\6\3\2\2\2\u0098\u0099")
        buf.write("\7e\2\2\u0099\u009a\7q\2\2\u009a\u009b\7p\2\2\u009b\u009c")
        buf.write("\7u\2\2\u009c\u009d\7v\2\2\u009d\b\3\2\2\2\u009e\u009f")
        buf.write("\7k\2\2\u009f\u00a0\7h\2\2\u00a0\n\3\2\2\2\u00a1\u00a2")
        buf.write("\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5")
        buf.write("\7g\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8")
        buf.write("\7q\2\2\u00a8\u00a9\7t\2\2\u00a9\16\3\2\2\2\u00aa\u00ab")
        buf.write("\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae")
        buf.write("\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0\20")
        buf.write("\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4")
        buf.write("\7p\2\2\u00b4\u00b5\7e\2\2\u00b5\22\3\2\2\2\u00b6\u00b7")
        buf.write("\7v\2\2\u00b7\u00b8\7{\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba")
        buf.write("\7g\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd")
        buf.write("\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0")
        buf.write("\7e\2\2\u00c0\u00c1\7v\2\2\u00c1\26\3\2\2\2\u00c2\u00c3")
        buf.write("\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6")
        buf.write("\7g\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9")
        buf.write("\7c\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7g\2\2\u00cb\30")
        buf.write("\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf")
        buf.write("\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2")
        buf.write("\7i\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5")
        buf.write("\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\34\3\2\2\2\u00d7\u00d8")
        buf.write("\7h\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db")
        buf.write("\7c\2\2\u00db\u00dc\7v\2\2\u00dc\36\3\2\2\2\u00dd\u00de")
        buf.write("\7d\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1")
        buf.write("\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4")
        buf.write("\7p\2\2\u00e4 \3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7")
        buf.write("\7q\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea")
        buf.write("\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed")
        buf.write("\7g\2\2\u00ed\"\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0")
        buf.write("\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3")
        buf.write("\7m\2\2\u00f3$\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6")
        buf.write("\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7i\2\2\u00f8\u00f9")
        buf.write("\7g\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc")
        buf.write("\7t\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7g\2\2\u00fe(\3")
        buf.write("\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7c\2\2\u0101\u0102")
        buf.write("\7n\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104*\3")
        buf.write("\2\2\2\u0105\u0106\7p\2\2\u0106\u0107\7k\2\2\u0107\u0108")
        buf.write("\7n\2\2\u0108,\3\2\2\2\u0109\u010a\7-\2\2\u010a.\3\2\2")
        buf.write("\2\u010b\u010c\7/\2\2\u010c\60\3\2\2\2\u010d\u010e\7,")
        buf.write("\2\2\u010e\62\3\2\2\2\u010f\u0110\7\61\2\2\u0110\64\3")
        buf.write("\2\2\2\u0111\u0112\7\'\2\2\u0112\66\3\2\2\2\u0113\u0114")
        buf.write("\7(\2\2\u0114\u0115\7(\2\2\u01158\3\2\2\2\u0116\u0117")
        buf.write("\7~\2\2\u0117\u0118\7~\2\2\u0118:\3\2\2\2\u0119\u011a")
        buf.write("\7?\2\2\u011a\u011b\7?\2\2\u011b<\3\2\2\2\u011c\u011d")
        buf.write("\7#\2\2\u011d\u011e\7?\2\2\u011e>\3\2\2\2\u011f\u0120")
        buf.write("\7>\2\2\u0120@\3\2\2\2\u0121\u0122\7@\2\2\u0122B\3\2\2")
        buf.write("\2\u0123\u0124\7>\2\2\u0124\u0125\7?\2\2\u0125D\3\2\2")
        buf.write("\2\u0126\u0127\7@\2\2\u0127\u0128\7?\2\2\u0128F\3\2\2")
        buf.write("\2\u0129\u012a\7#\2\2\u012aH\3\2\2\2\u012b\u012c\7?\2")
        buf.write("\2\u012cJ\3\2\2\2\u012d\u012e\7-\2\2\u012e\u012f\7?\2")
        buf.write("\2\u012fL\3\2\2\2\u0130\u0131\7/\2\2\u0131\u0132\7?\2")
        buf.write("\2\u0132N\3\2\2\2\u0133\u0134\7,\2\2\u0134\u0135\7?\2")
        buf.write("\2\u0135P\3\2\2\2\u0136\u0137\7\61\2\2\u0137\u0138\7?")
        buf.write("\2\2\u0138R\3\2\2\2\u0139\u013a\7\'\2\2\u013a\u013b\7")
        buf.write("?\2\2\u013bT\3\2\2\2\u013c\u013d\7<\2\2\u013d\u013e\7")
        buf.write("?\2\2\u013eV\3\2\2\2\u013f\u0140\7]\2\2\u0140X\3\2\2\2")
        buf.write("\u0141\u0142\7_\2\2\u0142Z\3\2\2\2\u0143\u0144\7}\2\2")
        buf.write("\u0144\\\3\2\2\2\u0145\u0146\7\177\2\2\u0146^\3\2\2\2")
        buf.write("\u0147\u0148\7*\2\2\u0148`\3\2\2\2\u0149\u014a\7+\2\2")
        buf.write("\u014ab\3\2\2\2\u014b\u014c\7.\2\2\u014cd\3\2\2\2\u014d")
        buf.write("\u014e\7=\2\2\u014ef\3\2\2\2\u014f\u0150\7<\2\2\u0150")
        buf.write("h\3\2\2\2\u0151\u0152\7\60\2\2\u0152j\3\2\2\2\u0153\u0154")
        buf.write("\7a\2\2\u0154l\3\2\2\2\u0155\u0159\t\2\2\2\u0156\u0158")
        buf.write("\t\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159")
        buf.write("\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015an\3\2\2\2\u015b")
        buf.write("\u0159\3\2\2\2\u015c\u015d\7^\2\2\u015d\u015e\t\4\2\2")
        buf.write("\u015ep\3\2\2\2\u015f\u0162\n\5\2\2\u0160\u0162\5o8\2")
        buf.write("\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162r\3\2\2")
        buf.write("\2\u0163\u0167\7$\2\2\u0164\u0166\5q9\2\u0165\u0164\3")
        buf.write("\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168")
        buf.write("\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a")
        buf.write("\u016b\7$\2\2\u016bt\3\2\2\2\u016c\u0170\7$\2\2\u016d")
        buf.write("\u016f\5q9\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170")
        buf.write("\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0178\3\2\2\2")
        buf.write("\u0172\u0170\3\2\2\2\u0173\u0179\7\2\2\3\u0174\u0176\7")
        buf.write("\17\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176")
        buf.write("\u0177\3\2\2\2\u0177\u0179\7\f\2\2\u0178\u0173\3\2\2\2")
        buf.write("\u0178\u0175\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b")
        buf.write(";\2\2\u017bv\3\2\2\2\u017c\u0180\7$\2\2\u017d\u017f\5")
        buf.write("q9\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e")
        buf.write("\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182")
        buf.write("\u0180\3\2\2\2\u0183\u0184\7^\2\2\u0184\u0185\n\4\2\2")
        buf.write("\u0185\u0186\b<\3\2\u0186x\3\2\2\2\u0187\u018b\t\6\2\2")
        buf.write("\u0188\u018a\t\7\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3")
        buf.write("\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0190")
        buf.write("\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7\62\2\2\u018f")
        buf.write("\u0187\3\2\2\2\u018f\u018e\3\2\2\2\u0190z\3\2\2\2\u0191")
        buf.write("\u0192\7\62\2\2\u0192\u0193\7d\2\2\u0193\u0195\3\2\2\2")
        buf.write("\u0194\u0196\t\b\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3")
        buf.write("\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u01a2")
        buf.write("\3\2\2\2\u0199\u019a\7\62\2\2\u019a\u019b\7D\2\2\u019b")
        buf.write("\u019d\3\2\2\2\u019c\u019e\t\b\2\2\u019d\u019c\3\2\2\2")
        buf.write("\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3")
        buf.write("\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u0191\3\2\2\2\u01a1\u0199")
        buf.write("\3\2\2\2\u01a2|\3\2\2\2\u01a3\u01a4\7\62\2\2\u01a4\u01a5")
        buf.write("\7q\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\t\t\2\2\u01a7")
        buf.write("\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2")
        buf.write("\u01a9\u01aa\3\2\2\2\u01aa\u01b4\3\2\2\2\u01ab\u01ac\7")
        buf.write("\62\2\2\u01ac\u01ad\7Q\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0")
        buf.write("\t\t\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1")
        buf.write("\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2")
        buf.write("\u01b3\u01a3\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b4~\3\2\2")
        buf.write("\2\u01b5\u01b6\7\62\2\2\u01b6\u01b7\7z\2\2\u01b7\u01b9")
        buf.write("\3\2\2\2\u01b8\u01ba\t\n\2\2\u01b9\u01b8\3\2\2\2\u01ba")
        buf.write("\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2")
        buf.write("\u01bc\u01c6\3\2\2\2\u01bd\u01be\7\62\2\2\u01be\u01bf")
        buf.write("\7Z\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2\t\n\2\2\u01c1")
        buf.write("\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2")
        buf.write("\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01b5\3")
        buf.write("\2\2\2\u01c5\u01bd\3\2\2\2\u01c6\u0080\3\2\2\2\u01c7\u01cc")
        buf.write("\5{>\2\u01c8\u01cc\5}?\2\u01c9\u01cc\5\177@\2\u01ca\u01cc")
        buf.write("\5y=\2\u01cb\u01c7\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb\u01c9")
        buf.write("\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u0082\3\2\2\2\u01cd")
        buf.write("\u01cf\t\7\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2")
        buf.write("\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3")
        buf.write("\2\2\2\u01d2\u01d6\7\60\2\2\u01d3\u01d5\t\7\2\2\u01d4")
        buf.write("\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2")
        buf.write("\u01d6\u01d7\3\2\2\2\u01d7\u01e2\3\2\2\2\u01d8\u01d6\3")
        buf.write("\2\2\2\u01d9\u01db\t\13\2\2\u01da\u01dc\t\f\2\2\u01db")
        buf.write("\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2")
        buf.write("\u01dd\u01df\t\7\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3")
        buf.write("\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3")
        buf.write("\3\2\2\2\u01e2\u01d9\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3")
        buf.write("\u0084\3\2\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e6\7\61\2")
        buf.write("\2\u01e6\u01ea\3\2\2\2\u01e7\u01e9\n\r\2\2\u01e8\u01e7")
        buf.write("\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea")
        buf.write("\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2")
        buf.write("\u01ed\u01ee\bC\4\2\u01ee\u0086\3\2\2\2\u01ef\u01f0\7")
        buf.write("\61\2\2\u01f0\u01f1\7,\2\2\u01f1\u01f6\3\2\2\2\u01f2\u01f5")
        buf.write("\5\u0087D\2\u01f3\u01f5\13\2\2\2\u01f4\u01f2\3\2\2\2\u01f4")
        buf.write("\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f7\3\2\2\2")
        buf.write("\u01f6\u01f4\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3")
        buf.write("\2\2\2\u01f9\u01fa\7,\2\2\u01fa\u01fb\7\61\2\2\u01fb\u01fc")
        buf.write("\3\2\2\2\u01fc\u01fd\bD\4\2\u01fd\u0088\3\2\2\2\u01fe")
        buf.write("\u0200\7\17\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2")
        buf.write("\2\u0200\u0201\3\2\2\2\u0201\u0202\7\f\2\2\u0202\u0203")
        buf.write("\3\2\2\2\u0203\u0204\bE\5\2\u0204\u008a\3\2\2\2\u0205")
        buf.write("\u0207\t\16\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2")
        buf.write("\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a")
        buf.write("\3\2\2\2\u020a\u020b\bF\4\2\u020b\u008c\3\2\2\2\u020c")
        buf.write("\u020d\13\2\2\2\u020d\u020e\bG\6\2\u020e\u008e\3\2\2\2")
        buf.write(" \2\u0159\u0161\u0167\u0170\u0175\u0178\u0180\u018b\u018f")
        buf.write("\u0197\u019f\u01a1\u01a9\u01b1\u01b3\u01bb\u01c3\u01c5")
        buf.write("\u01cb\u01d0\u01d6\u01db\u01e0\u01e2\u01ea\u01f4\u01f6")
        buf.write("\u01ff\u0208\7\3;\2\3<\3\b\2\2\3E\4\3G\5")
        return buf.getvalue()


class MiniGoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    VAR = 2
    CONST = 3
    IF = 4
    ELSE = 5
    FOR = 6
    RETURN = 7
    FUNCTION = 8
    TYPE = 9
    STRUCT = 10
    INTERFACE = 11
    STRING_TYPE = 12
    INT_TYPE = 13
    FLOAT_TYPE = 14
    BOOLEAN_TYPE = 15
    CONTINUE = 16
    BREAK = 17
    RANGE = 18
    TRUE = 19
    FALSE = 20
    NIL = 21
    ADD = 22
    SUB = 23
    MUL = 24
    DIV = 25
    MOD = 26
    AND = 27
    OR = 28
    EQ = 29
    NOT_EQ = 30
    LT = 31
    GT = 32
    LTE = 33
    GTE = 34
    NEGATION = 35
    ASSIGN = 36
    ADDASSIGN = 37
    SUBASSIGN = 38
    MULASSIGN = 39
    DIVASSIGN = 40
    MODASSIGN = 41
    ASSIGN_COLON = 42
    LBRACK = 43
    RBRACK = 44
    LBRACE = 45
    RBRACE = 46
    LPAREN = 47
    RPAREN = 48
    COMMA = 49
    SEMI_COLON = 50
    COLON = 51
    DOT = 52
    UNDERSCORE = 53
    IDENTIFIER = 54
    STRINGLIT = 55
    UNCLOSE_STRING = 56
    ILLEGAL_ESCAPE = 57
    INT = 58
    FLOAT = 59
    SINGLE_LINE_COMMENT = 60
    MULTI_LINE_COMMENT = 61
    NL = 62
    WS = 63
    ERROR_CHAR = 64

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'main'", "'var'", "'const'", "'if'", "'else'", "'for'", "'return'", 
            "'func'", "'type'", "'struct'", "'interface'", "'string'", "'int'", 
            "'float'", "'boolean'", "'continue'", "'break'", "'range'", 
            "'true'", "'false'", "'nil'", "'+'", "'-'", "'*'", "'/'", "'%'", 
            "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
            "'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "':='", 
            "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "';'", "':'", 
            "'.'", "'_'" ]

    symbolicNames = [ "<INVALID>",
            "VAR", "CONST", "IF", "ELSE", "FOR", "RETURN", "FUNCTION", "TYPE", 
            "STRUCT", "INTERFACE", "STRING_TYPE", "INT_TYPE", "FLOAT_TYPE", 
            "BOOLEAN_TYPE", "CONTINUE", "BREAK", "RANGE", "TRUE", "FALSE", 
            "NIL", "ADD", "SUB", "MUL", "DIV", "MOD", "AND", "OR", "EQ", 
            "NOT_EQ", "LT", "GT", "LTE", "GTE", "NEGATION", "ASSIGN", "ADDASSIGN", 
            "SUBASSIGN", "MULASSIGN", "DIVASSIGN", "MODASSIGN", "ASSIGN_COLON", 
            "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
            "COMMA", "SEMI_COLON", "COLON", "DOT", "UNDERSCORE", "IDENTIFIER", 
            "STRINGLIT", "UNCLOSE_STRING", "ILLEGAL_ESCAPE", "INT", "FLOAT", 
            "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "NL", "WS", "ERROR_CHAR" ]

    ruleNames = [ "T__0", "VAR", "CONST", "IF", "ELSE", "FOR", "RETURN", 
                  "FUNCTION", "TYPE", "STRUCT", "INTERFACE", "STRING_TYPE", 
                  "INT_TYPE", "FLOAT_TYPE", "BOOLEAN_TYPE", "CONTINUE", 
                  "BREAK", "RANGE", "TRUE", "FALSE", "NIL", "ADD", "SUB", 
                  "MUL", "DIV", "MOD", "AND", "OR", "EQ", "NOT_EQ", "LT", 
                  "GT", "LTE", "GTE", "NEGATION", "ASSIGN", "ADDASSIGN", 
                  "SUBASSIGN", "MULASSIGN", "DIVASSIGN", "MODASSIGN", "ASSIGN_COLON", 
                  "LBRACK", "RBRACK", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
                  "COMMA", "SEMI_COLON", "COLON", "DOT", "UNDERSCORE", "IDENTIFIER", 
                  "ESC", "VALID_CHAR", "STRINGLIT", "UNCLOSE_STRING", "ILLEGAL_ESCAPE", 
                  "DEC_INT", "BIN_INT", "OCT_INT", "HEX_INT", "INT", "FLOAT", 
                  "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "NL", "WS", 
                  "ERROR_CHAR" ]

    grammarFileName = "MiniGo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


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


    def action(self, localctx:RuleContext, ruleIndex:int, actionIndex:int):
        if self._actions is None:
            actions = dict()
            actions[57] = self.UNCLOSE_STRING_action 
            actions[58] = self.ILLEGAL_ESCAPE_action 
            actions[67] = self.NL_action 
            actions[69] = self.ERROR_CHAR_action 
            self._actions = actions
        action = self._actions.get(ruleIndex, None)
        if action is not None:
            action(localctx, actionIndex)
        else:
            raise Exception("No registered action for:" + str(ruleIndex))


    def UNCLOSE_STRING_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 0:

                      text = self.text;
                      if text.endswith("\r\n"):
                          text = text[:-2];
                      elif text.endswith("\n"):
                          text = text[:-1];
                      raise UncloseString(text);
                  
     

    def ILLEGAL_ESCAPE_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 1:

                      text = self.text;
                      raise IllegalEscape(text);
                  
     

    def NL_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 2:

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
                
     

    def ERROR_CHAR_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 3:
             raise ErrorToken(self.text); 
     


