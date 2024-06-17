package bigjavaearlyobjectsexercisesprojects.chapternine.practiceexercises;

public class Manager extends Employee {

    private double bonus;
    private String department;

    public Manager(String name, double baseSalary, double bonus, String department) {
        super(name, baseSalary);
        this.bonus = bonus;
        this.department = department;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "bonus=" + bonus +
                ", department='" + department + '\'' +
                '}';
    }
}
