package com.labouardy.app;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	private Character[][] grid;
	private int n;
	private List<Obstacle> obstacles;
	
	public Planet(int n){
		this.n=n;
		this.grid=new Character[n][n];
		this.obstacles=new ArrayList<Obstacle>();
	}
	
	public void addObstacle(Obstacle obstacle){
		obstacles.add(obstacle);
		int x=realX(obstacle.getX());
		int y=realY(obstacle.getY());
		grid[y][x]='O';
	}
	
	public int getSize(){
		return n;
	}
	
	public int realX(int x){
		return x;
	}
	
	public int realY(int y){
		return n-1-y;
	}
}
