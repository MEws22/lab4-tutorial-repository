/**
 */
package tutorial.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import tutorial.Component;
import tutorial.ItemConnection;
import tutorial.ItemType;
import tutorial.Marker;
import tutorial.TutorialPackage;
import tutorial.TutorialTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getComponentA <em>Component A</em>}</li>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getComponentB <em>Component B</em>}</li>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getMarkerA <em>Marker A</em>}</li>
 *   <li>{@link tutorial.impl.ItemConnectionImpl#getMarkerB <em>Marker B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemConnectionImpl extends MinimalEObjectImpl.Container implements ItemConnection {
	/**
	 * The cached value of the '{@link #getComponentA() <em>Component A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentA()
	 * @generated
	 * @ordered
	 */
	protected Component componentA;

	/**
	 * The cached value of the '{@link #getComponentB() <em>Component B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentB()
	 * @generated
	 * @ordered
	 */
	protected Component componentB;

	/**
	 * The cached value of the '{@link #getMarkerA() <em>Marker A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerA()
	 * @generated
	 * @ordered
	 */
	protected Marker markerA;

	/**
	 * The cached value of the '{@link #getMarkerB() <em>Marker B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerB()
	 * @generated
	 * @ordered
	 */
	protected Marker markerB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.ITEM_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponentA() {
		if (componentA != null && componentA.eIsProxy()) {
			InternalEObject oldComponentA = (InternalEObject) componentA;
			componentA = (Component) eResolveProxy(oldComponentA);
			if (componentA != oldComponentA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TutorialPackage.ITEM_CONNECTION__COMPONENT_A, oldComponentA, componentA));
			}
		}
		return componentA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentA() {
		return componentA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentA(Component newComponentA) {
		Component oldComponentA = componentA;
		componentA = newComponentA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__COMPONENT_A,
					oldComponentA, componentA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponentB() {
		if (componentB != null && componentB.eIsProxy()) {
			InternalEObject oldComponentB = (InternalEObject) componentB;
			componentB = (Component) eResolveProxy(oldComponentB);
			if (componentB != oldComponentB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TutorialPackage.ITEM_CONNECTION__COMPONENT_B, oldComponentB, componentB));
			}
		}
		return componentB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentB() {
		return componentB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentB(Component newComponentB) {
		Component oldComponentB = componentB;
		componentB = newComponentB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__COMPONENT_B,
					oldComponentB, componentB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker getMarkerA() {
		if (markerA != null && markerA.eIsProxy()) {
			InternalEObject oldMarkerA = (InternalEObject) markerA;
			markerA = (Marker) eResolveProxy(oldMarkerA);
			if (markerA != oldMarkerA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.ITEM_CONNECTION__MARKER_A,
							oldMarkerA, markerA));
			}
		}
		return markerA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetMarkerA() {
		return markerA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerA(Marker newMarkerA) {
		Marker oldMarkerA = markerA;
		markerA = newMarkerA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__MARKER_A, oldMarkerA,
					markerA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker getMarkerB() {
		if (markerB != null && markerB.eIsProxy()) {
			InternalEObject oldMarkerB = (InternalEObject) markerB;
			markerB = (Marker) eResolveProxy(oldMarkerB);
			if (markerB != oldMarkerB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TutorialPackage.ITEM_CONNECTION__MARKER_B,
							oldMarkerB, markerB));
			}
		}
		return markerB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker basicGetMarkerB() {
		return markerB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerB(Marker newMarkerB) {
		Marker oldMarkerB = markerB;
		markerB = newMarkerB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.ITEM_CONNECTION__MARKER_B, oldMarkerB,
					markerB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean markerOnItemtype(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ItemConnection::markerOnItemtype";
		try {
			/**
			 *
			 * inv markerOnItemtype:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = componentA.itemType.markers->exists(m | m = self.markerA) and
			 *         componentB.itemType.markers->exists(m | m = self.markerB)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TutorialPackage.Literals.ITEM_CONNECTION___MARKER_ON_ITEMTYPE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TutorialTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Component componentA = this.getComponentA();
					final /*@NonInvalid*/ ItemType itemType = componentA.getItemType();
					final /*@NonInvalid*/ List<Marker> markers = itemType.getMarkers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_markers = idResolver
							.createOrderedSetOfAll(TutorialTables.ORD_CLSSid_Marker, markers);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_m = BOXED_markers.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_m.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Marker m = (Marker) ITERATOR_m.next();
						/**
						 * m = self.markerA
						 */
						final /*@NonInvalid*/ Marker markerA = this.getMarkerA();
						final /*@NonInvalid*/ boolean eq = m.equals(markerA);
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ Component componentB = this.getComponentB();
						final /*@NonInvalid*/ ItemType itemType_0 = componentB.getItemType();
						final /*@NonInvalid*/ List<Marker> markers_0 = itemType_0.getMarkers();
						final /*@NonInvalid*/ OrderedSetValue BOXED_markers_0 = idResolver
								.createOrderedSetOfAll(TutorialTables.ORD_CLSSid_Marker, markers_0);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_m_0 = BOXED_markers_0.iterator();
						/*@NonInvalid*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_m_0.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Marker m_0 = (Marker) ITERATOR_m_0.next();
							/**
							 * m = self.markerB
							 */
							final /*@NonInvalid*/ Marker markerB = this.getMarkerB();
							final /*@NonInvalid*/ boolean eq_0 = m_0.equals(markerB);
							//
							if (eq_0) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if ((exists == null) || (exists_0 == null)) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, TutorialTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			if (resolve)
				return getComponentA();
			return basicGetComponentA();
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			if (resolve)
				return getComponentB();
			return basicGetComponentB();
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			if (resolve)
				return getMarkerA();
			return basicGetMarkerA();
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			if (resolve)
				return getMarkerB();
			return basicGetMarkerB();
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
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			setComponentA((Component) newValue);
			return;
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			setComponentB((Component) newValue);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			setMarkerA((Marker) newValue);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			setMarkerB((Marker) newValue);
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
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			setComponentA((Component) null);
			return;
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			setComponentB((Component) null);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			setMarkerA((Marker) null);
			return;
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			setMarkerB((Marker) null);
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
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_A:
			return componentA != null;
		case TutorialPackage.ITEM_CONNECTION__COMPONENT_B:
			return componentB != null;
		case TutorialPackage.ITEM_CONNECTION__MARKER_A:
			return markerA != null;
		case TutorialPackage.ITEM_CONNECTION__MARKER_B:
			return markerB != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TutorialPackage.ITEM_CONNECTION___MARKER_ON_ITEMTYPE__DIAGNOSTICCHAIN_MAP:
			return markerOnItemtype((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ItemConnectionImpl
