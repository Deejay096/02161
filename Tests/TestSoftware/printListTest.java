// Udarbejdet af Jackie Vuong: studie nr. s153121

package TestSoftware;
import org.junit.Test;

import SoftwareProjekt.printList;
import SoftwareProjekt.printerGUI;

public class printListTest
{
	public printerGUI print = new printerGUI();
	printList p = new printList(print);
	
	@Test
	public void printTest()
	{
		p.printAktivitetList();
		p.printMedarbejderList();
		p.printProjektList();
	}

}
