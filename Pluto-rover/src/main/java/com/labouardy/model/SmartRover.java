package com.labouardy.model;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;

public class SmartRover extends AbstractRover{

	public SmartRover(int x, int y, Compass direction) {
		super(x, y, direction);
	}

	public void backward(Planet planet) {
		int size=planet.getSize();
		if(direction.compareTo(Compass.E)==0){
			if(x==0){
				x=size-1;
			}else{
				x--;
			}
		}else if(direction.compareTo(Compass.W)==0){
			if(x==size-1){
				x=0;
			}else{
				x++;
			}
		}else if(direction.compareTo(Compass.N)==0){
			if(y==0){
				y=size-1;
			}else{
				y--;
			}
		}else if(direction.compareTo(Compass.S)==0){
			if(y==size-1){
				y=0;
			}else{
				y++;
			}
		}
	}

	public void forward(Planet planet) {
		int size=planet.getSize();
		if(direction.compareTo(Compass.E)==0){
			if(x==size-1){
				x=0;
			}else{
				x++;
			}
		}else if(direction.compareTo(Compass.W)==0){
			if(x==0){
				x=size-1;
			}else{
				x--;
			}
		}else if(direction.compareTo(Compass.N)==0){
			if(y==size-1){
				y=0;
			}else{
				y++;
			}
		}else if(direction.compareTo(Compass.S)==0){
			if(y==0){
				y=size-1;
			}else{
				y--;
			}
		}
	}

}
