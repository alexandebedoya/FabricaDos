package co.edu.uniremington.toy.model;

import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.builder.CarBuilder;
import co.edu.uniremington.toy.layout.CarBuilderLayout;

public class Car extends CarBuilderLayout<Car> implements Toy {

    public Car(Long id, String color, String brand, int doors) {
        super(id, color, brand, doors);
    }

    @Override
    protected Car self() {
        return this;
    }

    @Override
    public Car clone() {
        return new Car(getId() + 1, getColor(), getBrand(), getDoors());
    }

    @Override
    public Long getId() {
        return super.getId();
    }
    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + super.getId() +
                super.toString();
    }

}
