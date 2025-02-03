public abstract class Car {
    private String model;
    private String color;
    private int numberOfDoors;

    public Car() {} 

    public Car(String model, String color, int numberOfDoors) {
        this.model = model;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    public abstract void startEngine();

    public void drive() {
        System.out.println("The car is driving.");
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Doors: " + numberOfDoors; // isElectric removed from toString
    }
}