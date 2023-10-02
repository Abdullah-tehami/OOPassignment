public class Employee {
    private String employeeID;
    private String name;
    private final static String designation="labAttendant";
    public Employee(String employeeID,String name,String designation){
        this.employeeID=employeeID;
        this.name=name;

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

