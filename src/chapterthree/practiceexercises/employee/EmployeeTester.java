package chapterthree.practiceexercises.employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee test = new Employee("Fname, Lname", 50000);
        System.out.println("Employee name: expected - \"Fname, Lname\", actual -" + test.getName());
        test.raiseSalary(20);
        System.out.println("test.raiseSalary(20) - raising salary by 20%");
        System.out.println("Salary after: expected - 60000, actual - " + test.getSalary());
    }
}