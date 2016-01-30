package entity;

import java.awt.Color;
import java.awt.Graphics;

import item.Item;

public class EntityPlayer extends BaseEntity{

	String name;
	int dir;
	
	public EntityPlayer(){
		
	}
	
	public EntityPlayer(int x, int y, String nam){
		setxPos(x);
		setyPos(y);
		name = nam;
	}
	
	public void addToInventory(Item I){
		getInventory().add(I);
	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(new Color(0,0,0));
		g.fillOval(340, 340, 32, 32);
	}
	
	public void move(int i){
		dir = i;
		switch(dir){
		case 1:
			setxPos(getxPos()+1);
			break;
		case 2:
			setxPos(getxPos()-1);
			break;
		case 3:
			setyPos(getyPos()+1);
			break;
		case 4:
			setyPos(getyPos()-1);
			break;
		default:
			break;
			
		}
	}
	
}
