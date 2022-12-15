/**
 */
package flowchart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowchart.Step#getText <em>Text</em>}</li>
 *   <li>{@link flowchart.Step#getVoice <em>Voice</em>}</li>
 *   <li>{@link flowchart.Step#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link flowchart.Step#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see flowchart.FlowchartPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see flowchart.FlowchartPackage#getStep_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link flowchart.Step#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Voice</b></em>' attribute.
	 * The literals are from the enumeration {@link flowchart.Voice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice</em>' attribute.
	 * @see flowchart.Voice
	 * @see #setVoice(Voice)
	 * @see flowchart.FlowchartPackage#getStep_Voice()
	 * @model
	 * @generated
	 */
	Voice getVoice();

	/**
	 * Sets the value of the '{@link flowchart.Step#getVoice <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voice</em>' attribute.
	 * @see flowchart.Voice
	 * @see #getVoice()
	 * @generated
	 */
	void setVoice(Voice value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link flowchart.Transition}.
	 * It is bidirectional and its opposite is '{@link flowchart.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see flowchart.FlowchartPackage#getStep_Outgoing()
	 * @see flowchart.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link flowchart.Transition}.
	 * It is bidirectional and its opposite is '{@link flowchart.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see flowchart.FlowchartPackage#getStep_Incoming()
	 * @see flowchart.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncoming();

} // Step
