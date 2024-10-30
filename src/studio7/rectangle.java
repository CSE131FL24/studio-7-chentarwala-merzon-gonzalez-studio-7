package studio7;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;


public class rectangle {
	private double length;
	private double width;
	
	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean isSmallerThan(rectangle other) {
		return this.getArea() < other.getArea();
	}
	
	@Override
	public String toString() {
		return "Rectangle[length = " + length + ", width = " + width + "]";
	}
	
	public void draw() {
			StdDraw.rectangle(length / 2, width / 2, length / 2, width / 2);
	}
	
	public static void main(String[] args) {
        rectangle rect1 = new rectangle(5, 10);
        rectangle rect2 = new rectangle(7, 7);

        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Is Square: " + rect1.isSquare());

        System.out.println("\nRectangle 2: " + rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println("Is Square: " + rect2.isSquare());

        System.out.println("\nRectangle 1 is smaller than Rectangle 2: " + rect1.isSmallerThan(rect2));

}}
