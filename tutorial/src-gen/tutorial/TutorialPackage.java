/**
 */
package tutorial;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tutorial.TutorialFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface TutorialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tutorial";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tutorial";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tutorial";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TutorialPackage eINSTANCE = tutorial.impl.TutorialPackageImpl.init();

	/**
	 * The meta object id for the '{@link tutorial.impl.FactoryImpl <em>Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.FactoryImpl
	 * @see tutorial.impl.TutorialPackageImpl#getFactory()
	 * @generated
	 */
	int FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Item Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY__ITEM_TYPES = 1;

	/**
	 * The number of structural features of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.ItemTypeImpl
	 * @see tutorial.impl.TutorialPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__MARKERS = 1;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.ComplexItemTypeImpl <em>Complex Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.ComplexItemTypeImpl
	 * @see tutorial.impl.TutorialPackageImpl#getComplexItemType()
	 * @generated
	 */
	int COMPLEX_ITEM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__NAME = ITEM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__MARKERS = ITEM_TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__COMPONENTS = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS = ITEM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ITEM_TYPE_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.BasicItemTypeImpl <em>Basic Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.BasicItemTypeImpl
	 * @see tutorial.impl.TutorialPackageImpl#getBasicItemType()
	 * @generated
	 */
	int BASIC_ITEM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE__NAME = ITEM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE__MARKERS = ITEM_TYPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE__MATERIAL = ITEM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE__SHAPE = ITEM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE__COLOR = ITEM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Basic Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE_FEATURE_COUNT = ITEM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Basic Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ITEM_TYPE_OPERATION_COUNT = ITEM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.ShapeImpl
	 * @see tutorial.impl.TutorialPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.CylinderShapeImpl <em>Cylinder Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.CylinderShapeImpl
	 * @see tutorial.impl.TutorialPackageImpl#getCylinderShape()
	 * @generated
	 */
	int CYLINDER_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_SHAPE__LENGTH = SHAPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_SHAPE__RADIUS = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cylinder Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cylinder Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.BlockShapeImpl <em>Block Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.BlockShapeImpl
	 * @see tutorial.impl.TutorialPackageImpl#getBlockShape()
	 * @generated
	 */
	int BLOCK_SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SHAPE__LENGTH = SHAPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SHAPE__WIDTH = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SHAPE__HEIGTH = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SHAPE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tutorial.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.ColorImpl
	 * @see tutorial.impl.TutorialPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RED = 1;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__GREEN = 2;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__BLUE = 3;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Rgb Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR___RGB_VALUES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tutorial.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.ComponentImpl
	 * @see tutorial.impl.TutorialPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ITEM_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Item Type Basic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___ITEM_TYPE_BASIC__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tutorial.impl.ItemConnectionImpl <em>Item Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.ItemConnectionImpl
	 * @see tutorial.impl.TutorialPackageImpl#getItemConnection()
	 * @generated
	 */
	int ITEM_CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Component A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION__COMPONENT_A = 0;

	/**
	 * The feature id for the '<em><b>Component B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION__COMPONENT_B = 1;

	/**
	 * The feature id for the '<em><b>Marker A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION__MARKER_A = 2;

	/**
	 * The feature id for the '<em><b>Marker B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION__MARKER_B = 3;

	/**
	 * The number of structural features of the '<em>Item Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Marker On Itemtype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION___MARKER_ON_ITEMTYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Item Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONNECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tutorial.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.impl.MarkerImpl
	 * @see tutorial.impl.TutorialPackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tutorial.Material <em>Material</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tutorial.Material
	 * @see tutorial.impl.TutorialPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 11;

	/**
	 * Returns the meta object for class '{@link tutorial.Factory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factory</em>'.
	 * @see tutorial.Factory
	 * @generated
	 */
	EClass getFactory();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Factory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tutorial.Factory#getName()
	 * @see #getFactory()
	 * @generated
	 */
	EAttribute getFactory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tutorial.Factory#getItemTypes <em>Item Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Types</em>'.
	 * @see tutorial.Factory#getItemTypes()
	 * @see #getFactory()
	 * @generated
	 */
	EReference getFactory_ItemTypes();

	/**
	 * Returns the meta object for class '{@link tutorial.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see tutorial.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.ItemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tutorial.ItemType#getName()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tutorial.ItemType#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see tutorial.ItemType#getMarkers()
	 * @see #getItemType()
	 * @generated
	 */
	EReference getItemType_Markers();

	/**
	 * Returns the meta object for class '{@link tutorial.ComplexItemType <em>Complex Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Item Type</em>'.
	 * @see tutorial.ComplexItemType
	 * @generated
	 */
	EClass getComplexItemType();

	/**
	 * Returns the meta object for the containment reference list '{@link tutorial.ComplexItemType#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see tutorial.ComplexItemType#getComponents()
	 * @see #getComplexItemType()
	 * @generated
	 */
	EReference getComplexItemType_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link tutorial.ComplexItemType#getItemConnections <em>Item Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Connections</em>'.
	 * @see tutorial.ComplexItemType#getItemConnections()
	 * @see #getComplexItemType()
	 * @generated
	 */
	EReference getComplexItemType_ItemConnections();

	/**
	 * Returns the meta object for class '{@link tutorial.BasicItemType <em>Basic Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Item Type</em>'.
	 * @see tutorial.BasicItemType
	 * @generated
	 */
	EClass getBasicItemType();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.BasicItemType#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material</em>'.
	 * @see tutorial.BasicItemType#getMaterial()
	 * @see #getBasicItemType()
	 * @generated
	 */
	EAttribute getBasicItemType_Material();

	/**
	 * Returns the meta object for the containment reference '{@link tutorial.BasicItemType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see tutorial.BasicItemType#getShape()
	 * @see #getBasicItemType()
	 * @generated
	 */
	EReference getBasicItemType_Shape();

	/**
	 * Returns the meta object for the containment reference '{@link tutorial.BasicItemType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see tutorial.BasicItemType#getColor()
	 * @see #getBasicItemType()
	 * @generated
	 */
	EReference getBasicItemType_Color();

	/**
	 * Returns the meta object for class '{@link tutorial.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see tutorial.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Shape#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see tutorial.Shape#getLength()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Length();

	/**
	 * Returns the meta object for class '{@link tutorial.CylinderShape <em>Cylinder Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder Shape</em>'.
	 * @see tutorial.CylinderShape
	 * @generated
	 */
	EClass getCylinderShape();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.CylinderShape#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see tutorial.CylinderShape#getRadius()
	 * @see #getCylinderShape()
	 * @generated
	 */
	EAttribute getCylinderShape_Radius();

	/**
	 * Returns the meta object for class '{@link tutorial.BlockShape <em>Block Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Shape</em>'.
	 * @see tutorial.BlockShape
	 * @generated
	 */
	EClass getBlockShape();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.BlockShape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see tutorial.BlockShape#getWidth()
	 * @see #getBlockShape()
	 * @generated
	 */
	EAttribute getBlockShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.BlockShape#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see tutorial.BlockShape#getHeigth()
	 * @see #getBlockShape()
	 * @generated
	 */
	EAttribute getBlockShape_Heigth();

	/**
	 * Returns the meta object for class '{@link tutorial.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see tutorial.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Color#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tutorial.Color#getName()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Name();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Color#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see tutorial.Color#getRed()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Red();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Color#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see tutorial.Color#getGreen()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Green();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Color#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see tutorial.Color#getBlue()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Blue();

	/**
	 * Returns the meta object for the '{@link tutorial.Color#rgbValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rgb Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rgb Values</em>' operation.
	 * @see tutorial.Color#rgbValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getColor__RgbValues__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link tutorial.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see tutorial.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tutorial.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the reference '{@link tutorial.Component#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see tutorial.Component#getItemType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ItemType();

	/**
	 * Returns the meta object for the '{@link tutorial.Component#itemTypeBasic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Item Type Basic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Type Basic</em>' operation.
	 * @see tutorial.Component#itemTypeBasic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComponent__ItemTypeBasic__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link tutorial.ItemConnection <em>Item Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Connection</em>'.
	 * @see tutorial.ItemConnection
	 * @generated
	 */
	EClass getItemConnection();

	/**
	 * Returns the meta object for the reference '{@link tutorial.ItemConnection#getComponentA <em>Component A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component A</em>'.
	 * @see tutorial.ItemConnection#getComponentA()
	 * @see #getItemConnection()
	 * @generated
	 */
	EReference getItemConnection_ComponentA();

	/**
	 * Returns the meta object for the reference '{@link tutorial.ItemConnection#getComponentB <em>Component B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component B</em>'.
	 * @see tutorial.ItemConnection#getComponentB()
	 * @see #getItemConnection()
	 * @generated
	 */
	EReference getItemConnection_ComponentB();

	/**
	 * Returns the meta object for the reference '{@link tutorial.ItemConnection#getMarkerA <em>Marker A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marker A</em>'.
	 * @see tutorial.ItemConnection#getMarkerA()
	 * @see #getItemConnection()
	 * @generated
	 */
	EReference getItemConnection_MarkerA();

	/**
	 * Returns the meta object for the reference '{@link tutorial.ItemConnection#getMarkerB <em>Marker B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marker B</em>'.
	 * @see tutorial.ItemConnection#getMarkerB()
	 * @see #getItemConnection()
	 * @generated
	 */
	EReference getItemConnection_MarkerB();

	/**
	 * Returns the meta object for the '{@link tutorial.ItemConnection#markerOnItemtype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Marker On Itemtype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Marker On Itemtype</em>' operation.
	 * @see tutorial.ItemConnection#markerOnItemtype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getItemConnection__MarkerOnItemtype__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link tutorial.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see tutorial.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the attribute '{@link tutorial.Marker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tutorial.Marker#getName()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Name();

	/**
	 * Returns the meta object for enum '{@link tutorial.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Material</em>'.
	 * @see tutorial.Material
	 * @generated
	 */
	EEnum getMaterial();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TutorialFactory getTutorialFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tutorial.impl.FactoryImpl <em>Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.FactoryImpl
		 * @see tutorial.impl.TutorialPackageImpl#getFactory()
		 * @generated
		 */
		EClass FACTORY = eINSTANCE.getFactory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTORY__NAME = eINSTANCE.getFactory_Name();

		/**
		 * The meta object literal for the '<em><b>Item Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTORY__ITEM_TYPES = eINSTANCE.getFactory_ItemTypes();

		/**
		 * The meta object literal for the '{@link tutorial.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.ItemTypeImpl
		 * @see tutorial.impl.TutorialPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__NAME = eINSTANCE.getItemType_Name();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_TYPE__MARKERS = eINSTANCE.getItemType_Markers();

		/**
		 * The meta object literal for the '{@link tutorial.impl.ComplexItemTypeImpl <em>Complex Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.ComplexItemTypeImpl
		 * @see tutorial.impl.TutorialPackageImpl#getComplexItemType()
		 * @generated
		 */
		EClass COMPLEX_ITEM_TYPE = eINSTANCE.getComplexItemType();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ITEM_TYPE__COMPONENTS = eINSTANCE.getComplexItemType_Components();

		/**
		 * The meta object literal for the '<em><b>Item Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS = eINSTANCE.getComplexItemType_ItemConnections();

		/**
		 * The meta object literal for the '{@link tutorial.impl.BasicItemTypeImpl <em>Basic Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.BasicItemTypeImpl
		 * @see tutorial.impl.TutorialPackageImpl#getBasicItemType()
		 * @generated
		 */
		EClass BASIC_ITEM_TYPE = eINSTANCE.getBasicItemType();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ITEM_TYPE__MATERIAL = eINSTANCE.getBasicItemType_Material();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_ITEM_TYPE__SHAPE = eINSTANCE.getBasicItemType_Shape();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_ITEM_TYPE__COLOR = eINSTANCE.getBasicItemType_Color();

		/**
		 * The meta object literal for the '{@link tutorial.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.ShapeImpl
		 * @see tutorial.impl.TutorialPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LENGTH = eINSTANCE.getShape_Length();

		/**
		 * The meta object literal for the '{@link tutorial.impl.CylinderShapeImpl <em>Cylinder Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.CylinderShapeImpl
		 * @see tutorial.impl.TutorialPackageImpl#getCylinderShape()
		 * @generated
		 */
		EClass CYLINDER_SHAPE = eINSTANCE.getCylinderShape();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER_SHAPE__RADIUS = eINSTANCE.getCylinderShape_Radius();

		/**
		 * The meta object literal for the '{@link tutorial.impl.BlockShapeImpl <em>Block Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.BlockShapeImpl
		 * @see tutorial.impl.TutorialPackageImpl#getBlockShape()
		 * @generated
		 */
		EClass BLOCK_SHAPE = eINSTANCE.getBlockShape();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_SHAPE__WIDTH = eINSTANCE.getBlockShape_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_SHAPE__HEIGTH = eINSTANCE.getBlockShape_Heigth();

		/**
		 * The meta object literal for the '{@link tutorial.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.ColorImpl
		 * @see tutorial.impl.TutorialPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__NAME = eINSTANCE.getColor_Name();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RED = eINSTANCE.getColor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

		/**
		 * The meta object literal for the '<em><b>Rgb Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLOR___RGB_VALUES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getColor__RgbValues__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tutorial.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.ComponentImpl
		 * @see tutorial.impl.TutorialPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ITEM_TYPE = eINSTANCE.getComponent_ItemType();

		/**
		 * The meta object literal for the '<em><b>Item Type Basic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___ITEM_TYPE_BASIC__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComponent__ItemTypeBasic__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tutorial.impl.ItemConnectionImpl <em>Item Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.ItemConnectionImpl
		 * @see tutorial.impl.TutorialPackageImpl#getItemConnection()
		 * @generated
		 */
		EClass ITEM_CONNECTION = eINSTANCE.getItemConnection();

		/**
		 * The meta object literal for the '<em><b>Component A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONNECTION__COMPONENT_A = eINSTANCE.getItemConnection_ComponentA();

		/**
		 * The meta object literal for the '<em><b>Component B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONNECTION__COMPONENT_B = eINSTANCE.getItemConnection_ComponentB();

		/**
		 * The meta object literal for the '<em><b>Marker A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONNECTION__MARKER_A = eINSTANCE.getItemConnection_MarkerA();

		/**
		 * The meta object literal for the '<em><b>Marker B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONNECTION__MARKER_B = eINSTANCE.getItemConnection_MarkerB();

		/**
		 * The meta object literal for the '<em><b>Marker On Itemtype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_CONNECTION___MARKER_ON_ITEMTYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getItemConnection__MarkerOnItemtype__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link tutorial.impl.MarkerImpl <em>Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.impl.MarkerImpl
		 * @see tutorial.impl.TutorialPackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__NAME = eINSTANCE.getMarker_Name();

		/**
		 * The meta object literal for the '{@link tutorial.Material <em>Material</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tutorial.Material
		 * @see tutorial.impl.TutorialPackageImpl#getMaterial()
		 * @generated
		 */
		EEnum MATERIAL = eINSTANCE.getMaterial();

	}

} //TutorialPackage
