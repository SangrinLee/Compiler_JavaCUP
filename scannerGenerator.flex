import java_cup.runtime.*;
%%

%class MyScanner
%cup

IDENTIFIER = [a-zA-Z][a-zA-z0-9_]*
NUMBER = [0-9]+

%%

<YYINITIAL> {
	"+"		{ return new Symbol(sym.PLUS, yytext()); }
	"*" 		{ return new Symbol(sym.MULTI, yytext()); }
	"="		{ return new Symbol(sym.EQUAL, yytext()); }
	";"		{ return new Symbol(sym.SEMI, yytext()); }
	"("		{ return new Symbol(sym.LPAREN, yytext()); }
	")" 		{ return new Symbol(sym.RPAREN, yytext()); }
	{IDENTIFIER}	{ return new Symbol(sym.ID, yytext()); }
	{NUMBER} 	{ return new Symbol(sym.NUMBER, new Integer(yytext())); }
	\n 		{ }
	. 		{ }
}

	