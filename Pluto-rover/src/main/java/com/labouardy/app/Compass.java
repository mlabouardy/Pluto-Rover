package com.labouardy.app;

public enum Compass {
	N("N"),
	S("S"),
	E("E"),
	W("W");
	
	private String value;
	
	Compass(String value){
		this.value=value;
	}
	
	public String getValue(){
		return value;
	}
}
