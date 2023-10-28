package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.utils.Validation;

import java.util.Scanner;
import java.util.Set;

public class CloneToyStrategy implements ToyStrategy {
    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {
        ToyStrategy toyStrategy = new AllToysStrategy();

        System.out.println("---------------------");
        System.out.println("Lista de juguetes");
        System.out.println("---------------------");
        toyStrategy.execute(toys, scanner);
        System.out.println("---------------------");
        System.out.println("Ingrese el id del juguete a clonar");
        String id;
        do {
            id = scanner.next();
            if (!Validation.isNumber(id)) {
                System.out.println("Ingrese un id válido");
            }
        }while (!Validation.isNumber(id));

        String finalId = id;
        Toy toy = toys.stream().filter(t -> t.getId() == Integer.parseInt(finalId)).findFirst().orElse(null);
        if (toy != null) {
            System.out.println("Ingrese el número de copias");
            int copies = scanner.nextInt();
            for (int i = 0; i < copies; i++){
                Toy toy1 = toy.clone();
                toy1.setId((long) (toys.size() + 1));
                toys.add(toy1);
            }
            System.out.println("Cantidad de juguetes clonados" + copies);
            return;
        }
        System.out.println("No se encontró el juguete");
    }
}
