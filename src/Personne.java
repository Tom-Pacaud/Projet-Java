public class Personne {
	
	private String nom;
	private String prenom;
	private String age;
	private Date born;
	
	public Personne(String nom, String prenom, String age, Date born) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.born = born;
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public Date getBorn() {
		return this.born;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAge(String age) {
		
		this.age = age;
	}
	
	public void setBorn(Date born) {
		this.born = born;
	}
	
	public void afficher(){
		System.out.println(this.getNom() + " / " + this.getPrenom() + " / " + this.getAge() + " ans");
		this.born.afficher();
	}
}