package TestSoftware;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ aktivitetTest2.class, loginTest.class, MedarbejderTest.class, OprettelseTest.class, printListTest.class,
		timeObjektTest.class })
public class AllTests {

}
