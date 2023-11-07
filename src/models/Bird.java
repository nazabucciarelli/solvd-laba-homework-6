package models;

public class Bird extends Animal{
    public Bird(String name, double weight, Gender gender, Habitat habitat,
                Feeding feeding) {
        super(name, weight, gender, habitat, feeding);
    }

    @Override
    public void breath() {
        System.out.println("I breath oxygen from the air!");
    }

    @Override
    public void eat() {
        System.out.println("I eat seeds and worms!");
    }

    @Override
    public void sleep() {
        System.out.println("I like sleeping in branches from trees!");
    }
}
