package ex3Correction;
/**
 * 
 * @author Alexis Darcy
 *
 */
public class ZoneCarnivore extends Zone {

	/**POIDS_NOURRITURE : double
	 * poids de nourriture par jour*/
	private final static double POIDS_NOURRITURE = 10;

	@Override
	public void addAnimal(Animal animal) {
		if (animal.getComporement().equals(Comportement.CARNIVORE) && animal.getType().equals(Type.MAMMIFERE)){
			getListeAnimal().add(animal);
		}	
	}
	
	@Override
	public double getPoids() {
		return POIDS_NOURRITURE;		
	}

}
