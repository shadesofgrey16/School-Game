package graphics;

import java.awt.Rectangle;

import javax.swing.JFrame;

import main.Game;
import main.controls.Controls;

public class Frame extends JFrame {

	//Not very important, randomly generated.
	//Used for serialization for example in HTTP protocols.
	//Mainly added to remove warnings
	private static final long serialVersionUID = -8841039461082864580L;
	
	Game g;
	int width, height;
	String title;
	public Controls controls;
	
	public Frame(Game ga)
	{	
		JFrame frame = new JFrame();
		frame.setSize(720, 720);
		frame.setTitle("School Game");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(new Panel(ga));
		g = ga;
		controls = new Controls(ga);
		frame.addKeyListener(controls);
		frame.setVisible(true);
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
		frame.setVisible(true);
	}
	
	public Game getGame(){
		return g;
	}
	
}
