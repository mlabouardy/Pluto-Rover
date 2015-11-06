package com.labouardy.app;

public class Planet {
	private Character[][] grid;
	private int n;
	
	public Planet(int n){
		this.n=n;
		this.grid=new Character[n][n];
	}
	
	public int getSize(){
		return n;
	}
}
