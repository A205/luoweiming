package day03;
import com.luo.damen.four.*;

public class Ceshi {
	public static void main(String[] args) {
		Army zuoye = new Army(5);// ����һֻ���ӣ���������Ϊ6
		Weapon tank = new Tank();
		Weapon flight = new Flight();
		Weapon warship = new WarShip();
		// ��������������
		zuoye.addWeapon(tank);
		zuoye.addWeapon(flight);
		zuoye.addWeapon(warship);
		zuoye.moveAll();
		zuoye.attackAll();
		
	}

}