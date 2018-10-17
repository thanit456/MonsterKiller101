package stuff;

public class Weapon {
	protected int numberBullet;
	protected int attackDamage;
	protected int attackSpeed;
	protected int range;
	protected double space;
	public Weapon(){
		this.numberBullet = -5;
		this.attackDamage = 1;
		this.attackSpeed = 1;
		this.range = 1 ;
		this.space = 1;
	}
	public Weapon(int numberBullet,int attackDamage,int attackSpeed,int range,double space) {
		this.numberBullet = numberBullet;
		this.attackDamage = attackDamage;
		this.attackSpeed = attackSpeed;
		this.range = range ;
		this.space = space;
	}

	
	
	public boolean isUsedUp() {
		if(this.getNumberBullet() == 0) 
			return true;
		return false;
	}
	public int getNumberBullet() {
		return numberBullet;
	}
	public void setNumberBullet(int numberBullet) {
		this.numberBullet = numberBullet;
	}
	public int getAttackDamage() {
		return attackDamage;
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public int getRange() {
		return range;
	}
	public double getSpace() {
		return space;
	}
	
}
