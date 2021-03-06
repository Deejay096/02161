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

//Lavet af Jackie Vuong: studie nr. s153121 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class loginGUI extends JFrame implements ActionListener
{
	JButton logK; // vores knap
	JTextField logT; // vores text field
	JLabel logL ; // vores label
	
	Login log = new Login();
	
	public loginGUI()
	{
        Dimension BSize = new Dimension(200, 25);
        Dimension TSize = new Dimension(300, 25);
        Dimension spaceDimension = new Dimension(300, 10);
        getContentPane().setLayout(new BorderLayout());
        
        logK = new JButton("Login");
        logK.addActionListener(this);
        logK.setMaximumSize(BSize);
        logK.setAlignmentX(Component.CENTER_ALIGNMENT);

        logT = new JTextField();
        logT.setMaximumSize(TSize);
        
        logL = new JLabel("Indtast kodeord");
        logL.setMaximumSize(BSize);
        
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(logL);
        p1.add(logT);
        p1.add(Box.createRigidArea(new Dimension(spaceDimension)));
        p1.add(logK);
        
        getContentPane().add(p1, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == logK)
		{
			try {
				if(log.projektlederlogin(logT.getText()) == true)
				{
					hovedGUI frameH = new hovedGUI();
				    frameH.setTitle("softwareudviklingsprojekter");
				    frameH.setSize(1000, 560);
				    frameH.setResizable(true);
				    frameH.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				    frameH.setVisible(true);		
				    logT.setText("");
				    dispose();
				}
				else
				{
					logT.setText("");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
	}

}
