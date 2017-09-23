package Tworzenie_obiektow.Singleton_Thread_Safe;

public final class CarFactoryFromFile {
    private static volatile CarFactoryFromFile instance = null;
    public static CarFactoryFromFile getInstance(){
        if (instance == null) {
            synchronized (CarFactoryFromFile.class) {
                if (instance == null) {
                    instance = new CarFactoryFromFile();
                }
            }
        }
        return instance;
    }
    private CarFactoryFromFile(){

    }
}


//SINGLETON
// -singleton: Singleton
// ----------------------
// -Singleton()
//+ getInstance(): Singleton
