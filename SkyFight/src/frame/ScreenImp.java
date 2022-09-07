package frame;

import input.MouseState;

public interface ScreenImp {
	
	void init();
	
	int getXMouse();
	
	int getYMouse();
	
	void setMousePosition(int x, int y);
	
	void setIsPressedMouse(MouseState pressed);
	
	MouseState getMouseState();
}
