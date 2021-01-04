import java.util.List;

public class FullTimeEmployee extends Employee {
    private int bonus;
    private int amercement;
    private int salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String employeeId, String name, String email, int age, int phoneNumber, int bonus, int amercement, int salary) {
        super(employeeId, name, email, age, phoneNumber);
        this.bonus = bonus;
        this.amercement = amercement;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getAmercement() {
        return amercement;
    }

    public void setAmercement(int amercement) {
        this.amercement = amercement;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int salaryCalculate(){
        return (this.salary+this.bonus-this.amercement);
    }

    @Override
    public String toString() {
        return super.toString() +
                "FullTimeEmployee{" +
                "bonus=" + bonus +
                ", amercement=" + amercement +
                ", salary=" + salary +
                '}';
    }

}
