package lecture02;

public class Car2 {

        int fuel;
        Tire[] tires;
        Engine engine;
        Car2(Tire[] tires,Engine engine){
            this.fuel = 0;
            this.tires = tires;
            this.engine = engine;
        }

        void startEngine(){
            engine.start();
        }

        void run(){

            if(fuel > 0) {
                this.fuel = this.fuel - 1;
                System.out.println("燃料を1消費して走りました。");
            }
            else{
                System.out.println("燃料が足りないため走れませんでした。");
            }
            return;
        }
    }


