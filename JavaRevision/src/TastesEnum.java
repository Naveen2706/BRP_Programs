public enum TastesEnum {                                                //enum outside class
    SWEET,
    SPICY,
    BITTER,
    SAULTY
}

class Main3 {
    enum WorkShifts {                                              //enum inside a class
        MORNING,
        AFTERNOON,
        NIGHT
    }

    public static void main(String[] args) {
        TastesEnum objTastes = TastesEnum.SWEET;                           //initialising enum 1
        System.out.println("enum 1 :" + objTastes);
        WorkShifts objWork = WorkShifts.MORNING;                   //initialising enum 2
        System.out.println("enum 2 :" + objWork);

        switch (objTastes) {                                        // enum use in switch statement
            case SPICY -> System.out.println("the taste is spicy");
            case SWEET -> System.out.println("the taste is sweet");
            case SAULTY -> System.out.println("the taste is saulty");
            case BITTER -> System.out.println("the taste is bitter");
        }
    }
}