public class StaticAndNonStatic {
    static void staticMethod() {
        System.out.println("THis is Static method");
    }

    public void nonStaticMethod(){
        System.out.println("this is Non static Method");
    }

    public static void main(String[] args) {
        StaticAndNonStatic obj = new StaticAndNonStatic();
        obj.nonStaticMethod();
        staticMethod();
    }
}
