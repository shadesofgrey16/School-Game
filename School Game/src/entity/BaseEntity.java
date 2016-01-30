package entity;

import item.Item;

import java.awt.Graphics;
import java.util.ArrayList;

abstract public class BaseEntity {
	private int xPos,yPos,strength,defense,health,skill,intellegence,focus;
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getSkill() {
		return skill;
	}
	public void setSkill(int skill) {
		this.skill = skill;
	}
	public int getIntellegence() {
		return intellegence;
	}
	public void setIntellegence(int intellegence) {
		this.intellegence = intellegence;
	}
	public int getFocus() {
		return focus;
	}
	public void setFocus(int focus) {
		this.focus = focus;
	}
	public ArrayList<Item> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	ArrayList<Item> inventory = new ArrayList<Item>();
	
	public void draw(Graphics g){
		
	}
	
	public void update(){
		
	}
}
