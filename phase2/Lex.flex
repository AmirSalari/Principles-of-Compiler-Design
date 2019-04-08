import java.io.*;

class Yytoken {
  public int m_index;
  public String m_text;
  public int m_line;
  public int m_charBegin;
  public int m_charEnd;
  Yytoken 
    (
     int index,
     String text,
     int line,
     int charBegin,
     int charEnd
     )
      {
	m_index = index;
	m_text = new String(text);
	m_line = line;
	m_charBegin = charBegin;
	m_charEnd = charEnd;
      }

  public String toString() {
      return "Token #"+m_index+": "+m_text+" (line "+m_line+")";
  }
}

%%

%byaccj
letter = [a-zA-Z]
digit = [0-9]
nzero = [1-9]
E = [e]
ID = {letter}({letter}|{digit})*
doubleconstant = {digit}+([.]({digit}+))?({E}([+|-])?({digit})+)?
IntConstant = {nzero}{digit}*

%%
<YYINITIAL> {
"program"  {return YYParser.PROGRAM;}
"procedure"  {return YYParser.PROCEDURE;} 
"function"  {return YYParser.FUNCTION;} 
"begin"  {return YYParser.BEGIN;}
"end"  {return YYParser.END;}
"for"  {return YYParser.FOR;}
"if"  {return YYParser.IF;}
"then"  {return YYParser.THEN;}
"else"  {return YYParser.ELSE;}
"repeat"  {return YYParser.REPEAT;}
"until"  {return YYParser.UNTIL;}
"case"  {return YYParser.CASE;}
"of"  {return YYParser.OF;}

"." {return YYParser.DOT;}
"," {return YYParser.COMMA;}
":" {return YYParser.COLON;}
";" {return YYParser.SEMICOLON;}
":=" {return YYParser.ASSIGN;}
"<=" {return YYParser.LE;} 
">=" {return YYParser.GE;} 
">" {return YYParser.G;} 
"<" {return YYParser.L;}  
"<>" {return YYParser.NE;}
"==" {return YYParser.EQ;}	
"++" {return YYParser.INC;}  
"--" {return YYParser.DEC;} 
"*" {return YYParser.MUL;} 
"+" {return YYParser.SUM;} 
"-" {return YYParser.MINUS;} 
"/" {return YYParser.DIVINT;} 
"(" {return YYParser.OPARAN;}  
")" {return YYParser.CPARAN;}  
"[" {return YYParser.OBRACKET;}  
"]" {return YYParser.CBRACKET;}  
"div" {return YYParser.DIVREAL;}
"mod" {return YYParser.MOD;} 

"and" {return YYParser.AND;}
"or" {return YYParser.OR;}
"not" {return YYParser.NOT;}
"true" {return YYParser.TRUE;}
"false" {return YYParser.FALSE;}

"int" {return YYParser.INT;}
"double" {return YYParser.DOUBLE;}
"char" {return YYParser.CHAR;}
"bool" {return YYParser.BOOL;}
"array" {return YYParser.ARRAY;}
"var" {return YYParser.VAR;}
"const" {return YYParser.CONST;}


{ID} {return YYParser.ID;}
{IntConstant} {return YYParser.INTCONSTANT;}
{doubleconstant} {return YYParser.DOUBLECONSTANT;}
[" "\t\n\r] {;}

. {;}


}
