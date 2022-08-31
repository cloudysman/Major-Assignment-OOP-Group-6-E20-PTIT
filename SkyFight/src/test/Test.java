package test;

import java.awt.Dimension;

import javax.swing.*;

import frame.Frame;
import frame.Screen;
import input.MouseState;
import input.MyMouseListener;

public class Test extends Frame{
	int xMouse;
	int yMouse;
	
	MouseState myMouseState = MouseState.RELEASED;
	MyMouseListener myMouseListener;
	
	Screen panel;
	
	public Test() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new Screen(this);
		panel.init();
		
		myMouseListener = new MyMouseListener(this);
		
		this.add(panel);
		this.addMouseListener(myMouseListener);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	void initGame() {
		xMouse = -1;
		yMouse = -1;
	}
	
	public void setPositionMouse(int x, int y) {
		this.xMouse = x;
		this.yMouse = y;
	}
	
	public void setIsPressedMouse(MouseState pressed) {
		this.myMouseState = pressed;
	}
	
	public void run() {
		while(true) {
			if(myMouseState != MouseState.LEFTPRESSED) {
				System.out.println(myMouseState + " " + xMouse + " " + yMouse);
			}
			else
				break;
		}
	}
	
	public static void main(String args[]) {
		Test test = new Test();
		test.initGame();
		test.run();
	}
}
