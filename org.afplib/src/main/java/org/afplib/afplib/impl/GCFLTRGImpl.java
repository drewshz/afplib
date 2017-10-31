/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GCFLTRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCFLTRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GCFLTRGImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCFLTRGImpl#getYPOS <em>YPOS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCFLTRGImpl extends TripletImpl implements GCFLTRG {
	/**
	 * The default value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPOS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPOS()
	 * @generated
	 * @ordered
	 */
	protected Integer xpos = XPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPOS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPOS()
	 * @generated
	 * @ordered
	 */
	protected Integer ypos = YPOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCFLTRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGCFLTRG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXPOS() {
		return xpos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPOS(Integer newXPOS) {
		Integer oldXPOS = xpos;
		xpos = newXPOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCFLTRG__XPOS, oldXPOS, xpos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYPOS() {
		return ypos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPOS(Integer newYPOS) {
		Integer oldYPOS = ypos;
		ypos = newYPOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCFLTRG__YPOS, oldYPOS, ypos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GCFLTRG__XPOS:
				return getXPOS();
			case AfplibPackage.GCFLTRG__YPOS:
				return getYPOS();
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
			case AfplibPackage.GCFLTRG__XPOS:
				setXPOS((Integer)newValue);
				return;
			case AfplibPackage.GCFLTRG__YPOS:
				setYPOS((Integer)newValue);
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
			case AfplibPackage.GCFLTRG__XPOS:
				setXPOS(XPOS_EDEFAULT);
				return;
			case AfplibPackage.GCFLTRG__YPOS:
				setYPOS(YPOS_EDEFAULT);
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
			case AfplibPackage.GCFLTRG__XPOS:
				return XPOS_EDEFAULT == null ? xpos != null : !XPOS_EDEFAULT.equals(xpos);
			case AfplibPackage.GCFLTRG__YPOS:
				return YPOS_EDEFAULT == null ? ypos != null : !YPOS_EDEFAULT.equals(ypos);
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
		result.append(" (XPOS: ");
		result.append(xpos);
		result.append(", YPOS: ");
		result.append(ypos);
		result.append(')');
		return result.toString();
	}

} //GCFLTRGImpl
