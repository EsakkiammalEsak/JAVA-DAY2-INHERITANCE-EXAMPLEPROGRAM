package day3casestudy6;
//import java.util.Scanner;
public class TrainBooking extends TicketBooking {
	private String             coach;
	private int                mealsOpted;
	//Scanner s=new Scanner(System.in);

	public TrainBooking(String source, String destination, String dateOfTravel, int numberOfPassengers, String coach,
			int mealsOpted) {
		super(source, destination,dateOfTravel,numberOfPassengers);
		// TODO Auto-generated constructor stub
		this.coach=coach;
		this.mealsOpted=mealsOpted;
		
	}
		
		
		
		public float calculateBill (float price) {
			this.price=price;
		price=price+((float)mealsOpted*100);
		return price;
		
		
		
	}
	}


