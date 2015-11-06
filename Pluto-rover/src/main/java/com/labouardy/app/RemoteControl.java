package com.labouardy.app;

import com.labouardy.model.Rover;

public class RemoteControl {
	private Planet planet;
	private Rover rover;
	
	public RemoteControl(Planet planet, Rover rover){
		this.planet=planet;
		this.rover=rover;
	}
	
	public void execute(Command command){
		if(command.compareTo(Command.B)==0){
			rover.backward(planet);
		}
		if(command.compareTo(Command.F)==0){
			rover.forward(planet);
		}
		if(command.compareTo(Command.L)==0){
			rover.left();	
		}
		if(command.compareTo(Command.R)==0){
			rover.right();
		}
	}
	
	public void printMap(){
		planet.print();
	}
}
