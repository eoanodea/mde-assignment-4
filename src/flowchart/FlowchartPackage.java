/**
 */
package flowchart;

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
 * @see flowchart.FlowchartFactory
 * @model kind="package"
 * @generated
 */
public interface FlowchartPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flowchart";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "flwochart";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flowchart";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowchartPackage eINSTANCE = flowchart.impl.FlowchartPackageImpl.init();

	/**
	 * The meta object id for the '{@link flowchart.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.ModelImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TRANSITIONS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowchart.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.StepImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__VOICE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTGOING = 2;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INCOMING = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flowchart.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.ActionImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TEXT = STEP__TEXT;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VOICE = STEP__VOICE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = STEP__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = STEP__INCOMING;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_NEXT = STEP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = STEP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link flowchart.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.DecisionImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TEXT = STEP__TEXT;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__VOICE = STEP__VOICE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOING = STEP__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INCOMING = STEP__INCOMING;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchart.impl.SpeakActionImpl <em>Speak Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.SpeakActionImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getSpeakAction()
	 * @generated
	 */
	int SPEAK_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION__TEXT = ACTION__TEXT;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION__VOICE = ACTION__VOICE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The number of structural features of the '<em>Speak Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION___GET_NEXT = ACTION___GET_NEXT;

	/**
	 * The number of operations of the '<em>Speak Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAK_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchart.impl.RedirectActionImpl <em>Redirect Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.RedirectActionImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getRedirectAction()
	 * @generated
	 */
	int REDIRECT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION__TEXT = ACTION__TEXT;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION__VOICE = ACTION__VOICE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION__NUMBER = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Redirect Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION___GET_NEXT = ACTION___GET_NEXT;

	/**
	 * The number of operations of the '<em>Redirect Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchart.impl.InputActionImpl <em>Input Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.InputActionImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getInputAction()
	 * @generated
	 */
	int INPUT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION__TEXT = ACTION__TEXT;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION__VOICE = ACTION__VOICE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION__VARIABLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION___GET_NEXT = ACTION___GET_NEXT;

	/**
	 * The number of operations of the '<em>Input Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flowchart.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.impl.TransitionImpl
	 * @see flowchart.impl.FlowchartPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link flowchart.Voice <em>Voice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flowchart.Voice
	 * @see flowchart.impl.FlowchartPackageImpl#getVoice()
	 * @generated
	 */
	int VOICE = 8;


	/**
	 * Returns the meta object for class '{@link flowchart.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see flowchart.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link flowchart.Model#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see flowchart.Model#getSteps()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link flowchart.Model#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see flowchart.Model#getTransitions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Transitions();

	/**
	 * Returns the meta object for class '{@link flowchart.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see flowchart.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link flowchart.Step#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see flowchart.Step#getText()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Text();

	/**
	 * Returns the meta object for the attribute '{@link flowchart.Step#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voice</em>'.
	 * @see flowchart.Step#getVoice()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Voice();

	/**
	 * Returns the meta object for the reference list '{@link flowchart.Step#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see flowchart.Step#getOutgoing()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link flowchart.Step#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see flowchart.Step#getIncoming()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Incoming();

	/**
	 * Returns the meta object for class '{@link flowchart.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see flowchart.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link flowchart.Action#getNext() <em>Get Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Next</em>' operation.
	 * @see flowchart.Action#getNext()
	 * @generated
	 */
	EOperation getAction__GetNext();

	/**
	 * Returns the meta object for class '{@link flowchart.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see flowchart.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for class '{@link flowchart.SpeakAction <em>Speak Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speak Action</em>'.
	 * @see flowchart.SpeakAction
	 * @generated
	 */
	EClass getSpeakAction();

	/**
	 * Returns the meta object for class '{@link flowchart.RedirectAction <em>Redirect Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redirect Action</em>'.
	 * @see flowchart.RedirectAction
	 * @generated
	 */
	EClass getRedirectAction();

	/**
	 * Returns the meta object for the attribute '{@link flowchart.RedirectAction#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see flowchart.RedirectAction#getNumber()
	 * @see #getRedirectAction()
	 * @generated
	 */
	EAttribute getRedirectAction_Number();

	/**
	 * Returns the meta object for class '{@link flowchart.InputAction <em>Input Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Action</em>'.
	 * @see flowchart.InputAction
	 * @generated
	 */
	EClass getInputAction();

	/**
	 * Returns the meta object for the attribute '{@link flowchart.InputAction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see flowchart.InputAction#getVariable()
	 * @see #getInputAction()
	 * @generated
	 */
	EAttribute getInputAction_Variable();

	/**
	 * Returns the meta object for class '{@link flowchart.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see flowchart.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link flowchart.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see flowchart.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link flowchart.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see flowchart.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for enum '{@link flowchart.Voice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Voice</em>'.
	 * @see flowchart.Voice
	 * @generated
	 */
	EEnum getVoice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowchartFactory getFlowchartFactory();

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
		 * The meta object literal for the '{@link flowchart.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.ModelImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__STEPS = eINSTANCE.getModel_Steps();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TRANSITIONS = eINSTANCE.getModel_Transitions();

		/**
		 * The meta object literal for the '{@link flowchart.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.StepImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TEXT = eINSTANCE.getStep_Text();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__VOICE = eINSTANCE.getStep_Voice();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTGOING = eINSTANCE.getStep_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INCOMING = eINSTANCE.getStep_Incoming();

		/**
		 * The meta object literal for the '{@link flowchart.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.ActionImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Get Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___GET_NEXT = eINSTANCE.getAction__GetNext();

		/**
		 * The meta object literal for the '{@link flowchart.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.DecisionImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link flowchart.impl.SpeakActionImpl <em>Speak Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.SpeakActionImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getSpeakAction()
		 * @generated
		 */
		EClass SPEAK_ACTION = eINSTANCE.getSpeakAction();

		/**
		 * The meta object literal for the '{@link flowchart.impl.RedirectActionImpl <em>Redirect Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.RedirectActionImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getRedirectAction()
		 * @generated
		 */
		EClass REDIRECT_ACTION = eINSTANCE.getRedirectAction();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDIRECT_ACTION__NUMBER = eINSTANCE.getRedirectAction_Number();

		/**
		 * The meta object literal for the '{@link flowchart.impl.InputActionImpl <em>Input Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.InputActionImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getInputAction()
		 * @generated
		 */
		EClass INPUT_ACTION = eINSTANCE.getInputAction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_ACTION__VARIABLE = eINSTANCE.getInputAction_Variable();

		/**
		 * The meta object literal for the '{@link flowchart.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.impl.TransitionImpl
		 * @see flowchart.impl.FlowchartPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '{@link flowchart.Voice <em>Voice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flowchart.Voice
		 * @see flowchart.impl.FlowchartPackageImpl#getVoice()
		 * @generated
		 */
		EEnum VOICE = eINSTANCE.getVoice();

	}

} //FlowchartPackage
