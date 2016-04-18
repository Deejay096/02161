package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class Projekt extends Aktivitet {

	List<Aktivitet> aktivitetsListe = new ArrayList<>(); 


	public void LavAktivitet(){
		Aktivitet aktivitet = new Aktivitet();
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

	public void AktivitetsListe(ArrayList<String> Liste){
		System.out.println(aktivitetsListe);

	}

	public void Sorter(List aktivitetsListe){
		aktivitetsListe.sort(aktivitetsListe);
	}


}
