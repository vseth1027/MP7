
public class Wizard extends Warrior {
	
	public String specialMove;

	public Wizard() {
		super();
		specialMove = "absorption";
	}
	
	/**
	 * Wizard special move absorbs opponent's health points from the normal attack. 
	 * @param opponent fighting against
	 * @return whether the attack was successful
	 */
	public boolean specialMoveAttack(final Warrior opponent) {
		if (opponent.defenseLevel > this.attackLevel) {
			opponent.defenseLevel -= DEFENSE_DAMAGE;
			return false;
		}
		
		opponent.healthPoints -= this.attackLevel - opponent.defenseLevel;
		
		this.setHealthPoints(this.healthPoints + (this.attackLevel - opponent.defenseLevel));
		
		return true; 		
	}

}
