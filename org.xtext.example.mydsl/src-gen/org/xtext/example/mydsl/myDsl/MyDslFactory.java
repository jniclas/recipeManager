/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Recipe Manager</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipe Manager</em>'.
   * @generated
   */
  RecipeManager createRecipeManager();

  /**
   * Returns a new object of class '<em>Authorblock</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Authorblock</em>'.
   * @generated
   */
  Authorblock createAuthorblock();

  /**
   * Returns a new object of class '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Author</em>'.
   * @generated
   */
  Author createAuthor();

  /**
   * Returns a new object of class '<em>Recipeblock</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipeblock</em>'.
   * @generated
   */
  Recipeblock createRecipeblock();

  /**
   * Returns a new object of class '<em>Rating</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rating</em>'.
   * @generated
   */
  Rating createRating();

  /**
   * Returns a new object of class '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recipe</em>'.
   * @generated
   */
  Recipe createRecipe();

  /**
   * Returns a new object of class '<em>Kitchen Utensil</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kitchen Utensil</em>'.
   * @generated
   */
  KitchenUtensil createKitchenUtensil();

  /**
   * Returns a new object of class '<em>Food Category</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Food Category</em>'.
   * @generated
   */
  FoodCategory createFoodCategory();

  /**
   * Returns a new object of class '<em>Ingridient</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingridient</em>'.
   * @generated
   */
  Ingridient createIngridient();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory