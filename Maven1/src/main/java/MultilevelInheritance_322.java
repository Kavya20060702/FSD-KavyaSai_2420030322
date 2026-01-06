// 2420030322-P.Kavya Sai
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}
class ElectricCar extends Car {
    void charge() {
        System.out.println("ElectricCar is charging...");
    }
}

public class MultilevelInheritance_322 {
    public static void main(String[] args) {
        ElectricCar myEV = new ElectricCar();

        myEV.start(); 
        myEV.drive();
        myEV.charge(); 
    }
}
