package com.labouardy.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.labouardy.app.Compass;
import com.labouardy.app.Obstacle;
import com.labouardy.app.Planet;
import com.labouardy.app.RemoteControl;
import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;
import com.labouardy.model.SmartRover;
import com.labouardy.util.Utility;

public class RemoteControlTest {
	private Planet pluto;
	private Rover rover;
	private RemoteControl remote;
	@Before
	public void setUp(){
		pluto=new Planet(4);
		pluto.addObstacle(new Obstacle(0, 0));
		pluto.addObstacle(new Obstacle(2, 1));
		rover=new NormalRover(0, 0, Compass.N);
		remote=new RemoteControl(pluto, rover);
	}
	
	@Test
	public void testPrintMap(){
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    // Print map
	    remote.printMap();
	    // Put things back
	    System.out.flush();
	    System.setOut(old);
		
		String expectedMap=Utility.readFile("./map1.txt");
		assertEquals(expectedMap, baos.toString()+"\n");
	}
}
