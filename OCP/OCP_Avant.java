package ict301.solid.ocp;

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        }
        throw new IllegalArgumentException("Unknown shape");
    }
}

// Classes de formes utilisées (à inclure dans le même fichier pour simplicité)
class Rectangle {
    private double width;
    private double height;

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    // setters ou constructeur omis pour brièveté
}

class Circle {
    private double radius;

    public double getRadius() { return radius; }
    // setter ou constructeur omis
}