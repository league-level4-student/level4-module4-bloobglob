package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;

public class MousePolymorph extends Polymorph{
	private int width = 50;
	private int height = 50;
	MousePolymorph(int x, int y) {
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
		g.setColor(Color.cyan);
		g.fillRect(p.x - width/2, p.y - height*3/2, width, height);
	}
	
}


