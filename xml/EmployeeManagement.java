package xml;
import employee.Display;
import employee.Employee;
import java.util.List;
import java.sql.SQLException;
import java.sql.*;
public class EmployeeManagement {
    public static void main(String[] args) throws SQLException {

        // TODO Auto-generated method stub

        String path = "C:\\Users\\hp\\IdeaProjects\\Sevenx\\src\\xml\\employee.xml";

        List<Employee> employeemanagement = EmployeeXmlParser.parsing(path);
        DatabaseManager.insertEmployees(employeemanagement);
        List<Employee> employeeList = DatabaseManager.fetchEmployees();

        Display.printEmployeeInformation(employeeList);

        }

    }

