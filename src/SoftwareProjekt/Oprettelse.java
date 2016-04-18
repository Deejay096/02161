package SoftwareProjekt;
import java.util.ArrayList;
import java.util.List;

import dtu.library.app.Book;

public class Oprettelse {
	public String Navn;
	public String Intialer;
	public String Telefonnummer;
	public String Email;
	public String CPR;
	public boolean NIGGER;
	
	List<Medarbejder> dataMedarbejder = new ArrayList<>();
	
	public static String[] Medarbejdere = {"Navn","Intialer","CPR","Telefonnummer","Email","NIGGER"};
	
	public static void main(String[] args){
	
	}
	
	//Vi opretter en medarbejder og tilføjer den til dataMedarbejder som er en ArrayList over medarbejderene. 
	public void opretMedarbejder(){
		dataMedarbejder.add(new Medarbejder(Navn,Intialer,Telefonnummer,Email,CPR,NIGGER));
	}
}
