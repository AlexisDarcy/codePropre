/**
 * 
 */
package ex3Correction;

/**
 * @author Alexis Darcy
 *
 */
public enum Comportement {
	HERBIVORE ("Herbivore"), CARNIVORE("Carnivore");
	
	/**cat : String*/
	private String libelle;

	/** Constructeur
	 * @param comportement
	 */
	private Comportement(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the comportement
	 */
	public String getLibelle() {
		return libelle;
	}
}
