package co.edu.uniremington.strategy.strategies.toy.print.strategies;

import co.edu.uniremington.strategy.strategies.toy.print.PrintToysStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.model.Car;

import java.util.Set;

import static java.util.Comparator.comparingLong;

public class PrintTypeCarStrategy implements PrintToysStrategy {
    @Override
    public void printByType(Set<Toy> toys) {
        System.out.println("Los carros son: ");
        toys.stream().filter(toy -> toy instanceof Car)
                .map(toy -> (Car) toy)
                .sorted(comparingLong(Car::getId).reversed())
                .forEach(System.out::println);
    }
}
