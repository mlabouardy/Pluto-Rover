package com.labouardy.app;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	private Character[][] grid;
	private int n;
	private int lastX;
	private int lastY;
	private List<Obstacle> obstacles;
	
	public Planet(int n){
		this.n=n;
		this.grid=new Character[n][n];
		this.lastX=-1;
		this.lastY=-1;
		this.obstacles=new ArrayList<Obstacle>();
	}
	
	public void addObstacle(Obstacle obstacle){
		obstacles.add(obstacle);
		int x=realX(obstacle.getX());
		int y=realY(obstacle.getY());
		grid[y][x]='O';
	}
	
	public boolean hasObstacle(int x, int y){
		for(Obstacle o:obstacles){
			if(o.isTheSame(x,y))
				return true;
		}
		return false;
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

	public void print() {
		for(int i=0;i<n;i++){
			System.out.print((n-1-i)+" |");
			for(int j=0;j<n;j++){
				System.out.print("\t "+(grid[i][j]==null?"":grid[i][j])+"\t|");
			}
			System.out.println("\n");
		}
		System.out.print("  ");
		for(int i=0;i<n;i++){
			System.out.print("\t "+i+" \t");
		}
	}

	public void update(int x, int y, Compass direction) {
		if(lastX!=-1 && lastY!=-1){
			grid[lastX][lastY]=' ';
		}
		int tmpX=realX(x);
		int tmpY=realY(y);
		grid[tmpY][tmpX]=direction.getValue().charAt(0);
		lastX=tmpY;
		lastY=tmpX;
	}
}
