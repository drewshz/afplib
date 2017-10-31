/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNC Yfr Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCYfrUnits()
 * @model
 * @generated
 */
public enum FNCYfrUnits implements Enumerator {
	/**
	 * The '<em><b>Const Noshaperesolutionprovided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NOSHAPERESOLUTIONPROVIDED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NOSHAPERESOLUTIONPROVIDED(0, "ConstNoshaperesolutionprovided", "ConstNoshaperesolutionprovided"),

	/**
	 * The '<em><b>Const240dpi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST240DPI_VALUE
	 * @generated
	 * @ordered
	 */
	CONST240DPI(2400, "Const240dpi", "Const240dpi"),

	/**
	 * The '<em><b>Const300dpi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST300DPI_VALUE
	 * @generated
	 * @ordered
	 */
	CONST300DPI(3000, "Const300dpi", "Const300dpi");

	/**
	 * The '<em><b>Const Noshaperesolutionprovided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Noshaperesolutionprovided</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NOSHAPERESOLUTIONPROVIDED
	 * @model name="ConstNoshaperesolutionprovided"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NOSHAPERESOLUTIONPROVIDED_VALUE = 0;

	/**
	 * The '<em><b>Const240dpi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const240dpi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST240DPI
	 * @model name="Const240dpi"
	 * @generated
	 * @ordered
	 */
	public static final int CONST240DPI_VALUE = 2400;

	/**
	 * The '<em><b>Const300dpi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const300dpi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST300DPI
	 * @model name="Const300dpi"
	 * @generated
	 * @ordered
	 */
	public static final int CONST300DPI_VALUE = 3000;

	/**
	 * An array of all the '<em><b>FNC Yfr Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNCYfrUnits[] VALUES_ARRAY =
		new FNCYfrUnits[] {
			CONST_NOSHAPERESOLUTIONPROVIDED,
			CONST240DPI,
			CONST300DPI,
		};

	/**
	 * A public read-only list of all the '<em><b>FNC Yfr Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNCYfrUnits> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNC Yfr Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCYfrUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCYfrUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Yfr Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCYfrUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCYfrUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Yfr Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCYfrUnits get(int value) {
		switch (value) {
			case CONST_NOSHAPERESOLUTIONPROVIDED_VALUE: return CONST_NOSHAPERESOLUTIONPROVIDED;
			case CONST240DPI_VALUE: return CONST240DPI;
			case CONST300DPI_VALUE: return CONST300DPI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FNCYfrUnits(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FNCYfrUnits
