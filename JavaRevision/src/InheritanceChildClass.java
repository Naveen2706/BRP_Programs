public class InheritanceChildClass extends InheritanceSuperClass {
    private String model = "Camry";         //child attribute

    public static void main(String[] args) {
        InheritanceChildClass carObj = new InheritanceChildClass();
        carObj.horn();                                                      //parent method called through child obj
        System.out.println("Car Brand is : " + carObj.brand + '\n' + "Car Model is :" +  carObj.model);
    }
}
