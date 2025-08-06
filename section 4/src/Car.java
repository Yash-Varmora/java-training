public class Car {

    String model;
    String color;
    int horsePower;
    static final byte NO_OF_WHEELS = 4;
    static byte noOfEngines;

    static {
        noOfEngines = 1;
        System.out.println("static block is executed");
    }

    {
//        this.model = "Camry";
//        this.color = "Red";
//        this.horsePower = 200;
        System.out.println("Car is created");
    }

    public Car() {
//        System.out.println("car object created");
    }

    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        System.out.println("car object created");
    }

    public void startCar() {
        System.out.println("Car started");
    }

    public String stopCar() {
        String output = "Car stopped";
        return output;
    }
}
