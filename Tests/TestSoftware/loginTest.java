package SoftwareProjekt;

import static org.junit.Assert.*;

import org.junit.Test;

public class loginTest {
	Oprettelse op = new Oprettelse();
	Medarbejder test1 = op.opretMedarbejder("Test1", "test1", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", true);
	Medarbejder test2 = op.opretMedarbejder("Test2", "test2", "00000000", "s@student.dtu.dk", "xxxxxx-xxxx", false);


	@Test
	public void projektLederLoginTest(){
		Login logtest = new Login();
		assertTrue(logtest.projektlederlogin("test1"));
		assertFalse(logtest.projektlederlogin("test2"));
	}
	@Test
	public void medarbejderLoginTest() {
		
		Login logtest = new Login();
		assertTrue(logtest.medarbejderlogin("test2"));
		assertFalse(logtest.medarbejderlogin("test1"));
	}

}
