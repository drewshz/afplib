/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MGO#getRG <em>RG</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMGO()
 * @model
 * @generated
 */
public interface MGO extends SF {
	/**
	 * Returns the value of the '<em><b>RG</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.MGORG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getMGO_RG()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<MGORG> getRG();

} // MGO
