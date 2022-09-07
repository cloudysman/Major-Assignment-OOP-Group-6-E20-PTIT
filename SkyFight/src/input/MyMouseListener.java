package input;

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import test.Test;

public class MyMouseListener implements MouseListener{
	
	private Test myScreen;
	
	public MyMouseListener(Test myScreen) {
		this.myScreen = myScreen;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			//1. get position pressed mouse
			// pointerInfor - panel
			int xPressedMouse = MouseInfo.getPointerInfo().getLocation().x - myScreen.getContentPane().getLocationOnScreen().x;
			int yPressedMouse = MouseInfo.getPointerInfo().getLocation().y - myScreen.getContentPane().getLocationOnScreen().y;
			
			myScreen.setMousePosition(xPressedMouse, yPressedMouse);
			myScreen.setIsPressedMouse(MouseState.LEFTPRESSED);
			//2. set position to gameControl
			//debug
			// print position pressed mouse
//			System.out.println(xPressedMouse + " " + yPressedMouse);		
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		myScreen.setMousePosition(-1, -1);
		myScreen.setIsPressedMouse(MouseState.RELEASED);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		myScreen.setIsPressedMouse(MouseState.RELEASED);

	}

	@Override
	public void mouseExited(MouseEvent e) {
//		myScreen.setIsPressedMouse(MouseState.RELEASED);

	}

}
