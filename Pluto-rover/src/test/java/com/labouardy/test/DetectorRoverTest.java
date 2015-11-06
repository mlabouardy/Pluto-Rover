package com.labouardy.test;

import static org.junit.Assert.assertEquals;
import junit.framework.AssertionFailedError;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.app.Obstacle;
import com.labouardy.app.Planet;
import com.labouardy.exception.ObstacleDetectedException;
import com.labouardy.model.DetectorRover;
import com.labouardy.model.Rover;

public class DetectorRoverTest {
	private Planet planet;
	private Rover rover;
	
	@Before
	public void setUp(){
		planet=new Planet(4);
		planet.addObstacle(new Obstacle(0, 1));
		rover=new DetectorRover(0, 0, Compass.N);
	}
	
	@Test(expected=ObstacleDetectedException.class)
	public void testBackward(){
	    rover.forward(planet);
	}
}
