package com.labouardy.model;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;

public interface Rover {
	
	public void backward(Planet planet);
	public void forward(Planet planet);
	public void left();
	public void right();
	
	public int getX();
	public int getY();
	public Compass getDirection();
	
}
