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
    void mood(boolean mood) {
        if(mood) {
            System.out.println("Logre");
        } else {
            System.out.println("Knurrer");
        }
    }
}
