package binary_search_tree_basics.add_elements_in_bst;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/25 09:54
 * Update Date Time:
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
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
        return size==0;
    }

    // 向二分搜索树中添加新的元素e
    public void add(E e){
        if (root ==null){
            root = new Node(e);
            size++;
        }else {
            add(root,e);
        }
    }
    //向以node为根的二分搜索树中插入元素e，递归算法
    private void add(Node node,E e){
        if (e.equals(node.e))
            return;
        else if (e.compareTo(node.e)<0&&node.left ==null){
            node.left = new Node(e);
            size++;
            return;
        }
        else if (e.compareTo(node.e)>0|| node.right==null){
            node.right = new Node(e);
            size++;
            return;
        }
        if (e.compareTo(node.e)<0)
            add(node.left,e);
        else
            add(node.right,e);
    }

}
