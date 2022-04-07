package serviceImpl;

import dao.CarDao;
import daoImpl.CarDaoImpl;
import entity.Car;
import service.CarService;

public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    public CarServiceImpl() {
    }

    @Override
    public boolean addCar(Car car) {
        boolean isAdded = false;
        try {
            isAdded = carDao.addCar(car);
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return isAdded;
    }
}
