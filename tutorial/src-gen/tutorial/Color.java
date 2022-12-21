/**
 */
package tutorial;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tutorial.Color#getName <em>Name</em>}</li>
 *   <li>{@link tutorial.Color#getRed <em>Red</em>}</li>
 *   <li>{@link tutorial.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link tutorial.Color#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see tutorial.TutorialPackage#getColor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rgbValues'"
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tutorial.TutorialPackage#getColor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tutorial.Color#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see tutorial.TutorialPackage#getColor_Red()
	 * @model required="true"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link tutorial.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see tutorial.TutorialPackage#getColor_Green()
	 * @model required="true"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link tutorial.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see tutorial.TutorialPackage#getColor_Blue()
	 * @model required="true"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link tutorial.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tred &gt;= 0 and red &lt;= 255 \n\t\t\tand green &gt;= 0 and green &lt;= 255\n\t\t\tand blue &gt;= 0 and blue &lt;= 255\n\t\t'"
	 * @generated
	 */
	boolean rgbValues(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Color
