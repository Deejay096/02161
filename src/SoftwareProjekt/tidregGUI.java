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

//Lavet af Jackie Vuong: studie nr. s153121 

public class tidregGUI extends JFrame implements ActionListener
{
	JButton tidregK; // vores knap
	
	public tidregGUI()
	{
		 Dimension BSize = new Dimension(500, 50);
	     Dimension spaceDimension = new Dimension(100, 100);
	     getContentPane().setLayout(new BorderLayout());
	     
	     tidregK = new JButton("Printer Liste");
	     tidregK.addActionListener(this);
	     tidregK.setMaximumSize(BSize);
	     tidregK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tidregK);
	     
	     getContentPane().add(p1, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}

}
