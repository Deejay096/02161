package SoftwareProjekt;

import java.util.List;

public class Login {
	private Oprettelse opret = new Oprettelse(); 

	
	public boolean projektlederlogin(String intialer ){
		opret = new Oprettelse();
		List<Medarbejder> list = opret.getmedarbejderList();

		if (list.contains(intialer) == true){
			for(Medarbejder i : list ){
				if (i.equals(intialer) && (i.Projektleder == true)){
					return true;
				}
			}
		}
		return false;

	}
	public boolean medarbejderlogin(String intialer){
		opret = new Oprettelse();
		List<Medarbejder> list = opret.getmedarbejderList();
		if (list.contains(intialer) == true){
			for(Medarbejder i : list ){
				if (i.equals(intialer) && (i.Projektleder == false)){
					return true;
				}
			}
		}
		return false;
	}
}
