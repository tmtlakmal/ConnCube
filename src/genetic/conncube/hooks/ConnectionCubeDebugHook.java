/**
 * 
 */
package genetic.conncube.hooks;

import genetic.conncube.algo.ConnectionCubeGA;

import org.jaga.definitions.GAParameterSet;
import org.jaga.definitions.GAResult;
import org.jaga.definitions.Individual;
import org.jaga.definitions.Population;
import org.jaga.util.FittestIndividualResult;

/**
 * @author lakmal
 *
 */
public class ConnectionCubeDebugHook extends ConnectionCubeGAHook {

	private void printPopulation(Population pop, int age) {
		System.out.println("Population in generation " + age + " has "
						   + pop.getSize() + " members:");
		for (int i = 0; i < pop.getSize(); i++) {
			System.out.println("  " + i + ") " + pop.getMember(i));
		}
	}

	private void printResult(GAResult result, int age) {
		if (!(result instanceof FittestIndividualResult)) {
			return;
		}
		System.out.println("Best result (in generation " + age + "):");
		System.out.println(((FittestIndividualResult) result).
						   getFittestIndividual());
	}

	protected void printIndividuals(Individual[] inds) {
		for (int i = 0; i < inds.length; i++) {
			System.out.println("  " + i + ": " + inds[i]);
		}
	}

	public void initialisationDone(ConnectionCubeGA caller, Population pop, int age,
								   GAResult result, GAParameterSet params) {
		System.out.println("\nINITIALISATION DONE.");
		printPopulation(pop, age);
		printResult(result, age);
		System.out.println("--------------------------------------------------");
	}

	public void foundNewResult(ConnectionCubeGA caller, Population pop, int age,
							   GAResult result, GAParameterSet params) {
		System.out.println("\nFOUND NEW RESULT.");
		printPopulation(pop, age);
		printResult(result, age);
		System.out.println("--------------------------------------------------");
	}

	public void generationChanged(ConnectionCubeGA caller, Population pop, int age,
								  GAResult result, GAParameterSet paramss) {
		System.out.println("\nNEXT GENERATION.");
		printPopulation(pop, age);
		printResult(result, age);
		System.out.println("--------------------------------------------------");
	}

	public void terminationConditionApplies(ConnectionCubeGA caller, Population pop,
											int age,
											GAResult result,
											GAParameterSet params) {
		System.out.println("\nTERMINATION APPLIED.");
		printPopulation(pop, age);
		printResult(result, age);
		System.out.println("--------------------------------------------------");
	}

	public void selectedForReproduction(ConnectionCubeGA caller,
										Individual[] selectedParents,
										Population pop, int age,
										GAResult result,
										GAParameterSet params) {
		System.out.println("\nPARENTS SELECTED.");
		printPopulation(pop, age);
		printResult(result, age);
		System.out.println("Parents:");
		printIndividuals(selectedParents);
		System.out.println("--------------------------------------------------");
	}

	public void reproduced(ConnectionCubeGA caller, Individual[] children,
						   Individual[] parents,
						   Population pop, int age, GAResult result,
						   GAParameterSet params) {
		System.out.println("\nCHILDREN PRODUCED.");
		printPopulation(pop, age);
		printResult(result, age);
		System.out.println("Parents:");
		printIndividuals(parents);
		System.out.println("Children:");
		printIndividuals(children);
		System.out.println("--------------------------------------------------");
	}

	public void fitnessCalculated(ConnectionCubeGA caller, Individual updatedIndividual,
								  Population pop, int age,
								  GAParameterSet params) {
		System.out.println("\nFITNESS CALCULATED.");
		System.out.println("Updated individual: " + updatedIndividual);
		System.out.println("--------------------------------------------------");
	}
	
}
