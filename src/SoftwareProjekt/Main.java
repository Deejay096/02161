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
	JTextField aktivitetNavn, medarbejderNavn, projektNavn, aktivitetID, medarbejderID, projektID; // vores text fields
	JLabel aLabelNavn, mLabelNavn, pLabelNavn, aLabelID, mLabelID, pLabelID ; // vores labels
	
	public Main(){

        Dimension BSize = new Dimension(150, 25);
        Dimension TSize = new Dimension(500, 25);
        Dimension spaceDimension = new Dimension(250, 10);
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

        aktivitetNavn = new JTextField();
        aktivitetNavn.setMaximumSize(TSize);
        projektNavn = new JTextField();
        projektNavn.setMaximumSize(TSize);
        medarbejderNavn = new JTextField();
        medarbejderNavn.setMaximumSize(TSize);

        aktivitetID = new JTextField();
        aktivitetID.setMaximumSize(TSize);
        projektID = new JTextField();
        projektID.setMaximumSize(TSize);
        medarbejderID = new JTextField();
        medarbejderID.setMaximumSize(TSize);
        
        aLabelNavn = new JLabel("Indtast aktivitet navn");
        aLabelNavn.setMaximumSize(BSize);
        pLabelNavn = new JLabel("Indtast projekt navn");
        pLabelNavn.setMaximumSize(BSize);
        mLabelNavn = new JLabel("Indtast medarbejder navn");
        mLabelNavn.setMaximumSize(BSize);

        aLabelID = new JLabel("Indtast aktivitet id");
        aLabelID.setMaximumSize(BSize);
        pLabelID = new JLabel("Indtast projekt id");
        pLabelID.setMaximumSize(BSize);
        mLabelID = new JLabel("Indtast medarbejder intialer");
        mLabelID.setMaximumSize(BSize);
        
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
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(aLabelID);
        p2.add(aktivitetID);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(mLabelID);
        p2.add(projektID);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(pLabelID);
        p2.add(medarbejderID);

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
        p3.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(aLabelNavn);
        p3.add(aktivitetNavn);
        p3.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(pLabelNavn);
        p3.add(projektNavn);
        p3.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(mLabelNavn);
        p3.add(medarbejderNavn);
        

        getContentPane().add(p1, BorderLayout.EAST);
        getContentPane().add(p2, BorderLayout.CENTER);
        getContentPane().add(p3, BorderLayout.WEST);
        
        
    }
	
	 public void actionPerformed( ActionEvent e) {

	   if (e.getSource() == lavAktivitet) {
		   
		   if(aktivitetNavn.getText().length() != 0 && aktivitetID.getText().length() != 0){
			   String navn = aktivitetNavn.getText();
		       String id = aktivitetID.getText();
		       Aktivitet aktivitet = new Aktivitet(navn,id);   
		       System.out.println(navn + id);
		   }
	       
	       
	   }

	   if (e.getSource() == lavMedarbejder) {
	       String text = medarbejderNavn.getText();
	             
	       }
	             
	   if (e.getSource() == lavProjekt) {
	       String text = projektNavn.getText();
	          
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
