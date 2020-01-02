package day3casestudy2;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String species=s.next();
		String locomotionType=s.next();
		float  locomotionSpeed=s.nextFloat();
		int numberOfWings;
		float speedPerWing;
		float ashResistance;
		int numberOfFins;
		float numberOfTails;
		float waterMultiplier;
		int numberOfLegs;
	
		if (species.equalsIgnoreCase("Air"))
		{
			  numberOfWings=s.nextInt();
			 speedPerWing=s.nextFloat();
			 ashResistance=s.nextFloat();
			AirLavaDino air=new AirLavaDino(species,l1ocomotionType,locomotionSpeed,numberOfWings,speedPerWing,ashResistance);
			air.displayDinoSpeed(locomotionSpeed,species);
		}else if(species.equalsIgnoreCase("Water"))
		{
			numberOfFins=s.nextInt();
			numberOfTails=s.nextFloat();
			waterMultiplier=s.nextFloat();
			WaterLavaDino water=new WaterLavaDino(species,locomotionType,locomotionSpeed,numberOfFins,numberOfTails,waterMultiplier);
			water.displayDinoSpeed(locomotionSpeed,species);
		}
		else if(species.equalsIgnoreCase("Land"))
		{
			numberOfLegs=s.nextInt();
			LandLavaDino land= new LandLavaDino(species,locomotionType,locomotionSpeed,numberOfLegs);
			land.displayDinoSpeed(locomotionSpeed,species);
		}
		else
			System.out.println("No Identified species");
		
	}

}
