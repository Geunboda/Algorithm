package w0803_car;

import java.util.List;

/*
[자동차 등록하기]
SameNumberException발생: 3333은 이미 등록!!!

[자동차 목록 보기]
Car [carNum=1111, carName=쏘나타]
Car [carNum=2222, carName=제네시스]
Car [carNum=3333, carName=쏘나타]

[차번호(5555)검색]
NotFoundException 발생 :5555은 미등록 차량!!

[car.txt] 저장하기

[car.txt] 불러오기
Car [carNum=1111, carName=쏘나타]
Car [carNum=2222, carName=제네시스]
Car [carNum=3333, carName=쏘나타]
*/

public class CarMain {
	public static void main(String[] args) {
		CarManager carManager = CarManagerImpl.getInstance();
		System.out.println("[자동차 등록하기]");

		try {
			carManager.add(new Car(1111, "쏘나타"));
			carManager.add(new Car(2222, "제네시스"));
			carManager.add(new Taxi(3333, "쏘나타", 3500));
			carManager.add(new Car(3333, "K5"));
		} catch (SameNumberException e) {
			System.out.println(e.getMessage());
		}
		
		//----------------
		System.out.println("\n[자동차 목록 보기");
		List<Car> list = carManager.search();
		for (Car car : list) {
			System.out.println(car);
		}
		
		//-----------------------------
		int carNum = 5555;
		System.out.println("\n[차번호(" + carNum + ")검색]");
		Car car;
		try {
			car = carManager.searchByNum(carNum);
			System.out.println(car);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		//-----------------------------------
		//car.txt를 저장하지
		carManager.save();
		System.out.println("\n[car.txt] 저장하기");
		
		//-------------------------------------
		//car.txt 불러오기
		System.out.println("\n[car.txt] 불러오기");
		List<Car> carList=carManager.load();
		if(carList.isEmpty()) {
			System.out.println("찾는 파일이 없습니다");
			return;
		}
		for(Car c: carList) {
			System.out.println(c);
		}
	}
}
