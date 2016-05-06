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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Lavet af Jackie Vuong: studie nr. s153121 

public class tidregGUI extends JFrame implements ActionListener
{
	JButton tidregK, tb; // vores knapper
	JTextField tidT, medT, akT; // vores text field
	JTextArea tidVis; // vores text field
	JLabel tidL, medL, akL; // vores label
	
	public tidregGUI()
	{
		 Dimension BSize = new Dimension(300, 100);
		 Dimension TSize = new Dimension(300, 30);
		 Dimension ASize = new Dimension(300, 200);
	     Dimension spaceDimension = new Dimension(50, 30);
	     getContentPane().setLayout(new BorderLayout());
	     
	     tidregK = new JButton("registre din tid");
	     tidregK.addActionListener(this);
	     tidregK.setMaximumSize(BSize);
	     tidregK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     tb = new JButton("Tilbage");
	     tb.addActionListener(this);
	     tb.setMaximumSize(BSize);
	     tb.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     tidT = new JTextField();
	     tidT.setMaximumSize(TSize);
	     medT = new JTextField();
	     medT.setMaximumSize(TSize);
	     akT = new JTextField();
	     akT.setMaximumSize(TSize);
	     
	     tidVis = new JTextArea();
	     tidVis.setMaximumSize(ASize);
	     
	     tidL = new JLabel("Indtast din arbejdstid");
	     medL = new JLabel("Indtast medarbejder navn");
	     akL = new JLabel("Indtast aktivitet navn");
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(akL);
	     p1.add(akT);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(medL);
	     p1.add(medT);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidL);
	     p1.add(tidT);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidregK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidVis);
	     p1.add(tb);
	     
	     getContentPane().add(p1, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == tidregK)
		{
			if(akT.getText().length() != 0 && medT.getText().length() != 0 && tidT.getText().length() != 0)
			{
				 Aktivitet a = Main.getAktivitet(akT.getText(), null);
				 Medarbejder m = Main.getMedarbejder(medT.getText(), null);
				 a.TidsRegistrering(m, Integer.parseInt(tidT.getText()));
			}
			if(akT.getText().length() == 0)
			{
				akT.setText("mangler at blive udfyldt");
			}
			if(medT.getText().length() == 0)
			{
				medT.setText("mangler at blive udfyldt");
			}
			if(tidT.getText().length() == 0)
			{
				tidT.setText("mangler at blive udfyldt");
			}
		}
		if (e.getSource() == tb)
		{
			hovedGUI frameH = new hovedGUI();
		    frameH.setTitle("softwareudviklingsprojekter");
		    frameH.setSize(1000, 560);
		    frameH.setResizable(true);
		    frameH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    frameH.setVisible(true);		
		    dispose();
		}
	}
}
