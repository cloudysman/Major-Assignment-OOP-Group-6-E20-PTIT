package frame;

import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public abstract class ActivityAbs extends JPanel{

	private static final long serialVersionUID = 1L;
	
	int screenWidth;
	int screenHeight;
	
	Screen screen;
	
	BufferedImage image;
	
	public Screen getScreen() {
		return screen;
	}
	
	public int getScreenWidth() {
		return screenWidth;
	}
	
	public int getScreenHeight() {
		return screenHeight;
	}
}
