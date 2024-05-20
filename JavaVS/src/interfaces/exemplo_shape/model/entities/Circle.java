package interfaces.exemplo_shape.model.entities;

import interfaces.exemplo_shape.model.enums.Color;

public class Circle extends AbstractShape{
 
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
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
