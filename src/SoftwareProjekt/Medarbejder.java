package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Medarbejder extends Oprettelse {
	public static String Navn;
	public static String Intialer;
	public static String Tlf;
	public static String Email;
	public static String CPR;
	public static Boolean Projektleder;

	public static List<TimeObjekt> Syg =  new ArrayList<>();
	public static List<TimeObjekt> Ferie =  new ArrayList<>();
	public static List<TimeObjekt> Fri =  new ArrayList<>();

	public void kopiList(){
		if (Main.medarbejderList.size() == 0){
			System.out.println("Der er ikke oprettet nogle medarbejdere"); 
		}

		for(int i = 0; i < Main.medarbejderList.size(); i++) {
			TimeObjekt TO = new TimeObjekt(Main.medarbejderList.get(i),0);
			Syg.set(i, TO);
		}
		for(int i = 0; i < Main.medarbejderList.size(); i++) {
			TimeObjekt TO = new TimeObjekt(Main.medarbejderList.get(i),0);
			Ferie.set(i, TO);
		}
		for(int i = 0; i < Main.medarbejderList.size(); i++) {
			TimeObjekt TO = new TimeObjekt(Main.medarbejderList.get(i),0);
			Fri.set(i, TO);
		}
	}
	
	public static List<TimeObjekt> getSyg() {
	    return Syg;
	}
	public static List<TimeObjekt> getFerie() {
	    return Ferie;
	}
	public static List<TimeObjekt> getFri() {
	    return Fri;
	}

	public Medarbejder(String Navn, String Intialer, String Tlf, String Email, String CPR,Boolean Projektleder) {
		Medarbejder.Navn = Navn;
		Medarbejder.Intialer = Intialer;
		Medarbejder.Tlf = Tlf;
		Medarbejder.Email = Email;
		Medarbejder.CPR = CPR;
		Medarbejder.Projektleder = Projektleder;
	}
	public static String getNavn(){
		return Navn;
	}
	public static String getIntialer(){
		return Intialer;
	}
	public static String getTlf(){
		return Tlf;
	}
	public static String getEmail(){
		return Email;
	}
	public static String getCPR(){
		return CPR;
	}
	public static boolean getProjektleder(){
		return Projektleder;
	}


	public void tidSyg(Medarbejder m,int tid){
		for(TimeObjekt q: Syg) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}
	public void tidFerie(Medarbejder m,int tid){
		for(TimeObjekt q: Ferie) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}
	public void tidFRi(Medarbejder m,int tid){
		for(TimeObjekt q: Fri) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}
	public void ledigMedarbejder(){
		for(int i = 0; i < Fri.size(); i++) {
			TimeObjekt TO = new TimeObjekt(Fri.get(i));		
			if (!(TO.getTid()==0)){
				System.out.println(Fri.get(i));
			}
		}
	}
}
