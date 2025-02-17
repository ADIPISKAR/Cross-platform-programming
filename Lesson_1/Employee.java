package Lesson_1;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void doubleSalary() {
        this.salary *= 2;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Фамилия: " + surname + ", Возраст: " + age +
                ", Зарплата: " + salary + ", Отдел: " + department);
    }
}
