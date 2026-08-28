class Emp {
    private int empId;
    private String empName;
    private double salary;

    Emp(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class empManagement {
    public static void main(String[] args) {

        Emp e1 = new Emp(101, "Alice", 50000);
        Emp e2 = new Emp(102, "Bob", 60000);
        Emp e3 = new Emp(103, "Charlie", 70000);

        e1.display();
        e2.display();
        e3.display();
    }
}