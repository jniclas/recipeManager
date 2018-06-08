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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'authors'", "'recipes'", "','", "'von'", "'min'", "'Kitchen Utensils'", "'Food Categories'", "'Ingredients'", "'- '", "'Ratings'", "'furnace'", "'stovetop'", "'rolling pin'", "'easy'", "'medium'", "'hard'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'"
    };
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
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
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

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

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:129:4: otherlv_4= 'recipes' ruleEOL ( (lv_recipes_6_0= ruleRecipe ) ) ( (lv_recipes_7_0= ruleRecipe ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

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
    // InternalMyDsl.g:190:1: ruleAuthor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_STRING ) ) ruleEOL ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_Email_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:196:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_STRING ) ) ruleEOL ) )
            // InternalMyDsl.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_STRING ) ) ruleEOL )
            {
            // InternalMyDsl.g:197:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_STRING ) ) ruleEOL )
            // InternalMyDsl.g:198:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_Email_1_0= RULE_STRING ) ) ruleEOL
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

            // InternalMyDsl.g:216:3: ( (lv_Email_1_0= RULE_STRING ) )
            // InternalMyDsl.g:217:4: (lv_Email_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:217:4: (lv_Email_1_0= RULE_STRING )
            // InternalMyDsl.g:218:5: lv_Email_1_0= RULE_STRING
            {
            lv_Email_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_Email_1_0, grammarAccess.getAuthorAccess().getEmailSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Email",
            						lv_Email_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            			newCompositeNode(grammarAccess.getAuthorAccess().getEOLParserRuleCall_2());
            		
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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:245:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalMyDsl.g:245:47: (iv_ruleRating= ruleRating EOF )
            // InternalMyDsl.g:246:2: iv_ruleRating= ruleRating EOF
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
    // InternalMyDsl.g:252:1: ruleRating returns [EObject current=null] : ( ( (lv_stars_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= 'von' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token lv_stars_0_0=null;
        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:258:2: ( ( ( (lv_stars_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= 'von' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMyDsl.g:259:2: ( ( (lv_stars_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= 'von' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMyDsl.g:259:2: ( ( (lv_stars_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= 'von' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDsl.g:260:3: ( (lv_stars_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_comment_2_0= RULE_STRING ) ) otherlv_3= 'von' ( (otherlv_4= RULE_ID ) )
            {
            // InternalMyDsl.g:260:3: ( (lv_stars_0_0= RULE_INT ) )
            // InternalMyDsl.g:261:4: (lv_stars_0_0= RULE_INT )
            {
            // InternalMyDsl.g:261:4: (lv_stars_0_0= RULE_INT )
            // InternalMyDsl.g:262:5: lv_stars_0_0= RULE_INT
            {
            lv_stars_0_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRatingAccess().getCommaKeyword_1());
            		
            // InternalMyDsl.g:282:3: ( (lv_comment_2_0= RULE_STRING ) )
            // InternalMyDsl.g:283:4: (lv_comment_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:283:4: (lv_comment_2_0= RULE_STRING )
            // InternalMyDsl.g:284:5: lv_comment_2_0= RULE_STRING
            {
            lv_comment_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getRatingAccess().getCommentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getVonKeyword_3());
            		
            // InternalMyDsl.g:304:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:305:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:305:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:306:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRatingRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_4_0());
            				

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
    // $ANTLR end "ruleRating"


    // $ANTLR start "entryRuleRecipe"
    // InternalMyDsl.g:321:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalMyDsl.g:321:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalMyDsl.g:322:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalMyDsl.g:328:1: ruleRecipe returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ruleEOL ( ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL )* otherlv_17= 'Food Categories' ruleEOL ( (lv_foodCategory_19_0= ruleFoodCategory ) ) ruleEOL ( ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL )* otherlv_23= 'Ingredients' ruleEOL otherlv_25= '- ' ( (lv_ingredient_26_0= ruleIngredient ) ) ruleEOL (otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL )* otherlv_31= 'Ratings' ruleEOL ( (lv_ratings_33_0= ruleRating ) ) ruleEOL ( ( (lv_ratings_35_0= ruleRating ) ) ruleEOL )* ) ;
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
        Token otherlv_17=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_vegan_4_0 = null;

        EObject lv_difficulty_9_0 = null;

        EObject lv_kitchenUtensils_13_0 = null;

        EObject lv_kitchenUtensils_15_0 = null;

        EObject lv_foodCategory_19_0 = null;

        EObject lv_foodCategory_21_0 = null;

        EObject lv_ingredient_26_0 = null;

        EObject lv_ingredient_29_0 = null;

        EObject lv_ratings_33_0 = null;

        EObject lv_ratings_35_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ruleEOL ( ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL )* otherlv_17= 'Food Categories' ruleEOL ( (lv_foodCategory_19_0= ruleFoodCategory ) ) ruleEOL ( ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL )* otherlv_23= 'Ingredients' ruleEOL otherlv_25= '- ' ( (lv_ingredient_26_0= ruleIngredient ) ) ruleEOL (otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL )* otherlv_31= 'Ratings' ruleEOL ( (lv_ratings_33_0= ruleRating ) ) ruleEOL ( ( (lv_ratings_35_0= ruleRating ) ) ruleEOL )* ) )
            // InternalMyDsl.g:335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ruleEOL ( ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL )* otherlv_17= 'Food Categories' ruleEOL ( (lv_foodCategory_19_0= ruleFoodCategory ) ) ruleEOL ( ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL )* otherlv_23= 'Ingredients' ruleEOL otherlv_25= '- ' ( (lv_ingredient_26_0= ruleIngredient ) ) ruleEOL (otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL )* otherlv_31= 'Ratings' ruleEOL ( (lv_ratings_33_0= ruleRating ) ) ruleEOL ( ( (lv_ratings_35_0= ruleRating ) ) ruleEOL )* )
            {
            // InternalMyDsl.g:335:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ruleEOL ( ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL )* otherlv_17= 'Food Categories' ruleEOL ( (lv_foodCategory_19_0= ruleFoodCategory ) ) ruleEOL ( ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL )* otherlv_23= 'Ingredients' ruleEOL otherlv_25= '- ' ( (lv_ingredient_26_0= ruleIngredient ) ) ruleEOL (otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL )* otherlv_31= 'Ratings' ruleEOL ( (lv_ratings_33_0= ruleRating ) ) ruleEOL ( ( (lv_ratings_35_0= ruleRating ) ) ruleEOL )* )
            // InternalMyDsl.g:336:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'von' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ruleEOL ( ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL )* otherlv_17= 'Food Categories' ruleEOL ( (lv_foodCategory_19_0= ruleFoodCategory ) ) ruleEOL ( ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL )* otherlv_23= 'Ingredients' ruleEOL otherlv_25= '- ' ( (lv_ingredient_26_0= ruleIngredient ) ) ruleEOL (otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL )* otherlv_31= 'Ratings' ruleEOL ( (lv_ratings_33_0= ruleRating ) ) ruleEOL ( ( (lv_ratings_35_0= ruleRating ) ) ruleEOL )*
            {
            // InternalMyDsl.g:336:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:337:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:337:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:338:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getVonKeyword_1());
            		
            // InternalMyDsl.g:358:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:359:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:359:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:360:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:375:3: ( (lv_vegan_4_0= ruleVeganismLevel ) )
            // InternalMyDsl.g:376:4: (lv_vegan_4_0= ruleVeganismLevel )
            {
            // InternalMyDsl.g:376:4: (lv_vegan_4_0= ruleVeganismLevel )
            // InternalMyDsl.g:377:5: lv_vegan_4_0= ruleVeganismLevel
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_5=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:398:3: ( (lv_duration_6_0= RULE_INT ) )
            // InternalMyDsl.g:399:4: (lv_duration_6_0= RULE_INT )
            {
            // InternalMyDsl.g:399:4: (lv_duration_6_0= RULE_INT )
            // InternalMyDsl.g:400:5: lv_duration_6_0= RULE_INT
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

            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getMinKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getCommaKeyword_8());
            		
            // InternalMyDsl.g:424:3: ( (lv_difficulty_9_0= ruleDifficultyLevel ) )
            // InternalMyDsl.g:425:4: (lv_difficulty_9_0= ruleDifficultyLevel )
            {
            // InternalMyDsl.g:425:4: (lv_difficulty_9_0= ruleDifficultyLevel )
            // InternalMyDsl.g:426:5: lv_difficulty_9_0= ruleDifficultyLevel
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
            		
            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_12());
            		
            pushFollow(FOLLOW_15);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:461:3: ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) )
            // InternalMyDsl.g:462:4: (lv_kitchenUtensils_13_0= ruleKitchenUtensil )
            {
            // InternalMyDsl.g:462:4: (lv_kitchenUtensils_13_0= ruleKitchenUtensil )
            // InternalMyDsl.g:463:5: lv_kitchenUtensils_13_0= ruleKitchenUtensil
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_3);
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


            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_14());
            		
            pushFollow(FOLLOW_16);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:487:3: ( ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING||(LA4_0>=22 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:488:4: ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) ) ruleEOL
            	    {
            	    // InternalMyDsl.g:488:4: ( (lv_kitchenUtensils_15_0= ruleKitchenUtensil ) )
            	    // InternalMyDsl.g:489:5: (lv_kitchenUtensils_15_0= ruleKitchenUtensil )
            	    {
            	    // InternalMyDsl.g:489:5: (lv_kitchenUtensils_15_0= ruleKitchenUtensil )
            	    // InternalMyDsl.g:490:6: lv_kitchenUtensils_15_0= ruleKitchenUtensil
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_15_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_kitchenUtensils_15_0=ruleKitchenUtensil();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"kitchenUtensils",
            	    							lv_kitchenUtensils_15_0,
            	    							"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_15_1());
            	    			
            	    pushFollow(FOLLOW_16);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_16());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_17());
            		
            pushFollow(FOLLOW_7);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:526:3: ( (lv_foodCategory_19_0= ruleFoodCategory ) )
            // InternalMyDsl.g:527:4: (lv_foodCategory_19_0= ruleFoodCategory )
            {
            // InternalMyDsl.g:527:4: (lv_foodCategory_19_0= ruleFoodCategory )
            // InternalMyDsl.g:528:5: lv_foodCategory_19_0= ruleFoodCategory
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_3);
            lv_foodCategory_19_0=ruleFoodCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"foodCategory",
            						lv_foodCategory_19_0,
            						"org.xtext.example.mydsl.MyDsl.FoodCategory");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_19());
            		
            pushFollow(FOLLOW_17);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:552:3: ( ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:553:4: ( (lv_foodCategory_21_0= ruleFoodCategory ) ) ruleEOL
            	    {
            	    // InternalMyDsl.g:553:4: ( (lv_foodCategory_21_0= ruleFoodCategory ) )
            	    // InternalMyDsl.g:554:5: (lv_foodCategory_21_0= ruleFoodCategory )
            	    {
            	    // InternalMyDsl.g:554:5: (lv_foodCategory_21_0= ruleFoodCategory )
            	    // InternalMyDsl.g:555:6: lv_foodCategory_21_0= ruleFoodCategory
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_20_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_foodCategory_21_0=ruleFoodCategory();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"foodCategory",
            	    							lv_foodCategory_21_0,
            	    							"org.xtext.example.mydsl.MyDsl.FoodCategory");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_20_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_23=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getRecipeAccess().getIngredientsKeyword_21());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_22());
            		
            pushFollow(FOLLOW_18);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_25=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_25, grammarAccess.getRecipeAccess().getHyphenMinusSpaceKeyword_23());
            		
            // InternalMyDsl.g:595:3: ( (lv_ingredient_26_0= ruleIngredient ) )
            // InternalMyDsl.g:596:4: (lv_ingredient_26_0= ruleIngredient )
            {
            // InternalMyDsl.g:596:4: (lv_ingredient_26_0= ruleIngredient )
            // InternalMyDsl.g:597:5: lv_ingredient_26_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_3);
            lv_ingredient_26_0=ruleIngredient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"ingredient",
            						lv_ingredient_26_0,
            						"org.xtext.example.mydsl.MyDsl.Ingredient");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_25());
            		
            pushFollow(FOLLOW_20);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:621:3: (otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:622:4: otherlv_28= '- ' ( (lv_ingredient_29_0= ruleIngredient ) ) ruleEOL
            	    {
            	    otherlv_28=(Token)match(input,20,FOLLOW_19); 

            	    				newLeafNode(otherlv_28, grammarAccess.getRecipeAccess().getHyphenMinusSpaceKeyword_26_0());
            	    			
            	    // InternalMyDsl.g:626:4: ( (lv_ingredient_29_0= ruleIngredient ) )
            	    // InternalMyDsl.g:627:5: (lv_ingredient_29_0= ruleIngredient )
            	    {
            	    // InternalMyDsl.g:627:5: (lv_ingredient_29_0= ruleIngredient )
            	    // InternalMyDsl.g:628:6: lv_ingredient_29_0= ruleIngredient
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_26_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_ingredient_29_0=ruleIngredient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ingredient",
            	    							lv_ingredient_29_0,
            	    							"org.xtext.example.mydsl.MyDsl.Ingredient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_26_2());
            	    			
            	    pushFollow(FOLLOW_20);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_31=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_31, grammarAccess.getRecipeAccess().getRatingsKeyword_27());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_28());
            		
            pushFollow(FOLLOW_11);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:664:3: ( (lv_ratings_33_0= ruleRating ) )
            // InternalMyDsl.g:665:4: (lv_ratings_33_0= ruleRating )
            {
            // InternalMyDsl.g:665:4: (lv_ratings_33_0= ruleRating )
            // InternalMyDsl.g:666:5: lv_ratings_33_0= ruleRating
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_3);
            lv_ratings_33_0=ruleRating();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					add(
            						current,
            						"ratings",
            						lv_ratings_33_0,
            						"org.xtext.example.mydsl.MyDsl.Rating");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_30());
            		
            pushFollow(FOLLOW_21);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:690:3: ( ( (lv_ratings_35_0= ruleRating ) ) ruleEOL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:691:4: ( (lv_ratings_35_0= ruleRating ) ) ruleEOL
            	    {
            	    // InternalMyDsl.g:691:4: ( (lv_ratings_35_0= ruleRating ) )
            	    // InternalMyDsl.g:692:5: (lv_ratings_35_0= ruleRating )
            	    {
            	    // InternalMyDsl.g:692:5: (lv_ratings_35_0= ruleRating )
            	    // InternalMyDsl.g:693:6: lv_ratings_35_0= ruleRating
            	    {

            	    						newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_31_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_ratings_35_0=ruleRating();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecipeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ratings",
            	    							lv_ratings_35_0,
            	    							"org.xtext.example.mydsl.MyDsl.Rating");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_31_1());
            	    			
            	    pushFollow(FOLLOW_21);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

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
    // InternalMyDsl.g:722:1: entryRuleKitchenUtensil returns [EObject current=null] : iv_ruleKitchenUtensil= ruleKitchenUtensil EOF ;
    public final EObject entryRuleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKitchenUtensil = null;


        try {
            // InternalMyDsl.g:722:55: (iv_ruleKitchenUtensil= ruleKitchenUtensil EOF )
            // InternalMyDsl.g:723:2: iv_ruleKitchenUtensil= ruleKitchenUtensil EOF
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
    // InternalMyDsl.g:729:1: ruleKitchenUtensil returns [EObject current=null] : ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) ) ;
    public final EObject ruleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:735:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) ) )
            // InternalMyDsl.g:736:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) )
            {
            // InternalMyDsl.g:736:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) ) )
            // InternalMyDsl.g:737:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) )
            {
            // InternalMyDsl.g:737:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' ) )
            // InternalMyDsl.g:738:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' )
            {
            // InternalMyDsl.g:738:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= 'furnace' | lv_name_0_3= 'stovetop' | lv_name_0_4= 'rolling pin' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:739:5: lv_name_0_1= RULE_STRING
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
                    // InternalMyDsl.g:754:5: lv_name_0_2= 'furnace'
                    {
                    lv_name_0_2=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getKitchenUtensilAccess().getNameFurnaceKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:765:5: lv_name_0_3= 'stovetop'
                    {
                    lv_name_0_3=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getKitchenUtensilAccess().getNameStovetopKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKitchenUtensilRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:776:5: lv_name_0_4= 'rolling pin'
                    {
                    lv_name_0_4=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDifficultyLevel"
    // InternalMyDsl.g:792:1: entryRuleDifficultyLevel returns [EObject current=null] : iv_ruleDifficultyLevel= ruleDifficultyLevel EOF ;
    public final EObject entryRuleDifficultyLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifficultyLevel = null;


        try {
            // InternalMyDsl.g:792:56: (iv_ruleDifficultyLevel= ruleDifficultyLevel EOF )
            // InternalMyDsl.g:793:2: iv_ruleDifficultyLevel= ruleDifficultyLevel EOF
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
    // InternalMyDsl.g:799:1: ruleDifficultyLevel returns [EObject current=null] : ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) ) ;
    public final EObject ruleDifficultyLevel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:805:2: ( ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) ) )
            // InternalMyDsl.g:806:2: ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) )
            {
            // InternalMyDsl.g:806:2: ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) )
            // InternalMyDsl.g:807:3: ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) )
            {
            // InternalMyDsl.g:807:3: ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) )
            // InternalMyDsl.g:808:4: (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' )
            {
            // InternalMyDsl.g:808:4: (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' )
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
                    // InternalMyDsl.g:809:5: lv_name_0_1= 'easy'
                    {
                    lv_name_0_1=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDifficultyLevelRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:820:5: lv_name_0_2= 'medium'
                    {
                    lv_name_0_2=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDifficultyLevelRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:831:5: lv_name_0_3= 'hard'
                    {
                    lv_name_0_3=(Token)match(input,27,FOLLOW_2); 

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
    // InternalMyDsl.g:847:1: entryRuleFoodCategory returns [EObject current=null] : iv_ruleFoodCategory= ruleFoodCategory EOF ;
    public final EObject entryRuleFoodCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodCategory = null;


        try {
            // InternalMyDsl.g:847:53: (iv_ruleFoodCategory= ruleFoodCategory EOF )
            // InternalMyDsl.g:848:2: iv_ruleFoodCategory= ruleFoodCategory EOF
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
    // InternalMyDsl.g:854:1: ruleFoodCategory returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleFoodCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:860:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:861:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:861:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyDsl.g:862:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:862:3: (lv_name_0_0= RULE_STRING )
            // InternalMyDsl.g:863:4: lv_name_0_0= RULE_STRING
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
    // InternalMyDsl.g:882:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalMyDsl.g:882:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalMyDsl.g:883:2: iv_ruleIngredient= ruleIngredient EOF
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
    // InternalMyDsl.g:889:1: ruleIngredient returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) ) ) | ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_amount_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_unit_2_0 = null;

        AntlrDatatypeRuleToken lv_veganismLevel_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:895:2: ( ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) ) ) | ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:896:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) ) ) | ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:896:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:897:3: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) ) )
                    {
                    // InternalMyDsl.g:897:3: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) ) )
                    // InternalMyDsl.g:898:4: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_amount_1_0= RULE_INT ) ) ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ',' ( (lv_veganismLevel_4_0= ruleVeganismLevel ) )
                    {
                    // InternalMyDsl.g:898:4: ( (lv_name_0_0= RULE_STRING ) )
                    // InternalMyDsl.g:899:5: (lv_name_0_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:899:5: (lv_name_0_0= RULE_STRING )
                    // InternalMyDsl.g:900:6: lv_name_0_0= RULE_STRING
                    {
                    lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getIngredientAccess().getNameSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDsl.g:916:4: ( (lv_amount_1_0= RULE_INT ) )
                    // InternalMyDsl.g:917:5: (lv_amount_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:917:5: (lv_amount_1_0= RULE_INT )
                    // InternalMyDsl.g:918:6: lv_amount_1_0= RULE_INT
                    {
                    lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_amount_1_0, grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"amount",
                    							lv_amount_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:934:4: ( (lv_unit_2_0= ruleUnit ) )
                    // InternalMyDsl.g:935:5: (lv_unit_2_0= ruleUnit )
                    {
                    // InternalMyDsl.g:935:5: (lv_unit_2_0= ruleUnit )
                    // InternalMyDsl.g:936:6: lv_unit_2_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_unit_2_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getIngredientAccess().getCommaKeyword_0_3());
                    			
                    // InternalMyDsl.g:957:4: ( (lv_veganismLevel_4_0= ruleVeganismLevel ) )
                    // InternalMyDsl.g:958:5: (lv_veganismLevel_4_0= ruleVeganismLevel )
                    {
                    // InternalMyDsl.g:958:5: (lv_veganismLevel_4_0= ruleVeganismLevel )
                    // InternalMyDsl.g:959:6: lv_veganismLevel_4_0= ruleVeganismLevel
                    {

                    						newCompositeNode(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_veganismLevel_4_0=ruleVeganismLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIngredientRule());
                    						}
                    						set(
                    							current,
                    							"veganismLevel",
                    							lv_veganismLevel_4_0,
                    							"org.xtext.example.mydsl.MyDsl.VeganismLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:978:3: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalMyDsl.g:978:3: ( (otherlv_5= RULE_ID ) )
                    // InternalMyDsl.g:979:4: (otherlv_5= RULE_ID )
                    {
                    // InternalMyDsl.g:979:4: (otherlv_5= RULE_ID )
                    // InternalMyDsl.g:980:5: otherlv_5= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIngredientRule());
                    					}
                    				
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_1_0());
                    				

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
    // InternalMyDsl.g:995:1: entryRuleVeganismLevel returns [String current=null] : iv_ruleVeganismLevel= ruleVeganismLevel EOF ;
    public final String entryRuleVeganismLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVeganismLevel = null;


        try {
            // InternalMyDsl.g:995:53: (iv_ruleVeganismLevel= ruleVeganismLevel EOF )
            // InternalMyDsl.g:996:2: iv_ruleVeganismLevel= ruleVeganismLevel EOF
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
    // InternalMyDsl.g:1002:1: ruleVeganismLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) ;
    public final AntlrDatatypeRuleToken ruleVeganismLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1008:2: ( (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) )
            // InternalMyDsl.g:1009:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            {
            // InternalMyDsl.g:1009:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1010:3: kw= 'Vegan'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVeganKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1016:3: kw= 'Vegetaric'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1022:3: kw= 'Carnivorous'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMyDsl.g:1031:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalMyDsl.g:1031:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalMyDsl.g:1032:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalMyDsl.g:1038:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1044:2: ( (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) )
            // InternalMyDsl.g:1045:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            {
            // InternalMyDsl.g:1045:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            case 35:
                {
                alt12=5;
                }
                break;
            case 36:
                {
                alt12=6;
                }
                break;
            case 37:
                {
                alt12=7;
                }
                break;
            case 38:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1046:3: kw= 'ml'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMlKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1052:3: kw= 'l'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1058:3: kw= 'g'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getGKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1064:3: kw= 'kg'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getKgKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1070:3: kw= 'tsp'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTspKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1076:3: kw= 'mg'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMgKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1082:3: kw= 'tbsp'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTbspKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1088:3: kw= 'pcs'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalMyDsl.g:1097:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalMyDsl.g:1097:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalMyDsl.g:1098:2: iv_ruleEOL= ruleEOL EOF
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
    // InternalMyDsl.g:1104:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NEWLINE_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1110:2: ( (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalMyDsl.g:1111:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalMyDsl.g:1111:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_NEWLINE) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_SL_COMMENT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1112:3: this_NEWLINE_0= RULE_NEWLINE
                    {
                    this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    			current.merge(this_NEWLINE_0);
                    		

                    			newLeafNode(this_NEWLINE_0, grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1120:3: this_SL_COMMENT_1= RULE_SL_COMMENT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C00020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C40020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007F80000000L});

}