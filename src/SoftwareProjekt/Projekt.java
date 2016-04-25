package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Projekt{

	String Navn;
	String index;
	Aktivitet aktivitet;
	
	List<Aktivitet> projektAktivitetList  = new ArrayList<Aktivitet>(); 
	
	public Projekt(String navn, String index){
		this.index = index;
		this.Navn = navn;
	}
	public void tilføjAktivitet(String Navn, String Index){
		Oprettelse opret = new Oprettelse();
		aktivitet = opret.opretAktivitet(Navn, Index);
		projektAktivitetList.add(aktivitet);
	}
	
	public Aktivitet getProjekt(String projektnavn,String index){
		if(projektAktivitetList.contains(index) == true || projektAktivitetList.contains(projektnavn) == true ){
			for (Aktivitet A: projektAktivitetList )
			if(A.equals(index)){
				return A;
			}
			for (Aktivitet A: projektAktivitetList )
				if(A.equals(projektnavn)){
					return A;
				}
		}
		return null;
	}

	public void visProjektAktivitetList(){
		for(Aktivitet aktivitet: projektAktivitetList){
			System.out.println(aktivitet.getName());
		}
	}

	public void Sorter(){
		if(projektAktivitetList.isEmpty() == false){
			
		}
	}

	public void soege(String name)
	{	
		int i = projektAktivitetList.indexOf(name)+1;
		
		if(i <= projektAktivitetList.size()-1)
		{
			if(projektAktivitetList.contains(projektAktivitetList.get(i)) == true)
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
//		LavAktivitet("hi", "1");
//		LavAktivitet("nice", "2");
//		LavAktivitet("it work", "2");
//		VisAktivitetsListe();
//		soege("hey");
//		Sorter();

		
	}
}
