public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }

    @Override
    void jump(double distance) {
        System.out.println("Cat jumped "+distance);
    }
}
