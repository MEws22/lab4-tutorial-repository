/**
 */
package tutorial;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylinder Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tutorial.CylinderShape#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see tutorial.TutorialPackage#getCylinderShape()
 * @model
 * @generated
 */
public interface CylinderShape extends Shape {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see tutorial.TutorialPackage#getCylinderShape_Radius()
	 * @model required="true"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link tutorial.CylinderShape#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // CylinderShape
