package my.edu.utar;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class OrderingModuleTest {
	
	OrderingModule io = mock(OrderingModule.class);

	
	@Test(expected = IllegalArgumentException.class)
	public void IllegalArgumentMockito1(){
		OrderingModule mod = new OrderingModule();
		OrderingModule spymod = spy(mod);
		
		doReturn(new boolean[] {true, false}).when(spymod).getOrderOptions();
		doReturn(0).when(spymod).getOrderQuantity();
		
		boolean[] actual = spymod.getOrderOptions();
		int quantity = spymod.getOrderQuantity();
		
		spymod.createOrders(actual[0], actual[1], quantity);
	}	
	
	@Test(expected = IllegalArgumentException.class)
	public void IllegalArgumentMockito2(){
		OrderingModule mod = new OrderingModule();
		OrderingModule spymod = spy(mod);
		
		doReturn(new boolean[] {true, false}).when(spymod).getOrderOptions();
		doReturn(100).when(spymod).getOrderQuantity();
		
		boolean[] actual = spymod.getOrderOptions();
		int quantity = spymod.getOrderQuantity();
		
		spymod.createOrders(actual[0], actual[1], quantity);
	}	
	
	public Object[] getParamLegal(){
		return new Object[]{
			new Object[]{
					true,false,1, new OrderItem(true, false, 1)
			},
			new Object[]{
					true,false,99, new OrderItem(true, false, 99)
			}
		};
	}
	
	
	@Test
	@Parameters(method="getParamLegal")
	public void testSpy(boolean op1, boolean op2, int pQuantity, OrderItem expectedItem){
		
		OrderingModule mod = new OrderingModule();
		OrderingModule spymod = spy(mod);
		
		doReturn(new boolean[] {op1, op2}).when(spymod).getOrderOptions();
		doReturn(pQuantity).when(spymod).getOrderQuantity();
		
		boolean[] actual = spymod.getOrderOptions();
		int quantity = spymod.getOrderQuantity();
		
		mod.createOrders(actual[0], actual[1], quantity);
		
		boolean yes = false;
		if(mod.getOrders().contains(expectedItem)){
			yes = true;
		}
		
		Assert.assertTrue(yes);
	}
	
}


