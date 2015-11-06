package com.labouardy.app;

import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;
import com.labouardy.util.Utility;

public class Main {
	public static void main(String[] args) {
		Planet pluto=new Planet(4);
		pluto.addObstacle(new Obstacle(0, 3));
		pluto.addObstacle(new Obstacle(2, 1));
		//Normal Rover
		Rover rover=new NormalRover(0, 0, Compass.N);
		/*
		 * Smart rover can go from edge to another grid
		 * Rover rover=new NormalRover(0, 0, Compass.N);
		 */
		/*
		 * Detector rover
		 * Rover rover=new DetectorRover(0, 0, Compass.N);
		 */
		RemoteControl remote=new RemoteControl(pluto, rover);
		remote.execute(Command.F);
		remote.execute(Command.F);
		remote.execute(Command.R);
		remote.execute(Command.F);
		remote.execute(Command.F);
		remote.printMap();
	}
}
