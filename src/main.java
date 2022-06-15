import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class main {
	public static void main(String[] args) {
		
//construction du conteneur des différents contact
		
		Vector<Contact> tab = new Vector<Contact>();
		
//construction de la fenêtre de l'application 
		
		JFrame f = new JFrame("Mon Carnet d'Adresse");
		
	    JPanel pannel = new JPanel(); 
	    
	    JTabbedPane onglets = new JTabbedPane(SwingConstants.BOTTOM);

	    JPanel onglet1 = new JPanel();
	    onglet1.setLayout(null);
	    
	    JButton btn1 = new JButton("Add");
	    btn1.setPreferredSize(new Dimension(100, 30));
	    
	    JLabel desc1 = new JLabel("Nom");
	    JTextField text1 = new JTextField();
	    text1.setPreferredSize(new Dimension(100, 20));
	    
	    JLabel desc2 = new JLabel("Prénom");
	    JTextField text2 = new JTextField();
	    text2.setPreferredSize(new Dimension(100, 20));
	    
	    JLabel desc3 = new JLabel("Age");
	    JTextField text3 = new JTextField();
	    text3.setPreferredSize(new Dimension(50, 20));
	    
	    JLabel desc4 = new JLabel("Date de Naissance");
	    JLabel desc41 = new JLabel("/");
	    JLabel desc42 = new JLabel("/");
	    JTextField text41 = new JTextField();
	    JTextField text42 = new JTextField();
	    JTextField text43 = new JTextField();
	    text41.setPreferredSize(new Dimension(30, 20));
	    text42.setPreferredSize(new Dimension(30, 20));
	    text43.setPreferredSize(new Dimension(50, 20));
	    
	    JLabel desc5 = new JLabel("N° de téléphone");
	    JTextField text5 = new JTextField();
	    text5.setPreferredSize(new Dimension(100, 20));
	    
	    JLabel desc6 = new JLabel("e-mail");
	    JTextField text6 = new JTextField();
	    text6.setPreferredSize(new Dimension(100, 20));
	    
	    onglet1.add(desc1);
	    onglet1.add(text1);
	    onglet1.add(desc2);
	    onglet1.add(text2);
	    onglet1.add(desc3);
	    onglet1.add(text3);
	    onglet1.add(desc4);
	    onglet1.add(text41);
	    onglet1.add(desc41);
	    onglet1.add(text42);
	    onglet1.add(desc42);
	    onglet1.add(text43);
	    onglet1.add(desc5);
	    onglet1.add(text5);
	    onglet1.add(desc6);
	    onglet1.add(text6);
	    onglet1.add(btn1);
	    
	    onglet1.setLayout(new FlowLayout(FlowLayout.LEADING));
	    onglet1.setPreferredSize(new Dimension(600, 330));
	    onglets.addTab("Add new contact", onglet1);

	    JPanel onglet2 = new JPanel();
	    JButton btn2 = new JButton("afficher");
	    
	    onglet2.add(btn2);
	    onglets.addTab("list of contact", onglet2);

	    pannel.add(onglets);
	    
	    f.setSize(620, 400);
	    f.setLocationRelativeTo(null);
	    f.getContentPane().add(pannel);
	    f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
	    btn1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent event) {
	    		String name = text1.getText();
	    		String firstname = text2.getText();
	    		String age = text3.getText();
	    		String day = text41.getText();
	    		String month = text42.getText();
	    		String annee = text43.getText();
	    		String telephone = text5.getText();
	    		String email = text6.getText();
	    		tab.add(new Contact(new Personne(name,firstname,age,new Date(day,month,annee)),new Numero(telephone),new Mail(email)));
				
	    		
	    	}
	    });
	    
	    btn2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent event) {
	    		System.out.println();
	    		System.out.println();
	    		System.out.println();
	    		System.out.println("Voici la liste des contacts : ");
				for (int value = 0; value < tab.size(); value++) {
					Contact c = tab.get(value);
					c.afficher();
				
	    		
	    	}
	    }});
		
	}
}