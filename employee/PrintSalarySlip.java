package employee;
import xml.DatabaseManager;
public class PrintSalarySlip {

    public static void printSalary(Employee employee) {
        System.out.println("Name "+employee.getFirstName()+" "+employee.getLastName());
        //System.out.println("Salary "+employee.getSalary());

    }
}
