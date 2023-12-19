package Block2;

public class Vehicle {
    public String modelName;
    public int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void fillFuel(String fuel, int x) {
        System.out.println("Залить топливо");
    }
    public void fillFuel(String hybrid, int x, int y) {
        System.out.println("Залить бензин и зарядить аккумулятор");
    }
}
