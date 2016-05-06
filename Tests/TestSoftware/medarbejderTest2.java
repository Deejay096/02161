package SoftwareProjekt;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

public class medarbejderTest2 {
	
	
	
	String Navn = "Larry Jensen";
	String Initialer = "LJ";
	String Tlf = "12345678";
	String Email = "LL@softwarehuset.dk";
	String CPR = "1401881111";
	
	@Test
	public void medarbejderSygTest() {
		
		
		Medarbejder syg = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		int tid = 3; // Vi tester med 3 timer
		
		syg.tidSyg(syg, tid); //Det var første test 
		
	}
	
	@Test
	public void medarbejderFerieTest(){
		
		Medarbejder ferie  = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		int tid = 168; // Vi tester med 1 uge = 168 timer
		
		ferie.tidFerie(ferie, tid);
		
	}

}
