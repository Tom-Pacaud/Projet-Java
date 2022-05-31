public class Numero {
	
	private String num;
	
	public Numero(String num) {
		this.num = num;
	}
	
	public String getNumero() {
		return this.num;
	}
	
	public void setNumero(String num) {
		this.num = num;
	}
	
	public void afficher() {
		System.out.println( "-->" + " " + this.num);
	}
	
}