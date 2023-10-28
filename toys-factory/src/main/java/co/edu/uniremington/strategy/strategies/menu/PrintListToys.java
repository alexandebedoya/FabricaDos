package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.strategy.strategies.toy.print.PrintToysHandler;
import co.edu.uniremington.strategy.strategies.toy.print.PrintToysStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.utils.Validation;

import java.util.Scanner;
import java.util.Set;

public class PrintListToys implements ToyStrategy {
    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {
        PrintToysStrategy printToysStrategy;
        do {

            String message = """
                    1. Imprimir los juguetes tipo carro
                    2. Imprimir los juguetes tipo peluche
                    3. Salir
                    """;
            System.out.println(message);

            String option;
            do {
                option = scanner.next();
                if (!Validation.isNumber(option)) {
                    System.out.println("Ingrese una opción válida");
                }
            }while (!Validation.isNumber(option));

            if (Integer.parseInt(option) == 3) {
                System.out.println("Regresando al menú principal");
                break;
            }

            printToysStrategy = PrintToysHandler.getStrategy(Integer.parseInt(option));

            if (printToysStrategy == null) {
                System.out.println("Opción no válida");
                continue;
            }

            printToysStrategy.printByType(toys);

        }while (true);
    }
}
