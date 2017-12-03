import java.util.Scanner;

public class Battleground {

	static final int MAX_HEALTH_POINTS = 100;
	static final int MAX_NUM_ROUNDS = 10;
	static final int MAX_ATK = 50;
	
	/** Minimum attack and defense level; */
	static final int MIN = 1;
	
	static final int MAX_DEF = 50;
	
	static Warrior firstWarrior;
	static Warrior secondWarrior;
	static Scanner myScan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubz
		
		// ask users to build their warriors
		System.out.println()
		firstWarrior = buildWarrior();
		// determine the order of the warriors
		// start and play game
		// determine winner
		// print ending message
		
		Warrior myWarrior = buildWarrior();
		System.out.println(myWarrior);
	
	}
	
	/**
	 * Build a warrior using user input.
	 * @return the new warrior
	 */
	public static Warrior buildWarrior() {
		myScan = new Scanner(System.in);
		Warrior myWarrior = new Warrior();
		
		System.out.println("Name your warrior");		
		myWarrior.setName(myScan.nextLine());		//set warrior name
		
		boolean isValid = false;			//set attack and defense levels
		while (!isValid) {
			System.out.println("Set the attackLevel to an integer between 1 and 50 \n" +
					"Your defenseLevel will be (50 - attackLevel)");
			int myInput = myScan.nextInt();

			if (myInput > MIN && myInput < MAX_ATK) {
				myWarrior.setAttackLevel(myInput);
				myWarrior.setDefenseLevel(MAX_ATK - myInput);
				isValid = true;
			} 
		}
		
		isValid = false;
		while (!isValid) {
			System.out.println("Set your speed to an integer between 1 and 100 \n" +
							"Your healthPoints will be (100 - speed)");
			int myInput = myScan.nextInt();
			
			if (myInput > MIN && myInput < MAX_HEALTH_POINTS) {
				myWarrior.setSpeed(myInput);
				myWarrior.setHealthPoints(MAX_HEALTH_POINTS - myInput);
				isValid = true;
			}
		}
		
		return myWarrior;
	}
	
	public static void determineOrder() {
		
	}
	
	
	public static void determineWinner() {
		
	}
	public static void initializeWarrior() {
		
	}

}
