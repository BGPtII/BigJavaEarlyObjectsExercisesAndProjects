package bigjavaearlyobjectsexercisesprojects.chapterten.programmingprojects;

public class DecimalSeperatorFormatter implements NumberFormatter {

    @Override
    public String format(int integer) {
        return String.format("%, d", integer);
    }
}
