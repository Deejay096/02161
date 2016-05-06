package SoftwareProjekt;

import java.util.List;

public class printList {

//	static Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> medarbejderList = Main.getmedarbejderList();
	public static List<Aktivitet> aktivitetList = Main.getaktivitetList();
	public static List<Projekt> projektList = Main.getprojektList();
	
	printerGUI print = new printerGUI();

	public void printMedarbejderList(){
		if (medarbejderList.size() == 0){
			System.out.println("Der er ikke oprettet nogle medarbejdere");
		}
		else{
			for(int i = 0; i < medarbejderList.size(); i++) {
				System.out.println(medarbejderList.get(i).getNavn() + " | " + medarbejderList.get(i).getIntialer() + " | "  + medarbejderList.get(i).getTlf() + " | "  + medarbejderList.get(i).getEmail() + " | "  + medarbejderList.get(i).getCPR() + " | "  + medarbejderList.get(i).getProjektleder());
			}
		}
	}
	public void printAktivitetList(){
		if (aktivitetList.size() == 0){
			System.out.println("Der er ikke oprettet nogle aktiviteter");
		}
		else{
			for(int i = 0; i < aktivitetList.size(); i++) {
				System.out.println(aktivitetList.get(i).getNavnA() + " | " + aktivitetList.get(i).getIndexA()); 
			}
		}
	}
	public void printProjektList(){
		if (projektList.size() == 0){
			print.printT.setText("Der er ikke oprettet nogle projekter");
			
		}
		else{
			for(int i = 0; i < projektList.size(); i++) {
				System.out.println(projektList.get(i).getNavnP() + " | " + projektList.get(i).getIndexP());
			}
		}
	}

}