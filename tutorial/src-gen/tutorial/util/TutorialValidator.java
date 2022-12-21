/**
 */
package tutorial.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tutorial.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tutorial.TutorialPackage
 * @generated
 */
public class TutorialValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TutorialValidator INSTANCE = new TutorialValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tutorial";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Rgb Values' of 'Color'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COLOR__RGB_VALUES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Item Type Basic' of 'Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT__ITEM_TYPE_BASIC = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Marker On Itemtype' of 'Item Connection'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM_CONNECTION__MARKER_ON_ITEMTYPE = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TutorialValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TutorialPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TutorialPackage.FACTORY:
			return validateFactory((Factory) value, diagnostics, context);
		case TutorialPackage.ITEM_TYPE:
			return validateItemType((ItemType) value, diagnostics, context);
		case TutorialPackage.COMPLEX_ITEM_TYPE:
			return validateComplexItemType((ComplexItemType) value, diagnostics, context);
		case TutorialPackage.BASIC_ITEM_TYPE:
			return validateBasicItemType((BasicItemType) value, diagnostics, context);
		case TutorialPackage.SHAPE:
			return validateShape((Shape) value, diagnostics, context);
		case TutorialPackage.CYLINDER_SHAPE:
			return validateCylinderShape((CylinderShape) value, diagnostics, context);
		case TutorialPackage.BLOCK_SHAPE:
			return validateBlockShape((BlockShape) value, diagnostics, context);
		case TutorialPackage.COLOR:
			return validateColor((Color) value, diagnostics, context);
		case TutorialPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case TutorialPackage.ITEM_CONNECTION:
			return validateItemConnection((ItemConnection) value, diagnostics, context);
		case TutorialPackage.MARKER:
			return validateMarker((Marker) value, diagnostics, context);
		case TutorialPackage.MATERIAL:
			return validateMaterial((Material) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactory(Factory factory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexItemType(ComplexItemType complexItemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicItemType(BasicItemType basicItemType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCylinderShape(CylinderShape cylinderShape, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cylinderShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockShape(BlockShape blockShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(color, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(color, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateColor_rgbValues(color, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rgbValues constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_rgbValues(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return color.rgbValues(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_itemTypeBasic(component, diagnostics, context);
		return result;
	}

	/**
	 * Validates the itemTypeBasic constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_itemTypeBasic(Component component, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component.itemTypeBasic(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemConnection(ItemConnection itemConnection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemConnection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(itemConnection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemConnection_markerOnItemtype(itemConnection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the markerOnItemtype constraint of '<em>Item Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemConnection_markerOnItemtype(ItemConnection itemConnection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return itemConnection.markerOnItemtype(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarker(Marker marker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(marker, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial(Material material, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TutorialValidator
