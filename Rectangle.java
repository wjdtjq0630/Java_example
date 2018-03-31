package example20180331;
import java.util.*;
 
public class Rectangle {
	double width;
	double length;
	public void setInfo(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(int width, int length){
		 this.setInfo(width,length);
	}
	public double calArea() {
		double area = this.width * this.length;
		return area;
	}
	public static void main(String[] args) {
		Rectangle ab = new Rectangle(5,3);
		System.out.println(ab.width);
		System.out.println(ab.length);
		System.out.println(ab.calArea());
	}

}
