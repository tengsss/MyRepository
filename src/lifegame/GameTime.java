package lifegame;

import java.awt.event.*;

import javax.swing.*;

public class GameTime extends JPanel {

	private static final long serialVersionUID = 1L;
	Timer timer;
	GameMap gm;
	private  int DELAY_TIME = 1000;
/*	private final int TIME2 = 1000;
	private final int TIME1 = 1;
	private final int TIME3 = 3000;

	void faster() {
		DELAY_TIME=TIME1;
	}
	void mider() {
		DELAY_TIME=TIME2;
	}
	void slower() {
		DELAY_TIME=TIME3;
	}*/
	public void setfaster() {
		timer.stop();
		DELAY_TIME=300;
		timer = new Timer(DELAY_TIME, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gm.changeMap();
				repaint();
			}
		});
		timer.start();
	}
	
	public void setmider() {
		timer.stop();
		DELAY_TIME=1000;
		timer = new Timer(DELAY_TIME, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gm.changeMap();
				repaint();
			}
		});
		timer.start();
	}
	
	public void setslower() {
		timer.stop();
		DELAY_TIME=2000;
		timer = new Timer(DELAY_TIME, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gm.changeMap();
				repaint();
			}
		});
		timer.start();
	}
	
	GameTime(GameMap gmtemp) {
		gm = gmtemp;
		timer = new Timer(DELAY_TIME, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gm.changeMap();
				repaint();
			}
		});
		timer.start();
	}


}
