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

	public static void main(String[] args){
		Oprettelse op = new Oprettelse();
		op.opretMedarbejder("Kristian Krarup", "KK", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		op.opretMedarbejder("Boss Jackie", "JV", "23346859", "s153121@student.dtu.dk", "110094-xxxx", true);
		op.opretAktivitet("Frokost", "1");
		op.opretProjekt("Software", "1");

		loginGUI frame = new loginGUI();
		frame.setTitle("softwareudviklingsprojekter");
		frame.setSize(500, 300);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}

	@SuppressWarnings("static-access")
	public static Projekt getProjekt(String projektnavn,String index){
		for (Projekt p: projektList ){
			if(p.index.equals(index) && p.Navn.equals(projektnavn) ){
				return p;
			}
		}
		return null;
	}

	@SuppressWarnings("static-access")
	public static Aktivitet getAktivitet(String aktivitetNavn,String index){
		for (Aktivitet a: aktivitetList ){
			if(a.index.equals(index) && a.Navn.equals(aktivitetNavn) ){
				return a;
			}
		}
		return null;
	}

	@SuppressWarnings("static-access")
	public static Medarbejder getMedarbejder(String medNavn,String intialer)
	{
		for (Medarbejder m: medarbejderList ){
			if(m.Intialer.equals(intialer) && m.Navn.equals(medNavn) ){
				return m;
			}
		}
		return null;
	}
}
