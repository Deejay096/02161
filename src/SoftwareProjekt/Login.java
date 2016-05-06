package SoftwareProjekt;

import java.util.List;

public class Login {	
	//	private Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> list = Main.getmedarbejderList();


	public boolean projektlederlogin(String intialer){
		for(int i = 0; i <= list.size(); i++){
			if ((Medarbejder.Intialer == intialer) && (Medarbejder.Projektleder == true)){
				return true;
			}
		}
		System.out.println("Fejl"); 
		return false;
	}

	public boolean medarbejderlogin(String intialer){
		for(int i = 0; i < list.size(); i++){
			if ((Medarbejder.Intialer == intialer) && (Medarbejder.Projektleder == false)){
				return true;
			}
		}
		System.out.println("Fejl");
		return false;
	}
}
