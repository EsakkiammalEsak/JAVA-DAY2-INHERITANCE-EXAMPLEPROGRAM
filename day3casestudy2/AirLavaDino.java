package day3casestudy2;

public class AirLavaDino extends LavaDino{

	int                numberOfWings;
	float              speedPerWing;
	float              ashResistance;
	public AirLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfWings,
			float speedPerWing, float ashResistance) {
		super(species, locomotionType, locomotionSpeed);
		this.numberOfWings = numberOfWings;
		this.speedPerWing = speedPerWing;
		this.ashResistance = ashResistance;
		// TODO Auto-generated constructor stub
	}
	void    displayDinoSpeed (float locomotionSpeed, String species)
	{
		this.locomotionSpeed=locomotionSpeed;
		float speed = locomotionSpeed +(numberOfWings*speedPerWing)- ashResistance;
		System.out.println(species);
		System.out.println(speed);
		
	}
	

}
