package bigjavaearlyobjectsexercisesprojects.chapterten.programmingprojects;

public class DefaultFormatter implements NumberFormatter {

    @Override
    public String format(int integer) {
        return String.valueOf(integer);
    }
}
