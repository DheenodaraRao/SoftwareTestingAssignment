package my.edu.utar;

public class DummyOrdering implements IOrdering{
	
	private int quantity;
	
	public DummyOrdering(int quan){
		this.quantity = quan;
	}

	public void startOrdering() {
		if(quantity < 0){
			throw new IllegalArgumentException();
		}
		else if(quantity > 99){
			throw new IllegalArgumentException();
		}		
	}

	public void createOrders(boolean dEffect, boolean hQuality, int quantity) {
		// TODO Auto-generated method stub
		
	}
	
	public int getQuantity(){
		return quantity;
	}

}
