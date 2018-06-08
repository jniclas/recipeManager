/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.Author;
import org.xtext.example.mydsl.myDsl.DifficultyLevel;
import org.xtext.example.mydsl.myDsl.FoodCategory;
import org.xtext.example.mydsl.myDsl.Ingredient;
import org.xtext.example.mydsl.myDsl.KitchenUtensil;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Rating;
import org.xtext.example.mydsl.myDsl.Recipe;
import org.xtext.example.mydsl.myDsl.RecipeManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recipeManagerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ratingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recipeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kitchenUtensilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass difficultyLevelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foodCategoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ingredientEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecipeManager()
  {
    return recipeManagerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipeManager_Authors()
  {
    return (EReference)recipeManagerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipeManager_Recipes()
  {
    return (EReference)recipeManagerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthor()
  {
    return authorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthor_Name()
  {
    return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthor_Email()
  {
    return (EAttribute)authorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRating()
  {
    return ratingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRating_Stars()
  {
    return (EAttribute)ratingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRating_Comment()
  {
    return (EAttribute)ratingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRating_Author()
  {
    return (EReference)ratingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecipe()
  {
    return recipeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Name()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Author()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Vegan()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecipe_Duration()
  {
    return (EAttribute)recipeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Difficulty()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_KitchenUtensils()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_FoodCategory()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Ingredient()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecipe_Ratings()
  {
    return (EReference)recipeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKitchenUtensil()
  {
    return kitchenUtensilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKitchenUtensil_Name()
  {
    return (EAttribute)kitchenUtensilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifficultyLevel()
  {
    return difficultyLevelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDifficultyLevel_Name()
  {
    return (EAttribute)difficultyLevelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFoodCategory()
  {
    return foodCategoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFoodCategory_Name()
  {
    return (EAttribute)foodCategoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIngredient()
  {
    return ingredientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Name()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Amount()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_Unit()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIngredient_VeganismLevel()
  {
    return (EAttribute)ingredientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIngredient_Recipe()
  {
    return (EReference)ingredientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    recipeManagerEClass = createEClass(RECIPE_MANAGER);
    createEReference(recipeManagerEClass, RECIPE_MANAGER__AUTHORS);
    createEReference(recipeManagerEClass, RECIPE_MANAGER__RECIPES);

    authorEClass = createEClass(AUTHOR);
    createEAttribute(authorEClass, AUTHOR__NAME);
    createEAttribute(authorEClass, AUTHOR__EMAIL);

    ratingEClass = createEClass(RATING);
    createEAttribute(ratingEClass, RATING__STARS);
    createEAttribute(ratingEClass, RATING__COMMENT);
    createEReference(ratingEClass, RATING__AUTHOR);

    recipeEClass = createEClass(RECIPE);
    createEAttribute(recipeEClass, RECIPE__NAME);
    createEReference(recipeEClass, RECIPE__AUTHOR);
    createEAttribute(recipeEClass, RECIPE__VEGAN);
    createEAttribute(recipeEClass, RECIPE__DURATION);
    createEReference(recipeEClass, RECIPE__DIFFICULTY);
    createEReference(recipeEClass, RECIPE__KITCHEN_UTENSILS);
    createEReference(recipeEClass, RECIPE__FOOD_CATEGORY);
    createEReference(recipeEClass, RECIPE__INGREDIENT);
    createEReference(recipeEClass, RECIPE__RATINGS);

    kitchenUtensilEClass = createEClass(KITCHEN_UTENSIL);
    createEAttribute(kitchenUtensilEClass, KITCHEN_UTENSIL__NAME);

    difficultyLevelEClass = createEClass(DIFFICULTY_LEVEL);
    createEAttribute(difficultyLevelEClass, DIFFICULTY_LEVEL__NAME);

    foodCategoryEClass = createEClass(FOOD_CATEGORY);
    createEAttribute(foodCategoryEClass, FOOD_CATEGORY__NAME);

    ingredientEClass = createEClass(INGREDIENT);
    createEAttribute(ingredientEClass, INGREDIENT__NAME);
    createEAttribute(ingredientEClass, INGREDIENT__AMOUNT);
    createEAttribute(ingredientEClass, INGREDIENT__UNIT);
    createEAttribute(ingredientEClass, INGREDIENT__VEGANISM_LEVEL);
    createEReference(ingredientEClass, INGREDIENT__RECIPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(recipeManagerEClass, RecipeManager.class, "RecipeManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecipeManager_Authors(), this.getAuthor(), null, "authors", null, 0, -1, RecipeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipeManager_Recipes(), this.getRecipe(), null, "recipes", null, 0, -1, RecipeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuthor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAuthor_Email(), ecorePackage.getEString(), "Email", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ratingEClass, Rating.class, "Rating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRating_Stars(), ecorePackage.getEInt(), "stars", null, 0, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRating_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRating_Author(), this.getAuthor(), null, "author", null, 0, 1, Rating.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecipe_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Author(), this.getAuthor(), null, "author", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Vegan(), ecorePackage.getEString(), "vegan", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecipe_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Difficulty(), this.getDifficultyLevel(), null, "difficulty", null, 0, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_KitchenUtensils(), this.getKitchenUtensil(), null, "kitchenUtensils", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_FoodCategory(), this.getFoodCategory(), null, "foodCategory", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Ingredient(), this.getIngredient(), null, "ingredient", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecipe_Ratings(), this.getRating(), null, "ratings", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kitchenUtensilEClass, KitchenUtensil.class, "KitchenUtensil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKitchenUtensil_Name(), ecorePackage.getEString(), "name", null, 0, 1, KitchenUtensil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(difficultyLevelEClass, DifficultyLevel.class, "DifficultyLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDifficultyLevel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DifficultyLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foodCategoryEClass, FoodCategory.class, "FoodCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFoodCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, FoodCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIngredient_VeganismLevel(), ecorePackage.getEString(), "veganismLevel", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIngredient_Recipe(), this.getRecipe(), null, "recipe", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
