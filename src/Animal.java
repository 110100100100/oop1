public abstract class Animal {
    public String name;
    public int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void makeSounds (){}
    public void move (){};

    public abstract void makeSound();

}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " say Gou Gou");
        System.out.println(getName() + " is " + getAge() + " years");
    }

    public void move() {
        System.out.println(getName() + " running");

    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " say Meow moew");
        System.out.println(getName() + " is " + getAge() + " years");
    }

    public void move() {
        System.out.println(getName() + " running");

    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is singing now");
        System.out.println(getName() + " is " + getAge() + " years");
    }

    public void move() {
        System.out.println(getName() + " flying" );

    }
}
class AnimalMain{
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 2);
        Cat cat = new Cat("Cat", 3);
        Bird bird = new Bird("Bird", 4);
        dog.makeSound();
        dog.move();
        cat.makeSound();
        cat.move();
        bird.makeSound();
        bird.move();
    }
}
