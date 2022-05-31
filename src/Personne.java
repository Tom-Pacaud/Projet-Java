public class Personne {
	
	private String nom;
	public String prenom;
	protected int age;
	
	public Personne() {
		
		this.nom = "Anonyme";
		this.prenom = "Anonyme";
		this.age = -1;
		
	}
	
	public Personne(String nom, String prenom, int age) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void afficher(){
		System.out.println(this.getNom() + " / " + this.getPrenom() + " / " + this.getAge() + " ans");
	}
}