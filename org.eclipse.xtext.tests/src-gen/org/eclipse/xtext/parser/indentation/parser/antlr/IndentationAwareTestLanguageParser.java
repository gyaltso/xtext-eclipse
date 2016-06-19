/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.indentation.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.indentation.services.IndentationAwareTestLanguageGrammarAccess;

public class IndentationAwareTestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private IndentationAwareTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.antlr.runtime.TokenSource createLexer(org.antlr.runtime.CharStream stream) {
		return new org.eclipse.xtext.parser.indentation.parser.antlr.IndentationAwareTestLanguageTokenSource(super.createLexer(stream));
	}

	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected org.eclipse.xtext.parser.indentation.parser.antlr.internal.InternalIndentationAwareTestLanguageParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.parser.indentation.parser.antlr.internal.InternalIndentationAwareTestLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Tree";
	}
	
	public IndentationAwareTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IndentationAwareTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}