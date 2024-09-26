package com.techlabs.creational.prototype.model;

public interface Shape extends Cloneable{
	Shape clone();
	void draw();
}
