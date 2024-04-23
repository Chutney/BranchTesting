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
    void mood(boolean mood) {
        if(mood) {
            System.out.println("Spinder");
        } else {
            System.out.println("Hvæser");
        }
    }
}
