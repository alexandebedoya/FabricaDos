package co.edu.uniremington.strategy.strategies.menu;

import co.edu.uniremington.strategy.ToyStrategy;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.model.Car;
import co.edu.uniremington.toy.model.Teddy;

import java.util.Scanner;
import java.util.Set;

public class AllToysStrategy implements ToyStrategy {
    @Override
    public void execute(Set<Toy> toys, Scanner scanner) {
        toys.forEach(toy -> {
            System.out.println();
            String message = String.format("Id: %d\n", toy.getId());
            if (toy instanceof Car car){
                message = message.concat("Color: " + car.getColor() + "\n");
                message = message.concat("Marca: " + car.getBrand() + "\n");
                message = message.concat("Número de puertas: " + car.getDoors() + "\n");
                message = message.concat("Tipo de juguete: Carro");
                System.out.println();
                System.out.println(message);
            }

            if (toy instanceof Teddy teddy){
                message = message.concat("Color: " + teddy.getColor() + "\n");
                message = message.concat("Material Exterior: " + teddy.getOuterMaterial() + "\n");
                message = message.concat("Relleno: " + teddy.getBackFilling() + "\n");
                message = message.concat("Tipo de juguete: Peluche");
                System.out.println();
                System.out.println(message);
            }

        });
    }
}
