package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Main {
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	
	public void LavProjekt(String navn,int index){
		Projekt projekt = new Projekt(navn,index);
	}
	
//	public void EnAktivitet(String navn2){
//		if(Projekt.aktivitetsListe.contains(navn2)){
//			Projekt.aktivitetsListe.
//		}
//	}
	
	public Projekt getProjekt(String projektnavn,int index){
		if(projektListe.contains(index) == true || projektListe.contains(projektnavn) == true ){
			for (Projekt p: projektListe )
			if(p.index == index){
				return p;
			}
			for (Projekt p: projektListe )
				if(p.equals(projektnavn)){
					return p;
				}
		}
		return null;
	}
	
	
	public void main(String[] args){
		LavProjekt("hi",1);
		
	}
}
