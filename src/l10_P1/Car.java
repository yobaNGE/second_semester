package l10_P1;

public class Car {
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        if (horsePower > 0)
        this.horsePower = horsePower;
        else {
            System.out.println("Incorrect hp.");
            System.exit(0);
        }
    }
    private String make;
    private String model;
    private int horsePower;

    public void getInfo(){
        System.out.printf("The car is: %s %s – %d HP.%n", make, model, horsePower);
    }
}
