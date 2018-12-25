package arrays.array_basics_01;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/19 17:38
 * Update Date Time:
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;

        int[] scores = new int[]{100,99,66};

        for (int i=0;i<scores.length;i++)
            System.out.println(scores[i]);

        for (int score:scores)
            System.out.println(score);

        scores[0] = 96;

        for (int i=0;i<scores.length;i++)
            System.out.println(scores[i]);
    }
}
