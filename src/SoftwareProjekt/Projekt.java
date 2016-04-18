package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Projekt{

	String Navn;
	
	static List<Aktivitet> aktivitetsListe = new ArrayList<Aktivitet>(); 

	public Projekt(String navn)
	{
		this.Navn = navn;
	}

	public static void LavAktivitet(String navn, String id){
		Aktivitet aktivitet = new Aktivitet(navn,id);
		TilføjAktivitet(aktivitet);
	}

	public static void TilføjAktivitet(Aktivitet aktivitet){
		aktivitetsListe.add(aktivitet); 
	}

	public void FjernAktivitet(Aktivitet aktivitet){
		for(int i = 0; i > aktivitetsListe.size(); i++){
			if(aktivitetsListe.get(i) == aktivitet){
				aktivitetsListe.remove(i);
			}
		}
	}

	public static void VisAktivitetsListe(){
		System.out.println(aktivitetsListe.toString());

	}

	public static void Sorter(List<String> aktivitetsListe)
	{
		if(aktivitetsListe.isEmpty() == false)
		{
		   Collections.sort(aktivitetsListe);
		}
	}

	public static void search(String name)
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

	public static void main(String[] args)
	{
		LavAktivitet("hi", "1");
		LavAktivitet("nice", "2");
		LavAktivitet("it work", "6");
		VisAktivitetsListe();
	}
}
