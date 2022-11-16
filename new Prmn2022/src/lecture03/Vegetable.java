package lecture03;

public class Vegetable {
    String name;
    int value;

    Vegetable(String name,int value){
        this.name = name;
        this.value = value;
    }
    void print(){
        System.out.println(name + "の値段は" + value + "円");
        return;
    }
}
