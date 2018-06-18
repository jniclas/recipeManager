/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRecipeManager
entryRuleRecipeManager returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecipeManagerRule()); }
	iv_ruleRecipeManager=ruleRecipeManager
	{ $current=$iv_ruleRecipeManager.current; }
	EOF;

// Rule RecipeManager
ruleRecipeManager returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='authors'
		{
			newLeafNode(otherlv_0, grammarAccess.getRecipeManagerAccess().getAuthorsKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_1());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_2_0());
				}
				lv_authors_2_0=ruleAuthor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
					}
					add(
						$current,
						"authors",
						lv_authors_2_0,
						"org.xtext.example.mydsl.MyDsl.Author");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeManagerAccess().getAuthorsAuthorParserRuleCall_3_0());
				}
				lv_authors_3_0=ruleAuthor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
					}
					add(
						$current,
						"authors",
						lv_authors_3_0,
						"org.xtext.example.mydsl.MyDsl.Author");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_4='recipes'
			{
				newLeafNode(otherlv_4, grammarAccess.getRecipeManagerAccess().getRecipesKeyword_4_0());
			}
			{
				newCompositeNode(grammarAccess.getRecipeManagerAccess().getEOLParserRuleCall_4_1());
			}
			ruleEOL
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_2_0());
					}
					lv_recipes_6_0=ruleRecipe
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
						}
						add(
							$current,
							"recipes",
							lv_recipes_6_0,
							"org.xtext.example.mydsl.MyDsl.Recipe");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeManagerAccess().getRecipesRecipeParserRuleCall_4_3_0());
					}
					lv_recipes_7_0=ruleRecipe
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeManagerRule());
						}
						add(
							$current,
							"recipes",
							lv_recipes_7_0,
							"org.xtext.example.mydsl.MyDsl.Recipe");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleAuthor
entryRuleAuthor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAuthorRule()); }
	iv_ruleAuthor=ruleAuthor
	{ $current=$iv_ruleAuthor.current; }
	EOF;

// Rule Author
ruleAuthor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getAuthorAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAuthorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_Email_1_0=RULE_QSTRING
				{
					newLeafNode(lv_Email_1_0, grammarAccess.getAuthorAccess().getEmailQSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAuthorRule());
					}
					setWithLastConsumed(
						$current,
						"Email",
						lv_Email_1_0,
						"org.xtext.example.mydsl.MyDsl.QSTRING");
				}
			)
		)
	)
;

// Entry rule entryRuleRecipe
entryRuleRecipe returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRecipeRule()); }
	iv_ruleRecipe=ruleRecipe
	{ $current=$iv_ruleRecipe.current; }
	EOF;

// Rule Recipe
ruleRecipe returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecipeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='from'
		{
			newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getFromKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecipeRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getAuthorAuthorCrossReference_2_0());
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getVeganVeganismLevelParserRuleCall_4_0());
				}
				lv_vegan_4_0=ruleVeganismLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					set(
						$current,
						"vegan",
						lv_vegan_4_0,
						"org.xtext.example.mydsl.MyDsl.VeganismLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getRecipeAccess().getCommaKeyword_5());
		}
		(
			(
				lv_duration_6_0=RULE_INT
				{
					newLeafNode(lv_duration_6_0, grammarAccess.getRecipeAccess().getDurationINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRecipeRule());
					}
					setWithLastConsumed(
						$current,
						"duration",
						lv_duration_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='min'
		{
			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getMinKeyword_7());
		}
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getCommaKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getDifficultyDifficultyLevelParserRuleCall_9_0());
				}
				lv_difficulty_9_0=ruleDifficultyLevel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					set(
						$current,
						"difficulty",
						lv_difficulty_9_0,
						"org.xtext.example.mydsl.MyDsl.DifficultyLevel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_10());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_11='Kitchen Utensils'
			{
				newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getKitchenUtensilsKeyword_11_0());
			}
			{
				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_11_1());
			}
			ruleEOL
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_2_0());
					}
					lv_kitchenUtensils_13_0=ruleKitchenUtensil
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						add(
							$current,
							"kitchenUtensils",
							lv_kitchenUtensils_13_0,
							"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getKitchenUtensilsKitchenUtensilParserRuleCall_11_3_0());
					}
					lv_kitchenUtensils_14_0=ruleKitchenUtensil
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						add(
							$current,
							"kitchenUtensils",
							lv_kitchenUtensils_14_0,
							"org.xtext.example.mydsl.MyDsl.KitchenUtensil");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_15='Food Categories'
		{
			newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getFoodCategoriesKeyword_12());
		}
		{
			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_13());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_14_0());
				}
				lv_foodCategory_17_0=ruleFoodCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"foodCategory",
						lv_foodCategory_17_0,
						"org.xtext.example.mydsl.MyDsl.FoodCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getFoodCategoryFoodCategoryParserRuleCall_15_0());
				}
				lv_foodCategory_18_0=ruleFoodCategory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"foodCategory",
						lv_foodCategory_18_0,
						"org.xtext.example.mydsl.MyDsl.FoodCategory");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_19='Ingredients'
		{
			newLeafNode(otherlv_19, grammarAccess.getRecipeAccess().getIngredientsKeyword_16());
		}
		{
			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_17());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_18_0());
				}
				lv_ingredient_21_0=ruleIngredient
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"ingredient",
						lv_ingredient_21_0,
						"org.xtext.example.mydsl.MyDsl.Ingredient");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientIngredientParserRuleCall_19_0());
				}
				lv_ingredient_22_0=ruleIngredient
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					add(
						$current,
						"ingredient",
						lv_ingredient_22_0,
						"org.xtext.example.mydsl.MyDsl.Ingredient");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_23='Preparation'
		{
			newLeafNode(otherlv_23, grammarAccess.getRecipeAccess().getPreparationKeyword_20());
		}
		{
			newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_21());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRecipeAccess().getPreparationListParserRuleCall_22_0());
				}
				lv_preparation_25_0=ruleList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRecipeRule());
					}
					set(
						$current,
						"preparation",
						lv_preparation_25_0,
						"org.xtext.example.mydsl.MyDsl.List");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_26='Video'
			{
				newLeafNode(otherlv_26, grammarAccess.getRecipeAccess().getVideoKeyword_23_0());
			}
			{
				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_1());
			}
			ruleEOL
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getVideoVideoParserRuleCall_23_2_0());
					}
					lv_video_28_0=ruleVideo
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						set(
							$current,
							"video",
							lv_video_28_0,
							"org.xtext.example.mydsl.MyDsl.Video");
						afterParserOrEnumRuleCall();
					}
				)
			)
			{
				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_23_3());
			}
			ruleEOL
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			otherlv_30='Ratings'
			{
				newLeafNode(otherlv_30, grammarAccess.getRecipeAccess().getRatingsKeyword_24_0());
			}
			{
				newCompositeNode(grammarAccess.getRecipeAccess().getEOLParserRuleCall_24_1());
			}
			ruleEOL
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_2_0());
					}
					lv_ratings_32_0=ruleRating
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						add(
							$current,
							"ratings",
							lv_ratings_32_0,
							"org.xtext.example.mydsl.MyDsl.Rating");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRecipeAccess().getRatingsRatingParserRuleCall_24_3_0());
					}
					lv_ratings_33_0=ruleRating
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRecipeRule());
						}
						add(
							$current,
							"ratings",
							lv_ratings_33_0,
							"org.xtext.example.mydsl.MyDsl.Rating");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleKitchenUtensil
entryRuleKitchenUtensil returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKitchenUtensilRule()); }
	iv_ruleKitchenUtensil=ruleKitchenUtensil
	{ $current=$iv_ruleKitchenUtensil.current; }
	EOF;

// Rule KitchenUtensil
ruleKitchenUtensil returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_QSTRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getKitchenUtensilAccess().getNameQSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getKitchenUtensilRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.xtext.example.mydsl.MyDsl.QSTRING");
			}
		)
	)
;

// Entry rule entryRuleDifficultyLevel
entryRuleDifficultyLevel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDifficultyLevelRule()); }
	iv_ruleDifficultyLevel=ruleDifficultyLevel
	{ $current=$iv_ruleDifficultyLevel.current; }
	EOF;

// Rule DifficultyLevel
ruleDifficultyLevel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_1='easy'
				{
					newLeafNode(lv_name_0_1, grammarAccess.getDifficultyLevelAccess().getNameEasyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDifficultyLevelRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_1, null);
				}
				    |
				lv_name_0_2='medium'
				{
					newLeafNode(lv_name_0_2, grammarAccess.getDifficultyLevelAccess().getNameMediumKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDifficultyLevelRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_2, null);
				}
				    |
				lv_name_0_3='hard'
				{
					newLeafNode(lv_name_0_3, grammarAccess.getDifficultyLevelAccess().getNameHardKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDifficultyLevelRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_3, null);
				}
			)
		)
	)
;

// Entry rule entryRuleFoodCategory
entryRuleFoodCategory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFoodCategoryRule()); }
	iv_ruleFoodCategory=ruleFoodCategory
	{ $current=$iv_ruleFoodCategory.current; }
	EOF;

// Rule FoodCategory
ruleFoodCategory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_QSTRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getFoodCategoryAccess().getNameQSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFoodCategoryRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.xtext.example.mydsl.MyDsl.QSTRING");
			}
		)
	)
;

// Entry rule entryRuleIngredient
entryRuleIngredient returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIngredientRule()); }
	iv_ruleIngredient=ruleIngredient
	{ $current=$iv_ruleIngredient.current; }
	EOF;

// Rule Ingredient
ruleIngredient returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				otherlv_0='--'
				{
					newLeafNode(otherlv_0, grammarAccess.getIngredientAccess().getHyphenMinusHyphenMinusKeyword_0_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getIngredientRule());
							}
						}
						otherlv_1=RULE_ID
						{
							newLeafNode(otherlv_1, grammarAccess.getIngredientAccess().getRecipeRecipeCrossReference_0_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					(
						lv_name_2_0=RULE_INGEREDIENTSTRING
						{
							newLeafNode(lv_name_2_0, grammarAccess.getIngredientAccess().getNameINGEREDIENTSTRINGTerminalRuleCall_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getIngredientRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_2_0,
								"org.xtext.example.mydsl.MyDsl.INGEREDIENTSTRING");
						}
					)
				)
				(
					(
						lv_amount_3_0=RULE_INT
						{
							newLeafNode(lv_amount_3_0, grammarAccess.getIngredientAccess().getAmountINTTerminalRuleCall_0_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getIngredientRule());
							}
							setWithLastConsumed(
								$current,
								"amount",
								lv_amount_3_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getIngredientAccess().getUnitUnitParserRuleCall_0_1_2_0());
						}
						lv_unit_4_0=ruleUnit
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIngredientRule());
							}
							set(
								$current,
								"unit",
								lv_unit_4_0,
								"org.xtext.example.mydsl.MyDsl.Unit");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getIngredientAccess().getCommaKeyword_0_1_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getIngredientAccess().getVeganismLevelVeganismLevelParserRuleCall_0_1_4_0());
						}
						lv_veganismLevel_6_0=ruleVeganismLevel
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getIngredientRule());
							}
							set(
								$current,
								"veganismLevel",
								lv_veganismLevel_6_0,
								"org.xtext.example.mydsl.MyDsl.VeganismLevel");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		{
			newCompositeNode(grammarAccess.getIngredientAccess().getEOLParserRuleCall_1());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleList
entryRuleList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListRule()); }
	iv_ruleList=ruleList
	{ $current=$iv_ruleList.current; }
	EOF;

// Rule List
ruleList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getListAccess().getElementsListElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleListElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getListRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.example.mydsl.MyDsl.ListElement");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleListElement
entryRuleListElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListElementRule()); }
	iv_ruleListElement=ruleListElement
	{ $current=$iv_ruleListElement.current; }
	EOF;

// Rule ListElement
ruleListElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_order_0_0=RULE_INT
				{
					newLeafNode(lv_order_0_0, grammarAccess.getListElementAccess().getOrderINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListElementRule());
					}
					setWithLastConsumed(
						$current,
						"order",
						lv_order_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1=')'
		{
			newLeafNode(otherlv_1, grammarAccess.getListElementAccess().getRightParenthesisKeyword_1());
		}
		(
			(
				lv_comment_2_0=RULE_QSTRING
				{
					newLeafNode(lv_comment_2_0, grammarAccess.getListElementAccess().getCommentQSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListElementRule());
					}
					setWithLastConsumed(
						$current,
						"comment",
						lv_comment_2_0,
						"org.xtext.example.mydsl.MyDsl.QSTRING");
				}
			)
		)
	)
;

// Entry rule entryRuleVideo
entryRuleVideo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVideoRule()); }
	iv_ruleVideo=ruleVideo
	{ $current=$iv_ruleVideo.current; }
	EOF;

// Rule Video
ruleVideo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getVideoAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVideoRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleRating
entryRuleRating returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRatingRule()); }
	iv_ruleRating=ruleRating
	{ $current=$iv_ruleRating.current; }
	EOF;

// Rule Rating
ruleRating returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_stars_0_0=RULE_INT
				{
					newLeafNode(lv_stars_0_0, grammarAccess.getRatingAccess().getStarsINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRatingRule());
					}
					setWithLastConsumed(
						$current,
						"stars",
						lv_stars_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_comment_1_0=RULE_QSTRING
				{
					newLeafNode(lv_comment_1_0, grammarAccess.getRatingAccess().getCommentQSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRatingRule());
					}
					setWithLastConsumed(
						$current,
						"comment",
						lv_comment_1_0,
						"org.xtext.example.mydsl.MyDsl.QSTRING");
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getRatingAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRatingRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getRatingAccess().getAuthorAuthorCrossReference_3_0());
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getRatingAccess().getEOLParserRuleCall_4());
		}
		ruleEOL
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVeganismLevel
entryRuleVeganismLevel returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVeganismLevelRule()); }
	iv_ruleVeganismLevel=ruleVeganismLevel
	{ $current=$iv_ruleVeganismLevel.current.getText(); }
	EOF;

// Rule VeganismLevel
ruleVeganismLevel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Vegan'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVeganKeyword_0());
		}
		    |
		kw='Vegetaric'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getVegetaricKeyword_1());
		}
		    |
		kw='Carnivorous'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVeganismLevelAccess().getCarnivorousKeyword_2());
		}
	)
;

// Entry rule entryRuleUnit
entryRuleUnit returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnitRule()); }
	iv_ruleUnit=ruleUnit
	{ $current=$iv_ruleUnit.current.getText(); }
	EOF;

// Rule Unit
ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='ml'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getMlKeyword_0());
		}
		    |
		kw='l'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getLKeyword_1());
		}
		    |
		kw='g'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getGKeyword_2());
		}
		    |
		kw='kg'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getKgKeyword_3());
		}
		    |
		kw='tsp'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getTspKeyword_4());
		}
		    |
		kw='mg'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getMgKeyword_5());
		}
		    |
		kw='tbsp'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getTbspKeyword_6());
		}
		    |
		kw='pcs'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getUnitAccess().getPcsKeyword_7());
		}
	)
;

// Entry rule entryRuleEOL
entryRuleEOL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEOLRule()); }
	iv_ruleEOL=ruleEOL
	{ $current=$iv_ruleEOL.current.getText(); }
	EOF;

// Rule EOL
ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_NEWLINE_0=RULE_NEWLINE
		{
			$current.merge(this_NEWLINE_0);
		}
		{
			newLeafNode(this_NEWLINE_0, grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0());
		}
		    |
		this_SL_COMMENT_1=RULE_SL_COMMENT
		{
			$current.merge(this_SL_COMMENT_1);
		}
		{
			newLeafNode(this_SL_COMMENT_1, grammarAccess.getEOLAccess().getSL_COMMENTTerminalRuleCall_1());
		}
	)
;

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_NEWLINE : ('\r'? '\n' '\t'*)+;

RULE_INGEREDIENTSTRING : '- ' ('a'..'z'|'A'..'Z')* ',';

RULE_QSTRING : '- ' ('a'..'z'|'A'..'Z'|' '|'.'|'@'|'0'..'9'|'!'|'?'|'-'|':'|';'|'('|')')* (RULE_NEWLINE|RULE_SL_COMMENT);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
