package xml;

import employee.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    public static final String username = "root";
    public static final String password = "sql@2022";
    public static final String url = "jdbc:mysql://localhost:3306/?user=root";

    public static void insertEmployees(List<Employee> ListOfEmployees) {
        // TODO Auto-generated method stub
        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);
            Statement statement = con.createStatement();
            for (Employee em : ListOfEmployees) {
                statement.execute("INSERT INTO `employeemanagement`.`employee` (`employeeId`, `firstName`, `lastName`, `email`, `baseSalary`) VALUES ('" +
                        em.getEmployeeId() + "', '" + em.getFirstName() + "', '" + em.getLastName() + "', '" + em.getEmail() +
                        "', '" + em.getBaseSalary() + "');");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static List<Employee> fetchEmployees() throws SQLException {
        Connection con = DriverManager.getConnection(
                url, username, password);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM employeemanagement.employee;");
        List<Employee> employeeList = new ArrayList<>();

        while (rs.next()) {
            Employee e = new Employee();
            e.setEmployeeId(rs.getInt(1));
            e.setFirstName(rs.getString(2));
            e.setLastName(rs.getString(3));
            e.setEmail(rs.getString(4));
            e.setBaseSalary(rs.getInt(5));

            employeeList.add(e);
        }
        return employeeList;
    }
}