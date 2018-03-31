package example20180331;
import java.util.*;
public class Rectangle1 {
	double width, height;
	public Rectangle1() {
	}
	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*(this.width + this.height);
		return perimeter;
	}
	
	public static void main(String[] args) {
		Rectangle1 ab = new Rectangle1(3,4);
		System.out.println(ab.getArea());
	}

}
