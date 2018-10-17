package creature;

import java.util.ArrayList;

import stuff.Weapon;

public class Player extends Character{
	protected int life;
	protected Weapon currentWeapon;
	protected ArrayList<Weapon> weaponSlot;
	protected int score;
	public Player() {
		super();
		this.weaponSlot = new ArrayList<Weapon>();
		(this.weaponSlot).addWeaponSlot(new Weapon());
		this.currentWeapon = new Weapon();
		this.life = 1;
		this.score = 0;
	}
	public Player(int life) {
		this.weaponSlot = new ArrayList<Weapon>();
		(this.weaponSlot).addWeaponSlot(new Weapon());
		this.currentWeapon = new Weapon();
		this.life = life;
		this.score = 0;
	}
	public Player(int life,Weapon currentWeapon) {
		this.weaponSlot = new ArrayList<Weapon>();
		(this.weaponSlot).addWeaponSlot(currentWeapon);
		this.currentWeapon = currentWeapon;
		this.life = life;
		this.score = 0;
	}
	
	
	public void lootItem(Item item) {
		// check what item is and use it
	}
	@Override
	public void takingDamage(Character obj) {
		// attack to obj		
	}
	public void addWeaponSlot(Weapon weapon) {
		(this.weaponSlot).add(weapon);
	}
	
	
	
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public Weapon getCurrentWeapon() {
		return currentWeapon;
	}
	public void setCurrentWeapon(Weapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}
	public ArrayList<Weapon> getWeaponSlot() {
		return weaponSlot;
	}
	public void setWeaponSlot(ArrayList<Weapon> weaponSlot) {
		this.weaponSlot = weaponSlot;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
