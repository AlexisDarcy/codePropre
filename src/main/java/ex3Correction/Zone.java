/**
 * 
 */
package ex3Correction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexis Darcy
 *
 */
public abstract class Zone {
	
	/**liste: List<Animal>*/
	private List<Animal> listeAnimal = new ArrayList<Animal>();

	/**ajoute l'animal a la zone carnivore
	 * @param animal
	 */
	public abstract void addAnimal(Animal animal);
	
	/** affiche les animaux de la zone carnivore
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: listeAnimal){
			System.out.println(animal);
		}
	}
	
	public int compterAnimaux(){
		return listeAnimal.size();
	}
	
	public abstract double getPoids();
	
	/**calcul le poids de nourriture par jour
	 * @return poids de nourriture par jour de la zone carnivore
	 */
	public double calculerKgsNourritureParJour(){
		return listeAnimal.size() * getPoids();
	}
	
	/** Getter
	 * @return the liste
	 */
	public List<Animal> getListeAnimal() {
		return listeAnimal;
	}

	/** Setter
	 * @param liste the liste to set
	 */
	public void setListeAnimal(List<Animal> listeAnimal) {
		this.listeAnimal = listeAnimal;
	}
}
