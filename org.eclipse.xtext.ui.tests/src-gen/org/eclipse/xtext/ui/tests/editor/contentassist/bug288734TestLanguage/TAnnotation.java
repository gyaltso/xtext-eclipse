/**
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.bug288734TestLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug288734TestLanguage.TAnnotation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug288734TestLanguage.Bug288734TestLanguagePackage#getTAnnotation()
 * @model
 * @generated
 */
public interface TAnnotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.bug288734TestLanguage.Bug288734TestLanguagePackage#getTAnnotation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.bug288734TestLanguage.TAnnotation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // TAnnotation
