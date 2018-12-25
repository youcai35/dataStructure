package arrays.contain_find_and_remove_05;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/20 17:57
 * Update Date Time:
 */
public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        for (int i=0;i<10;i++)
            arr.addLast(i);
        arr.add(1,100);
        System.out.println(arr);
        arr.addFirst(-1);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.removeElement(4);
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);
    }
}
