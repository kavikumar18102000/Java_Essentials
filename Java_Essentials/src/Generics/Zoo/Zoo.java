package Generics.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage<>();
        monkeyCage.setAnimal1(new Monkey(null));
        monkeyCage.setAnimal2(new Monkey(null));

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion(null));
        lionCage.setAnimal2(new Lion(null));


        //Generics with constructors
//        Cage<Monkey> cage = new Cage(new Monkey(),new Lion()); //this will work if the generic is not provided for the constructors

//        Cage<Monkey> cage2 = new Cage<Monkey>(new Monkey(),new Lion()); // the constructor will not take the lion object.

        //Accessing static method in generic type
        Cage.compareAnimals(new Monkey(null),new Monkey(null));

    }
}
