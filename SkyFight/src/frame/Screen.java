package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Screen extends JPanel implements ScreenImp{
	
	int screenWidth;
	int screenHeight;
	
	private Frame frame;
	
	BufferedImage image;
	
	public Screen(Frame frame) {
		this.frame = frame;
		this.myScreen();
		this.init();
	}

	@Override
	public void myScreen() {
		this.screenWidth = 500;		
		this.screenHeight = 500;
	}
	
	@Override
	public void init() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(new Color(255,0,0));
	}
}
