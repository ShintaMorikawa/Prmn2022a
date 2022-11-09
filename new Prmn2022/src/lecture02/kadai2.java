package lecture02;

public class kadai2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        GasStation gas = new GasStation();
        gas.refuel(car);

        car.run();
    }
}
