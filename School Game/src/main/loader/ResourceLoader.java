package main.loader;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import main.Game;

public class ResourceLoader {

	final String RESOURCEPATH = "..\\School Game\\res";

	BufferedImage im;
	File resCount;
	public ResourceLoader(){
	/*
	FileWriter fileWriter = null;
	try {
		fileWriter = new FileWriter(RESOURCEPATH + "Test.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	
	try {
		fileWriter.write("Testing 1,2,3 + more");
		System.out.println("I wrote.");
		//fileWriter.append("Testing 1,2,3 + more");
		
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	}
	
	public void mapLoaderTxt(String nam, Game ga){
		
		String str; 
		
		//schematic.
		
		
		//str = schematic.read();
	
		try {
			str = new String(Files.readAllBytes(Paths.get(RESOURCEPATH + nam)));
			//ma.setMapStrArray(str);
			
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//str = str + "\n";
		
		//ma.setMapStrArray(str);
		
		//System.out.println(str);
		//schematic.close();
	}
	
	//public int 
	
	public void getFileCount(){
		
	}
	
	public int getFileCount(String fileExt){
		
		resCount = new File(RESOURCEPATH);
		//FileFilter fl = new FileFilter();
		
		String[] str;
		str = resCount.list();
		int count = 0;
		
		for(int i = 0; i < str.length; i++)
		//System.out.println(str[i]);
		
		for(int i2 = 0; i2 < str.length; i2++){
		
			if(str[i2].contains(fileExt))
				count++;
			//"count " +resCount.listFiles());
		}
		return count;
	}
	
	
	//loads all specific files images into a game array
	public void FileLoadToStringArry(String ext, String[] arry){
		
		String[] str;
		str = resCount.list();
		String str2 = null;
		try{	
			for(int i2 = 0; i2 < str.length; i2++){
				System.out.println("Found " + str[i2]);
			if(str[i2].contains(ext)){
				System.out.println("Contains " + str[i2]);
				str2 = new String(Files.readAllBytes(Paths.get(RESOURCEPATH + "\\"+ str[i2])));
				System.out.println(str[i2]);
				arry[i2] = str2;
				}
			}
		
		
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	//loads specific images into the game's image array
	public void ImageLoad(String nam, Game ga){
		
		//String[] str;
		//str = resCount.list();
		im = null;
		try{	
		
		im = ImageIO.read(new File(RESOURCEPATH + nam));
		ga.getImageArry()[ga.getImageArry().length - 1] = im;
		
		
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	public void ImageLoadAll(Game ga){
	String[] str;
	str = resCount.list();
	im = null;
	try{	
	for(int i2 = 0; i2 < str.length; i2++){
			
	if(str[i2].contains(".png")){
	im = ImageIO.read(new File(RESOURCEPATH + "\\"+ str[i2]));
	//System.out.println(i2);
	ga.getImageArry()[i2] = im;
	}
	}
	}
	catch(IOException e){
		System.out.println(e);
	}
}
}
