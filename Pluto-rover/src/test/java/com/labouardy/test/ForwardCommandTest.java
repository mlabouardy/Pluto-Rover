package com.labouardy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;
import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;

public class ForwardCommandTest {
	private Planet planet;
	private Rover rover;
	
	@Before
	public void setUp(){
		planet=new Planet(4);
		rover=new NormalRover(0, 1, Compass.N);
	}
	
	@Test
	public void testForwardwardWorking(){
	    rover.forward(planet);
	    assertEquals("(0,2,N)",rover.toString());
	}
	
	@Test
	public void testForwardwardNotWorking(){
	    rover.forward(planet);
	    assertEquals("(0,0,N)",rover.toString());
	}
}
