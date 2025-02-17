package Lesson_1;

public class StudentTest {
    public static void printAverageGrade(Student student) {
        double average = (student.grade1 + student.grade2 + student.grade3) / 3;
        System.out.println("Средний балл студента " + student.name + ": " + average);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Иван", 20, 4.5, 3.8, 5.0);
        Student student2 = new Student("Мария", 21, 5.0, 4.2, 4.8);

        printAverageGrade(student1);
        printAverageGrade(student2);
    }
}