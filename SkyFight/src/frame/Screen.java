package frame;

import input.MouseState;

public class Screen extends ScreenAbs implements ScreenImp{
	
	private static final long serialVersionUID = 1L;

	public Screen() {
		this.init();
	}

	@Override
	public void init() {
		this.xMouse = -1;
		this.yMouse = -1;
		this.mouseState = MouseState.RELEASED;
	}

}
