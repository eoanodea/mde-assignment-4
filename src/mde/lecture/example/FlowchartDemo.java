package mde.lecture.example;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import flowchart.Action;
import flowchart.Decision;
import flowchart.FlowchartFactory;
import flowchart.FlowchartPackage;
import flowchart.InputAction;
import flowchart.Model;
import flowchart.Step;
import flowchart.Transition;

public class FlowchartDemo {

	final static private ResourceSet resourceSet = new ResourceSetImpl();

	public FlowchartDemo() {
		// FIRST OPERATION TO DO TO WORK WITH OUR METAMODEL. WE NEED TO REGISTER IT!
		registerFlowchartMetamodel();
	}

	public static void main(String[] args) {
		String outputModelPath = "model/flowchart_gen.xmi";

		FlowchartDemo demo = new FlowchartDemo();

		System.out.println("---------------------------------------");
		System.out.println("------CREATE FLOWCHART-----------------");
		System.out.println("---------------------------------------");

		Model flowchartInstance = demo.createFlowchartInstance();

		demo.saveFlowchartModel(flowchartInstance, outputModelPath);
		System.out.println("Flowchart saved into: " + outputModelPath);

		System.out.println("---------------------------------------");
		System.out.println("------LOAD FLOWCHART-------------------");
		System.out.println("---------------------------------------");

		Model loadedFlowchart = demo.loadFlowchartModel(outputModelPath);
		demo.printFlowchart(loadedFlowchart);
	}

	/**
	 * It creates a simple Flowchart model instance.
	 * 
	 * @return Model
	 */
	private Model createFlowchartInstance() {
		Model flowchart = FlowchartFactory.eINSTANCE.createModel();

		Action speackAction = FlowchartFactory.eINSTANCE.createSpeakAction();
		speackAction.setText("Welcome to Evil Bank");

		InputAction inputAction = FlowchartFactory.eINSTANCE.createInputAction();
		inputAction.setText("Please enter your account number");

		Decision decision = FlowchartFactory.eINSTANCE.createDecision();
		decision.setText("Are you an existing customer?");

		Transition transition1 = FlowchartFactory.eINSTANCE.createTransition();
		transition1.setFrom(speackAction);
		transition1.setTo(decision);

		Transition transition2 = FlowchartFactory.eINSTANCE.createTransition();
		transition2.setFrom(decision);
		transition2.setTo(inputAction);

		/**
		 * It is no needed to set incoming or outcoming references to Actions because of
		 * the OPPOSITE reference. It is enough to set the reference only in the
		 * Transition from and to
		 */

		// Remember that an Action and InputAction and Decision extends Step metaclass
		flowchart.getSteps().add(speackAction); // Add Step into flowchart root metaclass
		flowchart.getSteps().add(inputAction);
		flowchart.getSteps().add(decision);

		flowchart.getTransitions().add(transition1);
		flowchart.getTransitions().add(transition2);

		System.out.println("Flowchart created!");

		return flowchart;
	}

	/**
	 * It prints a Flowchart model passed as input
	 * 
	 * @param flowchart
	 */
	private void printFlowchart(Model flowchart) {
		for (Step step : flowchart.getSteps()) {
			System.out.println("NODE: " + step.getText());
		}

		for (Transition transition : flowchart.getTransitions()) {
			System.out.println("TRANSITION: " + transition.getFrom().getText() + "-" + transition.getTo().getText());
			if (transition.getFrom() != null) {
				System.out.println("\t Source: " + transition.getFrom().getText());
			}
			if (transition.getTo() != null) {
				System.out.println("\t Target: " + transition.getTo().getText());
			}
		}
	}

	/**
	 * Register Flowchart metamodel
	 */
	private void registerFlowchartMetamodel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(FlowchartPackage.eINSTANCE.getNsURI(), FlowchartPackage.eINSTANCE);
		System.out.println("Flowchart Metamodel registered!");
	}

	/**
	 * Save a flowchart model into the provided outputh path.
	 * 
	 * @param flowchart
	 * @param outputModelPath
	 */
	private void saveFlowchartModel(Model flowchart, String outputModelPath) {
		URI uri = URI.createFileURI(outputModelPath);
		Resource resource = resourceSet.createResource(uri);

		resource.getContents().add(flowchart);
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Loads a Flowchart model instance
	 * 
	 * @param modelPath
	 * @return Model
	 */
	private Model loadFlowchartModel(String modelPath) {
		URI uri = URI.createFileURI(modelPath);

		Resource resource = resourceSet.getResource(uri, true);
		return (Model) resource.getContents().get(0);
	}

}