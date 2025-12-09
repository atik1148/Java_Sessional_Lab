class Shape {

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double radius) {
        return 3.1416 * radius * radius;
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("\n ==Shape Area==");

        System.out.println("Rectangle (6.0 * 4.5): " + s.area(6.0, 4.5));
        System.out.println("Circle (radius = 5.0)  : " + s.area(5.0));
    }
}