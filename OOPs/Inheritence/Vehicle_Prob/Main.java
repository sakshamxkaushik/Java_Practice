package OOPs.Inheritence.Vehicle_Prob;

public class Main {
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive(); // Output: Repairing a vehicle
        car.drive(); // Output: Repairing a car
    }
}
