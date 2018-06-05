package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'authors'", "':'", "'recipes'", "'{'", "','", "'}'", "'email'", "'isOwner'", "'['", "']'", "'writes'", "'calls'", "'Stars'", "'Comment'", "'Recipe'", "'written'", "'by'", "'Author'", "'VeganismLevel'", "'Duration'", "'Difficulty'", "'KitchenUtensils'", "'foodCategory'", "'Ingredients'", "'furnace'", "'stovetop'", "'rolling pin'", "'Name'", "'Amount'", "'Unit'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RecipeManager";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRecipeManager"
    // InternalMyDsl.g:64:1: entryRuleRecipeManager returns [EObject current=null] : iv_ruleRecipeManager= ruleRecipeManager EOF ;
    public final EObject entryRuleRecipeManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipeManager = null;


        try {
            // InternalMyDsl.g:64:54: (iv_ruleRecipeManager= ruleRecipeManager EOF )
            // InternalMyDsl.g:65:2: iv_ruleRecipeManager= ruleRecipeManager EOF
            {
             newCompositeNode(grammarAccess.getRecipeManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipeManager=ruleRecipeManager();

            state._fsp--;

             current =iv_ruleRecipeManager; 
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
    // $ANTLR end "entryRuleRecipeManager"


    // $ANTLR start "ruleRecipeManager"
    // InternalMyDsl.g:71:1: ruleRecipeManager returns [EObject current=null] : (otherlv_0= 'authors' otherlv_1= ':' ( (lv_Authorblock_2_0= ruleAuthorblock ) ) otherlv_3= 'recipes' otherlv_4= ':' ( (lv_Recipeblock_5_0= ruleRecipeblock ) ) ) ;
    public final EObject ruleRecipeManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_Authorblock_2_0 = null;

        EObject lv_Recipeblock_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'authors' otherlv_1= ':' ( (lv_Authorblock_2_0= ruleAuthorblock ) ) otherlv_3= 'recipes' otherlv_4= ':' ( (lv_Recipeblock_5_0= ruleRecipeblock ) ) ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'authors' otherlv_1= ':' ( (lv_Authorblock_2_0= ruleAuthorblock ) ) otherlv_3= 'recipes' otherlv_4= ':' ( (lv_Recipeblock_5_0= ruleRecipeblock ) ) )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'authors' otherlv_1= ':' ( (lv_Authorblock_2_0= ruleAuthorblock ) ) otherlv_3= 'recipes' otherlv_4= ':' ( (lv_Recipeblock_5_0= ruleRecipeblock ) ) )
            // InternalMyDsl.g:79:3: otherlv_0= 'authors' otherlv_1= ':' ( (lv_Authorblock_2_0= ruleAuthorblock ) ) otherlv_3= 'recipes' otherlv_4= ':' ( (lv_Recipeblock_5_0= ruleRecipeblock ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecipeManagerAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:87:3: ( (lv_Authorblock_2_0= ruleAuthorblock ) )
            // InternalMyDsl.g:88:4: (lv_Authorblock_2_0= ruleAuthorblock )
            {
            // InternalMyDsl.g:88:4: (lv_Authorblock_2_0= ruleAuthorblock )
            // InternalMyDsl.g:89:5: lv_Authorblock_2_0= ruleAuthorblock
            {

            					newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorblockAuthorblockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_Authorblock_2_0=ruleAuthorblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            					}
            					set(
            						current,
            						"Authorblock",
            						lv_Authorblock_2_0,
            						"org.xtext.example.mydsl.MyDsl.Authorblock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeManagerAccess().getRecipesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRecipeManagerAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:114:3: ( (lv_Recipeblock_5_0= ruleRecipeblock ) )
            // InternalMyDsl.g:115:4: (lv_Recipeblock_5_0= ruleRecipeblock )
            {
            // InternalMyDsl.g:115:4: (lv_Recipeblock_5_0= ruleRecipeblock )
            // InternalMyDsl.g:116:5: lv_Recipeblock_5_0= ruleRecipeblock
            {

            					newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipeblockRecipeblockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_Recipeblock_5_0=ruleRecipeblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            					}
            					set(
            						current,
            						"Recipeblock",
            						lv_Recipeblock_5_0,
            						"org.xtext.example.mydsl.MyDsl.Recipeblock");
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
    // $ANTLR end "ruleRecipeManager"


    // $ANTLR start "entryRuleAuthorblock"
    // InternalMyDsl.g:137:1: entryRuleAuthorblock returns [EObject current=null] : iv_ruleAuthorblock= ruleAuthorblock EOF ;
    public final EObject entryRuleAuthorblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorblock = null;


        try {
            // InternalMyDsl.g:137:52: (iv_ruleAuthorblock= ruleAuthorblock EOF )
            // InternalMyDsl.g:138:2: iv_ruleAuthorblock= ruleAuthorblock EOF
            {
             newCompositeNode(grammarAccess.getAuthorblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthorblock=ruleAuthorblock();

            state._fsp--;

             current =iv_ruleAuthorblock; 
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
    // $ANTLR end "entryRuleAuthorblock"


    // $ANTLR start "ruleAuthorblock"
    // InternalMyDsl.g:144:1: ruleAuthorblock returns [EObject current=null] : (otherlv_0= '{' ( (lv_authors_1_0= ruleAuthor ) ) (otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleAuthorblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_authors_1_0 = null;

        EObject lv_authors_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:150:2: ( (otherlv_0= '{' ( (lv_authors_1_0= ruleAuthor ) ) (otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:151:2: (otherlv_0= '{' ( (lv_authors_1_0= ruleAuthor ) ) (otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:151:2: (otherlv_0= '{' ( (lv_authors_1_0= ruleAuthor ) ) (otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) ) )* otherlv_4= '}' )
            // InternalMyDsl.g:152:3: otherlv_0= '{' ( (lv_authors_1_0= ruleAuthor ) ) (otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorblockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:156:3: ( (lv_authors_1_0= ruleAuthor ) )
            // InternalMyDsl.g:157:4: (lv_authors_1_0= ruleAuthor )
            {
            // InternalMyDsl.g:157:4: (lv_authors_1_0= ruleAuthor )
            // InternalMyDsl.g:158:5: lv_authors_1_0= ruleAuthor
            {

            					newCompositeNode(grammarAccess.getAuthorblockAccess().getAuthorsAuthorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_authors_1_0=ruleAuthor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAuthorblockRule());
            					}
            					add(
            						current,
            						"authors",
            						lv_authors_1_0,
            						"org.xtext.example.mydsl.MyDsl.Author");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:175:3: (otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:176:4: otherlv_2= ',' ( (lv_authors_3_0= ruleAuthor ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAuthorblockAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:180:4: ( (lv_authors_3_0= ruleAuthor ) )
            	    // InternalMyDsl.g:181:5: (lv_authors_3_0= ruleAuthor )
            	    {
            	    // InternalMyDsl.g:181:5: (lv_authors_3_0= ruleAuthor )
            	    // InternalMyDsl.g:182:6: lv_authors_3_0= ruleAuthor
            	    {

            	    						newCompositeNode(grammarAccess.getAuthorblockAccess().getAuthorsAuthorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_authors_3_0=ruleAuthor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAuthorblockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"authors",
            	    							lv_authors_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Author");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAuthorblockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAuthorblock"


    // $ANTLR start "entryRuleAuthor"
    // InternalMyDsl.g:208:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // InternalMyDsl.g:208:47: (iv_ruleAuthor= ruleAuthor EOF )
            // InternalMyDsl.g:209:2: iv_ruleAuthor= ruleAuthor EOF
            {
             newCompositeNode(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;

             current =iv_ruleAuthor; 
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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // InternalMyDsl.g:215:1: ruleAuthor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'email' otherlv_4= ':' ( (lv_Email_5_0= RULE_STRING ) ) (otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']' )? (otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']' )? otherlv_30= '}' ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_Email_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_writes_18_0 = null;

        EObject lv_writes_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:221:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'email' otherlv_4= ':' ( (lv_Email_5_0= RULE_STRING ) ) (otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']' )? (otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']' )? otherlv_30= '}' ) )
            // InternalMyDsl.g:222:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'email' otherlv_4= ':' ( (lv_Email_5_0= RULE_STRING ) ) (otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']' )? (otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']' )? otherlv_30= '}' )
            {
            // InternalMyDsl.g:222:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'email' otherlv_4= ':' ( (lv_Email_5_0= RULE_STRING ) ) (otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']' )? (otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']' )? otherlv_30= '}' )
            // InternalMyDsl.g:223:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'email' otherlv_4= ':' ( (lv_Email_5_0= RULE_STRING ) ) (otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )? (otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']' )? (otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']' )? otherlv_30= '}'
            {
            // InternalMyDsl.g:223:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:224:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:224:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:225:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAuthorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthorAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAuthorAccess().getEmailKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAuthorAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:257:3: ( (lv_Email_5_0= RULE_STRING ) )
            // InternalMyDsl.g:258:4: (lv_Email_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:258:4: (lv_Email_5_0= RULE_STRING )
            // InternalMyDsl.g:259:5: lv_Email_5_0= RULE_STRING
            {
            lv_Email_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_Email_5_0, grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Email",
            						lv_Email_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:275:3: (otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:276:4: otherlv_6= ',' otherlv_7= 'isOwner' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getAuthorAccess().getCommaKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAuthorAccess().getIsOwnerKeyword_6_1());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getAuthorAccess().getColonKeyword_6_2());
                    			
                    otherlv_9=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getAuthorAccess().getLeftSquareBracketKeyword_6_3());
                    			
                    // InternalMyDsl.g:292:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMyDsl.g:293:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMyDsl.g:293:5: (otherlv_10= RULE_ID )
                    // InternalMyDsl.g:294:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_10, grammarAccess.getAuthorAccess().getIsOwnerRecipeCrossReference_6_4_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:305:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:306:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getAuthorAccess().getCommaKeyword_6_5_0());
                    	    				
                    	    // InternalMyDsl.g:310:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalMyDsl.g:311:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:311:6: (otherlv_12= RULE_ID )
                    	    // InternalMyDsl.g:312:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAuthorRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getAuthorAccess().getIsOwnerRecipeCrossReference_6_5_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getAuthorAccess().getRightSquareBracketKeyword_6_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:329:3: (otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:330:4: otherlv_14= ',' otherlv_15= 'writes' otherlv_16= ':' otherlv_17= '[' ( (lv_writes_18_0= ruleRating ) ) (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )* otherlv_21= ']'
                    {
                    otherlv_14=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getAuthorAccess().getCommaKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getAuthorAccess().getWritesKeyword_7_1());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getAuthorAccess().getColonKeyword_7_2());
                    			
                    otherlv_17=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getAuthorAccess().getLeftSquareBracketKeyword_7_3());
                    			
                    // InternalMyDsl.g:346:4: ( (lv_writes_18_0= ruleRating ) )
                    // InternalMyDsl.g:347:5: (lv_writes_18_0= ruleRating )
                    {
                    // InternalMyDsl.g:347:5: (lv_writes_18_0= ruleRating )
                    // InternalMyDsl.g:348:6: lv_writes_18_0= ruleRating
                    {

                    						newCompositeNode(grammarAccess.getAuthorAccess().getWritesRatingParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_writes_18_0=ruleRating();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAuthorRule());
                    						}
                    						add(
                    							current,
                    							"writes",
                    							lv_writes_18_0,
                    							"org.xtext.example.mydsl.MyDsl.Rating");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:365:4: (otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:366:5: otherlv_19= ',' ( (lv_writes_20_0= ruleRating ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getAuthorAccess().getCommaKeyword_7_5_0());
                    	    				
                    	    // InternalMyDsl.g:370:5: ( (lv_writes_20_0= ruleRating ) )
                    	    // InternalMyDsl.g:371:6: (lv_writes_20_0= ruleRating )
                    	    {
                    	    // InternalMyDsl.g:371:6: (lv_writes_20_0= ruleRating )
                    	    // InternalMyDsl.g:372:7: lv_writes_20_0= ruleRating
                    	    {

                    	    							newCompositeNode(grammarAccess.getAuthorAccess().getWritesRatingParserRuleCall_7_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_writes_20_0=ruleRating();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAuthorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"writes",
                    	    								lv_writes_20_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Rating");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getAuthorAccess().getRightSquareBracketKeyword_7_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:395:3: (otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:396:4: otherlv_22= ',' otherlv_23= 'calls' otherlv_24= ':' otherlv_25= '[' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ']'
                    {
                    otherlv_22=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getAuthorAccess().getCommaKeyword_8_0());
                    			
                    otherlv_23=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getAuthorAccess().getCallsKeyword_8_1());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_24, grammarAccess.getAuthorAccess().getColonKeyword_8_2());
                    			
                    otherlv_25=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_25, grammarAccess.getAuthorAccess().getLeftSquareBracketKeyword_8_3());
                    			
                    // InternalMyDsl.g:412:4: ( (otherlv_26= RULE_ID ) )
                    // InternalMyDsl.g:413:5: (otherlv_26= RULE_ID )
                    {
                    // InternalMyDsl.g:413:5: (otherlv_26= RULE_ID )
                    // InternalMyDsl.g:414:6: otherlv_26= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorRule());
                    						}
                    					
                    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_26, grammarAccess.getAuthorAccess().getCallsRecipeCrossReference_8_4_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:425:4: (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:426:5: otherlv_27= ',' ( (otherlv_28= RULE_ID ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getAuthorAccess().getCommaKeyword_8_5_0());
                    	    				
                    	    // InternalMyDsl.g:430:5: ( (otherlv_28= RULE_ID ) )
                    	    // InternalMyDsl.g:431:6: (otherlv_28= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:431:6: (otherlv_28= RULE_ID )
                    	    // InternalMyDsl.g:432:7: otherlv_28= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAuthorRule());
                    	    							}
                    	    						
                    	    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(otherlv_28, grammarAccess.getAuthorAccess().getCallsRecipeCrossReference_8_5_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_29, grammarAccess.getAuthorAccess().getRightSquareBracketKeyword_8_6());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getAuthorAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleRecipeblock"
    // InternalMyDsl.g:457:1: entryRuleRecipeblock returns [EObject current=null] : iv_ruleRecipeblock= ruleRecipeblock EOF ;
    public final EObject entryRuleRecipeblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipeblock = null;


        try {
            // InternalMyDsl.g:457:52: (iv_ruleRecipeblock= ruleRecipeblock EOF )
            // InternalMyDsl.g:458:2: iv_ruleRecipeblock= ruleRecipeblock EOF
            {
             newCompositeNode(grammarAccess.getRecipeblockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipeblock=ruleRecipeblock();

            state._fsp--;

             current =iv_ruleRecipeblock; 
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
    // $ANTLR end "entryRuleRecipeblock"


    // $ANTLR start "ruleRecipeblock"
    // InternalMyDsl.g:464:1: ruleRecipeblock returns [EObject current=null] : (otherlv_0= '{' ( (lv_recipes_1_0= ruleRecipe ) ) (otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleRecipeblock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_recipes_1_0 = null;

        EObject lv_recipes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:470:2: ( (otherlv_0= '{' ( (lv_recipes_1_0= ruleRecipe ) ) (otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:471:2: (otherlv_0= '{' ( (lv_recipes_1_0= ruleRecipe ) ) (otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:471:2: (otherlv_0= '{' ( (lv_recipes_1_0= ruleRecipe ) ) (otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) ) )* otherlv_4= '}' )
            // InternalMyDsl.g:472:3: otherlv_0= '{' ( (lv_recipes_1_0= ruleRecipe ) ) (otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeblockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:476:3: ( (lv_recipes_1_0= ruleRecipe ) )
            // InternalMyDsl.g:477:4: (lv_recipes_1_0= ruleRecipe )
            {
            // InternalMyDsl.g:477:4: (lv_recipes_1_0= ruleRecipe )
            // InternalMyDsl.g:478:5: lv_recipes_1_0= ruleRecipe
            {

            					newCompositeNode(grammarAccess.getRecipeblockAccess().getRecipesRecipeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_recipes_1_0=ruleRecipe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeblockRule());
            					}
            					add(
            						current,
            						"recipes",
            						lv_recipes_1_0,
            						"org.xtext.example.mydsl.MyDsl.Recipe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:495:3: (otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:496:4: otherlv_2= ',' ( (lv_recipes_3_0= ruleRecipe ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRecipeblockAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:500:4: ( (lv_recipes_3_0= ruleRecipe ) )
            	    // InternalMyDsl.g:501:5: (lv_recipes_3_0= ruleRecipe )
            	    {
            	    // InternalMyDsl.g:501:5: (lv_recipes_3_0= ruleRecipe )
            	    // InternalMyDsl.g:502:6: lv_recipes_3_0= ruleRecipe
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeblockAccess().getRecipesRecipeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_recipes_3_0=ruleRecipe();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeblockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recipes",
            	    							lv_recipes_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Recipe");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRecipeblockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRecipeblock"


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:528:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalMyDsl.g:528:47: (iv_ruleRating= ruleRating EOF )
            // InternalMyDsl.g:529:2: iv_ruleRating= ruleRating EOF
            {
             newCompositeNode(grammarAccess.getRatingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRating=ruleRating();

            state._fsp--;

             current =iv_ruleRating; 
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
    // $ANTLR end "entryRuleRating"


    // $ANTLR start "ruleRating"
    // InternalMyDsl.g:535:1: ruleRating returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Recipe' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= ',' otherlv_13= 'written' otherlv_14= 'by' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' otherlv_18= '}' ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_stars_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_comment_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Recipe' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= ',' otherlv_13= 'written' otherlv_14= 'by' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' otherlv_18= '}' ) )
            // InternalMyDsl.g:542:2: (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Recipe' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= ',' otherlv_13= 'written' otherlv_14= 'by' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' otherlv_18= '}' )
            {
            // InternalMyDsl.g:542:2: (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Recipe' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= ',' otherlv_13= 'written' otherlv_14= 'by' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' otherlv_18= '}' )
            // InternalMyDsl.g:543:3: otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'Recipe' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= ',' otherlv_13= 'written' otherlv_14= 'by' otherlv_15= ':' ( (otherlv_16= RULE_ID ) ) otherlv_17= ',' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getStarsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:555:3: ( (lv_stars_3_0= RULE_INT ) )
            // InternalMyDsl.g:556:4: (lv_stars_3_0= RULE_INT )
            {
            // InternalMyDsl.g:556:4: (lv_stars_3_0= RULE_INT )
            // InternalMyDsl.g:557:5: lv_stars_3_0= RULE_INT
            {
            lv_stars_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_stars_3_0, grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stars",
            						lv_stars_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getRatingAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getCommentKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getRatingAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:585:3: ( (lv_comment_7_0= RULE_STRING ) )
            // InternalMyDsl.g:586:4: (lv_comment_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:586:4: (lv_comment_7_0= RULE_STRING )
            // InternalMyDsl.g:587:5: lv_comment_7_0= RULE_STRING
            {
            lv_comment_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_comment_7_0, grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getRatingAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRatingAccess().getRecipeKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getRatingAccess().getColonKeyword_10());
            		
            // InternalMyDsl.g:615:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:616:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:616:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:617:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_11, grammarAccess.getRatingAccess().getBewertetRecipeCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_12, grammarAccess.getRatingAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getRatingAccess().getWrittenKeyword_13());
            		
            otherlv_14=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getRatingAccess().getByKeyword_14());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getRatingAccess().getColonKeyword_15());
            		
            // InternalMyDsl.g:644:3: ( (otherlv_16= RULE_ID ) )
            // InternalMyDsl.g:645:4: (otherlv_16= RULE_ID )
            {
            // InternalMyDsl.g:645:4: (otherlv_16= RULE_ID )
            // InternalMyDsl.g:646:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_16, grammarAccess.getRatingAccess().getWrittenByAuthorCrossReference_16_0());
            				

            }


            }

            otherlv_17=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getRatingAccess().getCommaKeyword_17());
            		
            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRatingAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleRecipe"
    // InternalMyDsl.g:669:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalMyDsl.g:669:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalMyDsl.g:670:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
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
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalMyDsl.g:676:1: ruleRecipe returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' otherlv_27= 'foodCategory' otherlv_28= ':' ( (lv_foodCategory_29_0= ruleFoodCategory ) ) otherlv_30= ',' otherlv_31= 'Ingredients' otherlv_32= ':' otherlv_33= '[' ( (lv_ingredients_34_0= ruleIngridient ) ) (otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) ) )* otherlv_37= ']' otherlv_38= '}' ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_duration_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_difficulty_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_vegan_9_0 = null;

        EObject lv_kitchenUtensils_22_0 = null;

        EObject lv_kitchenUtensils_24_0 = null;

        EObject lv_foodCategory_29_0 = null;

        EObject lv_ingredients_34_0 = null;

        EObject lv_ingredients_36_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:682:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' otherlv_27= 'foodCategory' otherlv_28= ':' ( (lv_foodCategory_29_0= ruleFoodCategory ) ) otherlv_30= ',' otherlv_31= 'Ingredients' otherlv_32= ':' otherlv_33= '[' ( (lv_ingredients_34_0= ruleIngridient ) ) (otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) ) )* otherlv_37= ']' otherlv_38= '}' ) )
            // InternalMyDsl.g:683:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' otherlv_27= 'foodCategory' otherlv_28= ':' ( (lv_foodCategory_29_0= ruleFoodCategory ) ) otherlv_30= ',' otherlv_31= 'Ingredients' otherlv_32= ':' otherlv_33= '[' ( (lv_ingredients_34_0= ruleIngridient ) ) (otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) ) )* otherlv_37= ']' otherlv_38= '}' )
            {
            // InternalMyDsl.g:683:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' otherlv_27= 'foodCategory' otherlv_28= ':' ( (lv_foodCategory_29_0= ruleFoodCategory ) ) otherlv_30= ',' otherlv_31= 'Ingredients' otherlv_32= ':' otherlv_33= '[' ( (lv_ingredients_34_0= ruleIngridient ) ) (otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) ) )* otherlv_37= ']' otherlv_38= '}' )
            // InternalMyDsl.g:684:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' otherlv_27= 'foodCategory' otherlv_28= ':' ( (lv_foodCategory_29_0= ruleFoodCategory ) ) otherlv_30= ',' otherlv_31= 'Ingredients' otherlv_32= ':' otherlv_33= '[' ( (lv_ingredients_34_0= ruleIngridient ) ) (otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) ) )* otherlv_37= ']' otherlv_38= '}'
            {
            // InternalMyDsl.g:684:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:685:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:685:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:686:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getAuthorKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getRecipeAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:718:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:719:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:719:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:720:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getVeganismLevelKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getColonKeyword_8());
            		
            // InternalMyDsl.g:743:3: ( (lv_vegan_9_0= ruleVeganismLevel ) )
            // InternalMyDsl.g:744:4: (lv_vegan_9_0= ruleVeganismLevel )
            {
            // InternalMyDsl.g:744:4: (lv_vegan_9_0= ruleVeganismLevel )
            // InternalMyDsl.g:745:5: lv_vegan_9_0= ruleVeganismLevel
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_18);
            lv_vegan_9_0=ruleVeganismLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"vegan",
            						lv_vegan_9_0,
            						"org.xtext.example.mydsl.MyDsl.VeganismLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getRecipeAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getDurationKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getRecipeAccess().getColonKeyword_12());
            		
            // InternalMyDsl.g:774:3: ( (lv_duration_13_0= RULE_INT ) )
            // InternalMyDsl.g:775:4: (lv_duration_13_0= RULE_INT )
            {
            // InternalMyDsl.g:775:4: (lv_duration_13_0= RULE_INT )
            // InternalMyDsl.g:776:5: lv_duration_13_0= RULE_INT
            {
            lv_duration_13_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_duration_13_0, grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_14, grammarAccess.getRecipeAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getDifficultyKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getRecipeAccess().getColonKeyword_16());
            		
            // InternalMyDsl.g:804:3: ( (lv_difficulty_17_0= RULE_INT ) )
            // InternalMyDsl.g:805:4: (lv_difficulty_17_0= RULE_INT )
            {
            // InternalMyDsl.g:805:4: (lv_difficulty_17_0= RULE_INT )
            // InternalMyDsl.g:806:5: lv_difficulty_17_0= RULE_INT
            {
            lv_difficulty_17_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_difficulty_17_0, grammarAccess.getRecipeAccess().getDifficultyINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"difficulty",
            						lv_difficulty_17_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_18=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_18, grammarAccess.getRecipeAccess().getCommaKeyword_18());
            		
            otherlv_19=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_19());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_20, grammarAccess.getRecipeAccess().getColonKeyword_20());
            		
            otherlv_21=(Token)match(input,19,FOLLOW_29); 

            			newLeafNode(otherlv_21, grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_21());
            		
            // InternalMyDsl.g:838:3: ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) )
            // InternalMyDsl.g:839:4: (lv_kitchenUtensils_22_0= ruleKitchenUtensil )
            {
            // InternalMyDsl.g:839:4: (lv_kitchenUtensils_22_0= ruleKitchenUtensil )
            // InternalMyDsl.g:840:5: lv_kitchenUtensils_22_0= ruleKitchenUtensil
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_12);
            lv_kitchenUtensils_22_0=ruleKitchenUtensil();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"kitchenUtensils",
            						lv_kitchenUtensils_22_0,
            						"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:857:3: (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:858:4: otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) )
            	    {
            	    otherlv_23=(Token)match(input,15,FOLLOW_29); 

            	    				newLeafNode(otherlv_23, grammarAccess.getRecipeAccess().getCommaKeyword_23_0());
            	    			
            	    // InternalMyDsl.g:862:4: ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) )
            	    // InternalMyDsl.g:863:5: (lv_kitchenUtensils_24_0= ruleKitchenUtensil )
            	    {
            	    // InternalMyDsl.g:863:5: (lv_kitchenUtensils_24_0= ruleKitchenUtensil )
            	    // InternalMyDsl.g:864:6: lv_kitchenUtensils_24_0= ruleKitchenUtensil
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_23_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_kitchenUtensils_24_0=ruleKitchenUtensil();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"kitchenUtensils",
            	    							lv_kitchenUtensils_24_0,
            	    							"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_25=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_25, grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_24());
            		
            otherlv_26=(Token)match(input,15,FOLLOW_30); 

            			newLeafNode(otherlv_26, grammarAccess.getRecipeAccess().getCommaKeyword_25());
            		
            otherlv_27=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_27, grammarAccess.getRecipeAccess().getFoodCategoryKeyword_26());
            		
            otherlv_28=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_28, grammarAccess.getRecipeAccess().getColonKeyword_27());
            		
            // InternalMyDsl.g:898:3: ( (lv_foodCategory_29_0= ruleFoodCategory ) )
            // InternalMyDsl.g:899:4: (lv_foodCategory_29_0= ruleFoodCategory )
            {
            // InternalMyDsl.g:899:4: (lv_foodCategory_29_0= ruleFoodCategory )
            // InternalMyDsl.g:900:5: lv_foodCategory_29_0= ruleFoodCategory
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_28_0());
            				
            pushFollow(FOLLOW_18);
            lv_foodCategory_29_0=ruleFoodCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"foodCategory",
            						lv_foodCategory_29_0,
            						"org.xtext.example.mydsl.MyDsl.FoodCategory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_30, grammarAccess.getRecipeAccess().getCommaKeyword_29());
            		
            otherlv_31=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_31, grammarAccess.getRecipeAccess().getIngredientsKeyword_30());
            		
            otherlv_32=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_32, grammarAccess.getRecipeAccess().getColonKeyword_31());
            		
            otherlv_33=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_33, grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_32());
            		
            // InternalMyDsl.g:933:3: ( (lv_ingredients_34_0= ruleIngridient ) )
            // InternalMyDsl.g:934:4: (lv_ingredients_34_0= ruleIngridient )
            {
            // InternalMyDsl.g:934:4: (lv_ingredients_34_0= ruleIngridient )
            // InternalMyDsl.g:935:5: lv_ingredients_34_0= ruleIngridient
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngridientParserRuleCall_33_0());
            				
            pushFollow(FOLLOW_12);
            lv_ingredients_34_0=ruleIngridient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"ingredients",
            						lv_ingredients_34_0,
            						"org.xtext.example.mydsl.MyDsl.Ingridient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:952:3: (otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:953:4: otherlv_35= ',' ( (lv_ingredients_36_0= ruleIngridient ) )
            	    {
            	    otherlv_35=(Token)match(input,15,FOLLOW_32); 

            	    				newLeafNode(otherlv_35, grammarAccess.getRecipeAccess().getCommaKeyword_34_0());
            	    			
            	    // InternalMyDsl.g:957:4: ( (lv_ingredients_36_0= ruleIngridient ) )
            	    // InternalMyDsl.g:958:5: (lv_ingredients_36_0= ruleIngridient )
            	    {
            	    // InternalMyDsl.g:958:5: (lv_ingredients_36_0= ruleIngridient )
            	    // InternalMyDsl.g:959:6: lv_ingredients_36_0= ruleIngridient
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngridientParserRuleCall_34_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_ingredients_36_0=ruleIngridient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ingredients",
            	    							lv_ingredients_36_0,
            	    							"org.xtext.example.mydsl.MyDsl.Ingridient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_37=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_37, grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_35());
            		
            otherlv_38=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_36());
            		

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
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleKitchenUtensil"
    // InternalMyDsl.g:989:1: entryRuleKitchenUtensil returns [EObject current=null] : iv_ruleKitchenUtensil= ruleKitchenUtensil EOF ;
    public final EObject entryRuleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKitchenUtensil = null;


        try {
            // InternalMyDsl.g:989:55: (iv_ruleKitchenUtensil= ruleKitchenUtensil EOF )
            // InternalMyDsl.g:990:2: iv_ruleKitchenUtensil= ruleKitchenUtensil EOF
            {
             newCompositeNode(grammarAccess.getKitchenUtensilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKitchenUtensil=ruleKitchenUtensil();

            state._fsp--;

             current =iv_ruleKitchenUtensil; 
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
    // $ANTLR end "entryRuleKitchenUtensil"


    // $ANTLR start "ruleKitchenUtensil"
    // InternalMyDsl.g:996:1: ruleKitchenUtensil returns [EObject current=null] : ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) ) ;
    public final EObject ruleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1002:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) ) )
            // InternalMyDsl.g:1003:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) )
            {
            // InternalMyDsl.g:1003:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) )
            // InternalMyDsl.g:1004:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) )
            {
            // InternalMyDsl.g:1004:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) )
            // InternalMyDsl.g:1005:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' )
            {
            // InternalMyDsl.g:1005:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 36:
                {
                alt11=3;
                }
                break;
            case 37:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1006:5: lv_name_0_1= RULE_STRING
                    {
                    lv_name_0_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getKitchenUtensilAccess().getNameSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1021:5: lv_name_0_2= 'furnace'
                    {
                    lv_name_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1032:5: lv_name_0_3= 'stovetop'
                    {
                    lv_name_0_3=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1043:5: lv_name_0_4= 'rolling pin'
                    {
                    lv_name_0_4=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getKitchenUtensilAccess().getNameRollingPinKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleKitchenUtensil"


    // $ANTLR start "entryRuleFoodCategory"
    // InternalMyDsl.g:1059:1: entryRuleFoodCategory returns [EObject current=null] : iv_ruleFoodCategory= ruleFoodCategory EOF ;
    public final EObject entryRuleFoodCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodCategory = null;


        try {
            // InternalMyDsl.g:1059:53: (iv_ruleFoodCategory= ruleFoodCategory EOF )
            // InternalMyDsl.g:1060:2: iv_ruleFoodCategory= ruleFoodCategory EOF
            {
             newCompositeNode(grammarAccess.getFoodCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodCategory=ruleFoodCategory();

            state._fsp--;

             current =iv_ruleFoodCategory; 
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
    // $ANTLR end "entryRuleFoodCategory"


    // $ANTLR start "ruleFoodCategory"
    // InternalMyDsl.g:1066:1: ruleFoodCategory returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFoodCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1072:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1073:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1073:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1074:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1074:3: (lv_name_0_0= RULE_STRING )
            // InternalMyDsl.g:1075:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFoodCategoryAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFoodCategoryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleFoodCategory"


    // $ANTLR start "entryRuleIngridient"
    // InternalMyDsl.g:1094:1: entryRuleIngridient returns [EObject current=null] : iv_ruleIngridient= ruleIngridient EOF ;
    public final EObject entryRuleIngridient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngridient = null;


        try {
            // InternalMyDsl.g:1094:51: (iv_ruleIngridient= ruleIngridient EOF )
            // InternalMyDsl.g:1095:2: iv_ruleIngridient= ruleIngridient EOF
            {
             newCompositeNode(grammarAccess.getIngridientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngridient=ruleIngridient();

            state._fsp--;

             current =iv_ruleIngridient; 
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
    // $ANTLR end "entryRuleIngridient"


    // $ANTLR start "ruleIngridient"
    // InternalMyDsl.g:1101:1: ruleIngridient returns [EObject current=null] : ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) ) ;
    public final EObject ruleIngridient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_amount_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_unit_11_0 = null;

        AntlrDatatypeRuleToken lv_veganismLevel_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1107:2: ( ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) ) )
            // InternalMyDsl.g:1108:2: ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1108:2: ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1109:3: (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' )
                    {
                    // InternalMyDsl.g:1109:3: (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' )
                    // InternalMyDsl.g:1110:4: otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getIngridientAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getIngridientAccess().getNameKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getIngridientAccess().getColonKeyword_0_2());
                    			
                    // InternalMyDsl.g:1122:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:1123:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1123:5: (lv_name_3_0= RULE_STRING )
                    // InternalMyDsl.g:1124:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getIngridientAccess().getNameSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngridientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngridientAccess().getCommaKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIngridientAccess().getAmountKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getIngridientAccess().getColonKeyword_0_6());
                    			
                    // InternalMyDsl.g:1152:4: ( (lv_amount_7_0= RULE_INT ) )
                    // InternalMyDsl.g:1153:5: (lv_amount_7_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1153:5: (lv_amount_7_0= RULE_INT )
                    // InternalMyDsl.g:1154:6: lv_amount_7_0= RULE_INT
                    {
                    lv_amount_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_amount_7_0, grammarAccess.getIngridientAccess().getAmountINTTerminalRuleCall_0_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngridientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getIngridientAccess().getCommaKeyword_0_8());
                    			
                    otherlv_9=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getIngridientAccess().getUnitKeyword_0_9());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getIngridientAccess().getColonKeyword_0_10());
                    			
                    // InternalMyDsl.g:1182:4: ( (lv_unit_11_0= ruleUnit ) )
                    // InternalMyDsl.g:1183:5: (lv_unit_11_0= ruleUnit )
                    {
                    // InternalMyDsl.g:1183:5: (lv_unit_11_0= ruleUnit )
                    // InternalMyDsl.g:1184:6: lv_unit_11_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getIngridientAccess().getUnitUnitParserRuleCall_0_11_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_unit_11_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngridientRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getIngridientAccess().getCommaKeyword_0_12());
                    			
                    otherlv_13=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getIngridientAccess().getVeganismLevelKeyword_0_13());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getIngridientAccess().getColonKeyword_0_14());
                    			
                    // InternalMyDsl.g:1213:4: ( (lv_veganismLevel_15_0= ruleVeganismLevel ) )
                    // InternalMyDsl.g:1214:5: (lv_veganismLevel_15_0= ruleVeganismLevel )
                    {
                    // InternalMyDsl.g:1214:5: (lv_veganismLevel_15_0= ruleVeganismLevel )
                    // InternalMyDsl.g:1215:6: lv_veganismLevel_15_0= ruleVeganismLevel
                    {

                    						newCompositeNode(grammarAccess.getIngridientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_15_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_veganismLevel_15_0=ruleVeganismLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngridientRule());
                    						}
                    						set(
                    							current,
                    							"veganismLevel",
                    							lv_veganismLevel_15_0,
                    							"org.xtext.example.mydsl.MyDsl.VeganismLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getIngridientAccess().getRightCurlyBracketKeyword_0_16());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1238:3: ( (otherlv_17= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1238:3: ( (otherlv_17= RULE_ID ) )
                    // InternalMyDsl.g:1239:4: (otherlv_17= RULE_ID )
                    {
                    // InternalMyDsl.g:1239:4: (otherlv_17= RULE_ID )
                    // InternalMyDsl.g:1240:5: otherlv_17= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIngridientRule());
                    					}
                    				
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getIngridientAccess().getRecipeRecipeCrossReference_1_0());
                    				

                    }


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
    // $ANTLR end "ruleIngridient"


    // $ANTLR start "entryRuleVeganismLevel"
    // InternalMyDsl.g:1255:1: entryRuleVeganismLevel returns [String current=null] : iv_ruleVeganismLevel= ruleVeganismLevel EOF ;
    public final String entryRuleVeganismLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVeganismLevel = null;


        try {
            // InternalMyDsl.g:1255:53: (iv_ruleVeganismLevel= ruleVeganismLevel EOF )
            // InternalMyDsl.g:1256:2: iv_ruleVeganismLevel= ruleVeganismLevel EOF
            {
             newCompositeNode(grammarAccess.getVeganismLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVeganismLevel=ruleVeganismLevel();

            state._fsp--;

             current =iv_ruleVeganismLevel.getText(); 
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
    // $ANTLR end "entryRuleVeganismLevel"


    // $ANTLR start "ruleVeganismLevel"
    // InternalMyDsl.g:1262:1: ruleVeganismLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) ;
    public final AntlrDatatypeRuleToken ruleVeganismLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1268:2: ( (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) )
            // InternalMyDsl.g:1269:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            {
            // InternalMyDsl.g:1269:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1270:3: kw= 'Vegan'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVeganKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1276:3: kw= 'Vegetaric'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1282:3: kw= 'Carnivorous'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getCarnivorousKeyword_2());
                    		

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
    // $ANTLR end "ruleVeganismLevel"


    // $ANTLR start "entryRuleUnit"
    // InternalMyDsl.g:1291:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalMyDsl.g:1291:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalMyDsl.g:1292:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:1298:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1304:2: ( (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) )
            // InternalMyDsl.g:1305:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            {
            // InternalMyDsl.g:1305:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt14=1;
                }
                break;
            case 45:
                {
                alt14=2;
                }
                break;
            case 46:
                {
                alt14=3;
                }
                break;
            case 47:
                {
                alt14=4;
                }
                break;
            case 48:
                {
                alt14=5;
                }
                break;
            case 49:
                {
                alt14=6;
                }
                break;
            case 50:
                {
                alt14=7;
                }
                break;
            case 51:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1306:3: kw= 'ml'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMlKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1312:3: kw= 'l'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1318:3: kw= 'g'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getGKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1324:3: kw= 'kg'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getKgKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1330:3: kw= 'tsp'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTspKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1336:3: kw= 'mg'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMgKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1342:3: kw= 'tbsp'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTbspKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1348:3: kw= 'pcs'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getPcsKeyword_7());
                    		

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
    // $ANTLR end "ruleUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003800000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000FF00000000000L});

}