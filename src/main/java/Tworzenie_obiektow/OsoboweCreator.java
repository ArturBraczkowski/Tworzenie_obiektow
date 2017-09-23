package Tworzenie_obiektow;

public class OsoboweCreator implements Creator {
    public Samochod createCar() { // obiekt z bazy danych
     return  new Osobowe();
    }

}
