package w0803_car;

import java.io.Serializable;

/*
-carNum:int
-carName:String
+Car()
+Car(carNum:int,carName:String)
+getter & getter
+toString():String
*/
public class Car implements Serializable{

	private int carNum;
	private String carName;
	public Car() {
		super();
	}
	public Car(int carNum, String carName) {
		this.carName = carName;
		this.carNum = carNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "Car [carNum=" + carNum + ", carName=" + carName + "]";
	}
	
}
