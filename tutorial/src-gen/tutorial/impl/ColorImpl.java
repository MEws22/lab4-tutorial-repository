/**
 */
package tutorial.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import tutorial.Color;
import tutorial.TutorialPackage;
import tutorial.TutorialTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tutorial.impl.ColorImpl#getName <em>Name</em>}</li>
 *   <li>{@link tutorial.impl.ColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link tutorial.impl.ColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link tutorial.impl.ColorImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected int red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final int GREEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected int green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final int BLUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected int blue = BLUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.COLOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRed(int newRed) {
		int oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.COLOR__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGreen(int newGreen) {
		int oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.COLOR__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlue(int newBlue) {
		int oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.COLOR__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean rgbValues(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Color::rgbValues";
		try {
			/**
			 *
			 * inv rgbValues:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = red >= 0 and red <= 255 and green >= 0 and green <= 255 and blue >= 0 and blue <= 255
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					TutorialPackage.Literals.COLOR___RGB_VALUES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, TutorialTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ int blue_0 = this.getBlue();
					final /*@NonInvalid*/ IntegerValue BOXED_blue_0 = ValueUtil.integerValueOf(blue_0);
					/*@Caught*/ Object CAUGHT_and_2;
					try {
						/*@Caught*/ Object CAUGHT_and_1;
						try {
							final /*@NonInvalid*/ int green_0 = this.getGreen();
							final /*@NonInvalid*/ IntegerValue BOXED_green_0 = ValueUtil.integerValueOf(green_0);
							/*@Caught*/ Object CAUGHT_and_0;
							try {
								final /*@NonInvalid*/ int red_0 = this.getRed();
								final /*@NonInvalid*/ IntegerValue BOXED_red_0 = ValueUtil.integerValueOf(red_0);
								final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
										.evaluate(executor, BOXED_red_0, TutorialTables.INT_0).booleanValue();
								final /*@NonInvalid*/ Boolean and;
								if (!ge) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
											.evaluate(executor, BOXED_red_0, TutorialTables.INT_255).booleanValue();
									if (!le_0) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								final /*@Thrown*/ Boolean and_0;
								if (and == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
											.evaluate(executor, BOXED_green_0, TutorialTables.INT_0).booleanValue();
									if (!ge_0) {
										and_0 = ValueUtil.FALSE_VALUE;
									} else {
										if (and == null) {
											and_0 = null;
										} else {
											and_0 = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and_0 = and_0;
							} catch (Exception e) {
								CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
										.evaluate(executor, BOXED_green_0, TutorialTables.INT_255).booleanValue();
								if (!le_1) {
									and_1 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_0;
									}
									if (CAUGHT_and_0 == null) {
										and_1 = null;
									} else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_1 = and_1;
						} catch (Exception e) {
							CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_2;
						if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
							and_2 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean ge_1 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_blue_0, TutorialTables.INT_0).booleanValue();
							if (!ge_1) {
								and_2 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_and_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_and_1;
								}
								if (CAUGHT_and_1 == null) {
									and_2 = null;
								} else {
									and_2 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_2 = and_2;
					} catch (Exception e) {
						CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean le_2 = OclComparableLessThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_blue_0, TutorialTables.INT_255).booleanValue();
						if (!le_2) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_2;
							}
							if (CAUGHT_and_2 == null) {
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
		case TutorialPackage.COLOR__NAME:
			return getName();
		case TutorialPackage.COLOR__RED:
			return getRed();
		case TutorialPackage.COLOR__GREEN:
			return getGreen();
		case TutorialPackage.COLOR__BLUE:
			return getBlue();
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
		case TutorialPackage.COLOR__NAME:
			setName((String) newValue);
			return;
		case TutorialPackage.COLOR__RED:
			setRed((Integer) newValue);
			return;
		case TutorialPackage.COLOR__GREEN:
			setGreen((Integer) newValue);
			return;
		case TutorialPackage.COLOR__BLUE:
			setBlue((Integer) newValue);
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
		case TutorialPackage.COLOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TutorialPackage.COLOR__RED:
			setRed(RED_EDEFAULT);
			return;
		case TutorialPackage.COLOR__GREEN:
			setGreen(GREEN_EDEFAULT);
			return;
		case TutorialPackage.COLOR__BLUE:
			setBlue(BLUE_EDEFAULT);
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
		case TutorialPackage.COLOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TutorialPackage.COLOR__RED:
			return red != RED_EDEFAULT;
		case TutorialPackage.COLOR__GREEN:
			return green != GREEN_EDEFAULT;
		case TutorialPackage.COLOR__BLUE:
			return blue != BLUE_EDEFAULT;
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
		case TutorialPackage.COLOR___RGB_VALUES__DIAGNOSTICCHAIN_MAP:
			return rgbValues((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(')');
		return result.toString();
	}

} //ColorImpl
