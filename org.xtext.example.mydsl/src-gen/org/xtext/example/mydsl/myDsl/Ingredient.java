/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ingredient#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ingredient#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ingredient#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Ingredient#getVeganismLevel <em>Veganism Level</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends EObject
{
  /**
   * Returns the value of the '<em><b>Recipe</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipe</em>' reference.
   * @see #setRecipe(Recipe)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIngredient_Recipe()
   * @model
   * @generated
   */
  Recipe getRecipe();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ingredient#getRecipe <em>Recipe</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recipe</em>' reference.
   * @see #getRecipe()
   * @generated
   */
  void setRecipe(Recipe value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIngredient_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ingredient#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIngredient_Amount()
   * @model
   * @generated
   */
  int getAmount();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ingredient#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see #setUnit(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIngredient_Unit()
   * @model
   * @generated
   */
  String getUnit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ingredient#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see #getUnit()
   * @generated
   */
  void setUnit(String value);

  /**
   * Returns the value of the '<em><b>Veganism Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Veganism Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Veganism Level</em>' attribute.
   * @see #setVeganismLevel(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIngredient_VeganismLevel()
   * @model
   * @generated
   */
  String getVeganismLevel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Ingredient#getVeganismLevel <em>Veganism Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Veganism Level</em>' attribute.
   * @see #getVeganismLevel()
   * @generated
   */
  void setVeganismLevel(String value);

} // Ingredient
