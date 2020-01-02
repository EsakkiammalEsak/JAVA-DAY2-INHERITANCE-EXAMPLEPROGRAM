package day3casestudy2;

public class WaterLavaDino extends LavaDino  {

	int                numberOfFins;
	float              numberOfTails;
	float              waterMultiplier;
	public WaterLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfFins,
			float numberOfTails, float waterMultiplier) {
		super(species, locomotionType, locomotionSpeed);
		this.numberOfFins = numberOfFins;
		this.numberOfTails = numberOfTails;
		this.waterMultiplier = waterMultiplier;
	}
	void  displayDinoSpeed(float locomotionSpeed, String species)
	{
		this.locomotionSpeed=locomotionSpeed;
		float speed = locomotionSpeed+(numberOfFins+numberOfTails)*waterMultiplier;
		System.out.println(species);
		System.out.println(speed);
		
	}
	
}


