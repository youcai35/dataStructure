package arrays.generic_data_structures_06;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/21 11:11
 * Update Date Time:
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(20);
        for (int i=0;i<10;i++)
            arr.addLast(i);
        System.out.println(arr);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        arr.removeElement(4);
        System.out.println(arr);
        arr.removeFirst();
        System.out.println(arr);

    }
}
