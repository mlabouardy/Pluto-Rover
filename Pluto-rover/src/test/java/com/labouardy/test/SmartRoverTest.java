package com.labouardy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;
import com.labouardy.model.Rover;
import com.labouardy.model.SmartRover;

public class SmartRoverTest {
	private Planet planet;
	private Rover rover;
	
	@Before
	public void setUp(){
		planet=new Planet(4);
		rover=new SmartRover(3, 0, Compass.E);
	}
	
	@Test
	public void testBackward(){
	    rover.forward(planet);
	    assertEquals("(0,0,E)",rover.toString());
	}
}
