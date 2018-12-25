package binary_search_tree_basics.binary_search_tree_basics;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/25 09:21
 * Update Date Time:
 */
public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left,right;
        public Node(E e){
            this.e = e;
            left =null;
            right = null;
        }
    }

    private Node root;
    private int size;
    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
}
