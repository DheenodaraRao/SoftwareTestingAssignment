package my.edu.utar;

public class DummyOrdering {
	
	private int quantity;
	private OrderList orderList;
	private OrderItem sampleOrder;
	
	public DummyOrdering(int quan){
		this.quantity = quan;
		orderList = new OrderList();
	}

	public void startOrdering() {
		if(quantity < 0){
			throw new IllegalArgumentException();
		}
		else if(quantity > 99){
			throw new IllegalArgumentException();
		}
		else{
			sampleOrder = new OrderItem(false, false, quantity);
		}
	}

	public void createOrders(boolean dEffect, boolean hQuality, int quantity) {
		
		OrderItem order = new OrderItem(hQuality, dEffect,quantity);
		orderList.addOrder(order);
	}
	

}
