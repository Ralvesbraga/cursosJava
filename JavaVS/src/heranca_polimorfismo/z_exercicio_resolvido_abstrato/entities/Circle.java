package heranca_polimorfismo.z_exercicio_resolvido_abstrato.entities;

import heranca_polimorfismo.z_exercicio_resolvido_abstrato.enums.Color;

public class Circle extends Shape {


    private Double radius;


    
    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }


    public Circle() {
        super();
    }


    public Double getRadius() {
        return radius;
    }


    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }
    
}
