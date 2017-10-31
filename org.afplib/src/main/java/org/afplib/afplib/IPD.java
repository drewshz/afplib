/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IPD#getIOCAdat <em>IOC Adat</em>}</li>
 *   <li>{@link org.afplib.afplib.IPD#getImageData <em>Image Data</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIPD()
 * @model
 * @generated
 */
public interface IPD extends SF {
	/**
	 * Returns the value of the '<em><b>IOC Adat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IOC Adat</em>' attribute.
	 * @see #setIOCAdat(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIPD_IOCAdat()
	 * @model
	 * @generated
	 */
	byte[] getIOCAdat();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IPD#getIOCAdat <em>IOC Adat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IOC Adat</em>' attribute.
	 * @see #getIOCAdat()
	 * @generated
	 */
	void setIOCAdat(byte[] value);

	/**
	 * Returns the value of the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Data</em>' attribute.
	 * @see #setImageData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIPD_ImageData()
	 * @model
	 * @generated
	 */
	byte[] getImageData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IPD#getImageData <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Data</em>' attribute.
	 * @see #getImageData()
	 * @generated
	 */
	void setImageData(byte[] value);

} // IPD
