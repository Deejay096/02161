package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main 
{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	public static List<Medarbejder> medarbejderList = new ArrayList<>();
	public List<Aktivitet> aktivitetList = new ArrayList<>();
	public List<Projekt> projektList = new ArrayList<>();
	
	public static List<Medarbejder> getmedarbejderList() {
	    return medarbejderList;
	}
	public List<Aktivitet> getaktivitetList() {
	    return this.aktivitetList;
	}
	public List<Projekt> getprojektList() {
	    return this.projektList;
	}
	public static void tilføjMedarbejderList(Medarbejder medarbejder){
		medarbejderList.add(medarbejder);	
	}
	
	
	public static void main(String[] args){
		Oprettelse op = new Oprettelse();
		Medarbejder m = op.opretMedarbejder("Kristian Krarup", "KK", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		Medarbejder m1 = op.opretMedarbejder("Kristian Krarup", "KK2", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		tilføjMedarbejderList(m);
		tilføjMedarbejderList(m1);
		
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
