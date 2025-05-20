//multilevel inheritance
public class Animals {
    void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}


