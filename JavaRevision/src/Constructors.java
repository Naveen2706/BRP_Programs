public class Constructors {
    public int x;
    public Constructors(int x){         // parameterised constructor
        this.x = x;                     //this key word mentions that the parameter x and the variable x is different and removes ambiguity
    }                           //All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

    public static void main(String[] args) {
        Constructors obj = new Constructors(500);
        System.out.println(obj.x);
        obj.x = 100;
        System.out.println(obj.x);
    }
}
