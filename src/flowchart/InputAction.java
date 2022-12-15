/**
 */
package flowchart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flowchart.InputAction#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see flowchart.FlowchartPackage#getInputAction()
 * @model
 * @generated
 */
public interface InputAction extends Action {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see flowchart.FlowchartPackage#getInputAction_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link flowchart.InputAction#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // InputAction
