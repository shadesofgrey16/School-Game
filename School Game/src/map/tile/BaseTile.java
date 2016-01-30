package map.tile;

import java.awt.Graphics;
import java.awt.Image;

abstract public class BaseTile {

	private int xPos, yPos, r, g, b;
	Image image;
	
	public BaseTile(int re, int gr, int bl, int x , int y){
		r = re;
		g = gr;
		b = bl;
		xPos = x;
		yPos = y;
		image = null;
	}
	
	public BaseTile(Image im){
		image = im;
	}
	
	public BaseTile(Image im, int x, int y){
		image = im;
		xPos = x;
		yPos = y;
	}
	
	public BaseTile(){
		image = null;
	}
	
	public BaseTile(int re, int gr, int bl, int x , int y, Image im){
		r = re;
		g = gr;
		b = bl;
		xPos = x;
		yPos = y;
		image = im;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void draw(Graphics g, int x, int y){
		
	}
	

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

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

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public void draw(Graphics g, int xpos, int ypos, int dx, int dy) {
		// TODO Auto-generated method stub
		
	}
	
}
