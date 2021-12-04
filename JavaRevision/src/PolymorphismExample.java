public class PolymorphismExample {
    public void animalSound() {
        System.out.println("The animal makes sounds");
    }
}

class Cat extends PolymorphismExample {
    @Override
    public void animalSound() {
        System.out.println("sound of cat is : meaw meaw ");
    }
}
    class Dog extends PolymorphismExample {
        @Override
        public void animalSound() {
            System.out.println("sound of dog is : bow bow");
        }
    }


class Main {
    public static void main(String[] args) {
        PolymorphismExample parentObj = new PolymorphismExample();          //parent object
        Dog dogObj = new Dog();             //child 1 object
        Cat catObj = new Cat();             //child 2 object

        parentObj.animalSound();            //parent method
        dogObj.animalSound();                  //overriding of parent method
        catObj.animalSound();                  //overriding of parent method2
    }
}