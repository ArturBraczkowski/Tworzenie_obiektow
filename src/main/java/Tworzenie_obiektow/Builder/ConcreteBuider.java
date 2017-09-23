package Tworzenie_obiektow.Builder;

public class ConcreteBuider extends Builder {
    public void buildEngine() {
        car.setEngine("diesel");
    }

    public void buildBody() {
    car.setBody("karoseria");
    }

    public void buildGearBox() {
        car.setGearbox("automat");
    }

    public void buildWheels() {
        car.setNumberOfWheel(4);
    }
}
