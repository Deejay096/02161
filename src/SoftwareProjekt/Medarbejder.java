package SoftwareProjekt;

import java.util.ArrayList;
import java.util.List;

public class Medarbejder extends Oprettelse {
	public String Navn;
	public String Intialer;
	public String Tlf;
	public String Email;
	public String CPR;
	public Boolean Projektleder;
	
	public List<TimeObjekt> Syg =  new ArrayList<>();
	public List<TimeObjekt> Ferie =  new ArrayList<>();
	
	public Medarbejder(String Navn, String Intialer, String Tlf, String Email, String CPR,Boolean Projektleder) {
		this.CPR = CPR;
		this.Email = Email;
		this.Intialer = Intialer;
		this.Tlf = Tlf;
		this.Navn = Navn;
		this.Projektleder = Projektleder;
	}
	
	public void tidSyg(Medarbejder m,int tid){
		for(TimeObjekt q: Syg) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}
	
	public void tidFerie(Medarbejder m,int tid){
		for(TimeObjekt q: Ferie) {
			if(q.getMedarbejder() == m){
				q.updateTid(tid);
				break;
			}
		}
	}
}
