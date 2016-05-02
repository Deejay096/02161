package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.PrintWriter;


public class Main extends JPanel implements MouseListener{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	
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
	
	
	public void main(String[] args){
		Main main = new Main();
	    JFrame frame = new JFrame("hi");
	    frame.setSize(803, 930);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setResizable(false);
	    frame.add(main);
		LavProjekt("hi","1");
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
