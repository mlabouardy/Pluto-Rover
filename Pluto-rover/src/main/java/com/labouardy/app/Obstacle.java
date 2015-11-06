package com.labouardy.app;

public class Obstacle {
	private int x;
	private int y;
	
	public Obstacle(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	public boolean isTheSame(int x2, int y2) {
		return x==x2 && y==y2;
	}
}
