package com.labouardy.model;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;
import com.labouardy.exception.RoverStuckException;

public class NormalRover extends AbstractRover {

	public NormalRover(int x, int y, Compass direction) {
		super(x, y, direction);
	}

	public void backwardChecker(Planet planet) throws RoverStuckException{
		int size=planet.getSize();
		if(direction.compareTo(Compass.E)==0){
			if(x==0){
				throw new RoverStuckException("stuck !!");
			}else{
				x--;
			}
		}else if(direction.compareTo(Compass.W)==0){
			if(x==size-1){
				throw new RoverStuckException("stuck !!");
			}else{
				x++;
			}
		}else if(direction.compareTo(Compass.N)==0){
			if(y==0){
				throw new RoverStuckException("stuck !!");
			}else{
				y--;
			}
		}else if(direction.compareTo(Compass.S)==0){
			if(y==size-1){
				throw new RoverStuckException("stuck !!");
			}else{
				y++;
			}
		}
	}
	
	public void backward(Planet planet){
		try {
			backwardChecker(planet);
		} catch (RoverStuckException e) {
			e.printStackTrace();
		}
	}

	public void forward(Planet planet) {
		
	}

}
