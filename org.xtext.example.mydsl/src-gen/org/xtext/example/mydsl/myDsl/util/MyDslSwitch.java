/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.RECIPE_MANAGER:
      {
        RecipeManager recipeManager = (RecipeManager)theEObject;
        T result = caseRecipeManager(recipeManager);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.AUTHOR:
      {
        Author author = (Author)theEObject;
        T result = caseAuthor(author);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RECIPE:
      {
        Recipe recipe = (Recipe)theEObject;
        T result = caseRecipe(recipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.KITCHEN_UTENSIL:
      {
        KitchenUtensil kitchenUtensil = (KitchenUtensil)theEObject;
        T result = caseKitchenUtensil(kitchenUtensil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DIFFICULTY_LEVEL:
      {
        DifficultyLevel difficultyLevel = (DifficultyLevel)theEObject;
        T result = caseDifficultyLevel(difficultyLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOOD_CATEGORY:
      {
        FoodCategory foodCategory = (FoodCategory)theEObject;
        T result = caseFoodCategory(foodCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INGREDIENT:
      {
        Ingredient ingredient = (Ingredient)theEObject;
        T result = caseIngredient(ingredient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LIST_ELEMENT:
      {
        ListElement listElement = (ListElement)theEObject;
        T result = caseListElement(listElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VIDEO:
      {
        Video video = (Video)theEObject;
        T result = caseVideo(video);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RATING:
      {
        Rating rating = (Rating)theEObject;
        T result = caseRating(rating);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipe Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipe Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipeManager(RecipeManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Author</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuthor(Author object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Recipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecipe(Recipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kitchen Utensil</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kitchen Utensil</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKitchenUtensil(KitchenUtensil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Difficulty Level</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Difficulty Level</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifficultyLevel(DifficultyLevel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Food Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Food Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFoodCategory(FoodCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIngredient(Ingredient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListElement(ListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideo(Video object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rating</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rating</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRating(Rating object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
