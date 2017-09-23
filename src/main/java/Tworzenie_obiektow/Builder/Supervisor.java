package Tworzenie_obiektow.Builder;

public class Supervisor {
    private Builder carBuilder;

    public void setCarBuilder(Builder carBuilder){

    }
    public Car getCar (){
        return  carBuilder.getCar();
    }

    public  void constructCar(){
        carBuilder.createNewCar();
        carBuilder.buildBody();
        carBuilder.buildEngine();
        carBuilder.buildGearBox();
        carBuilder.buildWheels();
    }
}
