
public class Warrior {
 
	private String name;
	private int healthPoints;
	private int attackLevel;
	private int defenseLevel;
	private int speed;
	static int DEFENSE_DAMAGE = 5;
	
	public Warrior() {
		name = "";
		healthPoints = 0;
		attackLevel = 0;
		defenseLevel = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getAttackLevel() {
		return attackLevel;
	}

	public void setAttackLevel(int attackLevel) {
		this.attackLevel = attackLevel;
	}

	public int getDefenseLevel() {
		return defenseLevel;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public void setDefenseLevel(int defenseLevel) {
		this.defenseLevel = defenseLevel;
	}

	public boolean attack(final Warrior opponent) {
		if (this.defenseLevel > opponent.attackLevel) {
			this.defenseLevel -= DEFENSE_DAMAGE;
			return false;
		}
		
		this.healthPoints -= opponent.attackLevel - this.defenseLevel;
		return true; 		
	}
	
	public String toString() {
		return "The name is " + name + "\nThe attackLevel is " + attackLevel +
				"\nThe defenseLevel is " + defenseLevel + "\nThe healthPoints are " 
				+ healthPoints + "\nThe speed is " + speed;
	}
}
