package player;

import com.base.Character;

//产生一个玩家，玩家的武器初始化在构造器中
public class StrongPlayer extends Character{
	public StrongPlayer(){
		this.w = new StrongWeapon();
	}
}
