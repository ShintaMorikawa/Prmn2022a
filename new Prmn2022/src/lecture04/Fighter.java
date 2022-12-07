package lecture04;

public class Fighter {

    private int hitpoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitpoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        int Ep = enemy.getHitpoint();
        Ep = Ep - this.power;
        enemy.setHitpoint(Ep);
        System.out.println(this.name + "は" + enemy.getName() + "に" + this.power + "のダメージを与えた。");
        System.out.println(enemy.getName() + "の残りHPは" + Ep);
    }

    public boolean isAlive(){
        if(hitpoint > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getHitpoint(){
        return this.hitpoint;
    }

    public void setHitpoint(int hitpoint){
        this.hitpoint = hitpoint;
    }
    public String getName(){
        return this.name;
    }
}
