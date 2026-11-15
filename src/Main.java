public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5.0),
                new Triangle(4.0, 6.0),
                new Square(3.0)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.printf("Сумарна площа всіх фігур: %.2f%n", totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
