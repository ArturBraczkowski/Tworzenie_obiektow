package Tworzenie_obiektow.AbstractFactory.Prototypy;

public class Car implements Cloneable {
    public Object clone() {
        try {
            Car copy = (Car) super.clone(); //tak najłatwiej uruchomić clonowanie.
            return copy;
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


}


