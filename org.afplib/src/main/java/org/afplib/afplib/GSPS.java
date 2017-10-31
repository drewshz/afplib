/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSPS#getLCID <em>LCID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSPS()
 * @model
 * @generated
 */
public interface GSPS extends Triplet {
	/**
	 * Returns the value of the '<em><b>LCID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LCID</em>' attribute.
	 * @see #setLCID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSPS_LCID()
	 * @model required="true"
	 * @generated
	 */
	Integer getLCID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSPS#getLCID <em>LCID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCID</em>' attribute.
	 * @see #getLCID()
	 * @generated
	 */
	void setLCID(Integer value);

} // GSPS
