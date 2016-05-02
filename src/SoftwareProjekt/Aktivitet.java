package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public String Navn; 
	public double Tid; 

	public List<TimeObjekt> to =  new ArrayList<>();
	//tp.getMedarbejder()  ... 
	//medarbejder == to.getMedarbejder()    ....
	public double[] TidsRegistrering; 
	public boolean Tjek;
	public String index;

	public Oprettelse oprettelse = new Oprettelse();

	public Aktivitet(String navn, String index)	{
		this.Navn = navn;
		this.index = index;
	}

	public String getName()	{
		return Navn;
	}

	//	void add(Medarbejder m,int tid){
	//		medarbejderList.add(m,tid);
	//		
	//	}

	public void TidsRegistrering(Medarbejder m,int tid){
		for(TimeObjekt q: to) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}

	public void TilfoejMedarbejder(Medarbejder Medarbejder){
		if(equals(oprettelse.medarbejderList.contains(Medarbejder))){
			Medarbejder.add(Medarbejder); 
		}
		else{
			System.out.println("Medarbejderen du prøver at tilføje til aktiviteten er ikke i listen over medarbejder.");
		}


	}

	public void FjernMedarbejder(Medarbejder Medarbejder){
		for(int i = 0; i > to.size(); i++){
			if(to.get(i) == Medarbejder){
				to.remove(i);
			}
		}

	}

	public boolean Faerdig(){
		return Tjek == true;
	}

	public void PrintMedarbejderListe(ArrayList<String> Liste){
		System.out.println(Medarbejder);

	}
}
