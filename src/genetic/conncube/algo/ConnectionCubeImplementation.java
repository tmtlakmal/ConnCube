/**
 * 
 */
package genetic.conncube.algo;

import genetic.conncube.hooks.ConnectionCubeDebugHook;
import genetic.connectioncube.ConnectionCubeParameterSet;

import org.jaga.definitions.GAParameterSet;
import org.jaga.definitions.GAResult;

/**
 * @author lakmal
 *
 */
public class ConnectionCubeImplementation {

	/**
	 * @param args
	 */
	
	public void exec() {

		GAParameterSet params = new ConnectionCubeParameterSet();
		//params.setPopulationSize(100);
		//((NDecimalsIndividualSimpleFactory) params.getIndividualsFactory()).setConstraint(0, new RangeConstraint(-10, 10));

		ReusableConnectionCubeGA ga = new ReusableConnectionCubeGA(params);
		ga.addHook(new ConnectionCubeDebugHook());

		int repeat = 1;
		System.out.println("\n\n");
		System.out.println("This is a simple demo for the \"Genetic Algorithms in Java\"-Package.");
		System.out.println("This software is developed by Greg Paperin at the University College London.");
		System.out.println("All materials connected to this software are under the GNU licence.");
		System.out.println("\n");
		System.out.println("Running the algorithm " + repeat + " times.");
		System.out.println("The parameters are: \n" + params);
		System.out.println("\n\n");
		for (int i = 0; i < repeat; i++) {
			System.out.println("** Run " + i + ". **");
			GAResult result = ((ReusableConnectionCubeGA) ga).exec();
			System.out.println("Result is: " + result);
			System.out.println("\n");
		}
		System.out.println("\nDemo finished.");
		System.out.println("Please, visit http://www.jaga.org to check for latest updates.");
	}

	public static void main(String[] unusedArgs) {
		ConnectionCubeImplementation demo = new ConnectionCubeImplementation();
		demo.exec();

	}

}
