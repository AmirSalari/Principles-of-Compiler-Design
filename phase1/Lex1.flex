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
%{
      public static void main(String argv[]) throws java.io.IOException {	
		Yylex yy;	
		InputStream is = new FileInputStream("input.txt");	
		yy= new Yylex(new InputStreamReader(is));	
		//yy.createsymbol();
		yy.yylex();
    }
%}

letter = [a-zA-Z]
digit = [0-9]
nzero = [1-9]
E = [e]
ID = {letter}({letter}|{digit})*
constant = {digit}+([.]({digit}+))?({E}([+|-])?({digit})+)?
IntConstant = {nzero}{digit}*
StringConstant = ["]{letter|digit}*["]


%%
<YYINITIAL> {
"program"  {System.out.println("<'program','"+ yytext() +"', sym_ptr >");}
"procedure"  {System.out.println("<'proc_kw','"+ yytext() +"', sym_ptr >");} 
"function"  {System.out.println("<'func_kw','"+ yytext() +"', sym_ptr >");} 
"begin"  {System.out.println("<'begin','"+ yytext() +"', sym_ptr >");}
"end"  {System.out.println("<'end_kw','"+ yytext() +"', sym_ptr >");}
"for"  {System.out.println("<'for_kw','"+ yytext() +"', sym_ptr >");}
"if"  {System.out.println("<'if_kw','"+ yytext() +"', sym_ptr >");}
"then"  {System.out.println("<'then_kw','"+ yytext() +"', sym_ptr >");}
"else"  {System.out.println("<'else_kw','"+ yytext() +"', sym_ptr >");}
"repeat"  {System.out.println("<'repeat_kw','"+ yytext() +"', sym_ptr >");}
"until"  {System.out.println("<'until_kw','"+ yytext() +"', sym_ptr >");}
"case"  {System.out.println("<'case_kw','"+ yytext() +"', sym_ptr >");}
"of"  {System.out.println("<'of_kw','"+ yytext() +"', sym_ptr >");}

"," {System.out.println("<'comma_kw','"+ yytext() +"', sym_ptr >");}
":" {System.out.println("<'colon_kw','"+ yytext() +"', sym_ptr >");}
";" {System.out.println("<'semi_kw','"+ yytext() +"', sym_ptr >");}
":=" {System.out.println("<'assign_kw','"+ yytext() +"', sym_ptr >");}
"<=" {System.out.println("<'le_kw','"+ yytext() +"', sym_ptr >");} 
">=" {System.out.println("<'ge_kw','"+ yytext() +"', sym_ptr >");} 
">" {System.out.println("<'g_kw','"+ yytext() +"', sym_ptr >");} 
"<" {System.out.println("<'l_kw','"+ yytext() +"', sym_ptr >");}  
"<>" {System.out.println("<'ne_kw','"+ yytext() +"', sym_ptr >");}
"==" {System.out.println("<'eq_kw','"+ yytext() +"', sym_ptr >");}	
"++" {System.out.println("<'inc_kw','"+ yytext() +"', sym_ptr >");}  
"--" {System.out.println("<'dec_kw','"+ yytext() +"', sym_ptr >");} 
"*" {System.out.println("<'mul_kw','"+ yytext() +"', sym_ptr >");} 
"+" {System.out.println("<'sum_kw','"+ yytext() +"', sym_ptr >");} 
"-" {System.out.println("<'minus_kw','"+ yytext() +"', sym_ptr >");} 
"/" {System.out.println("<'divint_kw','"+ yytext() +"', sym_ptr >");} 
"(" {System.out.println("<'oParan','"+ yytext() +"', sym_ptr >");}  
")" {System.out.println("<'cParan','"+ yytext() +"', sym_ptr >");}  
"[" {System.out.println("<'oBracket','"+ yytext() +"', sym_ptr >");}  
"]" {System.out.println("<'cBracket','"+ yytext() +"', sym_ptr >");}  
"div" {System.out.println("<'divReal_kw','"+ yytext() +"', sym_ptr >");}
"mod" {System.out.println("<'mod_kw','"+ yytext() +"', sym_ptr >");} 

"and" {System.out.println("<'and_kw','"+ yytext() +"', sym_ptr >");}
"or" {System.out.println("<'or_kw','"+ yytext() +"', sym_ptr >");}
"not" {System.out.println("<'not_kw','"+ yytext() +"', sym_ptr >");}
"true" {System.out.println("<'true_kw','"+ yytext() +"', sym_ptr >");}
"false" {System.out.println("<'false_kw','"+ yytext() +"', sym_ptr >");}

"int" {System.out.println("<'int_kw','"+ yytext() +"', sym_ptr >");}
"double" {System.out.println("<'double_kw','"+ yytext() +"', sym_ptr >");}
"char" {System.out.println("<'char_kw','"+ yytext() +"', sym_ptr >");}
"array" {System.out.println("<'array_kw','"+ yytext() +"', sym_ptr >");}
"var" {System.out.println("<'var_kw','"+ yytext() +"', sym_ptr >");}
"const" {System.out.println("<'const','"+ yytext() +"', sym_ptr >");}

{digit} { System.out.println("<'digit','"+ yytext() +"', sym_ptr >");}
{ID} {System.out.println("<'ID','"+ yytext() +"', sym_ptr >");}
{IntConstant} {System.out.println("<'IntConstant','"+ yytext() +"', sym_ptr >");}
{constant} {System.out.println("<'constant','"+ yytext() +"', sym_ptr >");}
{StringConstant} {System.out.println("<'StringConstant','"+ yytext() +"', sym_ptr >");}  
[" "\t\n\r] {}

. {System.out.println("<'unknown'>") ;}


}