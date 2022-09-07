package frame;

import java.awt.Color;
import java.awt.Dimension;

public class Activity extends ActivityAbs implements ActivityImp{
	
	private static final long serialVersionUID = 1L;

	public Activity(Screen screen) {
		this.screen = screen;
		this.myActivity();
		this.init();
	}

	@Override
	public void myActivity() {
		this.screenWidth = 500;		
		this.screenHeight = 500;
	}
	
	@Override
	public void init() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255,0,0));
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}