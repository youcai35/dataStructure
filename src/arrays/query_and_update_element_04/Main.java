package arrays.query_and_update_element_04;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/20 14:31
 * Update Date Time:
 */
public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i=0;i<10;i++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
    }
}
