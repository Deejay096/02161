package TestSoftware;

import static org.junit.Assert.*;
import org.junit.Test;

import SoftwareProjekt.Aktivitet;
import SoftwareProjekt.Oprettelse;


public class OprettelseTest 
{
	Oprettelse opret = new Oprettelse();
	
	String Navn = "oprettelsex";
	String Index = "30313233";
	
	@Test
	public void OpretTest()
	{
		opret.opretAktivitet(Navn, Index);	
	}
	
	@Test
	public void opretProjektAktivietTest(){
		
		String Navn2 = "Kryptering";
		String Index2 = "1337";
		
		Oprettelse opretprojekt = new Oprettelse();
		
		opretprojekt.opretProjekt(Navn2, Index2);
		
	}
	
	@Test
	public void fjernProjektAktivitetTest(){
		
		Oprettelse fjernprojekt = new Oprettelse();
		
		Aktivitet m = new Aktivitet(Navn,Index);
		
		fjernprojekt.FjernAktivitet(m);
			
	}
}