interface Vehicles {                     //interface 1
    public void vehicleModel();          //abstract methods- no body
    public void vehicleSound();
    public void vehicleType();
}

interface WheelsOfVehicle {             //interface 2

    public void wheelBrand();
    void numOfWheels();
}


class Car implements Vehicles, WheelsOfVehicle {                     //multiple interfaces implemented
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

    @Override
    public void wheelBrand() {
        System.out.println("Wheel brand : Ceat");
    }

    @Override
    public void numOfWheels() {
        System.out.println("Number of Wheels : 4");
    }
}

class Main2 {                                           // main class
    public static void main(String[] args) {
        Car obj = new Car();                                // implemented class object
        obj.vehicleModel();                                 //first interface methods
        obj.vehicleType();
        obj.vehicleSound();
        obj.wheelBrand();                                   //second interface methods
        obj.numOfWheels();
    }
}