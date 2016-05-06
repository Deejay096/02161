package SoftwareProjekt;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

//Lavet af Jackie Vuong: studie nr. s153121 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class hovedGUI extends JFrame implements ActionListener
{
	JButton opretK, printK; // vores knap
	JScrollPane scrl = new JScrollPane();
	
	public hovedGUI()
	{
		 Dimension BSize = new Dimension(500, 50);
	     Dimension spaceDimension = new Dimension(300, 100);
	     getContentPane().setLayout(new BorderLayout());
	     
	     opretK = new JButton("Opretter Menu");
	     opretK.addActionListener(this);
	     opretK.setMaximumSize(BSize);
	     opretK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     printK = new JButton("Pinter Menu");
	     printK.addActionListener(this);
	     printK.setMaximumSize(BSize);
	     printK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(opretK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printK);
	        
	     getContentPane().add(p1, BorderLayout.CENTER);
	     
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == opretK)
		{
			opretGUI frameOpret = new opretGUI();
		    frameOpret.setTitle("softwareudviklingsprojekter");
		    frameOpret.setSize(1000, 560);
		    frameOpret.setResizable(true);
		    frameOpret.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    frameOpret.setVisible(true);		
		}
	}
	
}
