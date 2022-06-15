public class Contact{
	
	private Personne personne;
	private Numero numero;
	private Mail email;
	
	
	public Contact(Personne personne, Numero numero, Mail email) {
		
		this.personne = personne;
		this.numero = numero;
		this.email = email;
		
	}
	
	public Personne getPersonne() {
		return this.personne;
	}
	
	public Numero getNum() {
		return this.numero;
	}
	
	public Mail getMail() {
		return this.email;
	}
	
	public void afficher() {
		
		this.personne.afficher();
		this.numero.afficher();
		this.email.afficher();
		System.out.println("---------------------------------");
		
	}
	
	
}

