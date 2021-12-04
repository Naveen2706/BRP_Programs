public class Recursion {
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        System.out.println(obj.addRepeat(10));
    }

    int addRepeat(int num) {
        if (num > 0)                //if else should be there to avoid infinte looping
            return num + addRepeat(num - 1);
        else
            return 0;
    }
}
