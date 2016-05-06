package SoftwareProjekt;

import java.util.List;

public class Login {	
	//	private Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> list = Main.getmedarbejderList();


	public boolean projektlederlogin(String intialer){
		for(int i = 0; i <= list.size(); i++){
			if ((list.get(i).Intialer.equals(intialer) && (list.get(i).Projektleder == true)))
			{
				return true;
			}
		}
		System.out.println("Fejl"); 
		return false;
	}

	public boolean medarbejderlogin(String intialer){
		for(int i = 0; i < list.size(); i++){
			if ((list.get(i).Intialer.equals(intialer) && (list.get(i).Projektleder == true)))
			{
				return true;
			}
		}
		System.out.println("Fejl");
		return false;
	}
}
