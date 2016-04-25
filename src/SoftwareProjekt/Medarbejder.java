package SoftwareProjekt;

public class Medarbejder extends Oprettelse {
	public String Navn;
	public String Intialer;
	public String Tlf;
	public String Email;
	public String CPR;
	
	// Tidsregistrering 
	public static String[] søjleNavne = {"Navn","Intialer","CPR","Månede","Uge","dato","Tid"};
	
	
	public Medarbejder(String Navn, String Intialer, String Tlf, String Email, String CPR) {
		this.CPR = CPR;
		this.Email = Email;
		this.Intialer = Intialer;
		this.Tlf = Tlf;
		this.Navn = Navn;
	}
	
	public void Aktivitet (String etellerandet){
		//Noget der hente en liste
		//Skal kunne registrer tid under en specefik aktivitet 
		//Lave tidsregistrering ugevis?
		
		
		
		//Muligheder:
		//boolean
		//x = x + etellerandet;
	}
	public static void main(String[]args){
		
	}
	
	
		

}
