package my.edu.utar;

import java.util.ArrayList;

public class OrderList {

	private ArrayList<OrderItem> itemList;
	
	public int getQuantity(){
		return itemList.size();
	}
	
	public OrderList(){
		itemList = new ArrayList<OrderItem>();
	}
	
	public void addOrder(OrderItem item){
		itemList.add(item);
	}
	
	public ArrayList<OrderItem> getOrders(){
		return itemList;
	}
}
