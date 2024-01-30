package Generics.Zoo;

public class Cage<E extends Animal & Eats & Runs> {
    private E animal1;
    private E animal2;

    public Cage() {
    }

    public Cage(E animal1, E animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    public boolean checkType(){
        return animal1.getType().equals(animal2.getType());
    }

    public void feedAnimal(){
        animal1.eat();
        animal2.eat();
    }

    /*
    In static methods, the method cannot access the generic type of the class, as static are not associated with the instance.
    We use the generic type in-between the static and the return type of the static function
    The generic type of the animals in the parameters are not from the class generic type it is from the static generic type.
    The wildcards are to be same or tend to be same as what the class has.
    */
    public static <E extends Animal> boolean compareAnimals(E animal1, E animal2){
        return animal1.getType().equals(animal2.getType());
    }
}
