package Tworzenie_obiektow;

public class CiezaroweCreator implements Creator {
    public Samochod createCar() {
        return new Ciezarowe();
    }
}
