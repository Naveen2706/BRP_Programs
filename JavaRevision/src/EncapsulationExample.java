public class EncapsulationExample {             //Encapuslated class
    private String name;            /* To achieve encapsulation in Java −
                                        Declare the variables of a class as private.
                                        Provide public setter and getter methods to modify and view the variables values. */

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main4 {
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setName("Naveen Patekar");                          //setter method used as we are giving value from outside class
        obj.setAge(22);
        System.out.println(obj.getName());                      //accessing outside class
        System.out.println(obj.getAge());
    }
}
