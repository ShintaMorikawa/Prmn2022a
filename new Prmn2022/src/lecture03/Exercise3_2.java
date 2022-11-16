package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        int n = input.nextInt();

        input.nextLine();

        for (int i = 0;i < n ;i++){
            System.out.println((i+1) + "行目");
            String str = input.next();
            array.add(str);
        }

        int j = 0;
        for (String str : array){
            System.out.println("[" + j + "]" + str);
            j++;
        }

    }
}
