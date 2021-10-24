package all_animals;

public class ListeningToAnimals {
    public static void main (String [] args) {
        Cat kitty = new Cat();
        Dog puppy = new Dog();
        Rabbit fluffy = new Rabbit();
        kitty.sleep();
        kitty.voice();
        kitty.eat();
        kitty.voice();
        puppy.voice();
        fluffy.voice();
    }
}
