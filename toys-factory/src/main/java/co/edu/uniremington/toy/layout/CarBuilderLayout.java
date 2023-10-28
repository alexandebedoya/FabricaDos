package co.edu.uniremington.toy.layout;

import co.edu.uniremington.prototype.Prototype;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.builder.CarBuilder;
import co.edu.uniremington.toy.model.Car;

public abstract class CarBuilderLayout<T extends CarBuilder> implements CarBuilder, Prototype {

    private Long id;
    private String color;
    private String brand;
    private int doors;

    protected CarBuilderLayout(Long id, String color, String brand, int doors) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.doors = doors;
    }

    @Override
    public CarBuilder id(Long id) {
        this.id = id;
        return self();
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return self();
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return self();

    }

    @Override
    public CarBuilder doors(int doors) {
        this.doors = doors;
        return self();
    }

    @Override
    public Toy clone() {
        return new Car(getId() + 1, getColor(), getBrand(), getDoors());
    }

    protected abstract T self();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", doors=" + doors +
                '}';
    }
}
