/**
 * Created with IntelliJ IDEA.
 * User: ying
 * Date: 10/30/19
 * Time: 16:31
 * Description: No Description
 */
public class Student {

    private String name;
    private int score;

    public Student(String studentName, int studentScore) {
        this.name = studentName;
        this.score = studentScore;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
        // write your code here
        Array<Student> arr = new Array<Student>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 66));
        arr.addLast(new Student("Charlie", 88));
        System.out.println(arr);
    }
}

