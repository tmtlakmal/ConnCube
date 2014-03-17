/**
 * 
 */
package genetic.connectioncube;

import org.jaga.definitions.Fitness;
import org.jaga.definitions.Individual;

/**
 * @author lakmal
 *
 */
public class ConnectionCubeIndividual implements Individual {

	private Fitness fitness;
	private int noOfDiffSides;
	private CrossSection[] content;
	
	public ConnectionCubeIndividual(int noOfDiffSides){
		this.noOfDiffSides = noOfDiffSides;
		content = new CrossSection[noOfDiffSides];
	}
	
	public void setSection(int section){
		
	}
	
	
	@Override
	public Fitness getFitness() {
		return fitness;
	}

	@Override
	public void setFitness(Fitness fitness) {
		this.fitness = fitness;		
	}

}
