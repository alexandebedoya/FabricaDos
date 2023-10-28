package co.edu.uniremington.strategy.strategies.toy.print.strategies;

import co.edu.uniremington.strategy.strategies.toy.print.PrintToysStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.model.Teddy;

import java.util.Set;

import static java.util.Comparator.*;

public class PrintTypeTeddyStrategy implements PrintToysStrategy {
    @Override
    public void printByType(Set<Toy> toys) {
        System.out.println("Los peluches son: ");
        toys.stream().filter(toy -> toy instanceof Teddy)
                .map(toy -> (Teddy) toy)
                .sorted(comparingLong(Teddy::getId).reversed())
                .forEach(System.out::println);
    }
}
