package chapterthree.practiceexercises;

/**
 * Tests the Employee class methods
 */
public class ThreePETwelve {
    public static void main(String[] args) {
        Employee harry = new Employee("Hacker, Harry", 50000);

        System.out.println(harry.getName());
        System.out.println("Hacker, Harry");

        harry.raiseSalary(10);
        System.out.println(harry.getSalary());
        System.out.println("Expected: 55000");
    }
}
