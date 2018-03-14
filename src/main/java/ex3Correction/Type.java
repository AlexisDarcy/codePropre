/**
 * 
 */
package ex3Correction;

/**
 * @author Alexis Darcy
 *
 */
public enum Type {
	MAMMIFERE ("Mammifere"), POISSON("Poisson"), REPTILE("Reptile");
	
	/**cat : String*/
	private String libelle;

	/** Constructeur
	 * @param type
	 */
	private Type(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the type
	 */
	public String getLibelle() {
		return libelle;
	}
}
