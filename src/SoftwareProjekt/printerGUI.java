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

public class printerGUI extends JFrame implements ActionListener
{
	JButton printK; // vores knap

	public printerGUI()
	{
		 Dimension BSize = new Dimension(500, 50);
	     Dimension spaceDimension = new Dimension(100, 100);
	     getContentPane().setLayout(new BorderLayout());
	     
	     printK = new JButton("Printer Liste");
	     printK.addActionListener(this);
	     printK.setMaximumSize(BSize);
	     printK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printK);
	     
	     getContentPane().add(p1, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
}
