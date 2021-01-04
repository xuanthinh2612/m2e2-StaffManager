import java.util.List;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String employeeId, String name, String email, int age, int phoneNumber, int workingHours) {
        super(employeeId, name, email, age, phoneNumber);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int salaryCalculate() {
        int salary;
        salary = this.workingHours * 100000;
        return salary;

    }

    @Override
    public String toString() {
        return super.toString() + "PartTimeEmployee{" +
                "workingHours=" + workingHours +
                '}';
    }
}
