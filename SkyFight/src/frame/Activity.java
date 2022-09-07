package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Activity extends JPanel implements ActivityImp{
	
	int screenWidth;
	int screenHeight;
	
	private Screen screen;
	
	BufferedImage image;
	
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

	@Override
	public Screen getScreen() {
		return this.screen;
	}
}