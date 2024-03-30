class Vehicle {
    int speed;
    int fuelCapacity;
    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }
    void displayInfo() {
        System.out.println("Vehicle - Speed: " + speed + " mph, Fuel Capacity: " + fuelCapacity + " gallons");
    }
}
class Car extends Vehicle {
    int numberOfDoors;
    Car(int speed, int fuelCapacity, int numberOfDoors) {
        super(speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }
    void displayCarInfo() {
        System.out.println("Car - Speed: " + speed + " mph, Fuel Capacity: " + fuelCapacity + " gallons, Doors: " + numberOfDoors);
    }
}
class Bicycle extends Vehicle {
    int numberOfGears;
    public Bicycle(int speed, int fuelCapacity, int numberOfGears) {
        super(speed, fuelCapacity);
        this.numberOfGears = numberOfGears;
    }
    public void displayBicycleInfo() {
        System.out.println("Bicycle - Speed: " + speed + " mph, Fuel Capacity: " + fuelCapacity + " gallons, Gears: " + numberOfGears);
    }
    public static void main(String[] args) {
        // Creating an instance of Bicycle
        Bicycle myBicycle = new Bicycle(20, 0, 5);
        myBicycle.displayInfo();
        myBicycle.displayBicycleInfo();
Car myCar = new Car(60, 15, 4);
        myCar.displayInfo();
        myCar.displayCarInfo();
    }
}



