package com.base;

//玩家战斗不变的基础属性独立出来的超类，可复用
public class Character {

	//玩家的共有的属性
	private String name;
	private int age;
	
	protected Weapon w;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	//可以动态的改变武器
	public void setWeapon(Weapon wt){
		this.w = wt;
	}
	
	//玩家都是使用武器战斗，但不同玩家拥有不同的武器
	public void fight(){
		w.useWeaponFight();
	}
	
}
