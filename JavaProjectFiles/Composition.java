package zybooks_labs;

class Person {
    String name;
    Object favoriteFruit;

    public Person(String name, Fruit favoriteFruit){
        this.name = name;
        this.favoriteFruit = favoriteFruit;
    }
    public String toString(){
        return name+"'s favorite fruit is "+ favoriteFruit;
    }

//    public static void main(String[] args) {
//        Fruit banana = new Fruit("yellow", "banana");
//        Person uncle = new Person("Ali", banana);
//        System.out.println(uncle);
//    }
}

class Fruit{
    String color;
    String description;

    public Fruit(String color, String description){
        this.color = color;
        this.description = description;
    }

    public String toString(){
        return color + " color "+ description;
    }

}

