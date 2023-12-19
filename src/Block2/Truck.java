package Block2;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String modelName, int wheelsCount, int loadCapacity) {
        super(modelName, wheelsCount);
        this.loadCapacity = loadCapacity;
    }

}
