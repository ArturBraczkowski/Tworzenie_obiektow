package Tworzenie_obiektow.AbstractFactory.Prototypy;

public class CarMachine { //as client
    private  Car car;

    public  CarMachine(Car car){
        this.car = car;
    }

    public Car makeCar(){
        return (Car)car.clone();  //rzutujemy
    }

    public static void main(String[] args) {
        Car tempCar = null;
        Car prot = new MazdaCar();
        CarMachine cm = new CarMachine(prot);
        for (int i = 0; i <100 ; i++) { // 100 jest przykładowe
            tempCar = cm.makeCar();
        }
    }
}
