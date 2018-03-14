/**
 * 
 */
package ex3Correction;

/**
 * @author Alexis Darcy
 *
 */
public class Animal {
	
	/**libelle : String*/
	private String libelle;
	/**comporement : Comportement*/
	private Comportement comporement;
	/**type : Type*/
	private Type type;
	
	/** Constructeur
	 * @param libelle
	 * @param comporement
	 * @param type
	 */
	public Animal(String libelle, Comportement comporement, Type type) {
		super();
		this.libelle = libelle;
		this.comporement = comporement;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [" + libelle + " -> " + comporement.getLibelle() + " -> " + type + "]";
	}
	
	
	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the comporement
	 */
	public Comportement getComporement() {
		return comporement;
	}

	/** Setter
	 * @param comporement the comporement to set
	 */
	public void setComporement(Comportement comporement) {
		this.comporement = comporement;
	}

	/** Getter
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

}
