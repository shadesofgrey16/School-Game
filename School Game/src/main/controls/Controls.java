package main.controls;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Game;

public class Controls implements KeyListener{

		Game game;
		
	public Controls(Game ga){
		game = ga;
	}
		
	@Override
	public void keyPressed(KeyEvent e) {
		  int keyCode = e.getKeyCode();
		if( keyCode == KeyEvent.VK_A){
			//game.entityArry.get(0).moveUP();
			//System.out.println("Pressing W");
			game.getPlayer1().move(2);
			game.sl.add("Pressed A");
			//game.sl.add(game.getPlayer1().getxPos() + "");
			
		}
		if( keyCode == KeyEvent.VK_B){
			//game.entityArry.get(0).moveLeft();
			//System.out.println("Pressing W");
			game.sl.add("Pressed B");
		}
		if( keyCode == KeyEvent.VK_C){
			//game.entityArry.get(0).moveRight();
			//System.out.println("Pressing W");
			game.sl.add("Pressed C");
		}
		if( keyCode == KeyEvent.VK_D){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.getPlayer1().move(1);
			game.sl.add("Pressed D");
		}
		
		if( keyCode == KeyEvent.VK_E){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed E");
		}
		if( keyCode == KeyEvent.VK_F){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed F");
		}
		if( keyCode == KeyEvent.VK_G){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed G");
		}
		if( keyCode == KeyEvent.VK_H){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed H");
		}
		if( keyCode == KeyEvent.VK_I){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed I");
		}
		if( keyCode == KeyEvent.VK_J){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed J");
		}
		if( keyCode == KeyEvent.VK_K){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed K");
		}
		if( keyCode == KeyEvent.VK_L){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed L");
		}
		if( keyCode == KeyEvent.VK_M){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed M");
		}
		if( keyCode == KeyEvent.VK_N){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed N");
		}
		if( keyCode == KeyEvent.VK_O){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed O");
		}
		if( keyCode == KeyEvent.VK_P){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed P");
		}
		if( keyCode == KeyEvent.VK_Q){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed Q");
		}
		if( keyCode == KeyEvent.VK_R){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed R");
		}
		if( keyCode == KeyEvent.VK_S){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.getPlayer1().move(3);
			game.sl.add("Pressed S");
		}
		if( keyCode == KeyEvent.VK_T){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed T");
		}
		if( keyCode == KeyEvent.VK_U){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed U");
		}
		if( keyCode == KeyEvent.VK_V){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed V");
		}
		if( keyCode == KeyEvent.VK_W){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.getPlayer1().move(4);
			game.sl.add("Pressed W");
		}
		if( keyCode == KeyEvent.VK_X){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed X");
		}
		if( keyCode == KeyEvent.VK_Y){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed Y");
		}
		if( keyCode == KeyEvent.VK_Z){
			//game.entityArry.get(0).moveDown();
			//System.out.println("Pressing W");
			game.sl.add("Pressed Z");
		}
		if( keyCode == KeyEvent.VK_BACK_SPACE){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Backspace pressed");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_SPACE){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Space pressed");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_0){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 0");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_1){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 1");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_2){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 2");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_3){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 3");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_4){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 4");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_5){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 5");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_6){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 6");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_7){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 7");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_8){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 8");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_9){
			//game.entityArry.get(0).moveDown();
			game.sl.add("Pressed 9");
			//System.out.println("Pressing W");
		}
		if( keyCode == KeyEvent.VK_ESCAPE){
			//game.entityArry.get(0).moveDown();
			
			
			game.sl.add("Pressed ESC");
			
			if(pressed == false){
				
				if(paused == false){
					game.pause();
					game.sl.add("game paused");
					paused = true;
				}else{
					game.restart();
					game.sl.add("game unpaused");
					paused = false;
				}
				pressed = false;
				
			}
			
		}
	}
	boolean pressed = false;
	boolean paused = false;


	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	}