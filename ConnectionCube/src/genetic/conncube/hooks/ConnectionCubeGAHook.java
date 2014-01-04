/**
 * 
 */
package genetic.conncube.hooks;

import genetic.conncube.algo.ConnectionCubeGA;

import org.jaga.definitions.GAParameterSet;
import org.jaga.definitions.GAResult;
import org.jaga.definitions.Individual;
import org.jaga.definitions.Population;


/**
 * @author lakmal
 *
 */
public class ConnectionCubeGAHook {

	
	public ConnectionCubeGAHook() {
	}

	public void initialisationDone(ConnectionCubeGA caller, Population pop, int age,
								   GAResult result, GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}

	public void foundNewResult(ConnectionCubeGA caller, Population pop, int age,
							   GAResult result, GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}

	public void generationChanged(ConnectionCubeGA caller, Population pop, int age,
								  GAResult result, GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}

	public void terminationConditionApplies(ConnectionCubeGA caller, Population pop, int age,
											GAResult result, GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}

	public void selectedForReproduction(ConnectionCubeGA caller, Individual [] selectedParents,
										Population pop, int age, GAResult result,
										GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}

	public void reproduced(ConnectionCubeGA caller, Individual [] children, Individual [] parents,
						   Population pop, int age, GAResult result, GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}

	public void fitnessCalculated(ConnectionCubeGA caller, Individual updatedIndividual,
								  Population pop, int age, GAParameterSet params) {
		// override and implement this method to take a apecific action.
	}
}
