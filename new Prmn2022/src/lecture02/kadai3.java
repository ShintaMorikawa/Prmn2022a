package lecture02;

public class kadai3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for(int i = 0;i < tires.length;i++){
            tires[i] = new Tire(65);

        }
        Engine e =  new Engine(4000);
        Car2 car2 = new Car2(tires,e);

        Gasstation2 gas = new Gasstation2();
        gas.refuel(car2);

        car2.startEngine();
        car2.run();
    }
}
