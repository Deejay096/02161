package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Main{
	
	public static List<Medarbejder> medarbejderList = new ArrayList<>();
	public static List<Aktivitet> aktivitetList = new ArrayList<>();
	public static List<Projekt> projektList = new ArrayList<>();
	
	public static List<Medarbejder> getmedarbejderList() {
	    return medarbejderList;
	}
	public static List<Aktivitet> getaktivitetList() {
	    return aktivitetList;
	}
	public static List<Projekt> getprojektList() {
	    return projektList;
	}
	public static void tilføjMedarbejderList(Medarbejder medarbejder){
		medarbejderList.add(medarbejder);	
	}
	
	
	public static void main(String[] args){
		Oprettelse op = new Oprettelse();
		Medarbejder m = op.opretMedarbejder("Kristian Krarup", "KK", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		Medarbejder m1 = op.opretMedarbejder("Kristian Krarup", "KK2", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		
		
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
		if(projektList.contains(index) == true || projektList.contains(projektnavn) == true ){
			for (Projekt p: projektList )
			if(p.equals(index)){
				return p;
			}
			for (Projekt p: projektList )
				if(p.equals(projektnavn)){
					return p;
				}
		}
		return null;
	}
	
}
