public class Date {
	
	private String jours;
	private String mois;
	private String annee;
	
	public Date(String jours, String mois, String annee){
		
		this.jours = jours;
		this.mois = mois;
		this.annee = annee;
		
	}
	
	public String getJours() {
		return this.jours;
	}
	
	public String getMois() {
		return this.mois;
	}
	
	public String getAnnee() {
		return this.annee;
	}
	
	public void afficher() {
		System.out.println("--> " + this.jours +" / " + this.mois + " / " + this.annee + " ");
	}
	
}