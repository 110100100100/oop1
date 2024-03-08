public abstract class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void start();

    public abstract void accelerate();

    public abstract void stop();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
class Car extends Vehicle {

    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Car " + brand + " starts!");
    }

    @Override
    public void accelerate() {
        System.out.println("Car " + brand + " is accelerating!");
    }

    @Override
    public void stop() {
        System.out.println("Car " + brand + " has stopped!");
    }
}
class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle " + brand + " starts!");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle " + brand + " is accelerating!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle " + brand + " has stopped!");
    }
}
class Truck extends Vehicle {

    public Truck(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Truck " + brand + " starts!");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck " + brand + " is accelerating!");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + brand + " has stopped!");
    }
}
class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red");
        car.start();
        car.accelerate();
        car.stop();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Honda", "Blue");
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        System.out.println();

        Truck truck = new Truck("Hyundai", "Yellow");
        truck.start();
        truck.accelerate();
        truck.stop();
    }
}


