package main;

import java.awt.Graphics;
import java.awt.Image;

import entity.EntityPlayer;
import graphics.Frame;
import graphics.renderer.SystemLog;
import main.loader.ResourceLoader;
import map.Map;

public class Game implements Runnable {

	boolean running = false;
	boolean DEBUG = true;
	Thread GT;
	Image[] imageArry;
	String[] mapSchematicArry;
	ResourceLoader rl = new ResourceLoader();
	public SystemLog sl;
	private Map currentMap;
	EntityPlayer player1;
	Frame frame;
	
	
	public Frame getFrame() {
		return frame;
	}

	Game(){
		GT = new Thread();
		init();
		run();
	}
	
	@Override
	public void run() {
		
		System.out.println("Game has started.");
		
		sl.add("the game has been running for " + counter++);
		
		//int count = 0;
		
		while(running){
		
			if(paused == false){
			update();
			}
			
			//System.out.println(sl.getSize());
			
			tick();
		}
		
	}
	boolean paused = false;
	
	public void pause(){
		paused = true;
		System.out.println("Thread paused");
	}
	
	public void restart(){
		paused = false;
		System.out.println("Thread restarted");
	}
	
	public void init(){
		GT.start();
		imageArry = new Image[rl.getFileCount(".png")];
		mapSchematicArry = new String[rl.getFileCount(".map")];
		rl.FileLoadToStringArry(".map", mapSchematicArry);
		
		System.out.println("length = " + imageArry.length);
		
		rl.ImageLoadAll(this);
		running = true;
		sl = new SystemLog();
		frame = new Frame(this);
		player1 = new EntityPlayer();
	
		int[] imageArray = {0};
		currentMap = new Map(imageArray,this,mapSchematicArry[1]);
		currentMap.addPlayer(player1);	
	
	}
	
	
	
	public String[] getMapSchematicArry() {
		return mapSchematicArry;
	}

	public Image[] getImageArry() {
		return imageArry;
	}

	public void setImageArry(Image[] imageArry) {
		this.imageArry = imageArry;
	}

	public EntityPlayer getPlayer1() {
		return player1;
	}

	public void setPlayer1(EntityPlayer player1) {
		this.player1 = player1;
	}

	public Map getCurrentMap() {
		return currentMap;
	}

	public void setCurrentMap(Map currentMap) {
		this.currentMap = currentMap;
	}
	int counter = 0;
	public void update(){
		sl.update();
	}
	
	public void render(Graphics g){
		currentMap.drawMap(g);
		sl.render(g);
	}
	
	public void tick(){
		try {
			Thread.sleep(1000);
			System.out.println("Thread is sleeping.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Main {

	public static void main(String args[]){
		
		System.out.println("Beginning game.");
		//Game g = 
		new Game();
		
	}
	
}


