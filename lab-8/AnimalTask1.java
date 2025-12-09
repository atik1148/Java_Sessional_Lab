class Animal {
    void sound() {
        System.out.println("Animal:Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog:Bark, Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat:meow, meow");
    }
}

public class AnimalTask1 {
    public static void main(String[] args) {
        System.out.println("==Animal Sound==");
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.sound();
        cat.sound();
        dog.sound();
    }
}
