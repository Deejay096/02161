package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Projekt{

	String Navn;
	
	List<Aktivitet> aktivitetsListe = new ArrayList<Aktivitet>(); 

	public Projekt(String navn)
	{
		this.Navn = navn;
	}

	public void LavAktivitet(String navn, String id){
		Aktivitet aktivitet = new Aktivitet(navn ,id);
		TilføjAktivitet(aktivitet);
	}

	public void TilføjAktivitet(Aktivitet aktivitet){
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
			System.out.println("vis aktivit på en mystisk måde.");
		}
		else
		{
			System.out.println("Findes ikke, ^-^ hahaha");
		}
	}

}
