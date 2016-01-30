package graphics.renderer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class SystemLog {

	public ArrayList<String> systemLog;
	
	public SystemLog(){
		systemLog = new ArrayList<String>();
	}
	
	int colorCounter = 255;
	
	public void add(String s){
		
		colorCounter = 255;
		
		systemLog.add(s);
		if(systemLog.size() > 54){
			systemLog.remove(0);
			systemLog.trimToSize();
		}
		
	}
	
	public void render(Graphics g){
		for(int x = 0; x < systemLog.size(); x++){
			g.setColor(new Color(254, 254, 254, colorCounter));
			g.drawString(systemLog.get(x), 0, 12*(x+1));
		}
		
	}
	
	public void update(){
		
		if(colorCounter - 20 < 0)
		colorCounter = 0;
		
		if (colorCounter > 0){
		colorCounter = colorCounter - 20;
		}
		
	}
	
	public int getSize(){
		return systemLog.size();
	}
	
}
