package lecture02;

public class Gasstation2 {
    void refuel(Car2 car2){
        car2.fuel = car2.fuel + 20;
        System.out.println("給油したことにより、fuelが20増加しました。");
        return;
    }
}
