import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		Scanner mySc = new Scanner(System.in);
		
		int i = 1;
		while(i == 1){
		
			System.out.println("Bienvenu dans le carnet de contact Java developé par @tomtomleouistiti (c mon insta tu peu follow ça fait plaisir");
			System.out.println("Que souhaitez vous faire ? ");
			System.out.println("1) Ajouter un contact");
			System.out.println("2) Consulter les contacts existant");
			System.out.println("3) Quitter");
			int choose = mySc.nextInt();
			if (choose == 1) {
				
			}
			else if (choose == 2) {
			
				System.out.println("Voici la liste des contacts : ");
			
			
			}
		
			else if (choose == 3) {
			
				i = 0;
			
			}
		
			else {
				System.out.println("Erreur");
			}
		}
		
		
		Personne bobP = new Personne("Dupont", "Bob", 15);
		//bobP.afficher();
		Numero numbob = new Numero(0,6,0,2,3,7,3,3,3,2);
		//numbob.afficher();
		Mail mailbob = new Mail("tom82209@gmail.com");
		//mailbob.afficher();
		Contact bob = new Contact(bobP, numbob, mailbob);
		bob.afficher();
		Personne Tom = new Personne(mySc.nextLine(), mySc.nextLine(), mySc.nextInt());
		Tom.afficher();
		
	}
}