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
	public void sdfsd(String Navn, String Intialer, String Tlf, String Email, String CPR,Boolean Projektleder){
		Oprettelse opret = new Oprettelse();
		Medarbejder newMed = opret.opretMedarbejder(Navn,Intialer,Tlf,Email,CPR,Projektleder);
		Aktivitet newAk = opret.opretAktivitet(Navn, Index);
		Projekt newpro = opret.opretProjekt(Navn, Index);
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

	public Aktivitet soege(Aktivitet A){
		for(Aktivitet q: projektAktivitetList ) {
			if(q.equals(A)){
				System.out.println("Din aktivitet er fundet" + A);
				return A;
			}
		}
		System.out.println("Din Aktivitet kunne ikke findes");
		return null;
	}
}