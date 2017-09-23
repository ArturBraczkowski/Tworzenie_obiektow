package Tworzenie_obiektow.AbstractFactory;

import Tworzenie_obiektow.Ciezarowe;
import Tworzenie_obiektow.Osobowe;

public class Client {
    AbstractCarFactory carFactory = new CarFactoryFromFile();
    //AbstractCarFactory carFactoryZBazyDanych = new CarFactoryZBazyDanych();

    Ciezarowe man = carFactory.createCarCiezarowy();
    Osobowe audi = carFactory.createCarOsobowy();
}
