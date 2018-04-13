package my.edu.utar;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class OrderingModuleTest {
	
	public Object[] getObjForTestIllegal(){
		return new Object[] { -1, 100};
	}

	@Test(expected =IllegalArgumentException.class)
	@Parameters(method ="getObjForTestIllegal")
	public void TestStartOrderingIllegal(int quantity){
		
		IOrdering io = new DummyOrdering(quantity);
		io.startOrdering();
	}
	
	public Object[] getObjForTestLegal(){
		return new Object[] {
			new int[] {-1},
			new int[] {99}
		};
	}
}
