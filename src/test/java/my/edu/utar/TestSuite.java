package my.edu.utar;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ChargeModuleTest.class,
	OrderingModuleTest.class,
	PhotoPrinterTest.class
})

public class TestSuite {

}
