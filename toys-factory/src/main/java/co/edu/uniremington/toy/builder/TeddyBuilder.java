package co.edu.uniremington.toy.builder;

import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.model.Teddy;

public interface TeddyBuilder {

    TeddyBuilder id(Long id);
    TeddyBuilder outerMaterial(String outerMaterial);

    TeddyBuilder backFilling(String backFilling);

    TeddyBuilder color(String color);

    static Teddy builder(Long id, String outerMaterial, String backFilling, String color) {
        return new Teddy(id, outerMaterial, backFilling, color);
    }
}
