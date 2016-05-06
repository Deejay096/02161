package SoftwareProjekt;

public class Oprettelse {
	public String Navn;
	public String Intialer;
	public String Tlf;
	public String Email;
	public String CPR;
	public String Index;
	
	Main main = new Main();
	
	//Vi opretter en medarbejder class med (String Navn,String Intialer,String Telefonnummer,String Email,String CPR)
	public Medarbejder opretMedarbejder(String Navn,String Intialer,String Tlf,String Email,String CPR, Boolean Projektleder){
		Medarbejder medarbejder = new Medarbejder(Navn,Intialer,Tlf,Email,CPR,Projektleder);
		Main.medarbejderList.add(medarbejder);
		return medarbejder;
	}
	
	//Vi fjerner en medarbejder med det rigtige Navn og CPR, og vi fjerner kun medarbejderen, hvis disse to er rigtige.
	public void FjernMedarbejder(Medarbejder medarbejder){
		if(Main.medarbejderList.contains(CPR) == true && Main.medarbejderList.contains(Navn) == true ){
			for (Medarbejder m: Main.medarbejderList )
				if(m.equals(CPR)){
					Main.medarbejderList.remove(medarbejder);
				}
			for (Medarbejder m: Main.medarbejderList )
				if(m.equals(Navn)){
					Main.medarbejderList.remove(medarbejder);
				}
		}
		else{
			System.out.println("Medarbejder findes ikke: Tjek Navn og CPR-nummer igen");
		}
	}

	//Vi opretter et projekt class med (String Navn,String Index)
	public Projekt opretProjekt(String Navn, String Index){
		Projekt projekt = new Projekt(Navn, Index);
		Main.projektList.add(projekt);
		return projekt;
	}

	//Vi fjerner et projekt med det rigtige Navn og index-nummer, og vi fjerner kun projektet, hvis disse to er rigtige.
	public void FjernProjekt(Projekt projekt){
		if(Main.projektList.contains(Index) == true && Main.projektList.contains(Navn) == true ){
			for (Projekt p: Main.projektList )
				if(p.equals(Index)){
					Main.projektList.remove(Index);
				}
			for (Projekt p: Main.projektList )
				if(p.equals(Navn)){
					Main.projektList.remove(Navn);
				}
		}
		else{
			System.out.println("Projektet findes ikke: Tjek Navn og index-nummer igen");
		}
	}
	//Vi opretter en aktivitet med(String navn, String Index)
	public Aktivitet opretAktivitet(String Navn, String Index){
		Aktivitet aktivitet = new Aktivitet(Navn,Index);
		Main.aktivitetList.add(aktivitet); 
		return aktivitet;
	}
	//Vi fjerner en aktivitet med det rigtige Navn og index-nummer, og vi fjerner kun aktiviteten, hvis disse to er rigtige.
	public void FjernAktivitet(Aktivitet aktivitet){
		if(Main.aktivitetList.contains(Index) == true && Main.aktivitetList.contains(Navn) == true ){
			for (Aktivitet a: Main.aktivitetList )
				if(a.equals(Index)){
					Main.aktivitetList.remove(Index);
				}
			for (Aktivitet a: Main.aktivitetList )
				if(a.equals(Navn)){
					Main.aktivitetList.remove(Navn);
				}
		}
		else{
			System.out.println("Aktiviteten findes ikke: Tjek Navn og index-nummer igen");
		}
	}
	
}