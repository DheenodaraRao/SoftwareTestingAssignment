package my.edu.utar;

import java.util.ArrayList;

public class ChargeModule {
	
	public double getCharge(OrderList itemList){
		
		double total = 0;
		
		ArrayList<OrderItem> list = itemList.getOrders();
		
		for(int i = 0; i < list.size(); i++){
			OrderItem oi = list.get(i);
			
			double chargePerPiece = 0;
			
			if(oi.getQuantity() <= 4){
				if(oi.noOptionSelected()){
					chargePerPiece = 1.00;
				}
				else if(oi.oneOptionSelected()){
					chargePerPiece = 1.10;
				}
				else if(oi.twoOptionSelected()){
					chargePerPiece = 1.20;
				}
			}
			else if(oi.getQuantity() <= 10){
				if(oi.noOptionSelected()){
					chargePerPiece = 0.90;
				}
				else if(oi.oneOptionSelected()){
					chargePerPiece = 1.00;
				}
				else if(oi.twoOptionSelected()){
					chargePerPiece = 1.20;
				}
				
			}
			else if(oi.getQuantity() <= 20){
				if(oi.noOptionSelected()){
					chargePerPiece = 0.70;
				}
				else if(oi.oneOptionSelected()){
					chargePerPiece = 0.80;
				}
				else if(oi.twoOptionSelected()){
					chargePerPiece = 0.90;
				}
			}
			else if(oi.getQuantity() <= 50){
				if(oi.noOptionSelected()){
					chargePerPiece = 0.50;
				}
				else if(oi.oneOptionSelected()){
					chargePerPiece = 0.60;
				}
				else if(oi.twoOptionSelected()){
					chargePerPiece = 0.70;
				}
				
			}
			else if(oi.getQuantity() <= 99){
				if(oi.noOptionSelected()){
					chargePerPiece = 0.10;
				}
				else if(oi.oneOptionSelected()){
					chargePerPiece = 0.20;
				}
				else if(oi.twoOptionSelected()){
					chargePerPiece = 0.30;
				}
				
			}
			
			total = total + chargePerPiece * oi.getQuantity();
		}
		
		return total;
	}
}
