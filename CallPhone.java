package example20180331;
import java.util.*;
public class CallPhone {
	String model, brand, color;
	int power, camera;
	public void setInfo(String model, String brand, String color, int camera) {
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.camera = camera;
	}
	public String power() {
		if(this.power == 1) {
			this.power = 0;
			return "������ �����ϴ�.";
		} else {
			this.power = 1;
			return "������ �����ϴ�.";
		}
	}	
	public void camera() {
		if(this.camera == 1) {
			System.out.println("ī�޶� ������ �޴��� �Դϴ�.");
		} else {
			System.out.println("ī�޶� �������� ���� �޴��� �Դϴ�.");
		}
	}
	public CallPhone(String model, String brand, String color,int camera){
		this.setInfo(model, brand, color,camera);
	}
	public static void main(String[] args) {
		CallPhone galaxy = new CallPhone("s9","Samsung","black",1);
		galaxy.camera();
		System.out.println(galaxy.power());
		System.out.println(galaxy.power());
		System.out.println(galaxy.power());
	}

}
