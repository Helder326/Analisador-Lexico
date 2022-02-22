package src;

import java.io.IOException;
import java.io.StringReader;

public class TesteALex {
	public static void main(String[] args) throws IOException {
		
		String expr = "8 * 5  = 40";
		
		AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(expr));
		lexical.yylex();
	}
}