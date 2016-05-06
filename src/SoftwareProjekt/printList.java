package SoftwareProjekt;

import java.util.List;

public class printList {

//	static Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> medarbejderList = Main.getmedarbejderList();
	public static List<Aktivitet> aktivitetList = Main.getaktivitetList();
	public static List<Projekt> projektList = Main.getprojektList();
	
	public printerGUI print;
	
	public printList(printerGUI print)
	{
		this.print = print;
	}

	public void printMedarbejderList(){
		if (medarbejderList.size() == 0){
			print.printT.append("Der er ikke oprettet nogle medarbejdere" + "\n ");
		}
		else{
			for(int i = 0; i < medarbejderList.size(); i++) {
				print.printT.append(medarbejderList.get(i).getNavn() + " | " + medarbejderList.get(i).getIntialer() + " | "  + medarbejderList.get(i).getTlf() + " | "  + medarbejderList.get(i).getEmail() + " | "  + medarbejderList.get(i).getCPR() + " | "  + medarbejderList.get(i).getProjektleder() +"\n ");
			}
		}
	}
	public void printAktivitetList(){
		if (aktivitetList.size() == 0){
			print.printT.append("Der er ikke oprettet nogle aktiviteter" + "\n ");
		}
		else{
			for(int i = 0; i < aktivitetList.size(); i++) {
				print.printT.append(aktivitetList.get(i).getNavnA() + " | " + aktivitetList.get(i).getIndexA()+ "\n "); 
			}
		}
	}
	
	public void printProjektList(){
		if (projektList.size() == 0){
			print.printT.append("Der er ikke oprettet nogle projekter" + "\n ");
			
		}
		else{
			for(int i = 0; i < projektList.size(); i++) {
				print.printT.append(projektList.get(i).getNavnP() + " | " + projektList.get(i).getIndexP()+ "\n ");
			}
		}
	}

}