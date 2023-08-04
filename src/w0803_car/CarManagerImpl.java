package w0803_car;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarManagerImpl implements CarManager {

	private static List<Car> list = new ArrayList<>();

	// private static CarManager instance;
	private static CarManager instance = new CarManagerImpl();

	public static CarManager getInstance() {
//		if (instance == null)
//			instance = new CarManagerImpl();
		return instance;
	}

	private CarManagerImpl() {
		super();
	}

	@Override
	public void add(Car car) {
		for (Car temp : list) { // 중복되는 자동차 체크
			if (temp.getCarNum() == car.getCarNum())
				throw new SameNumberException("SameNumberException 발생 : " + temp.getCarNum() + "은 이미 등록!!");
		}
		list.add(car);
	}

	@Override
	public List<Car> search() {
		return list;
	}

	@Override
	public Car searchByNum(int carNum) throws NotFoundException {
		for (Car temp : list) { // 중복되는 자동차 체크
			if (temp.getCarNum() == carNum)
				return temp;
		}
		throw new NotFoundException("NotFoundException 발생 : " + carNum + "은 미등록 차량!!");

	}

//==========================================
	@Override
	public void save() {
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("car.txt"));
			out.writeObject(list);
			out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//======================================================
	@Override
	public List<Car> load() {
		File f = new File("car.txt");

		if (f.exists()) {
			ObjectInputStream in = null;

			try {
				in = new ObjectInputStream(new FileInputStream(f));
				list = (List<Car>) in.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return list;
		} else {
			return Collections.EMPTY_LIST;
		}
	}

}
