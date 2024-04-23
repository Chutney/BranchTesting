public class Dog extends Animal {

    @Override
    String makeSound() {
        return "Wooof";
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }
}
