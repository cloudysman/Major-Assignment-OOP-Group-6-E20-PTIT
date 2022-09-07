package test;

import java.awt.image.BufferedImage;

import figure.Cell;

public abstract class Object {
	int x;
	int y;
	
	int width;
	int height;
	
	Cell[] cells;
	
	BufferedImage image;
}
