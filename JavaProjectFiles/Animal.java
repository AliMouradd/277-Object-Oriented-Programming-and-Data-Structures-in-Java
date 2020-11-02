package zybooks_labs;

public class Animal {
    String species;
    public Animal(String species){
        this.species = species;
    }

    public void makeSounds() {
        System.out.println("Animal make sounds!");
    }

    public String toString(){
        return "I am a "+ species;
    }

    public static void main(String[] args) {
        Dog animal1 = new Dog("Dog");
        Pig animal2 = new Pig("Pig");
        Animal[] myAnimals = {animal1, animal2};
        for(Object o: myAnimals){
            ((Animal)o).makeSounds();}
    }
}

class Dog extends Animal{

    public Dog(String species) {
        super(species);
    }

    public void makeSounds(){
        System.out.println(toString()+"\nWoof! Woof!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


class Pig extends Animal{

    public Pig(String species) {
        super(species);
    }

    public void makeSounds(){
        System.out.println(toString()+"\nWee! Wee!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
