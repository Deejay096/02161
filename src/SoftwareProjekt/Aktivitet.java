package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public String Navn; 
	public String AktivitetsID; 
	public double Tid; 
	public List<String> Medarbejder;
	public double[] TidsRegistrering; 
	public boolean Tjek; 


	public void TidsRegistrering(int tid){


	}

	public void TilføjMedarbejder(String Arbejder){
		Medarbejder.add(Arbejder); 

	}

	public void FjernMedarbejder(String Arbejder){
		for(int i = 0; i > Medarbejder.size(); i++){
			if(Medarbejder.get(i) == Arbejder){
				Medarbejder.remove(i);
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
