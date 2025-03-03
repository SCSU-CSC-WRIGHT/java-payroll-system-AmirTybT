public class Employee {
    private String name;
    private int employeeID;
    private String department;
    private double hourlyWage;
    private double hoursWorked;

public Employee(String name, int employeeID, String department, double hourlyWage, double hoursWorked) {
    this.name = name;
    this.employeeID = employeeID;
    this.department = department;
    this.hourlyWage = hourlyWage;
    this.hoursWorked = hoursWorked;
}

public String getName() {
    return name;
}

public int getEmployeeID() {
    return employeeID;
}

public String getDepartment() {
    return department;
}

public double getHourlyWage() {
    return hourlyWage;
}

public double getHoursWorked() {
    return hoursWorked;
}

public void setName(String name) {
    this.name = name;
}

public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
}

public void setDepartment(String department) {
    this.department = department;
}

public void setHourlyWage(double hourlyWage) {
    this.hourlyWage = hourlyWage;
}

public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
}

public double calculateWeeklySalary() {
    if (hoursWorked > 40) {
        return (40 * hourlyWage) + ((hoursWorked - 40) * hourlyWage * 1.5);
    } else {
        return hourlyWage * hoursWorked;
    }
}

    @Override
    public String toString() {
        double weeklySalary = calculateWeeklySalary();
        return "Employee{name='" + name + "', employeeId=" + employeeID + 
               ", department='" + department + "', hourlyWage=" + hourlyWage + 
               ", hoursWorked=" + hoursWorked + ", weeklySalary=" + weeklySalary + "}";
    }
}
