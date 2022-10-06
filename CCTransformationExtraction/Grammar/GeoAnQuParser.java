// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GeoAnQuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, WH=62, Location1=63, Location2=64, ConAm=65, AUX=66, 
		Flase=67, Aggregate=68, TOPO=69, Boolean=70, Extrema=71, Distance=72, 
		ExtreDist=73, Compare=74, ML=75, DIGIT=76, WS=77, COMMA=78;
	public static final int
		RULE_start = 0, RULE_false = 1, RULE_measure = 2, RULE_measure1 = 3, RULE_location = 4, 
		RULE_conAm = 5, RULE_weight = 6, RULE_allocation = 7, RULE_condition = 8, 
		RULE_grid = 9, RULE_distField = 10, RULE_serviceObj = 11, RULE_origin = 12, 
		RULE_destination = 13, RULE_subcon = 14, RULE_aggre = 15, RULE_topoR = 16, 
		RULE_topoRIn = 17, RULE_boolR = 18, RULE_extremaR = 19, RULE_distanceR = 20, 
		RULE_extreDist = 21, RULE_compareR = 22, RULE_quantity = 23, RULE_date = 24, 
		RULE_time = 25, RULE_percent = 26, RULE_densityNei = 27, RULE_distBandNei = 28, 
		RULE_distBand = 29, RULE_networkC = 30, RULE_objectC = 31, RULE_eventC = 32, 
		RULE_coreC = 33, RULE_support = 34, RULE_extent = 35, RULE_temEx = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "false", "measure", "measure1", "location", "conAm", "weight", 
			"allocation", "condition", "grid", "distField", "serviceObj", "origin", 
			"destination", "subcon", "aggre", "topoR", "topoRIn", "boolR", "extremaR", 
			"distanceR", "extreDist", "compareR", "quantity", "date", "time", "percent", 
			"densityNei", "distBandNei", "distBand", "networkC", "objectC", "eventC", 
			"coreC", "support", "extent", "temEx"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'that'", "'and'", "'with'", "'for each'", "'per'", "'in'", "'near'", 
			"'on'", "'from'", "'to'", "'of'", "'for'", "'each'", "'new'", "'through'", 
			"'by'", "'weighted by'", "'with similar'", "'best site'", "'best sites'", 
			"'grids'", "'grid cells'", "'grid'", "'grid cell'", "'hexagonal grids'", 
			"'hexagonal grid'", "'hexagon grid'", "'diameter of'", "'area'", "'buffer area'", 
			"'or'", "'equantity'", "'epercent'", "'edate'", "'etime'", "'circle'", 
			"'rectangle'", "'nearest neighbors'", "'distance band'", "'increments'", 
			"'network'", "'object'", "'placename'", "'event'", "'field'", "'objectquality'", 
			"'eventquality'", "'objconamount'", "'eveconamount'", "'conamount'", 
			"'covamount'", "'amount'", "'objconobjconpro'", "'eveconobjconpro'", 
			"'objconobjcovpro'", "'eveconobjcovpro'", "'conconpro'", "'concovpro'", 
			"'covpro'", "'proportion'", "'world'", null, "'where'", null, "'how many'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WH", "Location1", "Location2", "ConAm", "AUX", "Flase", 
			"Aggregate", "TOPO", "Boolean", "Extrema", "Distance", "ExtreDist", "Compare", 
			"ML", "DIGIT", "WS", "COMMA"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeoAnQuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Measure1Context measure1() {
			return getRuleContext(Measure1Context.class,0);
		}
		public SubconContext subcon() {
			return getRuleContext(SubconContext.class,0);
		}
		public SupportContext support() {
			return getRuleContext(SupportContext.class,0);
		}
		public List<TemExContext> temEx() {
			return getRuleContexts(TemExContext.class);
		}
		public TemExContext temEx(int i) {
			return getRuleContext(TemExContext.class,i);
		}
		public TerminalNode WH() { return getToken(GeoAnQuParser.WH, 0); }
		public MeasureContext measure() {
			return getRuleContext(MeasureContext.class,0);
		}
		public List<FalseContext> false_() {
			return getRuleContexts(FalseContext.class);
		}
		public FalseContext false_(int i) {
			return getRuleContext(FalseContext.class,i);
		}
		public List<ExtentContext> extent() {
			return getRuleContexts(ExtentContext.class);
		}
		public ExtentContext extent(int i) {
			return getRuleContext(ExtentContext.class,i);
		}
		public List<TerminalNode> AUX() { return getTokens(GeoAnQuParser.AUX); }
		public TerminalNode AUX(int i) {
			return getToken(GeoAnQuParser.AUX, i);
		}
		public ExtremaRContext extremaR() {
			return getRuleContext(ExtremaRContext.class,0);
		}
		public ExtreDistContext extreDist() {
			return getRuleContext(ExtreDistContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WH:
				{
				{
				setState(74);
				match(WH);
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AUX:
					{
					{
					setState(75);
					match(AUX);
					setState(78);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Extrema:
						{
						setState(76);
						extremaR();
						}
						break;
					case ExtreDist:
						{
						setState(77);
						extreDist();
						}
						break;
					case T__40:
					case T__41:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__57:
					case T__58:
					case T__59:
					case Location1:
					case Location2:
					case ConAm:
					case Aggregate:
					case DIGIT:
						break;
					default:
						break;
					}
					setState(80);
					measure();
					}
					}
					break;
				case T__40:
				case T__41:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case Location1:
				case Location2:
				case ConAm:
				case Aggregate:
				case DIGIT:
					{
					{
					setState(81);
					measure();
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AUX) {
						{
						setState(82);
						match(AUX);
						}
					}

					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(85);
						false_();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case T__40:
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Location1:
			case Location2:
			case ConAm:
			case Aggregate:
			case DIGIT:
				{
				{
				setState(90);
				measure();
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(91);
					match(T__0);
					}
					break;
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUX) {
					{
					setState(94);
					match(AUX);
					}
				}

				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(97);
					false_();
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					condition();
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(103);
						match(T__1);
						}
						break;
					case 2:
						{
						setState(104);
						false_();
						}
						break;
					}
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(112);
				measure1();
				}
			}

			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(115);
					match(T__2);
					}
					break;
				case T__0:
					{
					setState(116);
					match(T__0);
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AUX) {
						{
						setState(117);
						match(AUX);
						}
					}

					}
					break;
				case T__41:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case Flase:
				case TOPO:
				case Extrema:
				case Distance:
				case Compare:
					break;
				default:
					break;
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Flase) {
					{
					setState(122);
					false_();
					}
				}

				setState(125);
				subcon();
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				support();
				}
			}

			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(132);
				condition();
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5 || _la==T__6) {
						{
						setState(135);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(142); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(138);
							extent();
							setState(140);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__1) {
								{
								setState(139);
								match(T__1);
								}
							}

							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(144); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 17179870016L) != 0) {
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 832L) != 0) {
					{
					setState(151);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 832L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(154);
				temEx();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(155);
					match(T__9);
					}
				}

				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__33) {
					{
					setState(158);
					temEx();
					}
				}

				}
			}

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
	public static class FalseContext extends ParserRuleContext {
		public TerminalNode Flase() { return getToken(GeoAnQuParser.Flase, 0); }
		public FalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitFalse(this);
		}
	}

	public final FalseContext false_() throws RecognitionException {
		FalseContext _localctx = new FalseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_false);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(Flase);
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
	public static class MeasureContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ConAmContext conAm() {
			return getRuleContext(ConAmContext.class,0);
		}
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public AggreContext aggre() {
			return getRuleContext(AggreContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GeoAnQuParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GeoAnQuParser.DIGIT, i);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public List<DistBandNeiContext> distBandNei() {
			return getRuleContexts(DistBandNeiContext.class);
		}
		public DistBandNeiContext distBandNei(int i) {
			return getRuleContext(DistBandNeiContext.class,i);
		}
		public NetworkCContext networkC() {
			return getRuleContext(NetworkCContext.class,0);
		}
		public List<DestinationContext> destination() {
			return getRuleContexts(DestinationContext.class);
		}
		public DestinationContext destination(int i) {
			return getRuleContext(DestinationContext.class,i);
		}
		public List<OriginContext> origin() {
			return getRuleContexts(OriginContext.class);
		}
		public OriginContext origin(int i) {
			return getRuleContext(OriginContext.class,i);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_measure);
		int _la;
		try {
			int _alt;
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				location();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(166);
				conAm();
				setState(167);
				coreC();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Aggregate) {
					{
					setState(169);
					aggre();
					}
				}

				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(172);
					match(DIGIT);
					}
				}

				setState(179); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(175);
						coreC();
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__1) {
							{
							setState(176);
							match(T__1);
							}
						}

						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(181); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DIGIT) {
							{
							setState(184);
							match(DIGIT);
							}
						}

						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(187);
							match(T__12);
							}
						}

						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__13) {
							{
							setState(190);
							match(T__13);
							}
						}

						setState(195);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__41:
						case T__43:
						case T__44:
						case T__45:
						case T__46:
						case T__47:
						case T__48:
						case T__49:
						case T__50:
						case T__51:
						case T__52:
						case T__53:
						case T__54:
						case T__55:
						case T__56:
						case T__57:
						case T__58:
						case T__59:
							{
							setState(193);
							coreC();
							}
							break;
						case T__37:
							{
							setState(194);
							distBandNei();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__17) {
					{
					setState(202);
					weight();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Aggregate) {
					{
					setState(205);
					aggre();
					}
				}

				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__40:
					{
					setState(208);
					networkC();
					}
					break;
				case T__41:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
					{
					setState(209);
					coreC();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__9 || _la==T__14) {
							{
							setState(212);
							_la = _input.LA(1);
							if ( !(_la==T__9 || _la==T__14) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(215);
						destination();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(221);
							_la = _input.LA(1);
							if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6656L) != 0) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(224);
						origin();
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__9) {
							{
							setState(230);
							match(T__9);
							}
						}

						setState(233);
						destination();
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(239);
				coreC();
				setState(240);
				match(T__15);
				setState(241);
				networkC();
				}
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
	public static class Measure1Context extends ParserRuleContext {
		public CoreCContext coreC() {
			return getRuleContext(CoreCContext.class,0);
		}
		public Measure1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterMeasure1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitMeasure1(this);
		}
	}

	public final Measure1Context measure1() throws RecognitionException {
		Measure1Context _localctx = new Measure1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_measure1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__9);
			setState(246);
			coreC();
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
	public static class LocationContext extends ParserRuleContext {
		public TerminalNode Location1() { return getToken(GeoAnQuParser.Location1, 0); }
		public AllocationContext allocation() {
			return getRuleContext(AllocationContext.class,0);
		}
		public TerminalNode AUX() { return getToken(GeoAnQuParser.AUX, 0); }
		public FalseContext false_() {
			return getRuleContext(FalseContext.class,0);
		}
		public ExtremaRContext extremaR() {
			return getRuleContext(ExtremaRContext.class,0);
		}
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public TerminalNode Location2() { return getToken(GeoAnQuParser.Location2, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_location);
		int _la;
		try {
			int _alt;
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Location1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(248);
				match(Location1);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUX) {
					{
					setState(249);
					match(AUX);
					}
				}

				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Flase) {
					{
					setState(252);
					false_();
					}
				}

				setState(271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(255);
					allocation();
					}
					break;
				case T__41:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case Extrema:
					{
					{
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Extrema) {
						{
						setState(256);
						extremaR();
						}
					}

					setState(263); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(259);
							coreC();
							setState(261);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__1) {
								{
								setState(260);
								match(T__1);
								}
							}

							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(265); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(267);
						match(T__10);
						setState(268);
						coreC();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case Location2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Location2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ConAmContext extends ParserRuleContext {
		public TerminalNode ConAm() { return getToken(GeoAnQuParser.ConAm, 0); }
		public ConAmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conAm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterConAm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitConAm(this);
		}
	}

	public final ConAmContext conAm() throws RecognitionException {
		ConAmContext _localctx = new ConAmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conAm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ConAm);
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
	public static class WeightContext extends ParserRuleContext {
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public AggreContext aggre() {
			return getRuleContext(AggreContext.class,0);
		}
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitWeight(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_weight);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(278);
				match(T__16);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Aggregate) {
					{
					setState(279);
					aggre();
					}
				}

				setState(282);
				coreC();
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(283);
					match(T__10);
					setState(284);
					coreC();
					}
					break;
				}
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(287);
				match(T__17);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Aggregate) {
					{
					setState(288);
					aggre();
					}
				}

				setState(291);
				coreC();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AllocationContext extends ParserRuleContext {
		public CoreCContext coreC() {
			return getRuleContext(CoreCContext.class,0);
		}
		public AllocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterAllocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitAllocation(this);
		}
	}

	public final AllocationContext allocation() throws RecognitionException {
		AllocationContext _localctx = new AllocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_allocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(296);
				match(T__13);
				}
			}

			setState(299);
			coreC();
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
	public static class ConditionContext extends ParserRuleContext {
		public DistFieldContext distField() {
			return getRuleContext(DistFieldContext.class,0);
		}
		public ServiceObjContext serviceObj() {
			return getRuleContext(ServiceObjContext.class,0);
		}
		public TopoRContext topoR() {
			return getRuleContext(TopoRContext.class,0);
		}
		public ExtremaRContext extremaR() {
			return getRuleContext(ExtremaRContext.class,0);
		}
		public GridContext grid() {
			return getRuleContext(GridContext.class,0);
		}
		public DensityNeiContext densityNei() {
			return getRuleContext(DensityNeiContext.class,0);
		}
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public BoolRContext boolR() {
			return getRuleContext(BoolRContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public AggreContext aggre() {
			return getRuleContext(AggreContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PercentContext percent() {
			return getRuleContext(PercentContext.class,0);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public CompareRContext compareR() {
			return getRuleContext(CompareRContext.class,0);
		}
		public DistanceRContext distanceR() {
			return getRuleContext(DistanceRContext.class,0);
		}
		public TopoRInContext topoRIn() {
			return getRuleContext(TopoRInContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			int _alt;
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(303);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOPO:
					{
					setState(301);
					topoR();
					}
					break;
				case Extrema:
					{
					setState(302);
					extremaR();
					}
					break;
				case T__31:
				case T__32:
				case T__34:
					break;
				default:
					break;
				}
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(305);
					distField();
					}
					break;
				case 2:
					{
					setState(306);
					serviceObj();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(309);
				topoR();
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(310);
					grid();
					}
					break;
				case 2:
					{
					{
					setState(311);
					coreC();
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(312);
						match(T__10);
						setState(313);
						coreC();
						}
						break;
					}
					}
					}
					break;
				case 3:
					{
					setState(316);
					densityNei();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(319);
					match(T__2);
					}
				}

				setState(322);
				boolR();
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(323);
					match(T__8);
					}
					break;
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(326);
					match(DIGIT);
					}
				}

				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(329);
					extremaR();
					}
					break;
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Aggregate) {
					{
					setState(332);
					aggre();
					}
				}

				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(335);
					coreC();
					}
					break;
				}
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(338);
					date();
					}
					break;
				case 2:
					{
					setState(339);
					time();
					}
					break;
				case 3:
					{
					{
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(340);
						match(T__10);
						}
					}

					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Compare) {
						{
						setState(343);
						compareR();
						}
					}

					setState(348);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__31:
					case T__32:
						{
						setState(346);
						quantity();
						}
						break;
					case T__41:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__57:
					case T__58:
					case T__59:
						{
						setState(347);
						coreC();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				case 4:
					{
					setState(350);
					percent();
					}
					break;
				case 5:
					{
					{
					setState(351);
					match(T__10);
					setState(352);
					coreC();
					setState(353);
					match(T__9);
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(354);
							coreC();
							}
							} 
						}
						setState(359);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
					}
					}
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==T__10) {
					{
					setState(362);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==T__10) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(365);
				compareR();
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(366);
					quantity();
					}
					break;
				case 2:
					{
					setState(367);
					distField();
					}
					break;
				case 3:
					{
					{
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DIGIT) {
						{
						setState(368);
						match(DIGIT);
						}
					}

					setState(371);
					coreC();
					}
					}
					break;
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(376);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Extrema:
					{
					setState(374);
					extremaR();
					}
					break;
				case Distance:
					{
					setState(375);
					distanceR();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12) {
						{
						setState(378);
						match(T__12);
						}
					}

					setState(381);
					coreC();
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(382);
						match(T__10);
						setState(383);
						coreC();
						}
						break;
					}
					}
					break;
				}
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				topoRIn();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(389);
				date();
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
	public static class GridContext extends ParserRuleContext {
		public List<QuantityContext> quantity() {
			return getRuleContexts(QuantityContext.class);
		}
		public QuantityContext quantity(int i) {
			return getRuleContext(QuantityContext.class,i);
		}
		public GridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterGrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitGrid(this);
		}
	}

	public final GridContext grid() throws RecognitionException {
		GridContext _localctx = new GridContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_grid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31 || _la==T__32) {
				{
				setState(392);
				quantity();
				}
			}

			setState(395);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 266338304L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(396);
				match(T__2);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(397);
					match(T__27);
					}
				}

				setState(400);
				quantity();
				}
				break;
			}
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
	public static class DistFieldContext extends ParserRuleContext {
		public List<QuantityContext> quantity() {
			return getRuleContexts(QuantityContext.class);
		}
		public QuantityContext quantity(int i) {
			return getRuleContext(QuantityContext.class,i);
		}
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public List<ExtremaRContext> extremaR() {
			return getRuleContexts(ExtremaRContext.class);
		}
		public ExtremaRContext extremaR(int i) {
			return getRuleContext(ExtremaRContext.class,i);
		}
		public List<ExtreDistContext> extreDist() {
			return getRuleContexts(ExtreDistContext.class);
		}
		public ExtreDistContext extreDist(int i) {
			return getRuleContext(ExtreDistContext.class,i);
		}
		public DistFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDistField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDistField(this);
		}
	}

	public final DistFieldContext distField() throws RecognitionException {
		DistFieldContext _localctx = new DistFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_distField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(403);
					quantity();
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(404);
						match(T__1);
						}
						break;
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__28 || _la==T__29) {
						{
						setState(407);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(412); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__8 || _la==T__10) {
						{
						setState(414);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(419);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Extrema:
						{
						setState(417);
						extremaR();
						}
						break;
					case ExtreDist:
						{
						setState(418);
						extreDist();
						}
						break;
					case T__41:
					case T__43:
					case T__44:
					case T__45:
					case T__46:
					case T__47:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__57:
					case T__58:
					case T__59:
						break;
					default:
						break;
					}
					setState(421);
					coreC();
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(422);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
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
	public static class ServiceObjContext extends ParserRuleContext {
		public NetworkCContext networkC() {
			return getRuleContext(NetworkCContext.class,0);
		}
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public List<QuantityContext> quantity() {
			return getRuleContexts(QuantityContext.class);
		}
		public QuantityContext quantity(int i) {
			return getRuleContext(QuantityContext.class,i);
		}
		public ServiceObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterServiceObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitServiceObj(this);
		}
	}

	public final ServiceObjContext serviceObj() throws RecognitionException {
		ServiceObjContext _localctx = new ServiceObjContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_serviceObj);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(432);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__34:
						{
						setState(430);
						time();
						}
						break;
					case T__31:
					case T__32:
						{
						setState(431);
						quantity();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(434);
						match(T__1);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(439); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(441);
				match(T__10);
				}
				break;
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(444);
				networkC();
				}
			}

			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6656L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				origin();
				}
				break;
			}
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(451);
				match(T__9);
				setState(452);
				destination();
				}
				break;
			}
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
	public static class OriginContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public ExtremaRContext extremaR() {
			return getRuleContext(ExtremaRContext.class,0);
		}
		public ExtreDistContext extreDist() {
			return getRuleContext(ExtreDistContext.class,0);
		}
		public List<ObjectCContext> objectC() {
			return getRuleContexts(ObjectCContext.class);
		}
		public ObjectCContext objectC(int i) {
			return getRuleContext(ObjectCContext.class,i);
		}
		public List<EventCContext> eventC() {
			return getRuleContexts(EventCContext.class);
		}
		public EventCContext eventC(int i) {
			return getRuleContext(EventCContext.class,i);
		}
		public List<GridContext> grid() {
			return getRuleContexts(GridContext.class);
		}
		public GridContext grid(int i) {
			return getRuleContext(GridContext.class,i);
		}
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitOrigin(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_origin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(455);
				match(DIGIT);
				}
			}

			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extrema:
				{
				setState(458);
				extremaR();
				}
				break;
			case ExtreDist:
				{
				setState(459);
				extreDist();
				}
				break;
			case T__10:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__31:
			case T__32:
			case T__41:
			case T__42:
			case T__43:
				break;
			default:
				break;
			}
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(462);
				objectC();
				}
				break;
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(465);
				match(T__10);
				}
			}

			setState(471); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(471);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__41:
					case T__42:
						{
						setState(468);
						objectC();
						}
						break;
					case T__43:
						{
						setState(469);
						eventC();
						}
						break;
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__31:
					case T__32:
						{
						setState(470);
						grid();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(473); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public ExtremaRContext extremaR() {
			return getRuleContext(ExtremaRContext.class,0);
		}
		public ExtreDistContext extreDist() {
			return getRuleContext(ExtreDistContext.class,0);
		}
		public List<ObjectCContext> objectC() {
			return getRuleContexts(ObjectCContext.class);
		}
		public ObjectCContext objectC(int i) {
			return getRuleContext(ObjectCContext.class,i);
		}
		public List<EventCContext> eventC() {
			return getRuleContexts(EventCContext.class);
		}
		public EventCContext eventC(int i) {
			return getRuleContext(EventCContext.class,i);
		}
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDestination(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_destination);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(475);
				match(DIGIT);
				}
			}

			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extrema:
				{
				setState(478);
				extremaR();
				}
				break;
			case ExtreDist:
				{
				setState(479);
				extreDist();
				}
				break;
			case T__41:
			case T__42:
			case T__43:
				break;
			default:
				break;
			}
			setState(489); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(484);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__41:
					case T__42:
						{
						setState(482);
						objectC();
						}
						break;
					case T__43:
						{
						setState(483);
						eventC();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(486);
						match(T__1);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(491); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SubconContext extends ParserRuleContext {
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public CompareRContext compareR() {
			return getRuleContext(CompareRContext.class,0);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public TopoRContext topoR() {
			return getRuleContext(TopoRContext.class,0);
		}
		public ExtremaRContext extremaR() {
			return getRuleContext(ExtremaRContext.class,0);
		}
		public DistFieldContext distField() {
			return getRuleContext(DistFieldContext.class,0);
		}
		public ServiceObjContext serviceObj() {
			return getRuleContext(ServiceObjContext.class,0);
		}
		public DistanceRContext distanceR() {
			return getRuleContext(DistanceRContext.class,0);
		}
		public SubconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subcon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterSubcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitSubcon(this);
		}
	}

	public final SubconContext subcon() throws RecognitionException {
		SubconContext _localctx = new SubconContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subcon);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(493);
				coreC();
				setState(494);
				compareR();
				setState(495);
				quantity();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TOPO:
					{
					setState(497);
					topoR();
					}
					break;
				case Extrema:
					{
					setState(498);
					extremaR();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(501);
					distField();
					}
					break;
				case 2:
					{
					setState(502);
					serviceObj();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(505);
				topoR();
				setState(506);
				coreC();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(508);
				compareR();
				setState(509);
				coreC();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(511);
				distanceR();
				setState(512);
				coreC();
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(513);
					match(T__10);
					setState(514);
					coreC();
					}
					break;
				}
				}
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
	public static class AggreContext extends ParserRuleContext {
		public TerminalNode Aggregate() { return getToken(GeoAnQuParser.Aggregate, 0); }
		public AggreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterAggre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitAggre(this);
		}
	}

	public final AggreContext aggre() throws RecognitionException {
		AggreContext _localctx = new AggreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aggre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(Aggregate);
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
	public static class TopoRContext extends ParserRuleContext {
		public TerminalNode TOPO() { return getToken(GeoAnQuParser.TOPO, 0); }
		public TopoRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topoR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterTopoR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitTopoR(this);
		}
	}

	public final TopoRContext topoR() throws RecognitionException {
		TopoRContext _localctx = new TopoRContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_topoR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(TOPO);
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
	public static class TopoRInContext extends ParserRuleContext {
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public DensityNeiContext densityNei() {
			return getRuleContext(DensityNeiContext.class,0);
		}
		public TopoRInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topoRIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterTopoRIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitTopoRIn(this);
		}
	}

	public final TopoRInContext topoRIn() throws RecognitionException {
		TopoRInContext _localctx = new TopoRInContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_topoRIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__5);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
				{
				setState(524);
				coreC();
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(525);
					match(T__10);
					setState(526);
					coreC();
					}
					break;
				}
				}
				break;
			case T__31:
			case T__32:
				{
				setState(529);
				densityNei();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
	public static class BoolRContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(GeoAnQuParser.Boolean, 0); }
		public BoolRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterBoolR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitBoolR(this);
		}
	}

	public final BoolRContext boolR() throws RecognitionException {
		BoolRContext _localctx = new BoolRContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(Boolean);
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
	public static class ExtremaRContext extends ParserRuleContext {
		public TerminalNode Extrema() { return getToken(GeoAnQuParser.Extrema, 0); }
		public ExtremaRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extremaR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterExtremaR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitExtremaR(this);
		}
	}

	public final ExtremaRContext extremaR() throws RecognitionException {
		ExtremaRContext _localctx = new ExtremaRContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_extremaR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(Extrema);
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
	public static class DistanceRContext extends ParserRuleContext {
		public TerminalNode Distance() { return getToken(GeoAnQuParser.Distance, 0); }
		public DistanceRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distanceR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDistanceR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDistanceR(this);
		}
	}

	public final DistanceRContext distanceR() throws RecognitionException {
		DistanceRContext _localctx = new DistanceRContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_distanceR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(Distance);
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
	public static class ExtreDistContext extends ParserRuleContext {
		public TerminalNode ExtreDist() { return getToken(GeoAnQuParser.ExtreDist, 0); }
		public ExtreDistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extreDist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterExtreDist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitExtreDist(this);
		}
	}

	public final ExtreDistContext extreDist() throws RecognitionException {
		ExtreDistContext _localctx = new ExtreDistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_extreDist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(ExtreDist);
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
	public static class CompareRContext extends ParserRuleContext {
		public TerminalNode Compare() { return getToken(GeoAnQuParser.Compare, 0); }
		public CompareRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterCompareR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitCompareR(this);
		}
	}

	public final CompareRContext compareR() throws RecognitionException {
		CompareRContext _localctx = new CompareRContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compareR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(Compare);
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
	public static class QuantityContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitQuantity(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_quantity);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(542);
				match(T__31);
				setState(543);
				match(DIGIT);
				}
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(544);
				match(T__32);
				setState(545);
				match(DIGIT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DateContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__33);
			setState(549);
			match(DIGIT);
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
	public static class TimeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__34);
			setState(552);
			match(DIGIT);
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
	public static class PercentContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitPercent(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_percent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__32);
			setState(555);
			match(DIGIT);
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
	public static class DensityNeiContext extends ParserRuleContext {
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public DensityNeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densityNei; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDensityNei(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDensityNei(this);
		}
	}

	public final DensityNeiContext densityNei() throws RecognitionException {
		DensityNeiContext _localctx = new DensityNeiContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_densityNei);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			quantity();
			setState(558);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class DistBandNeiContext extends ParserRuleContext {
		public DistBandNeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distBandNei; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDistBandNei(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDistBandNei(this);
		}
	}

	public final DistBandNeiContext distBandNei() throws RecognitionException {
		DistBandNeiContext _localctx = new DistBandNeiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_distBandNei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(T__37);
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
	public static class DistBandContext extends ParserRuleContext {
		public List<QuantityContext> quantity() {
			return getRuleContexts(QuantityContext.class);
		}
		public QuantityContext quantity(int i) {
			return getRuleContext(QuantityContext.class,i);
		}
		public DistBandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distBand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterDistBand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitDistBand(this);
		}
	}

	public final DistBandContext distBand() throws RecognitionException {
		DistBandContext _localctx = new DistBandContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_distBand);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(562);
				quantity();
				setState(563);
				match(T__38);
				}
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(565);
				match(T__38);
				setState(566);
				quantity();
				setState(567);
				match(T__15);
				setState(568);
				quantity();
				setState(569);
				match(T__39);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class NetworkCContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public NetworkCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_networkC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterNetworkC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitNetworkC(this);
		}
	}

	public final NetworkCContext networkC() throws RecognitionException {
		NetworkCContext _localctx = new NetworkCContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_networkC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__40);
			setState(574);
			match(DIGIT);
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
	public static class ObjectCContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public ObjectCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterObjectC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitObjectC(this);
		}
	}

	public final ObjectCContext objectC() throws RecognitionException {
		ObjectCContext _localctx = new ObjectCContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectC);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(576);
				match(T__41);
				setState(577);
				match(DIGIT);
				}
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(578);
				match(T__42);
				setState(579);
				match(DIGIT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class EventCContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public EventCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterEventC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitEventC(this);
		}
	}

	public final EventCContext eventC() throws RecognitionException {
		EventCContext _localctx = new EventCContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T__43);
			setState(583);
			match(DIGIT);
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
	public static class CoreCContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public TerminalNode ML() { return getToken(GeoAnQuParser.ML, 0); }
		public CoreCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coreC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterCoreC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitCoreC(this);
		}
	}

	public final CoreCContext coreC() throws RecognitionException {
		CoreCContext _localctx = new CoreCContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_coreC);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(585);
				match(T__44);
				setState(586);
				match(DIGIT);
				setState(587);
				match(ML);
				}
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(588);
				match(T__41);
				setState(589);
				match(DIGIT);
				}
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(590);
				match(T__45);
				setState(591);
				match(DIGIT);
				setState(592);
				match(ML);
				}
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(593);
				match(T__43);
				setState(594);
				match(DIGIT);
				}
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(595);
				match(T__46);
				setState(596);
				match(DIGIT);
				setState(597);
				match(ML);
				}
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(598);
				match(T__47);
				setState(599);
				match(DIGIT);
				setState(600);
				match(ML);
				}
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(601);
				match(T__48);
				setState(602);
				match(DIGIT);
				setState(603);
				match(ML);
				}
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(604);
				match(T__49);
				setState(605);
				match(DIGIT);
				setState(606);
				match(ML);
				}
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(607);
				match(T__50);
				setState(608);
				match(DIGIT);
				setState(609);
				match(ML);
				}
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(610);
				match(T__51);
				setState(611);
				match(DIGIT);
				}
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(612);
				match(T__52);
				setState(613);
				match(DIGIT);
				setState(614);
				match(ML);
				}
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(615);
				match(T__53);
				setState(616);
				match(DIGIT);
				setState(617);
				match(ML);
				}
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(618);
				match(T__54);
				setState(619);
				match(DIGIT);
				setState(620);
				match(ML);
				}
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(621);
				match(T__55);
				setState(622);
				match(DIGIT);
				setState(623);
				match(ML);
				}
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(624);
				match(T__56);
				setState(625);
				match(DIGIT);
				setState(626);
				match(ML);
				}
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(627);
				match(T__57);
				setState(628);
				match(DIGIT);
				setState(629);
				match(ML);
				}
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(630);
				match(T__58);
				setState(631);
				match(DIGIT);
				setState(632);
				match(ML);
				}
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(633);
				match(T__59);
				setState(634);
				match(DIGIT);
				setState(635);
				match(ML);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SupportContext extends ParserRuleContext {
		public GridContext grid() {
			return getRuleContext(GridContext.class,0);
		}
		public List<CoreCContext> coreC() {
			return getRuleContexts(CoreCContext.class);
		}
		public CoreCContext coreC(int i) {
			return getRuleContext(CoreCContext.class,i);
		}
		public DistBandContext distBand() {
			return getRuleContext(DistBandContext.class,0);
		}
		public SupportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_support; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterSupport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitSupport(this);
		}
	}

	public final SupportContext support() throws RecognitionException {
		SupportContext _localctx = new SupportContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_support);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				grid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(639);
				coreC();
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(640);
					match(T__10);
					setState(641);
					coreC();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				distBand();
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
	public static class ExtentContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public ExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterExtent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitExtent(this);
		}
	}

	public final ExtentContext extent() throws RecognitionException {
		ExtentContext _localctx = new ExtentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_extent);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(647);
				match(T__42);
				setState(648);
				match(DIGIT);
				}
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(T__60);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class TemExContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GeoAnQuParser.DIGIT, 0); }
		public TemExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).enterTemEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeoAnQuListener ) ((GeoAnQuListener)listener).exitTemEx(this);
		}
	}

	public final TemExContext temEx() throws RecognitionException {
		TemExContext _localctx = new TemExContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_temEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__33);
			setState(653);
			match(DIGIT);
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

	public static final String _serializedATN =
		"\u0004\u0001N\u0290\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000O\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"T\b\u0000\u0001\u0000\u0003\u0000W\b\u0000\u0003\u0000Y\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000]\b\u0000\u0001\u0000\u0003\u0000`\b\u0000"+
		"\u0001\u0000\u0003\u0000c\b\u0000\u0003\u0000e\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000j\b\u0000\u0005\u0000l\b\u0000\n\u0000\f"+
		"\u0000o\t\u0000\u0001\u0000\u0003\u0000r\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000w\b\u0000\u0003\u0000y\b\u0000\u0001\u0000\u0003"+
		"\u0000|\b\u0000\u0001\u0000\u0003\u0000\u007f\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0083\b\u0000\u0001\u0000\u0003\u0000\u0086\b\u0000"+
		"\u0001\u0000\u0003\u0000\u0089\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u008d\b\u0000\u0004\u0000\u008f\b\u0000\u000b\u0000\f\u0000\u0090\u0005"+
		"\u0000\u0093\b\u0000\n\u0000\f\u0000\u0096\t\u0000\u0001\u0000\u0003\u0000"+
		"\u0099\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u009d\b\u0000\u0001"+
		"\u0000\u0003\u0000\u00a0\b\u0000\u0003\u0000\u00a2\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00ab\b\u0002\u0001\u0002\u0003\u0002\u00ae\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u00b2\b\u0002\u0004\u0002\u00b4\b\u0002"+
		"\u000b\u0002\f\u0002\u00b5\u0001\u0002\u0001\u0002\u0003\u0002\u00ba\b"+
		"\u0002\u0001\u0002\u0003\u0002\u00bd\b\u0002\u0001\u0002\u0003\u0002\u00c0"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00c4\b\u0002\u0005\u0002"+
		"\u00c6\b\u0002\n\u0002\f\u0002\u00c9\t\u0002\u0001\u0002\u0003\u0002\u00cc"+
		"\b\u0002\u0001\u0002\u0003\u0002\u00cf\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00d3\b\u0002\u0001\u0002\u0003\u0002\u00d6\b\u0002\u0001"+
		"\u0002\u0005\u0002\u00d9\b\u0002\n\u0002\f\u0002\u00dc\t\u0002\u0001\u0002"+
		"\u0003\u0002\u00df\b\u0002\u0001\u0002\u0005\u0002\u00e2\b\u0002\n\u0002"+
		"\f\u0002\u00e5\t\u0002\u0001\u0002\u0003\u0002\u00e8\b\u0002\u0001\u0002"+
		"\u0005\u0002\u00eb\b\u0002\n\u0002\f\u0002\u00ee\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f4\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00fb\b\u0004\u0001"+
		"\u0004\u0003\u0004\u00fe\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0102"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0106\b\u0004\u0004\u0004"+
		"\u0108\b\u0004\u000b\u0004\f\u0004\u0109\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u010e\b\u0004\u0003\u0004\u0110\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0113\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0119\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u011e\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0122\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0125\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u012a"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0130\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0134\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u013b\b\b\u0001\b\u0003\b\u013e\b\b\u0001\b\u0003\b\u0141\b\b\u0001"+
		"\b\u0001\b\u0003\b\u0145\b\b\u0001\b\u0003\b\u0148\b\b\u0001\b\u0003\b"+
		"\u014b\b\b\u0001\b\u0003\b\u014e\b\b\u0001\b\u0003\b\u0151\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0156\b\b\u0001\b\u0003\b\u0159\b\b\u0001\b\u0001"+
		"\b\u0003\b\u015d\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0164"+
		"\b\b\n\b\f\b\u0167\t\b\u0003\b\u0169\b\b\u0001\b\u0003\b\u016c\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0172\b\b\u0001\b\u0003\b\u0175\b\b"+
		"\u0001\b\u0001\b\u0003\b\u0179\b\b\u0001\b\u0003\b\u017c\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0181\b\b\u0003\b\u0183\b\b\u0001\b\u0001\b\u0003\b"+
		"\u0187\b\b\u0001\t\u0003\t\u018a\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u018f"+
		"\b\t\u0001\t\u0003\t\u0192\b\t\u0001\n\u0001\n\u0003\n\u0196\b\n\u0001"+
		"\n\u0003\n\u0199\b\n\u0004\n\u019b\b\n\u000b\n\f\n\u019c\u0001\n\u0003"+
		"\n\u01a0\b\n\u0001\n\u0001\n\u0003\n\u01a4\b\n\u0001\n\u0001\n\u0003\n"+
		"\u01a8\b\n\u0005\n\u01aa\b\n\n\n\f\n\u01ad\t\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01b1\b\u000b\u0001\u000b\u0003\u000b\u01b4\b\u000b\u0004"+
		"\u000b\u01b6\b\u000b\u000b\u000b\f\u000b\u01b7\u0001\u000b\u0003\u000b"+
		"\u01bb\b\u000b\u0001\u000b\u0003\u000b\u01be\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u01c2\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01c6"+
		"\b\u000b\u0001\f\u0003\f\u01c9\b\f\u0001\f\u0001\f\u0003\f\u01cd\b\f\u0001"+
		"\f\u0003\f\u01d0\b\f\u0001\f\u0003\f\u01d3\b\f\u0001\f\u0001\f\u0001\f"+
		"\u0004\f\u01d8\b\f\u000b\f\f\f\u01d9\u0001\r\u0003\r\u01dd\b\r\u0001\r"+
		"\u0001\r\u0003\r\u01e1\b\r\u0001\r\u0001\r\u0003\r\u01e5\b\r\u0001\r\u0003"+
		"\r\u01e8\b\r\u0004\r\u01ea\b\r\u000b\r\f\r\u01eb\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01f4\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01f8\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0204\b\u000e\u0003\u000e\u0206\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0210\b\u0011\u0001\u0011\u0003"+
		"\u0011\u0213\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0223\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u023c"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0245\b\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u027d\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0283\b\"\u0001"+
		"\"\u0003\"\u0286\b\"\u0001#\u0001#\u0001#\u0003#\u028b\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000"+
		"\u000e\u0001\u0000\u0004\u0005\u0001\u0000\u0006\u0007\u0002\u0000\u0006"+
		"\u0006\b\t\u0001\u0000\n\f\u0002\u0000\n\n\u000f\u000f\u0002\u0000\t\t"+
		"\u000b\f\u0001\u0000\u0013\u0014\u0001\u0000\u000b\f\u0002\u0000\u0003"+
		"\u0003\u000b\u000b\u0001\u0000\u0015\u001b\u0001\u0000\u001d\u001e\u0002"+
		"\u0000\t\t\u000b\u000b\u0002\u0000\u0002\u0002\u001f\u001f\u0001\u0000"+
		"$%\u030d\u0000d\u0001\u0000\u0000\u0000\u0002\u00a3\u0001\u0000\u0000"+
		"\u0000\u0004\u00f3\u0001\u0000\u0000\u0000\u0006\u00f5\u0001\u0000\u0000"+
		"\u0000\b\u0112\u0001\u0000\u0000\u0000\n\u0114\u0001\u0000\u0000\u0000"+
		"\f\u0124\u0001\u0000\u0000\u0000\u000e\u0126\u0001\u0000\u0000\u0000\u0010"+
		"\u0186\u0001\u0000\u0000\u0000\u0012\u0189\u0001\u0000\u0000\u0000\u0014"+
		"\u019a\u0001\u0000\u0000\u0000\u0016\u01b5\u0001\u0000\u0000\u0000\u0018"+
		"\u01c8\u0001\u0000\u0000\u0000\u001a\u01dc\u0001\u0000\u0000\u0000\u001c"+
		"\u0205\u0001\u0000\u0000\u0000\u001e\u0207\u0001\u0000\u0000\u0000 \u0209"+
		"\u0001\u0000\u0000\u0000\"\u020b\u0001\u0000\u0000\u0000$\u0214\u0001"+
		"\u0000\u0000\u0000&\u0216\u0001\u0000\u0000\u0000(\u0218\u0001\u0000\u0000"+
		"\u0000*\u021a\u0001\u0000\u0000\u0000,\u021c\u0001\u0000\u0000\u0000."+
		"\u0222\u0001\u0000\u0000\u00000\u0224\u0001\u0000\u0000\u00002\u0227\u0001"+
		"\u0000\u0000\u00004\u022a\u0001\u0000\u0000\u00006\u022d\u0001\u0000\u0000"+
		"\u00008\u0230\u0001\u0000\u0000\u0000:\u023b\u0001\u0000\u0000\u0000<"+
		"\u023d\u0001\u0000\u0000\u0000>\u0244\u0001\u0000\u0000\u0000@\u0246\u0001"+
		"\u0000\u0000\u0000B\u027c\u0001\u0000\u0000\u0000D\u0285\u0001\u0000\u0000"+
		"\u0000F\u028a\u0001\u0000\u0000\u0000H\u028c\u0001\u0000\u0000\u0000J"+
		"X\u0005>\u0000\u0000KN\u0005B\u0000\u0000LO\u0003&\u0013\u0000MO\u0003"+
		"*\u0015\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PY\u0003\u0004\u0002\u0000"+
		"QS\u0003\u0004\u0002\u0000RT\u0005B\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0003\u0002\u0001"+
		"\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XK\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000Ye\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\u0004\u0002\u0000[]\u0005\u0001\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^`\u0005B\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000ac\u0003\u0002\u0001\u0000ba\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000dJ\u0001"+
		"\u0000\u0000\u0000dZ\u0001\u0000\u0000\u0000em\u0001\u0000\u0000\u0000"+
		"fi\u0003\u0010\b\u0000gj\u0005\u0002\u0000\u0000hj\u0003\u0002\u0001\u0000"+
		"ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0003\u0006\u0003\u0000"+
		"qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r~\u0001\u0000\u0000"+
		"\u0000sy\u0005\u0003\u0000\u0000tv\u0005\u0001\u0000\u0000uw\u0005B\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0003\u0002\u0001\u0000"+
		"{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u007f\u0003\u001c\u000e\u0000~x\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0007\u0000\u0000\u0000\u0081\u0083\u0003D\"\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0003\u0010\b\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0094\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0007\u0001\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008e\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0003F#\u0000\u008b\u008d\u0005\u0002\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0088\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u00a1\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0007\u0002\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0003H$\u0000\u009b\u009d\u0005\n\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0003H$\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u0001\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005C\u0000"+
		"\u0000\u00a4\u0003\u0001\u0000\u0000\u0000\u00a5\u00f4\u0003\b\u0004\u0000"+
		"\u00a6\u00a7\u0003\n\u0005\u0000\u00a7\u00a8\u0003B!\u0000\u00a8\u00f4"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005L\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b3\u0001"+
		"\u0000\u0000\u0000\u00af\u00b1\u0003B!\u0000\u00b0\u00b2\u0005\u0002\u0000"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u0007\u0003\u0000\u0000\u00b8\u00ba\u0005L\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005\r\u0000\u0000\u00bc"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00c0\u0005\u000e\u0000\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c1\u00c4\u0003B!\u0000\u00c2\u00c4\u0003"+
		"8\u001c\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\f\u0006"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00f4\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003\u001e\u000f"+
		"\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003<\u001e\u0000"+
		"\u00d1\u00d3\u0003B!\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00da\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0007\u0004\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9"+
		"\u0003\u001a\r\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00e3\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0007\u0005\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0003\u0018\f\u0000\u00e1\u00de\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00ec\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e8\u0005\n\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00eb\u0003\u001a\r\u0000"+
		"\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f4\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0003B!\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1\u00f2"+
		"\u0003<\u001e\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00a6\u0001\u0000\u0000\u0000\u00f3\u00aa\u0001"+
		"\u0000\u0000\u0000\u00f3\u00ce\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f4\u0005\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\n\u0000\u0000\u00f6\u00f7\u0003B!\u0000\u00f7\u0007\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0005?\u0000\u0000\u00f9\u00fb\u0005B\u0000\u0000\u00fa"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fe\u0003\u0002\u0001\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u010f\u0001\u0000\u0000\u0000\u00ff\u0110\u0003\u000e\u0007\u0000\u0100"+
		"\u0102\u0003&\u0013\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0107\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0003B!\u0000\u0104\u0106\u0005\u0002\u0000\u0000\u0105\u0104\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u000b"+
		"\u0000\u0000\u010c\u010e\u0003B!\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000"+
		"\u010f\u00ff\u0001\u0000\u0000\u0000\u010f\u0101\u0001\u0000\u0000\u0000"+
		"\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u0113\u0005@\u0000\u0000\u0112"+
		"\u00f8\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\t\u0001\u0000\u0000\u0000\u0114\u0115\u0005A\u0000\u0000\u0115\u000b"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0005\u0011\u0000\u0000\u0117\u0119"+
		"\u0003\u001e\u000f\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d"+
		"\u0003B!\u0000\u011b\u011c\u0005\u000b\u0000\u0000\u011c\u011e\u0003B"+
		"!\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u0125\u0001\u0000\u0000\u0000\u011f\u0121\u0005\u0012\u0000"+
		"\u0000\u0120\u0122\u0003\u001e\u000f\u0000\u0121\u0120\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0003B!\u0000\u0124\u0116\u0001\u0000\u0000\u0000\u0124"+
		"\u011f\u0001\u0000\u0000\u0000\u0125\r\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0007\u0006\u0000\u0000\u0127\u0129\u0007\u0007\u0000\u0000\u0128\u012a"+
		"\u0005\u000e\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0003B!\u0000\u012c\u000f\u0001\u0000\u0000\u0000\u012d\u0130\u0003 "+
		"\u0010\u0000\u012e\u0130\u0003&\u0013\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u0134\u0003\u0014\n\u0000"+
		"\u0132\u0134\u0003\u0016\u000b\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0187\u0001\u0000\u0000\u0000"+
		"\u0135\u013d\u0003 \u0010\u0000\u0136\u013e\u0003\u0012\t\u0000\u0137"+
		"\u013a\u0003B!\u0000\u0138\u0139\u0005\u000b\u0000\u0000\u0139\u013b\u0003"+
		"B!\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013e\u00036\u001b\u0000"+
		"\u013d\u0136\u0001\u0000\u0000\u0000\u013d\u0137\u0001\u0000\u0000\u0000"+
		"\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u0187\u0001\u0000\u0000\u0000"+
		"\u013f\u0141\u0005\u0003\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0003$\u0012\u0000\u0143\u0145\u0005\t\u0000\u0000\u0144"+
		"\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0001\u0000\u0000\u0000\u0146\u0148\u0005L\u0000\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a"+
		"\u0001\u0000\u0000\u0000\u0149\u014b\u0003&\u0013\u0000\u014a\u0149\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0001"+
		"\u0000\u0000\u0000\u014c\u014e\u0003\u001e\u000f\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001"+
		"\u0000\u0000\u0000\u014f\u0151\u0003B!\u0000\u0150\u014f\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0168\u0001\u0000\u0000"+
		"\u0000\u0152\u0169\u00030\u0018\u0000\u0153\u0169\u00032\u0019\u0000\u0154"+
		"\u0156\u0005\u000b\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157"+
		"\u0159\u0003,\u0016\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u015d"+
		"\u0003.\u0017\u0000\u015b\u015d\u0003B!\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0169\u0001\u0000"+
		"\u0000\u0000\u015e\u0169\u00034\u001a\u0000\u015f\u0160\u0005\u000b\u0000"+
		"\u0000\u0160\u0161\u0003B!\u0000\u0161\u0165\u0005\n\u0000\u0000\u0162"+
		"\u0164\u0003B!\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0167\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u0152\u0001\u0000\u0000\u0000\u0168\u0153\u0001"+
		"\u0000\u0000\u0000\u0168\u0155\u0001\u0000\u0000\u0000\u0168\u015e\u0001"+
		"\u0000\u0000\u0000\u0168\u015f\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u0187\u0001\u0000\u0000\u0000\u016a\u016c\u0007"+
		"\b\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0174\u0003,\u0016"+
		"\u0000\u016e\u0175\u0003.\u0017\u0000\u016f\u0175\u0003\u0014\n\u0000"+
		"\u0170\u0172\u0005L\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173"+
		"\u0175\u0003B!\u0000\u0174\u016e\u0001\u0000\u0000\u0000\u0174\u016f\u0001"+
		"\u0000\u0000\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0175\u0187\u0001"+
		"\u0000\u0000\u0000\u0176\u0179\u0003&\u0013\u0000\u0177\u0179\u0003(\u0014"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u0182\u0001\u0000\u0000\u0000\u017a\u017c\u0005\r\u0000\u0000"+
		"\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0180\u0003B!\u0000\u017e\u017f"+
		"\u0005\u000b\u0000\u0000\u017f\u0181\u0003B!\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000"+
		"\u0000\u0000\u0182\u017b\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0187\u0001\u0000\u0000\u0000\u0184\u0187\u0003\"\u0011"+
		"\u0000\u0185\u0187\u00030\u0018\u0000\u0186\u012f\u0001\u0000\u0000\u0000"+
		"\u0186\u0135\u0001\u0000\u0000\u0000\u0186\u0140\u0001\u0000\u0000\u0000"+
		"\u0186\u016b\u0001\u0000\u0000\u0000\u0186\u0178\u0001\u0000\u0000\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0011\u0001\u0000\u0000\u0000\u0188\u018a\u0003.\u0017\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u0191\u0007\t\u0000\u0000\u018c\u018e"+
		"\u0005\u0003\u0000\u0000\u018d\u018f\u0005\u001c\u0000\u0000\u018e\u018d"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0192\u0003.\u0017\u0000\u0191\u018c\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0013\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0003.\u0017\u0000\u0194\u0196\u0005\u0002"+
		"\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0199\u0007\n\u0000"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0193\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u01ab\u0001\u0000\u0000"+
		"\u0000\u019e\u01a0\u0007\u000b\u0000\u0000\u019f\u019e\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a4\u0003&\u0013\u0000\u01a2\u01a4\u0003*\u0015\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a7\u0003B!\u0000\u01a6\u01a8\u0007\f\u0000\u0000\u01a7\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a9\u019f\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u0015\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b1\u00032\u0019\u0000\u01af\u01b1\u0003.\u0017"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b4\u0005\u0002\u0000"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bb\u0005\u000b\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bc\u01be\u0003<\u001e\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0007\u0005\u0000\u0000\u01c0\u01c2\u0003\u0018\f\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\n\u0000\u0000\u01c4\u01c6"+
		"\u0003\u001a\r\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u0017\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005"+
		"L\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01cd\u0003&\u0013"+
		"\u0000\u01cb\u01cd\u0003*\u0015\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01d0\u0003>\u001f\u0000\u01cf"+
		"\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d1\u01d3\u0005\u000b\u0000\u0000\u01d2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d4\u01d8\u0003>\u001f\u0000\u01d5\u01d8"+
		"\u0003@ \u0000\u01d6\u01d8\u0003\u0012\t\u0000\u01d7\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u0019\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0005L\u0000\u0000\u01dc\u01db\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000"+
		"\u0000\u01de\u01e1\u0003&\u0013\u0000\u01df\u01e1\u0003*\u0015\u0000\u01e0"+
		"\u01de\u0001\u0000\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e9\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e5\u0003>\u001f\u0000\u01e3\u01e5\u0003@ \u0000\u01e4\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e8\u0005\u0002\u0000\u0000\u01e7\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001"+
		"\u0000\u0000\u0000\u01e9\u01e4\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u001b\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003"+
		"B!\u0000\u01ee\u01ef\u0003,\u0016\u0000\u01ef\u01f0\u0003.\u0017\u0000"+
		"\u01f0\u0206\u0001\u0000\u0000\u0000\u01f1\u01f4\u0003 \u0010\u0000\u01f2"+
		"\u01f4\u0003&\u0013\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f8"+
		"\u0003\u0014\n\u0000\u01f6\u01f8\u0003\u0016\u000b\u0000\u01f7\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u0206\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0003 \u0010\u0000\u01fa\u01fb\u0003B!"+
		"\u0000\u01fb\u0206\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003,\u0016\u0000"+
		"\u01fd\u01fe\u0003B!\u0000\u01fe\u0206\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0003(\u0014\u0000\u0200\u0203\u0003B!\u0000\u0201\u0202\u0005\u000b"+
		"\u0000\u0000\u0202\u0204\u0003B!\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206\u0001\u0000\u0000\u0000"+
		"\u0205\u01ed\u0001\u0000\u0000\u0000\u0205\u01f3\u0001\u0000\u0000\u0000"+
		"\u0205\u01f9\u0001\u0000\u0000\u0000\u0205\u01fc\u0001\u0000\u0000\u0000"+
		"\u0205\u01ff\u0001\u0000\u0000\u0000\u0206\u001d\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0005D\u0000\u0000\u0208\u001f\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0005E\u0000\u0000\u020a!\u0001\u0000\u0000\u0000\u020b\u0212\u0005"+
		"\u0006\u0000\u0000\u020c\u020f\u0003B!\u0000\u020d\u020e\u0005\u000b\u0000"+
		"\u0000\u020e\u0210\u0003B!\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211"+
		"\u0213\u00036\u001b\u0000\u0212\u020c\u0001\u0000\u0000\u0000\u0212\u0211"+
		"\u0001\u0000\u0000\u0000\u0213#\u0001\u0000\u0000\u0000\u0214\u0215\u0005"+
		"F\u0000\u0000\u0215%\u0001\u0000\u0000\u0000\u0216\u0217\u0005G\u0000"+
		"\u0000\u0217\'\u0001\u0000\u0000\u0000\u0218\u0219\u0005H\u0000\u0000"+
		"\u0219)\u0001\u0000\u0000\u0000\u021a\u021b\u0005I\u0000\u0000\u021b+"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0005J\u0000\u0000\u021d-\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0005 \u0000\u0000\u021f\u0223\u0005L\u0000\u0000"+
		"\u0220\u0221\u0005!\u0000\u0000\u0221\u0223\u0005L\u0000\u0000\u0222\u021e"+
		"\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223/\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0005\"\u0000\u0000\u0225\u0226\u0005L"+
		"\u0000\u0000\u02261\u0001\u0000\u0000\u0000\u0227\u0228\u0005#\u0000\u0000"+
		"\u0228\u0229\u0005L\u0000\u0000\u02293\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0005!\u0000\u0000\u022b\u022c\u0005L\u0000\u0000\u022c5\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0003.\u0017\u0000\u022e\u022f\u0007\r\u0000"+
		"\u0000\u022f7\u0001\u0000\u0000\u0000\u0230\u0231\u0005&\u0000\u0000\u0231"+
		"9\u0001\u0000\u0000\u0000\u0232\u0233\u0003.\u0017\u0000\u0233\u0234\u0005"+
		"\'\u0000\u0000\u0234\u023c\u0001\u0000\u0000\u0000\u0235\u0236\u0005\'"+
		"\u0000\u0000\u0236\u0237\u0003.\u0017\u0000\u0237\u0238\u0005\u0010\u0000"+
		"\u0000\u0238\u0239\u0003.\u0017\u0000\u0239\u023a\u0005(\u0000\u0000\u023a"+
		"\u023c\u0001\u0000\u0000\u0000\u023b\u0232\u0001\u0000\u0000\u0000\u023b"+
		"\u0235\u0001\u0000\u0000\u0000\u023c;\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0005)\u0000\u0000\u023e\u023f\u0005L\u0000\u0000\u023f=\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0005*\u0000\u0000\u0241\u0245\u0005L\u0000\u0000"+
		"\u0242\u0243\u0005+\u0000\u0000\u0243\u0245\u0005L\u0000\u0000\u0244\u0240"+
		"\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245?\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0005,\u0000\u0000\u0247\u0248\u0005L\u0000"+
		"\u0000\u0248A\u0001\u0000\u0000\u0000\u0249\u024a\u0005-\u0000\u0000\u024a"+
		"\u024b\u0005L\u0000\u0000\u024b\u027d\u0005K\u0000\u0000\u024c\u024d\u0005"+
		"*\u0000\u0000\u024d\u027d\u0005L\u0000\u0000\u024e\u024f\u0005.\u0000"+
		"\u0000\u024f\u0250\u0005L\u0000\u0000\u0250\u027d\u0005K\u0000\u0000\u0251"+
		"\u0252\u0005,\u0000\u0000\u0252\u027d\u0005L\u0000\u0000\u0253\u0254\u0005"+
		"/\u0000\u0000\u0254\u0255\u0005L\u0000\u0000\u0255\u027d\u0005K\u0000"+
		"\u0000\u0256\u0257\u00050\u0000\u0000\u0257\u0258\u0005L\u0000\u0000\u0258"+
		"\u027d\u0005K\u0000\u0000\u0259\u025a\u00051\u0000\u0000\u025a\u025b\u0005"+
		"L\u0000\u0000\u025b\u027d\u0005K\u0000\u0000\u025c\u025d\u00052\u0000"+
		"\u0000\u025d\u025e\u0005L\u0000\u0000\u025e\u027d\u0005K\u0000\u0000\u025f"+
		"\u0260\u00053\u0000\u0000\u0260\u0261\u0005L\u0000\u0000\u0261\u027d\u0005"+
		"K\u0000\u0000\u0262\u0263\u00054\u0000\u0000\u0263\u027d\u0005L\u0000"+
		"\u0000\u0264\u0265\u00055\u0000\u0000\u0265\u0266\u0005L\u0000\u0000\u0266"+
		"\u027d\u0005K\u0000\u0000\u0267\u0268\u00056\u0000\u0000\u0268\u0269\u0005"+
		"L\u0000\u0000\u0269\u027d\u0005K\u0000\u0000\u026a\u026b\u00057\u0000"+
		"\u0000\u026b\u026c\u0005L\u0000\u0000\u026c\u027d\u0005K\u0000\u0000\u026d"+
		"\u026e\u00058\u0000\u0000\u026e\u026f\u0005L\u0000\u0000\u026f\u027d\u0005"+
		"K\u0000\u0000\u0270\u0271\u00059\u0000\u0000\u0271\u0272\u0005L\u0000"+
		"\u0000\u0272\u027d\u0005K\u0000\u0000\u0273\u0274\u0005:\u0000\u0000\u0274"+
		"\u0275\u0005L\u0000\u0000\u0275\u027d\u0005K\u0000\u0000\u0276\u0277\u0005"+
		";\u0000\u0000\u0277\u0278\u0005L\u0000\u0000\u0278\u027d\u0005K\u0000"+
		"\u0000\u0279\u027a\u0005<\u0000\u0000\u027a\u027b\u0005L\u0000\u0000\u027b"+
		"\u027d\u0005K\u0000\u0000\u027c\u0249\u0001\u0000\u0000\u0000\u027c\u024c"+
		"\u0001\u0000\u0000\u0000\u027c\u024e\u0001\u0000\u0000\u0000\u027c\u0251"+
		"\u0001\u0000\u0000\u0000\u027c\u0253\u0001\u0000\u0000\u0000\u027c\u0256"+
		"\u0001\u0000\u0000\u0000\u027c\u0259\u0001\u0000\u0000\u0000\u027c\u025c"+
		"\u0001\u0000\u0000\u0000\u027c\u025f\u0001\u0000\u0000\u0000\u027c\u0262"+
		"\u0001\u0000\u0000\u0000\u027c\u0264\u0001\u0000\u0000\u0000\u027c\u0267"+
		"\u0001\u0000\u0000\u0000\u027c\u026a\u0001\u0000\u0000\u0000\u027c\u026d"+
		"\u0001\u0000\u0000\u0000\u027c\u0270\u0001\u0000\u0000\u0000\u027c\u0273"+
		"\u0001\u0000\u0000\u0000\u027c\u0276\u0001\u0000\u0000\u0000\u027c\u0279"+
		"\u0001\u0000\u0000\u0000\u027dC\u0001\u0000\u0000\u0000\u027e\u0286\u0003"+
		"\u0012\t\u0000\u027f\u0282\u0003B!\u0000\u0280\u0281\u0005\u000b\u0000"+
		"\u0000\u0281\u0283\u0003B!\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000\u0000\u0284"+
		"\u0286\u0003:\u001d\u0000\u0285\u027e\u0001\u0000\u0000\u0000\u0285\u027f"+
		"\u0001\u0000\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286E\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0005+\u0000\u0000\u0288\u028b\u0005L\u0000"+
		"\u0000\u0289\u028b\u0005=\u0000\u0000\u028a\u0287\u0001\u0000\u0000\u0000"+
		"\u028a\u0289\u0001\u0000\u0000\u0000\u028bG\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0005\"\u0000\u0000\u028d\u028e\u0005L\u0000\u0000\u028eI\u0001"+
		"\u0000\u0000\u0000yNSVX\\_bdimqvx{~\u0082\u0085\u0088\u008c\u0090\u0094"+
		"\u0098\u009c\u009f\u00a1\u00aa\u00ad\u00b1\u00b5\u00b9\u00bc\u00bf\u00c3"+
		"\u00c7\u00cb\u00ce\u00d2\u00d5\u00da\u00de\u00e3\u00e7\u00ec\u00f3\u00fa"+
		"\u00fd\u0101\u0105\u0109\u010d\u010f\u0112\u0118\u011d\u0121\u0124\u0129"+
		"\u012f\u0133\u013a\u013d\u0140\u0144\u0147\u014a\u014d\u0150\u0155\u0158"+
		"\u015c\u0165\u0168\u016b\u0171\u0174\u0178\u017b\u0180\u0182\u0186\u0189"+
		"\u018e\u0191\u0195\u0198\u019c\u019f\u01a3\u01a7\u01ab\u01b0\u01b3\u01b7"+
		"\u01ba\u01bd\u01c1\u01c5\u01c8\u01cc\u01cf\u01d2\u01d7\u01d9\u01dc\u01e0"+
		"\u01e4\u01e7\u01eb\u01f3\u01f7\u0203\u0205\u020f\u0212\u0222\u023b\u0244"+
		"\u027c\u0282\u0285\u028a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}