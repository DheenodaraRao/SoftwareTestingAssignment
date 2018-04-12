package my.edu.utar;

public class OrderItem {
	
	private boolean qualityPaper;
	private boolean designEffect;
	
	public boolean checkQualityPaper(){
		return qualityPaper;
	}
	
	public boolean checkDesignEffect(){
		return designEffect;
	}
	
	public OrderItem(boolean qPaper, boolean dEffect){
		this.qualityPaper = qPaper;
		this.designEffect = dEffect;
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
}
