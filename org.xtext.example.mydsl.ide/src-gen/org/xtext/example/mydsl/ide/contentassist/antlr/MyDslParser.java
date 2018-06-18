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
					put(grammarAccess.getDifficultyLevelAccess().getNameAlternatives_0(), "rule__DifficultyLevel__NameAlternatives_0");
					put(grammarAccess.getIngredientAccess().getAlternatives_0(), "rule__Ingredient__Alternatives_0");
					put(grammarAccess.getVeganismLevelAccess().getAlternatives(), "rule__VeganismLevel__Alternatives");
					put(grammarAccess.getUnitAccess().getAlternatives(), "rule__Unit__Alternatives");
					put(grammarAccess.getEOLAccess().getAlternatives(), "rule__EOL__Alternatives");
					put(grammarAccess.getRecipeManagerAccess().getGroup(), "rule__RecipeManager__Group__0");
					put(grammarAccess.getRecipeManagerAccess().getGroup_4(), "rule__RecipeManager__Group_4__0");
					put(grammarAccess.getAuthorAccess().getGroup(), "rule__Author__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup(), "rule__Recipe__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup_11(), "rule__Recipe__Group_11__0");
					put(grammarAccess.getRecipeAccess().getGroup_23(), "rule__Recipe__Group_23__0");
					put(grammarAccess.getRecipeAccess().getGroup_24(), "rule__Recipe__Group_24__0");
					put(grammarAccess.getIngredientAccess().getGroup(), "rule__Ingredient__Group__0");
					put(grammarAccess.getIngredientAccess().getGroup_0_0(), "rule__Ingredient__Group_0_0__0");
					put(grammarAccess.getIngredientAccess().getGroup_0_1(), "rule__Ingredient__Group_0_1__0");
					put(grammarAccess.getListElementAccess().getGroup(), "rule__ListElement__Group__0");
					put(grammarAccess.getRatingAccess().getGroup(), "rule__Rating__Group__0");
					put(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_2(), "rule__RecipeManager__AuthorsAssignment_2");
					put(grammarAccess.getRecipeManagerAccess().getAuthorsAssignment_3(), "rule__RecipeManager__AuthorsAssignment_3");
					put(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_2(), "rule__RecipeManager__RecipesAssignment_4_2");
					put(grammarAccess.getRecipeManagerAccess().getRecipesAssignment_4_3(), "rule__RecipeManager__RecipesAssignment_4_3");
					put(grammarAccess.getAuthorAccess().getNameAssignment_0(), "rule__Author__NameAssignment_0");
					put(grammarAccess.getAuthorAccess().getEmailAssignment_1(), "rule__Author__EmailAssignment_1");
					put(grammarAccess.getRecipeAccess().getNameAssignment_0(), "rule__Recipe__NameAssignment_0");
					put(grammarAccess.getRecipeAccess().getAuthorAssignment_2(), "rule__Recipe__AuthorAssignment_2");
					put(grammarAccess.getRecipeAccess().getVeganAssignment_4(), "rule__Recipe__VeganAssignment_4");
					put(grammarAccess.getRecipeAccess().getDurationAssignment_6(), "rule__Recipe__DurationAssignment_6");
					put(grammarAccess.getRecipeAccess().getDifficultyAssignment_9(), "rule__Recipe__DifficultyAssignment_9");
					put(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_11_2(), "rule__Recipe__KitchenUtensilsAssignment_11_2");
					put(grammarAccess.getRecipeAccess().getKitchenUtensilsAssignment_11_3(), "rule__Recipe__KitchenUtensilsAssignment_11_3");
					put(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_14(), "rule__Recipe__FoodCategoryAssignment_14");
					put(grammarAccess.getRecipeAccess().getFoodCategoryAssignment_15(), "rule__Recipe__FoodCategoryAssignment_15");
					put(grammarAccess.getRecipeAccess().getIngredientAssignment_18(), "rule__Recipe__IngredientAssignment_18");
					put(grammarAccess.getRecipeAccess().getIngredientAssignment_19(), "rule__Recipe__IngredientAssignment_19");
					put(grammarAccess.getRecipeAccess().getPreparationAssignment_22(), "rule__Recipe__PreparationAssignment_22");
					put(grammarAccess.getRecipeAccess().getVideoAssignment_23_2(), "rule__Recipe__VideoAssignment_23_2");
					put(grammarAccess.getRecipeAccess().getRatingsAssignment_24_2(), "rule__Recipe__RatingsAssignment_24_2");
					put(grammarAccess.getRecipeAccess().getRatingsAssignment_24_3(), "rule__Recipe__RatingsAssignment_24_3");
					put(grammarAccess.getKitchenUtensilAccess().getNameAssignment(), "rule__KitchenUtensil__NameAssignment");
					put(grammarAccess.getDifficultyLevelAccess().getNameAssignment(), "rule__DifficultyLevel__NameAssignment");
					put(grammarAccess.getFoodCategoryAccess().getNameAssignment(), "rule__FoodCategory__NameAssignment");
					put(grammarAccess.getIngredientAccess().getRecipeAssignment_0_0_1(), "rule__Ingredient__RecipeAssignment_0_0_1");
					put(grammarAccess.getIngredientAccess().getNameAssignment_0_1_0(), "rule__Ingredient__NameAssignment_0_1_0");
					put(grammarAccess.getIngredientAccess().getAmountAssignment_0_1_1(), "rule__Ingredient__AmountAssignment_0_1_1");
					put(grammarAccess.getIngredientAccess().getUnitAssignment_0_1_2(), "rule__Ingredient__UnitAssignment_0_1_2");
					put(grammarAccess.getIngredientAccess().getVeganismLevelAssignment_0_1_4(), "rule__Ingredient__VeganismLevelAssignment_0_1_4");
					put(grammarAccess.getListAccess().getElementsAssignment(), "rule__List__ElementsAssignment");
					put(grammarAccess.getListElementAccess().getOrderAssignment_0(), "rule__ListElement__OrderAssignment_0");
					put(grammarAccess.getListElementAccess().getCommentAssignment_2(), "rule__ListElement__CommentAssignment_2");
					put(grammarAccess.getVideoAccess().getNameAssignment(), "rule__Video__NameAssignment");
					put(grammarAccess.getRatingAccess().getStarsAssignment_0(), "rule__Rating__StarsAssignment_0");
					put(grammarAccess.getRatingAccess().getCommentAssignment_1(), "rule__Rating__CommentAssignment_1");
					put(grammarAccess.getRatingAccess().getAuthorAssignment_3(), "rule__Rating__AuthorAssignment_3");
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
