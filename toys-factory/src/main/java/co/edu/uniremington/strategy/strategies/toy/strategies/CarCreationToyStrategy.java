package co.edu.uniremington.strategy.strategies.toy.strategies;

import co.edu.uniremington.strategy.strategies.toy.TypeToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.builder.CarBuilder;
import co.edu.uniremington.toy.model.Car;
import co.edu.uniremington.utils.Validation;

import java.util.Scanner;
import java.util.Set;

public class CarCreationToyStrategy implements TypeToyStrategy {
    @Override
    public void createToy(Set<Toy> toys, Scanner scanner) {

        System.out.println("Ingrese el color del carro");
        String color = scanner.nextLine();
        System.out.println("Ingrese la marca del carro");
        String brand = scanner.nextLine();
        System.out.println("Ingrese el número de puertas del carro");
        String doors;
        do {
            doors = scanner.next();
            if (Validation.isNumber(doors)) {
                System.out.println("Ingrese un número válido");
            }
        }while (!Validation.isNumber(doors));

        Car car = CarBuilder.builder((long) (toys.size() + 1),color, brand, Integer.parseInt(doors));


        toys.add(car);
        System.out.println("Carro creado con éxito");
    }
}
