package my.edu.utar;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
public class PhotoPrinterTest {

	@Test
	public void testPrint(){
		
		PhotoPrinter pm = new PhotoPrinter();
		PhotoPrinter pmspy = spy(pm);
		
		//hard coded test values as this is not critical and the codes may/can be erased for 
		//new implementation as the original codes are unknown
		
		OrderItem item1 = new OrderItem(false,true,7);
		OrderItem item2 = new OrderItem(true,true,12);
		OrderItem item3 = new OrderItem(true,true,20);
		
		OrderList list = new OrderList();
		list.addOrder(item1);
		list.addOrder(item2);
		list.addOrder(item3);
		
		pmspy.queueRequest(list);
		
		verify(pmspy, times(3)).sendRequest();
	}
}
