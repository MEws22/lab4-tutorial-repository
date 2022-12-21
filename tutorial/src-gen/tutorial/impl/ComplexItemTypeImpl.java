/**
 */
package tutorial.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tutorial.ComplexItemType;
import tutorial.Component;
import tutorial.ItemConnection;
import tutorial.TutorialPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tutorial.impl.ComplexItemTypeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link tutorial.impl.ComplexItemTypeImpl#getItemConnections <em>Item Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexItemTypeImpl extends ItemTypeImpl implements ComplexItemType {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getItemConnections() <em>Item Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemConnection> itemConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.COMPLEX_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this,
					TutorialPackage.COMPLEX_ITEM_TYPE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemConnection> getItemConnections() {
		if (itemConnections == null) {
			itemConnections = new EObjectContainmentEList<ItemConnection>(ItemConnection.class, this,
					TutorialPackage.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS);
		}
		return itemConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TutorialPackage.COMPLEX_ITEM_TYPE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case TutorialPackage.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS:
			return ((InternalEList<?>) getItemConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TutorialPackage.COMPLEX_ITEM_TYPE__COMPONENTS:
			return getComponents();
		case TutorialPackage.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS:
			return getItemConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TutorialPackage.COMPLEX_ITEM_TYPE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case TutorialPackage.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS:
			getItemConnections().clear();
			getItemConnections().addAll((Collection<? extends ItemConnection>) newValue);
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
		case TutorialPackage.COMPLEX_ITEM_TYPE__COMPONENTS:
			getComponents().clear();
			return;
		case TutorialPackage.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS:
			getItemConnections().clear();
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
		case TutorialPackage.COMPLEX_ITEM_TYPE__COMPONENTS:
			return components != null && !components.isEmpty();
		case TutorialPackage.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS:
			return itemConnections != null && !itemConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexItemTypeImpl
