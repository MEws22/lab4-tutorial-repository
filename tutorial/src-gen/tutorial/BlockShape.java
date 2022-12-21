/**
 */
package tutorial;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tutorial.BlockShape#getWidth <em>Width</em>}</li>
 *   <li>{@link tutorial.BlockShape#getHeigth <em>Heigth</em>}</li>
 * </ul>
 *
 * @see tutorial.TutorialPackage#getBlockShape()
 * @model
 * @generated
 */
public interface BlockShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see tutorial.TutorialPackage#getBlockShape_Width()
	 * @model required="true"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link tutorial.BlockShape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heigth</em>' attribute.
	 * @see #setHeigth(double)
	 * @see tutorial.TutorialPackage#getBlockShape_Heigth()
	 * @model required="true"
	 * @generated
	 */
	double getHeigth();

	/**
	 * Sets the value of the '{@link tutorial.BlockShape#getHeigth <em>Heigth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heigth</em>' attribute.
	 * @see #getHeigth()
	 * @generated
	 */
	void setHeigth(double value);

} // BlockShape
