package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main 
{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	public List<Medarbejder> medarbejderList = new ArrayList<>();
	public List<Aktivitet> aktivitetList = new ArrayList<>();
	public List<Projekt> projektList = new ArrayList<>();
	
	public List<Medarbejder> getmedarbejderList() {
	    return this.medarbejderList;
	}
	public List<Aktivitet> getaktivitetList() {
	    return this.aktivitetList;
	}
	public List<Projekt> getprojektList() {
	    return this.projektList;
	}
	
	
	public static void main(String[] args){
		String navn = "din mor";
		String ini = "mor";
		String tlf = "kage";
		String Em = "god";
		String cpr = "din mor";
		Oprettelse op = new Oprettelse();
		op.opretMedarbejder(navn, ini, tlf, Em, cpr, true);
		
		op.opretMedarbejder("Kristian Krarup", "KK", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		
		printList print = new printList();
		print.printMedarbejderList();
		
		loginGUI frame = new loginGUI();
        frame.setTitle("softwareudviklingsprojekter");
        frame.setSize(500, 300);
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
