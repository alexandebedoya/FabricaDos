package co.edu.uniremington.strategy;

import co.edu.uniremington.strategy.strategies.menu.*;

import java.util.Map;

public class StrategyHandler {

    private static final Map<Integer, ToyStrategy> strategies = Map.of(1, new CreateToyStrategy(),
            2, new CloneToyStrategy(), 3, new DeleteToyStrategy(), 4, new AllToysStrategy(),
            5, new PrintListToys(),
            6, new PrintCarMaxDoorsStrategy(),
            7, new ConvertSetToMapStrategy(),
            8, new DeleteToysByColorStrategy());

    public static ToyStrategy getStrategy(int option) {
        return strategies.get(option);
    }

}
