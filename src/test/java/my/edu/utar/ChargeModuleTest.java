package my.edu.utar;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	/*
	 * getParamIllegal1 is to test the boundary value analysis of all the quantity 
	 * which is covered in the decision table
	 * this also covers each test cases based on the decision table 
	 * This test covers test case -> TC 04, TC 05, and etc
	 */
	
	public Object[] getParam(){
		String fileName = "calSingleCharge.txt";

        // This will reference one line at a time
        String line = null;
        ArrayList<Object> list = new ArrayList<Object>();
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            int lines = 0;
            while((line = bufferedReader.readLine()) != null) {
            	boolean op1 = Boolean.parseBoolean(line);
        		boolean op2 = Boolean.parseBoolean(bufferedReader.readLine());	
        		int quantity = Integer.parseInt(bufferedReader.readLine());
        		double expectedCharge = Double.parseDouble(bufferedReader.readLine());
        		
        		OrderItem item = new OrderItem(op1, op2, quantity);
        		OrderList orderList = new OrderList();
        		orderList.addOrder(item);
        		
        		list.add(new Object[]{orderList, expectedCharge});
            }  

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        Object[] data = new Object[list.size()];
        for(int i = 0; i < list.size(); i++){
        	data[i] = (Object[]) list.get(i);
        }
        
        return data;
	}
	@Parameters(method = "getParam")
	@Test
	public void testGetChargeSingleItem(OrderList list, double expectedCharge){
		
		ChargeModule charge = new ChargeModule();
		double calCharge = charge.getCharge(list);
		
		Assert.assertEquals(expectedCharge, calCharge, 0.0001);
	}
	
	public Object[] getParamTotalCharge(){
		String fileName = "calTotalCharge.txt";

        // This will reference one line at a time
        String line = null;
        ArrayList<Object> list = new ArrayList<Object>();
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            int lines = 0;
            while((line = bufferedReader.readLine()) != null) {
            	boolean op1 = Boolean.parseBoolean(line);
        		boolean op2 = Boolean.parseBoolean(bufferedReader.readLine());	
        		int quantity = Integer.parseInt(bufferedReader.readLine());
        		
        		boolean op3 = Boolean.parseBoolean(bufferedReader.readLine());
        		boolean op4 = Boolean.parseBoolean(bufferedReader.readLine());	
        		int quantity2 = Integer.parseInt(bufferedReader.readLine());
        		
        		double expectedCharge = Double.parseDouble(bufferedReader.readLine());
        		
        		OrderItem item1 = new OrderItem(op1, op2, quantity);
        		OrderItem item2 = new OrderItem(op3, op4, quantity2);
        		OrderList orderList = new OrderList();
        		orderList.addOrder(item1);
        		orderList.addOrder(item2);
        		
        		list.add(new Object[]{orderList, expectedCharge});
            }  

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        Object[] data = new Object[list.size()];
        for(int i = 0; i < list.size(); i++){
        	data[i] = (Object[]) list.get(i);
        }
        
        return data;
	}
	
	@Test
	@Parameters(method="getParamTotalCharge")
	public void testCalTotalCharge(OrderList list, double expectedCharge){
		ChargeModule charge = new ChargeModule();
		double calCharge = charge.getCharge(list);
		
		Assert.assertEquals(expectedCharge, calCharge, 0.0001);
	}
	
}
	
