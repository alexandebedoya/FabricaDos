package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.strategy.strategies.toy.TypeToyHandler;
import co.edu.uniremington.strategy.strategies.toy.TypeToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.utils.Validation;

import java.util.Scanner;
import java.util.Set;

public class CreateToyStrategy implements ToyStrategy {


    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {

        TypeToyStrategy typeToyStrategy;

        System.out.println("Ingrese el tipo de juguete que desea crear: ");

        String option;

        do {
            String message = """
                    1. Crear un juguete de tipo carro
                    2. Crear un juguete de tipo peluche
                    3. Salir
                    """;
            System.out.println(message);
            do {
                option = scanner.next();
                if (!Validation.isNumber(option)) {
                    System.out.println("Ingrese una opción válida");
                }
            }while (!Validation.isNumber(option));
            scanner.nextLine();

            if (Integer.parseInt(option) == 3) {
                System.out.println("Regresando al menú principal");
                break;
            }

            typeToyStrategy = TypeToyHandler.getStrategy(Integer.parseInt(option));

            if (typeToyStrategy == null) {
                System.out.println("Opción no válida");
                continue;
            }

            typeToyStrategy.createToy(toys, scanner);

        }while (true);

    }
}
