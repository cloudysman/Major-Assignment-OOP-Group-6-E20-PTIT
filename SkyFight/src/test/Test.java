package test;

import javax.swing.*;

import frame.Activity;
import frame.Screen;
import input.MouseState;
import input.MyMouseListener;

public class Test extends Screen{

	MyMouseListener myMouseListener;
	
	Activity panel;
	
	public Test() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		panel = new Activity(this);
		panel.init();
		
		myMouseListener = new MyMouseListener(this);
		
		this.add(panel);
		this.addMouseListener(myMouseListener);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public void run() {
		while(true) {
			if(mouseState == MouseState.LEFTPRESSED) {
				System.out.println(mouseState + " " + xMouse + " " + yMouse);
				System.out.println(this.panel.getScreen());
				break;
			}else {
				System.out.println('0');
			}
		}
	}
	
	public static void main(String args[]) {
		Test test = new Test();
		test.run();
	}
}
