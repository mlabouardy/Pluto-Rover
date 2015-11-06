package com.labouardy.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.app.Planet;
import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;

public class BackwardCommandTest {
	private Planet planet;
	private Rover rover;
	
	@Before
	public void setUp(){
		planet=new Planet(4);
		rover=new NormalRover(0, 1, Compass.N);
	}
	
	@Test
	public void testBackward(){
	    rover.backward(planet);
	    assertEquals("(0,0,N)",rover.toString());
	}
}
