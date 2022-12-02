package chapterone.practiceexercises;

/**
 * Prints an account's balance in the 1st, 2nd & 3rd year
 * Initial balance is $1000, earns 5% interest per year
 */
public class OnePEFour {
    public static void main(String[] args) {
        double initialBalance = 1000;
        double balanceFirstYear = initialBalance * 1.05;
        System.out.println(balanceFirstYear);
        double balanceSecondYear = balanceFirstYear * 1.05;
        System.out.println(balanceSecondYear);
        double balanceThirdYear = balanceSecondYear * 1.05;
        System.out.println(balanceThirdYear);
    }
}
