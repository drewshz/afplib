/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PTX#getCS <em>CS</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPTX()
 * @model
 * @generated
 */
public interface PTX extends SF {
	/**
	 * Returns the value of the '<em><b>CS</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getPTX_CS()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Triplet> getCS();

} // PTX
