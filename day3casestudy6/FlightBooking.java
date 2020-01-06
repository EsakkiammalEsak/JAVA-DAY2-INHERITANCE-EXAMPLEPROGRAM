package day3casestudy6;

public class FlightBooking extends TicketBooking {
	private String             Class;
	private float              luggageWeight;
	public FlightBooking(String source, String destination, String dateOfTravel, int numberOfPassengers, String coach,
			float luggageWeight) {
		super(source,destination,dateOfTravel,numberOfPassengers);
		// TODO Auto-generated constructor stub
		this.Class=Class;
		this.luggageWeight=luggageWeight;
		
	}
		public float calculateBill (float price) {
			this.price=price;
		price=price+((float)luggageWeight*100);
		return price;
	}

}
