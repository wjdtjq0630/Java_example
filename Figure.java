package example20180331;
import java.util.*;
public class Figure {
	String color;
	boolean filled;
	String dateCreated;
	
	public Figure(){
		this.color = "white";
		this.filled = false;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getFilled() {
		return this.filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public void toString(String str) {
		System.out.println(str);
	}
}
