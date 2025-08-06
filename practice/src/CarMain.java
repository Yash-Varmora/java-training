public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("swift");
        car.setHP(2);
        car.setColor("black");
        System.out.println(car.getModel());
        System.out.println(car.getHP());
        System.out.println(car.getColor());

        Car car1 = new Car("punch" , "black", 2);
        System.out.println(car1.getHP());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());


    }
}
