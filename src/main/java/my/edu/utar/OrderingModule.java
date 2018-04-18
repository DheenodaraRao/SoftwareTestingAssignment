package my.edu.utar;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderingModule{

	private Scanner scan;
	private OrderList orderList;
	
	public OrderingModule(){
		scan = new Scanner(System.in);
		orderList = new OrderList();
	}
	
	public boolean[] getOrderOptions(){
		String select;
		
		boolean dEffect;
		boolean hQuality;
		int quantity;
		
		System.out.println("Starting Ordering");
		
		System.out.print("Do you want special Effect: [Y/N]: ");
		String choice = scan.nextLine();
		if(choice.toLowerCase() == "y"){
			dEffect = true;
		}else{
			dEffect = true;
		}
		
		System.out.print("Do you want High Quality Paper: [Y/N]: ");
		select = scan.nextLine();
		if(select.toLowerCase() == "y"){
			hQuality = true;
		}else{
			hQuality = true;
		}
		
		return new boolean[] {dEffect, hQuality};
	}
	
	public int getOrderQuantity(){
		int quantity;
		
		System.out.println("Quantity?");
		
		quantity = scan.nextInt();
		
		return quantity;
	}

	public void createOrders(boolean dEffect, boolean hQuality, int quantity) throws IllegalArgumentException{
		
		if(quantity < 1 || quantity > 99){
			throw new IllegalArgumentException();
		}
		
			OrderItem order = new OrderItem(dEffect,hQuality,quantity);
			orderList.addOrder(order);
	}
	
	public ArrayList<OrderItem> getOrders(){
		return orderList.getOrders();
	}
}
