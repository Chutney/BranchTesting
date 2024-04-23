public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }
}
