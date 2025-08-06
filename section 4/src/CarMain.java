public class CarMain {
    public static void main(String[] args) {
        System.out.println("main is executed");
        Car car1 = new Car();
        Car car2 = new Car("Camry", "Black", 200);

        System.out.println(Car.noOfEngines);
    }
}
