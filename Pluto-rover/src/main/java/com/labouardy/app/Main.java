package com.labouardy.app;

import com.labouardy.model.NormalRover;
import com.labouardy.model.Rover;
import com.labouardy.util.Utility;

public class Main {
	public static void main(String[] args) {
		Planet pluto=new Planet(4);
		pluto.addObstacle(new Obstacle(0, 0));
		pluto.addObstacle(new Obstacle(2, 1));
		Rover rover=new NormalRover(0, 0, Compass.N);
		RemoteControl remote=new RemoteControl(pluto, rover);
		//remote.printMap();
		
		String map=Utility.readFile("./map1.txt");
		System.out.println(map);
	}
}
