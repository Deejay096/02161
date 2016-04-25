package SoftwareProjekt;
import java.util.ArrayList;
import java.util.List;

public class Oprettelse {
	public String Navn;
	public String Intialer;
	public String Telefonnummer;
	public String Email;
	public String CPR;

	List<Medarbejder> medarbejderList = new ArrayList<>();
	List<Projektleder> projektlederList = new ArrayList<>();
	List<Projekt> projektList = new ArrayList<>();
	
	public static String[] Medarbejdere = {"Navn","Intialer","CPR","Telefonnummer","Email"};

	public static void main(String[] args){

	}

//Vi opretter en medarbejder class med (String Navn,String Intialer,String Telefonnummer,String Email,String CPR)
	public void opretMedarbejder(String Navn,String Intialer,String Telefonnummer,String Email,String CPR){
		Medarbejder medarbejder = new Medarbejder(Navn,Intialer,Telefonnummer,Email,CPR);
		medarbejderList.add(medarbejder);
	}

//Vi fjerner en medarbejder med det rigtige Navn og CPR, og vi fjerner kun medarbejderen hvis disse to er rigtige.
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
	
//Vi opretter en projektleder class med (String Navn,String Intialer,String Telefonnummer,String Email,String CPR)
	public void opretProjektleder(String Navn,String Intialer,String Telefonnummer,String Email,String CPR){
		Projektleder projektleder = new Projektleder(Navn,Intialer,Telefonnummer,Email,CPR);
		projektlederList.add(projektleder);
	}

//Vi fjerner en projektleder med det rigtige Navn og CPR, og vi fjerner kun medarbejderen hvis disse to er rigtige.
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
}
