package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public String Navn; 
	public double Tid; 
	public static List<TimeObjekt> to =  new ArrayList<>();
	public String index;

	public static void main(String args[]){
		Medarbejder h = new Medarbejder("Hej", "hej", "123", "he@hot.dk", "12345678", false);
		TimeObjekt t = new TimeObjekt(h,5);
		TilfoejMedarbejder(t);

		PrintMedarbejderList(to);
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

	public static void TilfoejMedarbejder(TimeObjekt Medarbejder){
		to.add(Medarbejder);


		//		if(to.contains(Medarbejder)){
		//			to.add(Medarbejder); 
		//		}
		//		else{
		//			System.out.println("FEJL: Medarbejderen du prøver at tilføje til aktiviteten er ikke i listen over medarbejder.");
		//		}
	}

	public void FjernMedarbejder(TimeObjekt Medarbejder){
		for(int i = 0; i > to.size(); i++){
			if(to.get(i) == Medarbejder){
				to.remove(i);
			}
		}

	}
	public String toString() {
		return ("Navn:"+this.getName()+
				" Student No: "+ this.getEmail() +
				" Email: "+ this.getEmail() +
				" Year : " + this.getYear());
	}
	public Medarbejder(String Navn, String Intialer, String Tlf, String Email, String CPR,Boolean Projektleder) {
		this.CPR = CPR;
		this.Email = Email;
		this.Intialer = Intialer;
		this.Tlf = Tlf;
		this.Navn = Navn;
		this.Projektleder = Projektleder;
	}
	public static void PrintMedarbejderList(List<TimeObjekt> liste){

		for(TimeObjekt q: to) {
			System.out.println(q);
		}
	}



}


