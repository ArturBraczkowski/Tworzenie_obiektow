package Tworzenie_obiektow.Singleton;

    public final class Singleton {
        private final static Singleton ourInstance = new Singleton();
        public static Singleton getInstance() {
            return ourInstance;
        }

        //żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
        private Singleton() {
        }
    }

//SINGLETON
// -singleton: Singleton
// ----------------------
// -Singleton()
//+ getInstance(): Singleton
