import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public void showAllEmployee(List<Employee> list) {
        for (Employee e: list){
            System.out.println(e.getName());
        }
    }
//tìm kiếm tiền lương của nhân viên theo mã nhân viên
    public int salaryCalculate(List<Employee> list, String employeeId) {
        for (Employee e : list) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e.salaryCalculate();
            }
        }
        return 0;
    }

    public void addNewStaff(List<Employee> list, Employee employee) {
        list.add(employee);
    }

    //    private Employee createNewStaff(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao ");
//        Employee employee  = new Employee();
//        return employee;
//    }
    public int averageSalary(List<Employee> list) {
        int total = 0;
        for (Employee e : list) {
            total += e.salaryCalculate();
        }
        return total / list.size();
    }

    public List<Employee> showStaffUnderAverageSalary(List<Employee> list) {
        List<Employee> newList = new ArrayList<Employee>();
        int average = averageSalary(list);
        for (Employee e : list) {
            if (e.salaryCalculate() <= average) {
                newList.add(e);
            }
        }
        return newList;
    }

    public int totalPartTimeSalary(List<Employee> list) {
        int total = 0;
        for (Employee e : list) {
            if (e instanceof PartTimeEmployee) {
                total += e.salaryCalculate();
            }
        }
        return total;
    }

    public List<Employee> fullTimeEmployee(List<Employee> list) {
        List<Employee> newList = new ArrayList<>();
        for (Employee e : list) {
            if (e instanceof FullTimeEmployee) {
                newList.add(e);
            }
        }
        return newList;
    }
//sap xep nhan vien chinh thuc theo luong tang dan
    public List<Employee> sortBySalary(List<Employee> list) {
        List<Employee> newList = fullTimeEmployee(list);
        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i).salaryCalculate() > newList.get(j).salaryCalculate()) {
                    Employee temp = newList.get(i);
                    newList.set(i, newList.get(j));
                    newList.set(j, temp);
                }
            }
        }
        return newList;
    }

}
