package SoftwareProjekt;
import java.util.ArrayList;
import java.util.List;

public class Oprettelse {
	public String Navn;
	public String Intialer;
	public String Tlf;
	public String Email;
	public String CPR;
	public String Index;

	List<Medarbejder> medarbejderList = new ArrayList<>();
	List<Projektleder> projektlederList = new ArrayList<>();
	List<Projekt> projektList = new ArrayList<>();
	List<Aktivitet> aktivitetList = new ArrayList<>();

	//Vi opretter en medarbejder class med (String Navn,String Intialer,String Telefonnummer,String Email,String CPR)
	public Medarbejder opretMedarbejder(String Navn,String Intialer,String Tlf,String Email,String CPR){
		Medarbejder medarbejder = new Medarbejder(Navn,Intialer,Tlf,Email,CPR);
		medarbejderList.add(medarbejder);
		return medarbejder;
	}

	//Vi fjerner en medarbejder med det rigtige Navn og CPR, og vi fjerner kun medarbejderen, hvis disse to er rigtige.
	public void FjernMedarbejder(Medarbejder medarbejder){
		if(medarbejderList.contains(CPR) == true && medarbejderList.contains(Navn) == true ){
			for (Medarbejder m: medarbejderList )
				if(m.equals(CPR)){
					medarbejderList.remove(CPR);
				}
			for (Medarbejder m: medarbejderList )
				if(m.equals(Navn)){
					medarbejderList.remove(Navn);
				}
		}
		else{
			System.out.println("Medarbejder findes ikke: Tjek Navn og CPR-nummer igen");
		}
	}

	//Vi opretter en projektleder class med (String Navn,String Intialer,String Tlf,String Email,String CPR)
	public Projektleder opretProjektleder(String Navn,String Intialer,String Tlf,String Email,String CPR){
		Projektleder projektleder = new Projektleder(Navn,Intialer,Tlf,Email,CPR);
		projektlederList.add(projektleder);
		return projektleder;
	}

	//Vi fjerner en projektleder med det rigtige Navn og CPR, og vi fjerner kun projektlederen, hvis disse to er rigtige.
	public void FjernProjektleder(Projektleder projektleder){
		if(projektlederList.contains(CPR) == true && projektlederList.contains(Navn) == true ){
			for (Projektleder m: projektlederList )
				if(m.equals(CPR)){
					projektlederList.remove(CPR);
				}
			for (Projektleder m: projektlederList )
				if(m.equals(Navn)){
					projektlederList.remove(Navn);
				}
		}
		else{
			System.out.println("Projektleder findes ikke: Tjek Navn og CPR-nummer igen");
		}
	}

	//Vi opretter et projekt class med (String Navn,String Index)
	public Projekt opretProjekt(String Navn, String Index){
		Projekt projekt = new Projekt(Navn, Index);
		projektList.add(projekt);
		return projekt;
	}

	//Vi fjerner et projekt med det rigtige Navn og index-nummer, og vi fjerner kun projektet, hvis disse to er rigtige.
	public void FjernProjekt(Projekt projekt){
		if(projektList.contains(Index) == true && projektList.contains(Navn) == true ){
			for (Projekt p: projektList )
				if(p.equals(Index)){
					projektList.remove(Index);
				}
			for (Projekt p: projektList )
				if(p.equals(Navn)){
					projektList.remove(Navn);
				}
		}
		else{
			System.out.println("Projektet findes ikke: Tjek Navn og index-nummer igen");
		}
	}
	//Vi opretter en aktivitet med(String navn, String Index)
	public Aktivitet opretAktivitet(String Navn, String Index){
		Aktivitet aktivitet = new Aktivitet(Navn,Index);
		aktivitetList.add(aktivitet); 
		return aktivitet;
	}
	//Vi fjerner en aktivitet med det rigtige Navn og index-nummer, og vi fjerner kun aktiviteten, hvis disse to er rigtige.
	public void FjernAktivitet(Aktivitet aktivitet){
		if(aktivitetList.contains(Index) == true && aktivitetList.contains(Navn) == true ){
			for (Aktivitet a: aktivitetList )
				if(a.equals(Index)){
					aktivitetList.remove(Index);
				}
			for (Aktivitet a: aktivitetList )
				if(a.equals(Navn)){
					aktivitetList.remove(Navn);
				}
		}
		else{
			System.out.println("Aktiviteten findes ikke: Tjek Navn og index-nummer igen");
		}
	}
}