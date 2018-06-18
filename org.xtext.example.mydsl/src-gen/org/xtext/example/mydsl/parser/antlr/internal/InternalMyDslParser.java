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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_QSTRING", "RULE_INT", "RULE_INGEREDIENTSTRING", "RULE_STRING", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'authors'", "'recipes'", "'from'", "','", "'min'", "'Kitchen Utensils'", "'Food Categories'", "'Ingredients'", "'Preparation'", "'Video'", "'Ratings'", "'easy'", "'medium'", "'hard'", "'--'", "')'", "'Vegan'", "'Vegetaric'", "'Carnivorous'", "'ml'", "'l'", "'g'", "'kg'", "'tsp'", "'mg'", "'tbsp'", "'pcs'"
    };
    public static final int RULE_NEWLINE=9;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleRecipe"
    // InternalMyDsl.g:238:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalMyDsl.g:238:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalMyDsl.g:239:2: iv_ruleRecipe= ruleRecipe EOF
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
    // InternalMyDsl.g:245:1: ruleRecipe returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL (otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* )? otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Preparation' ruleEOL ( (lv_preparation_25_0= ruleList ) ) (otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL )? (otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )* )? ) ;
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
        Token otherlv_26=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_vegan_4_0 = null;

        EObject lv_difficulty_9_0 = null;

        EObject lv_kitchenUtensils_13_0 = null;

        EObject lv_kitchenUtensils_14_0 = null;

        EObject lv_foodCategory_17_0 = null;

        EObject lv_foodCategory_18_0 = null;

        EObject lv_ingredient_21_0 = null;

        EObject lv_ingredient_22_0 = null;

        EObject lv_preparation_25_0 = null;

        EObject lv_video_28_0 = null;

        EObject lv_ratings_32_0 = null;

        EObject lv_ratings_33_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:251:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL (otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* )? otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Preparation' ruleEOL ( (lv_preparation_25_0= ruleList ) ) (otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL )? (otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )* )? ) )
            // InternalMyDsl.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL (otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* )? otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Preparation' ruleEOL ( (lv_preparation_25_0= ruleList ) ) (otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL )? (otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )* )? )
            {
            // InternalMyDsl.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL (otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* )? otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Preparation' ruleEOL ( (lv_preparation_25_0= ruleList ) ) (otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL )? (otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )* )? )
            // InternalMyDsl.g:253:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' ( (lv_vegan_4_0= ruleVeganismLevel ) ) otherlv_5= ',' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'min' otherlv_8= ',' ( (lv_difficulty_9_0= ruleDifficultyLevel ) ) ruleEOL (otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* )? otherlv_15= 'Food Categories' ruleEOL ( (lv_foodCategory_17_0= ruleFoodCategory ) ) ( (lv_foodCategory_18_0= ruleFoodCategory ) )* otherlv_19= 'Ingredients' ruleEOL ( (lv_ingredient_21_0= ruleIngredient ) ) ( (lv_ingredient_22_0= ruleIngredient ) )* otherlv_23= 'Preparation' ruleEOL ( (lv_preparation_25_0= ruleList ) ) (otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL )? (otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )* )?
            {
            // InternalMyDsl.g:253:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:254:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:254:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:255:5: lv_name_0_0= RULE_ID
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

            			newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getFromKeyword_1());
            		
            // InternalMyDsl.g:275:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:276:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:276:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:277:5: otherlv_2= RULE_ID
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
            		
            // InternalMyDsl.g:292:3: ( (lv_vegan_4_0= ruleVeganismLevel ) )
            // InternalMyDsl.g:293:4: (lv_vegan_4_0= ruleVeganismLevel )
            {
            // InternalMyDsl.g:293:4: (lv_vegan_4_0= ruleVeganismLevel )
            // InternalMyDsl.g:294:5: lv_vegan_4_0= ruleVeganismLevel
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
            		
            // InternalMyDsl.g:315:3: ( (lv_duration_6_0= RULE_INT ) )
            // InternalMyDsl.g:316:4: (lv_duration_6_0= RULE_INT )
            {
            // InternalMyDsl.g:316:4: (lv_duration_6_0= RULE_INT )
            // InternalMyDsl.g:317:5: lv_duration_6_0= RULE_INT
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
            		
            // InternalMyDsl.g:341:3: ( (lv_difficulty_9_0= ruleDifficultyLevel ) )
            // InternalMyDsl.g:342:4: (lv_difficulty_9_0= ruleDifficultyLevel )
            {
            // InternalMyDsl.g:342:4: (lv_difficulty_9_0= ruleDifficultyLevel )
            // InternalMyDsl.g:343:5: lv_difficulty_9_0= ruleDifficultyLevel
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
            		
            // InternalMyDsl.g:367:3: (otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:368:4: otherlv_11= 'Kitchen Utensils' ruleEOL ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) ) ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )*
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11_0());
                    			

                    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_11_1());
                    			
                    pushFollow(FOLLOW_7);
                    ruleEOL();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:379:4: ( (lv_kitchenUtensils_13_0= ruleKitchenUtensil ) )
                    // InternalMyDsl.g:380:5: (lv_kitchenUtensils_13_0= ruleKitchenUtensil )
                    {
                    // InternalMyDsl.g:380:5: (lv_kitchenUtensils_13_0= ruleKitchenUtensil )
                    // InternalMyDsl.g:381:6: lv_kitchenUtensils_13_0= ruleKitchenUtensil
                    {

                    						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_2_0());
                    					
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

                    // InternalMyDsl.g:398:4: ( (lv_kitchenUtensils_14_0= ruleKitchenUtensil ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_QSTRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:399:5: (lv_kitchenUtensils_14_0= ruleKitchenUtensil )
                    	    {
                    	    // InternalMyDsl.g:399:5: (lv_kitchenUtensils_14_0= ruleKitchenUtensil )
                    	    // InternalMyDsl.g:400:6: lv_kitchenUtensils_14_0= ruleKitchenUtensil
                    	    {

                    	    						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_3_0());
                    	    					
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


                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_12());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_13());
            		
            pushFollow(FOLLOW_7);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:429:3: ( (lv_foodCategory_17_0= ruleFoodCategory ) )
            // InternalMyDsl.g:430:4: (lv_foodCategory_17_0= ruleFoodCategory )
            {
            // InternalMyDsl.g:430:4: (lv_foodCategory_17_0= ruleFoodCategory )
            // InternalMyDsl.g:431:5: lv_foodCategory_17_0= ruleFoodCategory
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_14_0());
            				
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

            // InternalMyDsl.g:448:3: ( (lv_foodCategory_18_0= ruleFoodCategory ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_QSTRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:449:4: (lv_foodCategory_18_0= ruleFoodCategory )
            	    {
            	    // InternalMyDsl.g:449:4: (lv_foodCategory_18_0= ruleFoodCategory )
            	    // InternalMyDsl.g:450:5: lv_foodCategory_18_0= ruleFoodCategory
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_15_0());
            	    				
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
            	    break loop6;
                }
            } while (true);

            otherlv_19=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getRecipeAccess().getIngredientsKeyword_16());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_17());
            		
            pushFollow(FOLLOW_17);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:478:3: ( (lv_ingredient_21_0= ruleIngredient ) )
            // InternalMyDsl.g:479:4: (lv_ingredient_21_0= ruleIngredient )
            {
            // InternalMyDsl.g:479:4: (lv_ingredient_21_0= ruleIngredient )
            // InternalMyDsl.g:480:5: lv_ingredient_21_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_18_0());
            				
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

            // InternalMyDsl.g:497:3: ( (lv_ingredient_22_0= ruleIngredient ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INGEREDIENTSTRING||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:498:4: (lv_ingredient_22_0= ruleIngredient )
            	    {
            	    // InternalMyDsl.g:498:4: (lv_ingredient_22_0= ruleIngredient )
            	    // InternalMyDsl.g:499:5: lv_ingredient_22_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_19_0());
            	    				
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
            	    break loop7;
                }
            } while (true);

            otherlv_23=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getRecipeAccess().getPreparationKeyword_20());
            		

            			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_21());
            		
            pushFollow(FOLLOW_11);
            ruleEOL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:527:3: ( (lv_preparation_25_0= ruleList ) )
            // InternalMyDsl.g:528:4: (lv_preparation_25_0= ruleList )
            {
            // InternalMyDsl.g:528:4: (lv_preparation_25_0= ruleList )
            // InternalMyDsl.g:529:5: lv_preparation_25_0= ruleList
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getPreparationListParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_19);
            lv_preparation_25_0=ruleList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"preparation",
            						lv_preparation_25_0,
            						"org.xtext.example.mydsl.MyDsl.List");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:546:3: (otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:547:4: otherlv_26= 'Video' ruleEOL ( (lv_video_28_0= ruleVideo ) ) ruleEOL
                    {
                    otherlv_26=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getRecipeAccess().getVideoKeyword_23_0());
                    			

                    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_1());
                    			
                    pushFollow(FOLLOW_20);
                    ruleEOL();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:558:4: ( (lv_video_28_0= ruleVideo ) )
                    // InternalMyDsl.g:559:5: (lv_video_28_0= ruleVideo )
                    {
                    // InternalMyDsl.g:559:5: (lv_video_28_0= ruleVideo )
                    // InternalMyDsl.g:560:6: lv_video_28_0= ruleVideo
                    {

                    						newCompositeNode(grammarAccess.getRecipeAccess().getVideoVideoParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_video_28_0=ruleVideo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecipeRule());
                    						}
                    						set(
                    							current,
                    							"video",
                    							lv_video_28_0,
                    							"org.xtext.example.mydsl.MyDsl.Video");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_3());
                    			
                    pushFollow(FOLLOW_21);
                    ruleEOL();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:585:3: (otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:586:4: otherlv_30= 'Ratings' ruleEOL ( (lv_ratings_32_0= ruleRating ) ) ( (lv_ratings_33_0= ruleRating ) )*
                    {
                    otherlv_30=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getRecipeAccess().getRatingsKeyword_24_0());
                    			

                    				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24_1());
                    			
                    pushFollow(FOLLOW_11);
                    ruleEOL();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:597:4: ( (lv_ratings_32_0= ruleRating ) )
                    // InternalMyDsl.g:598:5: (lv_ratings_32_0= ruleRating )
                    {
                    // InternalMyDsl.g:598:5: (lv_ratings_32_0= ruleRating )
                    // InternalMyDsl.g:599:6: lv_ratings_32_0= ruleRating
                    {

                    						newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ratings_32_0=ruleRating();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecipeRule());
                    						}
                    						add(
                    							current,
                    							"ratings",
                    							lv_ratings_32_0,
                    							"org.xtext.example.mydsl.MyDsl.Rating");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:616:4: ( (lv_ratings_33_0= ruleRating ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:617:5: (lv_ratings_33_0= ruleRating )
                    	    {
                    	    // InternalMyDsl.g:617:5: (lv_ratings_33_0= ruleRating )
                    	    // InternalMyDsl.g:618:6: lv_ratings_33_0= ruleRating
                    	    {

                    	    						newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_3_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
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
                    	    break;

                    	default :
                    	    break loop9;
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
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleKitchenUtensil"
    // InternalMyDsl.g:640:1: entryRuleKitchenUtensil returns [EObject current=null] : iv_ruleKitchenUtensil= ruleKitchenUtensil EOF ;
    public final EObject entryRuleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKitchenUtensil = null;


        try {
            // InternalMyDsl.g:640:55: (iv_ruleKitchenUtensil= ruleKitchenUtensil EOF )
            // InternalMyDsl.g:641:2: iv_ruleKitchenUtensil= ruleKitchenUtensil EOF
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
    // InternalMyDsl.g:647:1: ruleKitchenUtensil returns [EObject current=null] : ( (lv_name_0_0= RULE_QSTRING ) ) ;
    public final EObject ruleKitchenUtensil() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:653:2: ( ( (lv_name_0_0= RULE_QSTRING ) ) )
            // InternalMyDsl.g:654:2: ( (lv_name_0_0= RULE_QSTRING ) )
            {
            // InternalMyDsl.g:654:2: ( (lv_name_0_0= RULE_QSTRING ) )
            // InternalMyDsl.g:655:3: (lv_name_0_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:655:3: (lv_name_0_0= RULE_QSTRING )
            // InternalMyDsl.g:656:4: lv_name_0_0= RULE_QSTRING
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
    // InternalMyDsl.g:675:1: entryRuleDifficultyLevel returns [EObject current=null] : iv_ruleDifficultyLevel= ruleDifficultyLevel EOF ;
    public final EObject entryRuleDifficultyLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDifficultyLevel = null;


        try {
            // InternalMyDsl.g:675:56: (iv_ruleDifficultyLevel= ruleDifficultyLevel EOF )
            // InternalMyDsl.g:676:2: iv_ruleDifficultyLevel= ruleDifficultyLevel EOF
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
    // InternalMyDsl.g:682:1: ruleDifficultyLevel returns [EObject current=null] : ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) ) ;
    public final EObject ruleDifficultyLevel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:688:2: ( ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) ) )
            // InternalMyDsl.g:689:2: ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) )
            {
            // InternalMyDsl.g:689:2: ( ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) ) )
            // InternalMyDsl.g:690:3: ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) )
            {
            // InternalMyDsl.g:690:3: ( (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' ) )
            // InternalMyDsl.g:691:4: (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' )
            {
            // InternalMyDsl.g:691:4: (lv_name_0_1= 'easy' | lv_name_0_2= 'medium' | lv_name_0_3= 'hard' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
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
                    // InternalMyDsl.g:692:5: lv_name_0_1= 'easy'
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
                    // InternalMyDsl.g:703:5: lv_name_0_2= 'medium'
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
                    // InternalMyDsl.g:714:5: lv_name_0_3= 'hard'
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
    // InternalMyDsl.g:730:1: entryRuleFoodCategory returns [EObject current=null] : iv_ruleFoodCategory= ruleFoodCategory EOF ;
    public final EObject entryRuleFoodCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodCategory = null;


        try {
            // InternalMyDsl.g:730:53: (iv_ruleFoodCategory= ruleFoodCategory EOF )
            // InternalMyDsl.g:731:2: iv_ruleFoodCategory= ruleFoodCategory EOF
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
    // InternalMyDsl.g:737:1: ruleFoodCategory returns [EObject current=null] : ( (lv_name_0_0= RULE_QSTRING ) ) ;
    public final EObject ruleFoodCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:743:2: ( ( (lv_name_0_0= RULE_QSTRING ) ) )
            // InternalMyDsl.g:744:2: ( (lv_name_0_0= RULE_QSTRING ) )
            {
            // InternalMyDsl.g:744:2: ( (lv_name_0_0= RULE_QSTRING ) )
            // InternalMyDsl.g:745:3: (lv_name_0_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:745:3: (lv_name_0_0= RULE_QSTRING )
            // InternalMyDsl.g:746:4: lv_name_0_0= RULE_QSTRING
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
    // InternalMyDsl.g:765:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalMyDsl.g:765:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalMyDsl.g:766:2: iv_ruleIngredient= ruleIngredient EOF
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
    // InternalMyDsl.g:772:1: ruleIngredient returns [EObject current=null] : ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL ) ;
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
            // InternalMyDsl.g:778:2: ( ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL ) )
            // InternalMyDsl.g:779:2: ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL )
            {
            // InternalMyDsl.g:779:2: ( ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL )
            // InternalMyDsl.g:780:3: ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) ) ruleEOL
            {
            // InternalMyDsl.g:780:3: ( (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) ) | ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INGEREDIENTSTRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:781:4: (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:781:4: (otherlv_0= '--' ( (otherlv_1= RULE_ID ) ) )
                    // InternalMyDsl.g:782:5: otherlv_0= '--' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_4); 

                    					newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getHyphenMinusHyphenMinusKeyword_0_0_0());
                    				
                    // InternalMyDsl.g:786:5: ( (otherlv_1= RULE_ID ) )
                    // InternalMyDsl.g:787:6: (otherlv_1= RULE_ID )
                    {
                    // InternalMyDsl.g:787:6: (otherlv_1= RULE_ID )
                    // InternalMyDsl.g:788:7: otherlv_1= RULE_ID
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
                    // InternalMyDsl.g:801:4: ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) )
                    {
                    // InternalMyDsl.g:801:4: ( ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) ) )
                    // InternalMyDsl.g:802:5: ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) ) ( (lv_amount_3_0= RULE_INT ) ) ( (lv_unit_4_0= ruleUnit ) ) otherlv_5= ',' ( (lv_veganismLevel_6_0= ruleVeganismLevel ) )
                    {
                    // InternalMyDsl.g:802:5: ( (lv_name_2_0= RULE_INGEREDIENTSTRING ) )
                    // InternalMyDsl.g:803:6: (lv_name_2_0= RULE_INGEREDIENTSTRING )
                    {
                    // InternalMyDsl.g:803:6: (lv_name_2_0= RULE_INGEREDIENTSTRING )
                    // InternalMyDsl.g:804:7: lv_name_2_0= RULE_INGEREDIENTSTRING
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

                    // InternalMyDsl.g:820:5: ( (lv_amount_3_0= RULE_INT ) )
                    // InternalMyDsl.g:821:6: (lv_amount_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:821:6: (lv_amount_3_0= RULE_INT )
                    // InternalMyDsl.g:822:7: lv_amount_3_0= RULE_INT
                    {
                    lv_amount_3_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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

                    // InternalMyDsl.g:838:5: ( (lv_unit_4_0= ruleUnit ) )
                    // InternalMyDsl.g:839:6: (lv_unit_4_0= ruleUnit )
                    {
                    // InternalMyDsl.g:839:6: (lv_unit_4_0= ruleUnit )
                    // InternalMyDsl.g:840:7: lv_unit_4_0= ruleUnit
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
                    				
                    // InternalMyDsl.g:861:5: ( (lv_veganismLevel_6_0= ruleVeganismLevel ) )
                    // InternalMyDsl.g:862:6: (lv_veganismLevel_6_0= ruleVeganismLevel )
                    {
                    // InternalMyDsl.g:862:6: (lv_veganismLevel_6_0= ruleVeganismLevel )
                    // InternalMyDsl.g:863:7: lv_veganismLevel_6_0= ruleVeganismLevel
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


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:893:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMyDsl.g:893:45: (iv_ruleList= ruleList EOF )
            // InternalMyDsl.g:894:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:900:1: ruleList returns [EObject current=null] : ( (lv_elements_0_0= ruleListElement ) )+ ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:906:2: ( ( (lv_elements_0_0= ruleListElement ) )+ )
            // InternalMyDsl.g:907:2: ( (lv_elements_0_0= ruleListElement ) )+
            {
            // InternalMyDsl.g:907:2: ( (lv_elements_0_0= ruleListElement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:908:3: (lv_elements_0_0= ruleListElement )
            	    {
            	    // InternalMyDsl.g:908:3: (lv_elements_0_0= ruleListElement )
            	    // InternalMyDsl.g:909:4: lv_elements_0_0= ruleListElement
            	    {

            	    				newCompositeNode(grammarAccess.getListAccess().getElementsListElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_22);
            	    lv_elements_0_0=ruleListElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getListRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.ListElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListElement"
    // InternalMyDsl.g:929:1: entryRuleListElement returns [EObject current=null] : iv_ruleListElement= ruleListElement EOF ;
    public final EObject entryRuleListElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElement = null;


        try {
            // InternalMyDsl.g:929:52: (iv_ruleListElement= ruleListElement EOF )
            // InternalMyDsl.g:930:2: iv_ruleListElement= ruleListElement EOF
            {
             newCompositeNode(grammarAccess.getListElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListElement=ruleListElement();

            state._fsp--;

             current =iv_ruleListElement; 
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
    // $ANTLR end "entryRuleListElement"


    // $ANTLR start "ruleListElement"
    // InternalMyDsl.g:936:1: ruleListElement returns [EObject current=null] : ( ( (lv_order_0_0= RULE_INT ) ) otherlv_1= ')' ( (lv_comment_2_0= RULE_QSTRING ) ) ) ;
    public final EObject ruleListElement() throws RecognitionException {
        EObject current = null;

        Token lv_order_0_0=null;
        Token otherlv_1=null;
        Token lv_comment_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:942:2: ( ( ( (lv_order_0_0= RULE_INT ) ) otherlv_1= ')' ( (lv_comment_2_0= RULE_QSTRING ) ) ) )
            // InternalMyDsl.g:943:2: ( ( (lv_order_0_0= RULE_INT ) ) otherlv_1= ')' ( (lv_comment_2_0= RULE_QSTRING ) ) )
            {
            // InternalMyDsl.g:943:2: ( ( (lv_order_0_0= RULE_INT ) ) otherlv_1= ')' ( (lv_comment_2_0= RULE_QSTRING ) ) )
            // InternalMyDsl.g:944:3: ( (lv_order_0_0= RULE_INT ) ) otherlv_1= ')' ( (lv_comment_2_0= RULE_QSTRING ) )
            {
            // InternalMyDsl.g:944:3: ( (lv_order_0_0= RULE_INT ) )
            // InternalMyDsl.g:945:4: (lv_order_0_0= RULE_INT )
            {
            // InternalMyDsl.g:945:4: (lv_order_0_0= RULE_INT )
            // InternalMyDsl.g:946:5: lv_order_0_0= RULE_INT
            {
            lv_order_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_order_0_0, grammarAccess.getListElementAccess().getOrderINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"order",
            						lv_order_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getListElementAccess().getRightParenthesisKeyword_1());
            		
            // InternalMyDsl.g:966:3: ( (lv_comment_2_0= RULE_QSTRING ) )
            // InternalMyDsl.g:967:4: (lv_comment_2_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:967:4: (lv_comment_2_0= RULE_QSTRING )
            // InternalMyDsl.g:968:5: lv_comment_2_0= RULE_QSTRING
            {
            lv_comment_2_0=(Token)match(input,RULE_QSTRING,FOLLOW_2); 

            					newLeafNode(lv_comment_2_0, grammarAccess.getListElementAccess().getCommentQSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"comment",
            						lv_comment_2_0,
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
    // $ANTLR end "ruleListElement"


    // $ANTLR start "entryRuleVideo"
    // InternalMyDsl.g:988:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalMyDsl.g:988:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalMyDsl.g:989:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalMyDsl.g:995:1: ruleVideo returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1001:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1002:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1002:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1003:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1003:3: (lv_name_0_0= RULE_STRING )
            // InternalMyDsl.g:1004:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVideoAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVideoRule());
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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleRating"
    // InternalMyDsl.g:1023:1: entryRuleRating returns [EObject current=null] : iv_ruleRating= ruleRating EOF ;
    public final EObject entryRuleRating() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRating = null;


        try {
            // InternalMyDsl.g:1023:47: (iv_ruleRating= ruleRating EOF )
            // InternalMyDsl.g:1024:2: iv_ruleRating= ruleRating EOF
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
    // InternalMyDsl.g:1030:1: ruleRating returns [EObject current=null] : ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ruleEOL ) ;
    public final EObject ruleRating() throws RecognitionException {
        EObject current = null;

        Token lv_stars_0_0=null;
        Token lv_comment_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1036:2: ( ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ruleEOL ) )
            // InternalMyDsl.g:1037:2: ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ruleEOL )
            {
            // InternalMyDsl.g:1037:2: ( ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ruleEOL )
            // InternalMyDsl.g:1038:3: ( (lv_stars_0_0= RULE_INT ) ) ( (lv_comment_1_0= RULE_QSTRING ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ruleEOL
            {
            // InternalMyDsl.g:1038:3: ( (lv_stars_0_0= RULE_INT ) )
            // InternalMyDsl.g:1039:4: (lv_stars_0_0= RULE_INT )
            {
            // InternalMyDsl.g:1039:4: (lv_stars_0_0= RULE_INT )
            // InternalMyDsl.g:1040:5: lv_stars_0_0= RULE_INT
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

            // InternalMyDsl.g:1056:3: ( (lv_comment_1_0= RULE_QSTRING ) )
            // InternalMyDsl.g:1057:4: (lv_comment_1_0= RULE_QSTRING )
            {
            // InternalMyDsl.g:1057:4: (lv_comment_1_0= RULE_QSTRING )
            // InternalMyDsl.g:1058:5: lv_comment_1_0= RULE_QSTRING
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

            			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:1078:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1079:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1079:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1080:5: otherlv_3= RULE_ID
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


    // $ANTLR start "entryRuleVeganismLevel"
    // InternalMyDsl.g:1102:1: entryRuleVeganismLevel returns [String current=null] : iv_ruleVeganismLevel= ruleVeganismLevel EOF ;
    public final String entryRuleVeganismLevel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVeganismLevel = null;


        try {
            // InternalMyDsl.g:1102:53: (iv_ruleVeganismLevel= ruleVeganismLevel EOF )
            // InternalMyDsl.g:1103:2: iv_ruleVeganismLevel= ruleVeganismLevel EOF
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
    // InternalMyDsl.g:1109:1: ruleVeganismLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) ;
    public final AntlrDatatypeRuleToken ruleVeganismLevel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1115:2: ( (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' ) )
            // InternalMyDsl.g:1116:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            {
            // InternalMyDsl.g:1116:2: (kw= 'Vegan' | kw= 'Vegetaric' | kw= 'Carnivorous' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1117:3: kw= 'Vegan'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVeganKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1123:3: kw= 'Vegetaric'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1129:3: kw= 'Carnivorous'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalMyDsl.g:1138:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalMyDsl.g:1138:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalMyDsl.g:1139:2: iv_ruleUnit= ruleUnit EOF
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
    // InternalMyDsl.g:1145:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1151:2: ( (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' ) )
            // InternalMyDsl.g:1152:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            {
            // InternalMyDsl.g:1152:2: (kw= 'ml' | kw= 'l' | kw= 'g' | kw= 'kg' | kw= 'tsp' | kw= 'mg' | kw= 'tbsp' | kw= 'pcs' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            case 37:
                {
                alt15=5;
                }
                break;
            case 38:
                {
                alt15=6;
                }
                break;
            case 39:
                {
                alt15=7;
                }
                break;
            case 40:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1153:3: kw= 'ml'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMlKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1159:3: kw= 'l'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1165:3: kw= 'g'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getGKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1171:3: kw= 'kg'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getKgKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1177:3: kw= 'tsp'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTspKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1183:3: kw= 'mg'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMgKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1189:3: kw= 'tbsp'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getTbspKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1195:3: kw= 'pcs'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:1204:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalMyDsl.g:1204:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalMyDsl.g:1205:2: iv_ruleEOL= ruleEOL EOF
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
    // InternalMyDsl.g:1211:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NEWLINE_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1217:2: ( (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalMyDsl.g:1218:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalMyDsl.g:1218:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_NEWLINE) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SL_COMMENT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1219:3: this_NEWLINE_0= RULE_NEWLINE
                    {
                    this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    			current.merge(this_NEWLINE_0);
                    		

                    			newLeafNode(this_NEWLINE_0, grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1227:3: this_SL_COMMENT_1= RULE_SL_COMMENT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010400080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000001FE00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});

}