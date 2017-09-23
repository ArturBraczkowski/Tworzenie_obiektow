package Tworzenie_obiektow.AbstractFactory;

import Tworzenie_obiektow.Ciezarowe;
import Tworzenie_obiektow.Osobowe;

public class CarFactoryZBazyDanych implements AbstractCarFactory {
    public Ciezarowe createCarCiezarowy() {
        return new CiezaroweZBazyDanych();
    }

    public Osobowe createCarOsobowy() {
        return new OsoboweZBazyDanych();
    }
}
