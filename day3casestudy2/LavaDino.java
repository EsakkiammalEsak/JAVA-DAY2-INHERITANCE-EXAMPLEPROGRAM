package day3casestudy2;

public class LavaDino {
	String             species;
	String             locomotionType;
	float              locomotionSpeed;

	public LavaDino(String species, String locomotionType, float locomotionSpeed) {
		// TODO Auto-generated constructor stub
		super();
		this.species = species;
		this.locomotionType = locomotionType;
		this.locomotionSpeed = locomotionSpeed;
	}

	
	
	
	
	public String getSpecies() {
		return species;
	}
public void setSpecies(String species) {
		this.species = species;
	}
public String getLocomotionType() {
		return locomotionType;
	}
	public void setLocomotionType(String locomotionType) {
		this.locomotionType = locomotionType;
	}
	public float getLocomotionSpeed() {
		return locomotionSpeed;
	}

public void setLocomotionSpeed(float locomotionSpeed) {
		this.locomotionSpeed = locomotionSpeed;
	}
void displayDinoSpeed () {
		
		System.out.println(species);
		float speed = locomotionSpeed;
		System.out.println(speed);
	}
}













