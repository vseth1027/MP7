
public class Warrior {
 
	private String name;
	private int healthPoints;
	private int attackLevel;
	private int defenseLevel;
	static int DEFENSE_DAMAGE = 5;
	
	public Warrior() {
		name = "";
		healthPoints = 0;
		attackLevel = 0;
		defenseLevel = 0;
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
