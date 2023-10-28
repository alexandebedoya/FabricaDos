package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class DeleteToysByColorStrategy implements ToyStrategy {


    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {
        System.out.println("Eliminar juguetes por su color");
        System.out.println("Colores disponibles: ");
        toys.stream().map(Toy::getColor).distinct().forEach(System.out::println);
        System.out.println("Ingrese el color por el cual desea eliminar los juguetes");
        String color = scanner.next();
        List<Toy> toysToDelete = new ArrayList<>();
        toys.stream().filter(toy -> toy.getColor().equalsIgnoreCase(color)).forEach(toysToDelete::add);
        toysToDelete.forEach(toys::remove);
        IntStream.range(0, toys.size()).forEach(i -> toys.stream().skip(i).findFirst().get().setId((long) i + 1));
    }
}
