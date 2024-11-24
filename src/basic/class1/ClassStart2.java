package basic.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] students = {"학생1", "학생2"};
        int[] ages = {15, 16};
        int[] grades = {90, 80};

        for (int i = 0; i < students.length; i++) {
            System.out.printf("이름: %s 나이: %d 성적: %d\n", students[i], ages[i], grades[i]);
        }
    }
}
