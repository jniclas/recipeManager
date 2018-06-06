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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'authors'", "':'", "'{'", "','", "'}'", "'recipes'", "'Stars'", "'Comment'", "'Author'", "'VeganismLevel'", "'Duration'", "'Difficulty'", "'KitchenUtensils'", "'['", "']'", "'foodCategory'", "'Ingredients'", "'Ratings'", "'furnace'", "'stovetop'", "'rolling pin'", "'Name'", "'Amount'", "'Unit'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalMyDsl.g:71:1: ruleRecipeManager returns [EObject current=null] : (otherlv_0= 'authors' otherlv_1= ':' otherlv_2= '{' ( (lv_authors_3_0= ruleAuthor ) ) (otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) ) )* otherlv_6= '}' otherlv_7= 'recipes' otherlv_8= ':' otherlv_9= '{' ( (lv_recipes_10_0= ruleRecipe ) ) (otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleRecipeManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_authors_3_0 = null;

        EObject lv_authors_5_0 = null;

        EObject lv_recipes_10_0 = null;

        EObject lv_recipes_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'authors' otherlv_1= ':' otherlv_2= '{' ( (lv_authors_3_0= ruleAuthor ) ) (otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) ) )* otherlv_6= '}' otherlv_7= 'recipes' otherlv_8= ':' otherlv_9= '{' ( (lv_recipes_10_0= ruleRecipe ) ) (otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) ) )* otherlv_13= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'authors' otherlv_1= ':' otherlv_2= '{' ( (lv_authors_3_0= ruleAuthor ) ) (otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) ) )* otherlv_6= '}' otherlv_7= 'recipes' otherlv_8= ':' otherlv_9= '{' ( (lv_recipes_10_0= ruleRecipe ) ) (otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) ) )* otherlv_13= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'authors' otherlv_1= ':' otherlv_2= '{' ( (lv_authors_3_0= ruleAuthor ) ) (otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) ) )* otherlv_6= '}' otherlv_7= 'recipes' otherlv_8= ':' otherlv_9= '{' ( (lv_recipes_10_0= ruleRecipe ) ) (otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) ) )* otherlv_13= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'authors' otherlv_1= ':' otherlv_2= '{' ( (lv_authors_3_0= ruleAuthor ) ) (otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) ) )* otherlv_6= '}' otherlv_7= 'recipes' otherlv_8= ':' otherlv_9= '{' ( (lv_recipes_10_0= ruleRecipe ) ) (otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecipeManagerAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeManagerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:91:3: ( (lv_authors_3_0= ruleAuthor ) )
            // InternalMyDsl.g:92:4: (lv_authors_3_0= ruleAuthor )
            {
            // InternalMyDsl.g:92:4: (lv_authors_3_0= ruleAuthor )
            // InternalMyDsl.g:93:5: lv_authors_3_0= ruleAuthor
            {

            					newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_authors_3_0=ruleAuthor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            					}
            					add(
            						current,
            						"authors",
            						lv_authors_3_0,
            						"org.xtext.example.mydsl.MyDsl.Author");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:110:3: (otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:111:4: otherlv_4= ',' ( (lv_authors_5_0= ruleAuthor ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRecipeManagerAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:115:4: ( (lv_authors_5_0= ruleAuthor ) )
            	    // InternalMyDsl.g:116:5: (lv_authors_5_0= ruleAuthor )
            	    {
            	    // InternalMyDsl.g:116:5: (lv_authors_5_0= ruleAuthor )
            	    // InternalMyDsl.g:117:6: lv_authors_5_0= ruleAuthor
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_authors_5_0=ruleAuthor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"authors",
            	    							lv_authors_5_0,
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

            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRecipeManagerAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeManagerAccess().getRecipesKeyword_6());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getRecipeManagerAccess().getColonKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getRecipeManagerAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:151:3: ( (lv_recipes_10_0= ruleRecipe ) )
            // InternalMyDsl.g:152:4: (lv_recipes_10_0= ruleRecipe )
            {
            // InternalMyDsl.g:152:4: (lv_recipes_10_0= ruleRecipe )
            // InternalMyDsl.g:153:5: lv_recipes_10_0= ruleRecipe
            {

            					newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_recipes_10_0=ruleRecipe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            					}
            					add(
            						current,
            						"recipes",
            						lv_recipes_10_0,
            						"org.xtext.example.mydsl.MyDsl.Recipe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:170:3: (otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:171:4: otherlv_11= ',' ( (lv_recipes_12_0= ruleRecipe ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_11, grammarAccess.getRecipeManagerAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMyDsl.g:175:4: ( (lv_recipes_12_0= ruleRecipe ) )
            	    // InternalMyDsl.g:176:5: (lv_recipes_12_0= ruleRecipe )
            	    {
            	    // InternalMyDsl.g:176:5: (lv_recipes_12_0= ruleRecipe )
            	    // InternalMyDsl.g:177:6: lv_recipes_12_0= ruleRecipe
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_recipes_12_0=ruleRecipe();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recipes",
            	    							lv_recipes_12_0,
            	    							"org.xtext.example.mydsl.MyDsl.Recipe");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRecipeManagerAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleAuthor"
    // InternalMyDsl.g:203:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // InternalMyDsl.g:203:47: (iv_ruleAuthor= ruleAuthor EOF )
            // InternalMyDsl.g:204:2: iv_ruleAuthor= ruleAuthor EOF
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
    // InternalMyDsl.g:210:1: ruleAuthor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Email_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_Email_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:216:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Email_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:217:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Email_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:217:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Email_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:218:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_Email_2_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:218:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:219:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:219:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:220:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthorAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:240:3: ( (lv_Email_2_0= RULE_STRING ) )
            // InternalMyDsl.g:241:4: (lv_Email_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:241:4: (lv_Email_2_0= RULE_STRING )
            // InternalMyDsl.g:242:5: lv_Email_2_0= RULE_STRING
            {
            lv_Email_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Email_2_0, grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Email",
            						lv_Email_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:262:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalMyDsl.g:262:47: (iv_ruleRating= ruleRating EOF )
            // InternalMyDsl.g:263:2: iv_ruleRating= ruleRating EOF
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
    // InternalMyDsl.g:269:1: ruleRating returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' (otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= 'Author' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
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


        	enterRule();

        try {
            // InternalMyDsl.g:275:2: ( (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' (otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= 'Author' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:276:2: (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' (otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= 'Author' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:276:2: (otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' (otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= 'Author' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // InternalMyDsl.g:277:3: otherlv_0= '{' otherlv_1= 'Stars' otherlv_2= ':' ( (lv_stars_3_0= RULE_INT ) ) otherlv_4= ',' (otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' )? otherlv_9= 'Author' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getRatingAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getStarsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:289:3: ( (lv_stars_3_0= RULE_INT ) )
            // InternalMyDsl.g:290:4: (lv_stars_3_0= RULE_INT )
            {
            // InternalMyDsl.g:290:4: (lv_stars_3_0= RULE_INT )
            // InternalMyDsl.g:291:5: lv_stars_3_0= RULE_INT
            {
            lv_stars_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getRatingAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:311:3: (otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:312:4: otherlv_5= 'Comment' otherlv_6= ':' ( (lv_comment_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRatingAccess().getCommentKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRatingAccess().getColonKeyword_5_1());
                    			
                    // InternalMyDsl.g:320:4: ( (lv_comment_7_0= RULE_STRING ) )
                    // InternalMyDsl.g:321:5: (lv_comment_7_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:321:5: (lv_comment_7_0= RULE_STRING )
                    // InternalMyDsl.g:322:6: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_comment_7_0, grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_5_2_0());
                    					

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

                    otherlv_8=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getRatingAccess().getCommaKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRatingAccess().getAuthorKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getRatingAccess().getColonKeyword_7());
            		
            // InternalMyDsl.g:351:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:352:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:352:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:353:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_11, grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_8_0());
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRatingAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:372:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalMyDsl.g:372:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalMyDsl.g:373:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalMyDsl.g:379:1: ruleRecipe returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' (otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' )? (otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ',' )? otherlv_35= 'Ingredients' otherlv_36= ':' otherlv_37= '[' ( (lv_ingredient_38_0= ruleIngredient ) ) (otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) ) )* otherlv_41= ']' (otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']' )? otherlv_50= '}' ) ;
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
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        AntlrDatatypeRuleToken lv_vegan_9_0 = null;

        EObject lv_kitchenUtensils_22_0 = null;

        EObject lv_kitchenUtensils_24_0 = null;

        EObject lv_foodCategory_30_0 = null;

        EObject lv_foodCategory_32_0 = null;

        EObject lv_ingredient_38_0 = null;

        EObject lv_ingredient_40_0 = null;

        EObject lv_ratings_46_0 = null;

        EObject lv_ratings_48_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:385:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' (otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' )? (otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ',' )? otherlv_35= 'Ingredients' otherlv_36= ':' otherlv_37= '[' ( (lv_ingredient_38_0= ruleIngredient ) ) (otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) ) )* otherlv_41= ']' (otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']' )? otherlv_50= '}' ) )
            // InternalMyDsl.g:386:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' (otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' )? (otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ',' )? otherlv_35= 'Ingredients' otherlv_36= ':' otherlv_37= '[' ( (lv_ingredient_38_0= ruleIngredient ) ) (otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) ) )* otherlv_41= ']' (otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']' )? otherlv_50= '}' )
            {
            // InternalMyDsl.g:386:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' (otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' )? (otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ',' )? otherlv_35= 'Ingredients' otherlv_36= ':' otherlv_37= '[' ( (lv_ingredient_38_0= ruleIngredient ) ) (otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) ) )* otherlv_41= ']' (otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']' )? otherlv_50= '}' )
            // InternalMyDsl.g:387:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Author' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'VeganismLevel' otherlv_8= ':' ( (lv_vegan_9_0= ruleVeganismLevel ) ) otherlv_10= ',' otherlv_11= 'Duration' otherlv_12= ':' ( (lv_duration_13_0= RULE_INT ) ) otherlv_14= ',' otherlv_15= 'Difficulty' otherlv_16= ':' ( (lv_difficulty_17_0= RULE_INT ) ) otherlv_18= ',' (otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' )? (otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ',' )? otherlv_35= 'Ingredients' otherlv_36= ':' otherlv_37= '[' ( (lv_ingredient_38_0= ruleIngredient ) ) (otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) ) )* otherlv_41= ']' (otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']' )? otherlv_50= '}'
            {
            // InternalMyDsl.g:387:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:388:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:388:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:389:5: lv_name_0_0= RULE_ID
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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getAuthorKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getRecipeAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:421:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:422:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:422:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:423:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getVeganismLevelKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getColonKeyword_8());
            		
            // InternalMyDsl.g:446:3: ( (lv_vegan_9_0= ruleVeganismLevel ) )
            // InternalMyDsl.g:447:4: (lv_vegan_9_0= ruleVeganismLevel )
            {
            // InternalMyDsl.g:447:4: (lv_vegan_9_0= ruleVeganismLevel )
            // InternalMyDsl.g:448:5: lv_vegan_9_0= ruleVeganismLevel
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_10=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getRecipeAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getDurationKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getRecipeAccess().getColonKeyword_12());
            		
            // InternalMyDsl.g:477:3: ( (lv_duration_13_0= RULE_INT ) )
            // InternalMyDsl.g:478:4: (lv_duration_13_0= RULE_INT )
            {
            // InternalMyDsl.g:478:4: (lv_duration_13_0= RULE_INT )
            // InternalMyDsl.g:479:5: lv_duration_13_0= RULE_INT
            {
            lv_duration_13_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_14=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getRecipeAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getDifficultyKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getRecipeAccess().getColonKeyword_16());
            		
            // InternalMyDsl.g:507:3: ( (lv_difficulty_17_0= RULE_INT ) )
            // InternalMyDsl.g:508:4: (lv_difficulty_17_0= RULE_INT )
            {
            // InternalMyDsl.g:508:4: (lv_difficulty_17_0= RULE_INT )
            // InternalMyDsl.g:509:5: lv_difficulty_17_0= RULE_INT
            {
            lv_difficulty_17_0=(Token)match(input,RULE_INT,FOLLOW_11); 

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

            otherlv_18=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getRecipeAccess().getCommaKeyword_18());
            		
            // InternalMyDsl.g:529:3: (otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:530:4: otherlv_19= 'KitchenUtensils' otherlv_20= ':' otherlv_21= '[' ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) ) (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )* otherlv_25= ']' otherlv_26= ','
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_19_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_20, grammarAccess.getRecipeAccess().getColonKeyword_19_1());
                    			
                    otherlv_21=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_19_2());
                    			
                    // InternalMyDsl.g:542:4: ( (lv_kitchenUtensils_22_0= ruleKitchenUtensil ) )
                    // InternalMyDsl.g:543:5: (lv_kitchenUtensils_22_0= ruleKitchenUtensil )
                    {
                    // InternalMyDsl.g:543:5: (lv_kitchenUtensils_22_0= ruleKitchenUtensil )
                    // InternalMyDsl.g:544:6: lv_kitchenUtensils_22_0= ruleKitchenUtensil
                    {

                    						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_19_3_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalMyDsl.g:561:4: (otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:562:5: otherlv_23= ',' ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_21); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getRecipeAccess().getCommaKeyword_19_4_0());
                    	    				
                    	    // InternalMyDsl.g:566:5: ( (lv_kitchenUtensils_24_0= ruleKitchenUtensil ) )
                    	    // InternalMyDsl.g:567:6: (lv_kitchenUtensils_24_0= ruleKitchenUtensil )
                    	    {
                    	    // InternalMyDsl.g:567:6: (lv_kitchenUtensils_24_0= ruleKitchenUtensil )
                    	    // InternalMyDsl.g:568:7: lv_kitchenUtensils_24_0= ruleKitchenUtensil
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_19_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_25, grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_19_5());
                    			
                    otherlv_26=(Token)match(input,14,FOLLOW_23); 

                    				newLeafNode(otherlv_26, grammarAccess.getRecipeAccess().getCommaKeyword_19_6());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:595:3: (otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:596:4: otherlv_27= 'foodCategory' otherlv_28= ':' otherlv_29= '[' ( (lv_foodCategory_30_0= ruleFoodCategory ) ) (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )* otherlv_33= ']' otherlv_34= ','
                    {
                    otherlv_27=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getRecipeAccess().getFoodCategoryKeyword_20_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_28, grammarAccess.getRecipeAccess().getColonKeyword_20_1());
                    			
                    otherlv_29=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_29, grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_20_2());
                    			
                    // InternalMyDsl.g:608:4: ( (lv_foodCategory_30_0= ruleFoodCategory ) )
                    // InternalMyDsl.g:609:5: (lv_foodCategory_30_0= ruleFoodCategory )
                    {
                    // InternalMyDsl.g:609:5: (lv_foodCategory_30_0= ruleFoodCategory )
                    // InternalMyDsl.g:610:6: lv_foodCategory_30_0= ruleFoodCategory
                    {

                    						newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_3_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_foodCategory_30_0=ruleFoodCategory();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecipeRule());
                    						}
                    						add(
                    							current,
                    							"foodCategory",
                    							lv_foodCategory_30_0,
                    							"org.xtext.example.mydsl.MyDsl.FoodCategory");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:627:4: (otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:628:5: otherlv_31= ',' ( (lv_foodCategory_32_0= ruleFoodCategory ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getRecipeAccess().getCommaKeyword_20_4_0());
                    	    				
                    	    // InternalMyDsl.g:632:5: ( (lv_foodCategory_32_0= ruleFoodCategory ) )
                    	    // InternalMyDsl.g:633:6: (lv_foodCategory_32_0= ruleFoodCategory )
                    	    {
                    	    // InternalMyDsl.g:633:6: (lv_foodCategory_32_0= ruleFoodCategory )
                    	    // InternalMyDsl.g:634:7: lv_foodCategory_32_0= ruleFoodCategory
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_foodCategory_32_0=ruleFoodCategory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"foodCategory",
                    	    								lv_foodCategory_32_0,
                    	    								"org.xtext.example.mydsl.MyDsl.FoodCategory");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_33, grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_20_5());
                    			
                    otherlv_34=(Token)match(input,14,FOLLOW_24); 

                    				newLeafNode(otherlv_34, grammarAccess.getRecipeAccess().getCommaKeyword_20_6());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_35, grammarAccess.getRecipeAccess().getIngredientsKeyword_21());
            		
            otherlv_36=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_36, grammarAccess.getRecipeAccess().getColonKeyword_22());
            		
            otherlv_37=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_37, grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_23());
            		
            // InternalMyDsl.g:673:3: ( (lv_ingredient_38_0= ruleIngredient ) )
            // InternalMyDsl.g:674:4: (lv_ingredient_38_0= ruleIngredient )
            {
            // InternalMyDsl.g:674:4: (lv_ingredient_38_0= ruleIngredient )
            // InternalMyDsl.g:675:5: lv_ingredient_38_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_22);
            lv_ingredient_38_0=ruleIngredient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"ingredient",
            						lv_ingredient_38_0,
            						"org.xtext.example.mydsl.MyDsl.Ingredient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:692:3: (otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:693:4: otherlv_39= ',' ( (lv_ingredient_40_0= ruleIngredient ) )
            	    {
            	    otherlv_39=(Token)match(input,14,FOLLOW_25); 

            	    				newLeafNode(otherlv_39, grammarAccess.getRecipeAccess().getCommaKeyword_25_0());
            	    			
            	    // InternalMyDsl.g:697:4: ( (lv_ingredient_40_0= ruleIngredient ) )
            	    // InternalMyDsl.g:698:5: (lv_ingredient_40_0= ruleIngredient )
            	    {
            	    // InternalMyDsl.g:698:5: (lv_ingredient_40_0= ruleIngredient )
            	    // InternalMyDsl.g:699:6: lv_ingredient_40_0= ruleIngredient
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_25_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_ingredient_40_0=ruleIngredient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ingredient",
            	    							lv_ingredient_40_0,
            	    							"org.xtext.example.mydsl.MyDsl.Ingredient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_41=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_41, grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_26());
            		
            // InternalMyDsl.g:721:3: (otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:722:4: otherlv_42= ',' otherlv_43= 'Ratings' otherlv_44= ':' otherlv_45= '[' ( (lv_ratings_46_0= ruleRating ) ) (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )* otherlv_49= ']'
                    {
                    otherlv_42=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_42, grammarAccess.getRecipeAccess().getCommaKeyword_27_0());
                    			
                    otherlv_43=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_43, grammarAccess.getRecipeAccess().getRatingsKeyword_27_1());
                    			
                    otherlv_44=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_44, grammarAccess.getRecipeAccess().getColonKeyword_27_2());
                    			
                    otherlv_45=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_45, grammarAccess.getRecipeAccess().getLeftSquareBracketKeyword_27_3());
                    			
                    // InternalMyDsl.g:738:4: ( (lv_ratings_46_0= ruleRating ) )
                    // InternalMyDsl.g:739:5: (lv_ratings_46_0= ruleRating )
                    {
                    // InternalMyDsl.g:739:5: (lv_ratings_46_0= ruleRating )
                    // InternalMyDsl.g:740:6: lv_ratings_46_0= ruleRating
                    {

                    						newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_27_4_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ratings_46_0=ruleRating();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecipeRule());
                    						}
                    						add(
                    							current,
                    							"ratings",
                    							lv_ratings_46_0,
                    							"org.xtext.example.mydsl.MyDsl.Rating");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:757:4: (otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:758:5: otherlv_47= ',' ( (lv_ratings_48_0= ruleRating ) )
                    	    {
                    	    otherlv_47=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_47, grammarAccess.getRecipeAccess().getCommaKeyword_27_5_0());
                    	    				
                    	    // InternalMyDsl.g:762:5: ( (lv_ratings_48_0= ruleRating ) )
                    	    // InternalMyDsl.g:763:6: (lv_ratings_48_0= ruleRating )
                    	    {
                    	    // InternalMyDsl.g:763:6: (lv_ratings_48_0= ruleRating )
                    	    // InternalMyDsl.g:764:7: lv_ratings_48_0= ruleRating
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_27_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_ratings_48_0=ruleRating();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ratings",
                    	    								lv_ratings_48_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Rating");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_49=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_49, grammarAccess.getRecipeAccess().getRightSquareBracketKeyword_27_6());
                    			

                    }
                    break;

            }

            otherlv_50=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_50, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_28());
            		

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
    // InternalMyDsl.g:795:1: entryRuleKitchenUtensil returns [EObject current=null] : iv_ruleKitchenUtensil= ruleKitchenUtensil EOF ;
    public final EObject entryRuleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKitchenUtensil = null;


        try {
            // InternalMyDsl.g:795:55: (iv_ruleKitchenUtensil= ruleKitchenUtensil EOF )
            // InternalMyDsl.g:796:2: iv_ruleKitchenUtensil= ruleKitchenUtensil EOF
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
    // InternalMyDsl.g:802:1: ruleKitchenUtensil returns [EObject current=null] : ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) ) ;
    public final EObject ruleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:808:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) ) )
            // InternalMyDsl.g:809:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) )
            {
            // InternalMyDsl.g:809:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) )
            // InternalMyDsl.g:810:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) )
            {
            // InternalMyDsl.g:810:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) )
            // InternalMyDsl.g:811:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' )
            {
            // InternalMyDsl.g:811:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            case 31:
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
                    // InternalMyDsl.g:812:5: lv_name_0_1= RULE_STRING
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
                    // InternalMyDsl.g:827:5: lv_name_0_2= 'furnace'
                    {
                    lv_name_0_2=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:838:5: lv_name_0_3= 'stovetop'
                    {
                    lv_name_0_3=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:849:5: lv_name_0_4= 'rolling pin'
                    {
                    lv_name_0_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalMyDsl.g:865:1: entryRuleFoodCategory returns [EObject current=null] : iv_ruleFoodCategory= ruleFoodCategory EOF ;
    public final EObject entryRuleFoodCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodCategory = null;


        try {
            // InternalMyDsl.g:865:53: (iv_ruleFoodCategory= ruleFoodCategory EOF )
            // InternalMyDsl.g:866:2: iv_ruleFoodCategory= ruleFoodCategory EOF
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
    // InternalMyDsl.g:872:1: ruleFoodCategory returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFoodCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:878:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:879:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:879:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyDsl.g:880:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:880:3: (lv_name_0_0= RULE_STRING )
            // InternalMyDsl.g:881:4: lv_name_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleIngredient"
    // InternalMyDsl.g:900:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalMyDsl.g:900:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalMyDsl.g:901:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalMyDsl.g:907:1: ruleIngredient returns [EObject current=null] : ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) ) ;
    public final EObject ruleIngredient() throws RecognitionException {
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
            // InternalMyDsl.g:913:2: ( ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) ) )
            // InternalMyDsl.g:914:2: ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) )
            {
            // InternalMyDsl.g:914:2: ( (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' ) | ( (otherlv_17= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
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
                    // InternalMyDsl.g:915:3: (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' )
                    {
                    // InternalMyDsl.g:915:3: (otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}' )
                    // InternalMyDsl.g:916:4: otherlv_0= '{' otherlv_1= 'Name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Amount' otherlv_6= ':' ( (lv_amount_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'Unit' otherlv_10= ':' ( (lv_unit_11_0= ruleUnit ) ) otherlv_12= ',' otherlv_13= 'VeganismLevel' otherlv_14= ':' ( (lv_veganismLevel_15_0= ruleVeganismLevel ) ) otherlv_16= '}'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getIngredientAccess().getNameKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getColonKeyword_0_2());
                    			
                    // InternalMyDsl.g:928:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:929:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:929:5: (lv_name_3_0= RULE_STRING )
                    // InternalMyDsl.g:930:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getIngredientAccess().getNameSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getIngredientAccess().getCommaKeyword_0_4());
                    			
                    otherlv_5=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIngredientAccess().getAmountKeyword_0_5());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getIngredientAccess().getColonKeyword_0_6());
                    			
                    // InternalMyDsl.g:958:4: ( (lv_amount_7_0= RULE_INT ) )
                    // InternalMyDsl.g:959:5: (lv_amount_7_0= RULE_INT )
                    {
                    // InternalMyDsl.g:959:5: (lv_amount_7_0= RULE_INT )
                    // InternalMyDsl.g:960:6: lv_amount_7_0= RULE_INT
                    {
                    lv_amount_7_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_amount_7_0, grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getIngredientAccess().getCommaKeyword_0_8());
                    			
                    otherlv_9=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getIngredientAccess().getUnitKeyword_0_9());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getIngredientAccess().getColonKeyword_0_10());
                    			
                    // InternalMyDsl.g:988:4: ( (lv_unit_11_0= ruleUnit ) )
                    // InternalMyDsl.g:989:5: (lv_unit_11_0= ruleUnit )
                    {
                    // InternalMyDsl.g:989:5: (lv_unit_11_0= ruleUnit )
                    // InternalMyDsl.g:990:6: lv_unit_11_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_11_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_unit_11_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getIngredientAccess().getCommaKeyword_0_12());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getIngredientAccess().getVeganismLevelKeyword_0_13());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getIngredientAccess().getColonKeyword_0_14());
                    			
                    // InternalMyDsl.g:1019:4: ( (lv_veganismLevel_15_0= ruleVeganismLevel ) )
                    // InternalMyDsl.g:1020:5: (lv_veganismLevel_15_0= ruleVeganismLevel )
                    {
                    // InternalMyDsl.g:1020:5: (lv_veganismLevel_15_0= ruleVeganismLevel )
                    // InternalMyDsl.g:1021:6: lv_veganismLevel_15_0= ruleVeganismLevel
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_15_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_veganismLevel_15_0=ruleVeganismLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						set(
                    							current,
                    							"veganismLevel",
                    							lv_veganismLevel_15_0,
                    							"org.xtext.example.mydsl.MyDsl.VeganismLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_0_16());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1044:3: ( (otherlv_17= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1044:3: ( (otherlv_17= RULE_ID ) )
                    // InternalMyDsl.g:1045:4: (otherlv_17= RULE_ID )
                    {
                    // InternalMyDsl.g:1045:4: (otherlv_17= RULE_ID )
                    // InternalMyDsl.g:1046:5: otherlv_17= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIngredientRule());
                    					}
                    				
                    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_17, grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_1_0());
                    				

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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleVeganismLevel"
    // InternalMyDsl.g:1061:1: entryRuleVeganismLevel returns [String current=null] : iv_ruleVeganismLevel= ruleVeganismLevel EOF ;
    public final String entryRuleVeganismLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVeganismLevel = null;


        try {
            // InternalMyDsl.g:1061:53: (iv_ruleVeganismLevel= ruleVeganismLevel EOF )
            // InternalMyDsl.g:1062:2: iv_ruleVeganismLevel= ruleVeganismLevel EOF
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
    // InternalMyDsl.g:1068:1: ruleVeganismLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) ;
    public final AntlrDatatypeRuleToken ruleVeganismLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1074:2: ( (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) )
            // InternalMyDsl.g:1075:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            {
            // InternalMyDsl.g:1075:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
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
                    // InternalMyDsl.g:1076:3: kw= 'Vegan'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVeganKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1082:3: kw= 'Vegetaric'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1088:3: kw= 'Carnivorous'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalMyDsl.g:1097:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalMyDsl.g:1097:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalMyDsl.g:1098:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalMyDsl.g:1104:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1110:2: ( (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) )
            // InternalMyDsl.g:1111:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            {
            // InternalMyDsl.g:1111:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt14=1;
                }
                break;
            case 39:
                {
                alt14=2;
                }
                break;
            case 40:
                {
                alt14=3;
                }
                break;
            case 41:
                {
                alt14=4;
                }
                break;
            case 42:
                {
                alt14=5;
                }
                break;
            case 43:
                {
                alt14=6;
                }
                break;
            case 44:
                {
                alt14=7;
                }
                break;
            case 45:
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
                    // InternalMyDsl.g:1112:3: kw= 'ml'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMlKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1118:3: kw= 'l'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1124:3: kw= 'g'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getGKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1130:3: kw= 'kg'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getKgKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1136:3: kw= 'tsp'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTspKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1142:3: kw= 'mg'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMgKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1148:3: kw= 'tbsp'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTbspKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1154:3: kw= 'pcs'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003FC000000000L});

}