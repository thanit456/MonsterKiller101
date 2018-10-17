package creature;

import java.util.ArrayList;

public class Player extends Character{
	protected int life;
	protected Weapon weapon;
	protected ArrayList<Weapon> weaponSlot;
	public Player() {
		this.weaponSlot = new ArrayList<Weapon>();
	}
}
