public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    boolean eat(String foodType) {
        return true;
    }

    @Override
    void jump(double distance) {
        System.out.println("Dog jumped "+distance);
    }
}
