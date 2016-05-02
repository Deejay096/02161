package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public String Navn; 
	public double Tid; 
	public List<TimeObjekt> to =  new ArrayList<>();
	public String index;

	
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

	public void TilfoejMedarbejder(TimeObjekt Medarbejder){
		if(equals(to.contains(Medarbejder))){
			to.add(Medarbejder); 
		}
		else{
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

	public void PrintMedarbejderListe(ArrayList<String> Liste){
		System.out.println(to);

	}
}
