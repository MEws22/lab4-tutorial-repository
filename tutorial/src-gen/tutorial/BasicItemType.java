/**
 */
package tutorial;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tutorial.BasicItemType#getMaterial <em>Material</em>}</li>
 *   <li>{@link tutorial.BasicItemType#getShape <em>Shape</em>}</li>
 *   <li>{@link tutorial.BasicItemType#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see tutorial.TutorialPackage#getBasicItemType()
 * @model
 * @generated
 */
public interface BasicItemType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * The literals are from the enumeration {@link tutorial.Material}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see tutorial.Material
	 * @see #setMaterial(Material)
	 * @see tutorial.TutorialPackage#getBasicItemType_Material()
	 * @model required="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link tutorial.BasicItemType#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see tutorial.Material
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(Shape)
	 * @see tutorial.TutorialPackage#getBasicItemType_Shape()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link tutorial.BasicItemType#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Color)
	 * @see tutorial.TutorialPackage#getBasicItemType_Color()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link tutorial.BasicItemType#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // BasicItemType
