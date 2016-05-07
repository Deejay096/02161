// Udarbejdet af Jackie Vuong: studie nr. s153121

package TestSoftware;
import org.junit.Test;

import SoftwareProjekt.Projekt;

public class ProjektTest
{
	Projekt p = new Projekt("hi", "123");
	
	@Test
	public void getTest() 
	{
		p.getNavnP();
		p.getIndexP();
	}

}
