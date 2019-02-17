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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SmartHome'", "'{'", "'sensorTypes'", "','", "'}'", "'rules'", "'Location'", "'Sensor'", "'('", "')'", "'if'", "'and'", "'for'", "'then'", "'='", "'<'", "'>'", "'min'", "'s'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
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

            if ( (LA5_0==18) ) {
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
    // InternalSmartHomeDSL.g:362:1: ruleSensorType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) )? ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:368:2: ( ( () ( (lv_name_1_0= ruleEString ) )? ) )
            // InternalSmartHomeDSL.g:369:2: ( () ( (lv_name_1_0= ruleEString ) )? )
            {
            // InternalSmartHomeDSL.g:369:2: ( () ( (lv_name_1_0= ruleEString ) )? )
            // InternalSmartHomeDSL.g:370:3: () ( (lv_name_1_0= ruleEString ) )?
            {
            // InternalSmartHomeDSL.g:370:3: ()
            // InternalSmartHomeDSL.g:371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorTypeAccess().getSensorTypeAction_0(),
            					current);
            			

            }

            // InternalSmartHomeDSL.g:377:3: ( (lv_name_1_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartHomeDSL.g:378:4: (lv_name_1_0= ruleEString )
                    {
                    // InternalSmartHomeDSL.g:378:4: (lv_name_1_0= ruleEString )
                    // InternalSmartHomeDSL.g:379:5: lv_name_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getSensorTypeAccess().getNameEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSensorTypeRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleEString"
    // InternalSmartHomeDSL.g:400:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartHomeDSL.g:400:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartHomeDSL.g:401:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmartHomeDSL.g:407:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:413:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartHomeDSL.g:414:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartHomeDSL.g:414:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalSmartHomeDSL.g:415:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:423:3: this_ID_1= RULE_ID
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
    // InternalSmartHomeDSL.g:434:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSmartHomeDSL.g:434:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSmartHomeDSL.g:435:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSmartHomeDSL.g:441:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_dataFile_4_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:447:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' ) )
            // InternalSmartHomeDSL.g:448:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' )
            {
            // InternalSmartHomeDSL.g:448:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')' )
            // InternalSmartHomeDSL.g:449:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '(' ( (lv_dataFile_4_0= ruleEString ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalSmartHomeDSL.g:453:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmartHomeDSL.g:454:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:454:4: (lv_name_1_0= ruleEString )
            // InternalSmartHomeDSL.g:455:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:472:3: ( ( ruleEString ) )
            // InternalSmartHomeDSL.g:473:4: ( ruleEString )
            {
            // InternalSmartHomeDSL.g:473:4: ( ruleEString )
            // InternalSmartHomeDSL.g:474:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorTypeSensorTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSmartHomeDSL.g:492:3: ( (lv_dataFile_4_0= ruleEString ) )
            // InternalSmartHomeDSL.g:493:4: (lv_dataFile_4_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:493:4: (lv_dataFile_4_0= ruleEString )
            // InternalSmartHomeDSL.g:494:5: lv_dataFile_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getDataFileEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_dataFile_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"dataFile",
            						lv_dataFile_4_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getRightParenthesisKeyword_5());
            		

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


    // $ANTLR start "entryRuleRule"
    // InternalSmartHomeDSL.g:519:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalSmartHomeDSL.g:519:45: (iv_ruleRule= ruleRule EOF )
            // InternalSmartHomeDSL.g:520:2: iv_ruleRule= ruleRule EOF
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
    // InternalSmartHomeDSL.g:526:1: ruleRule returns [EObject current=null] : (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) ) ;
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
            // InternalSmartHomeDSL.g:532:2: ( (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) ) )
            // InternalSmartHomeDSL.g:533:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) )
            {
            // InternalSmartHomeDSL.g:533:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) ) )
            // InternalSmartHomeDSL.g:534:3: otherlv_0= 'if' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'for' ( (lv_duration_5_0= ruleDuration ) ) otherlv_6= 'then' ( (lv_event_7_0= ruleEvent ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0());
            		
            // InternalSmartHomeDSL.g:538:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalSmartHomeDSL.g:539:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalSmartHomeDSL.g:539:4: (lv_conditions_1_0= ruleCondition )
            // InternalSmartHomeDSL.g:540:5: lv_conditions_1_0= ruleCondition
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

            // InternalSmartHomeDSL.g:557:3: (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartHomeDSL.g:558:4: otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getAndKeyword_2_0());
            	    			
            	    // InternalSmartHomeDSL.g:562:4: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalSmartHomeDSL.g:563:5: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalSmartHomeDSL.g:563:5: (lv_conditions_3_0= ruleCondition )
            	    // InternalSmartHomeDSL.g:564:6: lv_conditions_3_0= ruleCondition
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getForKeyword_3());
            		
            // InternalSmartHomeDSL.g:586:3: ( (lv_duration_5_0= ruleDuration ) )
            // InternalSmartHomeDSL.g:587:4: (lv_duration_5_0= ruleDuration )
            {
            // InternalSmartHomeDSL.g:587:4: (lv_duration_5_0= ruleDuration )
            // InternalSmartHomeDSL.g:588:5: lv_duration_5_0= ruleDuration
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

            otherlv_6=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getThenKeyword_5());
            		
            // InternalSmartHomeDSL.g:609:3: ( (lv_event_7_0= ruleEvent ) )
            // InternalSmartHomeDSL.g:610:4: (lv_event_7_0= ruleEvent )
            {
            // InternalSmartHomeDSL.g:610:4: (lv_event_7_0= ruleEvent )
            // InternalSmartHomeDSL.g:611:5: lv_event_7_0= ruleEvent
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
    // InternalSmartHomeDSL.g:632:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalSmartHomeDSL.g:632:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalSmartHomeDSL.g:633:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalSmartHomeDSL.g:639:1: ruleCondition returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:645:2: ( ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) ) )
            // InternalSmartHomeDSL.g:646:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) )
            {
            // InternalSmartHomeDSL.g:646:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_operand_2_0= ruleEInt ) ) )
            // InternalSmartHomeDSL.g:647:3: ( ( ruleEString ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_operand_2_0= ruleEInt ) )
            {
            // InternalSmartHomeDSL.g:647:3: ( ( ruleEString ) )
            // InternalSmartHomeDSL.g:648:4: ( ruleEString )
            {
            // InternalSmartHomeDSL.g:648:4: ( ruleEString )
            // InternalSmartHomeDSL.g:649:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConditionAccess().getSensorSensorCrossReference_0_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:663:3: ( (lv_operator_1_0= ruleOperator ) )
            // InternalSmartHomeDSL.g:664:4: (lv_operator_1_0= ruleOperator )
            {
            // InternalSmartHomeDSL.g:664:4: (lv_operator_1_0= ruleOperator )
            // InternalSmartHomeDSL.g:665:5: lv_operator_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"fr.unice.polytech.idm.xtext.SmartHomeDSL.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartHomeDSL.g:682:3: ( (lv_operand_2_0= ruleEInt ) )
            // InternalSmartHomeDSL.g:683:4: (lv_operand_2_0= ruleEInt )
            {
            // InternalSmartHomeDSL.g:683:4: (lv_operand_2_0= ruleEInt )
            // InternalSmartHomeDSL.g:684:5: lv_operand_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperandEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEInt"
    // InternalSmartHomeDSL.g:705:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmartHomeDSL.g:705:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmartHomeDSL.g:706:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmartHomeDSL.g:712:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:718:2: (this_INT_0= RULE_INT )
            // InternalSmartHomeDSL.g:719:2: this_INT_0= RULE_INT
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


    // $ANTLR start "entryRuleDuration"
    // InternalSmartHomeDSL.g:729:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalSmartHomeDSL.g:729:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalSmartHomeDSL.g:730:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalSmartHomeDSL.g:736:1: ruleDuration returns [EObject current=null] : ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:742:2: ( ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) ) )
            // InternalSmartHomeDSL.g:743:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) )
            {
            // InternalSmartHomeDSL.g:743:2: ( ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) ) )
            // InternalSmartHomeDSL.g:744:3: ( (lv_value_0_0= ruleEInt ) ) ( (lv_unit_1_0= ruleDurationUnit ) )
            {
            // InternalSmartHomeDSL.g:744:3: ( (lv_value_0_0= ruleEInt ) )
            // InternalSmartHomeDSL.g:745:4: (lv_value_0_0= ruleEInt )
            {
            // InternalSmartHomeDSL.g:745:4: (lv_value_0_0= ruleEInt )
            // InternalSmartHomeDSL.g:746:5: lv_value_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getValueEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalSmartHomeDSL.g:763:3: ( (lv_unit_1_0= ruleDurationUnit ) )
            // InternalSmartHomeDSL.g:764:4: (lv_unit_1_0= ruleDurationUnit )
            {
            // InternalSmartHomeDSL.g:764:4: (lv_unit_1_0= ruleDurationUnit )
            // InternalSmartHomeDSL.g:765:5: lv_unit_1_0= ruleDurationUnit
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
    // InternalSmartHomeDSL.g:786:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSmartHomeDSL.g:786:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSmartHomeDSL.g:787:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalSmartHomeDSL.g:793:1: ruleEvent returns [EObject current=null] : ( (lv_description_0_0= ruleEString ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_description_0_0 = null;



        	enterRule();

        try {
            // InternalSmartHomeDSL.g:799:2: ( ( (lv_description_0_0= ruleEString ) ) )
            // InternalSmartHomeDSL.g:800:2: ( (lv_description_0_0= ruleEString ) )
            {
            // InternalSmartHomeDSL.g:800:2: ( (lv_description_0_0= ruleEString ) )
            // InternalSmartHomeDSL.g:801:3: (lv_description_0_0= ruleEString )
            {
            // InternalSmartHomeDSL.g:801:3: (lv_description_0_0= ruleEString )
            // InternalSmartHomeDSL.g:802:4: lv_description_0_0= ruleEString
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


    // $ANTLR start "ruleOperator"
    // InternalSmartHomeDSL.g:822:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:828:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalSmartHomeDSL.g:829:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalSmartHomeDSL.g:829:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSmartHomeDSL.g:830:3: (enumLiteral_0= '=' )
                    {
                    // InternalSmartHomeDSL.g:830:3: (enumLiteral_0= '=' )
                    // InternalSmartHomeDSL.g:831:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:838:3: (enumLiteral_1= '<' )
                    {
                    // InternalSmartHomeDSL.g:838:3: (enumLiteral_1= '<' )
                    // InternalSmartHomeDSL.g:839:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHomeDSL.g:846:3: (enumLiteral_2= '>' )
                    {
                    // InternalSmartHomeDSL.g:846:3: (enumLiteral_2= '>' )
                    // InternalSmartHomeDSL.g:847:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSUPERIOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getSUPERIOREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleDurationUnit"
    // InternalSmartHomeDSL.g:857:1: ruleDurationUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) ) ;
    public final Enumerator ruleDurationUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSmartHomeDSL.g:863:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) ) )
            // InternalSmartHomeDSL.g:864:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) )
            {
            // InternalSmartHomeDSL.g:864:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 's' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartHomeDSL.g:865:3: (enumLiteral_0= 'min' )
                    {
                    // InternalSmartHomeDSL.g:865:3: (enumLiteral_0= 'min' )
                    // InternalSmartHomeDSL.g:866:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHomeDSL.g:873:3: (enumLiteral_1= 's' )
                    {
                    // InternalSmartHomeDSL.g:873:3: (enumLiteral_1= 's' )
                    // InternalSmartHomeDSL.g:874:4: enumLiteral_1= 's'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000000L});

}