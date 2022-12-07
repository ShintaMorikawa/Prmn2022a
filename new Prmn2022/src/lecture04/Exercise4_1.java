package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100,20,"hikari");
        Fighter fighter2 = new Fighter(80,30,"jin");

        while (true){
            if(fighter1.isAlive()) {
                fighter1.attack(fighter2);
            }
            else{
                System.out.println(fighter2.getName() + "は倒れました。");
                break;
            }
            if (fighter2.isAlive()) {
                fighter2.attack(fighter1);
            }
            else {
                    System.out.println(fighter2.getName() + "は倒れました。");
                    break;
                }

        }
    }
}
