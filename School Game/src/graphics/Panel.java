package graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import main.Game;

public class Panel extends JPanel {

	//Not very important, randomly generated.
	//Used for serialization for example in HTTP protocols.
	//Mainly added to remove warnings
	private static final long serialVersionUID = 2889050780342151571L;
	
	private Game ga;
	//private Frame f;
	public Panel(Game g){
	
		ga = g;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	
		ga.render(g);
		//g.setColor(new Color(255,255,255,70));
		//g.fillRect(0, 0, 720, 720);
		
		repaint();
	}
	
	public void drawEntities(Graphics g){
		//int dx, dy;
		//dx = -ga.getCurrentMap().getEntityList().get(0).getxPos()-32;
		//dy = -ga.getCurrentMap().getEntityList().get(0).getyPos()-32;
				
		for(int i = 0; i < ga.getCurrentMap().getEntityList().size(); i++){
		if(i == 0)
		g.setColor(new Color(0,0,0));
		
		}
	}
}
	

