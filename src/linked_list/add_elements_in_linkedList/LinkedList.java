package linked_list.add_elements_in_linkedList;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/21 16:47
 * Update Date Time:
 */
public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;
        public Node(E e,Node next){
            this.next = next;
            this.e = e;
        }
        public  Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    private int size;
    public LinkedList(){
        head = null;
        size =0;
    }

    //获取链表中的元素个数
    public int getSize(){
        return size;
    }
    //返回链表是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //在链表头添加新的元素
    public void addFirst(E e){
        Node node = new Node(e);
        node.next = head;
        head = node;
        size++;
    }

    //在链表的index位置添加新的元素e
    public void add(int index,E e){
        if(index<0||index>size)
            throw new IllegalArgumentException("Add failed. Illegal index.");
        if (index==0){
            addFirst(e);
        }else {
            Node prev = head;
            for (int i=0;i<index-1;i++)
                prev = prev.next;
            prev.next = new Node(e,prev.next);
            size++;
        }
    }
    // 在链表末尾添加新的元素e
    public void addLast(E e){
        add(size,e);
    }
}
