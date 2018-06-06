/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rating#getStars <em>Stars</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rating#getComment <em>Comment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rating#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends EObject
{
  /**
   * Returns the value of the '<em><b>Stars</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stars</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stars</em>' attribute.
   * @see #setStars(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRating_Stars()
   * @model
   * @generated
   */
  int getStars();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rating#getStars <em>Stars</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stars</em>' attribute.
   * @see #getStars()
   * @generated
   */
  void setStars(int value);

  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRating_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rating#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' reference.
   * @see #setAuthor(Author)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRating_Author()
   * @model
   * @generated
   */
  Author getAuthor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rating#getAuthor <em>Author</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(Author value);

} // Rating
