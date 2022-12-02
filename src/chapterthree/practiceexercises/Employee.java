package chapterthree.practiceexercises;

/**
 * Manages the name & salaries of employees
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an object with a name and salary
     * @param employeeName The full name of the employee in the format "First, Last"
     * @param currentSalary The salary of the employee in Canadian dollars per year
     */
    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    /**
     * @return the name attached to the object
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary attached to the object
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Raises the salary of the object by a percent
     * @param byPercent a value (double) of the percentage to increase the salary by
     */
    public void raiseSalary(double byPercent) {
        salary += salary * byPercent;
    }
}
