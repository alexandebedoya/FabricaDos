package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.utils.Validation;

import java.util.Scanner;
import java.util.Set;

public class DeleteToyStrategy implements ToyStrategy {
    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {
        ToyStrategy toyStrategy = new AllToysStrategy();
        System.out.println("Eliminar un juguete por su ID");

        System.out.println();
        System.out.println("Todos los juguetes");
        System.out.println("-------------------");
        toyStrategy.execute(toys, scanner);
        System.out.println("-------------------");

        System.out.println("Ingrese el ID del juguete a eliminar");
        String id;
        do {
            id = scanner.next();
            if (!Validation.isNumber(id)) {
                System.out.println("Ingrese un ID válido");
            }
        } while (!Validation.isNumber(id));


        String finalId = id;
        toys.removeIf(toy -> toy.getId() == Integer.parseInt(finalId));

        if (toys.stream().noneMatch(toy -> toy.getId() == Integer.parseInt(finalId))) {
            System.out.println("Juguete eliminado");
        } else {
            System.out.println("No se pudo eliminar el juguete");
        }
    }
}
