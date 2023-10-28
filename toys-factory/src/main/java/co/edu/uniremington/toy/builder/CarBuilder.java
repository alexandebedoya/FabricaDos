package co.edu.uniremington.toy.builder;

import co.edu.uniremington.toy.layout.CarBuilderLayout;
import co.edu.uniremington.toy.model.Car;

public interface CarBuilder {

    CarBuilder id(Long id);
    CarBuilder color(String color);

    CarBuilder brand(String brand);

    CarBuilder doors(int doors);
    static Car builder(Long id, String color, String brand, int doors) {
        return new Car(id, color, brand, doors);
    }
}
