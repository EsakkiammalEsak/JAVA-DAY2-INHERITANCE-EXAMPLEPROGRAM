package day3casestudy6;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		String             source=s.next();
		String             destination=s.next();
		String             dateOfTravel=s.next();
		int                numberOfPassengers=s.nextInt();
		boolean            isAC;
		boolean            isSleeper;
		boolean            hasWifi;
		String             coach;
		int                mealsOpted;
		String             Class;
		float              luggageWeight;
		float price;
		price=s.nextFloat();
		System.out.println("1.BUS\t2.TRAIN\t3.FLIGHT");
		int n=s.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("IS AC");
		           isAC=s.nextBoolean();
		           System.out.println("IS SLEEPER");
		           isSleeper=s.nextBoolean();
		           System.out.println("HAS WIFI");
		           hasWifi=s.nextBoolean();
		           BusBooking bus=new BusBooking(source,destination,dateOfTravel,numberOfPassengers,isAC,isSleeper,hasWifi);
		           System.out.print("PRICE"+bus.calculateBill(price));
		           break;
		    case 2:
		    	System.out.println("coach");
		           coach=s.next();
		           System.out.println("mealsOpted");
		           mealsOpted=s.nextInt();
		           TrainBooking t=new TrainBooking(source,destination,dateOfTravel,numberOfPassengers,coach,mealsOpted);
		           t.calculateBill(price);
		           System.out.print("PRICE"+t.calculateBill(price));
		           break;
		    case 3:
		    	System.out.println("Class");
		           Class=s.next();
		           System.out.println("luggageWeight");
		           luggageWeight=s.nextFloat();
		           FlightBooking flight=new FlightBooking(source,destination,dateOfTravel,numberOfPassengers,Class,luggageWeight);
		           flight.calculateBill(price);
		           System.out.print("PRICE"+flight.calculateBill(price));
		           break;
		           
		    	
		
		}
		
		
		

		

	}

}
