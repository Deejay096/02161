// Udarbejdet af Dejar Tarik og Jackie Vuong: studie nr. s153121

package TestSoftware;
import static org.junit.Assert.*;


//Udarbejdet af s154414- Dejar Tarik 

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import SoftwareProjekt.Medarbejder;

public class MedarbejderTest {
	
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
		syg.getSyg();
	}
	
	@Test
	public void medarbejderFerieTest(){
		
		Medarbejder ferie  = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		int tid = 168; // Vi tester med 1 uge = 168 timer
		
		ferie.tidFerie(ferie, tid);
		ferie.getFerie();
	}
	
	@Test
	public void medarbejderFriTest(){
		
		Medarbejder fri  = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		int tid = 168; // Vi tester med 1 uge = 168 timer
		
		fri.tidFri(fri, tid);
		fri.getFerie();
	}
	
	@Test
	public void medarbejderkopiListTest()
	{
		Medarbejder m  = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		m.kopiList();
	}
	 
	@Test
	public void getMetoderTest()
	{
		Medarbejder m  = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		m.getNavn();
		m.getCPR();
		m.getEmail();
		m.getIntialer();
		m.getProjektleder();
		m.getTlf();
		m.getFerie();
	}
	
	@Test
	public void ledigMedarbejderTest()
	{
		Medarbejder m  = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		m.ledigMedarbejder();
	}
	
}
