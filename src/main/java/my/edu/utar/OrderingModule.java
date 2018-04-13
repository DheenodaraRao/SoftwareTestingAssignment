package my.edu.utar;

import java.util.Scanner;

public class OrderingModule implements IOrdering{

	private Scanner scan;
	private OrderList orderList;
	
	public OrderingModule(){
		scan = new Scanner(System.in);
	}
	
	public void startOrdering(){
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
		
		System.out.print("Quantity? ");
		quantity = scan.nextInt();
		
		if(quantity < 0){
			throw new IllegalArgumentException();
		}
		else if(quantity > 99){
			throw new IllegalArgumentException();
		}
		else{
			createOrders(dEffect, hQuality, quantity);
		}
		
	}

	public void createOrders(boolean dEffect, boolean hQuality, int quantity) {
		
			OrderItem order = new OrderItem(hQuality, dEffect,quantity);
			orderList.addOrder(order);
	}
}
