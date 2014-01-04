package genetic.conncube.algo;

import org.jaga.definitions.*;

/**
 * 
 * @author lakmal
 *
 *	The Time series specific reusable genetic algorithm
 *
 */

public class ReusableConnectionCubeGA extends ConnectionCubeGA {

	private GAParameterSet parameters = null;

	public ReusableConnectionCubeGA() {
		super();
	}

	public ReusableConnectionCubeGA(GAParameterSet parameters) {
		super();
		this.parameters = parameters;
	}

	public GAResult exec() {
		if (null == this.parameters)
			throw new IllegalStateException("ReusableConnectionCubeGA.exec() was called without "
											+ "previously initialising the parameter set");
		return exec(this.parameters);
	}
}