
import player.*;

public class StartFight {
	public static void main(String[] args){
		StrongPlayer sp = new StrongPlayer();
		sp.fight();
		
		WeakPlayer wp = new WeakPlayer();
		wp.fight();
		
		//切换武器
		sp.setWeapon(new WeakWeapon());
		sp.fight();
		
		//切换强力的武器
		wp.setWeapon(new StrongWeapon());
		wp.fight();
	}
}
