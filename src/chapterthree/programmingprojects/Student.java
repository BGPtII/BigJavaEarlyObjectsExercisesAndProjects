package chapterthree.programmingprojects;

public class Student {
    private String name;
    private int totalQuizScore;
    private int totalQuizCount;

    public Student(String studentName) {
        name = studentName;
        totalQuizScore = 0;
        totalQuizCount = 0;
    }

    public Student(String studentName, int quizScore) {
        name = studentName;
        totalQuizScore = quizScore;
        totalQuizCount = 1;
    }

    public String getName() {return name;}

    public void addQuiz(int score) {
        totalQuizScore += score;
        totalQuizCount += 1;
    }

    public int getTotalScore() {return totalQuizScore;}

    public double getAverageScore() {return (double) totalQuizScore / totalQuizCount;}
}
