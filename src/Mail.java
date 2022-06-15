public class Mail {
	
	private String email;
	
	public Mail(String email) {
		this.email = email;
	}
	
	public String getMail() {
		return this.email;
	}
	
	public void setMail(String email) {
		this.email = email;
	}
	
	public void afficher() {
		System.out.println("--> " + this.email);
	}
	
}