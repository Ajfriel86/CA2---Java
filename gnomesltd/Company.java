package gnomesltd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
    private String companyName;
    private List<Employee> staff;
    private Set<Integer> staffSet;  // To track unique employee numbers

    //  Constructor that initializes a new Company instance
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>();
    }

    // Adds a new staff member to the company after validating the email and ensuring uniqueness of the employee number
    public void addNewStaff(Employee employee) {
        // Check for email validity and uniqueness of empNum
        if (employee.getEmail().length() <= 3 || !employee.getEmail().contains("@") || !employee.getEmail().contains(".") || staffSet.contains(employee.getEmpNum())) {
            System.out.println("Cannot add employee. Email is invalid or empNum already exists.");
            return;
        }
        
        // Add the employee to the staff list and the employee number to the tracking set
        staff.add(employee);
        staffSet.add(employee.getEmpNum());  // Track the empNum for uniqueness
        System.out.println("Employee added: " + employee.getName());
    }

    //  Removes an employee from the company based on the employee number
    public void removeStaff(int empNum) {
        Employee employeeToRemove = null;

        // Locate the employee with the given employee number
        for (Employee emp : staff) {
            if (emp.getEmpNum() == empNum) {
                employeeToRemove = emp;
                break;
            }
        }

        // Remove the employee from the staff list
        if (employeeToRemove != null) {
            staff.remove(employeeToRemove);
            staffSet.remove(employeeToRemove.getEmpNum());
            System.out.println("Removed employee with number: " + empNum);
        } else {
            System.out.println("No employee found with number: " + empNum);
        }
    }

    // Retrieves the total number of employees in the company
    public int getStaffNumber() {
        return staff.size();
    }

    // Lists all employees in the company who have an employee number greater than a given value
    // Also displays employee numbers if specified
    public void listEmployees(int empNumValue, boolean showEmpNum) {
        System.out.println("\nListing Current Staff for " + companyName + ":");
        for (Employee emp : staff) {
            if (emp.getEmpNum() > empNumValue) {
                String displayText = showEmpNum ? ("EmpNum: " + emp.getEmpNum() + " - Name: " + emp.getName()) : emp.getName();
                System.out.println(displayText);
            }
        }
    }
}
