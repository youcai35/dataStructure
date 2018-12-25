package stack_and_queues.array_stack;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/21 13:51
 * Update Date Time:
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i=0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
