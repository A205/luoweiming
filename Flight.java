package day03;

public class Flight extends Weapon {
	public void attack() {
System.out.println("ս���ڹ���");
	}

	public void move() {
System.out.println("ս�����ƶ�");
	}

	public static void main(String[] args) {
		Flight zuoye = new Flight();
zuoye.attack();
zuoye.move();
	}

}s