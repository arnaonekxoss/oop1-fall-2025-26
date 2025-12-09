class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }
}

class Employee {
    private String name;
    private Position position;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position.getTitle());
        System.out.println("Salary: " + position.getSalary());
        System.out.println("---------------------------");
    }
}

class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int size) {
        this.companyName = companyName;
        employees = new Employee[size];
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
        } else {
            System.out.println("Company staff limit reached!");
        }
    }

    public void showEmployees() {
        System.out.println("=== Employees of " + companyName + " ===");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Position p1 = new Position("Manager", 55000);
        Position p2 = new Position("Developer", 40000);
        Position p3 = new Position("Accountant", 35000);

        Employee e1 = new Employee("Alice", p1);
        Employee e2 = new Employee("Bob", p2);
        Employee e3 = new Employee("Charlie", p3);

        Company comp = new Company("Tech Solutions Ltd.", 5);

        comp.addEmployee(e1);
        comp.addEmployee(e2);
        comp.addEmployee(e3);

        comp.showEmployees();
    }
}
