package Tworzenie_obiektow.Builder;

public abstract class Builder {
    protected Car car;
    public Car getCar(){
        return car;
    }
    public void createNewCar(){
        car = new Car();
    }
    public abstract void buildEngine();
    public abstract void buildBody();
    public abstract void buildGearBox();
    public abstract void buildWheels();
}
