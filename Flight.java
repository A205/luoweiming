package day03;

public class Flight extends Weapon {
	public void attack() {
System.out.println("战机在攻击");
	}

	public void move() {
System.out.println("战机在移动");
	}

	public static void main(String[] args) {
		Flight zuoye = new Flight();
zuoye.attack();
zuoye.move();
	}

}s