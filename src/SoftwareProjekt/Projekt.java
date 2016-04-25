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
		Tilf�jAktivitet(aktivitet);
	}

	public static void Tilf�jAktivitet(Aktivitet aktivitet){
		aktivitetsListe.add(aktivitet); 
	}

	public void FjernAktivitet(Aktivitet aktivitet){
		for(int i = 0; i > aktivitetsListe.size(); i++){
			if(aktivitetsListe.get(i) == aktivitet){
				aktivitetsListe.remove(i);
			}
		}
	}

	public static void VisAktivitetsListe()
	{
		for(Aktivitet aktivitet: aktivitetsListe)
		{
			System.out.println(aktivitet.getName());
		}
	}

	public static void Sorter()
	{
		if(aktivitetsListe.isEmpty() == false)
		{
			
		}
	}

	public static void soege(String name)
	{	
		int i = aktivitetsListe.indexOf(name)+1;
		
		if(i <= aktivitetsListe.size()-1)
		{
			if(aktivitetsListe.contains(aktivitetsListe.get(i)) == true)
			{
				System.out.println("vis aktivit p� en mystisk m�de.");
			}
		}
		else
		{
			System.out.println("Dit s�gte aktivitet findes ikke, ^-^ hahaha");
		}
	}

	public static void main(String[] args)
	{
		LavAktivitet("hi", "1");
		LavAktivitet("nice", "2");
		LavAktivitet("it work", "6");
		VisAktivitetsListe();
		soege("hi");
		Sorter();
		
	}
}
