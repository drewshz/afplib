/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ERG#getRGrpName <em>RGrp Name</em>}</li>
 *   <li>{@link org.afplib.afplib.ERG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getERG()
 * @model
 * @generated
 */
public interface ERG extends SF {
	/**
	 * Returns the value of the '<em><b>RGrp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RGrp Name</em>' attribute.
	 * @see #setRGrpName(String)
	 * @see org.afplib.afplib.AfplibPackage#getERG_RGrpName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getRGrpName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ERG#getRGrpName <em>RGrp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RGrp Name</em>' attribute.
	 * @see #getRGrpName()
	 * @generated
	 */
	void setRGrpName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getERG_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // ERG
