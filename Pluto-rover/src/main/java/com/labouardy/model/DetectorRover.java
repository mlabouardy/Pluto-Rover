package com.labouardy.model;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;
import com.labouardy.exception.ObstacleDetectedException;

public class DetectorRover extends AbstractRover{

	public DetectorRover(int x, int y, Compass direction) {
		super(x, y, direction);
	}

	public void backward(Planet planet){
		try {
			backwardChecker(planet);
		} catch (ObstacleDetectedException e) {
			e.printStackTrace();
		}
	}
	
	public void backwardChecker(Planet planet) throws ObstacleDetectedException{
		int size=planet.getSize();
		if(direction.compareTo(Compass.E)==0){
			if(x==0){
				if(planet.hasObstacle(size-1, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x=size-1;
				}
			}else{
				if(planet.hasObstacle(x-1, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x--;
				}
			}
		}else if(direction.compareTo(Compass.W)==0){
			if(x==size-1){
				if(planet.hasObstacle(0, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x=0;
				}
			}else{
				if(planet.hasObstacle(x+1, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x++;
				}
			}
		}else if(direction.compareTo(Compass.N)==0){
			if(y==0){
				if(planet.hasObstacle(x, size-1)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y=size-1;
				}
			}else{
				if(planet.hasObstacle(x, y-1)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y--;
				}
			}
		}else if(direction.compareTo(Compass.S)==0){
			if(y==size-1){
				if(planet.hasObstacle(x, 0)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y=0;
				}
			}else{
				if(planet.hasObstacle(x, y+1)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y++;
				}
			}
		}
	}

	public void forward(Planet planet){
		try {
			forwardChecker(planet);
		} catch (ObstacleDetectedException e) {
			e.printStackTrace();
		}
	}
	
	public void forwardChecker(Planet planet) throws ObstacleDetectedException{
		int size=planet.getSize();
		if(direction.compareTo(Compass.E)==0){
			if(x==size-1){
				if(planet.hasObstacle(0, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x=0;
				}
			}else{
				if(planet.hasObstacle(x+1, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x++;
				}
			}
		}else if(direction.compareTo(Compass.W)==0){
			if(x==0){
				if(planet.hasObstacle(size-1, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x=size-1;
				}
			}else{
				if(planet.hasObstacle(x-1, y)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					x--;
				}
			}
		}else if(direction.compareTo(Compass.N)==0){
			if(y==size-1){
				if(planet.hasObstacle(x, 0)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y=0;
				}
			}else{
				if(planet.hasObstacle(x, y+1)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y++;
				}
			}
		}else if(direction.compareTo(Compass.S)==0){
			if(y==0){
				y=size-1;
				if(planet.hasObstacle(x, size-1)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y=size-1;
				}
			}else{
				if(planet.hasObstacle(x, y-1)){
					throw new ObstacleDetectedException("Obstacle detected !!");
				}else{
					y--;
				}
			}
		}
	}

}
