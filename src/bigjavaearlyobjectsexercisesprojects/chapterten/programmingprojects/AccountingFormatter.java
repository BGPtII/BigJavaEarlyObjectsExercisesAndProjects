package bigjavaearlyobjectsexercisesprojects.chapterten.programmingprojects;

public class AccountingFormatter implements NumberFormatter {

    @Override
    public String format(int integer) {
        if (integer < 0) {
            return "(" + Math.abs(integer) + ")";
        }
        else {
            return String.valueOf(integer);
        }
    }
}
