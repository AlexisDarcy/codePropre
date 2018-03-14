package ex3Correction;

/**
 * 
 * @author Alexis Darcy
 *
 */
public class Aquarium extends Zone {
	
	/**POIDS_NOURRITURE : double
	 * poids de nourriture par jour*/
	private final static double POIDS_NOURRITURE = 0.2;

	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.POISSON)){
			getListeAnimal().add(animal);
		}	
	}

	@Override
	public double getPoids() {
		return POIDS_NOURRITURE;		
	}
}
