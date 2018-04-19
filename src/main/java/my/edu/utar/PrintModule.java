package my.edu.utar;

public class PrintModule {

	public PrintModule(){
		
	}
	
	public void print(OrderList list){
		for(int i = 0; i < list.getOrders().size(); i++)
		this.sendRequest();
	}
	
	public void sendRequest(){
		
	}
}
