package com.labouardy.app;

public enum Command {
	B("Backward"),
	F("Forward"),
	L("Left"),
	R("Right");
	
	private String value;
	
	Command(String value){
		this.value=value;
	}
	
	public String getValue(){
		return value;
	}
}
