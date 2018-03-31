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
			return "전원이 꺼집니다.";
		} else {
			this.power = 1;
			return "전원이 켜집니다.";
		}
	}	
	public void camera() {
		if(this.camera == 1) {
			System.out.println("카메라가 장착된 휴대폰 입니다.");
		} else {
			System.out.println("카메라가 장착되지 않은 휴대폰 입니다.");
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
