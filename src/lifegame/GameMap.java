package lifegame;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class GameMap extends JPanel{
	
	private static final long serialVersionUID = 1L;

	//初始化地图
	private final int width = 27;  
    private final int height = 27;
	private static final int [][]world1= {//20*20
			{0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},//
			{0,0,0, 0,0,0,1,1,0,0,0,0,1,1,0,0, 0,0,0,0},
			{0,0,0, 0,0,1,1,1,1,0,0,1,1,1,1,0, 0,0,0,0},
			{0,0,0, 0,1,1,0,0,1,1,1,1,0,0,1,1, 0,0,0,0},
			{0,0,0, 1,1,0,0,1,0,1,1,0,1,0,0,1, 1,0,0,0},
			{0,0,0, 1,1,0,1,1,1,0,0,1,1,1,0,1, 1,0,0,0},
			{0,0,0, 1,1,0,1,1,1,1,1,1,1,1,0,1, 1,0,0,0},
			{0,0,0, 1,1,0,1,1,1,1,1,1,1,1,0,1, 1,0,0,0},
			{0,0,0, 1,1,0,1,1,1,1,1,1,1,1,0,1, 1,0,0,0},
			{0,0,0, 0,1,1,0,1,1,1,1,1,1,0,1,1, 0,0,0,0},
			{0,0,0, 0,0,1,1,0,1,1,1,1,0,1,1,0, 0,0,0,0},
			{0,0,0, 0,0,0,1,1,0,1,1,0,1,1,0,0, 0,0,0,0},
			{1,0,0, 0,0,0,0,1,1,0,0,1,1,0,0,0, 0,0,0,1},
			{1,1,0, 0,0,0,0,0,1,1,1,1,0,0,0,0, 0,0,1,1},
			{1,1,1, 0,0,0,0,0,0,1,1,0,0,0,0,0, 0,1,1,1},//
			{1,1,1, 1,0,0,0,0,0,0,0,0,0,0,0,0, 1,1,1,1},
			{1,1,1, 1,1,0,0,0,0,0,0,0,0,0,0,1, 1,1,1,1},
			{1,1,1, 1,1,1,0,0,0,0,0,0,0,0,1,1, 1,1,1,1}
	};
    
	private static final int [][]world2= {//20*20
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},//
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},//
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0},
			{0,0,0,0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0}
	};
	
	
	
    public int [][]world=new int[20][20];
    
    void random() {
    	 for(int i=0,j=world.length;i<j;i++) {
    	    	for(int h=0,k=world[i].length;h<k;h++) {
    	    		world[i][h]=new Random().nextInt(2);
    	    	}
    	    }
    	
    }
    void xin() {
	   for(int i=0,j=world1.length;i<j;i++) {
	    	for(int h=0,k=world1[i].length;h<k;h++) {
	    		world[i][h]=world1[i][h];
	    	}
	    }
   }
    
    void zheng() {
 	   for(int i=0,j=world2.length;i<j;i++) {
 	    	for(int h=0,k=world2[i].length;h<k;h++) {
 	    		world[i][h]=world2[i][h];
 	    	}
 	    }
    }
	
	public int[][] nextStatus = new int[world.length][world[0].length];
	public int[][] tempStatus = new int[world.length][world[0].length];
	GameTime gt = new GameTime(this);
	void faster() {
		gt.setfaster();
	}
	
	void mider() {
		gt.setmider();
	}
	
	void slower() {
		gt.setslower();
	}
	
	//初始化
	void GameMap1() {
		random();
		copyMap(world,nextStatus);
		repaint();
		
	}

	void GameMap2() {
		xin();
		copyMap(world,nextStatus);
		repaint();
		
	}
	
	void GameMap3() {
		zheng();
		copyMap(world,nextStatus);
		repaint();
		
	}
	
	//每一步
	public void changeMap() {
		mapUpdate();
		repaint();
	}
	
	//调用GameLogic更新地图
	void mapUpdate() {
		copyMap(nextStatus,tempStatus);
		GameLogic gl = new GameLogic(tempStatus);
		copyMap(gl.getNext(),nextStatus);
	}
	
	
	
	//画地图
	protected void paintComponent(Graphics g) {  
	        super.paintComponent(g);  
	        for (int i = 0; i < nextStatus.length; i++) {  
	            for (int j = 0; j < nextStatus[i].length; j++) {  
	                if (nextStatus[i][j] == 1) {  
	                    g.fillRect( j * width, i * height, width, height);  
	                   
	                } else {  
	                	 g.drawRect( j * width, i * height, width, height); 
	                }  
	            }  
	        }  
	    }  
		
	//a->b
	private void copyMap(int[][] a ,int[][] b) {  
        for (int row = 0; row < b.length; row++) {  
            for (int col = 0; col < b[row].length; col++) {  
                b[row][col] = a[row][col]; 
            }  
       
    }  
}
}
