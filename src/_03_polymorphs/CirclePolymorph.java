package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{
	private int width = 50;
	private int height = 50;
	double counter = 0;
	CirclePolymorph(int x, int y) {
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
		counter += 0.25;
		g.setColor(Color.green);
		g.fillRect((int) (getX() + Math.sin(counter) * 50), (int) (getY() + Math.cos(counter) * 50), width, height);
	}
}
