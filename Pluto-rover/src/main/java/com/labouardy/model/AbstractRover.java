package com.labouardy.model;

import com.labouardy.app.Compass;

abstract public class AbstractRover implements Rover{
	protected int x;
	protected int y;
	protected Compass direction;
	
	public AbstractRover(int x, int y, Compass direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void left() {
		if(direction.compareTo(Compass.E)==0){
			direction=Compass.N;
		}else if(direction.compareTo(Compass.W)==0){
			direction=Compass.S;
		}else if(direction.compareTo(Compass.N)==0){
			direction=Compass.W;
		}else if(direction.compareTo(Compass.S)==0){
			direction=Compass.E;
		}
	}

	public void right() {
		if(direction.compareTo(Compass.E)==0){
			direction=Compass.S;
		}else if(direction.compareTo(Compass.W)==0){
			direction=Compass.N;	
		}else if(direction.compareTo(Compass.N)==0){
			direction=Compass.E;
		}else if(direction.compareTo(Compass.S)==0){
			direction=Compass.W;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Compass getDirection() {
		return direction;
	}

}
