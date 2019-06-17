

package lifegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Main extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	GameMap p2;
	
	Main(){
		
		this.setSize(545,580); 
        this.setTitle("生命游戏[LifeGame]DEMO"); 
       // this.add(new GameMap());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
		
		JMenuBar bar=new JMenuBar();
		this.setJMenuBar(bar);
		JMenu a,b,c;
		a=new JMenu("选择");
		b=new JMenu("速度调节");
		c=new JMenu("帮助");
		bar.add(a);
		bar.add(b);
		bar.add(c);
		JMenuItem random,xin,zheng,help,timec,fast,mid,slow;
		random=new JMenuItem("随机");
		xin=new JMenuItem("心形");
		zheng=new JMenuItem("四边形");
		help=new JMenuItem("帮助");
		timec=new JMenuItem("速度调节");
		fast=new JMenuItem("快");
		mid=new JMenuItem("中");
		slow=new JMenuItem("慢");
		a.add(random);
		random.addActionListener(this);
		a.add(xin);
		xin.addActionListener(this);
		a.add(zheng);
		zheng.addActionListener(this);
	
		b.add(fast);
		fast.addActionListener(this);
		b.add(mid);
		mid.addActionListener(this);
		b.add(slow);
		slow.addActionListener(this);
		
		c.add(help);
		help.addActionListener(this);
		
		
	}

	public static void main(String[] args) {	 
		Main game = new Main(); 	 
	     game.setVisible(true);
	}



public void actionPerformed(ActionEvent e) {   
    if(e.getActionCommand() == "随机") {   
    	this.setSize(554,600);  
        this.setTitle("生命游戏[LifeGame]DEMO"); 
        p2=new GameMap();
        this.add(p2); 
        p2.GameMap1();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "心形") {   
    	this.setSize(550,580);  
        this.setTitle("生命游戏[LifeGame]DEMO"); 
        p2=new GameMap();
        this.add(p2);  
        p2.GameMap2();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "四边形") {   
    	this.setSize(550,580);  
        this.setTitle("生命游戏[LifeGame]DEMO"); 
        p2=new GameMap();
        this.add(p2);  
        p2.GameMap3();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "快") {   
    	   
         p2.faster();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "中") {   
 	   
        p2.mider();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
   }  
    
    if(e.getActionCommand() == "慢") {   
 	   
        p2.slower();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
   }  
    
    if(e.getActionCommand() == "帮助") {   
    	JOptionPane.showInternalMessageDialog(null, "制作人：吴泽学、滕珊","帮助", JOptionPane.INFORMATION_MESSAGE);
    }  
   
}
}


