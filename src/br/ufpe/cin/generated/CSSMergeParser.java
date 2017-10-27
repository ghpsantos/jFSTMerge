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
      case EMS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      n = StyleSheet(inTerminal);
                                   replaceName(n);
    }
    jj_consume_token(0);
                                                             {if (true) return productionEndNonTerminal("CompilationUnit","-","-");}
    throw new Error("Missing return statement in function");
  }

  final public FSTInfo StyleSheet(boolean inTerminal) throws ParseException {
                                           Token first=null,t;FSTInfo n;
     first=getToken(1); productionStart(inTerminal);
    jj_consume_token(EMS);
    jj_consume_token(EXS);
    jj_consume_token(LENGTH);
                              {if (true) return productionEndTerminal("StyleSheet","-","-","Replacement","Default",first,token);}
    throw new Error("Missing return statement in function");
  }

  public CSSMergeParserTokenManager token_source;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[1];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_0();
      jj_la1_1();
      jj_la1_2();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x0,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x1000000,};
   }
   private static void jj_la1_2() {
      jj_la1_2 = new int[] {0x0,};
   }

  public CSSMergeParser(CharStream stream) {
    token_source = new CSSMergeParserTokenManager(stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  public void ReInit(CharStream stream) {
    token_source.ReInit(stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  public CSSMergeParser(CSSMergeParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
  }

  public void ReInit(CSSMergeParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 1; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[67];
    for (int i = 0; i < 67; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 1; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 67; i++) {
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
