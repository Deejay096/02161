package SoftwareProjekt;

import static org.junit.Assert.*;

import org.junit.Test;

public class timeObjektTest {
	
	String Navn = "Larry Jensen";
	String Initialer = "LJ";
	String Tlf = "12345678";
	String Email = "LL@softwarehuset.dk";
	String CPR = "1401881111";

	@Test
	public void updateTidtest() {
		
		Medarbejder medarbejder = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		TimeObjekt update = new TimeObjekt(medarbejder, 0);
		
		update.updateTid(5);
		
		
	}
	
	

}
