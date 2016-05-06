package SoftwareProjekt;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Lavet af Jackie Vuong: studie nr. s153121 

public class printerGUI extends JFrame implements ActionListener
{
	JButton printM, printA, printP ; // vores knapper
	JTextArea printT; // vores text field

	public printerGUI()
	{
		 Dimension BSize = new Dimension(500, 50);
	     Dimension spaceDimension = new Dimension(100, 100);
	     getContentPane().setLayout(new BorderLayout());
	     
	     printM = new JButton("Print Medarbejder Liste");
	     printM.addActionListener(this);
	     printM.setMaximumSize(BSize);
	     printM.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     printA = new JButton("Print Aktivitets Liste");
	     printA.addActionListener(this);
	     printA.setMaximumSize(BSize);
	     printA.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     printP = new JButton("Print Projekt Liste");
	     printP.addActionListener(this);
	     printP.setMaximumSize(BSize);
	     printP.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     printT = new JTextArea();
	     printT.setSize(300, 300);
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printM);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printA);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printP);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printT);
	     
	     getContentPane().add(p1, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		printList print = new printList();
		
		if(e.getSource() == printM)
		{
			print.printMedarbejderList();
			
		}
		if(e.getSource() == printA)
		{
			print.printAktivitetList();
		}
		if(e.getSource() == printP)
		{
			print.printProjektList();
		}
	}
}
