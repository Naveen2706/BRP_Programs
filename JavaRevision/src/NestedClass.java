public class NestedClass {              //outer class
    public static int variable1 = 111;

    class InnerClass {        //inner class can be private, protected, static
        int variable2 = 555;

        public int returnVar() {            //inner class can access outer attributes and methods
            return variable1;
        }
    }

    public static void main(String[] args) {
        NestedClass outerObj = new NestedClass();  //outer class obj is created for creating inner class obj to access it
        NestedClass.InnerClass innerObj = outerObj.new InnerClass();
        System.out.println(innerObj.variable2);
        System.out.println(variable1);
        System.out.println(innerObj.returnVar());
    }
}
