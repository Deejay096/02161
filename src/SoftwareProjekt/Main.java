package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

//Lavet af Jackie Vuong: studie nr. s153121 
//og Kristian :  

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
		op.opretMedarbejder("Kristian Krarup", "KK", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		op.opretMedarbejder("Boss Jackie", "JV", "23346859", "s153121@student.dtu.dk", "110094-xxxx", true);
		
		loginGUI frame = new loginGUI();
        frame.setTitle("softwareudviklingsprojekter");
        frame.setSize(500, 300);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
	}
	
	public static Projekt getProjekt(String projektnavn,String index){
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
	
	public static Aktivitet getAktivitet(String aktivitetNavn,String index)
	{
		if(aktivitetList.contains(index) == true || aktivitetList.contains(aktivitetNavn) == true ){
			for (Aktivitet a: aktivitetList )
			if(a.equals(index)){
				return a;
			}
			for (Aktivitet a: aktivitetList )
				if(a.equals(aktivitetNavn)){
					return a;
				}
		}
		return null;
	}
	
	public static Medarbejder getMedarbejder(String medNavn,String index)
	{
		if(medarbejderList.contains(index) == true || medarbejderList.contains(medNavn) == true ){
			for (Medarbejder m: medarbejderList )
			if(m.equals(index)){
				return m;
			}
			for (Medarbejder m: medarbejderList )
				if(m.equals(medNavn)){
					return m;
				}
		}
		return null;
	}
}
