package ict301.solid.lsp;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

// Exemple d'utilisation correcte
public class MainLsp2 {
    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 4);
        System.out.println("Square Area : " + square.getArea()); // 9
        System.out.println("Rectangle Area: " + rectangle.getArea()); // 12
    }
}