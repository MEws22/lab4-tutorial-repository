/**
 */
package tutorial;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tutorial.ComplexItemType#getComponents <em>Components</em>}</li>
 *   <li>{@link tutorial.ComplexItemType#getItemConnections <em>Item Connections</em>}</li>
 * </ul>
 *
 * @see tutorial.TutorialPackage#getComplexItemType()
 * @model
 * @generated
 */
public interface ComplexItemType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link tutorial.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see tutorial.TutorialPackage#getComplexItemType_Components()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Item Connections</b></em>' containment reference list.
	 * The list contents are of type {@link tutorial.ItemConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Connections</em>' containment reference list.
	 * @see tutorial.TutorialPackage#getComplexItemType_ItemConnections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ItemConnection> getItemConnections();

} // ComplexItemType
