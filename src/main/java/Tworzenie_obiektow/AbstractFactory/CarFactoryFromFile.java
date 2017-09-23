package Tworzenie_obiektow.AbstractFactory;

import Tworzenie_obiektow.Ciezarowe;
import Tworzenie_obiektow.Osobowe;

public class CarFactoryFromFile implements AbstractCarFactory {
    public Ciezarowe createCarCiezarowy() {
        return new CiezaroweZPliku();
    }

    public Osobowe createCarOsobowy() {
        return new OsoboweZPliku();
    }
}


//public final class Singleton {
//    private final static Singleton ourInstance = new Singleton();
//    public static Singleton getInstance() {
//        return ourInstance;
//    }
//
//    //żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
//    private Singleton() {
//    }
//}

//SINGLETON
// -singleton: Singleton
// ----------------------
// -Singleton()
//+ getInstance(): Singleton