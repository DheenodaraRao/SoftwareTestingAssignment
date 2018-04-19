package my.edu.utar;

import java.util.Scanner;

public class IntegrationTesting {
	
	static Scanner scan = null;

	public static void main(String[] args){
		
		boolean cont = true;
		scan = new Scanner(System.in);
		
		while(cont){
			System.out.println("------------Printing System-----------------");
			System.out.println("[1] - Order");
			System.out.println("[2] - Exit");
			
			System.out.print("Choice: \t");
			
			String choice = scan.nextLine();
			
			if(choice.equals("1")){
				perform();
			}
			else{
				cont = false;
			}
		}
		System.exit(0);
	}
	
	public static void perform(){
		
		OrderingModule om = new OrderingModule();
		boolean add = true;
		
		while(add){
			System.out.println("------------Ordering-----------------");
			System.out.println("[1] - Add");
			System.out.println("[2] - Finish");
			System.out.print("Choice: \t");
			String choice = scan.nextLine();
			
			switch(choice){
			case "1": 	boolean[] options = om.getOrderOptions();
						int quantity = om.getOrderQuantity();
						om.createOrders(options[0], options[1], quantity);
				break;
			case "2": add = false;
				break;
			}
		}
		
		ChargeModule cm = new ChargeModule();
		double charge = cm.getCharge(om.getOrderList());
		System.out.println("Charge: RM" + charge);
		
		PrintModule pm = new PrintModule();
		pm.print(om.getOrderList());
	}
}
