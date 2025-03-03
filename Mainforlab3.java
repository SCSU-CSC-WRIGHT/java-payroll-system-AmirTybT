public class Mainforlab3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 229, "Engineering", 25.0, 45.0);
        Employee employee2 = new Employee("Jane Smith", 102, "Marketing", 30.0, 40.0);
        Employee employee3 = new Employee("Bob Johnson", 103, "HR", 20.0, 50.0);

        System.out.println(employee1);
        System.out.println("Weekly Salary: " + employee1.calculateWeeklySalary());
        
        System.out.println(employee2);
        System.out.println("Weekly Salary: " + employee2.calculateWeeklySalary());

        System.out.println(employee3);
        System.out.println("Weekly Salary: " + employee3.calculateWeeklySalary());
    }
}
