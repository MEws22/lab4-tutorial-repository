/**
 */
package tutorial;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tutorial.ItemConnection#getComponentA <em>Component A</em>}</li>
 *   <li>{@link tutorial.ItemConnection#getComponentB <em>Component B</em>}</li>
 *   <li>{@link tutorial.ItemConnection#getMarkerA <em>Marker A</em>}</li>
 *   <li>{@link tutorial.ItemConnection#getMarkerB <em>Marker B</em>}</li>
 * </ul>
 *
 * @see tutorial.TutorialPackage#getItemConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='markerOnItemtype'"
 * @generated
 */
public interface ItemConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Component A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component A</em>' reference.
	 * @see #setComponentA(Component)
	 * @see tutorial.TutorialPackage#getItemConnection_ComponentA()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentA();

	/**
	 * Sets the value of the '{@link tutorial.ItemConnection#getComponentA <em>Component A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component A</em>' reference.
	 * @see #getComponentA()
	 * @generated
	 */
	void setComponentA(Component value);

	/**
	 * Returns the value of the '<em><b>Component B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component B</em>' reference.
	 * @see #setComponentB(Component)
	 * @see tutorial.TutorialPackage#getItemConnection_ComponentB()
	 * @model required="true"
	 * @generated
	 */
	Component getComponentB();

	/**
	 * Sets the value of the '{@link tutorial.ItemConnection#getComponentB <em>Component B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component B</em>' reference.
	 * @see #getComponentB()
	 * @generated
	 */
	void setComponentB(Component value);

	/**
	 * Returns the value of the '<em><b>Marker A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker A</em>' reference.
	 * @see #setMarkerA(Marker)
	 * @see tutorial.TutorialPackage#getItemConnection_MarkerA()
	 * @model required="true"
	 * @generated
	 */
	Marker getMarkerA();

	/**
	 * Sets the value of the '{@link tutorial.ItemConnection#getMarkerA <em>Marker A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker A</em>' reference.
	 * @see #getMarkerA()
	 * @generated
	 */
	void setMarkerA(Marker value);

	/**
	 * Returns the value of the '<em><b>Marker B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker B</em>' reference.
	 * @see #setMarkerB(Marker)
	 * @see tutorial.TutorialPackage#getItemConnection_MarkerB()
	 * @model required="true"
	 * @generated
	 */
	Marker getMarkerB();

	/**
	 * Sets the value of the '{@link tutorial.ItemConnection#getMarkerB <em>Marker B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker B</em>' reference.
	 * @see #getMarkerB()
	 * @generated
	 */
	void setMarkerB(Marker value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tcomponentA.itemType.markers-&gt;exists(m: Marker | m = self.markerA)\n\t\t\tand componentB.itemType.markers-&gt;exists(m: Marker | m = self.markerB)\n\t\t'"
	 * @generated
	 */
	boolean markerOnItemtype(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ItemConnection
