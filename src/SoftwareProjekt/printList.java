package SoftwareProjekt;

import java.util.List;

public class printList {

	static Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> medarbejderList = opret.getmedarbejderList();

	public void printMedarbejderList(){
		if (medarbejderList.size() == 0){
			System.out.println("Der er ikke oprettet nogle medarbejdere");
		}
		else{
			for(int i = 0; i < medarbejderList.size(); i++) {
				System.out.println(medarbejderList.get(i).getNavn() + " | " + medarbejderList.get(i).Intialer + " | "  + medarbejderList.get(i).getTlf() + " | "  + medarbejderList.get(i).getEmail() + " | "  + medarbejderList.get(i).getCPR() + " | "  + medarbejderList.get(i).getProjektleder());
			}
		}
	}

}