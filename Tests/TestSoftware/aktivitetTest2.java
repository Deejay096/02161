package SoftwareProjekt;

import static org.junit.Assert.*;

import org.junit.Test;

public class aktivitetTest2 {

	
	
	
	String navn1 = "Idiotprojekt";
	String index1 = "123456879";
	

	String Navn = "Larry Jensen";
	String Initialer = "LJ";
	String Tlf = "12345678";
	String Email = "LL@softwarehuset.dk";
	String CPR = "1401881111";
	
	@Test
	public void TidsRegtest() {
		Aktivitet Tidreg = new Aktivitet(navn1,index1);
		
		Medarbejder reg = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		int tid2 = 8;
		
		Tidreg.TidsRegistrering(reg, tid2);
	}

	@Test
	public void TilfoejMedarbejderTest(){
		
		//Aktivitet tilfoej = new Aktivitet(navn1, index1);
		
		Medarbejder tilfoej2 = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		
		Aktivitet.TilfoejMedarbejder(tilfoej2);
		
		
		
		
	}
}
