package Block3;

public class Truck {
    public String modelName;
    public int wheelsCount;
    public Truck (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
        public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
        public void checkEngine() {
        System.out.println("Проверить двигатель");
    }
        public void checkTrailer() {
        System.out.println("Проверить трейлер");
    }
}
