
public class Warrior {
 
	private String name;
	private int healthPoints;
	private int attackLevel;
	private int defenseLevel;
	static int DEFENSE_DAMAGE = 5;
	
	public Warrior() {
		name = "";
		healthPoints = 100;
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
}
