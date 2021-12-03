final public class FinalKeyword {           //final class can't be inherited
    final int x = 50;                        //final makes value of variable/attribute constant

            final void printName (){        //you cannot override final method
                System.out.println("My name is : Naveen");
            }

    public static void main(String[] args) {
       FinalKeyword obj = new FinalKeyword();
        System.out.println(obj.x);
        obj.printName();
    }
}
