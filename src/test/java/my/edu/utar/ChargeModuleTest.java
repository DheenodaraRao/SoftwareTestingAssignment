package my.edu.utar;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;

import org.junit.Test;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ChargeModuleTest {
	
	public Object[] getParam(){
		
		OrderItem item1 = new OrderItem(false, false, 1);
		OrderItem item2 = new OrderItem(true, false, 1);
		OrderItem item3 = new OrderItem(false, true, 1);
		OrderItem item4 = new OrderItem(true, true, 1);
		
		OrderItem item5 = new OrderItem(false, false, 4);
		OrderItem item6 = new OrderItem(true, false, 4);
		OrderItem item7 = new OrderItem(false, true, 4);
		OrderItem item8 = new OrderItem(true, true, 4);
		
		OrderItem item9 = new OrderItem(false, false, 5);
		OrderItem item10 = new OrderItem(true, false, 5);
		OrderItem item11 = new OrderItem(false, true, 5);
		OrderItem item12 = new OrderItem(true, true, 5);
		
		OrderItem item13 = new OrderItem(false, false, 10);
		OrderItem item14 = new OrderItem(true, false, 10);
		OrderItem item15 = new OrderItem(false, true, 10);
		OrderItem item16 = new OrderItem(true, true, 10);
		
		OrderItem item17 = new OrderItem(false, false, 11);
		OrderItem item18 = new OrderItem(true, false, 11);
		OrderItem item19 = new OrderItem(false, true, 11);
		OrderItem item20 = new OrderItem(true, true, 11);
		
		OrderItem item21 = new OrderItem(false, false, 20);
		OrderItem item22 = new OrderItem(true, false, 20);
		OrderItem item23 = new OrderItem(false, true, 20);
		OrderItem item24 = new OrderItem(true, true, 20);
		
		OrderItem item25 = new OrderItem(false, false, 21);
		OrderItem item26 = new OrderItem(true, false, 21);
		OrderItem item27 = new OrderItem(false, true, 21);
		OrderItem item28 = new OrderItem(true, true, 21);
		
		OrderItem item29 = new OrderItem(false, false, 50);
		OrderItem item30 = new OrderItem(true, false, 50);
		OrderItem item31 = new OrderItem(false, true, 50);
		OrderItem item32 = new OrderItem(true, true, 50);
		OrderItem item33 = new OrderItem(false, false, 51);
		OrderItem item34 = new OrderItem(true, false, 51);
		OrderItem item35 = new OrderItem(false, true, 51);
		OrderItem item36 = new OrderItem(true, true, 51);
		
		OrderItem item37 = new OrderItem(false, false, 99);
		OrderItem item38 = new OrderItem(true, false, 99);
		OrderItem item39 = new OrderItem(false, true, 99);
		OrderItem item40 = new OrderItem(true, true, 99);
		
		OrderList oitem1 = new OrderList();
		oitem1.addOrder(item1);
		
		OrderList oitem2 = new OrderList();
		oitem2.addOrder(item2);
		
		OrderList oitem3 = new OrderList();
		oitem3.addOrder(item3);
		
		OrderList oitem4 = new OrderList();
		oitem4.addOrder(item4);
		
		OrderList oitem5 = new OrderList();
		oitem5.addOrder(item5);
		
		OrderList oitem6 = new OrderList();
		oitem6.addOrder(item6);
		
		OrderList oitem7 = new OrderList();
		oitem7.addOrder(item7);
		
		OrderList oitem8 = new OrderList();
		oitem8.addOrder(item8);
		
		OrderList oitem9 = new OrderList();
		oitem9.addOrder(item9);
		
		OrderList oitem10 = new OrderList();
		oitem10.addOrder(item10);
		
		OrderList oitem11 = new OrderList();
		oitem11.addOrder(item11);
		
		OrderList oitem12 = new OrderList();
		oitem12.addOrder(item12);
		
		OrderList oitem13 = new OrderList();
		oitem13.addOrder(item13);
		
		OrderList oitem14 = new OrderList();
		oitem14.addOrder(item14);
		
		OrderList oitem15 = new OrderList();
		oitem15.addOrder(item15);
		
		OrderList oitem16 = new OrderList();
		oitem16.addOrder(item16);
		
		OrderList oitem17 = new OrderList();
		oitem17.addOrder(item17);
		
		OrderList oitem18 = new OrderList();
		oitem18.addOrder(item18);
		
		OrderList oitem19 = new OrderList();
		oitem19.addOrder(item19);
		
		OrderList oitem20 = new OrderList();
		oitem20.addOrder(item20);
		
		OrderList oitem21 = new OrderList();
		oitem21.addOrder(item21);
		
		OrderList oitem22 = new OrderList();
		oitem22.addOrder(item22);
		
		OrderList oitem23 = new OrderList();
		oitem23.addOrder(item23);
		
		OrderList oitem24 = new OrderList();
		oitem24.addOrder(item24);
		
		OrderList oitem25 = new OrderList();
		oitem25.addOrder(item25);
		
		OrderList oitem26 = new OrderList();
		oitem26.addOrder(item26);
		
		OrderList oitem27 = new OrderList();
		oitem27.addOrder(item27);
		
		OrderList oitem28 = new OrderList();
		oitem28.addOrder(item28);
		
		OrderList oitem29 = new OrderList();
		oitem29.addOrder(item29);
		
		OrderList oitem30 = new OrderList();
		oitem30.addOrder(item30);
		
		OrderList oitem31 = new OrderList();
		oitem31.addOrder(item31);
		
		OrderList oitem32 = new OrderList();
		oitem32.addOrder(item32);
		
		OrderList oitem33 = new OrderList();
		oitem33.addOrder(item33);
		
		OrderList oitem34 = new OrderList();
		oitem34.addOrder(item34);
		
		OrderList oitem35 = new OrderList();
		oitem35.addOrder(item35);
		
		OrderList oitem36 = new OrderList();
		oitem36.addOrder(item36);
		
		OrderList oitem37 = new OrderList();
		oitem37.addOrder(item37);
		
		OrderList oitem38 = new OrderList();
		oitem38.addOrder(item38);
		
		OrderList oitem39 = new OrderList();
		oitem39.addOrder(item39);
		
		OrderList oitem40 = new OrderList();
		oitem40.addOrder(item40);
		
		return new Object[]{
				new Object[]{oitem1, 1.00},
				new Object[]{oitem2, 1.10},
				new Object[]{oitem3, 1.10},
				new Object[]{oitem4, 1.20},
				
				new Object[]{oitem5, 4.00},
				new Object[]{oitem6, 4.40},
				new Object[]{oitem7, 4.40},
				new Object[]{oitem8, 4.80},
				new Object[]{oitem9, 4.50},
				new Object[]{oitem10, 5.00},
				new Object[]{oitem11, 5.00},
				new Object[]{oitem12, 6.00},
				new Object[]{oitem13, 9.00},
				new Object[]{oitem14, 10.00},
				new Object[]{oitem15, 10.00},
				new Object[]{oitem16, 12.00},
				new Object[]{oitem17, 7.70},
				new Object[]{oitem18, 8.80},
				new Object[]{oitem19, 8.80},
				new Object[]{oitem20, 9.90},
				new Object[]{oitem21, 14.00},
				new Object[]{oitem22, 16.00},
				new Object[]{oitem23, 16.00},
				new Object[]{oitem24, 18.00},
				new Object[]{oitem25, 10.50},
				new Object[]{oitem26, 12.60},
				new Object[]{oitem27, 12.60},
				new Object[]{oitem28, 14.70},
				new Object[]{oitem29, 25.00},
				new Object[]{oitem30, 30.00},
				new Object[]{oitem31, 30.00},
				new Object[]{oitem32, 35.00},
				
				new Object[]{oitem33, 5.10},
				new Object[]{oitem34, 10.20},
				new Object[]{oitem35, 10.20},
				new Object[]{oitem36, 15.30},
				
				new Object[]{oitem37, 9.90},
				new Object[]{oitem38, 19.80},
				new Object[]{oitem39, 19.80},
				new Object[]{oitem40, 29.70},
		};
	}
	
	
	@Parameters(method = "getParam")
	@Test
	public void testGetChargeSingleItem(OrderList list, double expectedCharge){
		
		ChargeModule charge = new ChargeModule();
		double calCharge = charge.getCharge(list);
		
		Assert.assertEquals(expectedCharge, calCharge, 0.0001);
	}
	
	public Object[] getParamTotalCharge(){
		
		OrderItem item1 = new OrderItem(false, true, 9);
		OrderItem item2 = new OrderItem(true, true, 30);
		OrderList list1 = new OrderList();
		list1.addOrder(item1);
		list1.addOrder(item2);
		
		OrderItem item3 = new OrderItem(true, false, 29);
		OrderItem item4 = new OrderItem(false, false, 60);
		OrderItem item5 = new OrderItem(true, false, 41);
		OrderList list2 = new OrderList();
		list2.addOrder(item3);
		list2.addOrder(item4);
		list2.addOrder(item5);
		
		return new Object[]{
				new Object[] {list1, 30.0},
				new Object[] {list2, 48.0}
		};
	}
	
	@Test
	@Parameters(method="getParamTotalCharge")
	public void testCalTotalCharge(OrderList list, double expectedCharge){
		ChargeModule charge = new ChargeModule();
		double calCharge = charge.getCharge(list);
		
		Assert.assertEquals(expectedCharge, calCharge, 0.0001);
	}
	
}
	
