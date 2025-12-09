abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("    Abstraction with Shape");
        System.out.println("=====================================\n");
        Shape s1 = new Circle(3.5);
        Shape s2 = new Rectangle(5.0, 4.0);

        System.out.printf("Circle (r=3.5) Area   : %.2f sq.units%n", s1.area());
        System.out.printf("Rectangle (5×4) Area  : %.2f sq.units%n", s2.area());

        System.out.println("\n" + "=".repeat(50) + "\n");
    }
}
