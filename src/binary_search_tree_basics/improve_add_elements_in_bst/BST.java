package binary_search_tree_basics.improve_add_elements_in_bst;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/25 10:48
 * Update Date Time:
 */
public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left,right;
        public Node(E e){
            this.e = e;
            left = null;
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
        return size ==0;
    }

    //向二分搜索树中添加新的元素e
    public void add(E e){
        root = add(root,e);
    }
    // 向以node为根的二分搜索树中插入元素e，低估算法
    //返回插入新节点后二分搜索树的根
    private Node add(Node node,E e){
        if (node==null){
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e)<0)
            node.left = add(node.left,e);
        else if (e.compareTo(node.e)>0)
            node.right = add(node.right,e);
        return node;
    }
}
