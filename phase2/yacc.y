%language "Java"
%{
	import java.io.*;
	import java.lang.System;in
	import java.util.*;
	import java.nio.charset.StandardCharsets;
%}
%token ID VAR COMMA OPARAN CPARAN BEGIN END FOR IF THEN ELSE  REPEAT UNTIL CASE OF INC DEC LE GE L G NE EQ SUM MINUS MUL OR AND MOD DIVINT DIVREAL NOT TRUE FALSE OBRACKET CBRACKET DOT COLON PROCEDURE FUNCTION CONST PROGRAM DOUBLECONSTANT ASSIGN INT DOUBLE BOOL CHAR ARRAY INTCONSTANT SEMICOLON 
%code {
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
}
%left FUNCTION
%right NOT
%left MUL DIVINT DIVREAL MOD
%left SUM MINUS
%left UNARY
%left L LE
%left G GE
%left EQ NE
%left AND OR
%right ASSIGN
%start program

%%
program 
: PROGRAM ID SEMICOLON declarations compoundstmt DOT{System.out.println("Rule 1-1 : 'program --> PROGRAM ID SEMICOLON declarations compoundstmt DOT'");};|
  PROGRAM ID SEMICOLON compoundstmt{System.out.println("Rule 1-2 : 'program --> PROGRAM ID SEMICOLON compoundstmt'");};
//-------------
declarations 
: constantdef {System.out.println("Rule 2-1 : 'declarations --> constantdef'");};|
  variabledec {System.out.println("Rule 2-2 : 'declarations --> variabledec'");};|
  proceduredecs {System.out.println("Rule 2-3 : 'declarations --> proceduredecs'");};|
  constantdef variabledec {System.out.println("Rule 2-4 : 'declarations --> constantdef variabledec'");};|
  constantdef proceduredecs {System.out.println("Rule 2-5 : 'declarations --> constantdef proceduredecs'");};|
  variabledec proceduredecs {System.out.println("Rule 2-6 : 'declarations --> variabledec proceduredecs'");};|
  constantdef variabledec proceduredecs {System.out.println("Rule 2-7 : 'declarations --> constantdef variabledec proceduredecs'");};
//-------------
constantdef
: CONST constdeflist{System.out.println("Rule 3 : 'constantdef --> CONST constdeflist'");};
//-------------
constdeflist
:typespecifier constdef{System.out.println("Rule 4-1 : 'constdeflist --> typespecifier constdef'");};|
 typespecifier constdef constdeflist{System.out.println("Rule 4-2 : 'constdeflist --> typespecifier constdef constdeflist'");};
//-------------
constdef
:ID ASSIGN constant SEMICOLON {System.out.println("Rule 5-1 : 'constdef --> ID ASSIGN constant SEMICOLON'");};
//-------------
variabledec
:VAR variabledeclist{System.out.println("Rule 6-1 : 'variabledec --> VAR variabledeclist'");};
//-------------
variabledeclist
:vardec{System.out.println("Rule 7-1 : 'variabledeclist --> vardec'");};|
 vardec variabledeclist{System.out.println("Rule 7-2 : 'variabledeclist --> vardec variabledeclist'");};
//-------------
vardec
:typespecifier dec SEMICOLON{System.out.println("Rule 8-1 : 'vardec --> typespecifier dec SEMICOLON'");};
//-------------
dec
:ID{System.out.println("Rule 9-1 : 'dec --> ID'");};|
 assignmentstatement{System.out.println("Rule 9-2 : 'dec --> assignmentstatement'");};|
 ID COMMA dec{System.out.println("Rule 9-3 : 'dec --> ID COMMA dec'");};|
 assignmentstatement COMMA dec{System.out.println("Rule 9-4 : 'dec --> assignmentstatement COMMA dec'");};
//-------------
proceduredecs
:procdec proceduredecs{System.out.println("Rule 10-1 : 'proceduredecs --> procdec proceduredecs'");};|
 procdec {System.out.println("Rule 10-2 : 'proceduredecs --> procdec'");};
//-------------
procdec
:PROCEDURE ID arguments SEMICOLON declarations compoundstmt SEMICOLON{System.out.println("Rule 11-1 : 'procdec --> PROCEDURE ID arguments SEMICOLON declarations compoundstmt SEMICOLON'");};|
PROCEDURE ID SEMICOLON declarations compoundstmt SEMICOLON{System.out.println("Rule 11-2 : 'procdec --> PROCEDURE ID SEMICOLON declarations compoundstmt SEMICOLON'");};|
PROCEDURE ID arguments SEMICOLON compoundstmt SEMICOLON{System.out.println("Rule 11-3 : 'procdec --> PROCEDURE ID arguments SEMICOLON compoundstmt SEMICOLON'");};|
PROCEDURE ID SEMICOLON compoundstmt SEMICOLON{System.out.println("Rule 11-4 : 'procdec --> PROCEDURE ID SEMICOLON compoundstmt SEMICOLON'");};|
FUNCTION typespecifier ID arguments SEMICOLON declarations compoundstmt SEMICOLON{System.out.println("Rule 11-5 : 'procdec --> FUNCTION typespecifier ID arguments SEMICOLON declarations compoundstmt SEMICOLON'");};|
FUNCTION typespecifier ID SEMICOLON declarations compoundstmt SEMICOLON{System.out.println("Rule 11-6 : 'procdec --> FUNCTION typespecifier ID SEMICOLON declarations compoundstmt SEMICOLON'");};|
FUNCTION typespecifier ID arguments SEMICOLON compoundstmt SEMICOLON{System.out.println("Rule 11-7 : 'procdec --> FUNCTION typespecifier ID arguments SEMICOLON compoundstmt SEMICOLON'");};|
FUNCTION typespecifier ID SEMICOLON compoundstmt SEMICOLON{System.out.println("Rule 11-8 : 'procdec --> FUNCTION typespecifier ID SEMICOLON compoundstmt SEMICOLON'");};
//-------------
arguments
:OPARAN argumentlist CPARAN{System.out.println("Rule 12-1 : 'arguments --> OPARAN argumentlist CPARAN'");};
//-------------
argumentlist
:arg{System.out.println("Rule 13-1 : 'argumentlist --> arg'");};|
 arg SEMICOLON argumentlist{System.out.println("Rule 13-2 : 'argumentlist --> arg SEMICOLON argumentlist'");};
//-------------
arg
:idlist COLON typespecifier{System.out.println("Rule 14-1 : 'arg --> idlist COLON typespecifier'");};
//-------------
compoundstmt
:BEGIN statementlist END{System.out.println("Rule 15-1 : 'compoundstmt --> BEGIN statementlist END'");};|
 BEGIN END{System.out.println("Rule 15-2 : 'compoundstmt --> BEGIN END'");};
//-------------
statementlist
:statement{System.out.println("Rule 16-1 : 'statementlist --> statement'");};|
 statement SEMICOLON statementlist{System.out.println("Rule 16-2 : 'statementlist --> statement SEMICOLON statementlist'");};
//-------------
statement
:compoundstmt{System.out.println("Rule 17-1 : 'statement --> compoundstmt'");};|
 assignmentstatement{System.out.println("Rule 17-2 : 'statement --> assignmentstatement'");};|
 procedurecall{System.out.println("Rule 17-3 : 'statement --> procedurecall'");};|
 forstatement{System.out.println("Rule 17-4 : 'statement --> forstatement'");};|
 ifstatement{System.out.println("Rule 17-5 : 'statement --> ifstatement'");};|
 casestatement{System.out.println("Rule 17-6 : 'statement --> casestatement'");};|
 repeatstatement{System.out.println("Rule 17-7 : 'statement --> repeatstatement'");};
//-------------
assignmentstatement
:variable ASSIGN expression{System.out.println("Rule 18-1 : 'assignmentstatement --> variable ASSIGN espression'");};
//-------------
procedurecall
:ID actuals{System.out.println("Rule 19-1 : 'procedurecalL --> ID actuals'");};|
 ID {System.out.println("Rule 19-2 : 'procedurecalL --> ID'");};
//-------------
forstatement
:FOR OPARAN ID ASSIGN expression SEMICOLON ID LE expression SEMICOLON ID INC CPARAN BEGIN statementlist END
{System.out.println("Rule 20-1 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID LE expression SEMICOLON ID INC CPARAN BEGIN statementlist END'");};|
 FOR OPARAN ID ASSIGN expression SEMICOLON ID LE expression SEMICOLON ID INC CPARAN BEGIN END
{System.out.println("Rule 20-2 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID LE expression SEMICOLON ID INC CPARAN BEGIN END'");};|
 FOR OPARAN ID ASSIGN expression SEMICOLON ID GE expression SEMICOLON ID DEC CPARAN BEGIN statementlist END
{System.out.println("Rule 20-3 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID GE expression SEMICOLON ID DEC CPARAN BEGIN statementlist END'");};|
 FOR OPARAN ID ASSIGN expression SEMICOLON ID GE expression SEMICOLON ID DEC CPARAN BEGIN END
 {System.out.println("Rule 20-4 : 'forstatement --> FOR OPARAN ID ASSIGN expression SEMICOLON ID GE expression SEMICOLON ID DEC CPARAN BEGIN END'");};
//-------------
ifstatement
:IF OPARAN expression CPARAN THEN compoundstmt {System.out.println("Rule 21-1 : 'ifstatement --> IF OPARAN expression CPARAN THEN compoundstmt'");};|
 IF OPARAN expression CPARAN THEN compoundstmt ELSE compoundstmt{System.out.println("Rule 21-2 : 'ifstatement --> IF OPARAN expression CPARAN THEN compoundstmt ELSE compoundstmt'");};
//-------------
repeatstatement
:REPEAT statementlist UNTIL expression{System.out.println("Rule 22-1 : 'repeatstatement --> REPEAT statementlist UNTIL expression'");};|
 REPEAT UNTIL expression{System.out.println("Rule 22-2 : 'repeatstatement --> REPEAT UNTIL  expression'");};
//-------------
casestatement
:CASE expression OF caselist END{System.out.println("Rule 23-1 : 'casestatement --> CASE expression OF caselist END'");};
//-------------
caselist
:case{System.out.println("Rule 24-1 : 'caselist --> case'");};|
 case SEMICOLON caselist{System.out.println("Rule 24-2 : 'caselist --> case SEMICOLON caselist'");};
//-------------
case
:constantlist COLON compoundstmt{System.out.println("Rule 25-1 : 'case --> constantlist COLON compoundstmt'");};
//-------------
constantlist:
 //constant{System.out.println("Rule 26-1 : 'constantlist --> constant'");};|
 constant COMMA constantlist{System.out.println("Rule 26-2 : 'constantlist --> constant COMMA constantlist'");};|
 expression{System.out.println("Rule 26-3 : 'constantlist --> expression'");};
//-------------
expression
:expression LE expression{System.out.println("Rule 27-1 : 'expression --> expression LE expression'");};|
 expression GE expression{System.out.println("Rule 27-2 : 'expression --> expression GE expression'");};|
 expression L expression{System.out.println("Rule 27-3 : 'expression --> expression L expression'");};|
 expression G expression{System.out.println("Rule 27-4 : 'expression --> expression G expression'");};|
 expression NE expression{System.out.println("Rule 27-5 : 'expression --> expression NE expression'");};|
 expression EQ expression{System.out.println("Rule 27-6 : 'expression --> expression EQ expression'");};|
 expression SUM expression{System.out.println("Rule 27-7 : 'expression --> expression SUM expression'");};|
 expression MINUS expression{System.out.println("Rule 27-8 : 'expression --> expression MINUS expression'");};|
 expression OR expression{System.out.println("Rule 27-9 : 'expression --> expression OR expression'");};|
 expression MUL expression{System.out.println("Rule 27-10 : 'expression --> expression muL expression'");};|
 expression DIVINT expression{System.out.println("Rule 27-11 : 'expression --> expression DIVINT expression'");};|
 expression DIVREAL expression{System.out.println("Rule 27-12 : 'expression --> expression divreaL expression'");};|
 expression MOD expression{System.out.println("Rule 27-13 : 'expression --> expression MOD expression'");};|
 expression AND expression{System.out.println("Rule 27-14 : 'expression --> expression AND expression'");};|
 OPARAN expression CPARAN{System.out.println("Rule 27-15 : 'expression --> OPARAN expression CPARAN'");};|
 SUM expression %prec UNARY{System.out.println("Rule 27-16 : 'expression --> SUM expression'");};|
 MINUS expression %prec UNARY{System.out.println("Rule 27-17 : 'expression --> MINUS expression'");};|
 NOT expression {System.out.println("Rule 27-18 : 'expression --> NOT expression'");};|
//functioncall {System.out.println("Rule 27-19 : 'expression --> functioncall'");};|
 ID actuals{System.out.println("Rule 27-20 : 'expression --> ID actuals'");};|
 ID{System.out.println("Rule 27-21 : 'expression --> ID'");};|
 constant {System.out.println("Rule 27-22 : 'expression --> constant'");};|
 //variable {System.out.println("Rule 27-23 : 'expression --> variable'");};|
 variable OBRACKET expressionlist CBRACKET {System.out.println("Rule 27-24 : 'expression --> variable OBRACKET expressionlist CBRACKET'");};|
 variable INC {System.out.println("Rule 27-25 : 'expression --> variable inc'");};|
 variable DEC {System.out.println("Rule 27-26 : 'expression --> variable DEC'");};
 //TRUE {System.out.println("Rule 27-27 : 'expression --> true'");};|
 //FALSE {System.out.println("Rule 27-28 : 'expression --> false'");};
//-------------
functioncall
:ID actuals{System.out.println("Rule 28-1 : 'functioncalL --> ID actuals'");};|
 ID{System.out.println("Rule 28-2 : 'functioncalL --> ID'");};
//-------------
actuals
:OPARAN expressionlist CPARAN{System.out.println("Rule 29-1 : 'actuals --> OPARAN expressionlist CPARAN'");};
//-------------
expressionlist
:expression {System.out.println("Rule 30-1 : 'expressionlist --> expression'");};|
 expression COMMA expressionlist{System.out.println("Rule 30-2 : 'expressionlist --> expression COMMA expressionlist'");};
//-------------
variable
:ID {System.out.println("Rule 31-1 : 'variable --> ID'");};|
 variable OBRACKET expressionlist CBRACKET {System.out.println("Rule 31-2 : 'variable --> variable OBRACKET expressionlist CBRACKET'");};
//-------------
typespecifier
:INT{System.out.println("Rule 32-1 : 'typespecifier --> INT'");};|
 DOUBLE {System.out.println("Rule 32-2 : 'typespecifier --> DOUBLE '");};|
 BOOL{System.out.println("Rule 32-3 : 'typespecifier --> BOOL'");};|
 CHAR {System.out.println("Rule 32-4 : 'typespecifier --> CHAR '");};|
 ARRAY OBRACKET dimensionlist CBRACKET OF typespecifier{System.out.println("Rule 32-5 : 'typespecifier --> ARRAY OBRACKET dimensionlist CBRACKET OF typespecifier'");};
//-------------
idlist
:ID {System.out.println("Rule 33-1 : 'idlist --> ID'");};|
 ID COMMA idlist {System.out.println("Rule 33-2 : 'idlist --> ID COMMA idlist'");};
//-------------
dimensionlist
:dimension {System.out.println("Rule 34-1 : 'dimensionlist --> dimension'");};|
 dimension COMMA dimensionlist {System.out.println("Rule 34-2 : 'dimensionlist --> dimension COMMA dimensionlist'");};
//-------------
dimension
:INTCONSTANT {System.out.println("Rule 35-1 : 'dimension --> INTCONSTANT'");};
//-------------
constant
: INTCONSTANT {System.out.println("Rule 36-1 : 'constant --> INTCONSTANT'");};|
  DOUBLECONSTANT {System.out.println("Rule 36-2 : 'constant --> DOUBLECONSTANT'");};|
  TRUE {System.out.println("Rule 36-3 : 'constant --> TRUE'");};|
  FALSE {System.out.println("Rule 36-4 : 'constant --> FALSE'");};

%%
 class test {
	test(YYParser yyparser) throws IOException{
		yyparser.parse();
	};
}
