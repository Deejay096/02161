package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Projekt extends Aktivitet {

	List<Aktivitet> aktivitetsListe = new ArrayList<>(); 


	public void LavAktivitet(){
		Aktivitet aktivitet = new Aktivitet();
		Tilf�jAktivitet(aktivitet);

	}

	public void Tilf�jAktivitet(Aktivitet aktivitet){
		aktivitetsListe.add(aktivitet); 

	}

	public void FjernAktivitet(Aktivitet aktivitet){
		for(int i = 0; i > aktivitetsListe.size(); i++){
			if(aktivitetsListe.get(i) == aktivitet){
				aktivitetsListe.remove(i);
			}
		}

	}

	public void VisAktivitetsListe(ArrayList<String> Liste){
		System.out.println(aktivitetsListe);

	}

	public void Sorter(List aktivitetsListe)
	{
		if(aktivitetsListe.isEmpty() == false)
		{
		   Collections.sort(aktivitetsListe);
		}
	}

	

}
