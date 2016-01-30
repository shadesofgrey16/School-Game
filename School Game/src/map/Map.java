package map;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import main.Game;
import map.tile.BaseTile;
import map.tile.ColoredTile;
import map.tile.Tile;
import entity.BaseEntity;
import entity.EntityPlayer;

public class Map {

	int xSize, ySize;
	int xCount = 0;
	int yCount = 0;
	String name;
	public String mapStr;
	Image[] im;
	Tile ti;
	Random rand = new Random();
	ArrayList<BaseEntity> entityList = new ArrayList<BaseEntity>();
	BaseTile[][] mapTiles;
	
	public String getMapStrArray() {
		return mapStr;
	}

	public void setMapStrArray(String mapStrArray) {
		this.mapStr = mapStrArray;
	}
	
	public Map(int[] tilID, Game ga, String scheme){

		mapStr = scheme;
		/*
		 * tilID is the tiles required to make this map
		 * ga is the game
		 * this then creates a new image array for the images required to
		 * compose this map.
		 * It then runs through the Map's required tile array 
		 * and sets the correct images
		 * into the map's image array from the game's image array.
		 */
		im = new Image[tilID.length];
		for(int i = 0; i < tilID.length; i++){
			
			im[i] = ga.getImageArry()[tilID[i]];
			
		}
		
		fixMapSchematic();
		generateMapSchematic();
		
	}
	
	public void fixMapSchematic(){
		
		String fix = "";
		
		fix.trim();
		for (int i =0; i < mapStr.length()-1; i++){

			if(mapStr.charAt(i) == '\r'){

			}else{

				fix = fix + mapStr.charAt(i);
			}
			
		}
		

		mapStr = fix;
		mapStr.trim();
		mapStr = mapStr + 'x';
		mapStr = mapStr + '\n';
	}
	
	public void generateMapSchematic(){
		
		
		boolean done = false;
		
		for (int i =0; i < mapStr.length(); i++){
		
			if(mapStr.charAt(i) == '\n'){
				yCount++;
				done = true;
			}else{
				if(done != true)
				xCount++;
			}
			
		}		
		
		setySize(yCount);
		setxSize(xCount);
		System.out.println("xSize = " + getxSize());
		System.out.println("ySize = " + getySize());
		
		
		mapTiles = new BaseTile[xSize][ySize];
		xCount = 0;
		yCount =0;

		for (int i =0; i < mapStr.length(); i++){
			System.out.print(mapStr.charAt(i));
			if(mapStr.charAt(i) == '\n'){// || mapStr.charAt(i) != '\0' ){
		
				if(yCount <= ySize-1){
				mapTiles[xCount][yCount] = new Tile(im[0],xCount,yCount);
				System.out.println("Generate at : " + xCount + " And " + yCount);
				yCount++;
				xCount =0;
				}
				
			}else{
		
				if(xCount < getxSize()-1){
				mapTiles[xCount][yCount] = new  ColoredTile(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255),xCount,yCount);
				xCount++;
				}
		
			}
			
		}
		
		
	}
	
	public Map(int x, int y, String name){
		setxSize(x);
		setySize(y);
		setName(name);
		mapTiles = new BaseTile[getxSize()][getySize()];
		mapGenerate();
	}
	
	public Map(int x, int y, Tile t,String name){
		setxSize(x);
		setySize(y);
		setName(name);
		mapTiles = new BaseTile[getxSize()][getySize()];
		generateTiledMap(t);
	}
	
	public void mapGenerate(){
		mapTiles = new BaseTile[getxSize()][getySize()];
		for(int x1 = 0; x1 < getxSize(); x1++){
			for(int y1 = 0; y1 < getySize(); y1++){
				mapTiles[x1][y1] = new  ColoredTile(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255),x1,y1);
				
			}
		}
	}
	
	public void generateTiledMap(Tile ti){
		Tile til = ti;
		for(int x1 = 0; x1 < getxSize(); x1++){
			for(int y1 = 0; y1 < getySize(); y1++){
				til.setxPos(x1);
				til.setyPos(y1);
				mapTiles[x1][y1] = til; 
			}
		}
	}
	
	public void addPlayer(EntityPlayer player){
		entityList.add(0, player);
	}
	
	public void drawMap(Graphics g){
			int dx, dy;
			dx = -entityList.get(0).getxPos()+340;
			dy = -entityList.get(0).getyPos()+340;
			for(int x = 0; x < xSize; x++){
				for(int y = 0; y < ySize; y++){
					mapTiles[x][y].draw(g,  x , y, dx, dy );
				}
				}
			
			entityList.get(0).draw(g);
		}
	
	public void drawTiledMap(Graphics g){
		int dx, dy;
		dx = -entityList.get(0).getxPos()-32;
		dy = -entityList.get(0).getyPos()-32;
		for(int x = 0; x < getxSize()-1; x++){
			for(int y = 0; y < getySize()-1; y++){
				
				mapTiles[x][y].draw(g,  x , y, dx, dy );
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getxSize() {
		return xSize;
	}

	public void setxSize(int xSize) {
		this.xSize = xSize;
	}

	public int getySize() {
		return ySize;
	}

	public void setySize(int ySize) {
		this.ySize = ySize;
	}

	public ArrayList<BaseEntity> getEntityList() {
		return entityList;
	}

	public void setEntityList(ArrayList<BaseEntity> entityList) {
		this.entityList = entityList;
	}

	public BaseTile[][] getMapTiles() {
		return mapTiles;
	}

	public void setMapTiles(BaseTile[][] mapTiles) {
		this.mapTiles = mapTiles;
	}
	
}
