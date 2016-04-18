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

	public void Sorter(List<String> aktivitetsListe)
	{
		if(aktivitetsListe.isEmpty() == false)
		{
		   Collections.sort(aktivitetsListe);
		}
	}

	public void search(String name)
	{	
		if(aktivitetsListe.contains(name) == true)
		{
			System.out.println("vis aktivit p� en mystisk m�de.");
		}
		else
		{
			System.out.println("Findes ikke, ^-^ hahaha");
		}
	}

}
