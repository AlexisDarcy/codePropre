package ex2;

/** ReprÃ©sente un compte bancaire
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un dÃ©couvert est autorisÃ© seulement pour les comptes courants */
	private double decouvert;
	
	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
