//Udarbejdet af s154414- Dejar Tarik 

package TestSoftware;

import org.junit.Test;

import SoftwareProjekt.Aktivitet;
import SoftwareProjekt.Main;
import SoftwareProjekt.Medarbejder;

public class aktivitetTest2 {
	String navn1 = "Idiotprojekt";
	String index1 = "123456879";
	
	String Navn = "Larry Jensen";
	String Initialer = "LJ";
	String Tlf = "12345678";
	String Email = "LL@softwarehuset.dk";
	String CPR = "1401881111";
	
	
	@Test
	public void get(){
		
	}

	@Test
	public void TidsRegtest() {
		Aktivitet Tidreg = new Aktivitet(navn1,index1);
		Medarbejder reg = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		int tid2 = 8;
		Tidreg.TidsRegistrering(reg, tid2);
		//assertTrue()
	}

	@Test
	public void TilfoejMedarbejderTest(){
		//Aktivitet tilfoej = new Aktivitet(navn1, index1);
		Medarbejder tilfoej2 = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		Aktivitet.TilfoejMedarbejder(tilfoej2);
		//assertTrue(Main.MedarbejderList(tilfoej2));
		//
		
		
		
	}
}
