package Lesson_1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Иванов", 30, 50000, "IT");
        Employee emp2 = new Employee(2, "Петров", 40, 60000, "Маркетинг");

        System.out.println("До повышения зарплаты:");
        emp1.printInfo();
        emp2.printInfo();

        emp1.doubleSalary();
        emp2.doubleSalary();

        System.out.println("\nПосле повышения зарплаты:");
        emp1.printInfo();
        emp2.printInfo();
    }
}
