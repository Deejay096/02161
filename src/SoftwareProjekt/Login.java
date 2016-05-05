package SoftwareProjekt;

import java.util.List;

public class Login {	
	private Oprettelse opret = new Oprettelse();
	private List<Medarbejder> list = opret.getmedarbejderList();
	public boolean projektlederlogin(String intialer ){
		for(int i = 0; i < list.size(); i++){
			if ((list.get(i).Intialer == intialer) && (list.get(i).Projektleder == true)){
				System.out.println(list.get(i).Intialer);
				return true;
			}
		}
		System.out.println("Fejl");
		return false;
	}
	
	public boolean medarbejderlogin(String intialer){
		for(int i = 0; i < list.size(); i++){
			if ((list.get(i).Intialer == intialer) && (list.get(i).Projektleder == false)){
				return true;
			}
		}
		System.out.println("Fejl");
		return false;
	}
}
