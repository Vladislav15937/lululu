package web.servise;

import web.models.Car;

import java.awt.*;
import java.util.List;

public interface CarService {
    public List<Car> getCarCount(Integer count);
}
