package Block3;

public class Car {
    public String modelName;
    public int wheelsCount;
    public Car (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверить двигатель");
    }
}
