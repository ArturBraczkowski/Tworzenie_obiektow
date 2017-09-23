package Tworzenie_obiektow.Builder;

public class Car {  //wcześniej były tylko: zmienne klasowe i settery.
    // Reszta została dodana przez plugin InnerBuilder (nie potrzebuje setterow)
    String engine;
    String body;
    String gearbox;
    int numberOfWheel;

    private Car(Builder builder) {
        setEngine(builder.engine);
        setBody(builder.body);
        setGearbox(builder.gearbox);
        setNumberOfWheel(builder.numberOfWheel);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public static final class Builder {
        private String engine;
        private String body;
        private String gearbox;
        private int numberOfWheel;

        private Builder() {
        }

        public Builder withEngine(String val) {
            engine = val;
            return this;
        }

        public Builder withBody(String val) {
            body = val;
            return this;
        }

        public Builder withGearbox(String val) {
            gearbox = val;
            return this;
        }

        public Builder withNumberOfWheel(int val) {
            numberOfWheel = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
