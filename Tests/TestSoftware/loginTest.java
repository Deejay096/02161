package TestSoftware;

import static org.junit.Assert.*;

import org.junit.Test;

import SoftwareProjekt.Login;
import SoftwareProjekt.Medarbejder;
import SoftwareProjekt.Oprettelse;

public class loginTest {
	Oprettelse op = new Oprettelse();
	Medarbejder tes1 = op.opretMedarbejder("Test1", "test1", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", true);
	Medarbejder tes2 = op.opretMedarbejder("Test2", "test2", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", false);
	Login logtest = new Login();

	@Test
	public void projektLederLoginTest(){
		
		assertFalse(logtest.projektlederlogin(tes2.getIntialer())); 
		assertTrue(logtest.projektlederlogin(tes1.getIntialer()));
	}
	
	@Test
	public void medarbejderLoginTest() {
		assertTrue(logtest.medarbejderlogin("test2"));
		assertFalse(logtest.medarbejderlogin("test1"));
	}

}
