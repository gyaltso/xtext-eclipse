/*
 * generated by Xtext
 */
package org.eclipse.xtext.lexer.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BacktrackingLexerTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/eclipse/xtext/lexer/parser/antlr/internal/InternalBacktrackingLexerTestLanguageParser.tokens");
	}
}