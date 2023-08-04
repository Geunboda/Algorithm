package w0803_car;

import java.util.List;

public interface CarManager {
	void add(Car car);

	List<Car> search();

	Car searchByNum(int carNum) throws NotFoundException;

	void save();

	List<Car> load();
}
