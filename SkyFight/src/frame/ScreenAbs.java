package frame;

import javax.swing.JFrame;

import input.MouseState;

public abstract class ScreenAbs extends JFrame{
	protected int xMouse;
	protected int yMouse;
	
	protected MouseState mouseState;
	
	public int getXMouse() {
		return xMouse;
	}

	public int getYMouse() {
		return yMouse;
	}
	
	public void setMousePosition(int x, int y) {
		this.xMouse = x;
		this.yMouse = y;
	}

	public void setIsPressedMouse(MouseState pressed) {
		this.mouseState = pressed;
	}

	public MouseState getMouseState() {
		return mouseState;
	}
}
