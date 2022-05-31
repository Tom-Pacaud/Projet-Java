public class Date {
	
	private int jours;
	private int mois;
	private int annee;
	
	public Date(int jours, int mois, int annee){
		
		if ( 0 < jours & jours < 32) {
			this.jours = jours;
		}
		
		if (0 < mois & mois < 13) {
			this.mois = mois;
		}
		
		this.annee = annee;
		
	}
	
}