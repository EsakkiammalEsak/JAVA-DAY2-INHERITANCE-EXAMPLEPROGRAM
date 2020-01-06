package day3casestudy6;
//import java.util.Scanner;
public class BusBooking extends TicketBooking {
	private boolean            isAC;
	private boolean            isSleeper;
	private boolean            hasWifi;

//Scanner s=new Scanner(System.in);
public BusBooking(String source, String destination, String dateOfTravel, int numberOfPassengers, boolean isAC2,
		boolean isSleeper2, boolean hasWifi2) {
	// TODO Auto-generated constructor stub
super(source,destination,dateOfTravel,numberOfPassengers);
	
	this.isAC=isAC;
	this.isSleeper=isSleeper;
	this.hasWifi=hasWifi;
}

public float calculateBill(float price) {
	// TODO Auto-generated method stub
	
	
		//this.price=price;
		price=price+100;
	
	return price;

	
}
}

