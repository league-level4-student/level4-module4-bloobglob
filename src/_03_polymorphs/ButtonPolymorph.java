package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JOptionPane;

public class ButtonPolymorph extends Polymorph{
	private int width = 50;
	private int height = 50;
	ButtonPolymorph(int x, int y) {
		super(x, y);
	}
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		if(width < 1) {
			this.width = 1;
		}else {
			this.width = width;
		}
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		if(height < 1) {
			this.height = 1;
		}else {
			this.height = height;
		}
	}
	@Override
	public void draw(Graphics g) {
		Point p = MouseInfo.getPointerInfo().getLocation();
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), width, height);
	}
	
}

