package co.edu.uniremington.strategy.strategies.toy.print;

import co.edu.uniremington.strategy.strategies.toy.print.strategies.PrintTypeCarStrategy;
import co.edu.uniremington.strategy.strategies.toy.print.strategies.PrintTypeTeddyStrategy;

import java.util.Map;

public class PrintToysHandler {

    private static final Map<Integer, PrintToysStrategy> strategies = Map.of(1, new PrintTypeCarStrategy()
            , 2, new PrintTypeTeddyStrategy());

    public static PrintToysStrategy getStrategy(int option) {
        return strategies.get(option);
    }

}
