public class Contact{
	
	private Personne personne;
	private Numero numero;
	private Mail email;
	
	
	public Contact(Personne personne, Numero numero, Mail email) {
		
		this.personne = personne;
		this.numero = numero;
		this.email = email;
		
	}
	
	public void afficher() {
		
		this.personne.afficher();
		this.numero.afficher();
		this.email.afficher();
		
	}
	
}