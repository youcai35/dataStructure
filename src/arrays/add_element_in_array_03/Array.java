package arrays.add_element_in_array_03;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/20 13:44
 * Update Date Time:
 */
public class Array {

    private int[] data;
    private int size;

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //返回数组是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //向所有元素后天就一个新元素
    public void addLast(int e){
        if(size==data.length)
            throw  new IllegalArgumentException("AddLast failed. Array is full");
        data[size]=e;
        size++;
    }

    //在index索引的位置插入一个新元素e
    public void add(int index,int e){
        if (size==data.length)
            throw new IllegalArgumentException("Add failed. Array is full.");

        if (index<0||index>size)
            throw new IllegalArgumentException("Add failed. Require index >=0 and index<=size");

        for (int i= size-1;i>=index;i--)
            data[i+1]=data[i];
        data[index]=e;
        size++;
    }

    // 在所有的元素前添加一个新元素

    public void addFirst(int e){
        add(0,e);
    }

}
