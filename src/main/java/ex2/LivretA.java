package ex2;

/**ReprÃ©sente un livret A (type=LA)
 * @author Alexis Darcy
 */
public class LivretA extends CompteBancaire {

	/**tauxRemuneration : double*/
	private double tauxRemuneration;
	
	/** Constructeur
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA( double solde, double tauxRemuneration) {
		super(solde, 0);
		this.setTauxRemuneration(tauxRemuneration);
	}
		
	/**Ajoute le taux de remunération annuelle
	 * 
	 */
	public void appliquerRemuAnnuelle(){
			setSolde(getSolde() + getSolde() * tauxRemuneration/100);		
	}
	
	/** Getter
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
