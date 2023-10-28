package co.edu.uniremington.toy.model;

import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.layout.TeddyBuilderLayout;

public class Teddy extends TeddyBuilderLayout<Teddy> implements Toy {


    public Teddy(Long id, String outerMaterial, String backFilling, String color) {
        super(id, outerMaterial, backFilling, color);
    }

    @Override
    protected Teddy self() {
        return this;
    }

    @Override
    public Toy clone() {
        return new Teddy(getId() + 1, getOuterMaterial(), getBackFilling(), getColor());
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Teddy{" +
                "id=" + super.getId() +
                super.toString();
    }
}
