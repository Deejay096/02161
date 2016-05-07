// Udarbejdet af Kristian Krarup

package SoftwareProjekt;

import java.util.List;

public class Login {	
	//	private Oprettelse opret = new Oprettelse();
	public static List<Medarbejder> list = Main.getmedarbejderList();


	public boolean projektlederlogin(String intialer) {
		for(int i = 0; i < list.size(); i++){
			if ((list.get(i).Intialer.equals(intialer) && (list.get(i).Projektleder == true))) 
			{
				return true;
			}
		} 
		return false;
	}
	public boolean medarbejderlogin(String intialer) throws IndexOutOfBoundsException {
		for(int i = 0; i < list.size(); i++){
			if ((list.get(i).Intialer.equals(intialer) && (list.get(i).Projektleder == false)))
			{
				return true;
			}
		}
		System.out.println("Fejl");
		return false;
	}
}
