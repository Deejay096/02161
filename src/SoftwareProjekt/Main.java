package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	JButton lavAktivitet, lavMedarbejder, lavProjekt; // vores knapper
	JTextField aktivitetT, medarbejderT, projektT; // vores text fields
	JLabel aktivietLabel, medarbejderLabel, projektLabel; // vores labels
	
	public Main(){

        Dimension BSize = new Dimension(150, 25);
        Dimension TSize = new Dimension(500, 25);
        Dimension spaceDimension = new Dimension(150, 10);
        getContentPane().setLayout(new BorderLayout());


        lavAktivitet = new JButton("Lav Aktivitet");
        lavAktivitet.addActionListener(this);
        lavAktivitet.setMaximumSize(BSize);
        lavAktivitet.setAlignmentX(Component.CENTER_ALIGNMENT);

        lavProjekt = new JButton("Lav Projekt");
        lavProjekt.addActionListener(this);
        lavProjekt.setMaximumSize(BSize);
        lavProjekt.setAlignmentX(Component.CENTER_ALIGNMENT);

        lavMedarbejder = new JButton("Hyr medarbejder");
        lavMedarbejder.addActionListener(this);
        lavMedarbejder.setMaximumSize(BSize);
        lavMedarbejder.setAlignmentX(Component.CENTER_ALIGNMENT);

        aktivitetT = new JTextField();
        aktivitetT.setMaximumSize(TSize);
        projektT = new JTextField();
        projektT.setMaximumSize(TSize);
        medarbejderT = new JTextField();
        medarbejderT.setMaximumSize(TSize);

        aktivietLabel = new JLabel("Indtast aktivitet");
        aktivietLabel.setMaximumSize(BSize);
        projektLabel = new JLabel("Indtast projekt");
        projektLabel.setMaximumSize(BSize);
        medarbejderLabel = new JLabel("Indtast medarbejder");
        medarbejderLabel.setMaximumSize(BSize);

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(lavAktivitet);
        p1. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(lavProjekt);
        p1. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(lavMedarbejder);


        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        p2. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(aktivietLabel);
        p2. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(projektLabel);
        p2. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(medarbejderLabel);

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
        p3. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(aktivitetT);
        p3. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(projektT);
        p3. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(medarbejderT);

        getContentPane().add(p1, BorderLayout.EAST);
        getContentPane().add(p2, BorderLayout.WEST);
        getContentPane().add(p3, BorderLayout.CENTER);

        
    }
	
	 public void actionPerformed( ActionEvent e) {

	   if (e.getSource() == lavAktivitet) {
	       String text = aktivitetT.getText();
	           
	       }

	   if (e.getSource() == lavMedarbejder) {
	       String text = medarbejderT.getText();
	             
	       }
	             
	   if (e.getSource() == lavProjekt) {
	       String text = projektT.getText();
	          
	      }
	 }
	
	public static void main(String[] args){
		Main frame = new Main();
        frame.setTitle("softwareudviklingsprojekter");
        frame.setSize(1000, 160);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		
	}
	
	public void LavProjekt(String navn,String index){
		Projekt projekt = new Projekt(navn,index);
	}
	
//	public void EnAktivitet(String navn2){
//		if(Projekt.aktivitetsListe.contains(navn2)){
//			Projekt.aktivitetsListe.
//		}
//	}
	
	public Projekt getProjekt(String projektnavn,String index){
		if(projektListe.contains(index) == true || projektListe.contains(projektnavn) == true ){
			for (Projekt p: projektListe )
			if(p.equals(index)){
				return p;
			}
			for (Projekt p: projektListe )
				if(p.equals(projektnavn)){
					return p;
				}
		}
		return null;
	}
	
}
