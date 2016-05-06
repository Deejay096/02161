package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public static String Navn; 
	public double Tid;
	public static List<TimeObjekt> to =  new ArrayList<>();
	public static String index;

	public static Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> list = Main.getmedarbejderList();

	public Aktivitet(String navn, String index)	{
		Aktivitet.Navn = navn;
		Aktivitet.index = index;
	}

	public String getNavnA()	{
		return Navn;
	}
	public String getIndexA()	{
		return index;
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
		@SuppressWarnings("unused")
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

				System.out.println(Medarbejder.getNavn() + " | " + list.get(i).getIntialer() + " | "  + list.get(i).getTlf() + " | "  + list.get(i).getEmail() + " | "  + list.get(i).getCPR() + " | "  + list.get(i).getProjektleder() + " | " + to.get(i).getTid() );
			}
		}
	}

}
