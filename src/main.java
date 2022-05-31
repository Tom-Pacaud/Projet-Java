import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		Scanner mySc = new Scanner(System.in);
		
		int i = 1;
		int j = 0;
		Contact tab[];
		tab = new Contact[100];
		while(i == 1){
		
			System.out.println("Bienvenu dans le carnet de contact Java developé par @tomtomleouistiti (c mon insta tu peu follow ça fait plaisir");
			System.out.println("Que souhaitez vous faire ? ");
			System.out.println("1) Ajouter un contact");
			System.out.println("2) Consulter les contacts existant");
			System.out.println("3) Quitter");
			int choose = mySc.nextInt();
			if (choose == 1) {
				if (j == 100) {
					System.out.println("Error : Capacité de Stockage dépassé");
				}
				else {
					System.out.print("Entrez le nom : ");
					mySc.nextLine();
					String nom = mySc.nextLine();
					System.out.print("Entrez le prénom : ");
					String prenom = mySc.nextLine();
					System.out.print("Entrez son age : ");
					int age = mySc.nextInt();
					System.out.print("Entrez le jours de naissance : ");
					int jours = mySc.nextInt();
					System.out.print("Entrez le mois de naissance : ");
					int mois = mySc.nextInt();
					System.out.print("Entrez l'année de naissance : ");
					int annee = mySc.nextInt();
					System.out.print("Entrez son numero de téléphone : ");
					mySc.nextLine();
					String num = mySc.nextLine();
					System.out.print("Entrez son email : ");
					String mail = mySc.nextLine();
					tab[j] = new Contact(new Personne(nom,prenom,age,new Date(jours,mois,annee)),new Numero(num),new Mail(mail));
					j++;
				}
			}
			else if (choose == 2) {
			
				System.out.println("Voici la liste des contacts : ");
				for (int value = 0; value < j; value++) {
					tab[value].afficher();
				}
				
			}
		
			else if (choose == 3) {
			
				i = 0;
			
			}
		
			else {
				System.out.println("Erreur");
			}
		}
		
		//Contact TomP = new Contact(new Personne("Pacaud","Tom",20,new Date(10,11,2001)),new Numero(0,6,0,2,3,7,3,3,3,2),new Mail("tom82209@gmail.com"));
		//TomP.afficher();
	}
}