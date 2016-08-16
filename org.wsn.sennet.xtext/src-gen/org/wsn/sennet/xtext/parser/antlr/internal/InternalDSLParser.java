package org.wsn.sennet.xtext.parser.antlr.internal; 

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
import org.wsn.sennet.xtext.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SeNetApp'", "'{'", "'id'", "'jobs'", "','", "'}'", "'-'", "'NodeLevelJob'", "'nodeDataProcessing'", "'sensingSamplingRate'", "'dataProcessingRate'", "'JobTargetNode'", "'JobTargetNetwork'", "'startEndTrigger'", "'jobaction'", "'SenseNowJob'", "'SinkJob'", "'SenseJob'", "'NetworkLevelSpecialAlgorithm'", "'specialAlgorithmJob'", "'algorithmSamplingRate'", "'nodeIDList'", "'NetworkDataProcessing'", "'networkDataProcessing'", "'SensorNode'", "'position'", "'nodeResources'", "'ClusterHeadNode'", "'SinkNode'", "'ComputationNode'", "'AccelerometerSensor'", "'LightSensor'", "'LocationSensor'", "'MicrophoneSensor'", "'TemperatureSensor'", "'PressureSensor'", "'HumiditySensor'", "'VoltageSensor'", "'FlatNetwork'", "'nbOfNodes'", "'interNodeComm'", "'routingProtocol'", "'resources'", "'sink'", "'nodes'", "'ClusteredNetwork'", "'clusters'", "'Cluster'", "'('", "')'", "'ReceiveMessageTrigger'", "'RecieveSerialMsgTrigger'", "'StartJobTrigger'", "'StopJobTrigger'", "'PushButtomTrigger'", "'ConditionalAction'", "'sensorTerm'", "'logicalSymbol'", "'value'", "'unit'", "'ReadNodeMemoryAction'", "'condition'", "'WriteNodeMemoryAction'", "'SendMessageAction'", "'sendMessageTo'", "'BlinkAction'", "'led'", "'status'", "'SendSerialPortMsgAction'", "'mobile'", "'static'", "'BT'", "'Zigbee'", "'WLan'", "'RF'", "'leach'", "'lqrp'", "'spin'", "'aodv'", "'dodv'", "'dsr'", "'dsdv'", "'gsr'", "'heed'", "'gaf'", "'gear'", "'tbf'", "'ead'", "'pegasis'", "'teen'", "'speed'", "'ctp'", "'dismentation'", "'activeMessage'", "'equal'", "'greaterThan'", "'greaterOrEqualThan'", "'lessThan'", "'lessOrEqualThan'", "'notEqual'", "'led0'", "'led1'", "'led2'", "'on'", "'off'", "'toggle'", "'compression'", "'max'", "'min'", "'avg'", "'count'", "'classification'", "'event_detection'", "'tracking'", "'decision_making'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;
     	
        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SeNetApp";	
       	}
       	
       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSeNetApp"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:68:1: entryRuleSeNetApp returns [EObject current=null] : iv_ruleSeNetApp= ruleSeNetApp EOF ;
    public final EObject entryRuleSeNetApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeNetApp = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:69:2: (iv_ruleSeNetApp= ruleSeNetApp EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:70:2: iv_ruleSeNetApp= ruleSeNetApp EOF
            {
             newCompositeNode(grammarAccess.getSeNetAppRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSeNetApp_in_entryRuleSeNetApp75);
            iv_ruleSeNetApp=ruleSeNetApp();

            state._fsp--;

             current =iv_ruleSeNetApp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSeNetApp85); 

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
    // $ANTLR end "entryRuleSeNetApp"


    // $ANTLR start "ruleSeNetApp"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:77:1: ruleSeNetApp returns [EObject current=null] : ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleSeNetApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_jobs_8_0 = null;

        EObject lv_jobs_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:80:28: ( ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:81:1: ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:81:1: ( () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:81:2: () otherlv_1= 'SeNetApp' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )? (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:81:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSeNetAppAccess().getSeNetAppAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSeNetApp131); 

                	newLeafNode(otherlv_1, grammarAccess.getSeNetAppAccess().getSeNetAppKeyword_1());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSeNetAppAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSeNetApp152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSeNetApp164); 

                	newLeafNode(otherlv_3, grammarAccess.getSeNetAppAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:113:1: (otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:113:3: otherlv_4= 'id' ( (lv_id_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSeNetApp177); 

                        	newLeafNode(otherlv_4, grammarAccess.getSeNetAppAccess().getIdKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:117:1: ( (lv_id_5_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:118:1: (lv_id_5_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:118:1: (lv_id_5_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:119:3: lv_id_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeNetAppAccess().getIdEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSeNetApp198);
                    lv_id_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:135:4: (otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:135:6: otherlv_6= 'jobs' otherlv_7= '{' ( (lv_jobs_8_0= ruleAbstractJob ) ) (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSeNetApp213); 

                        	newLeafNode(otherlv_6, grammarAccess.getSeNetAppAccess().getJobsKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSeNetApp225); 

                        	newLeafNode(otherlv_7, grammarAccess.getSeNetAppAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:143:1: ( (lv_jobs_8_0= ruleAbstractJob ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:144:1: (lv_jobs_8_0= ruleAbstractJob )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:144:1: (lv_jobs_8_0= ruleAbstractJob )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:145:3: lv_jobs_8_0= ruleAbstractJob
                    {
                     
                    	        newCompositeNode(grammarAccess.getSeNetAppAccess().getJobsAbstractJobParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_ruleSeNetApp246);
                    lv_jobs_8_0=ruleAbstractJob();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
                    	        }
                           		add(
                           			current, 
                           			"jobs",
                            		lv_jobs_8_0, 
                            		"AbstractJob");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:161:2: (otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:161:4: otherlv_9= ',' ( (lv_jobs_10_0= ruleAbstractJob ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSeNetApp259); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSeNetAppAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:165:1: ( (lv_jobs_10_0= ruleAbstractJob ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:166:1: (lv_jobs_10_0= ruleAbstractJob )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:166:1: (lv_jobs_10_0= ruleAbstractJob )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:167:3: lv_jobs_10_0= ruleAbstractJob
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSeNetAppAccess().getJobsAbstractJobParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_ruleSeNetApp280);
                    	    lv_jobs_10_0=ruleAbstractJob();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSeNetAppRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobs",
                    	            		lv_jobs_10_0, 
                    	            		"AbstractJob");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSeNetApp294); 

                        	newLeafNode(otherlv_11, grammarAccess.getSeNetAppAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSeNetApp308); 

                	newLeafNode(otherlv_12, grammarAccess.getSeNetAppAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSeNetApp"


    // $ANTLR start "entryRuleAbstractJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:199:1: entryRuleAbstractJob returns [EObject current=null] : iv_ruleAbstractJob= ruleAbstractJob EOF ;
    public final EObject entryRuleAbstractJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractJob = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:200:2: (iv_ruleAbstractJob= ruleAbstractJob EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:201:2: iv_ruleAbstractJob= ruleAbstractJob EOF
            {
             newCompositeNode(grammarAccess.getAbstractJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractJob_in_entryRuleAbstractJob344);
            iv_ruleAbstractJob=ruleAbstractJob();

            state._fsp--;

             current =iv_ruleAbstractJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractJob354); 

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
    // $ANTLR end "entryRuleAbstractJob"


    // $ANTLR start "ruleAbstractJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:208:1: ruleAbstractJob returns [EObject current=null] : (this_NodeLevelJob_0= ruleNodeLevelJob | this_SenseNowJob_1= ruleSenseNowJob | this_SinkJob_2= ruleSinkJob | this_SenseJob_3= ruleSenseJob | this_NetworkLevelSpecialAlgorithm_4= ruleNetworkLevelSpecialAlgorithm | this_NetworkDataProcessing_5= ruleNetworkDataProcessing ) ;
    public final EObject ruleAbstractJob() throws RecognitionException {
        EObject current = null;

        EObject this_NodeLevelJob_0 = null;

        EObject this_SenseNowJob_1 = null;

        EObject this_SinkJob_2 = null;

        EObject this_SenseJob_3 = null;

        EObject this_NetworkLevelSpecialAlgorithm_4 = null;

        EObject this_NetworkDataProcessing_5 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:211:28: ( (this_NodeLevelJob_0= ruleNodeLevelJob | this_SenseNowJob_1= ruleSenseNowJob | this_SinkJob_2= ruleSinkJob | this_SenseJob_3= ruleSenseJob | this_NetworkLevelSpecialAlgorithm_4= ruleNetworkLevelSpecialAlgorithm | this_NetworkDataProcessing_5= ruleNetworkDataProcessing ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:212:1: (this_NodeLevelJob_0= ruleNodeLevelJob | this_SenseNowJob_1= ruleSenseNowJob | this_SinkJob_2= ruleSinkJob | this_SenseJob_3= ruleSenseJob | this_NetworkLevelSpecialAlgorithm_4= ruleNetworkLevelSpecialAlgorithm | this_NetworkDataProcessing_5= ruleNetworkDataProcessing )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:212:1: (this_NodeLevelJob_0= ruleNodeLevelJob | this_SenseNowJob_1= ruleSenseNowJob | this_SinkJob_2= ruleSinkJob | this_SenseJob_3= ruleSenseJob | this_NetworkLevelSpecialAlgorithm_4= ruleNetworkLevelSpecialAlgorithm | this_NetworkDataProcessing_5= ruleNetworkDataProcessing )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
                }
                break;
            case 33:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:213:5: this_NodeLevelJob_0= ruleNodeLevelJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getNodeLevelJobParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNodeLevelJob_in_ruleAbstractJob401);
                    this_NodeLevelJob_0=ruleNodeLevelJob();

                    state._fsp--;

                     
                            current = this_NodeLevelJob_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:223:5: this_SenseNowJob_1= ruleSenseNowJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getSenseNowJobParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSenseNowJob_in_ruleAbstractJob428);
                    this_SenseNowJob_1=ruleSenseNowJob();

                    state._fsp--;

                     
                            current = this_SenseNowJob_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:233:5: this_SinkJob_2= ruleSinkJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getSinkJobParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSinkJob_in_ruleAbstractJob455);
                    this_SinkJob_2=ruleSinkJob();

                    state._fsp--;

                     
                            current = this_SinkJob_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:243:5: this_SenseJob_3= ruleSenseJob
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getSenseJobParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSenseJob_in_ruleAbstractJob482);
                    this_SenseJob_3=ruleSenseJob();

                    state._fsp--;

                     
                            current = this_SenseJob_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:253:5: this_NetworkLevelSpecialAlgorithm_4= ruleNetworkLevelSpecialAlgorithm
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getNetworkLevelSpecialAlgorithmParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNetworkLevelSpecialAlgorithm_in_ruleAbstractJob509);
                    this_NetworkLevelSpecialAlgorithm_4=ruleNetworkLevelSpecialAlgorithm();

                    state._fsp--;

                     
                            current = this_NetworkLevelSpecialAlgorithm_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:263:5: this_NetworkDataProcessing_5= ruleNetworkDataProcessing
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractJobAccess().getNetworkDataProcessingParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNetworkDataProcessing_in_ruleAbstractJob536);
                    this_NetworkDataProcessing_5=ruleNetworkDataProcessing();

                    state._fsp--;

                     
                            current = this_NetworkDataProcessing_5; 
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
    // $ANTLR end "ruleAbstractJob"


    // $ANTLR start "entryRuleAbstractNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:279:1: entryRuleAbstractNode returns [EObject current=null] : iv_ruleAbstractNode= ruleAbstractNode EOF ;
    public final EObject entryRuleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:280:2: (iv_ruleAbstractNode= ruleAbstractNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:281:2: iv_ruleAbstractNode= ruleAbstractNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode571);
            iv_ruleAbstractNode=ruleAbstractNode();

            state._fsp--;

             current =iv_ruleAbstractNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNode581); 

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
    // $ANTLR end "entryRuleAbstractNode"


    // $ANTLR start "ruleAbstractNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:288:1: ruleAbstractNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode ) ;
    public final EObject ruleAbstractNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ClusterHeadNode_1 = null;

        EObject this_SinkNode_2 = null;

        EObject this_ComputationNode_3 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:291:28: ( (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:292:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:292:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode | this_SinkNode_2= ruleSinkNode | this_ComputationNode_3= ruleComputationNode )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            case 40:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:293:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractNode628);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:303:5: this_ClusterHeadNode_1= ruleClusterHeadNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getClusterHeadNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_ruleAbstractNode655);
                    this_ClusterHeadNode_1=ruleClusterHeadNode();

                    state._fsp--;

                     
                            current = this_ClusterHeadNode_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:313:5: this_SinkNode_2= ruleSinkNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getSinkNodeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_ruleAbstractNode682);
                    this_SinkNode_2=ruleSinkNode();

                    state._fsp--;

                     
                            current = this_SinkNode_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:323:5: this_ComputationNode_3= ruleComputationNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNodeAccess().getComputationNodeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_ruleAbstractNode709);
                    this_ComputationNode_3=ruleComputationNode();

                    state._fsp--;

                     
                            current = this_ComputationNode_3; 
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
    // $ANTLR end "ruleAbstractNode"


    // $ANTLR start "entryRuleAbstractNetwork"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:339:1: entryRuleAbstractNetwork returns [EObject current=null] : iv_ruleAbstractNetwork= ruleAbstractNetwork EOF ;
    public final EObject entryRuleAbstractNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractNetwork = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:340:2: (iv_ruleAbstractNetwork= ruleAbstractNetwork EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:341:2: iv_ruleAbstractNetwork= ruleAbstractNetwork EOF
            {
             newCompositeNode(grammarAccess.getAbstractNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_entryRuleAbstractNetwork744);
            iv_ruleAbstractNetwork=ruleAbstractNetwork();

            state._fsp--;

             current =iv_ruleAbstractNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractNetwork754); 

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
    // $ANTLR end "entryRuleAbstractNetwork"


    // $ANTLR start "ruleAbstractNetwork"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:348:1: ruleAbstractNetwork returns [EObject current=null] : (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork ) ;
    public final EObject ruleAbstractNetwork() throws RecognitionException {
        EObject current = null;

        EObject this_FlatNetwork_0 = null;

        EObject this_ClusteredNetwork_1 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:351:28: ( (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:352:1: (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:352:1: (this_FlatNetwork_0= ruleFlatNetwork | this_ClusteredNetwork_1= ruleClusteredNetwork )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            else if ( (LA6_0==56) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:353:5: this_FlatNetwork_0= ruleFlatNetwork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNetworkAccess().getFlatNetworkParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFlatNetwork_in_ruleAbstractNetwork801);
                    this_FlatNetwork_0=ruleFlatNetwork();

                    state._fsp--;

                     
                            current = this_FlatNetwork_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:363:5: this_ClusteredNetwork_1= ruleClusteredNetwork
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractNetworkAccess().getClusteredNetworkParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusteredNetwork_in_ruleAbstractNetwork828);
                    this_ClusteredNetwork_1=ruleClusteredNetwork();

                    state._fsp--;

                     
                            current = this_ClusteredNetwork_1; 
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
    // $ANTLR end "ruleAbstractNetwork"


    // $ANTLR start "entryRuleAbstractStartEndingJobTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:379:1: entryRuleAbstractStartEndingJobTrigger returns [EObject current=null] : iv_ruleAbstractStartEndingJobTrigger= ruleAbstractStartEndingJobTrigger EOF ;
    public final EObject entryRuleAbstractStartEndingJobTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStartEndingJobTrigger = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:380:2: (iv_ruleAbstractStartEndingJobTrigger= ruleAbstractStartEndingJobTrigger EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:381:2: iv_ruleAbstractStartEndingJobTrigger= ruleAbstractStartEndingJobTrigger EOF
            {
             newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_entryRuleAbstractStartEndingJobTrigger863);
            iv_ruleAbstractStartEndingJobTrigger=ruleAbstractStartEndingJobTrigger();

            state._fsp--;

             current =iv_ruleAbstractStartEndingJobTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractStartEndingJobTrigger873); 

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
    // $ANTLR end "entryRuleAbstractStartEndingJobTrigger"


    // $ANTLR start "ruleAbstractStartEndingJobTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:388:1: ruleAbstractStartEndingJobTrigger returns [EObject current=null] : (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger ) ;
    public final EObject ruleAbstractStartEndingJobTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_ReceiveMessageTrigger_0 = null;

        EObject this_RecieveSerialMsgTrigger_1 = null;

        EObject this_StartJobTrigger_Impl_2 = null;

        EObject this_StopJobTrigger_Impl_3 = null;

        EObject this_PushButtomTrigger_4 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:391:28: ( (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:392:1: (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:392:1: (this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger | this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger | this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl | this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl | this_PushButtomTrigger_4= rulePushButtomTrigger )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt7=1;
                }
                break;
            case 62:
                {
                alt7=2;
                }
                break;
            case 63:
                {
                alt7=3;
                }
                break;
            case 64:
                {
                alt7=4;
                }
                break;
            case 65:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:393:5: this_ReceiveMessageTrigger_0= ruleReceiveMessageTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getReceiveMessageTriggerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReceiveMessageTrigger_in_ruleAbstractStartEndingJobTrigger920);
                    this_ReceiveMessageTrigger_0=ruleReceiveMessageTrigger();

                    state._fsp--;

                     
                            current = this_ReceiveMessageTrigger_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:403:5: this_RecieveSerialMsgTrigger_1= ruleRecieveSerialMsgTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getRecieveSerialMsgTriggerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRecieveSerialMsgTrigger_in_ruleAbstractStartEndingJobTrigger947);
                    this_RecieveSerialMsgTrigger_1=ruleRecieveSerialMsgTrigger();

                    state._fsp--;

                     
                            current = this_RecieveSerialMsgTrigger_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:413:5: this_StartJobTrigger_Impl_2= ruleStartJobTrigger_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getStartJobTrigger_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStartJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger974);
                    this_StartJobTrigger_Impl_2=ruleStartJobTrigger_Impl();

                    state._fsp--;

                     
                            current = this_StartJobTrigger_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:423:5: this_StopJobTrigger_Impl_3= ruleStopJobTrigger_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getStopJobTrigger_ImplParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStopJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger1001);
                    this_StopJobTrigger_Impl_3=ruleStopJobTrigger_Impl();

                    state._fsp--;

                     
                            current = this_StopJobTrigger_Impl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:433:5: this_PushButtomTrigger_4= rulePushButtomTrigger
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractStartEndingJobTriggerAccess().getPushButtomTriggerParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePushButtomTrigger_in_ruleAbstractStartEndingJobTrigger1028);
                    this_PushButtomTrigger_4=rulePushButtomTrigger();

                    state._fsp--;

                     
                            current = this_PushButtomTrigger_4; 
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
    // $ANTLR end "ruleAbstractStartEndingJobTrigger"


    // $ANTLR start "entryRuleAbstratAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:449:1: entryRuleAbstratAction returns [EObject current=null] : iv_ruleAbstratAction= ruleAbstratAction EOF ;
    public final EObject entryRuleAbstratAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstratAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:450:2: (iv_ruleAbstratAction= ruleAbstratAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:451:2: iv_ruleAbstratAction= ruleAbstratAction EOF
            {
             newCompositeNode(grammarAccess.getAbstratActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_entryRuleAbstratAction1063);
            iv_ruleAbstratAction=ruleAbstratAction();

            state._fsp--;

             current =iv_ruleAbstratAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstratAction1073); 

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
    // $ANTLR end "entryRuleAbstratAction"


    // $ANTLR start "ruleAbstratAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:458:1: ruleAbstratAction returns [EObject current=null] : (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction ) ;
    public final EObject ruleAbstratAction() throws RecognitionException {
        EObject current = null;

        EObject this_ReadNodeMemoryAction_0 = null;

        EObject this_WriteNodeMemoryAction_1 = null;

        EObject this_SendMessageAction_2 = null;

        EObject this_BlinkAction_3 = null;

        EObject this_SendSerialPortMsgAction_4 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:461:28: ( (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:462:1: (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:462:1: (this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction | this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction | this_SendMessageAction_2= ruleSendMessageAction | this_BlinkAction_3= ruleBlinkAction | this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt8=1;
                }
                break;
            case 73:
                {
                alt8=2;
                }
                break;
            case 74:
                {
                alt8=3;
                }
                break;
            case 76:
                {
                alt8=4;
                }
                break;
            case 79:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:463:5: this_ReadNodeMemoryAction_0= ruleReadNodeMemoryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getReadNodeMemoryActionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReadNodeMemoryAction_in_ruleAbstratAction1120);
                    this_ReadNodeMemoryAction_0=ruleReadNodeMemoryAction();

                    state._fsp--;

                     
                            current = this_ReadNodeMemoryAction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:473:5: this_WriteNodeMemoryAction_1= ruleWriteNodeMemoryAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getWriteNodeMemoryActionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWriteNodeMemoryAction_in_ruleAbstratAction1147);
                    this_WriteNodeMemoryAction_1=ruleWriteNodeMemoryAction();

                    state._fsp--;

                     
                            current = this_WriteNodeMemoryAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:483:5: this_SendMessageAction_2= ruleSendMessageAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getSendMessageActionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSendMessageAction_in_ruleAbstratAction1174);
                    this_SendMessageAction_2=ruleSendMessageAction();

                    state._fsp--;

                     
                            current = this_SendMessageAction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:493:5: this_BlinkAction_3= ruleBlinkAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getBlinkActionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBlinkAction_in_ruleAbstratAction1201);
                    this_BlinkAction_3=ruleBlinkAction();

                    state._fsp--;

                     
                            current = this_BlinkAction_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:503:5: this_SendSerialPortMsgAction_4= ruleSendSerialPortMsgAction
                    {
                     
                            newCompositeNode(grammarAccess.getAbstratActionAccess().getSendSerialPortMsgActionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSendSerialPortMsgAction_in_ruleAbstratAction1228);
                    this_SendSerialPortMsgAction_4=ruleSendSerialPortMsgAction();

                    state._fsp--;

                     
                            current = this_SendSerialPortMsgAction_4; 
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
    // $ANTLR end "ruleAbstratAction"


    // $ANTLR start "entryRuleAbstractSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:519:1: entryRuleAbstractSensor returns [EObject current=null] : iv_ruleAbstractSensor= ruleAbstractSensor EOF ;
    public final EObject entryRuleAbstractSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:520:2: (iv_ruleAbstractSensor= ruleAbstractSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:521:2: iv_ruleAbstractSensor= ruleAbstractSensor EOF
            {
             newCompositeNode(grammarAccess.getAbstractSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_entryRuleAbstractSensor1263);
            iv_ruleAbstractSensor=ruleAbstractSensor();

            state._fsp--;

             current =iv_ruleAbstractSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractSensor1273); 

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
    // $ANTLR end "entryRuleAbstractSensor"


    // $ANTLR start "ruleAbstractSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:528:1: ruleAbstractSensor returns [EObject current=null] : (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor ) ;
    public final EObject ruleAbstractSensor() throws RecognitionException {
        EObject current = null;

        EObject this_AccelerometerSensor_0 = null;

        EObject this_LightSensor_1 = null;

        EObject this_LocationSensor_2 = null;

        EObject this_MicrophoneSensor_3 = null;

        EObject this_TemperatureSensor_4 = null;

        EObject this_PressureSensor_5 = null;

        EObject this_HumiditySensor_6 = null;

        EObject this_VoltageSensor_7 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:531:28: ( (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:532:1: (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:532:1: (this_AccelerometerSensor_0= ruleAccelerometerSensor | this_LightSensor_1= ruleLightSensor | this_LocationSensor_2= ruleLocationSensor | this_MicrophoneSensor_3= ruleMicrophoneSensor | this_TemperatureSensor_4= ruleTemperatureSensor | this_PressureSensor_5= rulePressureSensor | this_HumiditySensor_6= ruleHumiditySensor | this_VoltageSensor_7= ruleVoltageSensor )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt9=1;
                }
                break;
            case 42:
                {
                alt9=2;
                }
                break;
            case 43:
                {
                alt9=3;
                }
                break;
            case 44:
                {
                alt9=4;
                }
                break;
            case 45:
                {
                alt9=5;
                }
                break;
            case 46:
                {
                alt9=6;
                }
                break;
            case 47:
                {
                alt9=7;
                }
                break;
            case 48:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:533:5: this_AccelerometerSensor_0= ruleAccelerometerSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getAccelerometerSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccelerometerSensor_in_ruleAbstractSensor1320);
                    this_AccelerometerSensor_0=ruleAccelerometerSensor();

                    state._fsp--;

                     
                            current = this_AccelerometerSensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:543:5: this_LightSensor_1= ruleLightSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getLightSensorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_ruleAbstractSensor1347);
                    this_LightSensor_1=ruleLightSensor();

                    state._fsp--;

                     
                            current = this_LightSensor_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:553:5: this_LocationSensor_2= ruleLocationSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getLocationSensorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocationSensor_in_ruleAbstractSensor1374);
                    this_LocationSensor_2=ruleLocationSensor();

                    state._fsp--;

                     
                            current = this_LocationSensor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:563:5: this_MicrophoneSensor_3= ruleMicrophoneSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getMicrophoneSensorParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMicrophoneSensor_in_ruleAbstractSensor1401);
                    this_MicrophoneSensor_3=ruleMicrophoneSensor();

                    state._fsp--;

                     
                            current = this_MicrophoneSensor_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:573:5: this_TemperatureSensor_4= ruleTemperatureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getTemperatureSensorParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_ruleAbstractSensor1428);
                    this_TemperatureSensor_4=ruleTemperatureSensor();

                    state._fsp--;

                     
                            current = this_TemperatureSensor_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:583:5: this_PressureSensor_5= rulePressureSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getPressureSensorParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_ruleAbstractSensor1455);
                    this_PressureSensor_5=rulePressureSensor();

                    state._fsp--;

                     
                            current = this_PressureSensor_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:593:5: this_HumiditySensor_6= ruleHumiditySensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getHumiditySensorParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_ruleAbstractSensor1482);
                    this_HumiditySensor_6=ruleHumiditySensor();

                    state._fsp--;

                     
                            current = this_HumiditySensor_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:603:5: this_VoltageSensor_7= ruleVoltageSensor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSensorAccess().getVoltageSensorParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVoltageSensor_in_ruleAbstractSensor1509);
                    this_VoltageSensor_7=ruleVoltageSensor();

                    state._fsp--;

                     
                            current = this_VoltageSensor_7; 
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
    // $ANTLR end "ruleAbstractSensor"


    // $ANTLR start "entryRuleAbstractFlatNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:619:1: entryRuleAbstractFlatNode returns [EObject current=null] : iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF ;
    public final EObject entryRuleAbstractFlatNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFlatNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:620:2: (iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:621:2: iv_ruleAbstractFlatNode= ruleAbstractFlatNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractFlatNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_entryRuleAbstractFlatNode1544);
            iv_ruleAbstractFlatNode=ruleAbstractFlatNode();

            state._fsp--;

             current =iv_ruleAbstractFlatNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractFlatNode1554); 

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
    // $ANTLR end "entryRuleAbstractFlatNode"


    // $ANTLR start "ruleAbstractFlatNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:628:1: ruleAbstractFlatNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode ) ;
    public final EObject ruleAbstractFlatNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ComputationNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:631:28: ( (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:632:1: (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:632:1: (this_SensorNode_0= ruleSensorNode | this_ComputationNode_1= ruleComputationNode )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            else if ( (LA10_0==40) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:633:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFlatNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractFlatNode1601);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:643:5: this_ComputationNode_1= ruleComputationNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFlatNodeAccess().getComputationNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_ruleAbstractFlatNode1628);
                    this_ComputationNode_1=ruleComputationNode();

                    state._fsp--;

                     
                            current = this_ComputationNode_1; 
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
    // $ANTLR end "ruleAbstractFlatNode"


    // $ANTLR start "entryRuleAbstractClusterNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:659:1: entryRuleAbstractClusterNode returns [EObject current=null] : iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF ;
    public final EObject entryRuleAbstractClusterNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractClusterNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:660:2: (iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:661:2: iv_ruleAbstractClusterNode= ruleAbstractClusterNode EOF
            {
             newCompositeNode(grammarAccess.getAbstractClusterNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_entryRuleAbstractClusterNode1663);
            iv_ruleAbstractClusterNode=ruleAbstractClusterNode();

            state._fsp--;

             current =iv_ruleAbstractClusterNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractClusterNode1673); 

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
    // $ANTLR end "entryRuleAbstractClusterNode"


    // $ANTLR start "ruleAbstractClusterNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:668:1: ruleAbstractClusterNode returns [EObject current=null] : (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode ) ;
    public final EObject ruleAbstractClusterNode() throws RecognitionException {
        EObject current = null;

        EObject this_SensorNode_0 = null;

        EObject this_ClusterHeadNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:671:28: ( (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:672:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:672:1: (this_SensorNode_0= ruleSensorNode | this_ClusterHeadNode_1= ruleClusterHeadNode )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:673:5: this_SensorNode_0= ruleSensorNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractClusterNodeAccess().getSensorNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_ruleAbstractClusterNode1720);
                    this_SensorNode_0=ruleSensorNode();

                    state._fsp--;

                     
                            current = this_SensorNode_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:683:5: this_ClusterHeadNode_1= ruleClusterHeadNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractClusterNodeAccess().getClusterHeadNodeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_ruleAbstractClusterNode1747);
                    this_ClusterHeadNode_1=ruleClusterHeadNode();

                    state._fsp--;

                     
                            current = this_ClusterHeadNode_1; 
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
    // $ANTLR end "ruleAbstractClusterNode"


    // $ANTLR start "entryRuleEInt"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:699:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:700:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:701:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1783);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1794); 

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
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:708:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:711:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:712:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:712:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:712:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:712:2: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:713:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEInt1833); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1850); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:733:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:734:2: (iv_ruleEString= ruleEString EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:735:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1896);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1907); 

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
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:742:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:745:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:746:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:746:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:746:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1947); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:754:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1973); 

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


    // $ANTLR start "entryRuleNodeLevelJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:769:1: entryRuleNodeLevelJob returns [EObject current=null] : iv_ruleNodeLevelJob= ruleNodeLevelJob EOF ;
    public final EObject entryRuleNodeLevelJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLevelJob = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:770:2: (iv_ruleNodeLevelJob= ruleNodeLevelJob EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:771:2: iv_ruleNodeLevelJob= ruleNodeLevelJob EOF
            {
             newCompositeNode(grammarAccess.getNodeLevelJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNodeLevelJob_in_entryRuleNodeLevelJob2018);
            iv_ruleNodeLevelJob=ruleNodeLevelJob();

            state._fsp--;

             current =iv_ruleNodeLevelJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNodeLevelJob2028); 

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
    // $ANTLR end "entryRuleNodeLevelJob"


    // $ANTLR start "ruleNodeLevelJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:778:1: ruleNodeLevelJob returns [EObject current=null] : ( () otherlv_1= 'NodeLevelJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) ) )? (otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) ) )? (otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleNodeLevelJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_nodeDataProcessing_6_0 = null;

        AntlrDatatypeRuleToken lv_sensingSamplingRate_8_0 = null;

        AntlrDatatypeRuleToken lv_dataProcessingRate_10_0 = null;

        EObject lv_JobTargetNode_12_0 = null;

        EObject lv_JobTargetNetwork_14_0 = null;

        EObject lv_startEndTrigger_17_0 = null;

        EObject lv_startEndTrigger_19_0 = null;

        EObject lv_jobaction_23_0 = null;

        EObject lv_jobaction_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:781:28: ( ( () otherlv_1= 'NodeLevelJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) ) )? (otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) ) )? (otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:782:1: ( () otherlv_1= 'NodeLevelJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) ) )? (otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) ) )? (otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:782:1: ( () otherlv_1= 'NodeLevelJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) ) )? (otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) ) )? (otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:782:2: () otherlv_1= 'NodeLevelJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) ) )? (otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) ) )? (otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}' )? (otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:782:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:783:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNodeLevelJobAccess().getNodeLevelJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleNodeLevelJob2074); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeLevelJobAccess().getNodeLevelJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNodeLevelJob2086); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeLevelJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:796:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:796:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNodeLevelJob2099); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeLevelJobAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:800:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:801:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:801:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:802:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNodeLevelJob2120);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:818:4: (otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:818:6: otherlv_5= 'nodeDataProcessing' ( (lv_nodeDataProcessing_6_0= ruleAggregation ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNodeLevelJob2135); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeLevelJobAccess().getNodeDataProcessingKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:822:1: ( (lv_nodeDataProcessing_6_0= ruleAggregation ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:823:1: (lv_nodeDataProcessing_6_0= ruleAggregation )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:823:1: (lv_nodeDataProcessing_6_0= ruleAggregation )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:824:3: lv_nodeDataProcessing_6_0= ruleAggregation
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getNodeDataProcessingAggregationEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAggregation_in_ruleNodeLevelJob2156);
                    lv_nodeDataProcessing_6_0=ruleAggregation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		set(
                           			current, 
                           			"nodeDataProcessing",
                            		lv_nodeDataProcessing_6_0, 
                            		"Aggregation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:840:4: (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:840:6: otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNodeLevelJob2171); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeLevelJobAccess().getSensingSamplingRateKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:844:1: ( (lv_sensingSamplingRate_8_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:845:1: (lv_sensingSamplingRate_8_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:845:1: (lv_sensingSamplingRate_8_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:846:3: lv_sensingSamplingRate_8_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getSensingSamplingRateELongParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleNodeLevelJob2192);
                    lv_sensingSamplingRate_8_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		set(
                           			current, 
                           			"sensingSamplingRate",
                            		lv_sensingSamplingRate_8_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:862:4: (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:862:6: otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNodeLevelJob2207); 

                        	newLeafNode(otherlv_9, grammarAccess.getNodeLevelJobAccess().getDataProcessingRateKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:866:1: ( (lv_dataProcessingRate_10_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:867:1: (lv_dataProcessingRate_10_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:867:1: (lv_dataProcessingRate_10_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:868:3: lv_dataProcessingRate_10_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getDataProcessingRateELongParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleNodeLevelJob2228);
                    lv_dataProcessingRate_10_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		set(
                           			current, 
                           			"dataProcessingRate",
                            		lv_dataProcessingRate_10_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:884:4: (otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:884:6: otherlv_11= 'JobTargetNode' ( (lv_JobTargetNode_12_0= ruleAbstractNode ) )
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNodeLevelJob2243); 

                        	newLeafNode(otherlv_11, grammarAccess.getNodeLevelJobAccess().getJobTargetNodeKeyword_7_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:888:1: ( (lv_JobTargetNode_12_0= ruleAbstractNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:889:1: (lv_JobTargetNode_12_0= ruleAbstractNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:889:1: (lv_JobTargetNode_12_0= ruleAbstractNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:890:3: lv_JobTargetNode_12_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleNodeLevelJob2264);
                    lv_JobTargetNode_12_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_12_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:906:4: (otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:906:6: otherlv_13= 'JobTargetNetwork' ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) )
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNodeLevelJob2279); 

                        	newLeafNode(otherlv_13, grammarAccess.getNodeLevelJobAccess().getJobTargetNetworkKeyword_8_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:910:1: ( (lv_JobTargetNetwork_14_0= ruleAbstractNetwork ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:911:1: (lv_JobTargetNetwork_14_0= ruleAbstractNetwork )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:911:1: (lv_JobTargetNetwork_14_0= ruleAbstractNetwork )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:912:3: lv_JobTargetNetwork_14_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleNodeLevelJob2300);
                    lv_JobTargetNetwork_14_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_14_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:928:4: (otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:928:6: otherlv_15= 'startEndTrigger' otherlv_16= '{' ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNodeLevelJob2315); 

                        	newLeafNode(otherlv_15, grammarAccess.getNodeLevelJobAccess().getStartEndTriggerKeyword_9_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNodeLevelJob2327); 

                        	newLeafNode(otherlv_16, grammarAccess.getNodeLevelJobAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:936:1: ( (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:937:1: (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:937:1: (lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:938:3: lv_startEndTrigger_17_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNodeLevelJob2348);
                    lv_startEndTrigger_17_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_17_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:954:2: (otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:954:4: otherlv_18= ',' ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNodeLevelJob2361); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getNodeLevelJobAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:958:1: ( (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:959:1: (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:959:1: (lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:960:3: lv_startEndTrigger_19_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNodeLevelJob2382);
                    	    lv_startEndTrigger_19_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_19_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNodeLevelJob2396); 

                        	newLeafNode(otherlv_20, grammarAccess.getNodeLevelJobAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:980:3: (otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:980:5: otherlv_21= 'jobaction' otherlv_22= '{' ( (lv_jobaction_23_0= ruleAbstratAction ) ) (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNodeLevelJob2411); 

                        	newLeafNode(otherlv_21, grammarAccess.getNodeLevelJobAccess().getJobactionKeyword_10_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNodeLevelJob2423); 

                        	newLeafNode(otherlv_22, grammarAccess.getNodeLevelJobAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:988:1: ( (lv_jobaction_23_0= ruleAbstratAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:989:1: (lv_jobaction_23_0= ruleAbstratAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:989:1: (lv_jobaction_23_0= ruleAbstratAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:990:3: lv_jobaction_23_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getJobactionAbstratActionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleNodeLevelJob2444);
                    lv_jobaction_23_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_23_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1006:2: (otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1006:4: otherlv_24= ',' ( (lv_jobaction_25_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNodeLevelJob2457); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getNodeLevelJobAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1010:1: ( (lv_jobaction_25_0= ruleAbstratAction ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1011:1: (lv_jobaction_25_0= ruleAbstratAction )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1011:1: (lv_jobaction_25_0= ruleAbstratAction )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1012:3: lv_jobaction_25_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeLevelJobAccess().getJobactionAbstratActionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleNodeLevelJob2478);
                    	    lv_jobaction_25_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeLevelJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_25_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNodeLevelJob2492); 

                        	newLeafNode(otherlv_26, grammarAccess.getNodeLevelJobAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_27=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNodeLevelJob2506); 

                	newLeafNode(otherlv_27, grammarAccess.getNodeLevelJobAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleNodeLevelJob"


    // $ANTLR start "entryRuleSenseNowJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1044:1: entryRuleSenseNowJob returns [EObject current=null] : iv_ruleSenseNowJob= ruleSenseNowJob EOF ;
    public final EObject entryRuleSenseNowJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenseNowJob = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1045:2: (iv_ruleSenseNowJob= ruleSenseNowJob EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1046:2: iv_ruleSenseNowJob= ruleSenseNowJob EOF
            {
             newCompositeNode(grammarAccess.getSenseNowJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSenseNowJob_in_entryRuleSenseNowJob2542);
            iv_ruleSenseNowJob=ruleSenseNowJob();

            state._fsp--;

             current =iv_ruleSenseNowJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSenseNowJob2552); 

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
    // $ANTLR end "entryRuleSenseNowJob"


    // $ANTLR start "ruleSenseNowJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1053:1: ruleSenseNowJob returns [EObject current=null] : ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleSenseNowJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_JobTargetNode_6_0 = null;

        EObject lv_JobTargetNetwork_8_0 = null;

        EObject lv_startEndTrigger_11_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_jobaction_17_0 = null;

        EObject lv_jobaction_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1056:28: ( ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1057:1: ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1057:1: ( () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1057:2: () otherlv_1= 'SenseNowJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1057:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1058:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSenseNowJobAccess().getSenseNowJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSenseNowJob2598); 

                	newLeafNode(otherlv_1, grammarAccess.getSenseNowJobAccess().getSenseNowJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseNowJob2610); 

                	newLeafNode(otherlv_2, grammarAccess.getSenseNowJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1071:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1071:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSenseNowJob2623); 

                        	newLeafNode(otherlv_3, grammarAccess.getSenseNowJobAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1075:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1076:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1076:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1077:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSenseNowJob2644);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1093:4: (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1093:6: otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSenseNowJob2659); 

                        	newLeafNode(otherlv_5, grammarAccess.getSenseNowJobAccess().getJobTargetNodeKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1097:1: ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1098:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1098:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1099:3: lv_JobTargetNode_6_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleSenseNowJob2680);
                    lv_JobTargetNode_6_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_6_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1115:4: (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1115:6: otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSenseNowJob2695); 

                        	newLeafNode(otherlv_7, grammarAccess.getSenseNowJobAccess().getJobTargetNetworkKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1119:1: ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1120:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1120:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1121:3: lv_JobTargetNetwork_8_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleSenseNowJob2716);
                    lv_JobTargetNetwork_8_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_8_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1137:4: (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1137:6: otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSenseNowJob2731); 

                        	newLeafNode(otherlv_9, grammarAccess.getSenseNowJobAccess().getStartEndTriggerKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseNowJob2743); 

                        	newLeafNode(otherlv_10, grammarAccess.getSenseNowJobAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1145:1: ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1146:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1146:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1147:3: lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob2764);
                    lv_startEndTrigger_11_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_11_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1163:2: (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1163:4: otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseNowJob2777); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSenseNowJobAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1167:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1168:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1168:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1169:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob2798);
                    	    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_13_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseNowJob2812); 

                        	newLeafNode(otherlv_14, grammarAccess.getSenseNowJobAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1189:3: (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1189:5: otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSenseNowJob2827); 

                        	newLeafNode(otherlv_15, grammarAccess.getSenseNowJobAccess().getJobactionKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseNowJob2839); 

                        	newLeafNode(otherlv_16, grammarAccess.getSenseNowJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1197:1: ( (lv_jobaction_17_0= ruleAbstratAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1198:1: (lv_jobaction_17_0= ruleAbstratAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1198:1: (lv_jobaction_17_0= ruleAbstratAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1199:3: lv_jobaction_17_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobactionAbstratActionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseNowJob2860);
                    lv_jobaction_17_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_17_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1215:2: (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1215:4: otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseNowJob2873); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSenseNowJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1219:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1220:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1220:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1221:3: lv_jobaction_19_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseNowJobAccess().getJobactionAbstratActionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseNowJob2894);
                    	    lv_jobaction_19_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseNowJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_19_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseNowJob2908); 

                        	newLeafNode(otherlv_20, grammarAccess.getSenseNowJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseNowJob2922); 

                	newLeafNode(otherlv_21, grammarAccess.getSenseNowJobAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSenseNowJob"


    // $ANTLR start "entryRuleSinkJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1253:1: entryRuleSinkJob returns [EObject current=null] : iv_ruleSinkJob= ruleSinkJob EOF ;
    public final EObject entryRuleSinkJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkJob = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1254:2: (iv_ruleSinkJob= ruleSinkJob EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1255:2: iv_ruleSinkJob= ruleSinkJob EOF
            {
             newCompositeNode(grammarAccess.getSinkJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSinkJob_in_entryRuleSinkJob2958);
            iv_ruleSinkJob=ruleSinkJob();

            state._fsp--;

             current =iv_ruleSinkJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSinkJob2968); 

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
    // $ANTLR end "entryRuleSinkJob"


    // $ANTLR start "ruleSinkJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1262:1: ruleSinkJob returns [EObject current=null] : ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleSinkJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_JobTargetNode_6_0 = null;

        EObject lv_JobTargetNetwork_8_0 = null;

        EObject lv_startEndTrigger_11_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_jobaction_17_0 = null;

        EObject lv_jobaction_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1265:28: ( ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1266:1: ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1266:1: ( () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1266:2: () otherlv_1= 'SinkJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )? (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )? (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )? (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1266:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1267:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinkJobAccess().getSinkJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSinkJob3014); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkJobAccess().getSinkJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkJob3026); 

                	newLeafNode(otherlv_2, grammarAccess.getSinkJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1280:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1280:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSinkJob3039); 

                        	newLeafNode(otherlv_3, grammarAccess.getSinkJobAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1284:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1285:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1285:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1286:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSinkJob3060);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1302:4: (otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1302:6: otherlv_5= 'JobTargetNode' ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    {
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSinkJob3075); 

                        	newLeafNode(otherlv_5, grammarAccess.getSinkJobAccess().getJobTargetNodeKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1306:1: ( (lv_JobTargetNode_6_0= ruleAbstractNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1307:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1307:1: (lv_JobTargetNode_6_0= ruleAbstractNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1308:3: lv_JobTargetNode_6_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleSinkJob3096);
                    lv_JobTargetNode_6_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_6_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1324:4: (otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1324:6: otherlv_7= 'JobTargetNetwork' ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSinkJob3111); 

                        	newLeafNode(otherlv_7, grammarAccess.getSinkJobAccess().getJobTargetNetworkKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1328:1: ( (lv_JobTargetNetwork_8_0= ruleAbstractNetwork ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1329:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1329:1: (lv_JobTargetNetwork_8_0= ruleAbstractNetwork )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1330:3: lv_JobTargetNetwork_8_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleSinkJob3132);
                    lv_JobTargetNetwork_8_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_8_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1346:4: (otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1346:6: otherlv_9= 'startEndTrigger' otherlv_10= '{' ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSinkJob3147); 

                        	newLeafNode(otherlv_9, grammarAccess.getSinkJobAccess().getStartEndTriggerKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkJob3159); 

                        	newLeafNode(otherlv_10, grammarAccess.getSinkJobAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1354:1: ( (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1355:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1355:1: (lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1356:3: lv_startEndTrigger_11_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob3180);
                    lv_startEndTrigger_11_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_11_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1372:2: (otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1372:4: otherlv_12= ',' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSinkJob3193); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSinkJobAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1376:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1377:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1377:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1378:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob3214);
                    	    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_13_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkJob3228); 

                        	newLeafNode(otherlv_14, grammarAccess.getSinkJobAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1398:3: (otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1398:5: otherlv_15= 'jobaction' otherlv_16= '{' ( (lv_jobaction_17_0= ruleAbstratAction ) ) (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSinkJob3243); 

                        	newLeafNode(otherlv_15, grammarAccess.getSinkJobAccess().getJobactionKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkJob3255); 

                        	newLeafNode(otherlv_16, grammarAccess.getSinkJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1406:1: ( (lv_jobaction_17_0= ruleAbstratAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1407:1: (lv_jobaction_17_0= ruleAbstratAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1407:1: (lv_jobaction_17_0= ruleAbstratAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1408:3: lv_jobaction_17_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobactionAbstratActionParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSinkJob3276);
                    lv_jobaction_17_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_17_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1424:2: (otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1424:4: otherlv_18= ',' ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSinkJob3289); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSinkJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1428:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1429:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1429:1: (lv_jobaction_19_0= ruleAbstratAction )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1430:3: lv_jobaction_19_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkJobAccess().getJobactionAbstratActionParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSinkJob3310);
                    	    lv_jobaction_19_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinkJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_19_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkJob3324); 

                        	newLeafNode(otherlv_20, grammarAccess.getSinkJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkJob3338); 

                	newLeafNode(otherlv_21, grammarAccess.getSinkJobAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSinkJob"


    // $ANTLR start "entryRuleSenseJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1462:1: entryRuleSenseJob returns [EObject current=null] : iv_ruleSenseJob= ruleSenseJob EOF ;
    public final EObject entryRuleSenseJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenseJob = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1463:2: (iv_ruleSenseJob= ruleSenseJob EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1464:2: iv_ruleSenseJob= ruleSenseJob EOF
            {
             newCompositeNode(grammarAccess.getSenseJobRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSenseJob_in_entryRuleSenseJob3374);
            iv_ruleSenseJob=ruleSenseJob();

            state._fsp--;

             current =iv_ruleSenseJob; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSenseJob3384); 

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
    // $ANTLR end "entryRuleSenseJob"


    // $ANTLR start "ruleSenseJob"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1471:1: ruleSenseJob returns [EObject current=null] : ( () otherlv_1= 'SenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleSenseJob() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_sensingSamplingRate_6_0 = null;

        EObject lv_JobTargetNode_8_0 = null;

        EObject lv_JobTargetNetwork_10_0 = null;

        EObject lv_startEndTrigger_13_0 = null;

        EObject lv_startEndTrigger_15_0 = null;

        EObject lv_jobaction_19_0 = null;

        EObject lv_jobaction_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1474:28: ( ( () otherlv_1= 'SenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1475:1: ( () otherlv_1= 'SenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1475:1: ( () otherlv_1= 'SenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1475:2: () otherlv_1= 'SenseJob' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) ) )? (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )? (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )? (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )? (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1475:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1476:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSenseJobAccess().getSenseJobAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSenseJob3430); 

                	newLeafNode(otherlv_1, grammarAccess.getSenseJobAccess().getSenseJobKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseJob3442); 

                	newLeafNode(otherlv_2, grammarAccess.getSenseJobAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1489:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1489:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSenseJob3455); 

                        	newLeafNode(otherlv_3, grammarAccess.getSenseJobAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1493:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1494:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1494:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1495:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseJobAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSenseJob3476);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1511:4: (otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1511:6: otherlv_5= 'sensingSamplingRate' ( (lv_sensingSamplingRate_6_0= ruleELong ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSenseJob3491); 

                        	newLeafNode(otherlv_5, grammarAccess.getSenseJobAccess().getSensingSamplingRateKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1515:1: ( (lv_sensingSamplingRate_6_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1516:1: (lv_sensingSamplingRate_6_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1516:1: (lv_sensingSamplingRate_6_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1517:3: lv_sensingSamplingRate_6_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseJobAccess().getSensingSamplingRateELongParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleSenseJob3512);
                    lv_sensingSamplingRate_6_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"sensingSamplingRate",
                            		lv_sensingSamplingRate_6_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1533:4: (otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1533:6: otherlv_7= 'JobTargetNode' ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSenseJob3527); 

                        	newLeafNode(otherlv_7, grammarAccess.getSenseJobAccess().getJobTargetNodeKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1537:1: ( (lv_JobTargetNode_8_0= ruleAbstractNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1538:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1538:1: (lv_JobTargetNode_8_0= ruleAbstractNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1539:3: lv_JobTargetNode_8_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseJobAccess().getJobTargetNodeAbstractNodeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleSenseJob3548);
                    lv_JobTargetNode_8_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_8_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1555:4: (otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1555:6: otherlv_9= 'JobTargetNetwork' ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    {
                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSenseJob3563); 

                        	newLeafNode(otherlv_9, grammarAccess.getSenseJobAccess().getJobTargetNetworkKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1559:1: ( (lv_JobTargetNetwork_10_0= ruleAbstractNetwork ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1560:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1560:1: (lv_JobTargetNetwork_10_0= ruleAbstractNetwork )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1561:3: lv_JobTargetNetwork_10_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseJobAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleSenseJob3584);
                    lv_JobTargetNetwork_10_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_10_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1577:4: (otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==24) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1577:6: otherlv_11= 'startEndTrigger' otherlv_12= '{' ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSenseJob3599); 

                        	newLeafNode(otherlv_11, grammarAccess.getSenseJobAccess().getStartEndTriggerKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseJob3611); 

                        	newLeafNode(otherlv_12, grammarAccess.getSenseJobAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1585:1: ( (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1586:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1586:1: (lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1587:3: lv_startEndTrigger_13_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseJob3632);
                    lv_startEndTrigger_13_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_13_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1603:2: (otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==15) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1603:4: otherlv_14= ',' ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseJob3645); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSenseJobAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1607:1: ( (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1608:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1608:1: (lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1609:3: lv_startEndTrigger_15_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseJobAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseJob3666);
                    	    lv_startEndTrigger_15_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_15_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseJob3680); 

                        	newLeafNode(otherlv_16, grammarAccess.getSenseJobAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1629:3: (otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1629:5: otherlv_17= 'jobaction' otherlv_18= '{' ( (lv_jobaction_19_0= ruleAbstratAction ) ) (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSenseJob3695); 

                        	newLeafNode(otherlv_17, grammarAccess.getSenseJobAccess().getJobactionKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSenseJob3707); 

                        	newLeafNode(otherlv_18, grammarAccess.getSenseJobAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1637:1: ( (lv_jobaction_19_0= ruleAbstratAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1638:1: (lv_jobaction_19_0= ruleAbstratAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1638:1: (lv_jobaction_19_0= ruleAbstratAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1639:3: lv_jobaction_19_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSenseJobAccess().getJobactionAbstratActionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseJob3728);
                    lv_jobaction_19_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_19_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1655:2: (otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==15) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1655:4: otherlv_20= ',' ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSenseJob3741); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getSenseJobAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1659:1: ( (lv_jobaction_21_0= ruleAbstratAction ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1660:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1660:1: (lv_jobaction_21_0= ruleAbstratAction )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1661:3: lv_jobaction_21_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSenseJobAccess().getJobactionAbstratActionParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleSenseJob3762);
                    	    lv_jobaction_21_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSenseJobRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_21_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseJob3776); 

                        	newLeafNode(otherlv_22, grammarAccess.getSenseJobAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSenseJob3790); 

                	newLeafNode(otherlv_23, grammarAccess.getSenseJobAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleSenseJob"


    // $ANTLR start "entryRuleNetworkLevelSpecialAlgorithm"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1693:1: entryRuleNetworkLevelSpecialAlgorithm returns [EObject current=null] : iv_ruleNetworkLevelSpecialAlgorithm= ruleNetworkLevelSpecialAlgorithm EOF ;
    public final EObject entryRuleNetworkLevelSpecialAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkLevelSpecialAlgorithm = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1694:2: (iv_ruleNetworkLevelSpecialAlgorithm= ruleNetworkLevelSpecialAlgorithm EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1695:2: iv_ruleNetworkLevelSpecialAlgorithm= ruleNetworkLevelSpecialAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNetworkLevelSpecialAlgorithm_in_entryRuleNetworkLevelSpecialAlgorithm3826);
            iv_ruleNetworkLevelSpecialAlgorithm=ruleNetworkLevelSpecialAlgorithm();

            state._fsp--;

             current =iv_ruleNetworkLevelSpecialAlgorithm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNetworkLevelSpecialAlgorithm3836); 

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
    // $ANTLR end "entryRuleNetworkLevelSpecialAlgorithm"


    // $ANTLR start "ruleNetworkLevelSpecialAlgorithm"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1702:1: ruleNetworkLevelSpecialAlgorithm returns [EObject current=null] : ( () otherlv_1= 'NetworkLevelSpecialAlgorithm' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
    public final EObject ruleNetworkLevelSpecialAlgorithm() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_specialAlgorithmJob_6_0 = null;

        AntlrDatatypeRuleToken lv_sensingSamplingRate_8_0 = null;

        AntlrDatatypeRuleToken lv_algorithmSamplingRate_10_0 = null;

        AntlrDatatypeRuleToken lv_nodeIDList_13_0 = null;

        AntlrDatatypeRuleToken lv_nodeIDList_15_0 = null;

        EObject lv_JobTargetNode_18_0 = null;

        EObject lv_JobTargetNetwork_20_0 = null;

        EObject lv_startEndTrigger_23_0 = null;

        EObject lv_startEndTrigger_25_0 = null;

        EObject lv_jobaction_29_0 = null;

        EObject lv_jobaction_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1705:28: ( ( () otherlv_1= 'NetworkLevelSpecialAlgorithm' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1706:1: ( () otherlv_1= 'NetworkLevelSpecialAlgorithm' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1706:1: ( () otherlv_1= 'NetworkLevelSpecialAlgorithm' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1706:2: () otherlv_1= 'NetworkLevelSpecialAlgorithm' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1706:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1707:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getNetworkLevelSpecialAlgorithmAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNetworkLevelSpecialAlgorithm3882); 

                	newLeafNode(otherlv_1, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getNetworkLevelSpecialAlgorithmKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm3894); 

                	newLeafNode(otherlv_2, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1720:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==13) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1720:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNetworkLevelSpecialAlgorithm3907); 

                        	newLeafNode(otherlv_3, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1724:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1725:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1725:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1726:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNetworkLevelSpecialAlgorithm3928);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1742:4: (otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1742:6: otherlv_5= 'specialAlgorithmJob' ( (lv_specialAlgorithmJob_6_0= ruleFusion ) )
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNetworkLevelSpecialAlgorithm3943); 

                        	newLeafNode(otherlv_5, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getSpecialAlgorithmJobKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1746:1: ( (lv_specialAlgorithmJob_6_0= ruleFusion ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1747:1: (lv_specialAlgorithmJob_6_0= ruleFusion )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1747:1: (lv_specialAlgorithmJob_6_0= ruleFusion )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1748:3: lv_specialAlgorithmJob_6_0= ruleFusion
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getSpecialAlgorithmJobFusionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFusion_in_ruleNetworkLevelSpecialAlgorithm3964);
                    lv_specialAlgorithmJob_6_0=ruleFusion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		set(
                           			current, 
                           			"specialAlgorithmJob",
                            		lv_specialAlgorithmJob_6_0, 
                            		"Fusion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1764:4: (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==20) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1764:6: otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNetworkLevelSpecialAlgorithm3979); 

                        	newLeafNode(otherlv_7, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getSensingSamplingRateKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1768:1: ( (lv_sensingSamplingRate_8_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1769:1: (lv_sensingSamplingRate_8_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1769:1: (lv_sensingSamplingRate_8_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1770:3: lv_sensingSamplingRate_8_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getSensingSamplingRateELongParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleNetworkLevelSpecialAlgorithm4000);
                    lv_sensingSamplingRate_8_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		set(
                           			current, 
                           			"sensingSamplingRate",
                            		lv_sensingSamplingRate_8_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1786:4: (otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1786:6: otherlv_9= 'algorithmSamplingRate' ( (lv_algorithmSamplingRate_10_0= ruleELong ) )
                    {
                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNetworkLevelSpecialAlgorithm4015); 

                        	newLeafNode(otherlv_9, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getAlgorithmSamplingRateKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1790:1: ( (lv_algorithmSamplingRate_10_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1791:1: (lv_algorithmSamplingRate_10_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1791:1: (lv_algorithmSamplingRate_10_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1792:3: lv_algorithmSamplingRate_10_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getAlgorithmSamplingRateELongParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleNetworkLevelSpecialAlgorithm4036);
                    lv_algorithmSamplingRate_10_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		set(
                           			current, 
                           			"algorithmSamplingRate",
                            		lv_algorithmSamplingRate_10_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1808:4: (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==32) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1808:6: otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNetworkLevelSpecialAlgorithm4051); 

                        	newLeafNode(otherlv_11, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getNodeIDListKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm4063); 

                        	newLeafNode(otherlv_12, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1816:1: ( (lv_nodeIDList_13_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1817:1: (lv_nodeIDList_13_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1817:1: (lv_nodeIDList_13_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1818:3: lv_nodeIDList_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getNodeIDListEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNetworkLevelSpecialAlgorithm4084);
                    lv_nodeIDList_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeIDList",
                            		lv_nodeIDList_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1834:2: (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1834:4: otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNetworkLevelSpecialAlgorithm4097); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1838:1: ( (lv_nodeIDList_15_0= ruleEInt ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1839:1: (lv_nodeIDList_15_0= ruleEInt )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1839:1: (lv_nodeIDList_15_0= ruleEInt )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1840:3: lv_nodeIDList_15_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getNodeIDListEIntParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNetworkLevelSpecialAlgorithm4118);
                    	    lv_nodeIDList_15_0=ruleEInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeIDList",
                    	            		lv_nodeIDList_15_0, 
                    	            		"EInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4132); 

                        	newLeafNode(otherlv_16, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1860:3: (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==22) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1860:5: otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) )
                    {
                    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNetworkLevelSpecialAlgorithm4147); 

                        	newLeafNode(otherlv_17, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobTargetNodeKeyword_8_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1864:1: ( (lv_JobTargetNode_18_0= ruleAbstractNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1865:1: (lv_JobTargetNode_18_0= ruleAbstractNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1865:1: (lv_JobTargetNode_18_0= ruleAbstractNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1866:3: lv_JobTargetNode_18_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobTargetNodeAbstractNodeParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleNetworkLevelSpecialAlgorithm4168);
                    lv_JobTargetNode_18_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_18_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1882:4: (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==23) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1882:6: otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) )
                    {
                    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNetworkLevelSpecialAlgorithm4183); 

                        	newLeafNode(otherlv_19, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobTargetNetworkKeyword_9_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1886:1: ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1887:1: (lv_JobTargetNetwork_20_0= ruleAbstractNetwork )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1887:1: (lv_JobTargetNetwork_20_0= ruleAbstractNetwork )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1888:3: lv_JobTargetNetwork_20_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleNetworkLevelSpecialAlgorithm4204);
                    lv_JobTargetNetwork_20_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_20_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1904:4: (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==24) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1904:6: otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNetworkLevelSpecialAlgorithm4219); 

                        	newLeafNode(otherlv_21, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getStartEndTriggerKeyword_10_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm4231); 

                        	newLeafNode(otherlv_22, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1912:1: ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1913:1: (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1913:1: (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1914:3: lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkLevelSpecialAlgorithm4252);
                    lv_startEndTrigger_23_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_23_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1930:2: (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1930:4: otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNetworkLevelSpecialAlgorithm4265); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1934:1: ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1935:1: (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1935:1: (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1936:3: lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkLevelSpecialAlgorithm4286);
                    	    lv_startEndTrigger_25_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_25_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4300); 

                        	newLeafNode(otherlv_26, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1956:3: (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==25) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1956:5: otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNetworkLevelSpecialAlgorithm4315); 

                        	newLeafNode(otherlv_27, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobactionKeyword_11_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm4327); 

                        	newLeafNode(otherlv_28, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1964:1: ( (lv_jobaction_29_0= ruleAbstratAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1965:1: (lv_jobaction_29_0= ruleAbstratAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1965:1: (lv_jobaction_29_0= ruleAbstratAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1966:3: lv_jobaction_29_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobactionAbstratActionParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleNetworkLevelSpecialAlgorithm4348);
                    lv_jobaction_29_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_29_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1982:2: (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1982:4: otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNetworkLevelSpecialAlgorithm4361); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1986:1: ( (lv_jobaction_31_0= ruleAbstratAction ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1987:1: (lv_jobaction_31_0= ruleAbstratAction )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1987:1: (lv_jobaction_31_0= ruleAbstratAction )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:1988:3: lv_jobaction_31_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getJobactionAbstratActionParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleNetworkLevelSpecialAlgorithm4382);
                    	    lv_jobaction_31_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNetworkLevelSpecialAlgorithmRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_31_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4396); 

                        	newLeafNode(otherlv_32, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_33=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4410); 

                	newLeafNode(otherlv_33, grammarAccess.getNetworkLevelSpecialAlgorithmAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleNetworkLevelSpecialAlgorithm"


    // $ANTLR start "entryRuleNetworkDataProcessing"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2020:1: entryRuleNetworkDataProcessing returns [EObject current=null] : iv_ruleNetworkDataProcessing= ruleNetworkDataProcessing EOF ;
    public final EObject entryRuleNetworkDataProcessing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkDataProcessing = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2021:2: (iv_ruleNetworkDataProcessing= ruleNetworkDataProcessing EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2022:2: iv_ruleNetworkDataProcessing= ruleNetworkDataProcessing EOF
            {
             newCompositeNode(grammarAccess.getNetworkDataProcessingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNetworkDataProcessing_in_entryRuleNetworkDataProcessing4446);
            iv_ruleNetworkDataProcessing=ruleNetworkDataProcessing();

            state._fsp--;

             current =iv_ruleNetworkDataProcessing; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNetworkDataProcessing4456); 

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
    // $ANTLR end "entryRuleNetworkDataProcessing"


    // $ANTLR start "ruleNetworkDataProcessing"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2029:1: ruleNetworkDataProcessing returns [EObject current=null] : ( () otherlv_1= 'NetworkDataProcessing' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) ;
    public final EObject ruleNetworkDataProcessing() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_networkDataProcessing_6_0 = null;

        AntlrDatatypeRuleToken lv_sensingSamplingRate_8_0 = null;

        AntlrDatatypeRuleToken lv_dataProcessingRate_10_0 = null;

        AntlrDatatypeRuleToken lv_nodeIDList_13_0 = null;

        AntlrDatatypeRuleToken lv_nodeIDList_15_0 = null;

        EObject lv_JobTargetNode_18_0 = null;

        EObject lv_JobTargetNetwork_20_0 = null;

        EObject lv_startEndTrigger_23_0 = null;

        EObject lv_startEndTrigger_25_0 = null;

        EObject lv_jobaction_29_0 = null;

        EObject lv_jobaction_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2032:28: ( ( () otherlv_1= 'NetworkDataProcessing' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2033:1: ( () otherlv_1= 'NetworkDataProcessing' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2033:1: ( () otherlv_1= 'NetworkDataProcessing' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2033:2: () otherlv_1= 'NetworkDataProcessing' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) ) )? (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )? (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )? (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )? (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )? (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )? (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )? (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )? otherlv_33= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2033:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNetworkDataProcessingAccess().getNetworkDataProcessingAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNetworkDataProcessing4502); 

                	newLeafNode(otherlv_1, grammarAccess.getNetworkDataProcessingAccess().getNetworkDataProcessingKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkDataProcessing4514); 

                	newLeafNode(otherlv_2, grammarAccess.getNetworkDataProcessingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2047:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==13) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2047:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleNetworkDataProcessing4527); 

                        	newLeafNode(otherlv_3, grammarAccess.getNetworkDataProcessingAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2051:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2052:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2052:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2053:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNetworkDataProcessing4548);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2069:4: (otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==34) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2069:6: otherlv_5= 'networkDataProcessing' ( (lv_networkDataProcessing_6_0= ruleAggregation ) )
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNetworkDataProcessing4563); 

                        	newLeafNode(otherlv_5, grammarAccess.getNetworkDataProcessingAccess().getNetworkDataProcessingKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2073:1: ( (lv_networkDataProcessing_6_0= ruleAggregation ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2074:1: (lv_networkDataProcessing_6_0= ruleAggregation )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2074:1: (lv_networkDataProcessing_6_0= ruleAggregation )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2075:3: lv_networkDataProcessing_6_0= ruleAggregation
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getNetworkDataProcessingAggregationEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAggregation_in_ruleNetworkDataProcessing4584);
                    lv_networkDataProcessing_6_0=ruleAggregation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		set(
                           			current, 
                           			"networkDataProcessing",
                            		lv_networkDataProcessing_6_0, 
                            		"Aggregation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2091:4: (otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==20) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2091:6: otherlv_7= 'sensingSamplingRate' ( (lv_sensingSamplingRate_8_0= ruleELong ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleNetworkDataProcessing4599); 

                        	newLeafNode(otherlv_7, grammarAccess.getNetworkDataProcessingAccess().getSensingSamplingRateKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2095:1: ( (lv_sensingSamplingRate_8_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2096:1: (lv_sensingSamplingRate_8_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2096:1: (lv_sensingSamplingRate_8_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2097:3: lv_sensingSamplingRate_8_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getSensingSamplingRateELongParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleNetworkDataProcessing4620);
                    lv_sensingSamplingRate_8_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		set(
                           			current, 
                           			"sensingSamplingRate",
                            		lv_sensingSamplingRate_8_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2113:4: (otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==21) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2113:6: otherlv_9= 'dataProcessingRate' ( (lv_dataProcessingRate_10_0= ruleELong ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNetworkDataProcessing4635); 

                        	newLeafNode(otherlv_9, grammarAccess.getNetworkDataProcessingAccess().getDataProcessingRateKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2117:1: ( (lv_dataProcessingRate_10_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2118:1: (lv_dataProcessingRate_10_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2118:1: (lv_dataProcessingRate_10_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2119:3: lv_dataProcessingRate_10_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getDataProcessingRateELongParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleNetworkDataProcessing4656);
                    lv_dataProcessingRate_10_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		set(
                           			current, 
                           			"dataProcessingRate",
                            		lv_dataProcessingRate_10_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2135:4: (otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==32) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2135:6: otherlv_11= 'nodeIDList' otherlv_12= '{' ( (lv_nodeIDList_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNetworkDataProcessing4671); 

                        	newLeafNode(otherlv_11, grammarAccess.getNetworkDataProcessingAccess().getNodeIDListKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkDataProcessing4683); 

                        	newLeafNode(otherlv_12, grammarAccess.getNetworkDataProcessingAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2143:1: ( (lv_nodeIDList_13_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2144:1: (lv_nodeIDList_13_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2144:1: (lv_nodeIDList_13_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2145:3: lv_nodeIDList_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getNodeIDListEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNetworkDataProcessing4704);
                    lv_nodeIDList_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeIDList",
                            		lv_nodeIDList_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2161:2: (otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==15) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2161:4: otherlv_14= ',' ( (lv_nodeIDList_15_0= ruleEInt ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNetworkDataProcessing4717); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getNetworkDataProcessingAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2165:1: ( (lv_nodeIDList_15_0= ruleEInt ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2166:1: (lv_nodeIDList_15_0= ruleEInt )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2166:1: (lv_nodeIDList_15_0= ruleEInt )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2167:3: lv_nodeIDList_15_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getNodeIDListEIntParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNetworkDataProcessing4738);
                    	    lv_nodeIDList_15_0=ruleEInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeIDList",
                    	            		lv_nodeIDList_15_0, 
                    	            		"EInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkDataProcessing4752); 

                        	newLeafNode(otherlv_16, grammarAccess.getNetworkDataProcessingAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2187:3: (otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==22) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2187:5: otherlv_17= 'JobTargetNode' ( (lv_JobTargetNode_18_0= ruleAbstractNode ) )
                    {
                    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNetworkDataProcessing4767); 

                        	newLeafNode(otherlv_17, grammarAccess.getNetworkDataProcessingAccess().getJobTargetNodeKeyword_8_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2191:1: ( (lv_JobTargetNode_18_0= ruleAbstractNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2192:1: (lv_JobTargetNode_18_0= ruleAbstractNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2192:1: (lv_JobTargetNode_18_0= ruleAbstractNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2193:3: lv_JobTargetNode_18_0= ruleAbstractNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getJobTargetNodeAbstractNodeParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNode_in_ruleNetworkDataProcessing4788);
                    lv_JobTargetNode_18_0=ruleAbstractNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNode",
                            		lv_JobTargetNode_18_0, 
                            		"AbstractNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2209:4: (otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==23) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2209:6: otherlv_19= 'JobTargetNetwork' ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) )
                    {
                    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNetworkDataProcessing4803); 

                        	newLeafNode(otherlv_19, grammarAccess.getNetworkDataProcessingAccess().getJobTargetNetworkKeyword_9_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2213:1: ( (lv_JobTargetNetwork_20_0= ruleAbstractNetwork ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2214:1: (lv_JobTargetNetwork_20_0= ruleAbstractNetwork )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2214:1: (lv_JobTargetNetwork_20_0= ruleAbstractNetwork )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2215:3: lv_JobTargetNetwork_20_0= ruleAbstractNetwork
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getJobTargetNetworkAbstractNetworkParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractNetwork_in_ruleNetworkDataProcessing4824);
                    lv_JobTargetNetwork_20_0=ruleAbstractNetwork();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		set(
                           			current, 
                           			"JobTargetNetwork",
                            		lv_JobTargetNetwork_20_0, 
                            		"AbstractNetwork");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2231:4: (otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2231:6: otherlv_21= 'startEndTrigger' otherlv_22= '{' ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) ) (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNetworkDataProcessing4839); 

                        	newLeafNode(otherlv_21, grammarAccess.getNetworkDataProcessingAccess().getStartEndTriggerKeyword_10_0());
                        
                    otherlv_22=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkDataProcessing4851); 

                        	newLeafNode(otherlv_22, grammarAccess.getNetworkDataProcessingAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2239:1: ( (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2240:1: (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2240:1: (lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2241:3: lv_startEndTrigger_23_0= ruleAbstractStartEndingJobTrigger
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkDataProcessing4872);
                    lv_startEndTrigger_23_0=ruleAbstractStartEndingJobTrigger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		add(
                           			current, 
                           			"startEndTrigger",
                            		lv_startEndTrigger_23_0, 
                            		"AbstractStartEndingJobTrigger");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2257:2: (otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==15) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2257:4: otherlv_24= ',' ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNetworkDataProcessing4885); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getNetworkDataProcessingAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2261:1: ( (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2262:1: (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2262:1: (lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2263:3: lv_startEndTrigger_25_0= ruleAbstractStartEndingJobTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getStartEndTriggerAbstractStartEndingJobTriggerParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkDataProcessing4906);
                    	    lv_startEndTrigger_25_0=ruleAbstractStartEndingJobTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"startEndTrigger",
                    	            		lv_startEndTrigger_25_0, 
                    	            		"AbstractStartEndingJobTrigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkDataProcessing4920); 

                        	newLeafNode(otherlv_26, grammarAccess.getNetworkDataProcessingAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2283:3: (otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2283:5: otherlv_27= 'jobaction' otherlv_28= '{' ( (lv_jobaction_29_0= ruleAbstratAction ) ) (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNetworkDataProcessing4935); 

                        	newLeafNode(otherlv_27, grammarAccess.getNetworkDataProcessingAccess().getJobactionKeyword_11_0());
                        
                    otherlv_28=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleNetworkDataProcessing4947); 

                        	newLeafNode(otherlv_28, grammarAccess.getNetworkDataProcessingAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2291:1: ( (lv_jobaction_29_0= ruleAbstratAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2292:1: (lv_jobaction_29_0= ruleAbstratAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2292:1: (lv_jobaction_29_0= ruleAbstratAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2293:3: lv_jobaction_29_0= ruleAbstratAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getJobactionAbstratActionParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleNetworkDataProcessing4968);
                    lv_jobaction_29_0=ruleAbstratAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	        }
                           		add(
                           			current, 
                           			"jobaction",
                            		lv_jobaction_29_0, 
                            		"AbstratAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2309:2: (otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==15) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2309:4: otherlv_30= ',' ( (lv_jobaction_31_0= ruleAbstratAction ) )
                    	    {
                    	    otherlv_30=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNetworkDataProcessing4981); 

                    	        	newLeafNode(otherlv_30, grammarAccess.getNetworkDataProcessingAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2313:1: ( (lv_jobaction_31_0= ruleAbstratAction ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2314:1: (lv_jobaction_31_0= ruleAbstratAction )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2314:1: (lv_jobaction_31_0= ruleAbstratAction )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2315:3: lv_jobaction_31_0= ruleAbstratAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNetworkDataProcessingAccess().getJobactionAbstratActionParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstratAction_in_ruleNetworkDataProcessing5002);
                    	    lv_jobaction_31_0=ruleAbstratAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNetworkDataProcessingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"jobaction",
                    	            		lv_jobaction_31_0, 
                    	            		"AbstratAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkDataProcessing5016); 

                        	newLeafNode(otherlv_32, grammarAccess.getNetworkDataProcessingAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_33=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNetworkDataProcessing5030); 

                	newLeafNode(otherlv_33, grammarAccess.getNetworkDataProcessingAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleNetworkDataProcessing"


    // $ANTLR start "entryRuleSensorNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2347:1: entryRuleSensorNode returns [EObject current=null] : iv_ruleSensorNode= ruleSensorNode EOF ;
    public final EObject entryRuleSensorNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2348:2: (iv_ruleSensorNode= ruleSensorNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2349:2: iv_ruleSensorNode= ruleSensorNode EOF
            {
             newCompositeNode(grammarAccess.getSensorNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensorNode_in_entryRuleSensorNode5066);
            iv_ruleSensorNode=ruleSensorNode();

            state._fsp--;

             current =iv_ruleSensorNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensorNode5076); 

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
    // $ANTLR end "entryRuleSensorNode"


    // $ANTLR start "ruleSensorNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2356:1: ruleSensorNode returns [EObject current=null] : ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleSensorNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2359:28: ( ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2360:1: ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2360:1: ( () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2360:2: () otherlv_1= 'SensorNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2360:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2361:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSensorNodeAccess().getSensorNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSensorNode5122); 

                	newLeafNode(otherlv_1, grammarAccess.getSensorNodeAccess().getSensorNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSensorNode5134); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2374:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==13) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2374:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSensorNode5147); 

                        	newLeafNode(otherlv_3, grammarAccess.getSensorNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2378:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2379:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2379:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2380:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSensorNode5168);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2396:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==36) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2396:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSensorNode5183); 

                        	newLeafNode(otherlv_5, grammarAccess.getSensorNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2400:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2401:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2401:1: (lv_position_6_0= rulePosition )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2402:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleSensorNode5204);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2418:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==37) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2418:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSensorNode5219); 

                        	newLeafNode(otherlv_7, grammarAccess.getSensorNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSensorNode5231); 

                        	newLeafNode(otherlv_8, grammarAccess.getSensorNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2426:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2427:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2427:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2428:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSensorNode5252);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2444:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==15) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2444:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSensorNode5265); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSensorNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2448:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2449:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2449:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2450:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSensorNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSensorNode5286);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSensorNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensorNode5300); 

                        	newLeafNode(otherlv_12, grammarAccess.getSensorNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensorNode5314); 

                	newLeafNode(otherlv_13, grammarAccess.getSensorNodeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSensorNode"


    // $ANTLR start "entryRuleClusterHeadNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2482:1: entryRuleClusterHeadNode returns [EObject current=null] : iv_ruleClusterHeadNode= ruleClusterHeadNode EOF ;
    public final EObject entryRuleClusterHeadNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusterHeadNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2483:2: (iv_ruleClusterHeadNode= ruleClusterHeadNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2484:2: iv_ruleClusterHeadNode= ruleClusterHeadNode EOF
            {
             newCompositeNode(grammarAccess.getClusterHeadNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClusterHeadNode_in_entryRuleClusterHeadNode5350);
            iv_ruleClusterHeadNode=ruleClusterHeadNode();

            state._fsp--;

             current =iv_ruleClusterHeadNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClusterHeadNode5360); 

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
    // $ANTLR end "entryRuleClusterHeadNode"


    // $ANTLR start "ruleClusterHeadNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2491:1: ruleClusterHeadNode returns [EObject current=null] : ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleClusterHeadNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2494:28: ( ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2495:1: ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2495:1: ( () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2495:2: () otherlv_1= 'ClusterHeadNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2495:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusterHeadNodeAccess().getClusterHeadNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleClusterHeadNode5406); 

                	newLeafNode(otherlv_1, grammarAccess.getClusterHeadNodeAccess().getClusterHeadNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusterHeadNode5418); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterHeadNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2509:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==13) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2509:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClusterHeadNode5431); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusterHeadNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2513:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2514:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2514:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2515:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusterHeadNode5452);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2531:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==36) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2531:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleClusterHeadNode5467); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusterHeadNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2535:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2536:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2536:1: (lv_position_6_0= rulePosition )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2537:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleClusterHeadNode5488);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2553:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==37) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2553:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleClusterHeadNode5503); 

                        	newLeafNode(otherlv_7, grammarAccess.getClusterHeadNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusterHeadNode5515); 

                        	newLeafNode(otherlv_8, grammarAccess.getClusterHeadNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2561:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2562:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2562:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2563:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5536);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2579:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==15) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2579:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClusterHeadNode5549); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getClusterHeadNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2583:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2584:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2584:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2585:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterHeadNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5570);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusterHeadNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusterHeadNode5584); 

                        	newLeafNode(otherlv_12, grammarAccess.getClusterHeadNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusterHeadNode5598); 

                	newLeafNode(otherlv_13, grammarAccess.getClusterHeadNodeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleClusterHeadNode"


    // $ANTLR start "entryRuleSinkNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2617:1: entryRuleSinkNode returns [EObject current=null] : iv_ruleSinkNode= ruleSinkNode EOF ;
    public final EObject entryRuleSinkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinkNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2618:2: (iv_ruleSinkNode= ruleSinkNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2619:2: iv_ruleSinkNode= ruleSinkNode EOF
            {
             newCompositeNode(grammarAccess.getSinkNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_entryRuleSinkNode5634);
            iv_ruleSinkNode=ruleSinkNode();

            state._fsp--;

             current =iv_ruleSinkNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSinkNode5644); 

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
    // $ANTLR end "entryRuleSinkNode"


    // $ANTLR start "ruleSinkNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2626:1: ruleSinkNode returns [EObject current=null] : ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleSinkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2629:28: ( ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2630:1: ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2630:1: ( () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2630:2: () otherlv_1= 'SinkNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2630:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2631:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinkNodeAccess().getSinkNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSinkNode5690); 

                	newLeafNode(otherlv_1, grammarAccess.getSinkNodeAccess().getSinkNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkNode5702); 

                	newLeafNode(otherlv_2, grammarAccess.getSinkNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2644:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==13) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2644:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSinkNode5715); 

                        	newLeafNode(otherlv_3, grammarAccess.getSinkNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2648:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2649:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2649:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2650:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSinkNode5736);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2666:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==36) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2666:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSinkNode5751); 

                        	newLeafNode(otherlv_5, grammarAccess.getSinkNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2670:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2671:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2671:1: (lv_position_6_0= rulePosition )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2672:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleSinkNode5772);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2688:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==37) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2688:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSinkNode5787); 

                        	newLeafNode(otherlv_7, grammarAccess.getSinkNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSinkNode5799); 

                        	newLeafNode(otherlv_8, grammarAccess.getSinkNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2696:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2697:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2697:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2698:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSinkNode5820);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2714:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==15) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2714:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSinkNode5833); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSinkNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2718:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2719:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2719:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2720:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinkNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleSinkNode5854);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinkNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkNode5868); 

                        	newLeafNode(otherlv_12, grammarAccess.getSinkNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSinkNode5882); 

                	newLeafNode(otherlv_13, grammarAccess.getSinkNodeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSinkNode"


    // $ANTLR start "entryRuleComputationNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2752:1: entryRuleComputationNode returns [EObject current=null] : iv_ruleComputationNode= ruleComputationNode EOF ;
    public final EObject entryRuleComputationNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputationNode = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2753:2: (iv_ruleComputationNode= ruleComputationNode EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2754:2: iv_ruleComputationNode= ruleComputationNode EOF
            {
             newCompositeNode(grammarAccess.getComputationNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComputationNode_in_entryRuleComputationNode5918);
            iv_ruleComputationNode=ruleComputationNode();

            state._fsp--;

             current =iv_ruleComputationNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComputationNode5928); 

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
    // $ANTLR end "entryRuleComputationNode"


    // $ANTLR start "ruleComputationNode"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2761:1: ruleComputationNode returns [EObject current=null] : ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleComputationNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_position_6_0 = null;

        EObject lv_nodeResources_9_0 = null;

        EObject lv_nodeResources_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2764:28: ( ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2765:1: ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2765:1: ( () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2765:2: () otherlv_1= 'ComputationNode' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )? (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2765:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2766:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComputationNodeAccess().getComputationNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleComputationNode5974); 

                	newLeafNode(otherlv_1, grammarAccess.getComputationNodeAccess().getComputationNodeKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComputationNode5986); 

                	newLeafNode(otherlv_2, grammarAccess.getComputationNodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2779:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==13) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2779:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComputationNode5999); 

                        	newLeafNode(otherlv_3, grammarAccess.getComputationNodeAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2783:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2784:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2784:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2785:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComputationNode6020);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2801:4: (otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==36) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2801:6: otherlv_5= 'position' ( (lv_position_6_0= rulePosition ) )
                    {
                    otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComputationNode6035); 

                        	newLeafNode(otherlv_5, grammarAccess.getComputationNodeAccess().getPositionKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2805:1: ( (lv_position_6_0= rulePosition ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2806:1: (lv_position_6_0= rulePosition )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2806:1: (lv_position_6_0= rulePosition )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2807:3: lv_position_6_0= rulePosition
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getPositionPositionEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePosition_in_ruleComputationNode6056);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"position",
                            		lv_position_6_0, 
                            		"Position");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2823:4: (otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==37) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2823:6: otherlv_7= 'nodeResources' otherlv_8= '{' ( (lv_nodeResources_9_0= ruleAbstractSensor ) ) (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComputationNode6071); 

                        	newLeafNode(otherlv_7, grammarAccess.getComputationNodeAccess().getNodeResourcesKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComputationNode6083); 

                        	newLeafNode(otherlv_8, grammarAccess.getComputationNodeAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2831:1: ( (lv_nodeResources_9_0= ruleAbstractSensor ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2832:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2832:1: (lv_nodeResources_9_0= ruleAbstractSensor )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2833:3: lv_nodeResources_9_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleComputationNode6104);
                    lv_nodeResources_9_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeResources",
                            		lv_nodeResources_9_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2849:2: (otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==15) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2849:4: otherlv_10= ',' ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComputationNode6117); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getComputationNodeAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2853:1: ( (lv_nodeResources_11_0= ruleAbstractSensor ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2854:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2854:1: (lv_nodeResources_11_0= ruleAbstractSensor )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2855:3: lv_nodeResources_11_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComputationNodeAccess().getNodeResourcesAbstractSensorParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleComputationNode6138);
                    	    lv_nodeResources_11_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComputationNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeResources",
                    	            		lv_nodeResources_11_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComputationNode6152); 

                        	newLeafNode(otherlv_12, grammarAccess.getComputationNodeAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComputationNode6166); 

                	newLeafNode(otherlv_13, grammarAccess.getComputationNodeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleComputationNode"


    // $ANTLR start "entryRuleAccelerometerSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2887:1: entryRuleAccelerometerSensor returns [EObject current=null] : iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF ;
    public final EObject entryRuleAccelerometerSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccelerometerSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2888:2: (iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2889:2: iv_ruleAccelerometerSensor= ruleAccelerometerSensor EOF
            {
             newCompositeNode(grammarAccess.getAccelerometerSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccelerometerSensor_in_entryRuleAccelerometerSensor6202);
            iv_ruleAccelerometerSensor=ruleAccelerometerSensor();

            state._fsp--;

             current =iv_ruleAccelerometerSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccelerometerSensor6212); 

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
    // $ANTLR end "entryRuleAccelerometerSensor"


    // $ANTLR start "ruleAccelerometerSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2896:1: ruleAccelerometerSensor returns [EObject current=null] : ( () otherlv_1= 'AccelerometerSensor' ) ;
    public final EObject ruleAccelerometerSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2899:28: ( ( () otherlv_1= 'AccelerometerSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2900:1: ( () otherlv_1= 'AccelerometerSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2900:1: ( () otherlv_1= 'AccelerometerSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2900:2: () otherlv_1= 'AccelerometerSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2900:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2901:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccelerometerSensorAccess().getAccelerometerSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAccelerometerSensor6258); 

                	newLeafNode(otherlv_1, grammarAccess.getAccelerometerSensorAccess().getAccelerometerSensorKeyword_1());
                

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
    // $ANTLR end "ruleAccelerometerSensor"


    // $ANTLR start "entryRuleLightSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2918:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2919:2: (iv_ruleLightSensor= ruleLightSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2920:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLightSensor_in_entryRuleLightSensor6294);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLightSensor6304); 

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
    // $ANTLR end "entryRuleLightSensor"


    // $ANTLR start "ruleLightSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2927:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' ) ;
    public final EObject ruleLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2930:28: ( ( () otherlv_1= 'LightSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2931:1: ( () otherlv_1= 'LightSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2931:1: ( () otherlv_1= 'LightSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2931:2: () otherlv_1= 'LightSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2931:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2932:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLightSensor6350); 

                	newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
                

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
    // $ANTLR end "ruleLightSensor"


    // $ANTLR start "entryRuleLocationSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2949:1: entryRuleLocationSensor returns [EObject current=null] : iv_ruleLocationSensor= ruleLocationSensor EOF ;
    public final EObject entryRuleLocationSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2950:2: (iv_ruleLocationSensor= ruleLocationSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2951:2: iv_ruleLocationSensor= ruleLocationSensor EOF
            {
             newCompositeNode(grammarAccess.getLocationSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocationSensor_in_entryRuleLocationSensor6386);
            iv_ruleLocationSensor=ruleLocationSensor();

            state._fsp--;

             current =iv_ruleLocationSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocationSensor6396); 

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
    // $ANTLR end "entryRuleLocationSensor"


    // $ANTLR start "ruleLocationSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2958:1: ruleLocationSensor returns [EObject current=null] : ( () otherlv_1= 'LocationSensor' ) ;
    public final EObject ruleLocationSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2961:28: ( ( () otherlv_1= 'LocationSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2962:1: ( () otherlv_1= 'LocationSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2962:1: ( () otherlv_1= 'LocationSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2962:2: () otherlv_1= 'LocationSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2962:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2963:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocationSensorAccess().getLocationSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLocationSensor6442); 

                	newLeafNode(otherlv_1, grammarAccess.getLocationSensorAccess().getLocationSensorKeyword_1());
                

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
    // $ANTLR end "ruleLocationSensor"


    // $ANTLR start "entryRuleMicrophoneSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2980:1: entryRuleMicrophoneSensor returns [EObject current=null] : iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF ;
    public final EObject entryRuleMicrophoneSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMicrophoneSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2981:2: (iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2982:2: iv_ruleMicrophoneSensor= ruleMicrophoneSensor EOF
            {
             newCompositeNode(grammarAccess.getMicrophoneSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMicrophoneSensor_in_entryRuleMicrophoneSensor6478);
            iv_ruleMicrophoneSensor=ruleMicrophoneSensor();

            state._fsp--;

             current =iv_ruleMicrophoneSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMicrophoneSensor6488); 

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
    // $ANTLR end "entryRuleMicrophoneSensor"


    // $ANTLR start "ruleMicrophoneSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2989:1: ruleMicrophoneSensor returns [EObject current=null] : ( () otherlv_1= 'MicrophoneSensor' ) ;
    public final EObject ruleMicrophoneSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2992:28: ( ( () otherlv_1= 'MicrophoneSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2993:1: ( () otherlv_1= 'MicrophoneSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2993:1: ( () otherlv_1= 'MicrophoneSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2993:2: () otherlv_1= 'MicrophoneSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2993:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:2994:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMicrophoneSensorAccess().getMicrophoneSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMicrophoneSensor6534); 

                	newLeafNode(otherlv_1, grammarAccess.getMicrophoneSensorAccess().getMicrophoneSensorKeyword_1());
                

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
    // $ANTLR end "ruleMicrophoneSensor"


    // $ANTLR start "entryRuleTemperatureSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3011:1: entryRuleTemperatureSensor returns [EObject current=null] : iv_ruleTemperatureSensor= ruleTemperatureSensor EOF ;
    public final EObject entryRuleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemperatureSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3012:2: (iv_ruleTemperatureSensor= ruleTemperatureSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3013:2: iv_ruleTemperatureSensor= ruleTemperatureSensor EOF
            {
             newCompositeNode(grammarAccess.getTemperatureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor6570);
            iv_ruleTemperatureSensor=ruleTemperatureSensor();

            state._fsp--;

             current =iv_ruleTemperatureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemperatureSensor6580); 

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
    // $ANTLR end "entryRuleTemperatureSensor"


    // $ANTLR start "ruleTemperatureSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3020:1: ruleTemperatureSensor returns [EObject current=null] : ( () otherlv_1= 'TemperatureSensor' ) ;
    public final EObject ruleTemperatureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3023:28: ( ( () otherlv_1= 'TemperatureSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3024:1: ( () otherlv_1= 'TemperatureSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3024:1: ( () otherlv_1= 'TemperatureSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3024:2: () otherlv_1= 'TemperatureSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3024:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3025:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTemperatureSensorAccess().getTemperatureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTemperatureSensor6626); 

                	newLeafNode(otherlv_1, grammarAccess.getTemperatureSensorAccess().getTemperatureSensorKeyword_1());
                

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
    // $ANTLR end "ruleTemperatureSensor"


    // $ANTLR start "entryRulePressureSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3042:1: entryRulePressureSensor returns [EObject current=null] : iv_rulePressureSensor= rulePressureSensor EOF ;
    public final EObject entryRulePressureSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePressureSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3043:2: (iv_rulePressureSensor= rulePressureSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3044:2: iv_rulePressureSensor= rulePressureSensor EOF
            {
             newCompositeNode(grammarAccess.getPressureSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePressureSensor_in_entryRulePressureSensor6662);
            iv_rulePressureSensor=rulePressureSensor();

            state._fsp--;

             current =iv_rulePressureSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePressureSensor6672); 

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
    // $ANTLR end "entryRulePressureSensor"


    // $ANTLR start "rulePressureSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3051:1: rulePressureSensor returns [EObject current=null] : ( () otherlv_1= 'PressureSensor' ) ;
    public final EObject rulePressureSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3054:28: ( ( () otherlv_1= 'PressureSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3055:1: ( () otherlv_1= 'PressureSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3055:1: ( () otherlv_1= 'PressureSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3055:2: () otherlv_1= 'PressureSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3055:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3056:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPressureSensorAccess().getPressureSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_rulePressureSensor6718); 

                	newLeafNode(otherlv_1, grammarAccess.getPressureSensorAccess().getPressureSensorKeyword_1());
                

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
    // $ANTLR end "rulePressureSensor"


    // $ANTLR start "entryRuleHumiditySensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3073:1: entryRuleHumiditySensor returns [EObject current=null] : iv_ruleHumiditySensor= ruleHumiditySensor EOF ;
    public final EObject entryRuleHumiditySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHumiditySensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3074:2: (iv_ruleHumiditySensor= ruleHumiditySensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3075:2: iv_ruleHumiditySensor= ruleHumiditySensor EOF
            {
             newCompositeNode(grammarAccess.getHumiditySensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor6754);
            iv_ruleHumiditySensor=ruleHumiditySensor();

            state._fsp--;

             current =iv_ruleHumiditySensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHumiditySensor6764); 

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
    // $ANTLR end "entryRuleHumiditySensor"


    // $ANTLR start "ruleHumiditySensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3082:1: ruleHumiditySensor returns [EObject current=null] : ( () otherlv_1= 'HumiditySensor' ) ;
    public final EObject ruleHumiditySensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3085:28: ( ( () otherlv_1= 'HumiditySensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3086:1: ( () otherlv_1= 'HumiditySensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3086:1: ( () otherlv_1= 'HumiditySensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3086:2: () otherlv_1= 'HumiditySensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3086:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHumiditySensorAccess().getHumiditySensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleHumiditySensor6810); 

                	newLeafNode(otherlv_1, grammarAccess.getHumiditySensorAccess().getHumiditySensorKeyword_1());
                

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
    // $ANTLR end "ruleHumiditySensor"


    // $ANTLR start "entryRuleVoltageSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3104:1: entryRuleVoltageSensor returns [EObject current=null] : iv_ruleVoltageSensor= ruleVoltageSensor EOF ;
    public final EObject entryRuleVoltageSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoltageSensor = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3105:2: (iv_ruleVoltageSensor= ruleVoltageSensor EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3106:2: iv_ruleVoltageSensor= ruleVoltageSensor EOF
            {
             newCompositeNode(grammarAccess.getVoltageSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVoltageSensor_in_entryRuleVoltageSensor6846);
            iv_ruleVoltageSensor=ruleVoltageSensor();

            state._fsp--;

             current =iv_ruleVoltageSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVoltageSensor6856); 

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
    // $ANTLR end "entryRuleVoltageSensor"


    // $ANTLR start "ruleVoltageSensor"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3113:1: ruleVoltageSensor returns [EObject current=null] : ( () otherlv_1= 'VoltageSensor' ) ;
    public final EObject ruleVoltageSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3116:28: ( ( () otherlv_1= 'VoltageSensor' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3117:1: ( () otherlv_1= 'VoltageSensor' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3117:1: ( () otherlv_1= 'VoltageSensor' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3117:2: () otherlv_1= 'VoltageSensor'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3117:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3118:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVoltageSensorAccess().getVoltageSensorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleVoltageSensor6902); 

                	newLeafNode(otherlv_1, grammarAccess.getVoltageSensorAccess().getVoltageSensorKeyword_1());
                

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
    // $ANTLR end "ruleVoltageSensor"


    // $ANTLR start "entryRuleFlatNetwork"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3135:1: entryRuleFlatNetwork returns [EObject current=null] : iv_ruleFlatNetwork= ruleFlatNetwork EOF ;
    public final EObject entryRuleFlatNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlatNetwork = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3136:2: (iv_ruleFlatNetwork= ruleFlatNetwork EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3137:2: iv_ruleFlatNetwork= ruleFlatNetwork EOF
            {
             newCompositeNode(grammarAccess.getFlatNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlatNetwork_in_entryRuleFlatNetwork6938);
            iv_ruleFlatNetwork=ruleFlatNetwork();

            state._fsp--;

             current =iv_ruleFlatNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlatNetwork6948); 

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
    // $ANTLR end "entryRuleFlatNetwork"


    // $ANTLR start "ruleFlatNetwork"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3144:1: ruleFlatNetwork returns [EObject current=null] : ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleFlatNetwork() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_nbOfNodes_6_0 = null;

        Enumerator lv_interNodeComm_8_0 = null;

        Enumerator lv_routingProtocol_10_0 = null;

        EObject lv_resources_13_0 = null;

        EObject lv_resources_15_0 = null;

        EObject lv_sink_18_0 = null;

        EObject lv_nodes_21_0 = null;

        EObject lv_nodes_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3147:28: ( ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3148:1: ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3148:1: ( () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3148:2: () otherlv_1= 'FlatNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3148:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3149:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFlatNetworkAccess().getFlatNetworkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleFlatNetwork6994); 

                	newLeafNode(otherlv_1, grammarAccess.getFlatNetworkAccess().getFlatNetworkKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork7006); 

                	newLeafNode(otherlv_2, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3162:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==13) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3162:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFlatNetwork7019); 

                        	newLeafNode(otherlv_3, grammarAccess.getFlatNetworkAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3166:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3167:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3167:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3168:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFlatNetwork7040);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3184:4: (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==50) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3184:6: otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFlatNetwork7055); 

                        	newLeafNode(otherlv_5, grammarAccess.getFlatNetworkAccess().getNbOfNodesKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3188:1: ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3189:1: (lv_nbOfNodes_6_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3189:1: (lv_nbOfNodes_6_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3190:3: lv_nbOfNodes_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNbOfNodesEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleFlatNetwork7076);
                    lv_nbOfNodes_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"nbOfNodes",
                            		lv_nbOfNodes_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3206:4: (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==51) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3206:6: otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    {
                    otherlv_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleFlatNetwork7091); 

                        	newLeafNode(otherlv_7, grammarAccess.getFlatNetworkAccess().getInterNodeCommKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3210:1: ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3211:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3211:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3212:3: lv_interNodeComm_8_0= ruleInterNodeComm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getInterNodeCommInterNodeCommEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterNodeComm_in_ruleFlatNetwork7112);
                    lv_interNodeComm_8_0=ruleInterNodeComm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"interNodeComm",
                            		lv_interNodeComm_8_0, 
                            		"InterNodeComm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3228:4: (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==52) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3228:6: otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    {
                    otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFlatNetwork7127); 

                        	newLeafNode(otherlv_9, grammarAccess.getFlatNetworkAccess().getRoutingProtocolKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3232:1: ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3233:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3233:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3234:3: lv_routingProtocol_10_0= ruleRoutingProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getRoutingProtocolRoutingProtocolEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoutingProtocol_in_ruleFlatNetwork7148);
                    lv_routingProtocol_10_0=ruleRoutingProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"routingProtocol",
                            		lv_routingProtocol_10_0, 
                            		"RoutingProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3250:4: (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==53) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3250:6: otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleFlatNetwork7163); 

                        	newLeafNode(otherlv_11, grammarAccess.getFlatNetworkAccess().getResourcesKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork7175); 

                        	newLeafNode(otherlv_12, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3258:1: ( (lv_resources_13_0= ruleAbstractSensor ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3259:1: (lv_resources_13_0= ruleAbstractSensor )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3259:1: (lv_resources_13_0= ruleAbstractSensor )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3260:3: lv_resources_13_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getResourcesAbstractSensorParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork7196);
                    lv_resources_13_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_13_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3276:2: (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==15) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3276:4: otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFlatNetwork7209); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getFlatNetworkAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3280:1: ( (lv_resources_15_0= ruleAbstractSensor ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3281:1: (lv_resources_15_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3281:1: (lv_resources_15_0= ruleAbstractSensor )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3282:3: lv_resources_15_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getResourcesAbstractSensorParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork7230);
                    	    lv_resources_15_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_15_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork7244); 

                        	newLeafNode(otherlv_16, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3302:3: (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==54) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3302:5: otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) )
                    {
                    otherlv_17=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleFlatNetwork7259); 

                        	newLeafNode(otherlv_17, grammarAccess.getFlatNetworkAccess().getSinkKeyword_8_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3306:1: ( (lv_sink_18_0= ruleSinkNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3307:1: (lv_sink_18_0= ruleSinkNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3307:1: (lv_sink_18_0= ruleSinkNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3308:3: lv_sink_18_0= ruleSinkNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getSinkSinkNodeParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_ruleFlatNetwork7280);
                    lv_sink_18_0=ruleSinkNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"sink",
                            		lv_sink_18_0, 
                            		"SinkNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3324:4: (otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==55) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3324:6: otherlv_19= 'nodes' otherlv_20= '{' ( (lv_nodes_21_0= ruleAbstractFlatNode ) ) (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleFlatNetwork7295); 

                        	newLeafNode(otherlv_19, grammarAccess.getFlatNetworkAccess().getNodesKeyword_9_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlatNetwork7307); 

                        	newLeafNode(otherlv_20, grammarAccess.getFlatNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3332:1: ( (lv_nodes_21_0= ruleAbstractFlatNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3333:1: (lv_nodes_21_0= ruleAbstractFlatNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3333:1: (lv_nodes_21_0= ruleAbstractFlatNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3334:3: lv_nodes_21_0= ruleAbstractFlatNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNodesAbstractFlatNodeParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork7328);
                    lv_nodes_21_0=ruleAbstractFlatNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_21_0, 
                            		"AbstractFlatNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3350:2: (otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==15) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3350:4: otherlv_22= ',' ( (lv_nodes_23_0= ruleAbstractFlatNode ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFlatNetwork7341); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getFlatNetworkAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3354:1: ( (lv_nodes_23_0= ruleAbstractFlatNode ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3355:1: (lv_nodes_23_0= ruleAbstractFlatNode )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3355:1: (lv_nodes_23_0= ruleAbstractFlatNode )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3356:3: lv_nodes_23_0= ruleAbstractFlatNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFlatNetworkAccess().getNodesAbstractFlatNodeParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork7362);
                    	    lv_nodes_23_0=ruleAbstractFlatNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFlatNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_23_0, 
                    	            		"AbstractFlatNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork7376); 

                        	newLeafNode(otherlv_24, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlatNetwork7390); 

                	newLeafNode(otherlv_25, grammarAccess.getFlatNetworkAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleFlatNetwork"


    // $ANTLR start "entryRuleClusteredNetwork"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3388:1: entryRuleClusteredNetwork returns [EObject current=null] : iv_ruleClusteredNetwork= ruleClusteredNetwork EOF ;
    public final EObject entryRuleClusteredNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusteredNetwork = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3389:2: (iv_ruleClusteredNetwork= ruleClusteredNetwork EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3390:2: iv_ruleClusteredNetwork= ruleClusteredNetwork EOF
            {
             newCompositeNode(grammarAccess.getClusteredNetworkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClusteredNetwork_in_entryRuleClusteredNetwork7426);
            iv_ruleClusteredNetwork=ruleClusteredNetwork();

            state._fsp--;

             current =iv_ruleClusteredNetwork; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClusteredNetwork7436); 

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
    // $ANTLR end "entryRuleClusteredNetwork"


    // $ANTLR start "ruleClusteredNetwork"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3397:1: ruleClusteredNetwork returns [EObject current=null] : ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleClusteredNetwork() throws RecognitionException {
        EObject current = null;

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
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_nbOfNodes_6_0 = null;

        Enumerator lv_interNodeComm_8_0 = null;

        Enumerator lv_routingProtocol_10_0 = null;

        EObject lv_resources_13_0 = null;

        EObject lv_resources_15_0 = null;

        EObject lv_sink_18_0 = null;

        EObject lv_clusters_21_0 = null;

        EObject lv_clusters_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3400:28: ( ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3401:1: ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3401:1: ( () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3401:2: () otherlv_1= 'ClusteredNetwork' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )? (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )? (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )? (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )? (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )? (otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3401:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3402:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusteredNetworkAccess().getClusteredNetworkAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleClusteredNetwork7482); 

                	newLeafNode(otherlv_1, grammarAccess.getClusteredNetworkAccess().getClusteredNetworkKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork7494); 

                	newLeafNode(otherlv_2, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3415:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==13) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3415:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClusteredNetwork7507); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusteredNetworkAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3419:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3420:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3420:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3421:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusteredNetwork7528);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3437:4: (otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==50) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3437:6: otherlv_5= 'nbOfNodes' ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleClusteredNetwork7543); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusteredNetworkAccess().getNbOfNodesKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3441:1: ( (lv_nbOfNodes_6_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3442:1: (lv_nbOfNodes_6_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3442:1: (lv_nbOfNodes_6_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3443:3: lv_nbOfNodes_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getNbOfNodesEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleClusteredNetwork7564);
                    lv_nbOfNodes_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"nbOfNodes",
                            		lv_nbOfNodes_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3459:4: (otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==51) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3459:6: otherlv_7= 'interNodeComm' ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    {
                    otherlv_7=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleClusteredNetwork7579); 

                        	newLeafNode(otherlv_7, grammarAccess.getClusteredNetworkAccess().getInterNodeCommKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3463:1: ( (lv_interNodeComm_8_0= ruleInterNodeComm ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3464:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3464:1: (lv_interNodeComm_8_0= ruleInterNodeComm )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3465:3: lv_interNodeComm_8_0= ruleInterNodeComm
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getInterNodeCommInterNodeCommEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterNodeComm_in_ruleClusteredNetwork7600);
                    lv_interNodeComm_8_0=ruleInterNodeComm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"interNodeComm",
                            		lv_interNodeComm_8_0, 
                            		"InterNodeComm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3481:4: (otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==52) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3481:6: otherlv_9= 'routingProtocol' ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    {
                    otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleClusteredNetwork7615); 

                        	newLeafNode(otherlv_9, grammarAccess.getClusteredNetworkAccess().getRoutingProtocolKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3485:1: ( (lv_routingProtocol_10_0= ruleRoutingProtocol ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3486:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3486:1: (lv_routingProtocol_10_0= ruleRoutingProtocol )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3487:3: lv_routingProtocol_10_0= ruleRoutingProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getRoutingProtocolRoutingProtocolEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRoutingProtocol_in_ruleClusteredNetwork7636);
                    lv_routingProtocol_10_0=ruleRoutingProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"routingProtocol",
                            		lv_routingProtocol_10_0, 
                            		"RoutingProtocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3503:4: (otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==53) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3503:6: otherlv_11= 'resources' otherlv_12= '{' ( (lv_resources_13_0= ruleAbstractSensor ) ) (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleClusteredNetwork7651); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusteredNetworkAccess().getResourcesKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork7663); 

                        	newLeafNode(otherlv_12, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3511:1: ( (lv_resources_13_0= ruleAbstractSensor ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3512:1: (lv_resources_13_0= ruleAbstractSensor )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3512:1: (lv_resources_13_0= ruleAbstractSensor )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3513:3: lv_resources_13_0= ruleAbstractSensor
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getResourcesAbstractSensorParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7684);
                    lv_resources_13_0=ruleAbstractSensor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_13_0, 
                            		"AbstractSensor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3529:2: (otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==15) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3529:4: otherlv_14= ',' ( (lv_resources_15_0= ruleAbstractSensor ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClusteredNetwork7697); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3533:1: ( (lv_resources_15_0= ruleAbstractSensor ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3534:1: (lv_resources_15_0= ruleAbstractSensor )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3534:1: (lv_resources_15_0= ruleAbstractSensor )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3535:3: lv_resources_15_0= ruleAbstractSensor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getResourcesAbstractSensorParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7718);
                    	    lv_resources_15_0=ruleAbstractSensor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_15_0, 
                    	            		"AbstractSensor");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork7732); 

                        	newLeafNode(otherlv_16, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3555:3: (otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==54) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3555:5: otherlv_17= 'sink' ( (lv_sink_18_0= ruleSinkNode ) )
                    {
                    otherlv_17=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleClusteredNetwork7747); 

                        	newLeafNode(otherlv_17, grammarAccess.getClusteredNetworkAccess().getSinkKeyword_8_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3559:1: ( (lv_sink_18_0= ruleSinkNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3560:1: (lv_sink_18_0= ruleSinkNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3560:1: (lv_sink_18_0= ruleSinkNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3561:3: lv_sink_18_0= ruleSinkNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getSinkSinkNodeParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSinkNode_in_ruleClusteredNetwork7768);
                    lv_sink_18_0=ruleSinkNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		set(
                           			current, 
                           			"sink",
                            		lv_sink_18_0, 
                            		"SinkNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3577:4: (otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==57) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3577:6: otherlv_19= 'clusters' otherlv_20= '{' ( (lv_clusters_21_0= ruleCluster ) ) (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleClusteredNetwork7783); 

                        	newLeafNode(otherlv_19, grammarAccess.getClusteredNetworkAccess().getClustersKeyword_9_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClusteredNetwork7795); 

                        	newLeafNode(otherlv_20, grammarAccess.getClusteredNetworkAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3585:1: ( (lv_clusters_21_0= ruleCluster ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3586:1: (lv_clusters_21_0= ruleCluster )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3586:1: (lv_clusters_21_0= ruleCluster )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3587:3: lv_clusters_21_0= ruleCluster
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getClustersClusterParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleClusteredNetwork7816);
                    lv_clusters_21_0=ruleCluster();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	        }
                           		add(
                           			current, 
                           			"clusters",
                            		lv_clusters_21_0, 
                            		"Cluster");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3603:2: (otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==15) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3603:4: otherlv_22= ',' ( (lv_clusters_23_0= ruleCluster ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClusteredNetwork7829); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getClusteredNetworkAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3607:1: ( (lv_clusters_23_0= ruleCluster ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3608:1: (lv_clusters_23_0= ruleCluster )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3608:1: (lv_clusters_23_0= ruleCluster )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3609:3: lv_clusters_23_0= ruleCluster
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusteredNetworkAccess().getClustersClusterParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCluster_in_ruleClusteredNetwork7850);
                    	    lv_clusters_23_0=ruleCluster();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusteredNetworkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clusters",
                    	            		lv_clusters_23_0, 
                    	            		"Cluster");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork7864); 

                        	newLeafNode(otherlv_24, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClusteredNetwork7878); 

                	newLeafNode(otherlv_25, grammarAccess.getClusteredNetworkAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleClusteredNetwork"


    // $ANTLR start "entryRuleCluster"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3641:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3642:2: (iv_ruleCluster= ruleCluster EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3643:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCluster_in_entryRuleCluster7914);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCluster7924); 

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
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3650:1: ruleCluster returns [EObject current=null] : ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_nodes_13_0 = null;

        EObject lv_nodes_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3653:28: ( ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3654:1: ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3654:1: ( () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3654:2: () otherlv_1= 'Cluster' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )? (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3654:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3655:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClusterAccess().getClusterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleCluster7970); 

                	newLeafNode(otherlv_1, grammarAccess.getClusterAccess().getClusterKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster7982); 

                	newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3668:1: (otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==13) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3668:3: otherlv_3= 'id' ( (lv_id_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCluster7995); 

                        	newLeafNode(otherlv_3, grammarAccess.getClusterAccess().getIdKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3672:1: ( (lv_id_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3673:1: (lv_id_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3673:1: (lv_id_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3674:3: lv_id_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getIdEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCluster8016);
                    lv_id_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3690:4: (otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==53) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3690:6: otherlv_5= 'resources' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCluster8031); 

                        	newLeafNode(otherlv_5, grammarAccess.getClusterAccess().getResourcesKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleCluster8043); 

                        	newLeafNode(otherlv_6, grammarAccess.getClusterAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3698:1: ( ( ruleEString ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3699:1: ( ruleEString )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3699:1: ( ruleEString )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3700:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClusterRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getResourcesAbstractSensorCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster8066);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3713:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==15) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3713:4: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCluster8079); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getClusterAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3717:1: ( ( ruleEString ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3718:1: ( ruleEString )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3718:1: ( ruleEString )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3719:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClusterRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getResourcesAbstractSensorCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCluster8102);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleCluster8116); 

                        	newLeafNode(otherlv_10, grammarAccess.getClusterAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3736:3: (otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==55) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3736:5: otherlv_11= 'nodes' otherlv_12= '{' ( (lv_nodes_13_0= ruleAbstractClusterNode ) ) (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCluster8131); 

                        	newLeafNode(otherlv_11, grammarAccess.getClusterAccess().getNodesKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCluster8143); 

                        	newLeafNode(otherlv_12, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3744:1: ( (lv_nodes_13_0= ruleAbstractClusterNode ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3745:1: (lv_nodes_13_0= ruleAbstractClusterNode )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3745:1: (lv_nodes_13_0= ruleAbstractClusterNode )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3746:3: lv_nodes_13_0= ruleAbstractClusterNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getClusterAccess().getNodesAbstractClusterNodeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_ruleCluster8164);
                    lv_nodes_13_0=ruleAbstractClusterNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_13_0, 
                            		"AbstractClusterNode");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3762:2: (otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==15) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3762:4: otherlv_14= ',' ( (lv_nodes_15_0= ruleAbstractClusterNode ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCluster8177); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getClusterAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3766:1: ( (lv_nodes_15_0= ruleAbstractClusterNode ) )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3767:1: (lv_nodes_15_0= ruleAbstractClusterNode )
                    	    {
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3767:1: (lv_nodes_15_0= ruleAbstractClusterNode )
                    	    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3768:3: lv_nodes_15_0= ruleAbstractClusterNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClusterAccess().getNodesAbstractClusterNodeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractClusterNode_in_ruleCluster8198);
                    	    lv_nodes_15_0=ruleAbstractClusterNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClusterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_15_0, 
                    	            		"AbstractClusterNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCluster8212); 

                        	newLeafNode(otherlv_16, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCluster8226); 

                	newLeafNode(otherlv_17, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleReceiveMessageTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3800:1: entryRuleReceiveMessageTrigger returns [EObject current=null] : iv_ruleReceiveMessageTrigger= ruleReceiveMessageTrigger EOF ;
    public final EObject entryRuleReceiveMessageTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveMessageTrigger = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3801:2: (iv_ruleReceiveMessageTrigger= ruleReceiveMessageTrigger EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3802:2: iv_ruleReceiveMessageTrigger= ruleReceiveMessageTrigger EOF
            {
             newCompositeNode(grammarAccess.getReceiveMessageTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReceiveMessageTrigger_in_entryRuleReceiveMessageTrigger8262);
            iv_ruleReceiveMessageTrigger=ruleReceiveMessageTrigger();

            state._fsp--;

             current =iv_ruleReceiveMessageTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReceiveMessageTrigger8272); 

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
    // $ANTLR end "entryRuleReceiveMessageTrigger"


    // $ANTLR start "ruleReceiveMessageTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3809:1: ruleReceiveMessageTrigger returns [EObject current=null] : ( () otherlv_1= 'ReceiveMessageTrigger' ) ;
    public final EObject ruleReceiveMessageTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3812:28: ( ( () otherlv_1= 'ReceiveMessageTrigger' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3813:1: ( () otherlv_1= 'ReceiveMessageTrigger' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3813:1: ( () otherlv_1= 'ReceiveMessageTrigger' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3813:2: () otherlv_1= 'ReceiveMessageTrigger'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3813:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3814:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReceiveMessageTriggerAccess().getReceiveMessageTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleReceiveMessageTrigger8318); 

                	newLeafNode(otherlv_1, grammarAccess.getReceiveMessageTriggerAccess().getReceiveMessageTriggerKeyword_1());
                

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
    // $ANTLR end "ruleReceiveMessageTrigger"


    // $ANTLR start "entryRuleRecieveSerialMsgTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3831:1: entryRuleRecieveSerialMsgTrigger returns [EObject current=null] : iv_ruleRecieveSerialMsgTrigger= ruleRecieveSerialMsgTrigger EOF ;
    public final EObject entryRuleRecieveSerialMsgTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecieveSerialMsgTrigger = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3832:2: (iv_ruleRecieveSerialMsgTrigger= ruleRecieveSerialMsgTrigger EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3833:2: iv_ruleRecieveSerialMsgTrigger= ruleRecieveSerialMsgTrigger EOF
            {
             newCompositeNode(grammarAccess.getRecieveSerialMsgTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecieveSerialMsgTrigger_in_entryRuleRecieveSerialMsgTrigger8354);
            iv_ruleRecieveSerialMsgTrigger=ruleRecieveSerialMsgTrigger();

            state._fsp--;

             current =iv_ruleRecieveSerialMsgTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecieveSerialMsgTrigger8364); 

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
    // $ANTLR end "entryRuleRecieveSerialMsgTrigger"


    // $ANTLR start "ruleRecieveSerialMsgTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3840:1: ruleRecieveSerialMsgTrigger returns [EObject current=null] : ( () otherlv_1= 'RecieveSerialMsgTrigger' ) ;
    public final EObject ruleRecieveSerialMsgTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3843:28: ( ( () otherlv_1= 'RecieveSerialMsgTrigger' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3844:1: ( () otherlv_1= 'RecieveSerialMsgTrigger' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3844:1: ( () otherlv_1= 'RecieveSerialMsgTrigger' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3844:2: () otherlv_1= 'RecieveSerialMsgTrigger'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3844:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3845:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecieveSerialMsgTriggerAccess().getRecieveSerialMsgTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleRecieveSerialMsgTrigger8410); 

                	newLeafNode(otherlv_1, grammarAccess.getRecieveSerialMsgTriggerAccess().getRecieveSerialMsgTriggerKeyword_1());
                

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
    // $ANTLR end "ruleRecieveSerialMsgTrigger"


    // $ANTLR start "entryRuleStartJobTrigger_Impl"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3862:1: entryRuleStartJobTrigger_Impl returns [EObject current=null] : iv_ruleStartJobTrigger_Impl= ruleStartJobTrigger_Impl EOF ;
    public final EObject entryRuleStartJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartJobTrigger_Impl = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3863:2: (iv_ruleStartJobTrigger_Impl= ruleStartJobTrigger_Impl EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3864:2: iv_ruleStartJobTrigger_Impl= ruleStartJobTrigger_Impl EOF
            {
             newCompositeNode(grammarAccess.getStartJobTrigger_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStartJobTrigger_Impl_in_entryRuleStartJobTrigger_Impl8446);
            iv_ruleStartJobTrigger_Impl=ruleStartJobTrigger_Impl();

            state._fsp--;

             current =iv_ruleStartJobTrigger_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStartJobTrigger_Impl8456); 

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
    // $ANTLR end "entryRuleStartJobTrigger_Impl"


    // $ANTLR start "ruleStartJobTrigger_Impl"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3871:1: ruleStartJobTrigger_Impl returns [EObject current=null] : ( () otherlv_1= 'StartJobTrigger' ) ;
    public final EObject ruleStartJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3874:28: ( ( () otherlv_1= 'StartJobTrigger' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3875:1: ( () otherlv_1= 'StartJobTrigger' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3875:1: ( () otherlv_1= 'StartJobTrigger' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3875:2: () otherlv_1= 'StartJobTrigger'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3875:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3876:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStartJobTrigger_ImplAccess().getStartJobTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleStartJobTrigger_Impl8502); 

                	newLeafNode(otherlv_1, grammarAccess.getStartJobTrigger_ImplAccess().getStartJobTriggerKeyword_1());
                

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
    // $ANTLR end "ruleStartJobTrigger_Impl"


    // $ANTLR start "entryRuleStopJobTrigger_Impl"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3893:1: entryRuleStopJobTrigger_Impl returns [EObject current=null] : iv_ruleStopJobTrigger_Impl= ruleStopJobTrigger_Impl EOF ;
    public final EObject entryRuleStopJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopJobTrigger_Impl = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3894:2: (iv_ruleStopJobTrigger_Impl= ruleStopJobTrigger_Impl EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3895:2: iv_ruleStopJobTrigger_Impl= ruleStopJobTrigger_Impl EOF
            {
             newCompositeNode(grammarAccess.getStopJobTrigger_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStopJobTrigger_Impl_in_entryRuleStopJobTrigger_Impl8538);
            iv_ruleStopJobTrigger_Impl=ruleStopJobTrigger_Impl();

            state._fsp--;

             current =iv_ruleStopJobTrigger_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStopJobTrigger_Impl8548); 

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
    // $ANTLR end "entryRuleStopJobTrigger_Impl"


    // $ANTLR start "ruleStopJobTrigger_Impl"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3902:1: ruleStopJobTrigger_Impl returns [EObject current=null] : ( () otherlv_1= 'StopJobTrigger' ) ;
    public final EObject ruleStopJobTrigger_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3905:28: ( ( () otherlv_1= 'StopJobTrigger' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3906:1: ( () otherlv_1= 'StopJobTrigger' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3906:1: ( () otherlv_1= 'StopJobTrigger' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3906:2: () otherlv_1= 'StopJobTrigger'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3906:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3907:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStopJobTrigger_ImplAccess().getStopJobTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleStopJobTrigger_Impl8594); 

                	newLeafNode(otherlv_1, grammarAccess.getStopJobTrigger_ImplAccess().getStopJobTriggerKeyword_1());
                

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
    // $ANTLR end "ruleStopJobTrigger_Impl"


    // $ANTLR start "entryRulePushButtomTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3924:1: entryRulePushButtomTrigger returns [EObject current=null] : iv_rulePushButtomTrigger= rulePushButtomTrigger EOF ;
    public final EObject entryRulePushButtomTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushButtomTrigger = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3925:2: (iv_rulePushButtomTrigger= rulePushButtomTrigger EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3926:2: iv_rulePushButtomTrigger= rulePushButtomTrigger EOF
            {
             newCompositeNode(grammarAccess.getPushButtomTriggerRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePushButtomTrigger_in_entryRulePushButtomTrigger8630);
            iv_rulePushButtomTrigger=rulePushButtomTrigger();

            state._fsp--;

             current =iv_rulePushButtomTrigger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePushButtomTrigger8640); 

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
    // $ANTLR end "entryRulePushButtomTrigger"


    // $ANTLR start "rulePushButtomTrigger"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3933:1: rulePushButtomTrigger returns [EObject current=null] : ( () otherlv_1= 'PushButtomTrigger' ) ;
    public final EObject rulePushButtomTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3936:28: ( ( () otherlv_1= 'PushButtomTrigger' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3937:1: ( () otherlv_1= 'PushButtomTrigger' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3937:1: ( () otherlv_1= 'PushButtomTrigger' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3937:2: () otherlv_1= 'PushButtomTrigger'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3937:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3938:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPushButtomTriggerAccess().getPushButtomTriggerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulePushButtomTrigger8686); 

                	newLeafNode(otherlv_1, grammarAccess.getPushButtomTriggerAccess().getPushButtomTriggerKeyword_1());
                

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
    // $ANTLR end "rulePushButtomTrigger"


    // $ANTLR start "entryRuleConditionalAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3955:1: entryRuleConditionalAction returns [EObject current=null] : iv_ruleConditionalAction= ruleConditionalAction EOF ;
    public final EObject entryRuleConditionalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3956:2: (iv_ruleConditionalAction= ruleConditionalAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3957:2: iv_ruleConditionalAction= ruleConditionalAction EOF
            {
             newCompositeNode(grammarAccess.getConditionalActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_entryRuleConditionalAction8722);
            iv_ruleConditionalAction=ruleConditionalAction();

            state._fsp--;

             current =iv_ruleConditionalAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionalAction8732); 

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
    // $ANTLR end "entryRuleConditionalAction"


    // $ANTLR start "ruleConditionalAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3964:1: ruleConditionalAction returns [EObject current=null] : ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleConditionalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_sensorTerm_4_0 = null;

        Enumerator lv_logicalSymbol_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_unit_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3967:28: ( ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3968:1: ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3968:1: ( () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3968:2: () otherlv_1= 'ConditionalAction' otherlv_2= '{' (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )? (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )? (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3968:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3969:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConditionalActionAccess().getConditionalActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleConditionalAction8778); 

                	newLeafNode(otherlv_1, grammarAccess.getConditionalActionAccess().getConditionalActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConditionalAction8790); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3982:1: (otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==67) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3982:3: otherlv_3= 'sensorTerm' ( (lv_sensorTerm_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleConditionalAction8803); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionalActionAccess().getSensorTermKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3986:1: ( (lv_sensorTerm_4_0= ruleEString ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3987:1: (lv_sensorTerm_4_0= ruleEString )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3987:1: (lv_sensorTerm_4_0= ruleEString )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:3988:3: lv_sensorTerm_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getSensorTermEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConditionalAction8824);
                    lv_sensorTerm_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"sensorTerm",
                            		lv_sensorTerm_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4004:4: (otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==68) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4004:6: otherlv_5= 'logicalSymbol' ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) )
                    {
                    otherlv_5=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleConditionalAction8839); 

                        	newLeafNode(otherlv_5, grammarAccess.getConditionalActionAccess().getLogicalSymbolKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4008:1: ( (lv_logicalSymbol_6_0= ruleLogicalSymbol ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4009:1: (lv_logicalSymbol_6_0= ruleLogicalSymbol )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4009:1: (lv_logicalSymbol_6_0= ruleLogicalSymbol )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4010:3: lv_logicalSymbol_6_0= ruleLogicalSymbol
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getLogicalSymbolLogicalSymbolEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalSymbol_in_ruleConditionalAction8860);
                    lv_logicalSymbol_6_0=ruleLogicalSymbol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"logicalSymbol",
                            		lv_logicalSymbol_6_0, 
                            		"LogicalSymbol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4026:4: (otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==69) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4026:6: otherlv_7= 'value' ( (lv_value_8_0= ruleELong ) )
                    {
                    otherlv_7=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleConditionalAction8875); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalActionAccess().getValueKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4030:1: ( (lv_value_8_0= ruleELong ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4031:1: (lv_value_8_0= ruleELong )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4031:1: (lv_value_8_0= ruleELong )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4032:3: lv_value_8_0= ruleELong
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getValueELongParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleConditionalAction8896);
                    lv_value_8_0=ruleELong();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"ELong");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4048:4: (otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==70) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4048:6: otherlv_9= 'unit' ( (lv_unit_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleConditionalAction8911); 

                        	newLeafNode(otherlv_9, grammarAccess.getConditionalActionAccess().getUnitKeyword_6_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4052:1: ( (lv_unit_10_0= ruleEString ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4053:1: (lv_unit_10_0= ruleEString )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4053:1: (lv_unit_10_0= ruleEString )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4054:3: lv_unit_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalActionAccess().getUnitEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConditionalAction8932);
                    lv_unit_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalActionRule());
                    	        }
                           		set(
                           			current, 
                           			"unit",
                            		lv_unit_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConditionalAction8946); 

                	newLeafNode(otherlv_11, grammarAccess.getConditionalActionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleConditionalAction"


    // $ANTLR start "entryRuleReadNodeMemoryAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4082:1: entryRuleReadNodeMemoryAction returns [EObject current=null] : iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF ;
    public final EObject entryRuleReadNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadNodeMemoryAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4083:2: (iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4084:2: iv_ruleReadNodeMemoryAction= ruleReadNodeMemoryAction EOF
            {
             newCompositeNode(grammarAccess.getReadNodeMemoryActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReadNodeMemoryAction_in_entryRuleReadNodeMemoryAction8982);
            iv_ruleReadNodeMemoryAction=ruleReadNodeMemoryAction();

            state._fsp--;

             current =iv_ruleReadNodeMemoryAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReadNodeMemoryAction8992); 

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
    // $ANTLR end "entryRuleReadNodeMemoryAction"


    // $ANTLR start "ruleReadNodeMemoryAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4091:1: ruleReadNodeMemoryAction returns [EObject current=null] : ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleReadNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4094:28: ( ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4095:1: ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4095:1: ( () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4095:2: () otherlv_1= 'ReadNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4095:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4096:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReadNodeMemoryActionAccess().getReadNodeMemoryActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleReadNodeMemoryAction9038); 

                	newLeafNode(otherlv_1, grammarAccess.getReadNodeMemoryActionAccess().getReadNodeMemoryActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReadNodeMemoryAction9050); 

                	newLeafNode(otherlv_2, grammarAccess.getReadNodeMemoryActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4109:1: (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==72) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4109:3: otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) )
                    {
                    otherlv_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleReadNodeMemoryAction9063); 

                        	newLeafNode(otherlv_3, grammarAccess.getReadNodeMemoryActionAccess().getConditionKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4113:1: ( (lv_condition_4_0= ruleConditionalAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4114:1: (lv_condition_4_0= ruleConditionalAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4114:1: (lv_condition_4_0= ruleConditionalAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4115:3: lv_condition_4_0= ruleConditionalAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getReadNodeMemoryActionAccess().getConditionConditionalActionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleReadNodeMemoryAction9084);
                    lv_condition_4_0=ruleConditionalAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReadNodeMemoryActionRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_4_0, 
                            		"ConditionalAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleReadNodeMemoryAction9098); 

                	newLeafNode(otherlv_5, grammarAccess.getReadNodeMemoryActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleReadNodeMemoryAction"


    // $ANTLR start "entryRuleWriteNodeMemoryAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4143:1: entryRuleWriteNodeMemoryAction returns [EObject current=null] : iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF ;
    public final EObject entryRuleWriteNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWriteNodeMemoryAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4144:2: (iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4145:2: iv_ruleWriteNodeMemoryAction= ruleWriteNodeMemoryAction EOF
            {
             newCompositeNode(grammarAccess.getWriteNodeMemoryActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWriteNodeMemoryAction_in_entryRuleWriteNodeMemoryAction9134);
            iv_ruleWriteNodeMemoryAction=ruleWriteNodeMemoryAction();

            state._fsp--;

             current =iv_ruleWriteNodeMemoryAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWriteNodeMemoryAction9144); 

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
    // $ANTLR end "entryRuleWriteNodeMemoryAction"


    // $ANTLR start "ruleWriteNodeMemoryAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4152:1: ruleWriteNodeMemoryAction returns [EObject current=null] : ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleWriteNodeMemoryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4155:28: ( ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4156:1: ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4156:1: ( () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4156:2: () otherlv_1= 'WriteNodeMemoryAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4156:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4157:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWriteNodeMemoryActionAccess().getWriteNodeMemoryActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleWriteNodeMemoryAction9190); 

                	newLeafNode(otherlv_1, grammarAccess.getWriteNodeMemoryActionAccess().getWriteNodeMemoryActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWriteNodeMemoryAction9202); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteNodeMemoryActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4170:1: (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==72) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4170:3: otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) )
                    {
                    otherlv_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleWriteNodeMemoryAction9215); 

                        	newLeafNode(otherlv_3, grammarAccess.getWriteNodeMemoryActionAccess().getConditionKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4174:1: ( (lv_condition_4_0= ruleConditionalAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4175:1: (lv_condition_4_0= ruleConditionalAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4175:1: (lv_condition_4_0= ruleConditionalAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4176:3: lv_condition_4_0= ruleConditionalAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getWriteNodeMemoryActionAccess().getConditionConditionalActionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleWriteNodeMemoryAction9236);
                    lv_condition_4_0=ruleConditionalAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWriteNodeMemoryActionRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_4_0, 
                            		"ConditionalAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWriteNodeMemoryAction9250); 

                	newLeafNode(otherlv_5, grammarAccess.getWriteNodeMemoryActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleWriteNodeMemoryAction"


    // $ANTLR start "entryRuleSendMessageAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4204:1: entryRuleSendMessageAction returns [EObject current=null] : iv_ruleSendMessageAction= ruleSendMessageAction EOF ;
    public final EObject entryRuleSendMessageAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMessageAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4205:2: (iv_ruleSendMessageAction= ruleSendMessageAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4206:2: iv_ruleSendMessageAction= ruleSendMessageAction EOF
            {
             newCompositeNode(grammarAccess.getSendMessageActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSendMessageAction_in_entryRuleSendMessageAction9286);
            iv_ruleSendMessageAction=ruleSendMessageAction();

            state._fsp--;

             current =iv_ruleSendMessageAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSendMessageAction9296); 

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
    // $ANTLR end "entryRuleSendMessageAction"


    // $ANTLR start "ruleSendMessageAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4213:1: ruleSendMessageAction returns [EObject current=null] : ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSendMessageAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_sendMessageTo_4_0 = null;

        EObject lv_condition_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4216:28: ( ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) ) )? otherlv_7= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4217:1: ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) ) )? otherlv_7= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4217:1: ( () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) ) )? otherlv_7= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4217:2: () otherlv_1= 'SendMessageAction' otherlv_2= '{' (otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) ) )? (otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) ) )? otherlv_7= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4217:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendMessageActionAccess().getSendMessageActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleSendMessageAction9342); 

                	newLeafNode(otherlv_1, grammarAccess.getSendMessageActionAccess().getSendMessageActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSendMessageAction9354); 

                	newLeafNode(otherlv_2, grammarAccess.getSendMessageActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4231:1: (otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==75) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4231:3: otherlv_3= 'sendMessageTo' ( (lv_sendMessageTo_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleSendMessageAction9367); 

                        	newLeafNode(otherlv_3, grammarAccess.getSendMessageActionAccess().getSendMessageToKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4235:1: ( (lv_sendMessageTo_4_0= ruleEInt ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4236:1: (lv_sendMessageTo_4_0= ruleEInt )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4236:1: (lv_sendMessageTo_4_0= ruleEInt )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4237:3: lv_sendMessageTo_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getSendMessageToEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSendMessageAction9388);
                    lv_sendMessageTo_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSendMessageActionRule());
                    	        }
                           		set(
                           			current, 
                           			"sendMessageTo",
                            		lv_sendMessageTo_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4253:4: (otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==72) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4253:6: otherlv_5= 'condition' ( (lv_condition_6_0= ruleConditionalAction ) )
                    {
                    otherlv_5=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSendMessageAction9403); 

                        	newLeafNode(otherlv_5, grammarAccess.getSendMessageActionAccess().getConditionKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4257:1: ( (lv_condition_6_0= ruleConditionalAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4258:1: (lv_condition_6_0= ruleConditionalAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4258:1: (lv_condition_6_0= ruleConditionalAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4259:3: lv_condition_6_0= ruleConditionalAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSendMessageActionAccess().getConditionConditionalActionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleSendMessageAction9424);
                    lv_condition_6_0=ruleConditionalAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSendMessageActionRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_6_0, 
                            		"ConditionalAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSendMessageAction9438); 

                	newLeafNode(otherlv_7, grammarAccess.getSendMessageActionAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSendMessageAction"


    // $ANTLR start "entryRuleBlinkAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4287:1: entryRuleBlinkAction returns [EObject current=null] : iv_ruleBlinkAction= ruleBlinkAction EOF ;
    public final EObject entryRuleBlinkAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlinkAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4288:2: (iv_ruleBlinkAction= ruleBlinkAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4289:2: iv_ruleBlinkAction= ruleBlinkAction EOF
            {
             newCompositeNode(grammarAccess.getBlinkActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBlinkAction_in_entryRuleBlinkAction9474);
            iv_ruleBlinkAction=ruleBlinkAction();

            state._fsp--;

             current =iv_ruleBlinkAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBlinkAction9484); 

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
    // $ANTLR end "entryRuleBlinkAction"


    // $ANTLR start "ruleBlinkAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4296:1: ruleBlinkAction returns [EObject current=null] : ( () otherlv_1= 'BlinkAction' otherlv_2= '{' (otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleBlinkAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_led_4_0 = null;

        Enumerator lv_status_6_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4299:28: ( ( () otherlv_1= 'BlinkAction' otherlv_2= '{' (otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) ) )? otherlv_9= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4300:1: ( () otherlv_1= 'BlinkAction' otherlv_2= '{' (otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) ) )? otherlv_9= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4300:1: ( () otherlv_1= 'BlinkAction' otherlv_2= '{' (otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) ) )? otherlv_9= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4300:2: () otherlv_1= 'BlinkAction' otherlv_2= '{' (otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) ) )? (otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) ) )? (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) ) )? otherlv_9= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4300:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlinkActionAccess().getBlinkActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleBlinkAction9530); 

                	newLeafNode(otherlv_1, grammarAccess.getBlinkActionAccess().getBlinkActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBlinkAction9542); 

                	newLeafNode(otherlv_2, grammarAccess.getBlinkActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4314:1: (otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==77) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4314:3: otherlv_3= 'led' ( (lv_led_4_0= ruleLeds ) )
                    {
                    otherlv_3=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleBlinkAction9555); 

                        	newLeafNode(otherlv_3, grammarAccess.getBlinkActionAccess().getLedKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4318:1: ( (lv_led_4_0= ruleLeds ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4319:1: (lv_led_4_0= ruleLeds )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4319:1: (lv_led_4_0= ruleLeds )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4320:3: lv_led_4_0= ruleLeds
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlinkActionAccess().getLedLedsEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLeds_in_ruleBlinkAction9576);
                    lv_led_4_0=ruleLeds();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlinkActionRule());
                    	        }
                           		set(
                           			current, 
                           			"led",
                            		lv_led_4_0, 
                            		"Leds");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4336:4: (otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==78) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4336:6: otherlv_5= 'status' ( (lv_status_6_0= ruleLedStatus ) )
                    {
                    otherlv_5=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleBlinkAction9591); 

                        	newLeafNode(otherlv_5, grammarAccess.getBlinkActionAccess().getStatusKeyword_4_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4340:1: ( (lv_status_6_0= ruleLedStatus ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4341:1: (lv_status_6_0= ruleLedStatus )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4341:1: (lv_status_6_0= ruleLedStatus )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4342:3: lv_status_6_0= ruleLedStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlinkActionAccess().getStatusLedStatusEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLedStatus_in_ruleBlinkAction9612);
                    lv_status_6_0=ruleLedStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlinkActionRule());
                    	        }
                           		set(
                           			current, 
                           			"status",
                            		lv_status_6_0, 
                            		"LedStatus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4358:4: (otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==72) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4358:6: otherlv_7= 'condition' ( (lv_condition_8_0= ruleConditionalAction ) )
                    {
                    otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleBlinkAction9627); 

                        	newLeafNode(otherlv_7, grammarAccess.getBlinkActionAccess().getConditionKeyword_5_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4362:1: ( (lv_condition_8_0= ruleConditionalAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4363:1: (lv_condition_8_0= ruleConditionalAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4363:1: (lv_condition_8_0= ruleConditionalAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4364:3: lv_condition_8_0= ruleConditionalAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlinkActionAccess().getConditionConditionalActionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleBlinkAction9648);
                    lv_condition_8_0=ruleConditionalAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlinkActionRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_8_0, 
                            		"ConditionalAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBlinkAction9662); 

                	newLeafNode(otherlv_9, grammarAccess.getBlinkActionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleBlinkAction"


    // $ANTLR start "entryRuleSendSerialPortMsgAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4392:1: entryRuleSendSerialPortMsgAction returns [EObject current=null] : iv_ruleSendSerialPortMsgAction= ruleSendSerialPortMsgAction EOF ;
    public final EObject entryRuleSendSerialPortMsgAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSerialPortMsgAction = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4393:2: (iv_ruleSendSerialPortMsgAction= ruleSendSerialPortMsgAction EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4394:2: iv_ruleSendSerialPortMsgAction= ruleSendSerialPortMsgAction EOF
            {
             newCompositeNode(grammarAccess.getSendSerialPortMsgActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSendSerialPortMsgAction_in_entryRuleSendSerialPortMsgAction9698);
            iv_ruleSendSerialPortMsgAction=ruleSendSerialPortMsgAction();

            state._fsp--;

             current =iv_ruleSendSerialPortMsgAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSendSerialPortMsgAction9708); 

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
    // $ANTLR end "entryRuleSendSerialPortMsgAction"


    // $ANTLR start "ruleSendSerialPortMsgAction"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4401:1: ruleSendSerialPortMsgAction returns [EObject current=null] : ( () otherlv_1= 'SendSerialPortMsgAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSendSerialPortMsgAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4404:28: ( ( () otherlv_1= 'SendSerialPortMsgAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4405:1: ( () otherlv_1= 'SendSerialPortMsgAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4405:1: ( () otherlv_1= 'SendSerialPortMsgAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}' )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4405:2: () otherlv_1= 'SendSerialPortMsgAction' otherlv_2= '{' (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )? otherlv_5= '}'
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4405:2: ()
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4406:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSendSerialPortMsgActionAccess().getSendSerialPortMsgActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleSendSerialPortMsgAction9754); 

                	newLeafNode(otherlv_1, grammarAccess.getSendSerialPortMsgActionAccess().getSendSerialPortMsgActionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSendSerialPortMsgAction9766); 

                	newLeafNode(otherlv_2, grammarAccess.getSendSerialPortMsgActionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4419:1: (otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==72) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4419:3: otherlv_3= 'condition' ( (lv_condition_4_0= ruleConditionalAction ) )
                    {
                    otherlv_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSendSerialPortMsgAction9779); 

                        	newLeafNode(otherlv_3, grammarAccess.getSendSerialPortMsgActionAccess().getConditionKeyword_3_0());
                        
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4423:1: ( (lv_condition_4_0= ruleConditionalAction ) )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4424:1: (lv_condition_4_0= ruleConditionalAction )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4424:1: (lv_condition_4_0= ruleConditionalAction )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4425:3: lv_condition_4_0= ruleConditionalAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getSendSerialPortMsgActionAccess().getConditionConditionalActionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditionalAction_in_ruleSendSerialPortMsgAction9800);
                    lv_condition_4_0=ruleConditionalAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSendSerialPortMsgActionRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_4_0, 
                            		"ConditionalAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSendSerialPortMsgAction9814); 

                	newLeafNode(otherlv_5, grammarAccess.getSendSerialPortMsgActionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSendSerialPortMsgAction"


    // $ANTLR start "entryRuleELong"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4453:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4454:2: (iv_ruleELong= ruleELong EOF )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4455:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong9851);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong9862); 

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4462:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4465:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4466:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4466:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4466:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4466:2: (kw= '-' )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==17) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4467:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleELong9901); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong9918); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "rulePosition"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4487:1: rulePosition returns [Enumerator current=null] : ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) ) ;
    public final Enumerator rulePosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4489:28: ( ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4490:1: ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4490:1: ( (enumLiteral_0= 'mobile' ) | (enumLiteral_1= 'static' ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==80) ) {
                alt122=1;
            }
            else if ( (LA122_0==81) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4490:2: (enumLiteral_0= 'mobile' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4490:2: (enumLiteral_0= 'mobile' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4490:4: enumLiteral_0= 'mobile'
                    {
                    enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulePosition9977); 

                            current = grammarAccess.getPositionAccess().getMobileEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPositionAccess().getMobileEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4496:6: (enumLiteral_1= 'static' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4496:6: (enumLiteral_1= 'static' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4496:8: enumLiteral_1= 'static'
                    {
                    enumLiteral_1=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulePosition9994); 

                            current = grammarAccess.getPositionAccess().getStaticEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPositionAccess().getStaticEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleInterNodeComm"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4506:1: ruleInterNodeComm returns [Enumerator current=null] : ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) ) ;
    public final Enumerator ruleInterNodeComm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4508:28: ( ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4509:1: ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4509:1: ( (enumLiteral_0= 'BT' ) | (enumLiteral_1= 'Zigbee' ) | (enumLiteral_2= 'WLan' ) | (enumLiteral_3= 'RF' ) )
            int alt123=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt123=1;
                }
                break;
            case 83:
                {
                alt123=2;
                }
                break;
            case 84:
                {
                alt123=3;
                }
                break;
            case 85:
                {
                alt123=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4509:2: (enumLiteral_0= 'BT' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4509:2: (enumLiteral_0= 'BT' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4509:4: enumLiteral_0= 'BT'
                    {
                    enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleInterNodeComm10039); 

                            current = grammarAccess.getInterNodeCommAccess().getBTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInterNodeCommAccess().getBTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4515:6: (enumLiteral_1= 'Zigbee' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4515:6: (enumLiteral_1= 'Zigbee' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4515:8: enumLiteral_1= 'Zigbee'
                    {
                    enumLiteral_1=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleInterNodeComm10056); 

                            current = grammarAccess.getInterNodeCommAccess().getZigbeeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInterNodeCommAccess().getZigbeeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4521:6: (enumLiteral_2= 'WLan' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4521:6: (enumLiteral_2= 'WLan' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4521:8: enumLiteral_2= 'WLan'
                    {
                    enumLiteral_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleInterNodeComm10073); 

                            current = grammarAccess.getInterNodeCommAccess().getWLanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInterNodeCommAccess().getWLanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4527:6: (enumLiteral_3= 'RF' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4527:6: (enumLiteral_3= 'RF' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4527:8: enumLiteral_3= 'RF'
                    {
                    enumLiteral_3=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleInterNodeComm10090); 

                            current = grammarAccess.getInterNodeCommAccess().getRFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getInterNodeCommAccess().getRFEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleInterNodeComm"


    // $ANTLR start "ruleRoutingProtocol"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4537:1: ruleRoutingProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) ) ;
    public final Enumerator ruleRoutingProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4539:28: ( ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4540:1: ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4540:1: ( (enumLiteral_0= 'leach' ) | (enumLiteral_1= 'lqrp' ) | (enumLiteral_2= 'spin' ) | (enumLiteral_3= 'aodv' ) | (enumLiteral_4= 'dodv' ) | (enumLiteral_5= 'dsr' ) | (enumLiteral_6= 'dsdv' ) | (enumLiteral_7= 'gsr' ) | (enumLiteral_8= 'heed' ) | (enumLiteral_9= 'gaf' ) | (enumLiteral_10= 'gear' ) | (enumLiteral_11= 'tbf' ) | (enumLiteral_12= 'ead' ) | (enumLiteral_13= 'pegasis' ) | (enumLiteral_14= 'teen' ) | (enumLiteral_15= 'speed' ) | (enumLiteral_16= 'ctp' ) | (enumLiteral_17= 'dismentation' ) | (enumLiteral_18= 'activeMessage' ) )
            int alt124=19;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt124=1;
                }
                break;
            case 87:
                {
                alt124=2;
                }
                break;
            case 88:
                {
                alt124=3;
                }
                break;
            case 89:
                {
                alt124=4;
                }
                break;
            case 90:
                {
                alt124=5;
                }
                break;
            case 91:
                {
                alt124=6;
                }
                break;
            case 92:
                {
                alt124=7;
                }
                break;
            case 93:
                {
                alt124=8;
                }
                break;
            case 94:
                {
                alt124=9;
                }
                break;
            case 95:
                {
                alt124=10;
                }
                break;
            case 96:
                {
                alt124=11;
                }
                break;
            case 97:
                {
                alt124=12;
                }
                break;
            case 98:
                {
                alt124=13;
                }
                break;
            case 99:
                {
                alt124=14;
                }
                break;
            case 100:
                {
                alt124=15;
                }
                break;
            case 101:
                {
                alt124=16;
                }
                break;
            case 102:
                {
                alt124=17;
                }
                break;
            case 103:
                {
                alt124=18;
                }
                break;
            case 104:
                {
                alt124=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4540:2: (enumLiteral_0= 'leach' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4540:2: (enumLiteral_0= 'leach' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4540:4: enumLiteral_0= 'leach'
                    {
                    enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleRoutingProtocol10135); 

                            current = grammarAccess.getRoutingProtocolAccess().getLeachEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingProtocolAccess().getLeachEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4546:6: (enumLiteral_1= 'lqrp' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4546:6: (enumLiteral_1= 'lqrp' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4546:8: enumLiteral_1= 'lqrp'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleRoutingProtocol10152); 

                            current = grammarAccess.getRoutingProtocolAccess().getLqrpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingProtocolAccess().getLqrpEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4552:6: (enumLiteral_2= 'spin' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4552:6: (enumLiteral_2= 'spin' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4552:8: enumLiteral_2= 'spin'
                    {
                    enumLiteral_2=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleRoutingProtocol10169); 

                            current = grammarAccess.getRoutingProtocolAccess().getSpinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoutingProtocolAccess().getSpinEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4558:6: (enumLiteral_3= 'aodv' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4558:6: (enumLiteral_3= 'aodv' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4558:8: enumLiteral_3= 'aodv'
                    {
                    enumLiteral_3=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleRoutingProtocol10186); 

                            current = grammarAccess.getRoutingProtocolAccess().getAodvEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRoutingProtocolAccess().getAodvEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4564:6: (enumLiteral_4= 'dodv' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4564:6: (enumLiteral_4= 'dodv' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4564:8: enumLiteral_4= 'dodv'
                    {
                    enumLiteral_4=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleRoutingProtocol10203); 

                            current = grammarAccess.getRoutingProtocolAccess().getDodvEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRoutingProtocolAccess().getDodvEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4570:6: (enumLiteral_5= 'dsr' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4570:6: (enumLiteral_5= 'dsr' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4570:8: enumLiteral_5= 'dsr'
                    {
                    enumLiteral_5=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleRoutingProtocol10220); 

                            current = grammarAccess.getRoutingProtocolAccess().getDsrEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRoutingProtocolAccess().getDsrEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4576:6: (enumLiteral_6= 'dsdv' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4576:6: (enumLiteral_6= 'dsdv' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4576:8: enumLiteral_6= 'dsdv'
                    {
                    enumLiteral_6=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleRoutingProtocol10237); 

                            current = grammarAccess.getRoutingProtocolAccess().getDsdvEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getRoutingProtocolAccess().getDsdvEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4582:6: (enumLiteral_7= 'gsr' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4582:6: (enumLiteral_7= 'gsr' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4582:8: enumLiteral_7= 'gsr'
                    {
                    enumLiteral_7=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleRoutingProtocol10254); 

                            current = grammarAccess.getRoutingProtocolAccess().getGsrEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getRoutingProtocolAccess().getGsrEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4588:6: (enumLiteral_8= 'heed' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4588:6: (enumLiteral_8= 'heed' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4588:8: enumLiteral_8= 'heed'
                    {
                    enumLiteral_8=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleRoutingProtocol10271); 

                            current = grammarAccess.getRoutingProtocolAccess().getHeedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getRoutingProtocolAccess().getHeedEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4594:6: (enumLiteral_9= 'gaf' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4594:6: (enumLiteral_9= 'gaf' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4594:8: enumLiteral_9= 'gaf'
                    {
                    enumLiteral_9=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleRoutingProtocol10288); 

                            current = grammarAccess.getRoutingProtocolAccess().getGafEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getRoutingProtocolAccess().getGafEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4600:6: (enumLiteral_10= 'gear' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4600:6: (enumLiteral_10= 'gear' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4600:8: enumLiteral_10= 'gear'
                    {
                    enumLiteral_10=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleRoutingProtocol10305); 

                            current = grammarAccess.getRoutingProtocolAccess().getGearEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getRoutingProtocolAccess().getGearEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4606:6: (enumLiteral_11= 'tbf' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4606:6: (enumLiteral_11= 'tbf' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4606:8: enumLiteral_11= 'tbf'
                    {
                    enumLiteral_11=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleRoutingProtocol10322); 

                            current = grammarAccess.getRoutingProtocolAccess().getTbfEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getRoutingProtocolAccess().getTbfEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4612:6: (enumLiteral_12= 'ead' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4612:6: (enumLiteral_12= 'ead' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4612:8: enumLiteral_12= 'ead'
                    {
                    enumLiteral_12=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleRoutingProtocol10339); 

                            current = grammarAccess.getRoutingProtocolAccess().getEadEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getRoutingProtocolAccess().getEadEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4618:6: (enumLiteral_13= 'pegasis' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4618:6: (enumLiteral_13= 'pegasis' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4618:8: enumLiteral_13= 'pegasis'
                    {
                    enumLiteral_13=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleRoutingProtocol10356); 

                            current = grammarAccess.getRoutingProtocolAccess().getPegasisEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getRoutingProtocolAccess().getPegasisEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4624:6: (enumLiteral_14= 'teen' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4624:6: (enumLiteral_14= 'teen' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4624:8: enumLiteral_14= 'teen'
                    {
                    enumLiteral_14=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleRoutingProtocol10373); 

                            current = grammarAccess.getRoutingProtocolAccess().getTeenEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getRoutingProtocolAccess().getTeenEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4630:6: (enumLiteral_15= 'speed' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4630:6: (enumLiteral_15= 'speed' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4630:8: enumLiteral_15= 'speed'
                    {
                    enumLiteral_15=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleRoutingProtocol10390); 

                            current = grammarAccess.getRoutingProtocolAccess().getSpeedEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getRoutingProtocolAccess().getSpeedEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4636:6: (enumLiteral_16= 'ctp' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4636:6: (enumLiteral_16= 'ctp' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4636:8: enumLiteral_16= 'ctp'
                    {
                    enumLiteral_16=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleRoutingProtocol10407); 

                            current = grammarAccess.getRoutingProtocolAccess().getCtpEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getRoutingProtocolAccess().getCtpEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4642:6: (enumLiteral_17= 'dismentation' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4642:6: (enumLiteral_17= 'dismentation' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4642:8: enumLiteral_17= 'dismentation'
                    {
                    enumLiteral_17=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleRoutingProtocol10424); 

                            current = grammarAccess.getRoutingProtocolAccess().getDismentationEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getRoutingProtocolAccess().getDismentationEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4648:6: (enumLiteral_18= 'activeMessage' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4648:6: (enumLiteral_18= 'activeMessage' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4648:8: enumLiteral_18= 'activeMessage'
                    {
                    enumLiteral_18=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleRoutingProtocol10441); 

                            current = grammarAccess.getRoutingProtocolAccess().getActiveMessageEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getRoutingProtocolAccess().getActiveMessageEnumLiteralDeclaration_18()); 
                        

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
    // $ANTLR end "ruleRoutingProtocol"


    // $ANTLR start "ruleLogicalSymbol"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4658:1: ruleLogicalSymbol returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) ) ;
    public final Enumerator ruleLogicalSymbol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4660:28: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4661:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4661:1: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'greaterThan' ) | (enumLiteral_2= 'greaterOrEqualThan' ) | (enumLiteral_3= 'lessThan' ) | (enumLiteral_4= 'lessOrEqualThan' ) | (enumLiteral_5= 'notEqual' ) )
            int alt125=6;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt125=1;
                }
                break;
            case 106:
                {
                alt125=2;
                }
                break;
            case 107:
                {
                alt125=3;
                }
                break;
            case 108:
                {
                alt125=4;
                }
                break;
            case 109:
                {
                alt125=5;
                }
                break;
            case 110:
                {
                alt125=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4661:2: (enumLiteral_0= 'equal' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4661:2: (enumLiteral_0= 'equal' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4661:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleLogicalSymbol10486); 

                            current = grammarAccess.getLogicalSymbolAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalSymbolAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4667:6: (enumLiteral_1= 'greaterThan' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4667:6: (enumLiteral_1= 'greaterThan' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4667:8: enumLiteral_1= 'greaterThan'
                    {
                    enumLiteral_1=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleLogicalSymbol10503); 

                            current = grammarAccess.getLogicalSymbolAccess().getGreaterThanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalSymbolAccess().getGreaterThanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4673:6: (enumLiteral_2= 'greaterOrEqualThan' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4673:6: (enumLiteral_2= 'greaterOrEqualThan' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4673:8: enumLiteral_2= 'greaterOrEqualThan'
                    {
                    enumLiteral_2=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleLogicalSymbol10520); 

                            current = grammarAccess.getLogicalSymbolAccess().getGreaterOrEqualThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLogicalSymbolAccess().getGreaterOrEqualThanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4679:6: (enumLiteral_3= 'lessThan' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4679:6: (enumLiteral_3= 'lessThan' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4679:8: enumLiteral_3= 'lessThan'
                    {
                    enumLiteral_3=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleLogicalSymbol10537); 

                            current = grammarAccess.getLogicalSymbolAccess().getLessThanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLogicalSymbolAccess().getLessThanEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4685:6: (enumLiteral_4= 'lessOrEqualThan' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4685:6: (enumLiteral_4= 'lessOrEqualThan' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4685:8: enumLiteral_4= 'lessOrEqualThan'
                    {
                    enumLiteral_4=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleLogicalSymbol10554); 

                            current = grammarAccess.getLogicalSymbolAccess().getLessOrEqualThanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLogicalSymbolAccess().getLessOrEqualThanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4691:6: (enumLiteral_5= 'notEqual' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4691:6: (enumLiteral_5= 'notEqual' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4691:8: enumLiteral_5= 'notEqual'
                    {
                    enumLiteral_5=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleLogicalSymbol10571); 

                            current = grammarAccess.getLogicalSymbolAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getLogicalSymbolAccess().getNotEqualEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleLogicalSymbol"


    // $ANTLR start "ruleLeds"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4701:1: ruleLeds returns [Enumerator current=null] : ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) ) ;
    public final Enumerator ruleLeds() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4703:28: ( ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4704:1: ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4704:1: ( (enumLiteral_0= 'led0' ) | (enumLiteral_1= 'led1' ) | (enumLiteral_2= 'led2' ) )
            int alt126=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt126=1;
                }
                break;
            case 112:
                {
                alt126=2;
                }
                break;
            case 113:
                {
                alt126=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4704:2: (enumLiteral_0= 'led0' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4704:2: (enumLiteral_0= 'led0' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4704:4: enumLiteral_0= 'led0'
                    {
                    enumLiteral_0=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleLeds10616); 

                            current = grammarAccess.getLedsAccess().getLed0EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLedsAccess().getLed0EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4710:6: (enumLiteral_1= 'led1' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4710:6: (enumLiteral_1= 'led1' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4710:8: enumLiteral_1= 'led1'
                    {
                    enumLiteral_1=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleLeds10633); 

                            current = grammarAccess.getLedsAccess().getLed1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLedsAccess().getLed1EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4716:6: (enumLiteral_2= 'led2' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4716:6: (enumLiteral_2= 'led2' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4716:8: enumLiteral_2= 'led2'
                    {
                    enumLiteral_2=(Token)match(input,113,FollowSets000.FOLLOW_113_in_ruleLeds10650); 

                            current = grammarAccess.getLedsAccess().getLed2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLedsAccess().getLed2EnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleLeds"


    // $ANTLR start "ruleLedStatus"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4726:1: ruleLedStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) ) ;
    public final Enumerator ruleLedStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4728:28: ( ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4729:1: ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4729:1: ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) | (enumLiteral_2= 'toggle' ) )
            int alt127=3;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt127=1;
                }
                break;
            case 115:
                {
                alt127=2;
                }
                break;
            case 116:
                {
                alt127=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4729:2: (enumLiteral_0= 'on' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4729:2: (enumLiteral_0= 'on' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4729:4: enumLiteral_0= 'on'
                    {
                    enumLiteral_0=(Token)match(input,114,FollowSets000.FOLLOW_114_in_ruleLedStatus10695); 

                            current = grammarAccess.getLedStatusAccess().getOnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLedStatusAccess().getOnEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4735:6: (enumLiteral_1= 'off' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4735:6: (enumLiteral_1= 'off' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4735:8: enumLiteral_1= 'off'
                    {
                    enumLiteral_1=(Token)match(input,115,FollowSets000.FOLLOW_115_in_ruleLedStatus10712); 

                            current = grammarAccess.getLedStatusAccess().getOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLedStatusAccess().getOffEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4741:6: (enumLiteral_2= 'toggle' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4741:6: (enumLiteral_2= 'toggle' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4741:8: enumLiteral_2= 'toggle'
                    {
                    enumLiteral_2=(Token)match(input,116,FollowSets000.FOLLOW_116_in_ruleLedStatus10729); 

                            current = grammarAccess.getLedStatusAccess().getToggleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLedStatusAccess().getToggleEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleLedStatus"


    // $ANTLR start "ruleAggregation"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4751:1: ruleAggregation returns [Enumerator current=null] : ( (enumLiteral_0= 'compression' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'count' ) ) ;
    public final Enumerator ruleAggregation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4753:28: ( ( (enumLiteral_0= 'compression' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'count' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4754:1: ( (enumLiteral_0= 'compression' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'count' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4754:1: ( (enumLiteral_0= 'compression' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'avg' ) | (enumLiteral_4= 'count' ) )
            int alt128=5;
            switch ( input.LA(1) ) {
            case 117:
                {
                alt128=1;
                }
                break;
            case 118:
                {
                alt128=2;
                }
                break;
            case 119:
                {
                alt128=3;
                }
                break;
            case 120:
                {
                alt128=4;
                }
                break;
            case 121:
                {
                alt128=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4754:2: (enumLiteral_0= 'compression' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4754:2: (enumLiteral_0= 'compression' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4754:4: enumLiteral_0= 'compression'
                    {
                    enumLiteral_0=(Token)match(input,117,FollowSets000.FOLLOW_117_in_ruleAggregation10774); 

                            current = grammarAccess.getAggregationAccess().getCompressionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAggregationAccess().getCompressionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4760:6: (enumLiteral_1= 'max' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4760:6: (enumLiteral_1= 'max' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4760:8: enumLiteral_1= 'max'
                    {
                    enumLiteral_1=(Token)match(input,118,FollowSets000.FOLLOW_118_in_ruleAggregation10791); 

                            current = grammarAccess.getAggregationAccess().getMaxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAggregationAccess().getMaxEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4766:6: (enumLiteral_2= 'min' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4766:6: (enumLiteral_2= 'min' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4766:8: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleAggregation10808); 

                            current = grammarAccess.getAggregationAccess().getMinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAggregationAccess().getMinEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4772:6: (enumLiteral_3= 'avg' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4772:6: (enumLiteral_3= 'avg' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4772:8: enumLiteral_3= 'avg'
                    {
                    enumLiteral_3=(Token)match(input,120,FollowSets000.FOLLOW_120_in_ruleAggregation10825); 

                            current = grammarAccess.getAggregationAccess().getAvgEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAggregationAccess().getAvgEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4778:6: (enumLiteral_4= 'count' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4778:6: (enumLiteral_4= 'count' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4778:8: enumLiteral_4= 'count'
                    {
                    enumLiteral_4=(Token)match(input,121,FollowSets000.FOLLOW_121_in_ruleAggregation10842); 

                            current = grammarAccess.getAggregationAccess().getCountEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAggregationAccess().getCountEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "ruleFusion"
    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4788:1: ruleFusion returns [Enumerator current=null] : ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) ) ;
    public final Enumerator ruleFusion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4790:28: ( ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) ) )
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4791:1: ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) )
            {
            // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4791:1: ( (enumLiteral_0= 'classification' ) | (enumLiteral_1= 'event_detection' ) | (enumLiteral_2= 'tracking' ) | (enumLiteral_3= 'decision_making' ) )
            int alt129=4;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt129=1;
                }
                break;
            case 123:
                {
                alt129=2;
                }
                break;
            case 124:
                {
                alt129=3;
                }
                break;
            case 125:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4791:2: (enumLiteral_0= 'classification' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4791:2: (enumLiteral_0= 'classification' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4791:4: enumLiteral_0= 'classification'
                    {
                    enumLiteral_0=(Token)match(input,122,FollowSets000.FOLLOW_122_in_ruleFusion10887); 

                            current = grammarAccess.getFusionAccess().getClassificationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFusionAccess().getClassificationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4797:6: (enumLiteral_1= 'event_detection' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4797:6: (enumLiteral_1= 'event_detection' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4797:8: enumLiteral_1= 'event_detection'
                    {
                    enumLiteral_1=(Token)match(input,123,FollowSets000.FOLLOW_123_in_ruleFusion10904); 

                            current = grammarAccess.getFusionAccess().getEvent_detectionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFusionAccess().getEvent_detectionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4803:6: (enumLiteral_2= 'tracking' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4803:6: (enumLiteral_2= 'tracking' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4803:8: enumLiteral_2= 'tracking'
                    {
                    enumLiteral_2=(Token)match(input,124,FollowSets000.FOLLOW_124_in_ruleFusion10921); 

                            current = grammarAccess.getFusionAccess().getTrackingEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFusionAccess().getTrackingEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4809:6: (enumLiteral_3= 'decision_making' )
                    {
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4809:6: (enumLiteral_3= 'decision_making' )
                    // ../org.wsn.sennet.xtext/src-gen/org/wsn/sennet/xtext/parser/antlr/internal/InternalDSL.g:4809:8: enumLiteral_3= 'decision_making'
                    {
                    enumLiteral_3=(Token)match(input,125,FollowSets000.FOLLOW_125_in_ruleFusion10938); 

                            current = grammarAccess.getFusionAccess().getDecision_makingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFusionAccess().getDecision_makingEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleFusion"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSeNetApp_in_entryRuleSeNetApp75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSeNetApp85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSeNetApp131 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSeNetApp152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSeNetApp164 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_13_in_ruleSeNetApp177 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSeNetApp198 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleSeNetApp213 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSeNetApp225 = new BitSet(new long[]{0x000000023C040000L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_ruleSeNetApp246 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSeNetApp259 = new BitSet(new long[]{0x000000023C040000L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_ruleSeNetApp280 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSeNetApp294 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSeNetApp308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractJob_in_entryRuleAbstractJob344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractJob354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNodeLevelJob_in_ruleAbstractJob401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseNowJob_in_ruleAbstractJob428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkJob_in_ruleAbstractJob455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseJob_in_ruleAbstractJob482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNetworkLevelSpecialAlgorithm_in_ruleAbstractJob509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNetworkDataProcessing_in_ruleAbstractJob536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_entryRuleAbstractNode571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNode581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractNode628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_ruleAbstractNode655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkNode_in_ruleAbstractNode682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_ruleAbstractNode709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_entryRuleAbstractNetwork744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractNetwork754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlatNetwork_in_ruleAbstractNetwork801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusteredNetwork_in_ruleAbstractNetwork828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_entryRuleAbstractStartEndingJobTrigger863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractStartEndingJobTrigger873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReceiveMessageTrigger_in_ruleAbstractStartEndingJobTrigger920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecieveSerialMsgTrigger_in_ruleAbstractStartEndingJobTrigger947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStartJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopJobTrigger_Impl_in_ruleAbstractStartEndingJobTrigger1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePushButtomTrigger_in_ruleAbstractStartEndingJobTrigger1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_entryRuleAbstratAction1063 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstratAction1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadNodeMemoryAction_in_ruleAbstratAction1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWriteNodeMemoryAction_in_ruleAbstratAction1147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendMessageAction_in_ruleAbstratAction1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlinkAction_in_ruleAbstratAction1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendSerialPortMsgAction_in_ruleAbstratAction1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_entryRuleAbstractSensor1263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSensor1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccelerometerSensor_in_ruleAbstractSensor1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_ruleAbstractSensor1347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationSensor_in_ruleAbstractSensor1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMicrophoneSensor_in_ruleAbstractSensor1401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_ruleAbstractSensor1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_ruleAbstractSensor1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_ruleAbstractSensor1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVoltageSensor_in_ruleAbstractSensor1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_entryRuleAbstractFlatNode1544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFlatNode1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractFlatNode1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_ruleAbstractFlatNode1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_entryRuleAbstractClusterNode1663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractClusterNode1673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_ruleAbstractClusterNode1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_ruleAbstractClusterNode1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEInt1833 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNodeLevelJob_in_entryRuleNodeLevelJob2018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNodeLevelJob2028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleNodeLevelJob2074 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNodeLevelJob2086 = new BitSet(new long[]{0x0000000003F92000L});
        public static final BitSet FOLLOW_13_in_ruleNodeLevelJob2099 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNodeLevelJob2120 = new BitSet(new long[]{0x0000000003F90000L});
        public static final BitSet FOLLOW_19_in_ruleNodeLevelJob2135 = new BitSet(new long[]{0x0000000000000000L,0x03E0000000000000L});
        public static final BitSet FOLLOW_ruleAggregation_in_ruleNodeLevelJob2156 = new BitSet(new long[]{0x0000000003F10000L});
        public static final BitSet FOLLOW_20_in_ruleNodeLevelJob2171 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleNodeLevelJob2192 = new BitSet(new long[]{0x0000000003E10000L});
        public static final BitSet FOLLOW_21_in_ruleNodeLevelJob2207 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleNodeLevelJob2228 = new BitSet(new long[]{0x0000000003C10000L});
        public static final BitSet FOLLOW_22_in_ruleNodeLevelJob2243 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleNodeLevelJob2264 = new BitSet(new long[]{0x0000000003810000L});
        public static final BitSet FOLLOW_23_in_ruleNodeLevelJob2279 = new BitSet(new long[]{0x0102000000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleNodeLevelJob2300 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleNodeLevelJob2315 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNodeLevelJob2327 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNodeLevelJob2348 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNodeLevelJob2361 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNodeLevelJob2382 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNodeLevelJob2396 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleNodeLevelJob2411 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNodeLevelJob2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleNodeLevelJob2444 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNodeLevelJob2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleNodeLevelJob2478 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNodeLevelJob2492 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleNodeLevelJob2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseNowJob_in_entryRuleSenseNowJob2542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSenseNowJob2552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSenseNowJob2598 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseNowJob2610 = new BitSet(new long[]{0x0000000003C12000L});
        public static final BitSet FOLLOW_13_in_ruleSenseNowJob2623 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSenseNowJob2644 = new BitSet(new long[]{0x0000000003C10000L});
        public static final BitSet FOLLOW_22_in_ruleSenseNowJob2659 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleSenseNowJob2680 = new BitSet(new long[]{0x0000000003810000L});
        public static final BitSet FOLLOW_23_in_ruleSenseNowJob2695 = new BitSet(new long[]{0x0102000000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleSenseNowJob2716 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleSenseNowJob2731 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseNowJob2743 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob2764 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseNowJob2777 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseNowJob2798 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseNowJob2812 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleSenseNowJob2827 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseNowJob2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseNowJob2860 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseNowJob2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseNowJob2894 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseNowJob2908 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSenseNowJob2922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkJob_in_entryRuleSinkJob2958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSinkJob2968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSinkJob3014 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkJob3026 = new BitSet(new long[]{0x0000000003C12000L});
        public static final BitSet FOLLOW_13_in_ruleSinkJob3039 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSinkJob3060 = new BitSet(new long[]{0x0000000003C10000L});
        public static final BitSet FOLLOW_22_in_ruleSinkJob3075 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleSinkJob3096 = new BitSet(new long[]{0x0000000003810000L});
        public static final BitSet FOLLOW_23_in_ruleSinkJob3111 = new BitSet(new long[]{0x0102000000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleSinkJob3132 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleSinkJob3147 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkJob3159 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob3180 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSinkJob3193 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSinkJob3214 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSinkJob3228 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleSinkJob3243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkJob3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSinkJob3276 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSinkJob3289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSinkJob3310 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSinkJob3324 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSinkJob3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSenseJob_in_entryRuleSenseJob3374 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSenseJob3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleSenseJob3430 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseJob3442 = new BitSet(new long[]{0x0000000003D12000L});
        public static final BitSet FOLLOW_13_in_ruleSenseJob3455 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSenseJob3476 = new BitSet(new long[]{0x0000000003D10000L});
        public static final BitSet FOLLOW_20_in_ruleSenseJob3491 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleSenseJob3512 = new BitSet(new long[]{0x0000000003C10000L});
        public static final BitSet FOLLOW_22_in_ruleSenseJob3527 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleSenseJob3548 = new BitSet(new long[]{0x0000000003810000L});
        public static final BitSet FOLLOW_23_in_ruleSenseJob3563 = new BitSet(new long[]{0x0102000000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleSenseJob3584 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleSenseJob3599 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseJob3611 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseJob3632 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseJob3645 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleSenseJob3666 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseJob3680 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleSenseJob3695 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSenseJob3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseJob3728 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSenseJob3741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleSenseJob3762 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSenseJob3776 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSenseJob3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNetworkLevelSpecialAlgorithm_in_entryRuleNetworkLevelSpecialAlgorithm3826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNetworkLevelSpecialAlgorithm3836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleNetworkLevelSpecialAlgorithm3882 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm3894 = new BitSet(new long[]{0x00000001C3D12000L});
        public static final BitSet FOLLOW_13_in_ruleNetworkLevelSpecialAlgorithm3907 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNetworkLevelSpecialAlgorithm3928 = new BitSet(new long[]{0x00000001C3D10000L});
        public static final BitSet FOLLOW_30_in_ruleNetworkLevelSpecialAlgorithm3943 = new BitSet(new long[]{0x0000000000000000L,0x3C00000000000000L});
        public static final BitSet FOLLOW_ruleFusion_in_ruleNetworkLevelSpecialAlgorithm3964 = new BitSet(new long[]{0x0000000183D10000L});
        public static final BitSet FOLLOW_20_in_ruleNetworkLevelSpecialAlgorithm3979 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleNetworkLevelSpecialAlgorithm4000 = new BitSet(new long[]{0x0000000183C10000L});
        public static final BitSet FOLLOW_31_in_ruleNetworkLevelSpecialAlgorithm4015 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleNetworkLevelSpecialAlgorithm4036 = new BitSet(new long[]{0x0000000103C10000L});
        public static final BitSet FOLLOW_32_in_ruleNetworkLevelSpecialAlgorithm4051 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm4063 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNetworkLevelSpecialAlgorithm4084 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNetworkLevelSpecialAlgorithm4097 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNetworkLevelSpecialAlgorithm4118 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4132 = new BitSet(new long[]{0x0000000003C10000L});
        public static final BitSet FOLLOW_22_in_ruleNetworkLevelSpecialAlgorithm4147 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleNetworkLevelSpecialAlgorithm4168 = new BitSet(new long[]{0x0000000003810000L});
        public static final BitSet FOLLOW_23_in_ruleNetworkLevelSpecialAlgorithm4183 = new BitSet(new long[]{0x0102000000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleNetworkLevelSpecialAlgorithm4204 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleNetworkLevelSpecialAlgorithm4219 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm4231 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkLevelSpecialAlgorithm4252 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNetworkLevelSpecialAlgorithm4265 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkLevelSpecialAlgorithm4286 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4300 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleNetworkLevelSpecialAlgorithm4315 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkLevelSpecialAlgorithm4327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleNetworkLevelSpecialAlgorithm4348 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNetworkLevelSpecialAlgorithm4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleNetworkLevelSpecialAlgorithm4382 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4396 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkLevelSpecialAlgorithm4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNetworkDataProcessing_in_entryRuleNetworkDataProcessing4446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNetworkDataProcessing4456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleNetworkDataProcessing4502 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkDataProcessing4514 = new BitSet(new long[]{0x0000000503F12000L});
        public static final BitSet FOLLOW_13_in_ruleNetworkDataProcessing4527 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNetworkDataProcessing4548 = new BitSet(new long[]{0x0000000503F10000L});
        public static final BitSet FOLLOW_34_in_ruleNetworkDataProcessing4563 = new BitSet(new long[]{0x0000000000000000L,0x03E0000000000000L});
        public static final BitSet FOLLOW_ruleAggregation_in_ruleNetworkDataProcessing4584 = new BitSet(new long[]{0x0000000103F10000L});
        public static final BitSet FOLLOW_20_in_ruleNetworkDataProcessing4599 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleNetworkDataProcessing4620 = new BitSet(new long[]{0x0000000103E10000L});
        public static final BitSet FOLLOW_21_in_ruleNetworkDataProcessing4635 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleNetworkDataProcessing4656 = new BitSet(new long[]{0x0000000103C10000L});
        public static final BitSet FOLLOW_32_in_ruleNetworkDataProcessing4671 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkDataProcessing4683 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNetworkDataProcessing4704 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNetworkDataProcessing4717 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNetworkDataProcessing4738 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkDataProcessing4752 = new BitSet(new long[]{0x0000000003C10000L});
        public static final BitSet FOLLOW_22_in_ruleNetworkDataProcessing4767 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractNode_in_ruleNetworkDataProcessing4788 = new BitSet(new long[]{0x0000000003810000L});
        public static final BitSet FOLLOW_23_in_ruleNetworkDataProcessing4803 = new BitSet(new long[]{0x0102000000000000L});
        public static final BitSet FOLLOW_ruleAbstractNetwork_in_ruleNetworkDataProcessing4824 = new BitSet(new long[]{0x0000000003010000L});
        public static final BitSet FOLLOW_24_in_ruleNetworkDataProcessing4839 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkDataProcessing4851 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkDataProcessing4872 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNetworkDataProcessing4885 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleAbstractStartEndingJobTrigger_in_ruleNetworkDataProcessing4906 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkDataProcessing4920 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_25_in_ruleNetworkDataProcessing4935 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleNetworkDataProcessing4947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleNetworkDataProcessing4968 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleNetworkDataProcessing4981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000009680L});
        public static final BitSet FOLLOW_ruleAbstratAction_in_ruleNetworkDataProcessing5002 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkDataProcessing5016 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleNetworkDataProcessing5030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensorNode_in_entryRuleSensorNode5066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensorNode5076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSensorNode5122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSensorNode5134 = new BitSet(new long[]{0x0000003000012000L});
        public static final BitSet FOLLOW_13_in_ruleSensorNode5147 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSensorNode5168 = new BitSet(new long[]{0x0000003000010000L});
        public static final BitSet FOLLOW_36_in_ruleSensorNode5183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleSensorNode5204 = new BitSet(new long[]{0x0000002000010000L});
        public static final BitSet FOLLOW_37_in_ruleSensorNode5219 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSensorNode5231 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSensorNode5252 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSensorNode5265 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSensorNode5286 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSensorNode5300 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSensorNode5314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusterHeadNode_in_entryRuleClusterHeadNode5350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClusterHeadNode5360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleClusterHeadNode5406 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusterHeadNode5418 = new BitSet(new long[]{0x0000003000012000L});
        public static final BitSet FOLLOW_13_in_ruleClusterHeadNode5431 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusterHeadNode5452 = new BitSet(new long[]{0x0000003000010000L});
        public static final BitSet FOLLOW_36_in_ruleClusterHeadNode5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleClusterHeadNode5488 = new BitSet(new long[]{0x0000002000010000L});
        public static final BitSet FOLLOW_37_in_ruleClusterHeadNode5503 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusterHeadNode5515 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5536 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClusterHeadNode5549 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusterHeadNode5570 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClusterHeadNode5584 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleClusterHeadNode5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSinkNode_in_entryRuleSinkNode5634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSinkNode5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSinkNode5690 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkNode5702 = new BitSet(new long[]{0x0000003000012000L});
        public static final BitSet FOLLOW_13_in_ruleSinkNode5715 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSinkNode5736 = new BitSet(new long[]{0x0000003000010000L});
        public static final BitSet FOLLOW_36_in_ruleSinkNode5751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleSinkNode5772 = new BitSet(new long[]{0x0000002000010000L});
        public static final BitSet FOLLOW_37_in_ruleSinkNode5787 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSinkNode5799 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSinkNode5820 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSinkNode5833 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleSinkNode5854 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSinkNode5868 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSinkNode5882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputationNode_in_entryRuleComputationNode5918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComputationNode5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleComputationNode5974 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComputationNode5986 = new BitSet(new long[]{0x0000003000012000L});
        public static final BitSet FOLLOW_13_in_ruleComputationNode5999 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComputationNode6020 = new BitSet(new long[]{0x0000003000010000L});
        public static final BitSet FOLLOW_36_in_ruleComputationNode6035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_rulePosition_in_ruleComputationNode6056 = new BitSet(new long[]{0x0000002000010000L});
        public static final BitSet FOLLOW_37_in_ruleComputationNode6071 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComputationNode6083 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleComputationNode6104 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleComputationNode6117 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleComputationNode6138 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleComputationNode6152 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleComputationNode6166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccelerometerSensor_in_entryRuleAccelerometerSensor6202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccelerometerSensor6212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAccelerometerSensor6258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLightSensor_in_entryRuleLightSensor6294 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLightSensor6304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleLightSensor6350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocationSensor_in_entryRuleLocationSensor6386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocationSensor6396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleLocationSensor6442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMicrophoneSensor_in_entryRuleMicrophoneSensor6478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMicrophoneSensor6488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleMicrophoneSensor6534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemperatureSensor_in_entryRuleTemperatureSensor6570 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemperatureSensor6580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTemperatureSensor6626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePressureSensor_in_entryRulePressureSensor6662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePressureSensor6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rulePressureSensor6718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHumiditySensor_in_entryRuleHumiditySensor6754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHumiditySensor6764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleHumiditySensor6810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVoltageSensor_in_entryRuleVoltageSensor6846 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVoltageSensor6856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleVoltageSensor6902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlatNetwork_in_entryRuleFlatNetwork6938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlatNetwork6948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleFlatNetwork6994 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork7006 = new BitSet(new long[]{0x00FC000000012000L});
        public static final BitSet FOLLOW_13_in_ruleFlatNetwork7019 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFlatNetwork7040 = new BitSet(new long[]{0x00FC000000010000L});
        public static final BitSet FOLLOW_50_in_ruleFlatNetwork7055 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleFlatNetwork7076 = new BitSet(new long[]{0x00F8000000010000L});
        public static final BitSet FOLLOW_51_in_ruleFlatNetwork7091 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
        public static final BitSet FOLLOW_ruleInterNodeComm_in_ruleFlatNetwork7112 = new BitSet(new long[]{0x00F0000000010000L});
        public static final BitSet FOLLOW_52_in_ruleFlatNetwork7127 = new BitSet(new long[]{0x0000000000000000L,0x000001FFFFC00000L});
        public static final BitSet FOLLOW_ruleRoutingProtocol_in_ruleFlatNetwork7148 = new BitSet(new long[]{0x00E0000000010000L});
        public static final BitSet FOLLOW_53_in_ruleFlatNetwork7163 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork7175 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork7196 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFlatNetwork7209 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleFlatNetwork7230 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork7244 = new BitSet(new long[]{0x00C0000000010000L});
        public static final BitSet FOLLOW_54_in_ruleFlatNetwork7259 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleSinkNode_in_ruleFlatNetwork7280 = new BitSet(new long[]{0x0080000000010000L});
        public static final BitSet FOLLOW_55_in_ruleFlatNetwork7295 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlatNetwork7307 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork7328 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFlatNetwork7341 = new BitSet(new long[]{0x000001C800000000L});
        public static final BitSet FOLLOW_ruleAbstractFlatNode_in_ruleFlatNetwork7362 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork7376 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFlatNetwork7390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClusteredNetwork_in_entryRuleClusteredNetwork7426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClusteredNetwork7436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleClusteredNetwork7482 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork7494 = new BitSet(new long[]{0x027C000000012000L});
        public static final BitSet FOLLOW_13_in_ruleClusteredNetwork7507 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusteredNetwork7528 = new BitSet(new long[]{0x027C000000010000L});
        public static final BitSet FOLLOW_50_in_ruleClusteredNetwork7543 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleClusteredNetwork7564 = new BitSet(new long[]{0x0278000000010000L});
        public static final BitSet FOLLOW_51_in_ruleClusteredNetwork7579 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
        public static final BitSet FOLLOW_ruleInterNodeComm_in_ruleClusteredNetwork7600 = new BitSet(new long[]{0x0270000000010000L});
        public static final BitSet FOLLOW_52_in_ruleClusteredNetwork7615 = new BitSet(new long[]{0x0000000000000000L,0x000001FFFFC00000L});
        public static final BitSet FOLLOW_ruleRoutingProtocol_in_ruleClusteredNetwork7636 = new BitSet(new long[]{0x0260000000010000L});
        public static final BitSet FOLLOW_53_in_ruleClusteredNetwork7651 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork7663 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7684 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClusteredNetwork7697 = new BitSet(new long[]{0x0001FE0000000000L});
        public static final BitSet FOLLOW_ruleAbstractSensor_in_ruleClusteredNetwork7718 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork7732 = new BitSet(new long[]{0x0240000000010000L});
        public static final BitSet FOLLOW_54_in_ruleClusteredNetwork7747 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_ruleSinkNode_in_ruleClusteredNetwork7768 = new BitSet(new long[]{0x0200000000010000L});
        public static final BitSet FOLLOW_57_in_ruleClusteredNetwork7783 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClusteredNetwork7795 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleClusteredNetwork7816 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClusteredNetwork7829 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_ruleCluster_in_ruleClusteredNetwork7850 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork7864 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleClusteredNetwork7878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCluster_in_entryRuleCluster7914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCluster7924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleCluster7970 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster7982 = new BitSet(new long[]{0x00A0000000012000L});
        public static final BitSet FOLLOW_13_in_ruleCluster7995 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCluster8016 = new BitSet(new long[]{0x00A0000000010000L});
        public static final BitSet FOLLOW_53_in_ruleCluster8031 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleCluster8043 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster8066 = new BitSet(new long[]{0x1000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCluster8079 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCluster8102 = new BitSet(new long[]{0x1000000000008000L});
        public static final BitSet FOLLOW_60_in_ruleCluster8116 = new BitSet(new long[]{0x0080000000010000L});
        public static final BitSet FOLLOW_55_in_ruleCluster8131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCluster8143 = new BitSet(new long[]{0x0000004800000000L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_ruleCluster8164 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleCluster8177 = new BitSet(new long[]{0x0000004800000000L});
        public static final BitSet FOLLOW_ruleAbstractClusterNode_in_ruleCluster8198 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleCluster8212 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCluster8226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReceiveMessageTrigger_in_entryRuleReceiveMessageTrigger8262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReceiveMessageTrigger8272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleReceiveMessageTrigger8318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecieveSerialMsgTrigger_in_entryRuleRecieveSerialMsgTrigger8354 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecieveSerialMsgTrigger8364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleRecieveSerialMsgTrigger8410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStartJobTrigger_Impl_in_entryRuleStartJobTrigger_Impl8446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStartJobTrigger_Impl8456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleStartJobTrigger_Impl8502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStopJobTrigger_Impl_in_entryRuleStopJobTrigger_Impl8538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStopJobTrigger_Impl8548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleStopJobTrigger_Impl8594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePushButtomTrigger_in_entryRulePushButtomTrigger8630 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePushButtomTrigger8640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulePushButtomTrigger8686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_entryRuleConditionalAction8722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAction8732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleConditionalAction8778 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConditionalAction8790 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000078L});
        public static final BitSet FOLLOW_67_in_ruleConditionalAction8803 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConditionalAction8824 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000070L});
        public static final BitSet FOLLOW_68_in_ruleConditionalAction8839 = new BitSet(new long[]{0x0000000000000000L,0x00007E0000000000L});
        public static final BitSet FOLLOW_ruleLogicalSymbol_in_ruleConditionalAction8860 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000060L});
        public static final BitSet FOLLOW_69_in_ruleConditionalAction8875 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleELong_in_ruleConditionalAction8896 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleConditionalAction8911 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConditionalAction8932 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConditionalAction8946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadNodeMemoryAction_in_entryRuleReadNodeMemoryAction8982 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReadNodeMemoryAction8992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleReadNodeMemoryAction9038 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReadNodeMemoryAction9050 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleReadNodeMemoryAction9063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleReadNodeMemoryAction9084 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleReadNodeMemoryAction9098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWriteNodeMemoryAction_in_entryRuleWriteNodeMemoryAction9134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWriteNodeMemoryAction9144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleWriteNodeMemoryAction9190 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWriteNodeMemoryAction9202 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleWriteNodeMemoryAction9215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleWriteNodeMemoryAction9236 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWriteNodeMemoryAction9250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendMessageAction_in_entryRuleSendMessageAction9286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSendMessageAction9296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleSendMessageAction9342 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSendMessageAction9354 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000900L});
        public static final BitSet FOLLOW_75_in_ruleSendMessageAction9367 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSendMessageAction9388 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleSendMessageAction9403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleSendMessageAction9424 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSendMessageAction9438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBlinkAction_in_entryRuleBlinkAction9474 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBlinkAction9484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleBlinkAction9530 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBlinkAction9542 = new BitSet(new long[]{0x0000000000010000L,0x0000000000006100L});
        public static final BitSet FOLLOW_77_in_ruleBlinkAction9555 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleLeds_in_ruleBlinkAction9576 = new BitSet(new long[]{0x0000000000010000L,0x0000000000004100L});
        public static final BitSet FOLLOW_78_in_ruleBlinkAction9591 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L});
        public static final BitSet FOLLOW_ruleLedStatus_in_ruleBlinkAction9612 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleBlinkAction9627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleBlinkAction9648 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBlinkAction9662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSendSerialPortMsgAction_in_entryRuleSendSerialPortMsgAction9698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSendSerialPortMsgAction9708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleSendSerialPortMsgAction9754 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSendSerialPortMsgAction9766 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleSendSerialPortMsgAction9779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleConditionalAction_in_ruleSendSerialPortMsgAction9800 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSendSerialPortMsgAction9814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong9851 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong9862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleELong9901 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong9918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rulePosition9977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rulePosition9994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleInterNodeComm10039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleInterNodeComm10056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleInterNodeComm10073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleInterNodeComm10090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleRoutingProtocol10135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleRoutingProtocol10152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleRoutingProtocol10169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleRoutingProtocol10186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleRoutingProtocol10203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleRoutingProtocol10220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleRoutingProtocol10237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleRoutingProtocol10254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleRoutingProtocol10271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleRoutingProtocol10288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_ruleRoutingProtocol10305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_ruleRoutingProtocol10322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleRoutingProtocol10339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_ruleRoutingProtocol10356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleRoutingProtocol10373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleRoutingProtocol10390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_ruleRoutingProtocol10407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_ruleRoutingProtocol10424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleRoutingProtocol10441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleLogicalSymbol10486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_ruleLogicalSymbol10503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_107_in_ruleLogicalSymbol10520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleLogicalSymbol10537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleLogicalSymbol10554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleLogicalSymbol10571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleLeds10616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleLeds10633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_113_in_ruleLeds10650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_114_in_ruleLedStatus10695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_115_in_ruleLedStatus10712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_116_in_ruleLedStatus10729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_117_in_ruleAggregation10774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_118_in_ruleAggregation10791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_119_in_ruleAggregation10808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_120_in_ruleAggregation10825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_121_in_ruleAggregation10842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_122_in_ruleFusion10887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_123_in_ruleFusion10904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_124_in_ruleFusion10921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_125_in_ruleFusion10938 = new BitSet(new long[]{0x0000000000000002L});
    }


}