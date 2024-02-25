package org.asiql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class asiqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AND=3, OR=4, IS=5, NOT=6, SINCE=7, UNTIL=8, EQUALS=9, 
		GREATER_THAN=10, LESS_THAN=11, COMMA=12, QUOTE=13, LBRACKET=14, RBRACKET=15, 
		ID=16, INT=17, DATE=18, DECIMAL=19, STR=20, WS=21;
	public static final int
		RULE_root = 0, RULE_identifier = 1, RULE_const = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "identifier", "const", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'and'", "'or'", "'is'", "'not'", "'since'", "'until'", 
			"'='", "'>'", "'<'", "','", "'\"'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AND", "OR", "IS", "NOT", "SINCE", "UNTIL", "EQUALS", 
			"GREATER_THAN", "LESS_THAN", "COMMA", "QUOTE", "LBRACKET", "RBRACKET", 
			"ID", "INT", "DATE", "DECIMAL", "STR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "asiql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asiqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(asiqlParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			expr(0);
			setState(9);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(asiqlParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ParserRuleContext {
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
	 
		public ConstContext() { }
		public void copyFrom(ConstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStringConstantContext extends ConstContext {
		public List<TerminalNode> STR() { return getTokens(asiqlParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(asiqlParser.STR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(asiqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(asiqlParser.COMMA, i);
		}
		public ArrayStringConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterArrayStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitArrayStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitArrayStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDecimalConstantContext extends ConstContext {
		public List<TerminalNode> DECIMAL() { return getTokens(asiqlParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(asiqlParser.DECIMAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(asiqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(asiqlParser.COMMA, i);
		}
		public ArrayDecimalConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterArrayDecimalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitArrayDecimalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitArrayDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantContext extends ConstContext {
		public TerminalNode STR() { return getToken(asiqlParser.STR, 0); }
		public StringConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalConstantContext extends ConstContext {
		public TerminalNode DECIMAL() { return getToken(asiqlParser.DECIMAL, 0); }
		public DecimalConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterDecimalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitDecimalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DateConstantContext extends ConstContext {
		public TerminalNode DATE() { return getToken(asiqlParser.DATE, 0); }
		public DateConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterDateConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitDateConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitDateConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIntegerConstantContext extends ConstContext {
		public List<TerminalNode> INT() { return getTokens(asiqlParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(asiqlParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(asiqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(asiqlParser.COMMA, i);
		}
		public ArrayIntegerConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterArrayIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitArrayIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitArrayIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerConstantContext extends ConstContext {
		public TerminalNode INT() { return getToken(asiqlParser.INT, 0); }
		public IntegerConstantContext(ConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const_() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_const);
		try {
			int _alt;
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new IntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(INT);
				}
				break;
			case 2:
				_localctx = new StringConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(STR);
				}
				break;
			case 3:
				_localctx = new DecimalConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(DECIMAL);
				}
				break;
			case 4:
				_localctx = new DateConstantContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				match(DATE);
				}
				break;
			case 5:
				_localctx = new ArrayIntegerConstantContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(17);
				match(INT);
				setState(20); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(18);
						match(COMMA);
						setState(19);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(22); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				_localctx = new ArrayStringConstantContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(24);
				match(STR);
				setState(27); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(25);
						match(COMMA);
						setState(26);
						match(STR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(29); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				_localctx = new ArrayDecimalConstantContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(31);
				match(DECIMAL);
				setState(34); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(32);
						match(COMMA);
						setState(33);
						match(DECIMAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(36); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationExpressionContext extends ExprContext {
		public TerminalNode NOT() { return getToken(asiqlParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterNegationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitNegationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionContext extends ExprContext {
		public ExprContext left;
		public Token conjunction;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(asiqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(asiqlParser.OR, 0); }
		public InfixExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterInfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitInfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExprContext {
		public IdentifierContext left;
		public Token function;
		public ConstContext right;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstContext const_() {
			return getRuleContext(ConstContext.class,0);
		}
		public TerminalNode IS() { return getToken(asiqlParser.IS, 0); }
		public TerminalNode SINCE() { return getToken(asiqlParser.SINCE, 0); }
		public TerminalNode UNTIL() { return getToken(asiqlParser.UNTIL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(asiqlParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(asiqlParser.LESS_THAN, 0); }
		public FunctionExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asiqlListener ) ((asiqlListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asiqlVisitor ) return ((asiqlVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				((FunctionExpressionContext)_localctx).left = identifier();
				setState(42);
				((FunctionExpressionContext)_localctx).function = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3488L) != 0)) ) {
					((FunctionExpressionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				((FunctionExpressionContext)_localctx).right = const_();
				}
				break;
			case T__0:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__0);
				setState(46);
				expr(0);
				setState(47);
				match(T__1);
				}
				break;
			case NOT:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(NOT);
				setState(50);
				expr(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExpressionContext(new ExprContext(_parentctx, _parentState));
					((InfixExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(53);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(54);
					((InfixExpressionContext)_localctx).conjunction = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((InfixExpressionContext)_localctx).conjunction = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(55);
					((InfixExpressionContext)_localctx).right = expr(2);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u0015\b\u0002\u000b"+
		"\u0002\f\u0002\u0016\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002\u001c"+
		"\b\u0002\u000b\u0002\f\u0002\u001d\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002#\b\u0002\u000b\u0002\f\u0002$\u0003\u0002\'\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00034\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00039\b\u0003\n\u0003"+
		"\f\u0003<\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0002\u0003\u0000\u0005\u0005\u0007\b\n\u000b\u0001\u0000"+
		"\u0003\u0004E\u0000\b\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000"+
		"\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000"+
		"\b\t\u0003\u0006\u0003\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0005\u0010\u0000\u0000\f\u0003\u0001\u0000"+
		"\u0000\u0000\r\'\u0005\u0011\u0000\u0000\u000e\'\u0005\u0014\u0000\u0000"+
		"\u000f\'\u0005\u0013\u0000\u0000\u0010\'\u0005\u0012\u0000\u0000\u0011"+
		"\u0014\u0005\u0011\u0000\u0000\u0012\u0013\u0005\f\u0000\u0000\u0013\u0015"+
		"\u0005\u0011\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\'\u0001\u0000\u0000\u0000\u0018\u001b\u0005"+
		"\u0014\u0000\u0000\u0019\u001a\u0005\f\u0000\u0000\u001a\u001c\u0005\u0014"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e\'\u0001\u0000\u0000\u0000\u001f\"\u0005\u0013\u0000"+
		"\u0000 !\u0005\f\u0000\u0000!#\u0005\u0013\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000&\r\u0001\u0000\u0000\u0000"+
		"&\u000e\u0001\u0000\u0000\u0000&\u000f\u0001\u0000\u0000\u0000&\u0010"+
		"\u0001\u0000\u0000\u0000&\u0011\u0001\u0000\u0000\u0000&\u0018\u0001\u0000"+
		"\u0000\u0000&\u001f\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000"+
		"\u0000()\u0006\u0003\uffff\uffff\u0000)*\u0003\u0002\u0001\u0000*+\u0007"+
		"\u0000\u0000\u0000+,\u0003\u0004\u0002\u0000,4\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0001\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0005\u0002\u0000"+
		"\u000004\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u000024\u0003\u0006"+
		"\u0003\u00023(\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u00004:\u0001\u0000\u0000\u000056\n\u0001\u0000\u000067\u0007"+
		"\u0001\u0000\u000079\u0003\u0006\u0003\u000285\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;\u0007\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000\u0006"+
		"\u0016\u001d$&3:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}