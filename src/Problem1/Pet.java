package Problem1;

abstract class Pet {
    public abstract void
makeSound();
}
class Cat extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Dog extends Pet {
    @Override
    public void makeSound() {
        System.out.println("Bow Bow");

    }
}