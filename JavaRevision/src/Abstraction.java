abstract class Abstraction {
    public abstract void sound();
    public void numOfLegs() {                   //normal method
        System.out.println("2 legs");
    }
}

class Child extends Abstraction {                   //inherited class of abstract class
    @Override
    public void sound() {                           //body given to abstract method in inherited class
        System.out.println("Humans speak different languages");
    }
}

class Main1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.sound();
        obj.numOfLegs();                //normal method called directly by inherited class
    }
}