/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ResourceSectionNumber;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Section Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ResourceSectionNumberImpl#getResSNum <em>Res SNum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceSectionNumberImpl extends TripletImpl implements ResourceSectionNumber {
	/**
	 * The default value of the '{@link #getResSNum() <em>Res SNum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResSNum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_SNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResSNum() <em>Res SNum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResSNum()
	 * @generated
	 * @ordered
	 */
	protected Integer resSNum = RES_SNUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceSectionNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getResourceSectionNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getResSNum() {
		return resSNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResSNum(Integer newResSNum) {
		Integer oldResSNum = resSNum;
		resSNum = newResSNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_SECTION_NUMBER__RES_SNUM, oldResSNum, resSNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.RESOURCE_SECTION_NUMBER__RES_SNUM:
				return getResSNum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.RESOURCE_SECTION_NUMBER__RES_SNUM:
				setResSNum((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AfplibPackage.RESOURCE_SECTION_NUMBER__RES_SNUM:
				setResSNum(RES_SNUM_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AfplibPackage.RESOURCE_SECTION_NUMBER__RES_SNUM:
				return RES_SNUM_EDEFAULT == null ? resSNum != null : !RES_SNUM_EDEFAULT.equals(resSNum);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ResSNum: ");
		result.append(resSNum);
		result.append(')');
		return result.toString();
	}

} //ResourceSectionNumberImpl
