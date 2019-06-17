

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
        this.setTitle("������Ϸ[LifeGame]DEMO"); 
       // this.add(new GameMap());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
		
		JMenuBar bar=new JMenuBar();
		this.setJMenuBar(bar);
		JMenu a,b,c;
		a=new JMenu("ѡ��");
		b=new JMenu("�ٶȵ���");
		c=new JMenu("����");
		bar.add(a);
		bar.add(b);
		bar.add(c);
		JMenuItem random,xin,zheng,help,timec,fast,mid,slow;
		random=new JMenuItem("���");
		xin=new JMenuItem("����");
		zheng=new JMenuItem("�ı���");
		help=new JMenuItem("����");
		timec=new JMenuItem("�ٶȵ���");
		fast=new JMenuItem("��");
		mid=new JMenuItem("��");
		slow=new JMenuItem("��");
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
    if(e.getActionCommand() == "���") {   
    	this.setSize(554,600);  
        this.setTitle("������Ϸ[LifeGame]DEMO"); 
        p2=new GameMap();
        this.add(p2); 
        p2.GameMap1();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "����") {   
    	this.setSize(550,580);  
        this.setTitle("������Ϸ[LifeGame]DEMO"); 
        p2=new GameMap();
        this.add(p2);  
        p2.GameMap2();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "�ı���") {   
    	this.setSize(550,580);  
        this.setTitle("������Ϸ[LifeGame]DEMO"); 
        p2=new GameMap();
        this.add(p2);  
        p2.GameMap3();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "��") {   
    	   
         p2.faster();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         this.setLocationRelativeTo(null);     
    }  
    
    if(e.getActionCommand() == "��") {   
 	   
        p2.mider();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
   }  
    
    if(e.getActionCommand() == "��") {   
 	   
        p2.slower();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);     
   }  
    
    if(e.getActionCommand() == "����") {   
    	JOptionPane.showInternalMessageDialog(null, "�����ˣ�����ѧ����ɺ","����", JOptionPane.INFORMATION_MESSAGE);
    }  
   
}
}


