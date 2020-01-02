package day3casestudy2;

public class LandLavaDino extends LavaDino {
	int numberOfLegs;
	
	
	
	public LandLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfLegs) {
		super(species, locomotionType, locomotionSpeed);
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

void   displayDinoSpeed (float locomotionSpeed, String species)
	{
	this.locomotionSpeed=locomotionSpeed;
		float speed = locomotionSpeed*numberOfLegs;
		System.out.println(species);
		System.out.println(speed);
		
	}


}

