package my.edu.utar;

public class PhotoPrinter {

	public PhotoPrinter(){
		
	}
	
	public void queueRequest(OrderList list){
		for(int i = 0; i < list.getOrders().size(); i++)
		this.sendRequest();
	}
	
	public void sendRequest(){
		System.out.println("Sending Request");
	}
}
