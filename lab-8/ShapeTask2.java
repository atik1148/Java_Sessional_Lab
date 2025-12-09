class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle:");
        System.out.println("   ***   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   ***   ");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle:");
        System.out.println("***************");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("***************");

    }
}

public class ShapeTask2 {
    public static void main(String[] args) {
        System.out.println("==Task2==");
        Shape s;
        s = new Shape();
        s.draw();
        System.out.println();
        s = new Circle();
        s.draw();
        System.out.println();
        s = new Rectangle();
        s.draw();
    }
}
