package Block2;

public class Car extends Vehicle{
private String carBody;

    public Car(String modelName, int wheelsCount, int carBody) {
        super(modelName, wheelsCount);
        this.carBody = String.valueOf(carBody);
        }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = String.valueOf(carBody);
    }


}
