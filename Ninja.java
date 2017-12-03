
public class Ninja extends Warrior {

	public String specialMove;
	
	public Ninja() {
		super();
		specialMove = "Shuriken Onslaught";
	}
	
	/**
	 * Ninja special move ignores defenseLevel and decreases opponent's healthPoints
	 * by full attackLevel.
	 * @param opponent fighting against
	 * @return whether the attack was successful
	 */
	public boolean specialMoveAttack(final Warrior opponent) {
		opponent.healthPoints -= this.attackLevel;
		return true;	
	}

}
