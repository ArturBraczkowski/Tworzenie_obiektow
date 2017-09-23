package Tworzenie_obiektow.Builder;

public class Client {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        Builder carBuilder = new ConcreteBuider();
        Builder motorBuilder = new MotorBuilder();
    }
}
