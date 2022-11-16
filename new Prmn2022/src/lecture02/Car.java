package lecture02;

import javax.swing.plaf.BorderUIResource;

public class Car {
    int fuel;
    Car(){
        this.fuel = 0;

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
