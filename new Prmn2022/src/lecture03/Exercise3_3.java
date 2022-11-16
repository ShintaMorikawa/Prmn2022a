package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        int sum = 0;
        for (int i = 0;i < 2 ;i++){
            System.out.println(i + "つ目の整数を入力してください：");
            arrayList.add(input.next());
            int m = Integer.parseInt(arrayList.get(i));
            sum = sum + m;

        }
        System.out.println(arrayList.get(0) + " + " + arrayList.get(1) +" = " + sum);
    }
}
