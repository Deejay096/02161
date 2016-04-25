package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Aktivitet {
	public String Navn; 
	public double Tid; 
	public List<String> Medarbejder;
	public double[] TidsRegistrering; 
	public boolean Tjek;
	public String index; 

	public Aktivitet(String navn, String index)
	{
		this.Navn = navn;
		this.index = index;
	}
	
	public String getName()
	{
		return Navn;
	}

	public void TidsRegistrering(int x){
		 Tid = Tid + x; 
	}

	
	public void TilfoejMedarbejder(String Arbejder){
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
