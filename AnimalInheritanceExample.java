// Parent class (or superclass)
class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The animal is eating");
    }
}

// Child class (or subclass) inheriting from Animal
class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println("The dog is barking");
    }
}

// Child class (or subclass) inheriting from Animal
class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    public void meow() {
        System.out.println("The cat is meowing");
    }
}

// Main class to test the inheritance
public class AnimalInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();
    }
}
