/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Author;
import org.xtext.example.mydsl.myDsl.FoodCategory;
import org.xtext.example.mydsl.myDsl.Ingredient;
import org.xtext.example.mydsl.myDsl.KitchenUtensil;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Rating;
import org.xtext.example.mydsl.myDsl.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getVegan <em>Vegan</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getKitchenUtensils <em>Kitchen Utensils</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getFoodCategory <em>Food Category</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RecipeImpl#getRatings <em>Ratings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected Author author;

  /**
   * The default value of the '{@link #getVegan() <em>Vegan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVegan()
   * @generated
   * @ordered
   */
  protected static final String VEGAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVegan() <em>Vegan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVegan()
   * @generated
   * @ordered
   */
  protected String vegan = VEGAN_EDEFAULT;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected static final int DIFFICULTY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected int difficulty = DIFFICULTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getKitchenUtensils() <em>Kitchen Utensils</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKitchenUtensils()
   * @generated
   * @ordered
   */
  protected EList<KitchenUtensil> kitchenUtensils;

  /**
   * The cached value of the '{@link #getFoodCategory() <em>Food Category</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoodCategory()
   * @generated
   * @ordered
   */
  protected EList<FoodCategory> foodCategory;

  /**
   * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredient()
   * @generated
   * @ordered
   */
  protected EList<Ingredient> ingredient;

  /**
   * The cached value of the '{@link #getRatings() <em>Ratings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatings()
   * @generated
   * @ordered
   */
  protected EList<Rating> ratings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecipeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.RECIPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RECIPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author getAuthor()
  {
    if (author != null && author.eIsProxy())
    {
      InternalEObject oldAuthor = (InternalEObject)author;
      author = (Author)eResolveProxy(oldAuthor);
      if (author != oldAuthor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.RECIPE__AUTHOR, oldAuthor, author));
      }
    }
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author basicGetAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(Author newAuthor)
  {
    Author oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RECIPE__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVegan()
  {
    return vegan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVegan(String newVegan)
  {
    String oldVegan = vegan;
    vegan = newVegan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RECIPE__VEGAN, oldVegan, vegan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RECIPE__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDifficulty()
  {
    return difficulty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDifficulty(int newDifficulty)
  {
    int oldDifficulty = difficulty;
    difficulty = newDifficulty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RECIPE__DIFFICULTY, oldDifficulty, difficulty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KitchenUtensil> getKitchenUtensils()
  {
    if (kitchenUtensils == null)
    {
      kitchenUtensils = new EObjectContainmentEList<KitchenUtensil>(KitchenUtensil.class, this, MyDslPackage.RECIPE__KITCHEN_UTENSILS);
    }
    return kitchenUtensils;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FoodCategory> getFoodCategory()
  {
    if (foodCategory == null)
    {
      foodCategory = new EObjectContainmentEList<FoodCategory>(FoodCategory.class, this, MyDslPackage.RECIPE__FOOD_CATEGORY);
    }
    return foodCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ingredient> getIngredient()
  {
    if (ingredient == null)
    {
      ingredient = new EObjectContainmentEList<Ingredient>(Ingredient.class, this, MyDslPackage.RECIPE__INGREDIENT);
    }
    return ingredient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rating> getRatings()
  {
    if (ratings == null)
    {
      ratings = new EObjectContainmentEList<Rating>(Rating.class, this, MyDslPackage.RECIPE__RATINGS);
    }
    return ratings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.RECIPE__KITCHEN_UTENSILS:
        return ((InternalEList<?>)getKitchenUtensils()).basicRemove(otherEnd, msgs);
      case MyDslPackage.RECIPE__FOOD_CATEGORY:
        return ((InternalEList<?>)getFoodCategory()).basicRemove(otherEnd, msgs);
      case MyDslPackage.RECIPE__INGREDIENT:
        return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
      case MyDslPackage.RECIPE__RATINGS:
        return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.RECIPE__NAME:
        return getName();
      case MyDslPackage.RECIPE__AUTHOR:
        if (resolve) return getAuthor();
        return basicGetAuthor();
      case MyDslPackage.RECIPE__VEGAN:
        return getVegan();
      case MyDslPackage.RECIPE__DURATION:
        return getDuration();
      case MyDslPackage.RECIPE__DIFFICULTY:
        return getDifficulty();
      case MyDslPackage.RECIPE__KITCHEN_UTENSILS:
        return getKitchenUtensils();
      case MyDslPackage.RECIPE__FOOD_CATEGORY:
        return getFoodCategory();
      case MyDslPackage.RECIPE__INGREDIENT:
        return getIngredient();
      case MyDslPackage.RECIPE__RATINGS:
        return getRatings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RECIPE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.RECIPE__AUTHOR:
        setAuthor((Author)newValue);
        return;
      case MyDslPackage.RECIPE__VEGAN:
        setVegan((String)newValue);
        return;
      case MyDslPackage.RECIPE__DURATION:
        setDuration((Integer)newValue);
        return;
      case MyDslPackage.RECIPE__DIFFICULTY:
        setDifficulty((Integer)newValue);
        return;
      case MyDslPackage.RECIPE__KITCHEN_UTENSILS:
        getKitchenUtensils().clear();
        getKitchenUtensils().addAll((Collection<? extends KitchenUtensil>)newValue);
        return;
      case MyDslPackage.RECIPE__FOOD_CATEGORY:
        getFoodCategory().clear();
        getFoodCategory().addAll((Collection<? extends FoodCategory>)newValue);
        return;
      case MyDslPackage.RECIPE__INGREDIENT:
        getIngredient().clear();
        getIngredient().addAll((Collection<? extends Ingredient>)newValue);
        return;
      case MyDslPackage.RECIPE__RATINGS:
        getRatings().clear();
        getRatings().addAll((Collection<? extends Rating>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RECIPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.RECIPE__AUTHOR:
        setAuthor((Author)null);
        return;
      case MyDslPackage.RECIPE__VEGAN:
        setVegan(VEGAN_EDEFAULT);
        return;
      case MyDslPackage.RECIPE__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case MyDslPackage.RECIPE__DIFFICULTY:
        setDifficulty(DIFFICULTY_EDEFAULT);
        return;
      case MyDslPackage.RECIPE__KITCHEN_UTENSILS:
        getKitchenUtensils().clear();
        return;
      case MyDslPackage.RECIPE__FOOD_CATEGORY:
        getFoodCategory().clear();
        return;
      case MyDslPackage.RECIPE__INGREDIENT:
        getIngredient().clear();
        return;
      case MyDslPackage.RECIPE__RATINGS:
        getRatings().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RECIPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.RECIPE__AUTHOR:
        return author != null;
      case MyDslPackage.RECIPE__VEGAN:
        return VEGAN_EDEFAULT == null ? vegan != null : !VEGAN_EDEFAULT.equals(vegan);
      case MyDslPackage.RECIPE__DURATION:
        return duration != DURATION_EDEFAULT;
      case MyDslPackage.RECIPE__DIFFICULTY:
        return difficulty != DIFFICULTY_EDEFAULT;
      case MyDslPackage.RECIPE__KITCHEN_UTENSILS:
        return kitchenUtensils != null && !kitchenUtensils.isEmpty();
      case MyDslPackage.RECIPE__FOOD_CATEGORY:
        return foodCategory != null && !foodCategory.isEmpty();
      case MyDslPackage.RECIPE__INGREDIENT:
        return ingredient != null && !ingredient.isEmpty();
      case MyDslPackage.RECIPE__RATINGS:
        return ratings != null && !ratings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", vegan: ");
    result.append(vegan);
    result.append(", duration: ");
    result.append(duration);
    result.append(", difficulty: ");
    result.append(difficulty);
    result.append(')');
    return result.toString();
  }

} //RecipeImpl
