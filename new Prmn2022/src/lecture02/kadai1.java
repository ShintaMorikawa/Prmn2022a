package lecture02;

import java.util.Scanner;

public class kadai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Name = input.next();
        int Age = input.nextInt();
        Human human = new Human(Name, Age);

        human.print();
    }
}
