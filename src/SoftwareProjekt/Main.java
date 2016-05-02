package SoftwareProjekt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	JButton lavAktivitet, lavMedarbejder, lavProjekt; // vores knapper
	JTextField aktivitetNavn, medarbejderNavn, projektNavn, aktivitetID, medarbejderID, projektID, medCPR, medTLF, medEmail; // vores text fields
	JLabel aLabelNavn, mLabelNavn, pLabelNavn, aLabelID, mLabelID, pLabelID, mLabelCPR, mLabelTLF, mLabelEmail ; // vores labels
	
	public Main(){

        Dimension BSize = new Dimension(200, 25);
        Dimension TSize = new Dimension(300, 25);
        Dimension spaceDimension = new Dimension(300, 10);
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
        medCPR = new JTextField();
        medCPR.setMaximumSize(TSize);
        medTLF = new JTextField();
        medTLF.setMaximumSize(TSize);
        medEmail = new JTextField();
        medEmail.setMaximumSize(TSize);
        
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
        
        mLabelCPR = new JLabel("Indtast medarbejder CPR");
        mLabelCPR.setMaximumSize(BSize);
        mLabelTLF = new JLabel("Indtast medarbejder TLF");
        mLabelTLF.setMaximumSize(BSize);
        mLabelEmail = new JLabel("Indtast medarbejder E-mail");
        mLabelEmail.setMaximumSize(BSize);
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(aLabelNavn);
        p1.add(aktivitetNavn);
        p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(aLabelID);
        p1.add(aktivitetID);
        p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(lavAktivitet);

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(mLabelNavn);
        p2.add(medarbejderNavn);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(mLabelID);
        p2.add(medarbejderID);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(mLabelCPR);
        p2.add(medCPR);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(mLabelTLF);
        p2.add(medTLF);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(mLabelEmail);
        p2.add(medEmail);
        p2.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(lavMedarbejder);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
        p3.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(pLabelNavn);
        p3.add(projektNavn);
        p3.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(pLabelID);
        p3.add(projektID);
        p3.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(lavProjekt);
        
        getContentPane().add(p1, BorderLayout.WEST);
        getContentPane().add(p2, BorderLayout.CENTER);
        getContentPane().add(p3, BorderLayout.EAST);
    }
	
	 public void actionPerformed( ActionEvent e) {

	   if (e.getSource() == lavAktivitet) {
		   if(aktivitetNavn.getText().length() != 0 && aktivitetID.getText().length() != 0){
			   String navn = aktivitetNavn.getText();
		       String id = aktivitetID.getText();
		       Aktivitet aktivitet = new Aktivitet(navn,id);   
		       System.out.println(navn + " " + id);
		   }
	   }

	   if (e.getSource() == lavMedarbejder){
		   if(medarbejderNavn.getText().length() != 0 && medarbejderID.getText().length() != 0){
		      String navn = medarbejderNavn.getText();
		      String id = medarbejderID.getText();
		      Medarbejder medarbejder = new Medarbejder(navn,id, null,null,null,null);   
		      System.out.println(navn + " " + id);
		   }   
	   }
	             
	   if (e.getSource() == lavProjekt)
	   {
		   if(projektNavn.getText().length() != 0 && projektID.getText().length() != 0)
		   {
			   String navn = projektNavn.getText();
		       String id = projektID.getText();
		       Projekt projekt = new Projekt(navn,id);   
		       System.out.println(navn + " " + id);
		   }
	   }
	 }
	
	public static void main(String[] args){
		Main frame = new Main();
        frame.setTitle("softwareudviklingsprojekter");
        frame.setSize(1000, 560);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
	}
	
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
