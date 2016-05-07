// Udarbejdet af Jackie Vuong: studie nr. s153121

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

public class hovedGUI extends JFrame implements ActionListener
{
	JButton opretK, printK, tid, ferie, logud; // vores knapper
	
	public hovedGUI()
	{
		 
		 Dimension BSize = new Dimension(500, 100);
	     Dimension spaceDimension = new Dimension(300, 50);
	     getContentPane().setLayout(new BorderLayout());
	     
	     opretK = new JButton("Opretter Menu");
	     opretK.addActionListener(this);
	     opretK.setMaximumSize(BSize);
	     opretK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     printK = new JButton("Printer Menu");
	     printK.addActionListener(this);
	     printK.setMaximumSize(BSize);
	     printK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     tid = new JButton("Tidsregistrations Menu");
	     tid.addActionListener(this);
	     tid.setMaximumSize(BSize);
	     tid.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     ferie = new JButton("Ferie og syge melding");
	     ferie.addActionListener(this);
	     ferie.setMaximumSize(BSize);
	     ferie.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     logud = new JButton("Log ud");
	     logud.addActionListener(this);
	     logud.setMaximumSize(BSize);
	     logud.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(opretK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(printK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(tid);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(ferie);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(logud);
	        
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
		    dispose();   
		}
		if(e.getSource() == printK)
		{
			printerGUI framePrinter = new printerGUI();
		    framePrinter.setTitle("softwareudviklingsprojekter");
		    framePrinter.setSize(1000, 560);
		    framePrinter.setResizable(true);
		    framePrinter.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    framePrinter.setVisible(true);
		    dispose();
		}
		if(e.getSource() == tid)
		{
			tidregGUI frameTidreg = new tidregGUI();
		    frameTidreg.setTitle("softwareudviklingsprojekter");
		    frameTidreg.setSize(1000, 560);
		    frameTidreg.setResizable(true);
		    frameTidreg.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    frameTidreg.setVisible(true);
			dispose();
		}
		if(e.getSource() == ferie)
		{
			ferieGUI frameFerie = new ferieGUI();
		    frameFerie.setTitle("softwareudviklingsprojekter");
		    frameFerie.setSize(1000, 560);
		    frameFerie.setResizable(true);
		    frameFerie.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    frameFerie.setVisible(true);
			dispose();
		}
		if(e.getSource() == logud)
		{
			loginGUI frame = new loginGUI();
	        frame.setTitle("softwareudviklingsprojekter");
	        frame.setSize(500, 300);
	        frame.setResizable(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);	
	        dispose();
		}
	}
}
