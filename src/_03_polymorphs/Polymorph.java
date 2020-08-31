package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    int getX() {
    	return x;
    }
    void setX(int x) {
    	if(x < 0) {
    		this.x = 0;
    	}else if(x > PolymorphWindow.WIDTH) {
    		this.x = PolymorphWindow.WIDTH;
    	}else {
    		this.x = x;
    	}
    }
    int getY() {
    	return y;
    }
    void setY(int y) {
    	if(y < 0) {
    		this.y = 0;
    	}else if(y > PolymorphWindow.HEIGHT) {
    		this.y = PolymorphWindow.HEIGHT;
    	}else {
    		this.y = y;
    	}
    }
    public abstract void draw(Graphics g);
}
