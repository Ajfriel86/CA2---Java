package gnomesltd;

public class EmployeeTest {
    
    // Creates and returns an array of initial Employee objects.
    public static Employee[] getInitialEmployees() {
        // Creating 3 Employee objects
        Employee emp1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee emp2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee emp3 = new Employee("Tom Thumb", "tt@gmail.com");

        // Returns an array containing the three Employee instances.
        return new Employee[]{emp1, emp2, emp3};
    }

    // The main method that executes basic operations to demonstrate Employee management.
    public static void main(String[] args) {
        // Retrieves the initial array of employees.
        Employee[] projectGroup = getInitialEmployees();

        // Prints out the nextEmpNum
        System.out.println("Next available employee number: " + Employee.getNextEmpNum());

        // Search and display employees with empNum above a certain value
        int m = 1;
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName() + " has an employee number above " + m);
            }
        }
    }
}
