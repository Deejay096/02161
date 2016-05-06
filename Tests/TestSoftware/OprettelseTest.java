package SoftwareProjekt;


import static org.junit.Assert.*;
import org.junit.Test;


public class oprettelseTest {
	Oprettelse op = new Oprettelse();
	Medarbejder testM = op.opretMedarbejder("Test1", "test1", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", true);
	Aktivitet TestA = op.opretAktivitet("TestA", "1");
	Projekt TestP = op.opretProjekt("testP", "123");
	Aktivitet akt1 = op.opretAktivitet("Aktivitet1", "2");

	@Test
	public void opretMedarbejderTest(){
		assertEquals("Test1", Medarbejder.getNavn());
		assertEquals("test1", Medarbejder.getIntialer());
		assertEquals("00000000", Medarbejder.getTlf());
		assertEquals("xxxxxx-xxxx", Medarbejder.getCPR());
		assertEquals(true, Medarbejder.getProjektleder());
	}

	@Test
	public void fjernMedarbejderTest(){
		op.FjernMedarbejder(testM);
		assertNotSame("Test1", Medarbejder.getNavn());
		assertNotSame("test1", Medarbejder.getIntialer());
		assertNotSame("00000000", Medarbejder.getTlf());
		assertNotSame("xxxxxx-xxxx", Medarbejder.getCPR());
	}


	@Test
	public void OpretProjektTest(){
		assertEquals("testP", Projekt.getNavnP());
		assertEquals("123", Projekt.getIndexP());

	}


	@Test
	public void opretAktivietTest(){
		assertEquals("TestA", Aktivitet.getNavnA());
		assertEquals("1", Aktivitet.getIndexA());
	}
	
	@Test
	public void fjernProjektTest(){
		op.FjernProjekt(TestP);
		assertNotSame("testp",Projekt.getNavnP());
		assertNotSame("123",Projekt.getIndexP());		
	}
	
	public void fjernAktivitetTest(){
		op.FjernAktivitet(TestA);
		assertNotSame("TestA",Aktivitet.getNavnA());
		assertNotSame("1",Aktivitet.getIndexA());
	}



}

