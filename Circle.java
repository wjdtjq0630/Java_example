package example20180331;
import java.util.*;

public class Circle extends Figure{
	double radius;
	public Circle(double radius){
		this.setRadious(radius);
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadious(double radius) {
		this.radius= radius;
	}	
	public double getArea() {
		double area = 3.14 * this.radius * this.radius;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2 * 3.14 * this.radius;
		return perimeter;
	} 
	public double getDiameter() {
		double diameter = 2 * this.radius;
		return diameter;
	}
	public static void main(String[] args) {
		Figure ab1 = new Figure();
		System.out.println(ab1.getColor());
	}

}
