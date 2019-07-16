# Compiler
Compiler Design course - Final project
Project of Compiler Design Course (BSc)

Base input grammer is in the repository.

Use JFlex to process "SHLang.lex". Outputs: -Yylex.java

Use this command with bison to process "SHLang.yac" Command: bison -L JAVA SHLang.yac -v -v will generate *.output file. Outputs: -SHLang.cac (Rename this to "SHLang.java") -SHLang.output (It's optional output made by bison. This file can be generated with -v option.)

Build Yylex.java and SHLang.java (Rename *.cac output of bison to *.java).

File address of input and output codes are hard coded in first lines of SHLang.java.

Compile output.c file with GCC.
