package day03;

public class WarShip extends Weapon {
	public void attack() {
		System.out.println("战船在攻击");

	}

	public void move() {
		System.out.println("战船在移动");

	}

	public static void main(String[] args) {
		WarShip zuoye = new WarShip();
		zuoye.attack();
		zuoye.move();

	}

}