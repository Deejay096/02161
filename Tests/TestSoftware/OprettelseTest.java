package TestSoftware;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import SoftwareProjekt.Aktivitet;
import SoftwareProjekt.Main;
import SoftwareProjekt.Medarbejder;
import SoftwareProjekt.Oprettelse;
import SoftwareProjekt.Projekt;


public class OprettelseTest {
	Oprettelse op = new Oprettelse();
	Medarbejder testM = op.opretMedarbejder("Test1", "test1", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", true);
	Aktivitet TestA = op.opretAktivitet("TestA", "1");
	Projekt TestP = op.opretProjekt("testP", "123");
	Aktivitet akt1 = op.opretAktivitet("Aktivitet1", "2");
	public static List<Medarbejder> listM = Main.getmedarbejderList();
	public static List<Projekt> listP = Main.getprojektList();
	public static List<Aktivitet> listA = Main.getaktivitetList();
	

	@SuppressWarnings("static-access")
	@Test
	public void opretMedarbejderTest(){
		assertEquals("Test1", listM.get(0).getNavn());
		assertEquals("test1", listM.get(0).getIntialer());
		assertEquals("00000000", listM.get(0).getTlf());
		assertEquals("xxxxxx-xxxx", listM.get(0).getCPR());
		assertEquals(true, listM.get(0).getProjektleder());
	}

	@SuppressWarnings("static-access")
	@Test
	public void fjernMedarbejderTest(){
		op.FjernMedarbejder(testM);
		assertNotSame("Test1", listM.get(0).getNavn());
		assertNotSame("test1", listM.get(0).getIntialer());
		assertNotSame("00000000", listM.get(0).getTlf());
		assertNotSame("xxxxxx-xxxx", listM.get(0).getCPR());
	}


	@Test
	public void OpretProjektTest(){
		assertEquals("testP", listP.get(0).getNavnP());
		assertEquals("123", listP.get(0).getIndexP());
	}


	@Test
	public void opretAktivietTest(){
		assertEquals("TestA", listA.get(0).getNavnA());
		assertEquals("1", listA.get(0).getIndexA()); 
	}
	
	@Test
	public void fjernProjektTest(){
		op.FjernProjekt(TestP);
		assertNotSame("testp",listP.get(0));
		assertNotSame("123",listP.get(0));		
	}
	
	public void fjernAktivitetTest(){
		op.FjernAktivitet(TestA);
		assertNotSame("TestA",listA.get(0));
		assertNotSame("1",listA.get(0));
	}



}

