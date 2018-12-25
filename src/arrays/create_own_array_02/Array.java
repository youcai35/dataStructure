package arrays.create_own_array_02;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/20 11:36
 * Update Date Time:
 */
public class Array {

    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size=0;
    }

    public Array() {
        this(10);
    }

    public int getCapacity(){
        return data.length;
    }

    public int getSize(){
        return size;
    }

}
