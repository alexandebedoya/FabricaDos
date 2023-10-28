package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertSetToMapStrategy implements ToyStrategy {
    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {

        System.out.println("Convertir Set a Map");

        toys.stream().collect(Collectors.toMap(Toy::getId, Toy::clone))
                .forEach((k, v) -> System.out.println("Key -> " + k + " Value -> " + v));
    }
}
