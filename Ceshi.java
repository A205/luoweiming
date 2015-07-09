package day03;
import com.luo.damen.four.*;

public class Ceshi {
	public static void main(String[] args) {
		Army zuoye = new Army(5);// 定义一只军队，武器上限为6
		Weapon tank = new Tank();
		Weapon flight = new Flight();
		Weapon warship = new WarShip();
		// 定义三种武器。
		zuoye.addWeapon(tank);
		zuoye.addWeapon(flight);
		zuoye.addWeapon(warship);
		zuoye.moveAll();
		zuoye.attackAll();
		
	}

}