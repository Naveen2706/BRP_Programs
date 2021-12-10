@FunctionalInterface
interface Say {            //functional interface only have 1 abstract method but can have many default and static methods
    void say(String msg);
}

class FunctionalInterfaceExample implements Say {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
        obj.say("Good Morning");
    }
}
