package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceimpl implements CarService {
    @Autowired
    private List<Car> carList;
    CarServiceimpl(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarsId(Integer count) {
        List<Car> cars = new ArrayList<>();

        if (count == null || count >= 5) {
            return carList;
        } else {
            for (int i = 1; i <= count; i++) {
                cars.add(carList.get(i));
            }
            return cars;
        }
    }
}
