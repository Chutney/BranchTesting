public class Cat extends Animal {

    @Override
    String makeSound() {
        return "Meow";
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }
}
