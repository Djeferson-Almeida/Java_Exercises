package entities;

import entities.Enums.Color;

public abstract class Shape {

	private Color color;
	
	public Shape() {
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Shape(Color color) {
		this.color = color;
	}


	public abstract Double area();
	
}

