package my.edu.utar;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class OrderingModuleTest {
/*	
	public static void main(String[] args){
		String fileName = "orderTestIllegal1.txt";

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
        		
        		list.add(new Object[]{op1,op2,quantity});
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
        
        for(int i = 0; i < list.size(); i++){
        	Object[] data = (Object[]) list.get(i);
        	System.out.println(data[0] + " " + data[1] + " " + data[2]);
        }
        
        Object[] data = new Object[list.size()];
        for(int i = 0; i < list.size(); i++){
        	data[i] = (Object[]) list.get(i);
        }
    }
*/
	
	public Object[] getParamIllegal1(){
		String fileName = "orderTestIllegal1.txt";

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
        		
        		list.add(new Object[]{op1,op2,quantity});
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
	
	public Object[] getParamIllegal2(){
		String fileName = "orderTestIllegal2.txt";

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

            while((line = bufferedReader.readLine()) != null) {
            	boolean op1 = Boolean.parseBoolean(line);
        		boolean op2 = Boolean.parseBoolean(bufferedReader.readLine());	
        		int quantity = Integer.parseInt(bufferedReader.readLine());
        		
        		list.add(new Object[]{op1,op2,quantity});
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
	
	public Object[] getParamLegal(){
		String fileName = "orderTestLegal.txt";

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
        		
        		list.add(new Object[]{op1,op2,quantity, new OrderItem(op1, op2, quantity)});
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
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method ="getParamIllegal1")
	public void TestIllegalArgumentMockito1(boolean op1, boolean op2, int pQuantity){
		OrderingModule mod = new OrderingModule();
		OrderingModule spymod = spy(mod);
		
		doReturn(new boolean[] {op1, op2}).when(spymod).getOrderOptions();
		doReturn(pQuantity).when(spymod).getOrderQuantity();
		
		boolean[] actual = spymod.getOrderOptions();
		int quantity = spymod.getOrderQuantity();
		
		spymod.createOrders(actual[0], actual[1], quantity);
	}	
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method ="getParamIllegal2")
	public void TestIllegalArgumentMockito2(boolean op1, boolean op2, int pQuantity){
		OrderingModule mod = new OrderingModule();
		OrderingModule spymod = spy(mod);
		
		doReturn(new boolean[] {op1, op2}).when(spymod).getOrderOptions();
		doReturn(pQuantity).when(spymod).getOrderQuantity();
		
		boolean[] actual = spymod.getOrderOptions();
		int quantity = spymod.getOrderQuantity();
		
		spymod.createOrders(actual[0], actual[1], quantity);
	}	
		
	@Test
	@Parameters(method="getParamLegal")
	public void testLegalArguements(boolean op1, boolean op2, int pQuantity, OrderItem expectedItem){
		
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


