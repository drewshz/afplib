/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Object Font Descriptor Font Tech</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptorFontTech()
 * @model
 * @generated
 */
public enum DataObjectFontDescriptorFontTech implements Enumerator {
	/**
	 * The '<em><b>Const True Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_TRUE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_TRUE_TYPE(32, "ConstTrueType", "ConstTrueType");

	/**
	 * The '<em><b>Const True Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const True Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_TRUE_TYPE
	 * @model name="ConstTrueType"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_TRUE_TYPE_VALUE = 32;

	/**
	 * An array of all the '<em><b>Data Object Font Descriptor Font Tech</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataObjectFontDescriptorFontTech[] VALUES_ARRAY =
		new DataObjectFontDescriptorFontTech[] {
			CONST_TRUE_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Object Font Descriptor Font Tech</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataObjectFontDescriptorFontTech> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Object Font Descriptor Font Tech</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataObjectFontDescriptorFontTech get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataObjectFontDescriptorFontTech result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Object Font Descriptor Font Tech</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataObjectFontDescriptorFontTech getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataObjectFontDescriptorFontTech result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Object Font Descriptor Font Tech</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataObjectFontDescriptorFontTech get(int value) {
		switch (value) {
			case CONST_TRUE_TYPE_VALUE: return CONST_TRUE_TYPE;
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
	private DataObjectFontDescriptorFontTech(int value, String name, String literal) {
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
	
} //DataObjectFontDescriptorFontTech
