public class Numero {
	
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	private int num6;
	private int num7;
	private int num8;
	private int num9;
	private int num10;
	
	public Numero(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		this.num7 = num7;
		this.num8 = num8;
		this.num9 = num9;
		this.num10 = num10;
			
	}
	
	public void afficher() {
		System.out.println( "-->" + " " + this.num1 + this.num2 + "." + this.num3 + this.num4 + "." + this.num5 + this.num6 + "." + this.num7 + this.num8 + "." + this.num9 + this.num10);
	}
	
}