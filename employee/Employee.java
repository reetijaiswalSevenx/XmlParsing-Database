package employee;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
    private static int maxEmployeeId = 0;

    private int employeeId; //each individual employees ki id
    private String firstName;
    private String lastName;
    private String email;
    private int baseSalary;

    public Employee() {
        System.out.println("Default Emloyee Constructor");
        setEmployeeId(++maxEmployeeId); //static variable //maxEmployeeId is count
    }
    public Employee(String firstName,String lastName) //contructor:able to initialize all the parameters of the class. We took static variable. Static variables get the memory only once so if we have any common properties that we want to share in objects, we can use static variable.
    //static variable is a property of a class and non static variable is a property of object.
    {
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail(firstName+lastName+"@sevenx.io");

    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
      /*  if(email == null) {
            setEmail(firstName + "." + lastName + "@sevenx.io");
        }*/
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getSalary() {
        return baseSalary;
    }
}