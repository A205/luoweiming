package day03;

public class WarShip extends Weapon {
	public void attack() {
		System.out.println("ս���ڹ���");

	}

	public void move() {
		System.out.println("ս�����ƶ�");

	}

	public static void main(String[] args) {
		WarShip zuoye = new WarShip();
		zuoye.attack();
		zuoye.move();

	}

}