package interfaces.exemplo_shape.model.entities;

import interfaces.exemplo_shape.model.enums.Color;

public abstract class AbstractShape implements Shape{

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



}
