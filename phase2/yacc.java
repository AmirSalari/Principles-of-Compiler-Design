/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 2 of "yacc.y"  */

	import java.io.*;
	import java.lang.System;
	import java.util.*;
	import java.nio.charset.StandardCharsets;


/**
 * A Bison parser, automatically generated from <tt>yacc.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int ID = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int VAR = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int OPARAN = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int CPARAN = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int BEGIN = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int END = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int FOR = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int IF = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int REPEAT = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int UNTIL = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int OF = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int INC = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int DEC = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int LE = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int GE = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int L = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int G = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int NE = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int EQ = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int SUM = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int MUL = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int OR = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int AND = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVINT = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVREAL = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int TRUE = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int FALSE = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int OBRACKET = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int CBRACKET = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int DOT = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int PROCEDURE = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int FUNCTION = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int CONST = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int DOUBLECONSTANT = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int INT = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int DOUBLE = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOL = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int ARRAY = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int INTCONSTANT = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMICOLON = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int UNARY = 309;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 56 of "yacc.y"  */
    {System.out.println("Rule 1-1 : 'program --> PROGRAM ID SEMICOLON declarations compoundstmt DOT'");};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 57 of "yacc.y"  */
    {System.out.println("Rule 1-2 : 'program --> PROGRAM ID SEMICOLON compoundstmt'");};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 60 of "yacc.y"  */
    {System.out.println("Rule 2-1 : 'declarations --> constantdef'");};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 61 of "yacc.y"  */
    {System.out.println("Rule 2-2 : 'declarations --> variabledec'");};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 62 of "yacc.y"  */
    {System.out.println("Rule 2-3 : 'declarations --> proceduredecs'");};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 63 of "yacc.y"  */
    {System.out.println("Rule 2-4 : 'declarations --> constantdef variabledec'");};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 64 of "yacc.y"  */
    {System.out.println("Rule 2-5 : 'declarations --> constantdef proceduredecs'");};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 65 of "yacc.y"  */
    {System.out.println("Rule 2-6 : 'declarations --> variabledec proceduredecs'");};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 66 of "yacc.y"  */
    {System.out.println("Rule 2-7 : 'declarations --> constantdef variabledec proceduredecs'");};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 69 of "yacc.y"  */
    {System.out.println("Rule 3 : 'constantdef --> CONST constdeflist'");};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 72 of "yacc.y"  */
    {System.out.println("Rule 4-1 : 'constdeflist --> typespecifier constdef'");};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 73 of "yacc.y"  */
    {System.out.println("Rule 4-2 : 'constdeflist --> typespecifier constdef constdeflist'");};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 76 of "yacc.y"  */
    {System.out.println("Rule 5-1 : 'constdef --> ID ASSIGN constant SEMICOLON'");};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 79 of "yacc.y"  */
    {System.out.println("Rule 6-1 : 'variabledec --> VAR variabledeclist'");};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 82 of "yacc.y"  */
    {System.out.println("Rule 7-1 : 'variabledeclist --> vardec'");};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 83 of "yacc.y"  */
    {System.out.println("Rule 7-2 : 'variabledeclist --> vardec variabledeclist'");};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 86 of "yacc.y"  */
    {System.out.println("Rule 8-1 : 'vardec --> typespecifier dec SEMICOLON'");};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 89 of "yacc.y"  */
    {System.out.println("Rule 9-1 : 'dec --> ID'");};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 90 of "yacc.y"  */
    {System.out.println("Rule 9-2 : 'dec --> assignmentstatement'");};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 91 of "yacc.y"  */
    {System.out.println("Rule 9-3 : 'dec --> ID COMMA dec'");};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 92 of "yacc.y"  */
    {System.out.println("Rule 9-4 : 'dec --> assignmentstatement COMMA dec'");};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 95 of "yacc.y"  */
    {System.out.println("Rule 10-1 : 'proceduredecs --> procdec proceduredecs'");};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 96 of "yacc.y"  */
    {System.out.println("Rule 10-2 : 'proceduredecs --> procdec'");};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 99 of "yacc.y"  */
    {System.out.println("Rule 11-1 : 'procdec --> PROCEDURE ID arguments SEMICOLON declarations compoundstmt SEMICOLON'");};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 100 of "yacc.y"  */
    {System.out.println("Rule 11-2 : 'procdec --> PROCEDURE ID SEMICOLON declarations compoundstmt SEMICOLON'");};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 101 of "yacc.y"  */
    {System.out.println("Rule 11-3 : 'procdec --> PROCEDURE ID arguments SEMICOLON compoundstmt SEMICOLON'");};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 102 of "yacc.y"  */
    {System.out.println("Rule 11-4 : 'procdec --> PROCEDURE ID SEMICOLON compoundstmt SEMICOLON'");};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 103 of "yacc.y"  */
    {System.out.println("Rule 11-5 : 'procdec --> FUNCTION typespecifier ID arguments SEMICOLON declarations compoundstmt SEMICOLON'");};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 104 of "yacc.y"  */
    {System.out.println("Rule 11-6 : 'procdec --> FUNCTION typespecifier ID SEMICOLON declarations compoundstmt SEMICOLON'");};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 105 of "yacc.y"  */
    {System.out.println("Rule 11-7 : 'procdec --> FUNCTION typespecifier ID arguments SEMICOLON compoundstmt SEMICOLON'");};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 106 of "yacc.y"  */
    {System.out.println("Rule 11-8 : 'procdec --> FUNCTION typespecifier ID SEMICOLON compoundstmt SEMICOLON'");};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 109 of "yacc.y"  */
    {System.out.println("Rule 12-1 : 'arguments --> OPARAN argumentlist CPARAN'");};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 112 of "yacc.y"  */
    {System.out.println("Rule 13-1 : 'argumentlist --> arg'");};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 113 of "yacc.y"  */
    {System.out.println("Rule 13-2 : 'argumentlist --> arg SEMICOLON argumentlist'");};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 116 of "yacc.y"  */
    {System.out.println("Rule 14-1 : 'arg --> idlist COLON typespecifier'");};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 119 of "yacc.y"  */
    {System.out.println("Rule 15-1 : 'compoundstmt --> BEGIN statementlist END'");};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 120 of "yacc.y"  */
    {System.out.println("Rule 15-2 : 'compoundstmt --> BEGIN END'");};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 123 of "yacc.y"  */
    {System.out.println("Rule 16-1 : 'statementlist --> statement'");};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 124 of "yacc.y"  */
    {System.out.println("Rule 16-2 : 'statementlist --> statement SEMICOLON statementlist'");};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 127 of "yacc.y"  */
    {System.out.println("Rule 17-1 : 'statement --> compoundstmt'");};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 128 of "yacc.y"  */
    {System.out.println("Rule 17-2 : 'statement --> assignmentstatement'");};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 129 of "yacc.y"  */
    {System.out.println("Rule 17-3 : 'statement --> procedurecall'");};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 130 of "yacc.y"  */
    {System.out.println("Rule 17-4 : 'statement --> forstatement'");};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 131 of "yacc.y"  */
    {System.out.println("Rule 17-5 : 'statement --> ifstatement'");};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 132 of "yacc.y"  */
    {System.out.println("Rule 17-6 : 'statement --> casestatement'");};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 133 of "yacc.y"  */
    {System.out.println("Rule 17-7 : 'statement --> repeatstatement'");};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 136 of "yacc.y"  */
    {System.out.println("Rule 18-1 : 'assignmentstatement --> variable ASSIGN espression'");};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 139 of "yacc.y"  */
    {System.out.println("Rule 19-1 : 'procedurecalL --> ID actuals'");};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 140 of "yacc.y"  */
    {System.out.println("Rule 19-2 : 'procedurecalL --> ID'");};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 144 of "yacc.y"  */
    {System.out.println("Rule 20-1 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID LE expression SEMICOLON ID INC CPARAN BEGIN statementlist END'");};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 146 of "yacc.y"  */
    {System.out.println("Rule 20-2 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID LE expression SEMICOLON ID INC CPARAN BEGIN END'");};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 148 of "yacc.y"  */
    {System.out.println("Rule 20-3 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID GE expression SEMICOLON ID DEC CPARAN BEGIN statementlist END'");};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 150 of "yacc.y"  */
    {System.out.println("Rule 20-4 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID GE expression SEMICOLON ID DEC CPARAN BEGIN END'");};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 153 of "yacc.y"  */
    {System.out.println("Rule 21-1 : 'ifstatement --> IF OPARAN expression CPARAN THEN compoundstmt'");};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 154 of "yacc.y"  */
    {System.out.println("Rule 21-2 : 'ifstatement --> IF OPARAN expression CPARAN THEN compoundstmt ELSE compoundstmt'");};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 157 of "yacc.y"  */
    {System.out.println("Rule 22-1 : 'repeatstatement --> REPEAT statementlist UNTIL expression'");};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 158 of "yacc.y"  */
    {System.out.println("Rule 22-2 : 'repeatstatement --> REPEAT UNTIL  expression'");};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 161 of "yacc.y"  */
    {System.out.println("Rule 23-1 : 'casestatement --> CASE expression OF caselist END'");};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 164 of "yacc.y"  */
    {System.out.println("Rule 24-1 : 'caselist --> case'");};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 165 of "yacc.y"  */
    {System.out.println("Rule 24-2 : 'caselist --> case SEMICOLON caselist'");};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 168 of "yacc.y"  */
    {System.out.println("Rule 25-1 : 'case --> constantlist COLON compoundstmt'");};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 172 of "yacc.y"  */
    {System.out.println("Rule 26-2 : 'constantlist --> constant COMMA constantlist'");};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 173 of "yacc.y"  */
    {System.out.println("Rule 26-3 : 'constantlist --> expression'");};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 176 of "yacc.y"  */
    {System.out.println("Rule 27-1 : 'expression --> expression LE expression'");};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 177 of "yacc.y"  */
    {System.out.println("Rule 27-2 : 'expression --> expression GE expression'");};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 178 of "yacc.y"  */
    {System.out.println("Rule 27-3 : 'expression --> expression L expression'");};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 179 of "yacc.y"  */
    {System.out.println("Rule 27-4 : 'expression --> expression G expression'");};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 180 of "yacc.y"  */
    {System.out.println("Rule 27-5 : 'expression --> expression NE expression'");};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 181 of "yacc.y"  */
    {System.out.println("Rule 27-6 : 'expression --> expression EQ expression'");};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 182 of "yacc.y"  */
    {System.out.println("Rule 27-7 : 'expression --> expression SUM expression'");};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 183 of "yacc.y"  */
    {System.out.println("Rule 27-8 : 'expression --> expression MINUS expression'");};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 184 of "yacc.y"  */
    {System.out.println("Rule 27-9 : 'expression --> expression OR expression'");};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 185 of "yacc.y"  */
    {System.out.println("Rule 27-10 : 'expression --> expression muL expression'");};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 186 of "yacc.y"  */
    {System.out.println("Rule 27-11 : 'expression --> expression DIVINT expression'");};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 187 of "yacc.y"  */
    {System.out.println("Rule 27-12 : 'expression --> expression divreaL expression'");};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 188 of "yacc.y"  */
    {System.out.println("Rule 27-13 : 'expression --> expression MOD expression'");};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 189 of "yacc.y"  */
    {System.out.println("Rule 27-14 : 'expression --> expression AND expression'");};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 190 of "yacc.y"  */
    {System.out.println("Rule 27-15 : 'expression --> OPARAN expression CPARAN'");};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 191 of "yacc.y"  */
    {System.out.println("Rule 27-16 : 'expression --> SUM expression'");};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 192 of "yacc.y"  */
    {System.out.println("Rule 27-17 : 'expression --> MINUS expression'");};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 193 of "yacc.y"  */
    {System.out.println("Rule 27-18 : 'expression --> NOT expression'");};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 195 of "yacc.y"  */
    {System.out.println("Rule 27-20 : 'expression --> ID actuals'");};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 196 of "yacc.y"  */
    {System.out.println("Rule 27-21 : 'expression --> ID'");};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 197 of "yacc.y"  */
    {System.out.println("Rule 27-22 : 'expression --> constant'");};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 199 of "yacc.y"  */
    {System.out.println("Rule 27-24 : 'expression --> variable OBRACKET expressionlist CBRACKET'");};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 200 of "yacc.y"  */
    {System.out.println("Rule 27-25 : 'expression --> variable inc'");};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 201 of "yacc.y"  */
    {System.out.println("Rule 27-26 : 'expression --> variable DEC'");};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 210 of "yacc.y"  */
    {System.out.println("Rule 29-1 : 'actuals --> OPARAN expressionlist CPARAN'");};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 213 of "yacc.y"  */
    {System.out.println("Rule 30-1 : 'expressionlist --> expression'");};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 214 of "yacc.y"  */
    {System.out.println("Rule 30-2 : 'expressionlist --> expression COMMA expressionlist'");};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 351 of lalr1.java  */
/* Line 217 of "yacc.y"  */
    {System.out.println("Rule 31-1 : 'variable --> ID'");};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 351 of lalr1.java  */
/* Line 218 of "yacc.y"  */
    {System.out.println("Rule 31-2 : 'variable --> variable OBRACKET expressionlist CBRACKET'");};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 351 of lalr1.java  */
/* Line 221 of "yacc.y"  */
    {System.out.println("Rule 32-1 : 'typespecifier --> INT'");};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 351 of lalr1.java  */
/* Line 222 of "yacc.y"  */
    {System.out.println("Rule 32-2 : 'typespecifier --> DOUBLE '");};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 351 of lalr1.java  */
/* Line 223 of "yacc.y"  */
    {System.out.println("Rule 32-3 : 'typespecifier --> BOOL'");};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 351 of lalr1.java  */
/* Line 224 of "yacc.y"  */
    {System.out.println("Rule 32-4 : 'typespecifier --> CHAR '");};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 351 of lalr1.java  */
/* Line 225 of "yacc.y"  */
    {System.out.println("Rule 32-5 : 'typespecifier --> ARRAY OBRACKET dimensionlist CBRACKET OF typespecifier'");};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 351 of lalr1.java  */
/* Line 228 of "yacc.y"  */
    {System.out.println("Rule 33-1 : 'idlist --> ID'");};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 351 of lalr1.java  */
/* Line 229 of "yacc.y"  */
    {System.out.println("Rule 33-2 : 'idlist --> ID COMMA idlist'");};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 351 of lalr1.java  */
/* Line 232 of "yacc.y"  */
    {System.out.println("Rule 34-1 : 'dimensionlist --> dimension'");};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 351 of lalr1.java  */
/* Line 233 of "yacc.y"  */
    {System.out.println("Rule 34-2 : 'dimensionlist --> dimension COMMA dimensionlist'");};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 351 of lalr1.java  */
/* Line 236 of "yacc.y"  */
    {System.out.println("Rule 35-1 : 'dimension --> INTCONSTANT'");};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 351 of lalr1.java  */
/* Line 239 of "yacc.y"  */
    {System.out.println("Rule 36-1 : 'constant --> INTCONSTANT'");};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 351 of lalr1.java  */
/* Line 240 of "yacc.y"  */
    {System.out.println("Rule 36-2 : 'constant --> DOUBLECONSTANT'");};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 351 of lalr1.java  */
/* Line 241 of "yacc.y"  */
    {System.out.println("Rule 36-3 : 'constant --> TRUE'");};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 351 of lalr1.java  */
/* Line 242 of "yacc.y"  */
    {System.out.println("Rule 36-4 : 'constant --> FALSE'");};
  break;
    



/* Line 351 of lalr1.java  */
/* Line 1340 of "yacc.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -97;
  private static final short yypact_[] =
  {
       -30,    25,    32,    -9,   -97,    27,   328,   176,    35,   328,
     328,    42,     4,     1,   -97,     1,   -97,   -97,   -97,   -97,
     -97,    41,   -97,   328,    76,    19,   -97,    74,    78,   200,
      82,   -97,    73,    37,   -97,   -97,   -97,   -97,   -97,   -97,
     -16,     5,    88,   -97,   118,    83,     1,   -97,   -97,   -97,
      72,   -97,    -2,    75,   124,    82,   -97,   128,    82,    82,
     117,   170,    82,    82,    82,    82,   -97,   -97,   -97,   -97,
     304,    -3,   -97,   -97,   358,    82,    82,   130,    27,   111,
       6,   119,   328,   -97,   -97,   -97,   132,   161,    76,   -97,
      76,   233,   167,   135,   260,   318,    82,   -97,   287,    90,
      90,   318,    82,    82,    82,    82,    82,    82,    82,    82,
      82,    82,    82,    82,    82,    82,    82,   -97,   -97,    82,
     -97,   140,   318,   178,   186,   141,   155,    42,   143,    27,
      27,   146,   -12,   -97,   183,    72,   -97,   -97,    82,   -97,
      82,   192,   318,   -97,   197,   156,   172,   318,   208,   274,
     219,   274,   219,    34,    34,    90,    90,   248,   -97,   -97,
     248,   248,   248,   195,   -97,   130,   -97,   130,   328,   182,
     -97,    42,   184,    42,   193,    27,   198,   328,   -97,   -97,
     115,    42,   -97,    82,    42,    82,     0,   -97,   -97,   -97,
     -97,   223,   -97,   226,   -97,    42,   243,   -97,   -97,   247,
     288,   -97,   -97,   -97,   -97,   -97,   249,   -97,    51,    42,
     -97,    82,    82,   -97,   129,   199,   297,   302,   218,   303,
     299,   316,   345,   346,   231,   349,   -97,   347,   -97,   353,
     -97,   -97
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,     0,     0,     0,     0,     0,
       0,     0,     4,     5,     6,    24,     3,    94,    95,    96,
      97,     0,    15,    16,     0,    50,    38,     0,     0,     0,
       0,    41,     0,    39,    42,    43,    44,    45,    47,    46,
       0,     0,     0,    11,     0,     0,     7,     8,     9,    23,
       0,    17,    92,     0,    20,     0,    49,     0,     0,     0,
       0,    84,     0,     0,     0,     0,   106,   107,   105,   104,
       0,     0,    85,    37,     0,     0,     0,     0,     0,     0,
       0,     0,    12,     2,    10,   103,     0,   101,     0,    18,
       0,    90,     0,     0,     0,    58,     0,    83,     0,    80,
      81,    82,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,    87,    88,     0,
      40,     0,    48,    99,     0,    34,     0,     0,     0,     0,
       0,     0,     0,    13,     0,     0,    21,    22,     0,    89,
       0,     0,    57,    79,     0,    60,     0,    64,    85,    65,
      66,    67,    68,    69,    70,    71,    72,    74,    73,    78,
      77,    75,    76,     0,    93,     0,    33,     0,     0,     0,
      28,     0,     0,     0,     0,     0,     0,     0,   102,    91,
       0,     0,    59,     0,     0,     0,    86,   100,    35,    36,
      26,     0,    27,     0,    32,     0,     0,    14,    98,     0,
      55,    61,    62,    63,    25,    30,     0,    31,     0,     0,
      29,     0,     0,    56,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,    52,     0,    54,     0,
      51,    53
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -97,   -97,   -68,   -97,   273,   -97,   352,   344,   -97,   -49,
      14,   -97,   290,   204,   -97,    -4,   -27,   -97,   -15,   -97,
     -97,   -97,   -97,   -97,   190,   -97,   196,   -10,   319,   -62,
      -7,    -5,   217,   250,   -97,   -96
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    11,    12,    43,    82,    13,    22,    23,    53,
      14,    15,    79,   124,   125,    31,    32,    33,    34,    35,
      36,    37,    38,    39,   144,   145,   146,    91,    56,    92,
      71,    24,   126,    86,    87,    72
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -94;
  private static final short
  yytable_[] =
  {
        40,    16,    60,    88,    42,    44,   148,    45,     6,    54,
     127,    77,    77,   121,     1,   117,   118,    40,   -93,   -93,
      70,    75,    40,    66,    67,    55,    47,    48,     3,    49,
      76,     6,     4,    68,   119,     7,   176,   -93,    41,   136,
      69,   137,     8,     9,     5,     8,     9,   120,    94,    95,
       7,   -19,    98,    99,   100,   101,   -92,   163,    78,   130,
      84,   171,   173,   112,   113,   -92,   122,    40,     8,     9,
      10,   211,   212,    54,   128,    54,   179,    44,    50,    52,
      57,    40,    73,    40,    58,    61,   142,   148,    62,   148,
      74,    80,   147,   149,   150,   151,   152,   153,   154,   155,
     156,   157,   158,   159,   160,   161,   162,   195,    63,    64,
     103,   104,   105,   106,   107,   108,    65,    66,    67,   112,
     113,    81,    83,   169,    85,   172,   174,    68,    89,    90,
     180,    93,    96,   123,    69,   103,   104,   105,   106,   107,
     108,   109,   110,   111,   112,   113,   114,   115,   116,   103,
     104,   105,   106,   107,   108,   109,   110,   111,   112,   113,
     114,   115,   116,   189,   129,   132,   135,   191,   199,   193,
     134,   196,   198,   147,   139,   147,    55,   200,   164,    25,
     202,   140,   216,   165,     7,    26,    27,    28,   -92,   -92,
      29,   206,    30,   166,   167,   168,   170,   227,   229,   175,
     177,   214,   215,    25,   181,   213,   182,   -92,     7,   183,
      27,    28,   184,   185,    29,    59,    30,    40,    40,   103,
     104,   105,   106,   107,   108,   109,   110,   111,   112,   113,
     114,   115,   116,   186,    25,   190,   220,   192,   138,     7,
     226,    27,    28,   107,   108,    29,   194,    30,   112,   113,
     208,   197,   217,   103,   104,   105,   106,   107,   108,   109,
     110,   111,   112,   113,   114,   115,   116,   141,   103,   104,
     105,   106,   107,   108,   109,   110,   204,   112,   113,   205,
     103,   104,   105,   106,   107,   108,   109,   110,   111,   112,
     113,   114,   115,   116,   143,   104,   207,   106,   107,   108,
     218,   209,   210,   112,   113,   219,   222,   103,   104,   105,
     106,   107,   108,   109,   110,   111,   112,   113,   114,   115,
     116,   102,   221,   223,   103,   104,   105,   106,   107,   108,
     109,   110,   111,   112,   113,   114,   115,   116,   103,   104,
     105,   106,   107,   108,   109,   110,   111,   112,   113,   114,
     115,   116,    25,   224,   225,   133,   230,     7,   228,    27,
      28,    25,   231,    29,    46,    30,     7,    51,    27,    28,
     131,   188,    29,   201,    30,    17,    18,    19,    20,    21,
      97,   203,   187,     0,     0,   178
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
         7,     5,    29,     5,     9,    10,   102,    11,     4,    24,
      78,     6,     6,    75,    44,    18,    19,    24,    18,    19,
      30,    37,    29,    35,    36,     6,    12,    13,     3,    15,
      46,     4,     0,    45,    37,     8,   132,    37,     3,    88,
      52,    90,    41,    42,    53,    41,    42,    74,    58,    59,
       8,    53,    62,    63,    64,    65,    37,   119,    53,    53,
      46,   129,   130,    29,    30,    46,    76,    74,    41,    42,
      43,    20,    21,    88,    78,    90,   138,    82,    37,     3,
       6,    88,     9,    90,     6,     3,    96,   183,     6,   185,
      53,     3,   102,   103,   104,   105,   106,   107,   108,   109,
     110,   111,   112,   113,   114,   115,   116,   175,    26,    27,
      20,    21,    22,    23,    24,    25,    34,    35,    36,    29,
      30,     3,    39,   127,    52,   129,   130,    45,    53,     5,
     140,     3,    15,     3,    52,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    20,
      21,    22,    23,    24,    25,    26,    27,    28,    29,    30,
      31,    32,    33,   168,    53,    46,     5,   171,    53,   173,
      38,   175,   177,   183,     7,   185,     6,   181,    38,     3,
     184,    46,    53,     5,     8,     9,    10,    11,    18,    19,
      14,   195,    16,     7,    53,    40,    53,   224,   225,    53,
      17,   211,   212,     3,    12,   209,     9,    37,     8,    53,
      10,    11,    40,     5,    14,    15,    16,   224,   225,    20,
      21,    22,    23,    24,    25,    26,    27,    28,    29,    30,
      31,    32,    33,    38,     3,    53,    18,    53,     5,     8,
       9,    10,    11,    24,    25,    14,    53,    16,    29,    30,
       3,    53,    53,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    31,    32,    33,     7,    20,    21,
      22,    23,    24,    25,    26,    27,    53,    29,    30,    53,
      20,    21,    22,    23,    24,    25,    26,    27,    28,    29,
      30,    31,    32,    33,     7,    21,    53,    23,    24,    25,
       3,    13,    53,    29,    30,     3,     7,    20,    21,    22,
      23,    24,    25,    26,    27,    28,    29,    30,    31,    32,
      33,    17,    19,     7,    20,    21,    22,    23,    24,    25,
      26,    27,    28,    29,    30,    31,    32,    33,    20,    21,
      22,    23,    24,    25,    26,    27,    28,    29,    30,    31,
      32,    33,     3,     8,     8,    82,     9,     8,     9,    10,
      11,     3,     9,    14,    12,    16,     8,    23,    10,    11,
      80,   167,    14,   183,    16,    47,    48,    49,    50,    51,
      61,   185,   165,    -1,    -1,   135
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    44,    56,     3,     0,    53,     4,     8,    41,    42,
      43,    57,    58,    61,    65,    66,    70,    47,    48,    49,
      50,    51,    62,    63,    86,     3,     9,    10,    11,    14,
      16,    70,    71,    72,    73,    74,    75,    76,    77,    78,
      85,     3,    86,    59,    86,    70,    61,    65,    65,    65,
      37,    62,     3,    64,    73,     6,    83,     6,     6,    15,
      71,     3,     6,    26,    27,    34,    35,    36,    45,    52,
      82,    85,    90,     9,    53,    37,    46,     6,    53,    67,
       3,     3,    60,    39,    65,    52,    88,    89,     5,    53,
       5,    82,    84,     3,    82,    82,    15,    83,    82,    82,
      82,    82,    17,    20,    21,    22,    23,    24,    25,    26,
      27,    28,    29,    30,    31,    32,    33,    18,    19,    37,
      71,    84,    82,     3,    68,    69,    87,    57,    70,    53,
      53,    67,    46,    59,    38,     5,    64,    64,     5,     7,
      46,     7,    82,     7,    79,    80,    81,    82,    90,    82,
      82,    82,    82,    82,    82,    82,    82,    82,    82,    82,
      82,    82,    82,    84,    38,     5,     7,    53,    40,    70,
      53,    57,    70,    57,    70,    53,    90,    17,    88,    84,
      82,    12,     9,    53,    40,     5,    38,    87,    68,    86,
      53,    70,    53,    70,    53,    57,    70,    53,    86,    53,
      70,    79,    70,    81,    53,    53,    70,    53,     3,    13,
      53,    20,    21,    70,    82,    82,    53,    53,     3,     3,
      18,    19,     7,     7,     8,     8,     9,    71,     9,    71,
       9,     9
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    55,    56,    56,    57,    57,    57,    57,    57,    57,
      57,    58,    59,    59,    60,    61,    62,    62,    63,    64,
      64,    64,    64,    65,    65,    66,    66,    66,    66,    66,
      66,    66,    66,    67,    68,    68,    69,    70,    70,    71,
      71,    72,    72,    72,    72,    72,    72,    72,    73,    74,
      74,    75,    75,    75,    75,    76,    76,    77,    77,    78,
      79,    79,    80,    81,    81,    82,    82,    82,    82,    82,
      82,    82,    82,    82,    82,    82,    82,    82,    82,    82,
      82,    82,    82,    82,    82,    82,    82,    82,    82,    83,
      84,    84,    85,    85,    86,    86,    86,    86,    86,    87,
      87,    88,    88,    89,    90,    90,    90,    90
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     6,     4,     1,     1,     1,     2,     2,     2,
       3,     2,     2,     3,     4,     2,     1,     2,     3,     1,
       1,     3,     3,     2,     1,     7,     6,     6,     5,     8,
       7,     7,     6,     3,     1,     3,     3,     3,     2,     1,
       3,     1,     1,     1,     1,     1,     1,     1,     3,     2,
       1,    16,    15,    16,    15,     6,     8,     4,     3,     5,
       1,     3,     3,     3,     1,     3,     3,     3,     3,     3,
       3,     3,     3,     3,     3,     3,     3,     3,     3,     3,
       2,     2,     2,     2,     1,     1,     4,     2,     2,     3,
       1,     3,     1,     4,     1,     1,     1,     1,     6,     1,
       3,     1,     3,     1,     1,     1,     1,     1
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "ID", "VAR", "COMMA", "OPARAN", "CPARAN",
  "BEGIN", "END", "FOR", "IF", "THEN", "ELSE", "REPEAT", "UNTIL", "CASE",
  "OF", "INC", "DEC", "LE", "GE", "L", "G", "NE", "EQ", "SUM", "MINUS",
  "MUL", "OR", "AND", "MOD", "DIVINT", "DIVREAL", "NOT", "TRUE", "FALSE",
  "OBRACKET", "CBRACKET", "DOT", "COLON", "PROCEDURE", "FUNCTION", "CONST",
  "PROGRAM", "DOUBLECONSTANT", "ASSIGN", "INT", "DOUBLE", "BOOL", "CHAR",
  "ARRAY", "INTCONSTANT", "SEMICOLON", "UNARY", "$accept", "program",
  "declarations", "constantdef", "constdeflist", "constdef", "variabledec",
  "variabledeclist", "vardec", "dec", "proceduredecs", "procdec",
  "arguments", "argumentlist", "arg", "compoundstmt", "statementlist",
  "statement", "assignmentstatement", "procedurecall", "forstatement",
  "ifstatement", "repeatstatement", "casestatement", "caselist", "case",
  "constantlist", "expression", "actuals", "expressionlist", "variable",
  "typespecifier", "idlist", "dimensionlist", "dimension", "constant", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        56,     0,    -1,    44,     3,    53,    57,    70,    39,    -1,
      44,     3,    53,    70,    -1,    58,    -1,    61,    -1,    65,
      -1,    58,    61,    -1,    58,    65,    -1,    61,    65,    -1,
      58,    61,    65,    -1,    43,    59,    -1,    86,    60,    -1,
      86,    60,    59,    -1,     3,    46,    90,    53,    -1,     4,
      62,    -1,    63,    -1,    63,    62,    -1,    86,    64,    53,
      -1,     3,    -1,    73,    -1,     3,     5,    64,    -1,    73,
       5,    64,    -1,    66,    65,    -1,    66,    -1,    41,     3,
      67,    53,    57,    70,    53,    -1,    41,     3,    53,    57,
      70,    53,    -1,    41,     3,    67,    53,    70,    53,    -1,
      41,     3,    53,    70,    53,    -1,    42,    86,     3,    67,
      53,    57,    70,    53,    -1,    42,    86,     3,    53,    57,
      70,    53,    -1,    42,    86,     3,    67,    53,    70,    53,
      -1,    42,    86,     3,    53,    70,    53,    -1,     6,    68,
       7,    -1,    69,    -1,    69,    53,    68,    -1,    87,    40,
      86,    -1,     8,    71,     9,    -1,     8,     9,    -1,    72,
      -1,    72,    53,    71,    -1,    70,    -1,    73,    -1,    74,
      -1,    75,    -1,    76,    -1,    78,    -1,    77,    -1,    85,
      46,    82,    -1,     3,    83,    -1,     3,    -1,    10,     6,
       3,    46,    82,    53,     3,    20,    82,    53,     3,    18,
       7,     8,    71,     9,    -1,    10,     6,     3,    46,    82,
      53,     3,    20,    82,    53,     3,    18,     7,     8,     9,
      -1,    10,     6,     3,    46,    82,    53,     3,    21,    82,
      53,     3,    19,     7,     8,    71,     9,    -1,    10,     6,
       3,    46,    82,    53,     3,    21,    82,    53,     3,    19,
       7,     8,     9,    -1,    11,     6,    82,     7,    12,    70,
      -1,    11,     6,    82,     7,    12,    70,    13,    70,    -1,
      14,    71,    15,    82,    -1,    14,    15,    82,    -1,    16,
      82,    17,    79,     9,    -1,    80,    -1,    80,    53,    79,
      -1,    81,    40,    70,    -1,    90,     5,    81,    -1,    82,
      -1,    82,    20,    82,    -1,    82,    21,    82,    -1,    82,
      22,    82,    -1,    82,    23,    82,    -1,    82,    24,    82,
      -1,    82,    25,    82,    -1,    82,    26,    82,    -1,    82,
      27,    82,    -1,    82,    29,    82,    -1,    82,    28,    82,
      -1,    82,    32,    82,    -1,    82,    33,    82,    -1,    82,
      31,    82,    -1,    82,    30,    82,    -1,     6,    82,     7,
      -1,    26,    82,    -1,    27,    82,    -1,    34,    82,    -1,
       3,    83,    -1,     3,    -1,    90,    -1,    85,    37,    84,
      38,    -1,    85,    18,    -1,    85,    19,    -1,     6,    84,
       7,    -1,    82,    -1,    82,     5,    84,    -1,     3,    -1,
      85,    37,    84,    38,    -1,    47,    -1,    48,    -1,    49,
      -1,    50,    -1,    51,    37,    88,    38,    17,    86,    -1,
       3,    -1,     3,     5,    87,    -1,    89,    -1,    89,     5,
      88,    -1,    52,    -1,    52,    -1,    45,    -1,    35,    -1,
      36,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,    10,    15,    17,    19,    21,    24,    27,
      30,    34,    37,    40,    44,    49,    52,    54,    57,    61,
      63,    65,    69,    73,    76,    78,    86,    93,   100,   106,
     115,   123,   131,   138,   142,   144,   148,   152,   156,   159,
     161,   165,   167,   169,   171,   173,   175,   177,   179,   183,
     186,   188,   205,   221,   238,   254,   261,   270,   275,   279,
     285,   287,   291,   295,   299,   301,   305,   309,   313,   317,
     321,   325,   329,   333,   337,   341,   345,   349,   353,   357,
     361,   364,   367,   370,   373,   375,   377,   382,   385,   388,
     392,   394,   398,   400,   405,   407,   409,   411,   413,   420,
     422,   426,   428,   432,   434,   436,   438,   440
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    56,    56,    57,    60,    61,    62,    63,    64,    65,
      66,    69,    72,    73,    76,    79,    82,    83,    86,    89,
      90,    91,    92,    95,    96,    99,   100,   101,   102,   103,
     104,   105,   106,   109,   112,   113,   116,   119,   120,   123,
     124,   127,   128,   129,   130,   131,   132,   133,   136,   139,
     140,   143,   145,   147,   149,   153,   154,   157,   158,   161,
     164,   165,   168,   172,   173,   176,   177,   178,   179,   180,
     181,   182,   183,   184,   185,   186,   187,   188,   189,   190,
     191,   192,   193,   195,   196,   197,   199,   200,   201,   210,
     213,   214,   217,   218,   221,   222,   223,   224,   225,   228,
     229,   232,   233,   236,   239,   240,   241,   242
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 385;
  private static final int yynnts_ = 36;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 55;

  private static final int yyuser_token_number_max_ = 309;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 9 of "yacc.y"  */

public static void main(String args[]) throws IOException {
		 YYParser yyparser;
		final Yylex lexer;		
		InputStream is = new FileInputStream("input.txt");		
		lexer=new Yylex(new InputStreamReader(is));
		  yyparser = new YYParser(new Lexer() {
	
	@Override
	public int yylex () {
	  int yyl_return = -1;
	  try {
	   yyl_return = lexer.yylex();
	  }
	  catch (IOException e) {
	   System.err.println("IO error :"+e);
	  }
	  return yyl_return;
	}
	
	@Override
	public void yyerror (String error) {
		System.err.println ("Error : " + error);
	}
	
	@Override
	public Object getLVal() {
		return null;
	}
});
		new test(yyparser);
	}



/* Line 927 of lalr1.java  */
/* Line 2215 of "yacc.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 244 of "yacc.y"  */

 class test {
	test(YYParser yyparser) throws IOException{
		yyparser.parse();
	};
}

