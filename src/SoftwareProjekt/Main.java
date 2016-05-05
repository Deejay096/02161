package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
	List<Projekt> projektListe = new ArrayList<Projekt>();
	
	public Projekt getProjekt(String projektnavn,String index){
		if(projektListe.contains(index) == true || projektListe.contains(projektnavn) == true ){
			for (Projekt p: projektListe )
			if(p.equals(index)){
				return p;
			}
			for (Projekt p: projektListe )
				if(p.equals(projektnavn)){
					return p;
				}
		}
		return null;
	}
	
}
