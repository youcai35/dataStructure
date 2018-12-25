package arrays.generic_data_structures_06;

/**
 * Description:
 * Author: gyc
 * Version: 1.0
 * Create Date Time: 2018/12/21 11:18
 * Update Date Time:
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice",90));
        arr.addLast(new Student("Bob,",80));
        arr.addLast(new Student("Lily",85));
        System.out.println(arr);
    }
}
