/**
 */
package tutorial.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tutorial.BasicItemType;
import tutorial.Color;
import tutorial.Material;
import tutorial.Shape;
import tutorial.TutorialPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tutorial.impl.BasicItemTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link tutorial.impl.BasicItemTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link tutorial.impl.BasicItemTypeImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicItemTypeImpl extends ItemTypeImpl implements BasicItemType {
	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final Material MATERIAL_EDEFAULT = Material.WOOD;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material material = MATERIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected Shape shape;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.BASIC_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaterial(Material newMaterial) {
		Material oldMaterial = material;
		material = newMaterial == null ? MATERIAL_EDEFAULT : newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.BASIC_ITEM_TYPE__MATERIAL,
					oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(Shape newShape, NotificationChain msgs) {
		Shape oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TutorialPackage.BASIC_ITEM_TYPE__SHAPE, oldShape, newShape);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShape(Shape newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject) shape).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TutorialPackage.BASIC_ITEM_TYPE__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject) newShape).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TutorialPackage.BASIC_ITEM_TYPE__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.BASIC_ITEM_TYPE__SHAPE, newShape,
					newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Color newColor, NotificationChain msgs) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TutorialPackage.BASIC_ITEM_TYPE__COLOR, oldColor, newColor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject) color).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TutorialPackage.BASIC_ITEM_TYPE__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject) newColor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TutorialPackage.BASIC_ITEM_TYPE__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.BASIC_ITEM_TYPE__COLOR, newColor,
					newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TutorialPackage.BASIC_ITEM_TYPE__SHAPE:
			return basicSetShape(null, msgs);
		case TutorialPackage.BASIC_ITEM_TYPE__COLOR:
			return basicSetColor(null, msgs);
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
		case TutorialPackage.BASIC_ITEM_TYPE__MATERIAL:
			return getMaterial();
		case TutorialPackage.BASIC_ITEM_TYPE__SHAPE:
			return getShape();
		case TutorialPackage.BASIC_ITEM_TYPE__COLOR:
			return getColor();
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
		case TutorialPackage.BASIC_ITEM_TYPE__MATERIAL:
			setMaterial((Material) newValue);
			return;
		case TutorialPackage.BASIC_ITEM_TYPE__SHAPE:
			setShape((Shape) newValue);
			return;
		case TutorialPackage.BASIC_ITEM_TYPE__COLOR:
			setColor((Color) newValue);
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
		case TutorialPackage.BASIC_ITEM_TYPE__MATERIAL:
			setMaterial(MATERIAL_EDEFAULT);
			return;
		case TutorialPackage.BASIC_ITEM_TYPE__SHAPE:
			setShape((Shape) null);
			return;
		case TutorialPackage.BASIC_ITEM_TYPE__COLOR:
			setColor((Color) null);
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
		case TutorialPackage.BASIC_ITEM_TYPE__MATERIAL:
			return material != MATERIAL_EDEFAULT;
		case TutorialPackage.BASIC_ITEM_TYPE__SHAPE:
			return shape != null;
		case TutorialPackage.BASIC_ITEM_TYPE__COLOR:
			return color != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (material: ");
		result.append(material);
		result.append(')');
		return result.toString();
	}

} //BasicItemTypeImpl
