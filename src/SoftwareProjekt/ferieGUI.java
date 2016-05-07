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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ferieGUI extends JFrame implements ActionListener
{
	JButton sygK, ferK, tb; // vores knapper
	JTextField sygT, ferT, medT, medTs; // vores text field
	JTextArea Vis; // vores text field
	JLabel sygL, ferL, medL, medLs; // vores label
	
	public ferieGUI()
	{
		Dimension BSize = new Dimension(300, 100);
		Dimension TSize = new Dimension(300, 30);
		Dimension ASize = new Dimension(300, 200);
	    Dimension spaceDimension = new Dimension(50, 30);
	    getContentPane().setLayout(new BorderLayout());
	     
	    sygK = new JButton("registre din sygmelding");
	    sygK.addActionListener(this);
	    sygK.setMaximumSize(BSize);
	    sygK.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	    ferK = new JButton("registre din ferie");
	    ferK.addActionListener(this);
	    ferK.setMaximumSize(BSize);
	    ferK.setAlignmentX(Component.CENTER_ALIGNMENT);
	    
	    tb = new JButton("Tilbage");
        tb.addActionListener(this);
        tb.setMaximumSize(BSize);
        tb.setAlignmentX(Component.CENTER_ALIGNMENT);
	     
	     sygT = new JTextField();
	     sygT.setMaximumSize(TSize);
	     ferT = new JTextField();
	     ferT.setMaximumSize(TSize);
	     medT = new JTextField();
	     medT.setMaximumSize(TSize);
	     medTs = new JTextField();
	     medTs.setMaximumSize(TSize);
	     
	     Vis = new JTextArea();
	     Vis.setMaximumSize(ASize);
	     
	     sygL = new JLabel("Indtast din forventede fravær");
	     ferL = new JLabel("Indtast din forventede fravær");
	     medL = new JLabel("Indtast medarbejder navn");
	     medLs = new JLabel("Indtast medarbejder navn");
	     
	     JPanel p1 = new JPanel();
	     p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
	     p1.add(medL);
	     p1.add(medT);
	     p1.add(ferL);
	     p1.add(ferT);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(ferK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(medLs);
	     p1.add(medTs);
	     p1.add(sygL);
	     p1.add(sygT);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(sygK);
	     p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
	     p1.add(Vis);
	     p1.add(tb);
	     
	     
	     getContentPane().add(p1, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == ferK)
		{
			if(ferT.getText().length() != 0 && medT.getText().length() != 0)
			{
				 Medarbejder m = Main.getMedarbejder(medT.getText(), null);
				 m.tidFerie(m, Integer.parseInt(ferT.getText()));
			}
			if(ferT.getText().length() == 0)
			{
				ferT.setText("mangler at blive udfyldt");
			}
			if(medT.getText().length() == 0)
			{
				medT.setText("mangler at blive udfyldt");
			}
		}
		if(e.getSource() == sygK)
		{
			if(sygT.getText().length() != 0 && medTs.getText().length() != 0)
			{
				 Medarbejder m = Main.getMedarbejder(medTs.getText(), null);
				 m.tidSyg(m, Integer.parseInt(ferT.getText()));
			}
			if(sygT.getText().length() == 0)
			{
				sygT.setText("mangler at blive udfyldt");
			}
			if(medTs.getText().length() == 0)
			{
				medTs.setText("mangler at blive udfyldt");
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
