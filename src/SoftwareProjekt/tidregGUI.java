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
	JButton tidregK; // vores knap
	JTextField tidT; // vores text field
	JTextArea tidVis; // vores text field
	JLabel tidL; // vores label
	
	public tidregGUI()
	{
		 Dimension BSize = new Dimension(300, 100);
		 Dimension TSize = new Dimension(300, 30);
		 Dimension ASize = new Dimension(300, 200);
	     Dimension spaceDimension = new Dimension(50, 30);
	     getContentPane().setLayout(new BorderLayout());
	     
	     tidregK = new JButton("Printer Liste");
	     tidregK.addActionListener(this);
	     tidregK.setMaximumSize(BSize);
	     tidregK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     tidT = new JTextField();
	     tidT.setMaximumSize(TSize);
	     
	     tidVis = new JTextArea();
	     tidVis.setSize(30, 30);
	     tidVis.setMaximumSize(ASize);
	     
	     tidL = new JLabel("Indtast din arbejdstid");
	     
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidL);
	     p1.add(tidT);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidregK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidVis);
	     
	     getContentPane().add(p1, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == tidregK)
		{
			
		}
	}

}
