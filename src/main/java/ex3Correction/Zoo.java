package ex3Correction;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	/**listAnimal : List<Animal>*/
	private List<Animal> listAnimal = new ArrayList<Animal>();
	/**listZone : List<Zone>*/
	private List<Zone> listZone = new ArrayList<Zone>();
	
	/**nom : String*/
	private String nom;
	
	/** Constructeur
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		listZone.add(new Aquarium());
		listZone.add(new FermeReptile());
		listZone.add(new SavaneAfricaine());
		listZone.add(new ZoneCarnivore());
	}
	
	/**
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		listAnimal.add(animal);
		for(Zone zone : listZone){
			zone.addAnimal(animal);
		}
	}
	
	public void remplirZone(List<Animal> listAnimal, Zone zone){
		for(Animal animal : listAnimal){
			zone.addAnimal(animal);
		}
	}
	/**
	 * 
	 */
	public void afficherListeAnimaux(){
		for(Animal animal : listAnimal){
			System.out.println(animal);
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the listAnimal
	 */
	public List<Animal> getListAnimal() {
		return listAnimal;
	}

	/** Setter
	 * @param listAnimal the listAnimal to set
	 */
	public void setListAnimal(List<Animal> listAnimal) {
		this.listAnimal = listAnimal;
	}
	/** Getter
	 * @return the listZone
	 */
	public List<Zone> getListZone() {
		return listZone;
	}

	/** Setter
	 * @param listZone the listZone to set
	 */
	public void setListZone(List<Zone> listZone) {
		this.listZone = listZone;
	}
}
