package Tworzenie_obiektow.AbstractFactory;

import Tworzenie_obiektow.Ciezarowe;
import Tworzenie_obiektow.Osobowe;

public interface AbstractCarFactory {
    Ciezarowe createCarCiezarowy();
    Osobowe createCarOsobowy();
}
