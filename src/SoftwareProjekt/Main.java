package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main 
{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	public static void main(String[] args){
		opretGUI frame = new opretGUI();
        frame.setTitle("softwareudviklingsprojekter");
        frame.setSize(1000, 560);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
	}
	
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
	
}
