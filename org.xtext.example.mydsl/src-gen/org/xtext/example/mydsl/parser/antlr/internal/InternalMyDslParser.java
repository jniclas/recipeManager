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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_QSTRING", "RULE_INT", "RULE_INGEREDIENTSTRING", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'authors'", "'recipes'", "'von'", "','", "'min'", "'Kitchen Utensils'", "'Food Categories'", "'Ingredients'", "'Ratings'", "'easy'", "'medium'", "'hard'", "'--'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'"
    };
    public static final int RULE_NEWLINE=8;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_INGEREDIENTSTRING=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_QSTRING=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMyDsl.g:71:1: ruleRecipeManager returns [EObject current=null] : (otherlv_0= 'authors' ruleEOL ( (lv_authors_2_0= ruleAuthor ) ) ( (lv_authors_3_0= ruleAuthor ) )* (otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )* )? ) ;
    public final EObject ruleRecipeManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_authors_2_0 = null;

        EObject lv_authors_3_0 = null;

        EObject lv_recipes_6_0 = null;

        EObject lv_recipes_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'authors' ruleEOL ( (lv_authors_2_0= ruleAuthor ) ) ( (lv_authors_3_0= ruleAuthor ) )* (otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )* )? ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'authors' ruleEOL ( (lv_authors_2_0= ruleAuthor ) ) ( (lv_authors_3_0= ruleAuthor ) )* (otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )* )? )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'authors' ruleEOL ( (lv_authors_2_0= ruleAuthor ) ) ( (lv_authors_3_0= ruleAuthor ) )* (otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )* )? )
            // InternalMyDsl.g:79:3: otherlv_0= 'authors' ruleEOL ( (lv_authors_2_0= ruleAuthor ) ) ( (lv_authors_3_0= ruleAuthor ) )* (otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )* )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:90:3: ( (lv_authors_2_0= ruleAuthor ) )
            // InternalMyDsl.g:91:4: (lv_authors_2_0= ruleAuthor )
            {
            // InternalMyDsl.g:91:4: (lv_authors_2_0= ruleAuthor )
            // InternalMyDsl.g:92:5: lv_authors_2_0= ruleAuthor
            {

            					newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_authors_2_0=ruleAuthor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
            					}
            					add(
            						current,
            						"authors",
            						lv_authors_2_0,
            						"org.xtext.example.mydsl.MyDsl.Author");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:109:3: ( (lv_authors_3_0= ruleAuthor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:110:4: (lv_authors_3_0= ruleAuthor )
            	    {
            	    // InternalMyDsl.g:110:4: (lv_authors_3_0= ruleAuthor )
            	    // InternalMyDsl.g:111:5: lv_authors_3_0= ruleAuthor
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:128:3: (otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:129:4: otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )*
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRecipeManagerAccess().getRecipesKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_4);
                    ruleEOL();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:140:4: ( (lv_recipes_6_0= ruleRecipe ) )
                    // InternalMyDsl.g:141:5: (lv_recipes_6_0= ruleRecipe )
                    {
                    // InternalMyDsl.g:141:5: (lv_recipes_6_0= ruleRecipe )
                    // InternalMyDsl.g:142:6: lv_recipes_6_0= ruleRecipe
                    {

                    						newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_recipes_6_0=ruleRecipe();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
                    						}
                    						add(
                    							current,
                    							"recipes",
                    							lv_recipes_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Recipe");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:159:4: ( (lv_recipes_7_0= ruleRecipe ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:160:5: (lv_recipes_7_0= ruleRecipe )
                    	    {
                    	    // InternalMyDsl.g:160:5: (lv_recipes_7_0= ruleRecipe )
                    	    // InternalMyDsl.g:161:6: lv_recipes_7_0= ruleRecipe
                    	    {

                    	    						newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_recipes_7_0=ruleRecipe();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"recipes",
                    	    							lv_recipes_7_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Recipe");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRecipeManager"


    // $ANTLR start "entryRuleAuthor"
    // InternalMyDsl.g:183:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // InternalMyDsl.g:183:47: (iv_ruleAuthor= ruleAuthor EOF )
            // InternalMyDsl.g:184:2: iv_ruleAuthor= ruleAuthor EOF
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
    // InternalMyDsl.g:190:1: ruleAuthor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_QSTRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_Email_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:196:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_QSTRING ) ) ) )
            // InternalMyDsl.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_QSTRING ) ) )
            {
            // InternalMyDsl.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_QSTRING ) ) )
            // InternalMyDsl.g:198:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_QSTRING ) )
            {
            // InternalMyDsl.g:198:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:199:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:199:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:200:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalMyDsl.g:216:3: ( (lv_Email_1_0= RULE_QSTRING ) )
            // InternalMyDsl.g:217:4: (lv_Email_1_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:217:4: (lv_Email_1_0= RULE_QSTRING )
            // InternalMyDsl.g:218:5: lv_Email_1_0= RULE_QSTRING
            {
            lv_Email_1_0=(Token)match(input,RULE_QSTRING,FOLLOW_2); 

            					newLeafNode(lv_Email_1_0, grammarAccess.getAuthorAccess().getEmailQSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Email",
            						lv_Email_1_0,
            						"org.xtext.example.mydsl.MyDsl.QSTRING");
            				

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
    // InternalMyDsl.g:238:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalMyDsl.g:238:47: (iv_ruleRating= ruleRating EOF )
            // InternalMyDsl.g:239:2: iv_ruleRating= ruleRating EOF
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
    // InternalMyDsl.g:245:1: ruleRating returns [EObject current=null] : ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) ruleEOL ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token lv_stars_0_0=null;
        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:251:2: ( ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) ruleEOL ) )
            // InternalMyDsl.g:252:2: ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) ruleEOL )
            {
            // InternalMyDsl.g:252:2: ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) ruleEOL )
            // InternalMyDsl.g:253:3: ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'von' ( (otherlv_3= RULE_ID ) ) ruleEOL
            {
            // InternalMyDsl.g:253:3: ( (lv_stars_0_0= RULE_INT ) )
            // InternalMyDsl.g:254:4: (lv_stars_0_0= RULE_INT )
            {
            // InternalMyDsl.g:254:4: (lv_stars_0_0= RULE_INT )
            // InternalMyDsl.g:255:5: lv_stars_0_0= RULE_INT
            {
            lv_stars_0_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_stars_0_0, grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stars",
            						lv_stars_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:271:3: ( (lv_comment_1_0= RULE_QSTRING ) )
            // InternalMyDsl.g:272:4: (lv_comment_1_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:272:4: (lv_comment_1_0= RULE_QSTRING )
            // InternalMyDsl.g:273:5: lv_comment_1_0= RULE_QSTRING
            {
            lv_comment_1_0=(Token)match(input,RULE_QSTRING,FOLLOW_8); 

            					newLeafNode(lv_comment_1_0, grammarAccess.getRatingAccess().getCommentQSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_1_0,
            						"org.xtext.example.mydsl.MyDsl.QSTRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getVonKeyword_2());
            		
            // InternalMyDsl.g:293:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:294:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:294:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:295:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_3_0());
            				

            }


            }


            			newCompositeNode(grammarAccess.getRatingAccess().getEOLParserRuleCall_4());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // InternalMyDsl.g:317:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalMyDsl.g:317:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalMyDsl.g:318:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalMyDsl.g:324:1: ruleRecipe returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Ratings' ruleEOL ( (lv_ratings_25_0= ruleRating ) ) ( (lv_ratings_26_0= ruleRating ) )* ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_duration_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_vegan_4_0 = null;

        EObject lv_difficulty_9_0 = null;

        EObject lv_kitchenUtensils_13_0 = null;

        EObject lv_kitchenUtensils_14_0 = null;

        EObject lv_foodCategory_17_0 = null;

        EObject lv_foodCategory_18_0 = null;

        EObject lv_ingredient_21_0 = null;

        EObject lv_ingredient_22_0 = null;

        EObject lv_ratings_25_0 = null;

        EObject lv_ratings_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Ratings' ruleEOL ( (lv_ratings_25_0= ruleRating ) ) ( (lv_ratings_26_0= ruleRating ) )* ) )
            // InternalMyDsl.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Ratings' ruleEOL ( (lv_ratings_25_0= ruleRating ) ) ( (lv_ratings_26_0= ruleRating ) )* )
            {
            // InternalMyDsl.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Ratings' ruleEOL ( (lv_ratings_25_0= ruleRating ) ) ( (lv_ratings_26_0= ruleRating ) )* )
            // InternalMyDsl.g:332:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Ratings' ruleEOL ( (lv_ratings_25_0= ruleRating ) ) ( (lv_ratings_26_0= ruleRating ) )*
            {
            // InternalMyDsl.g:332:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:333:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:333:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:334:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getVonKeyword_1());
            		
            // InternalMyDsl.g:354:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:355:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:355:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:356:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:371:3: ( (lv_vegan_4_0= ruleVeganismLevel ) )
            // InternalMyDsl.g:372:4: (lv_vegan_4_0= ruleVeganismLevel )
            {
            // InternalMyDsl.g:372:4: (lv_vegan_4_0= ruleVeganismLevel )
            // InternalMyDsl.g:373:5: lv_vegan_4_0= ruleVeganismLevel
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_vegan_4_0=ruleVeganismLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"vegan",
            						lv_vegan_4_0,
            						"org.xtext.example.mydsl.MyDsl.VeganismLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:394:3: ( (lv_duration_6_0= RULE_INT ) )
            // InternalMyDsl.g:395:4: (lv_duration_6_0= RULE_INT )
            {
            // InternalMyDsl.g:395:4: (lv_duration_6_0= RULE_INT )
            // InternalMyDsl.g:396:5: lv_duration_6_0= RULE_INT
            {
            lv_duration_6_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_duration_6_0, grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getMinKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getCommaKeyword_8());
            		
            // InternalMyDsl.g:420:3: ( (lv_difficulty_9_0= ruleDifficultyLevel ) )
            // InternalMyDsl.g:421:4: (lv_difficulty_9_0= ruleDifficultyLevel )
            {
            // InternalMyDsl.g:421:4: (lv_difficulty_9_0= ruleDifficultyLevel )
            // InternalMyDsl.g:422:5: lv_difficulty_9_0= ruleDifficultyLevel
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getDifficultyDifficultyLevelParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_3);
            lv_difficulty_9_0=ruleDifficultyLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"difficulty",
            						lv_difficulty_9_0,
            						"org.xtext.example.mydsl.MyDsl.DifficultyLevel");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_10());
            		
            pushFollow(FOLLOW_14);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_12());
            		
            pushFollow(FOLLOW_7);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:457:3: ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) )
            // InternalMyDsl.g:458:4: (lv_kitchenUtensils_13_0= ruleKitchenUtensil )
            {
            // InternalMyDsl.g:458:4: (lv_kitchenUtensils_13_0= ruleKitchenUtensil )
            // InternalMyDsl.g:459:5: lv_kitchenUtensils_13_0= ruleKitchenUtensil
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_15);
            lv_kitchenUtensils_13_0=ruleKitchenUtensil();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"kitchenUtensils",
            						lv_kitchenUtensils_13_0,
            						"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:476:3: ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_QSTRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:477:4: (lv_kitchenUtensils_14_0= ruleKitchenUtensil )
            	    {
            	    // InternalMyDsl.g:477:4: (lv_kitchenUtensils_14_0= ruleKitchenUtensil )
            	    // InternalMyDsl.g:478:5: lv_kitchenUtensils_14_0= ruleKitchenUtensil
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_kitchenUtensils_14_0=ruleKitchenUtensil();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"kitchenUtensils",
            	    						lv_kitchenUtensils_14_0,
            	    						"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_15());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_16());
            		
            pushFollow(FOLLOW_7);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:506:3: ( (lv_foodCategory_17_0= ruleFoodCategory ) )
            // InternalMyDsl.g:507:4: (lv_foodCategory_17_0= ruleFoodCategory )
            {
            // InternalMyDsl.g:507:4: (lv_foodCategory_17_0= ruleFoodCategory )
            // InternalMyDsl.g:508:5: lv_foodCategory_17_0= ruleFoodCategory
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_16);
            lv_foodCategory_17_0=ruleFoodCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"foodCategory",
            						lv_foodCategory_17_0,
            						"org.xtext.example.mydsl.MyDsl.FoodCategory");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:525:3: ( (lv_foodCategory_18_0= ruleFoodCategory ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_QSTRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:526:4: (lv_foodCategory_18_0= ruleFoodCategory )
            	    {
            	    // InternalMyDsl.g:526:4: (lv_foodCategory_18_0= ruleFoodCategory )
            	    // InternalMyDsl.g:527:5: lv_foodCategory_18_0= ruleFoodCategory
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_foodCategory_18_0=ruleFoodCategory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foodCategory",
            	    						lv_foodCategory_18_0,
            	    						"org.xtext.example.mydsl.MyDsl.FoodCategory");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_19=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getRecipeAccess().getIngredientsKeyword_19());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_20());
            		
            pushFollow(FOLLOW_17);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:555:3: ( (lv_ingredient_21_0= ruleIngredient ) )
            // InternalMyDsl.g:556:4: (lv_ingredient_21_0= ruleIngredient )
            {
            // InternalMyDsl.g:556:4: (lv_ingredient_21_0= ruleIngredient )
            // InternalMyDsl.g:557:5: lv_ingredient_21_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_18);
            lv_ingredient_21_0=ruleIngredient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"ingredient",
            						lv_ingredient_21_0,
            						"org.xtext.example.mydsl.MyDsl.Ingredient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:574:3: ( (lv_ingredient_22_0= ruleIngredient ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INGEREDIENTSTRING||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:575:4: (lv_ingredient_22_0= ruleIngredient )
            	    {
            	    // InternalMyDsl.g:575:4: (lv_ingredient_22_0= ruleIngredient )
            	    // InternalMyDsl.g:576:5: lv_ingredient_22_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_22_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_ingredient_22_0=ruleIngredient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredient",
            	    						lv_ingredient_22_0,
            	    						"org.xtext.example.mydsl.MyDsl.Ingredient");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_23=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getRecipeAccess().getRatingsKeyword_23());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24());
            		
            pushFollow(FOLLOW_11);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:604:3: ( (lv_ratings_25_0= ruleRating ) )
            // InternalMyDsl.g:605:4: (lv_ratings_25_0= ruleRating )
            {
            // InternalMyDsl.g:605:4: (lv_ratings_25_0= ruleRating )
            // InternalMyDsl.g:606:5: lv_ratings_25_0= ruleRating
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_19);
            lv_ratings_25_0=ruleRating();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"ratings",
            						lv_ratings_25_0,
            						"org.xtext.example.mydsl.MyDsl.Rating");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:623:3: ( (lv_ratings_26_0= ruleRating ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:624:4: (lv_ratings_26_0= ruleRating )
            	    {
            	    // InternalMyDsl.g:624:4: (lv_ratings_26_0= ruleRating )
            	    // InternalMyDsl.g:625:5: lv_ratings_26_0= ruleRating
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_26_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_ratings_26_0=ruleRating();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ratings",
            	    						lv_ratings_26_0,
            	    						"org.xtext.example.mydsl.MyDsl.Rating");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // InternalMyDsl.g:646:1: entryRuleKitchenUtensil returns [EObject current=null] : iv_ruleKitchenUtensil= ruleKitchenUtensil EOF ;
    public final EObject entryRuleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKitchenUtensil = null;


        try {
            // InternalMyDsl.g:646:55: (iv_ruleKitchenUtensil= ruleKitchenUtensil EOF )
            // InternalMyDsl.g:647:2: iv_ruleKitchenUtensil= ruleKitchenUtensil EOF
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
    // InternalMyDsl.g:653:1: ruleKitchenUtensil returns [EObject current=null] : ( (lv_name_0_0= RULE_QSTRING ) ) ;
    public final EObject ruleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:659:2: ( ( (lv_name_0_0= RULE_QSTRING ) ) )
            // InternalMyDsl.g:660:2: ( (lv_name_0_0= RULE_QSTRING ) )
            {
            // InternalMyDsl.g:660:2: ( (lv_name_0_0= RULE_QSTRING ) )
            // InternalMyDsl.g:661:3: (lv_name_0_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:661:3: (lv_name_0_0= RULE_QSTRING )
            // InternalMyDsl.g:662:4: lv_name_0_0= RULE_QSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_QSTRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getKitchenUtensilAccess().getNameQSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getKitchenUtensilRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.QSTRING");
            			

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


    // $ANTLR start "entryRuleDifficultyLevel"
    // InternalMyDsl.g:681:1: entryRuleDifficultyLevel returns [EObject current=null] : iv_ruleDifficultyLevel= ruleDifficultyLevel EOF ;
    public final EObject entryRuleDifficultyLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifficultyLevel = null;


        try {
            // InternalMyDsl.g:681:56: (iv_ruleDifficultyLevel= ruleDifficultyLevel EOF )
            // InternalMyDsl.g:682:2: iv_ruleDifficultyLevel= ruleDifficultyLevel EOF
            {
             newCompositeNode(grammarAccess.getDifficultyLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDifficultyLevel=ruleDifficultyLevel();

            state._fsp--;

             current =iv_ruleDifficultyLevel; 
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
    // $ANTLR end "entryRuleDifficultyLevel"


    // $ANTLR start "ruleDifficultyLevel"
    // InternalMyDsl.g:688:1: ruleDifficultyLevel returns [EObject current=null] : ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) ) ;
    public final EObject ruleDifficultyLevel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:694:2: ( ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) ) )
            // InternalMyDsl.g:695:2: ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) )
            {
            // InternalMyDsl.g:695:2: ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) )
            // InternalMyDsl.g:696:3: ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) )
            {
            // InternalMyDsl.g:696:3: ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) )
            // InternalMyDsl.g:697:4: (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' )
            {
            // InternalMyDsl.g:697:4: (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:698:5: lv_name_0_1= 'easy'
                    {
                    lv_name_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDifficultyLevelRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:5: lv_name_0_2= 'medium'
                    {
                    lv_name_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDifficultyLevelRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:720:5: lv_name_0_3= 'hard'
                    {
                    lv_name_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getDifficultyLevelAccess().getNameHardKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDifficultyLevelRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

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
    // $ANTLR end "ruleDifficultyLevel"


    // $ANTLR start "entryRuleFoodCategory"
    // InternalMyDsl.g:736:1: entryRuleFoodCategory returns [EObject current=null] : iv_ruleFoodCategory= ruleFoodCategory EOF ;
    public final EObject entryRuleFoodCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodCategory = null;


        try {
            // InternalMyDsl.g:736:53: (iv_ruleFoodCategory= ruleFoodCategory EOF )
            // InternalMyDsl.g:737:2: iv_ruleFoodCategory= ruleFoodCategory EOF
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
    // InternalMyDsl.g:743:1: ruleFoodCategory returns [EObject current=null] : ( (lv_name_0_0= RULE_QSTRING ) ) ;
    public final EObject ruleFoodCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:749:2: ( ( (lv_name_0_0= RULE_QSTRING ) ) )
            // InternalMyDsl.g:750:2: ( (lv_name_0_0= RULE_QSTRING ) )
            {
            // InternalMyDsl.g:750:2: ( (lv_name_0_0= RULE_QSTRING ) )
            // InternalMyDsl.g:751:3: (lv_name_0_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:751:3: (lv_name_0_0= RULE_QSTRING )
            // InternalMyDsl.g:752:4: lv_name_0_0= RULE_QSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_QSTRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFoodCategoryAccess().getNameQSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFoodCategoryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.QSTRING");
            			

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
    // InternalMyDsl.g:771:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalMyDsl.g:771:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalMyDsl.g:772:2: iv_ruleIngredient= ruleIngredient EOF
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
    // InternalMyDsl.g:778:1: ruleIngredient returns [EObject current=null] : ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_amount_3_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_unit_4_0 = null;

        AntlrDatatypeRuleToken lv_veganismLevel_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:784:2: ( ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL ) )
            // InternalMyDsl.g:785:2: ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL )
            {
            // InternalMyDsl.g:785:2: ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL )
            // InternalMyDsl.g:786:3: ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL
            {
            // InternalMyDsl.g:786:3: ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INGEREDIENTSTRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:787:4: (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:787:4: (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) )
                    // InternalMyDsl.g:788:5: otherlv_0= '--' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getHyphenMinusHyphenMinusKeyword_0_0_0());
                    				
                    // InternalMyDsl.g:792:5: ( (otherlv_1= RULE_ID ) )
                    // InternalMyDsl.g:793:6: (otherlv_1= RULE_ID )
                    {
                    // InternalMyDsl.g:793:6: (otherlv_1= RULE_ID )
                    // InternalMyDsl.g:794:7: otherlv_1= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIngredientRule());
                    							}
                    						
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

                    							newLeafNode(otherlv_1, grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_0_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:807:4: ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) )
                    {
                    // InternalMyDsl.g:807:4: ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) )
                    // InternalMyDsl.g:808:5: ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) )
                    {
                    // InternalMyDsl.g:808:5: ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) )
                    // InternalMyDsl.g:809:6: (lv_name_2_0= RULE_INGEREDIENTSTRING )
                    {
                    // InternalMyDsl.g:809:6: (lv_name_2_0= RULE_INGEREDIENTSTRING )
                    // InternalMyDsl.g:810:7: lv_name_2_0= RULE_INGEREDIENTSTRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_INGEREDIENTSTRING,FOLLOW_11); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getIngredientAccess().getNameINGEREDIENTSTRINGTerminalRuleCall_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIngredientRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.xtext.example.mydsl.MyDsl.INGEREDIENTSTRING");
                    						

                    }


                    }

                    // InternalMyDsl.g:826:5: ( (lv_amount_3_0= RULE_INT ) )
                    // InternalMyDsl.g:827:6: (lv_amount_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:827:6: (lv_amount_3_0= RULE_INT )
                    // InternalMyDsl.g:828:7: lv_amount_3_0= RULE_INT
                    {
                    lv_amount_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    							newLeafNode(lv_amount_3_0, grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIngredientRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"amount",
                    								lv_amount_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalMyDsl.g:844:5: ( (lv_unit_4_0= ruleUnit ) )
                    // InternalMyDsl.g:845:6: (lv_unit_4_0= ruleUnit )
                    {
                    // InternalMyDsl.g:845:6: (lv_unit_4_0= ruleUnit )
                    // InternalMyDsl.g:846:7: lv_unit_4_0= ruleUnit
                    {

                    							newCompositeNode(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_unit_4_0=ruleUnit();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIngredientRule());
                    							}
                    							set(
                    								current,
                    								"unit",
                    								lv_unit_4_0,
                    								"org.xtext.example.mydsl.MyDsl.Unit");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getIngredientAccess().getCommaKeyword_0_1_3());
                    				
                    // InternalMyDsl.g:867:5: ( (lv_veganismLevel_6_0= ruleVeganismLevel ) )
                    // InternalMyDsl.g:868:6: (lv_veganismLevel_6_0= ruleVeganismLevel )
                    {
                    // InternalMyDsl.g:868:6: (lv_veganismLevel_6_0= ruleVeganismLevel )
                    // InternalMyDsl.g:869:7: lv_veganismLevel_6_0= ruleVeganismLevel
                    {

                    							newCompositeNode(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_1_4_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_veganismLevel_6_0=ruleVeganismLevel();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIngredientRule());
                    							}
                    							set(
                    								current,
                    								"veganismLevel",
                    								lv_veganismLevel_6_0,
                    								"org.xtext.example.mydsl.MyDsl.VeganismLevel");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getIngredientAccess().getEOLParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // InternalMyDsl.g:899:1: entryRuleVeganismLevel returns [String current=null] : iv_ruleVeganismLevel= ruleVeganismLevel EOF ;
    public final String entryRuleVeganismLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVeganismLevel = null;


        try {
            // InternalMyDsl.g:899:53: (iv_ruleVeganismLevel= ruleVeganismLevel EOF )
            // InternalMyDsl.g:900:2: iv_ruleVeganismLevel= ruleVeganismLevel EOF
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
    // InternalMyDsl.g:906:1: ruleVeganismLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) ;
    public final AntlrDatatypeRuleToken ruleVeganismLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:912:2: ( (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) )
            // InternalMyDsl.g:913:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            {
            // InternalMyDsl.g:913:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:914:3: kw= 'Vegan'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVeganKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:920:3: kw= 'Vegetaric'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:926:3: kw= 'Carnivorous'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMyDsl.g:935:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalMyDsl.g:935:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalMyDsl.g:936:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalMyDsl.g:942:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:948:2: ( (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) )
            // InternalMyDsl.g:949:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            {
            // InternalMyDsl.g:949:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            case 35:
                {
                alt11=6;
                }
                break;
            case 36:
                {
                alt11=7;
                }
                break;
            case 37:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:950:3: kw= 'ml'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMlKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:956:3: kw= 'l'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:962:3: kw= 'g'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getGKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:968:3: kw= 'kg'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getKgKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:974:3: kw= 'tsp'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTspKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:980:3: kw= 'mg'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMgKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:986:3: kw= 'tbsp'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTbspKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:992:3: kw= 'pcs'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEOL"
    // InternalMyDsl.g:1001:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalMyDsl.g:1001:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalMyDsl.g:1002:2: iv_ruleEOL= ruleEOL EOF
            {
             newCompositeNode(grammarAccess.getEOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOL=ruleEOL();

            state._fsp--;

             current =iv_ruleEOL.getText(); 
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
    // $ANTLR end "entryRuleEOL"


    // $ANTLR start "ruleEOL"
    // InternalMyDsl.g:1008:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NEWLINE_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1014:2: ( (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalMyDsl.g:1015:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalMyDsl.g:1015:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_SL_COMMENT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1016:3: this_NEWLINE_0= RULE_NEWLINE
                    {
                    this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    			current.merge(this_NEWLINE_0);
                    		

                    			newLeafNode(this_NEWLINE_0, grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1024:3: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    			current.merge(this_SL_COMMENT_1);
                    		

                    			newLeafNode(this_SL_COMMENT_1, grammarAccess.getEOLAccess().getSL_COMMENTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEOL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004400080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003FC0000000L});

}