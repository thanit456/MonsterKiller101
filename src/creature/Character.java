package creature;

public abstract class Character {
	protected int health;
	protected int attackPower;
	protected int speed;
	protected double x,y;
	protected String faceDirection;
	public Character(){
		this.health = 10;
		this.speed  = 1;
		this.attackPower = 1;
		this.x = 1;
		this.y = 1;
		this.faceDirection = "south";
	}
	public Character(int health,int attackPower,int speed){
		this.health = health;
		this.speed = speed;
		this.attackPower = attackPower;
		this.x = 1;
		this.y = 1;
		this.faceDirection = "south";
	}
	public abstract void takingDamage(Character obj);
	void takenDamage(Object obj) {
		// add more details
		if(this.health < ((Character) obj).getAttackPower()) {
			this.setHealth(0);
		} else {
			this.setHealth(this.getHealth()-((Character) obj).getAttackPower());
		}
		
	}
	boolean isDied() {
		if(this.health == 0) 
			return true;
		return false;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getFaceDirection() {
		return faceDirection;
	}
	public void setFaceDirection(String faceDirection) {
		this.faceDirection = faceDirection;
	}
	
	
}
