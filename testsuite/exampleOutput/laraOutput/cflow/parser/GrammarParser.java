/* Generated By:JJTree&JavaCC: Do not edit this line. GrammarParser.java */
package parser;

import logic.NFASet;
import fa.NFA;
import gui.GraphViz;
import java.io.File;
import fa.DFA;

public class GrammarParser/*@bgen(jjtree)*/implements GrammarParserTreeConstants, GrammarParserConstants {/*@bgen(jjtree)*/
  protected JJTGrammarParserState jjtree = new JJTGrammarParserState();public static void main(String args[]) throws ParseException {
    GrammarParser gp = new GrammarParser(System.in);
    SimpleNode root = gp.Start();

    NFASet parser = new NFASet((SimpleNode) root.jjtGetChild(0), null);
    NFA nfa = parser.convert();
    nfa.getLastState().setAcceptState(true);
    System.out.println(nfa.toString());


    DFA dfa= nfa.getDFA();

    System.out.println(nfa.toDotFormat());
    createDotGraph(nfa.toDotFormat(), "Nfa");

    System.out.println(dfa.toDotFormat());
    createDotGraph(dfa.toDotFormat(), "Dfa");



    parser.dump();
  }


public static void createDotGraph(String dotFormat,String fileName)
{
    GraphViz gv=new GraphViz();
    gv.addln(gv.start_graph());
    gv.add(dotFormat);
    gv.addln(gv.end_graph());
    String type = "pdf";
    gv.decreaseDpi();
    gv.decreaseDpi();

    File out = new File(fileName+"."+ type);
    gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
}

  final public SimpleNode Start() throws ParseException {
                     /*@bgen(jjtree) Start */
  SimpleNode jjtn000 = new SimpleNode(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      NFASet();
      jj_consume_token(LF);
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                 {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
  }

  final public void NFASet() throws ParseException {
                /*@bgen(jjtree) NFASet */
  SimpleNode jjtn000 = new SimpleNode(JJTNFASET);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      ExpressionSet();
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 9:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        jj_consume_token(9);
        ExpressionSet();
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void ExpressionSet() throws ParseException {
                       /*@bgen(jjtree) ExpressionSet */
  SimpleNode jjtn000 = new SimpleNode(JJTEXPRESSIONSET);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_2:
      while (true) {
        Expression();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
        case 10:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
    } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  final public void Expression() throws ParseException {
                          Token identifier, op;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 10:
    SimpleNode jjtn001 = new SimpleNode(JJTSUBNFA);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
      try {
        jj_consume_token(10);
        NFASet();
        jj_consume_token(11);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPERATOR:
        case 12:
          Operator();
          break;
        default:
          jj_la1[2] = jj_gen;
          ;
        }
      } catch (Throwable jjte001) {
    if (jjtc001) {
      jjtree.clearNodeScope(jjtn001);
      jjtc001 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte001 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte001;}
    }
    if (jjte001 instanceof ParseException) {
      {if (true) throw (ParseException)jjte001;}
    }
    {if (true) throw (Error)jjte001;}
      } finally {
    if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, true);
    }
      }
      break;
    case IDENTIFIER:
    SimpleNode jjtn002 = new SimpleNode(JJTTERM);
    boolean jjtc002 = true;
    jjtree.openNodeScope(jjtn002);
      try {
        identifier = jj_consume_token(IDENTIFIER);
                                  jjtn002.name = identifier.image;
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OPERATOR:
        case 12:
          Operator();
          break;
        default:
          jj_la1[3] = jj_gen;
          ;
        }
      } catch (Throwable jjte002) {
    if (jjtc002) {
      jjtree.clearNodeScope(jjtn002);
      jjtc002 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte002 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte002;}
    }
    if (jjte002 instanceof ParseException) {
      {if (true) throw (ParseException)jjte002;}
    }
    {if (true) throw (Error)jjte002;}
      } finally {
    if (jjtc002) {
      jjtree.closeNodeScope(jjtn002, true);
    }
      }
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Operator() throws ParseException {
                  /*@bgen(jjtree) Operator */
                  SimpleNode jjtn000 = new SimpleNode(JJTOPERATOR);
                  boolean jjtc000 = true;
                  jjtree.openNodeScope(jjtn000);Token op;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERATOR:
        op = jj_consume_token(OPERATOR);
        break;
      case 12:
        jj_consume_token(12);
        op = jj_consume_token(INTERVAL);
        jj_consume_token(13);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jjtree.closeNodeScope(jjtn000, true);
      jjtc000 = false;
      jjtn000.name = op.image;
    } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
  }

  /** Generated Token Manager. */
  public GrammarParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x200,0x500,0x1020,0x1020,0x500,0x1020,};
   }

  /** Constructor with InputStream. */
  public GrammarParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public GrammarParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new GrammarParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public GrammarParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new GrammarParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public GrammarParser(GrammarParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(GrammarParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
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


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[14];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 6; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 14; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}