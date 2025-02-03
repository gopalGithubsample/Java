public class SportsCar extends Car {
    

    public SportsCar() {}

    public SportsCar(String model, String color, int numberOfDoors) { 
    }

    

    @Override
    public void startEngine() {
        System.out.println("The sports car engine roars to life!");
    }

    @Override
    public void drive() {
        System.out.println("The sports car is accelerating rapidly!");
    }

    public static void main(String[] args) {
        SportsCar mySportsCar = new SportsCar();
        mySportCar.setmodel("SuperFast");
        mySportCar.setColor("Red");
        mySportCar.setnumberOfDoors(4);

        System.out.println(mySportsCar);
        mySportsCar.startEngine();
        mySportsCar.drive();

        mySportsCar.setColor("Black");
        System.out.println(mySportsCar);
    }
}