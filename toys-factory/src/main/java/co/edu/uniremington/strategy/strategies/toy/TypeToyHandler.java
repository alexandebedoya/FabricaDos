package co.edu.uniremington.strategy.strategies.toy;

import co.edu.uniremington.strategy.strategies.toy.strategies.CarCreationToyStrategy;
import co.edu.uniremington.strategy.strategies.toy.strategies.TeddyCreationToyStrategy;

import java.util.Map;

public class TypeToyHandler {

    private static final Map<Integer, TypeToyStrategy> strategies = Map.of(1, new CarCreationToyStrategy()
            , 2, new TeddyCreationToyStrategy());

    public static TypeToyStrategy getStrategy(int option) {
        return strategies.get(option);
    }
}
