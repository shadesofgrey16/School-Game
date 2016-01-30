package map.tile;

import java.awt.Graphics;
import java.awt.Image;

public class Tile extends BaseTile{

	public Tile(int re, int gr, int bl, int x, int y, Image im) {
		super(re, gr, bl, x, y, im);
		// TODO Auto-generated constructor stub
	}
	
	public Tile(Image im){
		super(im);
	}
	
	public Tile(Image im, int x, int y){
		super(im, x, y);
	}
	
	public Tile(){
		
	}
	
	public void draw(Graphics g, int xpos , int ypos, int dx, int dy){
		
		g.drawImage(getImage(), xpos*32+dx, ypos*32+dy, null);
		//g.draw
		
	}

}
