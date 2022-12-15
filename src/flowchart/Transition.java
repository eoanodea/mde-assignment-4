/**
 */
package flowchart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowchart.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link flowchart.Transition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see flowchart.FlowchartPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flowchart.Step#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Step)
	 * @see flowchart.FlowchartPackage#getTransition_From()
	 * @see flowchart.Step#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Step getFrom();

	/**
	 * Sets the value of the '{@link flowchart.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Step value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flowchart.Step#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Step)
	 * @see flowchart.FlowchartPackage#getTransition_To()
	 * @see flowchart.Step#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Step getTo();

	/**
	 * Sets the value of the '{@link flowchart.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Step value);

} // Transition
