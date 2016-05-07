//Udarbejdet af s154414- Dejar Tarik og Jackie Vuong: studie nr. s153121

package TestSoftware;
import org.junit.Test;

import SoftwareProjekt.Aktivitet;
import SoftwareProjekt.Main;
import SoftwareProjekt.Medarbejder;
import SoftwareProjekt.TimeObjekt;

public class aktivitetTest {
	String navn1 = "Idiotprojekt";
	String index1 = "123456879";
	
	String Navn = "Larry Jensen";
	String Initialer = "LJ";
	String Tlf = "12345678";
	String Email = "LL@softwarehuset.dk";
	String CPR = "1401881111";
	
	
	@Test
	public void getTest()
	{
		Aktivitet a = new Aktivitet(navn1,index1);
		
		a.getNavnA();
		a.getIndexA();
	}

	@Test
	public void TidsRegtest() {
		Aktivitet Tidreg = new Aktivitet(navn1,index1);
		Medarbejder reg = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		int tid2 = 8;
		Tidreg.TidsRegistrering(reg, tid2);
	}

	@Test
	public void TilfoejMedarbejderTest()
	{
		Medarbejder tilfoej2 = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		Aktivitet.TilfoejMedarbejder(tilfoej2);	
	}
	
	@Test
	public void FjernMedarbejderTest()
	{
		Medarbejder med = new Medarbejder(Navn, Initialer, Tlf, Email, CPR, false);
		TimeObjekt TO = new TimeObjekt(med,0);
		
		Aktivitet.FjernMedarbejder(TO);
	}
}
