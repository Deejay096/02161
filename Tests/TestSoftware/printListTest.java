// Udarbejdet af Jackie Vuong: studie nr. s153121

package TestSoftware;
import org.junit.Test;

import SoftwareProjekt.printList;

public class printListTest
{
	printList p = new printList(null);
	
	@Test
	public void printTest()
	{
		p.printAktivitetList();
		p.printMedarbejderList();
		p.printProjektList();
	}

}
