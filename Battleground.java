import java.util.Scanner;

public class Battleground {

	static final int MAX_HEALTH_POINTS = 100;
	static final int MAX_NUM_ROUNDS = 10;
	static final int MAX_ATK = 50;
	static final int MAX_SPEED = 100;
	
	/** Minimum attack and defense level; */
	static final int MIN = 1;
	
	static final int MAX_DEF = 50;
	
	static Warrior firstWarrior;
	static Warrior secondWarrior;
	static Scanner myScan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubz
		
		// ask users to build their warriors
		System.out.println("Player 1, build your warrior.");
		firstWarrior = buildWarrior();
		
		System.out.println("Player 2, build your warrior.");
		secondWarrior = buildWarrior();
		
		// determine the order of the warriors
		int speed1 = firstWarrior.getSpeed();
		int speed2 = secondWarrior.getSpeed();
		if (speed1 < speed2) {			
			Warrior temp = firstWarrior;		//switch the two warriors
			firstWarrior = secondWarrior;
			secondWarrior = temp;
		}
		
		// start and play game
		boolean isWinner = false;
		for (int i = 0; i < MAX_NUM_ROUNDS && !isWinner; i++) {
			if (i % 2 == 0) {
				firstWarrior.attack(secondWarrior);
				if(determineWinner() != null) {
					isWinner = true;
					break;
				}
			}
			
			if (i % 2 == 1) {
				secondWarrior.attack(firstWarrior);
				if(determineWinner() != null) {
					isWinner = true;
					break;
				}
			}
			
		}
		
		// determine winner
		if (determineWinner() != null) {
			System.out.println("The winner is " + determineWinner().getName());
		} else {
			System.out.println("It's a tie. There is no winner.");
		}
		
	
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
	
	/**
	 * Determines the winner of the game.
	 * @return the winner of the game, or null if the game isn't over. 
	 */
	public static Warrior determineWinner() {
		if (firstWarrior.getHealthPoints() < 0) {
			return firstWarrior;
		}
		if (secondWarrior.getHealthPoints() < 0) {
			return secondWarrior;
		}
		return null;		
	}

}
