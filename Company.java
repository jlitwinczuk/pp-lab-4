import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 10000, 0);
        employees[1] = new Worker("Janusz Nowak", 20001, "Engineer");
        employees[2] = new Employee("Kunegunda Kunegundowa", 13000);
        employees[3] = new Employee("Juliusz Cezar", 2000);
        employees[4] = new Worker("Michael Jordan", 12546, "Developer");

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}