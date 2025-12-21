abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

public class main {
    public static void main(String[] args) {
        FullTimeEmployee employee = new FullTimeEmployee("Ali", 45000);

        employee.showDetails();
        System.out.println("Monthly Salary: " + employee.calculateSalary());
    }
}
