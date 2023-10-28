package co.edu.uniremington.strategy.strategies.toy.strategies;

import co.edu.uniremington.strategy.strategies.toy.TypeToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.builder.TeddyBuilder;
import co.edu.uniremington.toy.model.Teddy;

import java.util.Scanner;
import java.util.Set;

public class TeddyCreationToyStrategy implements TypeToyStrategy {
    @Override
    public void createToy(Set<Toy> toys, Scanner scanner) {

        System.out.println("Ingrese el material exterior del peluche");
        String outerMaterial = scanner.nextLine();
        System.out.println("Ingrese el relleno del peluche");
        String filling = scanner.nextLine();
        System.out.println("Ingrese el color del peluche");
        String color = scanner.nextLine();

        Teddy teddy = TeddyBuilder.builder((long) toys.size() + 1, outerMaterial, filling, color);

        toys.add(teddy);
        System.out.println("Peluche creado con éxito");
    }
}
