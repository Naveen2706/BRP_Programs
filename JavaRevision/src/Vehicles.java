public interface Vehicles {                     //interface
    public void vehicleModel();                 //abstract methods- no body
    public void vehicleSound();
    public void vehicleType();
}


class Car implements Vehicles {                     //interface implemented
                                                    // body to abstract methods
    @Override
    public void vehicleModel() {
        System.out.println("Car Model : Totyota Fortuner");
    }

    @Override
    public void vehicleSound() {
        System.out.println("horn : Paap");
    }

    @Override
    public void vehicleType() {
        System.out.println("Vehicle type : SUV");
    }
}

class Main2 {                                           // main method
    public static void main(String[] args) {
    Car obj = new Car();                                // implemented method object
    obj.vehicleModel();
    obj.vehicleType();
    obj.vehicleSound();
    }
}