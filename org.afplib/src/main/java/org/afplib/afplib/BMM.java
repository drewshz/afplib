/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BMM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BMM#getMMName <em>MM Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BMM#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBMM()
 * @model
 * @generated
 */
public interface BMM extends SF {
	/**
	 * Returns the value of the '<em><b>MM Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MM Name</em>' attribute.
	 * @see #setMMName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBMM_MMName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getMMName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BMM#getMMName <em>MM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MM Name</em>' attribute.
	 * @see #getMMName()
	 * @generated
	 */
	void setMMName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBMM_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BMM
