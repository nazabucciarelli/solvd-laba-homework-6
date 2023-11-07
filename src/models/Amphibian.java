package models;

public class Amphibian extends Animal{
    public Amphibian(String name, double weight, Gender gender, Habitat habitat,
                     Feeding feeding) {
        super(name, weight, gender, habitat, feeding);
    }

    @Override
    public void breath() {
        System.out.println("I can breath in the water and outside of it!");
    }

    @Override
    public void eat() {
        System.out.println("I like eating worms and other bugs!");
    }

    @Override
    public void sleep() {
        System.out.println("I usually sleep in cold or wet places!");
    }
}
