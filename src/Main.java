public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        cat.eat("fish");
        dog.eat("chicken");

        dog.mood(true);
        dog.mood(false);
        cat.mood(true);
        cat.mood(false);
    }
}
