package my.edu.utar;

public class OrderItem {
	
	private boolean qualityPaper;
	private boolean designEffect;
	private int quantity;
	
	public int getQuantity(){
		return quantity;
	}
	
	public boolean checkQualityPaper(){
		return qualityPaper;
	}
	
	public boolean checkDesignEffect(){
		return designEffect;
	}
	
	public OrderItem(boolean qPaper, boolean dEffect, int quantity){
		this.qualityPaper = qPaper;
		this.designEffect = dEffect;
		this.quantity = quantity;
	}
	
	public boolean oneOptionSelected(){
		
		if(checkDesignEffect() == true && checkQualityPaper() == false){
			return true;
		}
		else if(checkDesignEffect() == false && checkQualityPaper() == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean twoOptionSelected(){
		if(checkDesignEffect() == true && checkQualityPaper() == true){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean noOptionSelected(){
		if(checkDesignEffect() == false && checkQualityPaper() == false){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public boolean equals(Object item){
		
		boolean yes = false;
		OrderItem itm = (OrderItem)item;
		
		if(this.designEffect == itm.designEffect && this.qualityPaper == itm.qualityPaper 
				&& this.quantity == itm.quantity){
			yes = true;
		}
		else{
			yes = false;
		}
		return yes;
		
	}
}
