/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.Recipe
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.RecipeManager

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MyDslValidator extends AbstractMyDslValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def NoSelfRating(Recipe recipe) {
    	var ratings = recipe.ratings;
    	for (var i = 0; i < ratings.length; i++) {
      		if (ratings.get(i).getAuthor().equals(recipe.getAuthor())) {
        		error("Self rating is not allowed!", 
          			MyDslPackage.Literals.RECIPE__RATINGS, i);
          			
          			}
      }
   }
   
   @Check
   def onlyOneRatingPerRecipeByAuthor(Recipe recipe) {
   		var ratings = recipe.ratings;
   		for (var i = 0; i < ratings.length; i++) {
   			var author1 = ratings.get(i).getAuthor();
   			for (var j = i+1; i < ratings.length; i++) {
   				var author2 = ratings.get(j).getAuthor();
   				if (author1.equals(author2))
   					error("You can only make one rating per recipe!", 
          			MyDslPackage.Literals.RECIPE__RATINGS, j);
   			}
   		}
   }
   
   @Check
   def recipeNotContainingItSelf(Recipe recipe) {
   		var recipeName = recipe.name;
   		var ingredients = recipe.ingredient;
   		for (var i = 0; i < ingredients.length; i++) {
   			var ingredientName = ingredients.get(i).name;
   			// remove blanks and hyphens and commas
   			ingredientName = ingredientName.replaceAll("\\-\\s","");
   			ingredientName = ingredientName.replaceAll(",","");
   			if(recipeName.equals(ingredientName)) {
   				error("A recipe cannot contain itself!", 
          			MyDslPackage.Literals.RECIPE__INGREDIENT, i);
          	}
   		}
   }
   
   @Check
   def recipeHasAuthor(Recipe recipe) {
   		if (recipe.author === null) {
   			error("Every recipe must have an author!", 
	          			MyDslPackage.Literals.RECIPE__AUTHOR);
	 	}
   }
   
   @Check
   def recipeHasIngredient(Recipe recipe) {
   		if (recipe.ingredient === null) {
   			error("Every recipe must have an ingredient!", 
	          			MyDslPackage.Literals.RECIPE__INGREDIENT);
	 	}
   }
   
   @Check
   def recipeIsIngredientOfRecipe(Recipe recipe) {
   		var ingredients = recipe.ingredient;
   		// if there exists only one ingredient
   		if (ingredients.length == 1) {
   			var ingredientName = ingredients.get(0).name;
   			// if it is a recipe, name is null
   			if (ingredientName === null) {
   				error("A recipe must not copy another recipe! Please add a second ingredient", 
          			MyDslPackage.Literals.RECIPE__INGREDIENT);
   			}
   		}
   }
}
