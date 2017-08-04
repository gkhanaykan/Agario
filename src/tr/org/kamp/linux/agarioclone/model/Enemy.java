package tr.org.kamp.linux.agarioclone.model;

import java.awt.Color;

/**
 * 
 * @author gkhan
 * @version 1.0
 */

public class Enemy extends GameObject {

	
private int speed;
	
	public Enemy(int x, int y, int radius, int speed, Color color) {
		super(x, y, radius, color);
		this.speed = speed;
	}
	/**
	 * sets param betwen 5-250
	 */
	
	@Override
	public void setRadius(int radius) {
		// TODO Auto-generated method stub
		super.setRadius(radius);
		if(getRadius() < 5) {
			setRadius(5);
		} else if( getRadius() > 250 ) {
			setRadius(250);
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
