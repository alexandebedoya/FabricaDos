package co.edu.uniremington.strategy;

import co.edu.uniremington.toy.Toy;

import java.util.Scanner;
import java.util.Set;

public interface ToyStrategy {

    void execute(Set<Toy> toys, Scanner scanner);

}
