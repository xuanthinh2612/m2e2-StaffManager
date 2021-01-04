import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        EmployeeManager employeeManager = new EmployeeManager();

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("ID01","thinh1","thinhMail1",25,12546333,40);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("ID02","thinh2","thinhMail2",26,125465555,35);
        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee("ID03","thinh3","thinhMail3",27,125465777,30);
        FullTimeEmployee fullTimeEmployee4 = new FullTimeEmployee("ID04","thinh4","thinhMail4",28,1254611,5000000,1000000,25000000);
        FullTimeEmployee fullTimeEmployee5 = new FullTimeEmployee("ID05","thinh5","thinhMail5",33,1254622,6000000,3000000,20000000);
        FullTimeEmployee fullTimeEmployee6 = new FullTimeEmployee("ID06","thinh6","thinhMail6",22,12546533,7000000,2000000,15000000);
        employeeManager.addNewStaff(employeeList,partTimeEmployee1);
        employeeManager.addNewStaff(employeeList,partTimeEmployee2);
        employeeManager.addNewStaff(employeeList,partTimeEmployee3);
        employeeManager.addNewStaff(employeeList,fullTimeEmployee4);
        employeeManager.addNewStaff(employeeList,fullTimeEmployee5);
        employeeManager.addNewStaff(employeeList,fullTimeEmployee6);
        List<Employee> list1 = employeeManager.showStaffUnderAverageSalary(employeeList);
        System.out.println(list1);
        System.out.println(employeeManager.totalPartTimeSalary(employeeList));
        int findSa = employeeManager.salaryCalculate(employeeList,"ID05");
        System.out.println(findSa);
        employeeManager.showAllEmployee(employeeList);
        List<Employee> sortList = employeeManager.sortBySalary(employeeList);
        employeeManager.showAllEmployee(sortList);

    }
}
