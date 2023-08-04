package w0803_compare;

//기본생성자, 인자 3개받는 생성자, getter & setter, toString()
public class Car implements Comparable<Car>{
	private int carNum;
	private String carName;
	private String maker;
	public Car() {
		super();
	}
	public Car(int carNum, String carName, String maker) {
		super();
		this.carNum = carNum;
		this.carName = carName;
		this.maker = maker;
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
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public String toString() {
		return carNum+ "\t" + carName + "\t" + maker;
	}
	@Override
	public int compareTo(Car o) {
		return o.getCarNum() - this.getCarNum();
	}
}
















