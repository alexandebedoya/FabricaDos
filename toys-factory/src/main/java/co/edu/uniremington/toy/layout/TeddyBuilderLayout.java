package co.edu.uniremington.toy.layout;

import co.edu.uniremington.prototype.Prototype;
import co.edu.uniremington.toy.Toy;
import co.edu.uniremington.toy.builder.TeddyBuilder;
import co.edu.uniremington.toy.model.Teddy;

public abstract class TeddyBuilderLayout<T extends TeddyBuilder> implements TeddyBuilder, Prototype {

    private Long id;
    private String outerMaterial;
    private String backFilling;
    private String color;

    public TeddyBuilderLayout(Long id, String outerMaterial, String backFilling, String color) {
        this.id = id;
        this.outerMaterial = outerMaterial;
        this.backFilling = backFilling;
        this.color = color;
    }

    @Override
    public TeddyBuilder id(Long id) {
        this.id = id;
        return self();
    }

    @Override
    public TeddyBuilder outerMaterial(String outerMaterial) {
        this.outerMaterial = outerMaterial;
        return self();
    }

    @Override
    public TeddyBuilder backFilling(String backFilling) {
        this.backFilling = backFilling;
        return self();
    }

    @Override
    public TeddyBuilder color(String color) {
        this.color = color;
        return self();
    }

    @Override
    public Toy clone() {
        return new Teddy(getId(), getOuterMaterial(), getBackFilling(), getColor());
    }

    protected abstract T self();

    public String getOuterMaterial() {
        return outerMaterial;
    }

    public void setOuterMaterial(String outerMaterial) {
        this.outerMaterial = outerMaterial;
    }

    public String getBackFilling() {
        return backFilling;
    }

    public void setBackFilling(String backFilling) {
        this.backFilling = backFilling;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "outerMaterial='" + outerMaterial + '\'' +
                ", backFilling='" + backFilling + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
