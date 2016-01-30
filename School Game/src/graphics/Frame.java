package graphics;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import main.controls.Controls;
import main.Game;

public class Frame extends JFrame {

	Game g;
	int width, height;
	String title;
	public Controls controls;
	
	public Frame(Game ga){
		
		JFrame frame = new JFrame();
		frame.setSize(720, 720);
		frame.setTitle("School Game");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(new Panel(ga));
		g = ga;
		controls = new Controls(ga);
		frame.addKeyListener(controls);
		frame.show();
		
	}
	
	public int getWidth() {
		Rectangle r = this.getBounds();
		return r.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		Rectangle r = this.getBounds();
		return r.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Frame(Game ga, int x, int y){
		
		JFrame frame = new JFrame();
		frame.setSize(width, height);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(new Panel(ga));
		g = ga;
		frame.show();
	}
	
	public Game getGame(){
		return g;
	}
	
}
