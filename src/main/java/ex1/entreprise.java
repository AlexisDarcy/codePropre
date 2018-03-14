package ex1;

import java.util.Date;

/**
 * @author Alexis Darcy
 *
 */
public class entreprise {

	/**Siret : int*/
	private int Siret;
	/**Nom : String*/
	private String Nom;
	/**adresse : String*/
	private String adresse;

	/**date_Creation : Date*/
	private Date dateCreation;
	
	/**capitalMax : int*/
	private static final int CAPITAL_MAX = 3000000;
	
	
	/**
	 * affiche les informations de l'entreprise
	 */
	public void afficherEntreprise(){
		
	}
	
	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return Siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		Siret = siret;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return Nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		Nom = nom;
	}

	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the date_Creation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param date_Creation the date_Creation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/** Getter
	 * @return the capitalmax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
}