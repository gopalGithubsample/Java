public class ElectricCar extends Car {

    public ElectricCar() {} //No-argument constructor

    public ElectricCar(String model, String color, int numberOfDoors) {
        
    }

    @Override

    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.setmodel("EcoMobile");
        myElectricCar.setColor("Blue");
        myElectricCar.setnumberOfDoors(4);

        System.out.println(myElectricCar);
        myElectricCar.startEngine();
        myElectricCar.drive();

    }
}