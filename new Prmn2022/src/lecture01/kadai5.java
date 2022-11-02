package lecture01;

public class kadai5 {
    public static void main(String[] args) {

        int[] score = {41, 85, 72, 38, 80};
        int sum = 0;

        int m = min(score);
        int M = Max(score);
        double ave = average(score);

        System.out.println("最低点" + m + "点");
        System.out.println("最高点" + M + "点");
        System.out.println("平均点" + ave + "点");

        hantei(score);
    }


    static int min(int[] score) {
        int m = score[0];
        for (int i = 0; i < score.length; i++) {
            m = score[i];
        }
        return m;
    }

    static int Max(int[] score) {
        int M = score[0];
        for (int i = 0; i < score.length; i++) {
            M = score[i];
        }
        return M;
    }

    static double average(int[] score) {
        int sum = 0;
        double ave;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        ave = (double) sum / (double) score.length;

        return ave;
    }

    static void hantei(int[] score) {

        for (int i = 0; i < score.length; i++) {
            if (score[i] <= 100 && score[i] >= 90) {
                System.out.println("秀");
            }
            else if (score[i] >= 80) {
                System.out.println("優");
            }
            else if (score[i] >= 70) {
                System.out.println("良");
            }
            else if (score[i] >= 60) {
                System.out.println("可");
            }
            else {
                System.out.println("不可");
            }

        }
        return;
    }
}

