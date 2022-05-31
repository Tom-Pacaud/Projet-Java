public class Date {
	
	private int jours;
	private int mois;
	private int annee;
	
	public Date(int jours, int mois, int annee){
		
		if ( 0 < jours & jours < 32) {
			this.jours = jours;
		}
		else {
			System.out.println("Error : Date invalide");
		}
		
		if (0 < mois & mois < 13) {
			this.mois = mois;
		}
		else {
			System.out.println("Error : Date invalide");
		}
		
		this.annee = annee;
		
	}
	
	public void afficher() {
		System.out.println("--> " + this.jours +" / " + this.mois + " / " + this.annee + " ");
	}
	
}