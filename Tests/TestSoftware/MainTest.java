package TestSoftware;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import SoftwareProjekt.Aktivitet;
import SoftwareProjekt.Main;
import SoftwareProjekt.Medarbejder;
import SoftwareProjekt.Oprettelse;
import SoftwareProjekt.Projekt;

public class MainTest {
	Oprettelse op = new Oprettelse();
	public static List<Projekt> listP = Main.getprojektList();
	public static List<Aktivitet> listA = Main.getaktivitetList();
	public static List<Medarbejder> listM = Main.getmedarbejderList();

	
	@Test
	public void testGetProjekt() {
		op.opretProjekt("Software", "1");
		assertEquals(Main.getProjekt("Software","1") , listP.get(0));
	}

	@Test
	public void testGetAktivitet() {
		op.opretAktivitet("Software", "1");
		assertEquals(Main.getAktivitet("Software","1") , listA.get(0));
	}
	
	@Test
	public void testGetMedarbejder() {
		op.opretMedarbejder("Test1", "test1", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", true);
		assertEquals(Main.getMedarbejder("Test1","test1") , listM.get(0));
	}
}
