package day03;

public class Army {

 Weapon[] w;
 int count=0;
 Army(int a){
	this.w=new Weapon[a];
}
    void addWeapon(Weapon wa){
    if(count<w.length-1){
    	w[count]=wa;
    	count++;
    	}
    	
    }	
    public void attackAll(){
		for (int i = 0; i < count; i++) {
			w[i].attack();
		}
	}public void moveAll(){
		for (int i = 0; i < count; i++) {
			w[i].move();
		}
	}
}

