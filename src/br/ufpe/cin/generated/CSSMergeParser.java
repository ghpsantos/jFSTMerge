/* Generated By:JavaCC: Do not edit this line. CSSMergeParser.java */
package br.ufpe.cin.generated;

import java.io.*;
import java.util.*;
import cide.gast.*;
import cide.gparser.*;
import de.ovgu.cide.fstgen.ast.*;

public class CSSMergeParser extends AbstractFSTParser implements CSSMergeParserConstants {
        public CSSMergeParser(){}

  final public FSTInfo CompilationUnit(boolean inTerminal) throws ParseException {
                                                Token first=null,t;FSTInfo n;
     first=getToken(1); productionStart(inTerminal);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENT:
      case STRING:
      case HASH:
      case NUMBER:
      case PERCENTAGE:
      case DIMENSION:
      case URI:
      case UNICODE_RANGE:
      case LPAREN:
      case LBRACKET:
      case FUNCTION:
      case INCLUDES:
      case DASHMATCH:
      case DELIM:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      n = Any(inTerminal);
                            replaceName(n);
    }
    jj_consume_token(0);
                                                      {if (true) return productionEndNonTerminal("CompilationUnit","-","-");}
    throw new Error("Missing return statement in function");
  }

  final public FSTInfo Any(boolean inTerminal) throws ParseException {
                                    Token first=null,t;FSTInfo n;
     first=getToken(1); productionStart(inTerminal);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENT:
      jj_consume_token(IDENT);
                 {if (true) return productionEndTerminal("Any1","-","-","Replacement","Default",first,token);}
      break;
    case NUMBER:
      jj_consume_token(NUMBER);
                  {if (true) return productionEndTerminal("Any2","-","-","Replacement","Default",first,token);}
      break;
    case PERCENTAGE:
      jj_consume_token(PERCENTAGE);
                      {if (true) return productionEndTerminal("Any3","-","-","Replacement","Default",first,token);}
      break;
    case DIMENSION:
      jj_consume_token(DIMENSION);
                     {if (true) return productionEndTerminal("Any4","-","-","Replacement","Default",first,token);}
      break;
    case STRING:
      jj_consume_token(STRING);
                  {if (true) return productionEndTerminal("Any5","-","-","Replacement","Default",first,token);}
      break;
    case URI:
      jj_consume_token(URI);
               {if (true) return productionEndTerminal("Any6","-","-","Replacement","Default",first,token);}
      break;
    case HASH:
      jj_consume_token(HASH);
                {if (true) return productionEndTerminal("Any7","-","-","Replacement","Default",first,token);}
      break;
    case UNICODE_RANGE:
      jj_consume_token(UNICODE_RANGE);
                         {if (true) return productionEndTerminal("Any8","-","-","Replacement","Default",first,token);}
      break;
    case INCLUDES:
      jj_consume_token(INCLUDES);
                    {if (true) return productionEndTerminal("Any9","-","-","Replacement","Default",first,token);}
      break;
    case DASHMATCH:
      jj_consume_token(DASHMATCH);
                     {if (true) return productionEndTerminal("Any10","-","-","Replacement","Default",first,token);}
      break;
    case FUNCTION:
      jj_consume_token(FUNCTION);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENT:
        case STRING:
        case HASH:
        case NUMBER:
        case PERCENTAGE:
        case DIMENSION:
        case URI:
        case UNICODE_RANGE:
        case LPAREN:
        case LBRACKET:
        case FUNCTION:
        case INCLUDES:
        case DASHMATCH:
        case DELIM:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
        n = Any(true);
                                 replaceName(n);
      }
      jj_consume_token(RPAREN);
                                                              {if (true) return productionEndTerminal("Any11","-","-","Replacement","Default",first,token);}
      break;
    case LPAREN:
      jj_consume_token(LPAREN);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENT:
        case STRING:
        case HASH:
        case NUMBER:
        case PERCENTAGE:
        case DIMENSION:
        case URI:
        case UNICODE_RANGE:
        case LPAREN:
        case LBRACKET:
        case FUNCTION:
        case INCLUDES:
        case DASHMATCH:
        case DELIM:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
        n = Any(true);
                               replaceName(n);
      }
      jj_consume_token(RPAREN);
                                                            {if (true) return productionEndTerminal("Any12","-","-","Replacement","Default",first,token);}
      break;
    case LBRACKET:
      jj_consume_token(LBRACKET);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENT:
        case STRING:
        case HASH:
        case NUMBER:
        case PERCENTAGE:
        case DIMENSION:
        case URI:
        case UNICODE_RANGE:
        case LPAREN:
        case LBRACKET:
        case FUNCTION:
        case INCLUDES:
        case DASHMATCH:
        case DELIM:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_4;
        }
        n = Any(true);
                                 replaceName(n);
      }
      jj_consume_token(RBRACKET);
                                                                {if (true) return productionEndTerminal("Any13","-","-","Replacement","Default",first,token);}
      break;
    case DELIM:
      jj_consume_token(DELIM);
                 {if (true) return productionEndTerminal("Any14","-","-","Replacement","Default",first,token);}
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  public CSSMergeParserTokenManager token_source;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0xf5000000,0xf5000000,0xf5000000,0xf5000000,0xf5000000,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x7a83,0x7a83,0x7a83,0x7a83,0x7a83,};
   }

  public CSSMergeParser(CharStream stream) {
    token_source = new CSSMergeParserTokenManager(stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  public void ReInit(CharStream stream) {
    token_source.ReInit(stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  public CSSMergeParser(CSSMergeParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  public void ReInit(CSSMergeParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[47];
    for (int i = 0; i < 47; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 47; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
