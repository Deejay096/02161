package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public String Navn; 
	public double Tid;
	public static List<TimeObjekt> to =  new ArrayList<>();
	public String index;

	public static Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> list = Main.getmedarbejderList();

	public static void main(String args[]){
		Medarbejder k = opret.opretMedarbejder("Kristian Krarup", "KK", "23346859", "s144122@student.dtu.dk", "120894-xxxx", true);
		Medarbejder d = opret.opretMedarbejder("Dejar Tarik", "DT", "42723071", "s154414@student.dtu.dk", "301196-xxxx", false);

		TilfoejMedarbejder(k);
		TilfoejMedarbejder(d);
		PrintTimeObjekt(to);
	}

	public Aktivitet(String navn, String index)	{
		this.Navn = navn;
		this.index = index;
	}

	public String getName()	{
		return Navn;
	}

	public void TidsRegistrering(Medarbejder m,int tid){
		for(TimeObjekt q: to) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}

	public static void TilfoejMedarbejder(Medarbejder medarbejder){
		boolean x = false;
		for(int i = 0; i < list.size(); i++){
			if (list.get(i) == medarbejder){
				TimeObjekt TO = new TimeObjekt(medarbejder,0);
				to.add(TO);
				x = true;
			}
		}
		if (x = false){
			System.out.println("FEJL: Medarbejderen du prøver at tilføje til aktiviteten er ikke i listen over medarbejder.");
		}

	}

	public void FjernMedarbejder(TimeObjekt Medarbejder){
		for(int i = 0; i > to.size(); i++){
			if(to.get(i) == Medarbejder){
				to.remove(i);
			}
		}

	}
	public static void PrintTimeObjekt(List<TimeObjekt> liste){
		if (to.size() == 0){
			System.out.println("Der er ikke oprettet nogle medarbejdere");
		}
		else{
			for(int i = 0; i < to.size(); i++) {

				System.out.println(to.get(i).m.getNavn() + " | " + to.get(i).m.Intialer + " | "  + to.get(i).m.getTlf() + " | "  + to.get(i).m.getEmail() + " | "  + to.get(i).m.getCPR() + " | "  + to.get(i).m.getProjektleder() + " | " + to.get(i).getTid() );
			}
		}
	}

}
