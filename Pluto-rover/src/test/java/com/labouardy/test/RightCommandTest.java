package com.labouardy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;

public class RightCommandTest {
	private Rover rover;

	@Before
	public void setUp() {
		rover = new NormalRover(0, 0, Compass.N);
	}

	@Test
	public void testRight() {
		rover.right();
		assertEquals("(0,0,E)", rover.toString());
		rover.right();
		assertEquals("(0,0,S)", rover.toString());
		rover.right();
		assertEquals("(0,0,W)", rover.toString());
		rover.right();
		assertEquals("(0,0,N)", rover.toString());
	}
}
