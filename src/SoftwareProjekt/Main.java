package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.PrintWriter;


public class Main extends JFrame implements ActionListener{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	JButton lavActivet, hexB, binB; // vores convert knapper
	JTextField decText, hexText, binText; // vores text fields
	JLabel decLabel, hexLabel, binLabel; // vores labels
	
	public Main(){

        Dimension BSize = new Dimension(150, 25);
        Dimension TSize = new Dimension(500, 25);
        Dimension spaceDimension = new Dimension(150, 10);
        getContentPane().setLayout(new BorderLayout());


        lavActivet = new JButton("Aktivitet");
        lavActivet.addActionListener(this);
        lavActivet.setMaximumSize(BSize);
        lavActivet.setAlignmentX(Component.CENTER_ALIGNMENT);

        binB = new JButton("Binary");
        binB.addActionListener(this);
        binB.setMaximumSize(BSize);
        binB.setAlignmentX(Component.CENTER_ALIGNMENT);

        hexB = new JButton("Hexadecimal");
        hexB.addActionListener(this);
        hexB.setMaximumSize(BSize);
        hexB.setAlignmentX(Component.CENTER_ALIGNMENT);

        decText = new JTextField();
        decText.setMaximumSize(TSize);
        binText = new JTextField();
        binText.setMaximumSize(TSize);
        hexText = new JTextField();
        hexText.setMaximumSize(TSize);

        decLabel = new JLabel("Decimal:");
        decLabel.setMaximumSize(BSize);
        binLabel = new JLabel("Binary:");
        binLabel.setMaximumSize(BSize);
        hexLabel = new JLabel("Hexadecimal:");
        hexLabel.setMaximumSize(BSize);

        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(lavActivet);
        p1. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(binB);
        p1. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(hexB);


        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        p2. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(decLabel);
        p2. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(binLabel);
        p2. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p2.add(hexLabel);

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
        p3. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(decText);
        p3. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(binText);
        p3. add(Box.createRigidArea(new Dimension(spaceDimension)));
        p3.add(hexText);

        getContentPane().add(p1, BorderLayout.EAST);
        getContentPane().add(p2, BorderLayout.WEST);
        getContentPane().add(p3, BorderLayout.CENTER);

        
    }
	
	public void actionPerformed(ActionEvent arg0){
		// TODO Auto-generated method stub
		
	}
	
	public void main(String[] args){
		Main main = new Main();
	    JFrame frame = new JFrame("softwareudviklingsprojekter");
	    frame.setSize(803, 930);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setResizable(false);
	    frame.add(main);
		LavProjekt("hi","1");
		
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
