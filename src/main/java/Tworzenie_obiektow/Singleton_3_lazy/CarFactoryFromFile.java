package Tworzenie_obiektow.Singleton_3_lazy;

public class CarFactoryFromFile {
    private CarFactoryFromFile () {

    }
    private final static class CarHolder {
        private final static CarFactoryFromFile instance = new CarFactoryFromFile();
    }
    public final static CarFactoryFromFile getInstance() {
        return CarHolder.instance;
    }
}


//SINGLETON
// -singleton: Singleton
// ----------------------
// -Singleton()
//+ getInstance(): Singleton