/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getKitchenUtensilAccess().getNameAlternatives_0(), "rule__KitchenUtensil__NameAlternatives_0");
					put(grammarAccess.getIngredientAccess().getAlternatives(), "rule__Ingredient__Alternatives");
					put(grammarAccess.getVeganismLevelAccess().getAlternatives(), "rule__VeganismLevel__Alternatives");
					put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
					put(grammarAccess.getRecipeManagerAccess().getGroup(), "rule__RecipeManager__Group__0");
					put(grammarAccess.getAuthorblockAccess().getGroup(), "rule__Authorblock__Group__0");
					put(grammarAccess.getAuthorblockAccess().getGroup_2(), "rule__Authorblock__Group_2__0");
					put(grammarAccess.getAuthorAccess().getGroup(), "rule__Author__Group__0");
					put(grammarAccess.getAuthorAccess().getGroup_6(), "rule__Author__Group_6__0");
					put(grammarAccess.getAuthorAccess().getGroup_6_5(), "rule__Author__Group_6_5__0");
					put(grammarAccess.getRecipeblockAccess().getGroup(), "rule__Recipeblock__Group__0");
					put(grammarAccess.getRecipeblockAccess().getGroup_2(), "rule__Recipeblock__Group_2__0");
					put(grammarAccess.getRatingAccess().getGroup(), "rule__Rating__Group__0");
					put(grammarAccess.getRatingAccess().getGroup_5(), "rule__Rating__Group_5__0");
					put(grammarAccess.getRecipeAccess().getGroup(), "rule__Recipe__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup_19(), "rule__Recipe__Group_19__0");
					put(grammarAccess.getRecipeAccess().getGroup_19_4(), "rule__Recipe__Group_19_4__0");
					put(grammarAccess.getRecipeAccess().getGroup_20(), "rule__Recipe__Group_20__0");
					put(grammarAccess.getRecipeAccess().getGroup_20_4(), "rule__Recipe__Group_20_4__0");
					put(grammarAccess.getRecipeAccess().getGroup_25(), "rule__Recipe__Group_25__0");
					put(grammarAccess.getRecipeAccess().getGroup_27(), "rule__Recipe__Group_27__0");
					put(grammarAccess.getRecipeAccess().getGroup_27_5(), "rule__Recipe__Group_27_5__0");
					put(grammarAccess.getIngredientAccess().getGroup_0(), "rule__Ingredient__Group_0__0");
					put(grammarAccess.getRecipeManagerAccess().getAuthorblockAssignment_2(), "rule__RecipeManager__AuthorblockAssignment_2");
					put(grammarAccess.getRecipeManagerAccess().getRecipeblockAssignment_5(), "rule__RecipeManager__RecipeblockAssignment_5");
					put(grammarAccess.getAuthorblockAccess().getAuthorsAssignment_1(), "rule__Authorblock__AuthorsAssignment_1");
					put(grammarAccess.getAuthorblockAccess().getAuthorsAssignment_2_1(), "rule__Authorblock__AuthorsAssignment_2_1");
					put(grammarAccess.getAuthorAccess().getNameAssignment_0(), "rule__Author__NameAssignment_0");
					put(grammarAccess.getAuthorAccess().getEmailAssignment_5(), "rule__Author__EmailAssignment_5");
					put(grammarAccess.getAuthorAccess().getCallsAssignment_6_4(), "rule__Author__CallsAssignment_6_4");
					put(grammarAccess.getAuthorAccess().getCallsAssignment_6_5_1(), "rule__Author__CallsAssignment_6_5_1");
					put(grammarAccess.getRecipeblockAccess().getRecipesAssignment_1(), "rule__Recipeblock__RecipesAssignment_1");
					put(grammarAccess.getRecipeblockAccess().getRecipesAssignment_2_1(), "rule__Recipeblock__RecipesAssignment_2_1");
					put(grammarAccess.getRatingAccess().getStarsAssignment_3(), "rule__Rating__StarsAssignment_3");
					put(grammarAccess.getRatingAccess().getCommentAssignment_5_2(), "rule__Rating__CommentAssignment_5_2");
					put(grammarAccess.getRatingAccess().getAuthorAssignment_8(), "rule__Rating__AuthorAssignment_8");
					put(grammarAccess.getRecipeAccess().getNameAssignment_0(), "rule__Recipe__NameAssignment_0");
					put(grammarAccess.getRecipeAccess().getAuthorAssignment_5(), "rule__Recipe__AuthorAssignment_5");
					put(grammarAccess.getRecipeAccess().getVeganAssignment_9(), "rule__Recipe__VeganAssignment_9");
					put(grammarAccess.getRecipeAccess().getDurationAssignment_13(), "rule__Recipe__DurationAssignment_13");
					put(grammarAccess.getRecipeAccess().getDifficultyAssignment_17(), "rule__Recipe__DifficultyAssignment_17");
					put(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_3(), "rule__Recipe__KitchenUtensilsAssignment_19_3");
					put(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_19_4_1(), "rule__Recipe__KitchenUtensilsAssignment_19_4_1");
					put(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_3(), "rule__Recipe__FoodCategoryAssignment_20_3");
					put(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_20_4_1(), "rule__Recipe__FoodCategoryAssignment_20_4_1");
					put(grammarAccess.getRecipeAccess().getIngredientAssignment_24(), "rule__Recipe__IngredientAssignment_24");
					put(grammarAccess.getRecipeAccess().getIngredientAssignment_25_1(), "rule__Recipe__IngredientAssignment_25_1");
					put(grammarAccess.getRecipeAccess().getRatingsAssignment_27_4(), "rule__Recipe__RatingsAssignment_27_4");
					put(grammarAccess.getRecipeAccess().getRatingsAssignment_27_5_1(), "rule__Recipe__RatingsAssignment_27_5_1");
					put(grammarAccess.getKitchenUtensilAccess().getNameAssignment(), "rule__KitchenUtensil__NameAssignment");
					put(grammarAccess.getFoodCategoryAccess().getNameAssignment(), "rule__FoodCategory__NameAssignment");
					put(grammarAccess.getIngredientAccess().getNameAssignment_0_3(), "rule__Ingredient__NameAssignment_0_3");
					put(grammarAccess.getIngredientAccess().getAmountAssignment_0_7(), "rule__Ingredient__AmountAssignment_0_7");
					put(grammarAccess.getIngredientAccess().getUnitAssignment_0_11(), "rule__Ingredient__UnitAssignment_0_11");
					put(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_15(), "rule__Ingredient__VeganismLevelAssignment_0_15");
					put(grammarAccess.getIngredientAccess().getRecipeAssignment_1(), "rule__Ingredient__RecipeAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
