package frame;

import javax.swing.JFrame;

import input.MouseState;

public class Screen extends JFrame implements ScreenImp{
	
	protected int xMouse;
	protected int yMouse;
	
	protected MouseState mouseState;
	
	public Screen() {
		this.init();
	}

	@Override
	public void init() {
		this.xMouse = -1;
		this.yMouse = -1;
		this.mouseState = MouseState.RELEASED;
	}

	@Override
	public int getXMouse() {
		return xMouse;
	}

	@Override
	public int getYMouse() {
		return yMouse;
	}

	@Override
	public void setMousePosition(int x, int y) {
		this.xMouse = x;
		this.yMouse = y;
	}

	@Override
	public void setIsPressedMouse(MouseState pressed) {
		this.mouseState = pressed;
	}

	@Override
	public MouseState getMouseState() {
		return mouseState;
	}
}
