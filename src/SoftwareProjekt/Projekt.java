package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Projekt{

	String Navn;
	int index;
	
	List<Aktivitet> aktivitetsListe = new ArrayList<Aktivitet>(); 
	
	public Projekt(String navn, int index)
	{
		this.index = index;
		this.Navn = navn;
	}

	public void LavAktivitet(String navn, int index){
		Aktivitet aktivitet = new Aktivitet(navn,index);
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
	
	public Aktivitet getProjekt(String projektnavn,int index){
		if(aktivitetsListe.contains(index) == true || aktivitetsListe.contains(projektnavn) == true ){
			for (Aktivitet A: aktivitetsListe )
			if(A.index == index){
				return A;
			}
			for (Aktivitet A: aktivitetsListe )
				if(A.equals(projektnavn)){
					return A;
				}
		}
		return null;
	}

	public void VisAktivitetsListe()
	{
		for(Aktivitet aktivitet: aktivitetsListe)
		{
			System.out.println(aktivitet.getName());
		}
	}

	public void Sorter()
	{
		if(aktivitetsListe.isEmpty() == false)
		{
			
		}
	}

	public void soege(String name)
	{	
		int i = aktivitetsListe.indexOf(name)+1;
		
		if(i <= aktivitetsListe.size()-1)
		{
			if(aktivitetsListe.contains(aktivitetsListe.get(i)) == true)
			{
				System.out.println("vis aktivit på en mystisk måde.");
			}
		}
		else
		{
			System.out.println("Dit søgte aktivitet findes ikke, ^-^ hahaha");
		}
	}

	public void main(String[] args)
	{
		LavAktivitet("hi", 1);
		LavAktivitet("nice", 2);
		LavAktivitet("it work", 2);
		VisAktivitetsListe();
		//soege("hej");
		//Sorter();

		
	}
}
