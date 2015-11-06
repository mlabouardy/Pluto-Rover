package com.labouardy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;
import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;

public class CommandsTest {
	private Planet planet;
	private Rover rover;
	
	@Before
	public void setUp(){
		planet=new Planet(4);
		rover=new NormalRover(0, 0, Compass.N);
	}
	
	@Test
	public void testAll(){
	    rover.forward(planet);
	    rover.forward(planet);
	    rover.right();
	    rover.forward(planet);
	    rover.forward(planet);
	    assertEquals("(2,2,E)",rover.toString());
	}
}
