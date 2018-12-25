package stack_and_queues.Array_Queue;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/21 14:39
 * Update Date Time:
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
