package fr.unice.polytech.idm.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.idm.xtext.services.SmartHomeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartHomeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SmartHome'", "'{'", "'sensorTypes'", "','", "'}'", "'rules'", "'Location'", "'analog'", "'boolean'", "'IntegerSensor'", "'('", "')'", "'BooleanSensor'", "'if'", "'and'", "'for'", "'then'", "'true'", "'false'", "'='", "'<'", "'>'", "'is'", "'isnot'", "'min'", "'s'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmartHomeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartHomeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartHomeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartHomeDSL.g"; }



     	private SmartHomeDSLGrammarAccess grammarAccess;

        public InternalSmartHomeDSLParser(TokenStream input, SmartHomeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmartHome";
       	}

       	@Override
       	protected SmartHomeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmartHome"
    // InternalSmartHomeDSL.g:65:1: entryRuleSmartHome returns [EObject current=null] : iv_ruleSmartHome= ruleSmartHome EOF ;
    public final EObject entryRuleSmartHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartHome = null;


        try {
            // InternalSmartHomeDSL.g:65:50: (iv_ruleSmartHome= ruleSmartHome EOF )
            // InternalSmartHomeDSL.g:66:2: iv_ruleSmartHome= ruleSmartHome EOF
            {
             newCompositeNode(grammarAccess.getSmartHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartHome=ruleSmartHome();

            state._fsp--;

             current =iv_ruleSmartHome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartHome"


    // $ANTLR start "ruleSmartHome"
    // InternalSmartHomeDSL.g:72:1: ruleSmartHome returns [EObject current=null] : (otherlv_0= 'SmartHome' otherlv_1= '{' otherlv_2= 'sensorTypes' otherlv_3= '{' ( (lv_sensorTypes_4_0= ruleSensorType ) ) (otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) ) )* otherlv_7= '}' ( (lv_locations_8_0= ruleLocation ) ) (otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) ) )* otherlv_11= 'rules' otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) ) (otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleSmartHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_sensorTypes_4_0 = null;

        EObject lv_sensorTypes_6_0 = null;

        EObject lv_locations_8_0 = null;

        EObject lv_locations_10_0 = null;

        EObject lv_rules_13_0 = null;

        EObject lv_rules_15_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:78:2: ( (otherlv_0= 'SmartHome' otherlv_1= '{' otherlv_2= 'sensorTypes' otherlv_3= '{' ( (lv_sensorTypes_4_0= ruleSensorType ) ) (otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) ) )* otherlv_7= '}' ( (lv_locations_8_0= ruleLocation ) ) (otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) ) )* otherlv_11= 'rules' otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) ) (otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalSmartHomeDSL.g:79:2: (otherlv_0= 'SmartHome' otherlv_1= '{' otherlv_2= 'sensorTypes' otherlv_3= '{' ( (lv_sensorTypes_4_0= ruleSensorType ) ) (otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) ) )* otherlv_7= '}' ( (lv_locations_8_0= ruleLocation ) ) (otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) ) )* otherlv_11= 'rules' otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) ) (otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalSmartHomeDSL.g:79:2: (otherlv_0= 'SmartHome' otherlv_1= '{' otherlv_2= 'sensorTypes' otherlv_3= '{' ( (lv_sensorTypes_4_0= ruleSensorType ) ) (otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) ) )* otherlv_7= '}' ( (lv_locations_8_0= ruleLocation ) ) (otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) ) )* otherlv_11= 'rules' otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) ) (otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalSmartHomeDSL.g:80:3: otherlv_0= 'SmartHome' otherlv_1= '{' otherlv_2= 'sensorTypes' otherlv_3= '{' ( (lv_sensorTypes_4_0= ruleSensorType ) ) (otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) ) )* otherlv_7= '}' ( (lv_locations_8_0= ruleLocation ) ) (otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) ) )* otherlv_11= 'rules' otherlv_12= '{' ( (lv_rules_13_0= ruleRule ) ) (otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSmartHomeAccess().getSmartHomeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSmartHomeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSmartHomeAccess().getSensorTypesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSmartHomeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartHomeDSL.g:96:3: ( (lv_sensorTypes_4_0= ruleSensorType ) )
            // InternalSmartHomeDSL.g:97:4: (lv_sensorTypes_4_0= ruleSensorType )
            {
            // InternalSmartHomeDSL.g:97:4: (lv_sensorTypes_4_0= ruleSensorType )
            // InternalSmartHomeDSL.g:98:5: lv_sensorTypes_4_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getSmartHomeAccess().getSensorTypesSensorTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_sensorTypes_4_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartHomeRule());
            					}
            					add(
            						current,
            						"sensorTypes",
            						lv_sensorTypes_4_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:115:3: (otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmartHomeDSL.g:116:4: otherlv_5= ',' ( (lv_sensorTypes_6_0= ruleSensorType ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSmartHomeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalSmartHomeDSL.g:120:4: ( (lv_sensorTypes_6_0= ruleSensorType ) )
            	    // InternalSmartHomeDSL.g:121:5: (lv_sensorTypes_6_0= ruleSensorType )
            	    {
            	    // InternalSmartHomeDSL.g:121:5: (lv_sensorTypes_6_0= ruleSensorType )
            	    // InternalSmartHomeDSL.g:122:6: lv_sensorTypes_6_0= ruleSensorType
            	    {

            	    						newCompositeNode(grammarAccess.getSmartHomeAccess().getSensorTypesSensorTypeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_sensorTypes_6_0=ruleSensorType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartHomeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensorTypes",
            	    							lv_sensorTypes_6_0,
            	    							"fr.unice.polytech.idm.xtext.SmartHomeDSL.SensorType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getSmartHomeAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalSmartHomeDSL.g:144:3: ( (lv_locations_8_0= ruleLocation ) )
            // InternalSmartHomeDSL.g:145:4: (lv_locations_8_0= ruleLocation )
            {
            // InternalSmartHomeDSL.g:145:4: (lv_locations_8_0= ruleLocation )
            // InternalSmartHomeDSL.g:146:5: lv_locations_8_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getSmartHomeAccess().getLocationsLocationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_locations_8_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartHomeRule());
            					}
            					add(
            						current,
            						"locations",
            						lv_locations_8_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:163:3: (otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartHomeDSL.g:164:4: otherlv_9= ',' ( (lv_locations_10_0= ruleLocation ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSmartHomeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalSmartHomeDSL.g:168:4: ( (lv_locations_10_0= ruleLocation ) )
            	    // InternalSmartHomeDSL.g:169:5: (lv_locations_10_0= ruleLocation )
            	    {
            	    // InternalSmartHomeDSL.g:169:5: (lv_locations_10_0= ruleLocation )
            	    // InternalSmartHomeDSL.g:170:6: lv_locations_10_0= ruleLocation
            	    {

            	    						newCompositeNode(grammarAccess.getSmartHomeAccess().getLocationsLocationParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_locations_10_0=ruleLocation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartHomeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"locations",
            	    							lv_locations_10_0,
            	    							"fr.unice.polytech.idm.xtext.SmartHomeDSL.Location");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSmartHomeAccess().getRulesKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getSmartHomeAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSmartHomeDSL.g:196:3: ( (lv_rules_13_0= ruleRule ) )
            // InternalSmartHomeDSL.g:197:4: (lv_rules_13_0= ruleRule )
            {
            // InternalSmartHomeDSL.g:197:4: (lv_rules_13_0= ruleRule )
            // InternalSmartHomeDSL.g:198:5: lv_rules_13_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getSmartHomeAccess().getRulesRuleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_6);
            lv_rules_13_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartHomeRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_13_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:215:3: (otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartHomeDSL.g:216:4: otherlv_14= ',' ( (lv_rules_15_0= ruleRule ) )
            	    {
            	    otherlv_14=(Token)match(input,14,FOLLOW_9); 

            	    				newLeafNode(otherlv_14, grammarAccess.getSmartHomeAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalSmartHomeDSL.g:220:4: ( (lv_rules_15_0= ruleRule ) )
            	    // InternalSmartHomeDSL.g:221:5: (lv_rules_15_0= ruleRule )
            	    {
            	    // InternalSmartHomeDSL.g:221:5: (lv_rules_15_0= ruleRule )
            	    // InternalSmartHomeDSL.g:222:6: lv_rules_15_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getSmartHomeAccess().getRulesRuleParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rules_15_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSmartHomeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_15_0,
            	    							"fr.unice.polytech.idm.xtext.SmartHomeDSL.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_16=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getSmartHomeAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getSmartHomeAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartHome"


    // $ANTLR start "entryRuleLocation"
    // InternalSmartHomeDSL.g:252:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalSmartHomeDSL.g:252:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalSmartHomeDSL.g:253:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalSmartHomeDSL.g:259:1: ruleLocation returns [EObject current=null] : ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sensors_4_0 = null;

        EObject lv_sensors_6_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:265:2: ( ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' ) )
            // InternalSmartHomeDSL.g:266:2: ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' )
            {
            // InternalSmartHomeDSL.g:266:2: ( () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}' )
            // InternalSmartHomeDSL.g:267:3: () otherlv_1= 'Location' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )? otherlv_7= '}'
            {
            // InternalSmartHomeDSL.g:267:3: ()
            // InternalSmartHomeDSL.g:268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1());
            		
            // InternalSmartHomeDSL.g:278:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartHomeDSL.g:279:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:279:4: (lv_name_2_0= ruleEString )
            // InternalSmartHomeDSL.g:280:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmartHomeDSL.g:301:3: ( ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20||LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmartHomeDSL.g:302:4: ( (lv_sensors_4_0= ruleSensor ) ) (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )*
                    {
                    // InternalSmartHomeDSL.g:302:4: ( (lv_sensors_4_0= ruleSensor ) )
                    // InternalSmartHomeDSL.g:303:5: (lv_sensors_4_0= ruleSensor )
                    {
                    // InternalSmartHomeDSL.g:303:5: (lv_sensors_4_0= ruleSensor )
                    // InternalSmartHomeDSL.g:304:6: lv_sensors_4_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getSensorsSensorParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_sensors_4_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_4_0,
                    							"fr.unice.polytech.idm.xtext.SmartHomeDSL.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmartHomeDSL.g:321:4: (otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSmartHomeDSL.g:322:5: otherlv_5= ',' ( (lv_sensors_6_0= ruleSensor ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSmartHomeDSL.g:326:5: ( (lv_sensors_6_0= ruleSensor ) )
                    	    // InternalSmartHomeDSL.g:327:6: (lv_sensors_6_0= ruleSensor )
                    	    {
                    	    // InternalSmartHomeDSL.g:327:6: (lv_sensors_6_0= ruleSensor )
                    	    // InternalSmartHomeDSL.g:328:7: lv_sensors_6_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getLocationAccess().getSensorsSensorParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_sensors_6_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensors",
                    	    								lv_sensors_6_0,
                    	    								"fr.unice.polytech.idm.xtext.SmartHomeDSL.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleSensorType"
    // InternalSmartHomeDSL.g:355:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalSmartHomeDSL.g:355:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalSmartHomeDSL.g:356:2: iv_ruleSensorType= ruleSensorType EOF
            {
             newCompositeNode(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorType=ruleSensorType();

            state._fsp--;

             current =iv_ruleSensorType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalSmartHomeDSL.g:362:1: ruleSensorType returns [EObject current=null] : (this_AnalogSensorType_0= ruleAnalogSensorType | this_BooleanSensorType_1= ruleBooleanSensorType ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_AnalogSensorType_0 = null;

        EObject this_BooleanSensorType_1 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:368:2: ( (this_AnalogSensorType_0= ruleAnalogSensorType | this_BooleanSensorType_1= ruleBooleanSensorType ) )
            // InternalSmartHomeDSL.g:369:2: (this_AnalogSensorType_0= ruleAnalogSensorType | this_BooleanSensorType_1= ruleBooleanSensorType )
            {
            // InternalSmartHomeDSL.g:369:2: (this_AnalogSensorType_0= ruleAnalogSensorType | this_BooleanSensorType_1= ruleBooleanSensorType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartHomeDSL.g:370:3: this_AnalogSensorType_0= ruleAnalogSensorType
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getAnalogSensorTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalogSensorType_0=ruleAnalogSensorType();

                    state._fsp--;


                    			current = this_AnalogSensorType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:379:3: this_BooleanSensorType_1= ruleBooleanSensorType
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getBooleanSensorTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanSensorType_1=ruleBooleanSensorType();

                    state._fsp--;


                    			current = this_BooleanSensorType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleAnalogSensorType"
    // InternalSmartHomeDSL.g:391:1: entryRuleAnalogSensorType returns [EObject current=null] : iv_ruleAnalogSensorType= ruleAnalogSensorType EOF ;
    public final EObject entryRuleAnalogSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensorType = null;


        try {
            // InternalSmartHomeDSL.g:391:57: (iv_ruleAnalogSensorType= ruleAnalogSensorType EOF )
            // InternalSmartHomeDSL.g:392:2: iv_ruleAnalogSensorType= ruleAnalogSensorType EOF
            {
             newCompositeNode(grammarAccess.getAnalogSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogSensorType=ruleAnalogSensorType();

            state._fsp--;

             current =iv_ruleAnalogSensorType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalogSensorType"


    // $ANTLR start "ruleAnalogSensorType"
    // InternalSmartHomeDSL.g:398:1: ruleAnalogSensorType returns [EObject current=null] : (otherlv_0= 'analog' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleAnalogSensorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:404:2: ( (otherlv_0= 'analog' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSmartHomeDSL.g:405:2: (otherlv_0= 'analog' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSmartHomeDSL.g:405:2: (otherlv_0= 'analog' ( (lv_name_1_0= ruleEString ) ) )
            // InternalSmartHomeDSL.g:406:3: otherlv_0= 'analog' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalogSensorTypeAccess().getAnalogKeyword_0());
            		
            // InternalSmartHomeDSL.g:410:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartHomeDSL.g:411:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:411:4: (lv_name_1_0= ruleEString )
            // InternalSmartHomeDSL.g:412:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalogSensorType"


    // $ANTLR start "entryRuleBooleanSensorType"
    // InternalSmartHomeDSL.g:433:1: entryRuleBooleanSensorType returns [EObject current=null] : iv_ruleBooleanSensorType= ruleBooleanSensorType EOF ;
    public final EObject entryRuleBooleanSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSensorType = null;


        try {
            // InternalSmartHomeDSL.g:433:58: (iv_ruleBooleanSensorType= ruleBooleanSensorType EOF )
            // InternalSmartHomeDSL.g:434:2: iv_ruleBooleanSensorType= ruleBooleanSensorType EOF
            {
             newCompositeNode(grammarAccess.getBooleanSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSensorType=ruleBooleanSensorType();

            state._fsp--;

             current =iv_ruleBooleanSensorType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSensorType"


    // $ANTLR start "ruleBooleanSensorType"
    // InternalSmartHomeDSL.g:440:1: ruleBooleanSensorType returns [EObject current=null] : (otherlv_0= 'boolean' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleBooleanSensorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:446:2: ( (otherlv_0= 'boolean' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalSmartHomeDSL.g:447:2: (otherlv_0= 'boolean' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalSmartHomeDSL.g:447:2: (otherlv_0= 'boolean' ( (lv_name_1_0= ruleEString ) ) )
            // InternalSmartHomeDSL.g:448:3: otherlv_0= 'boolean' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanSensorTypeAccess().getBooleanKeyword_0());
            		
            // InternalSmartHomeDSL.g:452:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartHomeDSL.g:453:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:453:4: (lv_name_1_0= ruleEString )
            // InternalSmartHomeDSL.g:454:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanSensorTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanSensorTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanSensorType"


    // $ANTLR start "entryRuleEString"
    // InternalSmartHomeDSL.g:475:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartHomeDSL.g:475:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartHomeDSL.g:476:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmartHomeDSL.g:482:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:488:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartHomeDSL.g:489:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartHomeDSL.g:489:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmartHomeDSL.g:490:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:498:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensor"
    // InternalSmartHomeDSL.g:509:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartHomeDSL.g:509:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartHomeDSL.g:510:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSmartHomeDSL.g:516:1: ruleSensor returns [EObject current=null] : (this_IntegerSensor_0= ruleIntegerSensor | this_BooleanSensor_1= ruleBooleanSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerSensor_0 = null;

        EObject this_BooleanSensor_1 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:522:2: ( (this_IntegerSensor_0= ruleIntegerSensor | this_BooleanSensor_1= ruleBooleanSensor ) )
            // InternalSmartHomeDSL.g:523:2: (this_IntegerSensor_0= ruleIntegerSensor | this_BooleanSensor_1= ruleBooleanSensor )
            {
            // InternalSmartHomeDSL.g:523:2: (this_IntegerSensor_0= ruleIntegerSensor | this_BooleanSensor_1= ruleBooleanSensor )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartHomeDSL.g:524:3: this_IntegerSensor_0= ruleIntegerSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getIntegerSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerSensor_0=ruleIntegerSensor();

                    state._fsp--;


                    			current = this_IntegerSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:533:3: this_BooleanSensor_1= ruleBooleanSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getBooleanSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanSensor_1=ruleBooleanSensor();

                    state._fsp--;


                    			current = this_BooleanSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleIntegerSensor"
    // InternalSmartHomeDSL.g:545:1: entryRuleIntegerSensor returns [EObject current=null] : iv_ruleIntegerSensor= ruleIntegerSensor EOF ;
    public final EObject entryRuleIntegerSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerSensor = null;


        try {
            // InternalSmartHomeDSL.g:545:54: (iv_ruleIntegerSensor= ruleIntegerSensor EOF )
            // InternalSmartHomeDSL.g:546:2: iv_ruleIntegerSensor= ruleIntegerSensor EOF
            {
             newCompositeNode(grammarAccess.getIntegerSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerSensor=ruleIntegerSensor();

            state._fsp--;

             current =iv_ruleIntegerSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerSensor"


    // $ANTLR start "ruleIntegerSensor"
    // InternalSmartHomeDSL.g:552:1: ruleIntegerSensor returns [EObject current=null] : (otherlv_0= 'IntegerSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleIntegerSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_dataFile_4_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:558:2: ( (otherlv_0= 'IntegerSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' ) )
            // InternalSmartHomeDSL.g:559:2: (otherlv_0= 'IntegerSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' )
            {
            // InternalSmartHomeDSL.g:559:2: (otherlv_0= 'IntegerSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' )
            // InternalSmartHomeDSL.g:560:3: otherlv_0= 'IntegerSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerSensorAccess().getIntegerSensorKeyword_0());
            		
            // InternalSmartHomeDSL.g:564:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartHomeDSL.g:565:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:565:4: (lv_name_1_0= ruleEString )
            // InternalSmartHomeDSL.g:566:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:583:3: ( ( ruleEString ) )
            // InternalSmartHomeDSL.g:584:4: ( ruleEString )
            {
            // InternalSmartHomeDSL.g:584:4: ( ruleEString )
            // InternalSmartHomeDSL.g:585:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerSensorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegerSensorAccess().getSensorTypeAnalogSensorTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerSensorAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmartHomeDSL.g:603:3: ( (lv_dataFile_4_0= ruleEString ) )
            // InternalSmartHomeDSL.g:604:4: (lv_dataFile_4_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:604:4: (lv_dataFile_4_0= ruleEString )
            // InternalSmartHomeDSL.g:605:5: lv_dataFile_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerSensorAccess().getDataFileEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_dataFile_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerSensorRule());
            					}
            					set(
            						current,
            						"dataFile",
            						lv_dataFile_4_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegerSensorAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerSensor"


    // $ANTLR start "entryRuleBooleanSensor"
    // InternalSmartHomeDSL.g:630:1: entryRuleBooleanSensor returns [EObject current=null] : iv_ruleBooleanSensor= ruleBooleanSensor EOF ;
    public final EObject entryRuleBooleanSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanSensor = null;


        try {
            // InternalSmartHomeDSL.g:630:54: (iv_ruleBooleanSensor= ruleBooleanSensor EOF )
            // InternalSmartHomeDSL.g:631:2: iv_ruleBooleanSensor= ruleBooleanSensor EOF
            {
             newCompositeNode(grammarAccess.getBooleanSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanSensor=ruleBooleanSensor();

            state._fsp--;

             current =iv_ruleBooleanSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanSensor"


    // $ANTLR start "ruleBooleanSensor"
    // InternalSmartHomeDSL.g:637:1: ruleBooleanSensor returns [EObject current=null] : (otherlv_0= 'BooleanSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleBooleanSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_dataFile_4_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:643:2: ( (otherlv_0= 'BooleanSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' ) )
            // InternalSmartHomeDSL.g:644:2: (otherlv_0= 'BooleanSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' )
            {
            // InternalSmartHomeDSL.g:644:2: (otherlv_0= 'BooleanSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' )
            // InternalSmartHomeDSL.g:645:3: otherlv_0= 'BooleanSensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanSensorAccess().getBooleanSensorKeyword_0());
            		
            // InternalSmartHomeDSL.g:649:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartHomeDSL.g:650:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:650:4: (lv_name_1_0= ruleEString )
            // InternalSmartHomeDSL.g:651:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:668:3: ( ( ruleEString ) )
            // InternalSmartHomeDSL.g:669:4: ( ruleEString )
            {
            // InternalSmartHomeDSL.g:669:4: ( ruleEString )
            // InternalSmartHomeDSL.g:670:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanSensorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBooleanSensorAccess().getSensorTypeBooleanSensorTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanSensorAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmartHomeDSL.g:688:3: ( (lv_dataFile_4_0= ruleEString ) )
            // InternalSmartHomeDSL.g:689:4: (lv_dataFile_4_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:689:4: (lv_dataFile_4_0= ruleEString )
            // InternalSmartHomeDSL.g:690:5: lv_dataFile_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanSensorAccess().getDataFileEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_dataFile_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanSensorRule());
            					}
            					set(
            						current,
            						"dataFile",
            						lv_dataFile_4_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBooleanSensorAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanSensor"


    // $ANTLR start "entryRuleRule"
    // InternalSmartHomeDSL.g:715:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSmartHomeDSL.g:715:45: (iv_ruleRule= ruleRule EOF )
            // InternalSmartHomeDSL.g:716:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalSmartHomeDSL.g:722:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_3_0 = null;

        EObject lv_duration_5_0 = null;

        EObject lv_event_7_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:728:2: ( (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) ) )
            // InternalSmartHomeDSL.g:729:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) )
            {
            // InternalSmartHomeDSL.g:729:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) )
            // InternalSmartHomeDSL.g:730:3: otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalSmartHomeDSL.g:734:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalSmartHomeDSL.g:735:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalSmartHomeDSL.g:735:4: (lv_conditions_1_0= ruleCondition )
            // InternalSmartHomeDSL.g:736:5: lv_conditions_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_conditions_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:753:3: (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmartHomeDSL.g:754:4: otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getAndKeyword_2_0());
            	    			
            	    // InternalSmartHomeDSL.g:758:4: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalSmartHomeDSL.g:759:5: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalSmartHomeDSL.g:759:5: (lv_conditions_3_0= ruleCondition )
            	    // InternalSmartHomeDSL.g:760:6: lv_conditions_3_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getConditionsConditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_3_0,
            	    							"fr.unice.polytech.idm.xtext.SmartHomeDSL.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getForKeyword_3());
            		
            // InternalSmartHomeDSL.g:782:3: ( (lv_duration_5_0= ruleDuration ) )
            // InternalSmartHomeDSL.g:783:4: (lv_duration_5_0= ruleDuration )
            {
            // InternalSmartHomeDSL.g:783:4: (lv_duration_5_0= ruleDuration )
            // InternalSmartHomeDSL.g:784:5: lv_duration_5_0= ruleDuration
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getDurationDurationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_duration_5_0=ruleDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.Duration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getThenKeyword_5());
            		
            // InternalSmartHomeDSL.g:805:3: ( (lv_event_7_0= ruleEvent ) )
            // InternalSmartHomeDSL.g:806:4: (lv_event_7_0= ruleEvent )
            {
            // InternalSmartHomeDSL.g:806:4: (lv_event_7_0= ruleEvent )
            // InternalSmartHomeDSL.g:807:5: lv_event_7_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getEventEventParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_event_7_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_7_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalSmartHomeDSL.g:828:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartHomeDSL.g:828:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartHomeDSL.g:829:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalSmartHomeDSL.g:835:1: ruleCondition returns [EObject current=null] : (this_IntegerCondition_0= ruleIntegerCondition | this_BooleanCondition_1= ruleBooleanCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerCondition_0 = null;

        EObject this_BooleanCondition_1 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:841:2: ( (this_IntegerCondition_0= ruleIntegerCondition | this_BooleanCondition_1= ruleBooleanCondition ) )
            // InternalSmartHomeDSL.g:842:2: (this_IntegerCondition_0= ruleIntegerCondition | this_BooleanCondition_1= ruleBooleanCondition )
            {
            // InternalSmartHomeDSL.g:842:2: (this_IntegerCondition_0= ruleIntegerCondition | this_BooleanCondition_1= ruleBooleanCondition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=33 && LA10_1<=34)) ) {
                    alt10=2;
                }
                else if ( ((LA10_1>=30 && LA10_1<=32)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=33 && LA10_2<=34)) ) {
                    alt10=2;
                }
                else if ( ((LA10_2>=30 && LA10_2<=32)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartHomeDSL.g:843:3: this_IntegerCondition_0= ruleIntegerCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getIntegerConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerCondition_0=ruleIntegerCondition();

                    state._fsp--;


                    			current = this_IntegerCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:852:3: this_BooleanCondition_1= ruleBooleanCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getBooleanConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanCondition_1=ruleBooleanCondition();

                    state._fsp--;


                    			current = this_BooleanCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIntegerCondition"
    // InternalSmartHomeDSL.g:864:1: entryRuleIntegerCondition returns [EObject current=null] : iv_ruleIntegerCondition= ruleIntegerCondition EOF ;
    public final EObject entryRuleIntegerCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerCondition = null;


        try {
            // InternalSmartHomeDSL.g:864:57: (iv_ruleIntegerCondition= ruleIntegerCondition EOF )
            // InternalSmartHomeDSL.g:865:2: iv_ruleIntegerCondition= ruleIntegerCondition EOF
            {
             newCompositeNode(grammarAccess.getIntegerConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerCondition=ruleIntegerCondition();

            state._fsp--;

             current =iv_ruleIntegerCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerCondition"


    // $ANTLR start "ruleIntegerCondition"
    // InternalSmartHomeDSL.g:871:1: ruleIntegerCondition returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleIntegerOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) ) ;
    public final EObject ruleIntegerCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:877:2: ( ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleIntegerOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) ) )
            // InternalSmartHomeDSL.g:878:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleIntegerOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) )
            {
            // InternalSmartHomeDSL.g:878:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleIntegerOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) )
            // InternalSmartHomeDSL.g:879:3: ( ( ruleEString ) ) ( (lv_operator_1_0= ruleIntegerOperator ) ) ( (lv_operand_2_0= ruleEInt ) )
            {
            // InternalSmartHomeDSL.g:879:3: ( ( ruleEString ) )
            // InternalSmartHomeDSL.g:880:4: ( ruleEString )
            {
            // InternalSmartHomeDSL.g:880:4: ( ruleEString )
            // InternalSmartHomeDSL.g:881:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegerConditionAccess().getSensorIntegerSensorCrossReference_0_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:895:3: ( (lv_operator_1_0= ruleIntegerOperator ) )
            // InternalSmartHomeDSL.g:896:4: (lv_operator_1_0= ruleIntegerOperator )
            {
            // InternalSmartHomeDSL.g:896:4: (lv_operator_1_0= ruleIntegerOperator )
            // InternalSmartHomeDSL.g:897:5: lv_operator_1_0= ruleIntegerOperator
            {

            					newCompositeNode(grammarAccess.getIntegerConditionAccess().getOperatorIntegerOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_operator_1_0=ruleIntegerOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.IntegerOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:914:3: ( (lv_operand_2_0= ruleEInt ) )
            // InternalSmartHomeDSL.g:915:4: (lv_operand_2_0= ruleEInt )
            {
            // InternalSmartHomeDSL.g:915:4: (lv_operand_2_0= ruleEInt )
            // InternalSmartHomeDSL.g:916:5: lv_operand_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntegerConditionAccess().getOperandEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerConditionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerCondition"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalSmartHomeDSL.g:937:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalSmartHomeDSL.g:937:57: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalSmartHomeDSL.g:938:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalSmartHomeDSL.g:944:1: ruleBooleanCondition returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleBooleanOperator ) ) ( (lv_operand_2_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:950:2: ( ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleBooleanOperator ) ) ( (lv_operand_2_0= ruleEBoolean ) ) ) )
            // InternalSmartHomeDSL.g:951:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleBooleanOperator ) ) ( (lv_operand_2_0= ruleEBoolean ) ) )
            {
            // InternalSmartHomeDSL.g:951:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleBooleanOperator ) ) ( (lv_operand_2_0= ruleEBoolean ) ) )
            // InternalSmartHomeDSL.g:952:3: ( ( ruleEString ) ) ( (lv_operator_1_0= ruleBooleanOperator ) ) ( (lv_operand_2_0= ruleEBoolean ) )
            {
            // InternalSmartHomeDSL.g:952:3: ( ( ruleEString ) )
            // InternalSmartHomeDSL.g:953:4: ( ruleEString )
            {
            // InternalSmartHomeDSL.g:953:4: ( ruleEString )
            // InternalSmartHomeDSL.g:954:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBooleanConditionAccess().getSensorBooleanSensorCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:968:3: ( (lv_operator_1_0= ruleBooleanOperator ) )
            // InternalSmartHomeDSL.g:969:4: (lv_operator_1_0= ruleBooleanOperator )
            {
            // InternalSmartHomeDSL.g:969:4: (lv_operator_1_0= ruleBooleanOperator )
            // InternalSmartHomeDSL.g:970:5: lv_operator_1_0= ruleBooleanOperator
            {

            					newCompositeNode(grammarAccess.getBooleanConditionAccess().getOperatorBooleanOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_operator_1_0=ruleBooleanOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.BooleanOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:987:3: ( (lv_operand_2_0= ruleEBoolean ) )
            // InternalSmartHomeDSL.g:988:4: (lv_operand_2_0= ruleEBoolean )
            {
            // InternalSmartHomeDSL.g:988:4: (lv_operand_2_0= ruleEBoolean )
            // InternalSmartHomeDSL.g:989:5: lv_operand_2_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanConditionAccess().getOperandEBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_2_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleEInt"
    // InternalSmartHomeDSL.g:1010:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmartHomeDSL.g:1010:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmartHomeDSL.g:1011:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmartHomeDSL.g:1017:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1023:2: (this_INT_0= RULE_INT )
            // InternalSmartHomeDSL.g:1024:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSmartHomeDSL.g:1034:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSmartHomeDSL.g:1034:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSmartHomeDSL.g:1035:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSmartHomeDSL.g:1041:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1047:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSmartHomeDSL.g:1048:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSmartHomeDSL.g:1048:2: (kw= 'true' | kw= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmartHomeDSL.g:1049:3: kw= 'true'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:1055:3: kw= 'false'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleDuration"
    // InternalSmartHomeDSL.g:1064:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalSmartHomeDSL.g:1064:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalSmartHomeDSL.g:1065:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalSmartHomeDSL.g:1071:1: ruleDuration returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1077:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) ) )
            // InternalSmartHomeDSL.g:1078:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) )
            {
            // InternalSmartHomeDSL.g:1078:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) )
            // InternalSmartHomeDSL.g:1079:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) )
            {
            // InternalSmartHomeDSL.g:1079:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalSmartHomeDSL.g:1080:4: (lv_value_0_0= ruleEInt )
            {
            // InternalSmartHomeDSL.g:1080:4: (lv_value_0_0= ruleEInt )
            // InternalSmartHomeDSL.g:1081:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:1098:3: ( (lv_unit_1_0= ruleDurationUnit ) )
            // InternalSmartHomeDSL.g:1099:4: (lv_unit_1_0= ruleDurationUnit )
            {
            // InternalSmartHomeDSL.g:1099:4: (lv_unit_1_0= ruleDurationUnit )
            // InternalSmartHomeDSL.g:1100:5: lv_unit_1_0= ruleDurationUnit
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getUnitDurationUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleDurationUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDurationRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.DurationUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleEvent"
    // InternalSmartHomeDSL.g:1121:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSmartHomeDSL.g:1121:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSmartHomeDSL.g:1122:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSmartHomeDSL.g:1128:1: ruleEvent returns [EObject current=null] : ( (lv_description_0_0= ruleEString ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1134:2: ( ( (lv_description_0_0= ruleEString ) ) )
            // InternalSmartHomeDSL.g:1135:2: ( (lv_description_0_0= ruleEString ) )
            {
            // InternalSmartHomeDSL.g:1135:2: ( (lv_description_0_0= ruleEString ) )
            // InternalSmartHomeDSL.g:1136:3: (lv_description_0_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:1136:3: (lv_description_0_0= ruleEString )
            // InternalSmartHomeDSL.g:1137:4: lv_description_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getEventAccess().getDescriptionEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_description_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventRule());
            				}
            				set(
            					current,
            					"description",
            					lv_description_0_0,
            					"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "ruleIntegerOperator"
    // InternalSmartHomeDSL.g:1157:1: ruleIntegerOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleIntegerOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1163:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalSmartHomeDSL.g:1164:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalSmartHomeDSL.g:1164:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSmartHomeDSL.g:1165:3: (enumLiteral_0= '=' )
                    {
                    // InternalSmartHomeDSL.g:1165:3: (enumLiteral_0= '=' )
                    // InternalSmartHomeDSL.g:1166:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getIntegerOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntegerOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:1173:3: (enumLiteral_1= '<' )
                    {
                    // InternalSmartHomeDSL.g:1173:3: (enumLiteral_1= '<' )
                    // InternalSmartHomeDSL.g:1174:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getIntegerOperatorAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntegerOperatorAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHomeDSL.g:1181:3: (enumLiteral_2= '>' )
                    {
                    // InternalSmartHomeDSL.g:1181:3: (enumLiteral_2= '>' )
                    // InternalSmartHomeDSL.g:1182:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getIntegerOperatorAccess().getSUPERIOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntegerOperatorAccess().getSUPERIOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerOperator"


    // $ANTLR start "ruleBooleanOperator"
    // InternalSmartHomeDSL.g:1192:1: ruleBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'isnot' ) ) ;
    public final Enumerator ruleBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1198:2: ( ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'isnot' ) ) )
            // InternalSmartHomeDSL.g:1199:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'isnot' ) )
            {
            // InternalSmartHomeDSL.g:1199:2: ( (enumLiteral_0= 'is' ) | (enumLiteral_1= 'isnot' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartHomeDSL.g:1200:3: (enumLiteral_0= 'is' )
                    {
                    // InternalSmartHomeDSL.g:1200:3: (enumLiteral_0= 'is' )
                    // InternalSmartHomeDSL.g:1201:4: enumLiteral_0= 'is'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getISEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOperatorAccess().getISEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:1208:3: (enumLiteral_1= 'isnot' )
                    {
                    // InternalSmartHomeDSL.g:1208:3: (enumLiteral_1= 'isnot' )
                    // InternalSmartHomeDSL.g:1209:4: enumLiteral_1= 'isnot'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOperatorAccess().getIS_NOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOperatorAccess().getIS_NOTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanOperator"


    // $ANTLR start "ruleDurationUnit"
    // InternalSmartHomeDSL.g:1219:1: ruleDurationUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) ) ;
    public final Enumerator ruleDurationUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:1225:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) ) )
            // InternalSmartHomeDSL.g:1226:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) )
            {
            // InternalSmartHomeDSL.g:1226:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmartHomeDSL.g:1227:3: (enumLiteral_0= 'min' )
                    {
                    // InternalSmartHomeDSL.g:1227:3: (enumLiteral_0= 'min' )
                    // InternalSmartHomeDSL.g:1228:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:1235:3: (enumLiteral_1= 's' )
                    {
                    // InternalSmartHomeDSL.g:1235:3: (enumLiteral_1= 's' )
                    // InternalSmartHomeDSL.g:1236:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getSECONDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationUnitAccess().getSECONDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDurationUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000908000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000000L});

}