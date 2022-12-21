/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /tutorial/model/tutorial.ecore
 * using:
 *   /tutorial/model/tutorial.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package tutorial;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import tutorial.TutorialPackage;
// import tutorial.TutorialTables;

/**
 * TutorialTables provides the dispatch tables for the tutorial for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TutorialTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TutorialPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_tutorial = IdManager.getNsURIPackageId("http://www.example.org/tutorial", null, TutorialPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_BasicItemType = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("BasicItemType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = TutorialTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Color = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("Color", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComplexItemType = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("ComplexItemType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Component = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("Component", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Factory = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("Factory", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ItemConnection = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("ItemConnection", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ItemType = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("ItemType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Marker = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("Marker", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Shape = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getClassId("Shape", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = TutorialTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = TutorialTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Material = TutorialTables.PACKid_http_c_s_s_www_example_org_s_tutorial.getEnumerationId("Material");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_255 = ValueUtil.integerValueOf("255");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Component = TypeId.BAG.getSpecializedId(TutorialTables.CLSSid_Component);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ItemConnection = TypeId.BAG.getSpecializedId(TutorialTables.CLSSid_ItemConnection);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Component = TypeId.ORDERED_SET.getSpecializedId(TutorialTables.CLSSid_Component);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ItemConnection = TypeId.ORDERED_SET.getSpecializedId(TutorialTables.CLSSid_ItemConnection);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ItemType = TypeId.ORDERED_SET.getSpecializedId(TutorialTables.CLSSid_ItemType);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Marker = TypeId.ORDERED_SET.getSpecializedId(TutorialTables.CLSSid_Marker);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TutorialTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _BasicItemType = new EcoreExecutorType(TutorialPackage.Literals.BASIC_ITEM_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _BlockShape = new EcoreExecutorType(TutorialPackage.Literals.BLOCK_SHAPE, PACKAGE, 0);
		public static final EcoreExecutorType _Color = new EcoreExecutorType(TutorialPackage.Literals.COLOR, PACKAGE, 0);
		public static final EcoreExecutorType _ComplexItemType = new EcoreExecutorType(TutorialPackage.Literals.COMPLEX_ITEM_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Component = new EcoreExecutorType(TutorialPackage.Literals.COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _CylinderShape = new EcoreExecutorType(TutorialPackage.Literals.CYLINDER_SHAPE, PACKAGE, 0);
		public static final EcoreExecutorType _Factory = new EcoreExecutorType(TutorialPackage.Literals.FACTORY, PACKAGE, 0);
		public static final EcoreExecutorType _ItemConnection = new EcoreExecutorType(TutorialPackage.Literals.ITEM_CONNECTION, PACKAGE, 0);
		public static final EcoreExecutorType _ItemType = new EcoreExecutorType(TutorialPackage.Literals.ITEM_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Marker = new EcoreExecutorType(TutorialPackage.Literals.MARKER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Material = new EcoreExecutorEnumeration(TutorialPackage.Literals.MATERIAL, PACKAGE, 0);
		public static final EcoreExecutorType _Shape = new EcoreExecutorType(TutorialPackage.Literals.SHAPE, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_BasicItemType,
			_BlockShape,
			_Color,
			_ComplexItemType,
			_Component,
			_CylinderShape,
			_Factory,
			_ItemConnection,
			_ItemType,
			_Marker,
			_Material,
			_Shape
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _BasicItemType__BasicItemType = new ExecutorFragment(Types._BasicItemType, TutorialTables.Types._BasicItemType);
		private static final ExecutorFragment _BasicItemType__ItemType = new ExecutorFragment(Types._BasicItemType, TutorialTables.Types._ItemType);
		private static final ExecutorFragment _BasicItemType__OclAny = new ExecutorFragment(Types._BasicItemType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BasicItemType__OclElement = new ExecutorFragment(Types._BasicItemType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BlockShape__BlockShape = new ExecutorFragment(Types._BlockShape, TutorialTables.Types._BlockShape);
		private static final ExecutorFragment _BlockShape__OclAny = new ExecutorFragment(Types._BlockShape, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BlockShape__OclElement = new ExecutorFragment(Types._BlockShape, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BlockShape__Shape = new ExecutorFragment(Types._BlockShape, TutorialTables.Types._Shape);

		private static final ExecutorFragment _Color__Color = new ExecutorFragment(Types._Color, TutorialTables.Types._Color);
		private static final ExecutorFragment _Color__OclAny = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Color__OclElement = new ExecutorFragment(Types._Color, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ComplexItemType__ComplexItemType = new ExecutorFragment(Types._ComplexItemType, TutorialTables.Types._ComplexItemType);
		private static final ExecutorFragment _ComplexItemType__ItemType = new ExecutorFragment(Types._ComplexItemType, TutorialTables.Types._ItemType);
		private static final ExecutorFragment _ComplexItemType__OclAny = new ExecutorFragment(Types._ComplexItemType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplexItemType__OclElement = new ExecutorFragment(Types._ComplexItemType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, TutorialTables.Types._Component);
		private static final ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CylinderShape__CylinderShape = new ExecutorFragment(Types._CylinderShape, TutorialTables.Types._CylinderShape);
		private static final ExecutorFragment _CylinderShape__OclAny = new ExecutorFragment(Types._CylinderShape, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CylinderShape__OclElement = new ExecutorFragment(Types._CylinderShape, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CylinderShape__Shape = new ExecutorFragment(Types._CylinderShape, TutorialTables.Types._Shape);

		private static final ExecutorFragment _Factory__Factory = new ExecutorFragment(Types._Factory, TutorialTables.Types._Factory);
		private static final ExecutorFragment _Factory__OclAny = new ExecutorFragment(Types._Factory, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Factory__OclElement = new ExecutorFragment(Types._Factory, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ItemConnection__ItemConnection = new ExecutorFragment(Types._ItemConnection, TutorialTables.Types._ItemConnection);
		private static final ExecutorFragment _ItemConnection__OclAny = new ExecutorFragment(Types._ItemConnection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ItemConnection__OclElement = new ExecutorFragment(Types._ItemConnection, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ItemType__ItemType = new ExecutorFragment(Types._ItemType, TutorialTables.Types._ItemType);
		private static final ExecutorFragment _ItemType__OclAny = new ExecutorFragment(Types._ItemType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ItemType__OclElement = new ExecutorFragment(Types._ItemType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Marker__Marker = new ExecutorFragment(Types._Marker, TutorialTables.Types._Marker);
		private static final ExecutorFragment _Marker__OclAny = new ExecutorFragment(Types._Marker, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Marker__OclElement = new ExecutorFragment(Types._Marker, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Material__Material = new ExecutorFragment(Types._Material, TutorialTables.Types._Material);
		private static final ExecutorFragment _Material__OclAny = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Material__OclElement = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Material__OclEnumeration = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Material__OclType = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Shape__OclAny = new ExecutorFragment(Types._Shape, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Shape__OclElement = new ExecutorFragment(Types._Shape, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Shape__Shape = new ExecutorFragment(Types._Shape, TutorialTables.Types._Shape);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _BasicItemType__color = new EcoreExecutorProperty(TutorialPackage.Literals.BASIC_ITEM_TYPE__COLOR, Types._BasicItemType, 0);
		public static final ExecutorProperty _BasicItemType__material = new EcoreExecutorProperty(TutorialPackage.Literals.BASIC_ITEM_TYPE__MATERIAL, Types._BasicItemType, 1);
		public static final ExecutorProperty _BasicItemType__shape = new EcoreExecutorProperty(TutorialPackage.Literals.BASIC_ITEM_TYPE__SHAPE, Types._BasicItemType, 2);

		public static final ExecutorProperty _BlockShape__heigth = new EcoreExecutorProperty(TutorialPackage.Literals.BLOCK_SHAPE__HEIGTH, Types._BlockShape, 0);
		public static final ExecutorProperty _BlockShape__width = new EcoreExecutorProperty(TutorialPackage.Literals.BLOCK_SHAPE__WIDTH, Types._BlockShape, 1);

		public static final ExecutorProperty _Color__blue = new EcoreExecutorProperty(TutorialPackage.Literals.COLOR__BLUE, Types._Color, 0);
		public static final ExecutorProperty _Color__green = new EcoreExecutorProperty(TutorialPackage.Literals.COLOR__GREEN, Types._Color, 1);
		public static final ExecutorProperty _Color__name = new EcoreExecutorProperty(TutorialPackage.Literals.COLOR__NAME, Types._Color, 2);
		public static final ExecutorProperty _Color__red = new EcoreExecutorProperty(TutorialPackage.Literals.COLOR__RED, Types._Color, 3);
		public static final ExecutorProperty _Color__BasicItemType__color = new ExecutorPropertyWithImplementation("BasicItemType", Types._Color, 4, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.BASIC_ITEM_TYPE__COLOR));

		public static final ExecutorProperty _ComplexItemType__components = new EcoreExecutorProperty(TutorialPackage.Literals.COMPLEX_ITEM_TYPE__COMPONENTS, Types._ComplexItemType, 0);
		public static final ExecutorProperty _ComplexItemType__itemConnections = new EcoreExecutorProperty(TutorialPackage.Literals.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS, Types._ComplexItemType, 1);

		public static final ExecutorProperty _Component__itemType = new EcoreExecutorProperty(TutorialPackage.Literals.COMPONENT__ITEM_TYPE, Types._Component, 0);
		public static final ExecutorProperty _Component__name = new EcoreExecutorProperty(TutorialPackage.Literals.COMPONENT__NAME, Types._Component, 1);
		public static final ExecutorProperty _Component__ComplexItemType__components = new ExecutorPropertyWithImplementation("ComplexItemType", Types._Component, 2, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.COMPLEX_ITEM_TYPE__COMPONENTS));
		public static final ExecutorProperty _Component__ItemConnection__componentA = new ExecutorPropertyWithImplementation("ItemConnection", Types._Component, 3, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.ITEM_CONNECTION__COMPONENT_A));
		public static final ExecutorProperty _Component__ItemConnection__componentB = new ExecutorPropertyWithImplementation("ItemConnection", Types._Component, 4, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.ITEM_CONNECTION__COMPONENT_B));

		public static final ExecutorProperty _CylinderShape__radius = new EcoreExecutorProperty(TutorialPackage.Literals.CYLINDER_SHAPE__RADIUS, Types._CylinderShape, 0);

		public static final ExecutorProperty _Factory__itemTypes = new EcoreExecutorProperty(TutorialPackage.Literals.FACTORY__ITEM_TYPES, Types._Factory, 0);
		public static final ExecutorProperty _Factory__name = new EcoreExecutorProperty(TutorialPackage.Literals.FACTORY__NAME, Types._Factory, 1);

		public static final ExecutorProperty _ItemConnection__componentA = new EcoreExecutorProperty(TutorialPackage.Literals.ITEM_CONNECTION__COMPONENT_A, Types._ItemConnection, 0);
		public static final ExecutorProperty _ItemConnection__componentB = new EcoreExecutorProperty(TutorialPackage.Literals.ITEM_CONNECTION__COMPONENT_B, Types._ItemConnection, 1);
		public static final ExecutorProperty _ItemConnection__markerA = new EcoreExecutorProperty(TutorialPackage.Literals.ITEM_CONNECTION__MARKER_A, Types._ItemConnection, 2);
		public static final ExecutorProperty _ItemConnection__markerB = new EcoreExecutorProperty(TutorialPackage.Literals.ITEM_CONNECTION__MARKER_B, Types._ItemConnection, 3);
		public static final ExecutorProperty _ItemConnection__ComplexItemType__itemConnections = new ExecutorPropertyWithImplementation("ComplexItemType", Types._ItemConnection, 4, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.COMPLEX_ITEM_TYPE__ITEM_CONNECTIONS));

		public static final ExecutorProperty _ItemType__markers = new EcoreExecutorProperty(TutorialPackage.Literals.ITEM_TYPE__MARKERS, Types._ItemType, 0);
		public static final ExecutorProperty _ItemType__name = new EcoreExecutorProperty(TutorialPackage.Literals.ITEM_TYPE__NAME, Types._ItemType, 1);
		public static final ExecutorProperty _ItemType__Component__itemType = new ExecutorPropertyWithImplementation("Component", Types._ItemType, 2, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.COMPONENT__ITEM_TYPE));
		public static final ExecutorProperty _ItemType__Factory__itemTypes = new ExecutorPropertyWithImplementation("Factory", Types._ItemType, 3, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.FACTORY__ITEM_TYPES));

		public static final ExecutorProperty _Marker__name = new EcoreExecutorProperty(TutorialPackage.Literals.MARKER__NAME, Types._Marker, 0);
		public static final ExecutorProperty _Marker__ItemConnection__markerA = new ExecutorPropertyWithImplementation("ItemConnection", Types._Marker, 1, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.ITEM_CONNECTION__MARKER_A));
		public static final ExecutorProperty _Marker__ItemConnection__markerB = new ExecutorPropertyWithImplementation("ItemConnection", Types._Marker, 2, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.ITEM_CONNECTION__MARKER_B));
		public static final ExecutorProperty _Marker__ItemType__markers = new ExecutorPropertyWithImplementation("ItemType", Types._Marker, 3, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.ITEM_TYPE__MARKERS));

		public static final ExecutorProperty _Shape__length = new EcoreExecutorProperty(TutorialPackage.Literals.SHAPE__LENGTH, Types._Shape, 0);
		public static final ExecutorProperty _Shape__BasicItemType__shape = new ExecutorPropertyWithImplementation("BasicItemType", Types._Shape, 1, new EcoreLibraryOppositeProperty(TutorialPackage.Literals.BASIC_ITEM_TYPE__SHAPE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _BasicItemType =
			{
				Fragments._BasicItemType__OclAny /* 0 */,
				Fragments._BasicItemType__OclElement /* 1 */,
				Fragments._BasicItemType__ItemType /* 2 */,
				Fragments._BasicItemType__BasicItemType /* 3 */
			};
		private static final int /*@NonNull*/ [] __BasicItemType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BlockShape =
			{
				Fragments._BlockShape__OclAny /* 0 */,
				Fragments._BlockShape__OclElement /* 1 */,
				Fragments._BlockShape__Shape /* 2 */,
				Fragments._BlockShape__BlockShape /* 3 */
			};
		private static final int /*@NonNull*/ [] __BlockShape = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Color =
			{
				Fragments._Color__OclAny /* 0 */,
				Fragments._Color__OclElement /* 1 */,
				Fragments._Color__Color /* 2 */
			};
		private static final int /*@NonNull*/ [] __Color = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplexItemType =
			{
				Fragments._ComplexItemType__OclAny /* 0 */,
				Fragments._ComplexItemType__OclElement /* 1 */,
				Fragments._ComplexItemType__ItemType /* 2 */,
				Fragments._ComplexItemType__ComplexItemType /* 3 */
			};
		private static final int /*@NonNull*/ [] __ComplexItemType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__Component /* 2 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CylinderShape =
			{
				Fragments._CylinderShape__OclAny /* 0 */,
				Fragments._CylinderShape__OclElement /* 1 */,
				Fragments._CylinderShape__Shape /* 2 */,
				Fragments._CylinderShape__CylinderShape /* 3 */
			};
		private static final int /*@NonNull*/ [] __CylinderShape = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Factory =
			{
				Fragments._Factory__OclAny /* 0 */,
				Fragments._Factory__OclElement /* 1 */,
				Fragments._Factory__Factory /* 2 */
			};
		private static final int /*@NonNull*/ [] __Factory = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ItemConnection =
			{
				Fragments._ItemConnection__OclAny /* 0 */,
				Fragments._ItemConnection__OclElement /* 1 */,
				Fragments._ItemConnection__ItemConnection /* 2 */
			};
		private static final int /*@NonNull*/ [] __ItemConnection = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ItemType =
			{
				Fragments._ItemType__OclAny /* 0 */,
				Fragments._ItemType__OclElement /* 1 */,
				Fragments._ItemType__ItemType /* 2 */
			};
		private static final int /*@NonNull*/ [] __ItemType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Marker =
			{
				Fragments._Marker__OclAny /* 0 */,
				Fragments._Marker__OclElement /* 1 */,
				Fragments._Marker__Marker /* 2 */
			};
		private static final int /*@NonNull*/ [] __Marker = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Material =
			{
				Fragments._Material__OclAny /* 0 */,
				Fragments._Material__OclElement /* 1 */,
				Fragments._Material__OclType /* 2 */,
				Fragments._Material__OclEnumeration /* 3 */,
				Fragments._Material__Material /* 4 */
			};
		private static final int /*@NonNull*/ [] __Material = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Shape =
			{
				Fragments._Shape__OclAny /* 0 */,
				Fragments._Shape__OclElement /* 1 */,
				Fragments._Shape__Shape /* 2 */
			};
		private static final int /*@NonNull*/ [] __Shape = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BasicItemType.initFragments(_BasicItemType, __BasicItemType);
			Types._BlockShape.initFragments(_BlockShape, __BlockShape);
			Types._Color.initFragments(_Color, __Color);
			Types._ComplexItemType.initFragments(_ComplexItemType, __ComplexItemType);
			Types._Component.initFragments(_Component, __Component);
			Types._CylinderShape.initFragments(_CylinderShape, __CylinderShape);
			Types._Factory.initFragments(_Factory, __Factory);
			Types._ItemConnection.initFragments(_ItemConnection, __ItemConnection);
			Types._ItemType.initFragments(_ItemType, __ItemType);
			Types._Marker.initFragments(_Marker, __Marker);
			Types._Material.initFragments(_Material, __Material);
			Types._Shape.initFragments(_Shape, __Shape);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _BasicItemType__BasicItemType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicItemType__ItemType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicItemType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BasicItemType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BlockShape__BlockShape = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BlockShape__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BlockShape__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BlockShape__Shape = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Color__Color = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Color__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Color__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplexItemType__ComplexItemType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexItemType__ItemType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexItemType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplexItemType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CylinderShape__CylinderShape = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CylinderShape__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CylinderShape__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CylinderShape__Shape = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Factory__Factory = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Factory__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Factory__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ItemConnection__ItemConnection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemConnection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemConnection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ItemType__ItemType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ItemType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Marker__Marker = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Marker__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Marker__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Material__Material = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Shape__Shape = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Shape__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Shape__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BasicItemType__BasicItemType.initOperations(_BasicItemType__BasicItemType);
			Fragments._BasicItemType__ItemType.initOperations(_BasicItemType__ItemType);
			Fragments._BasicItemType__OclAny.initOperations(_BasicItemType__OclAny);
			Fragments._BasicItemType__OclElement.initOperations(_BasicItemType__OclElement);

			Fragments._BlockShape__BlockShape.initOperations(_BlockShape__BlockShape);
			Fragments._BlockShape__OclAny.initOperations(_BlockShape__OclAny);
			Fragments._BlockShape__OclElement.initOperations(_BlockShape__OclElement);
			Fragments._BlockShape__Shape.initOperations(_BlockShape__Shape);

			Fragments._Color__Color.initOperations(_Color__Color);
			Fragments._Color__OclAny.initOperations(_Color__OclAny);
			Fragments._Color__OclElement.initOperations(_Color__OclElement);

			Fragments._ComplexItemType__ComplexItemType.initOperations(_ComplexItemType__ComplexItemType);
			Fragments._ComplexItemType__ItemType.initOperations(_ComplexItemType__ItemType);
			Fragments._ComplexItemType__OclAny.initOperations(_ComplexItemType__OclAny);
			Fragments._ComplexItemType__OclElement.initOperations(_ComplexItemType__OclElement);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._CylinderShape__CylinderShape.initOperations(_CylinderShape__CylinderShape);
			Fragments._CylinderShape__OclAny.initOperations(_CylinderShape__OclAny);
			Fragments._CylinderShape__OclElement.initOperations(_CylinderShape__OclElement);
			Fragments._CylinderShape__Shape.initOperations(_CylinderShape__Shape);

			Fragments._Factory__Factory.initOperations(_Factory__Factory);
			Fragments._Factory__OclAny.initOperations(_Factory__OclAny);
			Fragments._Factory__OclElement.initOperations(_Factory__OclElement);

			Fragments._ItemConnection__ItemConnection.initOperations(_ItemConnection__ItemConnection);
			Fragments._ItemConnection__OclAny.initOperations(_ItemConnection__OclAny);
			Fragments._ItemConnection__OclElement.initOperations(_ItemConnection__OclElement);

			Fragments._ItemType__ItemType.initOperations(_ItemType__ItemType);
			Fragments._ItemType__OclAny.initOperations(_ItemType__OclAny);
			Fragments._ItemType__OclElement.initOperations(_ItemType__OclElement);

			Fragments._Marker__Marker.initOperations(_Marker__Marker);
			Fragments._Marker__OclAny.initOperations(_Marker__OclAny);
			Fragments._Marker__OclElement.initOperations(_Marker__OclElement);

			Fragments._Material__Material.initOperations(_Material__Material);
			Fragments._Material__OclAny.initOperations(_Material__OclAny);
			Fragments._Material__OclElement.initOperations(_Material__OclElement);
			Fragments._Material__OclEnumeration.initOperations(_Material__OclEnumeration);
			Fragments._Material__OclType.initOperations(_Material__OclType);

			Fragments._Shape__OclAny.initOperations(_Shape__OclAny);
			Fragments._Shape__OclElement.initOperations(_Shape__OclElement);
			Fragments._Shape__Shape.initOperations(_Shape__Shape);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _BasicItemType = {
			TutorialTables.Properties._BasicItemType__color,
			TutorialTables.Properties._ItemType__markers,
			TutorialTables.Properties._BasicItemType__material,
			TutorialTables.Properties._ItemType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TutorialTables.Properties._BasicItemType__shape
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BlockShape = {
			TutorialTables.Properties._BlockShape__heigth,
			TutorialTables.Properties._Shape__length,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TutorialTables.Properties._BlockShape__width
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Color = {
			TutorialTables.Properties._Color__blue,
			TutorialTables.Properties._Color__green,
			TutorialTables.Properties._Color__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TutorialTables.Properties._Color__red
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplexItemType = {
			TutorialTables.Properties._ComplexItemType__components,
			TutorialTables.Properties._ComplexItemType__itemConnections,
			TutorialTables.Properties._ItemType__markers,
			TutorialTables.Properties._ItemType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Component = {
			TutorialTables.Properties._Component__itemType,
			TutorialTables.Properties._Component__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CylinderShape = {
			TutorialTables.Properties._Shape__length,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TutorialTables.Properties._CylinderShape__radius
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Factory = {
			TutorialTables.Properties._Factory__itemTypes,
			TutorialTables.Properties._Factory__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ItemConnection = {
			TutorialTables.Properties._ItemConnection__componentA,
			TutorialTables.Properties._ItemConnection__componentB,
			TutorialTables.Properties._ItemConnection__markerA,
			TutorialTables.Properties._ItemConnection__markerB,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ItemType = {
			TutorialTables.Properties._ItemType__markers,
			TutorialTables.Properties._ItemType__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Marker = {
			TutorialTables.Properties._Marker__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Material = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Shape = {
			TutorialTables.Properties._Shape__length,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BasicItemType__BasicItemType.initProperties(_BasicItemType);
			Fragments._BlockShape__BlockShape.initProperties(_BlockShape);
			Fragments._Color__Color.initProperties(_Color);
			Fragments._ComplexItemType__ComplexItemType.initProperties(_ComplexItemType);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._CylinderShape__CylinderShape.initProperties(_CylinderShape);
			Fragments._Factory__Factory.initProperties(_Factory);
			Fragments._ItemConnection__ItemConnection.initProperties(_ItemConnection);
			Fragments._ItemType__ItemType.initProperties(_ItemType);
			Fragments._Marker__Marker.initProperties(_Marker);
			Fragments._Material__Material.initProperties(_Material);
			Fragments._Shape__Shape.initProperties(_Shape);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Material__WOOD = new EcoreExecutorEnumerationLiteral(TutorialPackage.Literals.MATERIAL.getEEnumLiteral("WOOD"), Types._Material, 0);
		public static final EcoreExecutorEnumerationLiteral _Material__STEEL = new EcoreExecutorEnumerationLiteral(TutorialPackage.Literals.MATERIAL.getEEnumLiteral("STEEL"), Types._Material, 1);
		public static final EcoreExecutorEnumerationLiteral _Material__COPPER = new EcoreExecutorEnumerationLiteral(TutorialPackage.Literals.MATERIAL.getEEnumLiteral("COPPER"), Types._Material, 2);
		public static final EcoreExecutorEnumerationLiteral _Material__GOLD = new EcoreExecutorEnumerationLiteral(TutorialPackage.Literals.MATERIAL.getEEnumLiteral("GOLD"), Types._Material, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Material = {
			_Material__WOOD,
			_Material__STEEL,
			_Material__COPPER,
			_Material__GOLD
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Material.initLiterals(_Material);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TutorialTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new TutorialTables();
	}

	private TutorialTables() {
		super(TutorialPackage.eNS_URI);
	}
}
