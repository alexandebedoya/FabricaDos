package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.layout.CarBuilderLayout;
import co.edu.uniremington.toy.model.Car;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;

public class PrintCarMaxDoorsStrategy implements ToyStrategy {
    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {

        System.out.println("El carro con más puertas es: ");

        toys.stream().filter(toy -> toy instanceof Car)
                .map(toy -> (Car) toy)
                .max(Comparator.comparingInt(Car::getDoors))
                .ifPresent(System.out::println);
    }
}
