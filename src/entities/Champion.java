package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public void takeDamage(Champion champion) {
		int damage = champion.getAttack() - armor;
		if (damage < 0) {
			damage = 1;
		}		
		life -= damage;
		if (life < 0) {
			life = 0;
		}
		setLife(life);
	}

	public String status() {
		if (life > 0) {
			return name + ": " + life + " de vida";
		} else {
			return name + ": " + life + " de vida (morreu)";
		}
	}

}
