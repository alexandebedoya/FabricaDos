package co.edu.uniremington.menu;

import co.edu.uniremington.strategy.StrategyHandler;
import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.builder.CarBuilder;
import co.edu.uniremington.toy.builder.TeddyBuilder;
import co.edu.uniremington.toy.model.Car;
import co.edu.uniremington.toy.model.Teddy;
import co.edu.uniremington.utils.Validation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public final class Menu {

    private static final Set<Toy> toys = new LinkedHashSet<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Menu instance;

    private Menu() {
        throw new UnsupportedOperationException("No instantiable class");
    }

    public static void menuPrincipal() {
        dataToys();
        ToyStrategy toyStrategy;

        String option;
        do {

            String string = """
                    Ingrese una opción:
                    1. Crear un nuevo juguete
                    2. Clonar un juguete
                    3. Eliminar un juguete
                    4. Listar juguetes
                    5. Imprimir lista de juguetes (carros o peluches)
                    6. Imprimir el carrito con el mayor número de puertas
                    7. Convertir la lista de juguetes a un Map
                    8. Eliminar juguetes por su color
                    9. Salir
                    """;
            System.out.println(string);
            do {
                option = SCANNER.next();
                if (!Validation.isNumber(option)) {
                    System.out.println("Ingrese una opción válida");
                }
            } while (!Validation.isNumber(option));


            if (Integer.parseInt(option) == 9) {
                System.out.println("Gracias por usar el programa");
                break;
            }

            toyStrategy = StrategyHandler.getStrategy(Integer.parseInt(option));

            if (toyStrategy == null) {
                System.out.println("Opción no válida");
                continue;
            }

            toyStrategy.execute(toys, SCANNER);

        } while (true);

    }

    private static void dataToys() {
        Car car = CarBuilder.builder(1L,"Blanco", "Kia", 5);
        Car car1 = CarBuilder.builder(2L,"Negro", "Hyundai", 5);
        Car car2 = CarBuilder.builder(3L,"Azul", "Ford", 6);
        Teddy teddy = TeddyBuilder.builder(4L, "Felpa", "Algodòn", "Cafè");
        toys.add(car);
        toys.add(car1);
        toys.add(car2);
        toys.add(teddy);

    }
}
