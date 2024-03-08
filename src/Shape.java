public abstract class Shape {
    public String color;
    public double borderWidth;

    public Shape(String color, double borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();



    public static void displayShapeInfo(Shape shape) {
        System.out.println("cubic shape: " + shape.getClass().getSimpleName());
        System.out.println("Color: " + shape.color);
        System.out.println("Độ dày viền: " + shape.borderWidth);
        System.out.println("Acreage: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());

    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle (String color, double borderWidth, double width, double height) {
        super(color, borderWidth);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, int borderWidth, double side1, double side2, double side3) {
        super(color, borderWidth);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
class ShapeMain{
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle("Red", 2, 5, 8);
            Circle circle = new Circle("Yellow", 1, 4);
            Triangle triangle = new Triangle("Blue", 3, 3, 4, 5);

            Shape.displayShapeInfo(rectangle);
            Shape.displayShapeInfo(circle);
            Shape.displayShapeInfo(triangle);
        }

}