package chapterthree.programmingprojects;

public class StudentTester {
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addQuiz(78);
        bob.addQuiz(62);
        System.out.println(bob.getAverageScore());
        System.out.println("Expected: 70");
        System.out.println(bob.getTotalScore());
        System.out.println("Expected: 140");
        System.out.println(bob.getName());
        System.out.println("Expected: Bob");
        System.out.println();

        Student jerry = new Student("Jerry", 98);
        jerry.addQuiz(85);
        jerry.addQuiz(73);
        jerry.addQuiz(55);
        System.out.println(jerry.getTotalScore());
        System.out.println("Expected: 311");
        System.out.println(jerry.getAverageScore());
        System.out.println("Expected: 77.75");
    }
}
