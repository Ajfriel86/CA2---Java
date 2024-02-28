// Author: Angus Friel
// Email: sba22066@student.cct.ie
// Student Number: sba22066

package gnomesltd;

public class Employee {
    // Creating instance variables for name, email, & empNum
    private String name;
    private String email;
    private int empNum;
    // Static variable to keep track of the next available employee number
    // Ensures each employee gets a unique number
    private static int nextEmpNum = 1;

    // Constructor with default values
    public Employee() {
        this.name = "Default Name";
        this.email = "default@example.com";
        this.empNum = nextEmpNum++;
    }

    // Constructor with parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = isValidEmail(email) ? email : "default@example.com";
        this.empNum = nextEmpNum++;
    }

    // Accessor method to get the name
    public String getName() {
        return name;
    }
    // Accessor method to get the email
    public String getEmail() {
        return email;
    }

    // Accessor method to get the empNum
    public int getEmpNum() {
        return empNum;
    }

    // Method to set the email after validating it
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        }
    }

    // Static method to access nextEmpNum
    public static int getNextEmpNum() {
        return nextEmpNum;
    }

    // Email validation method
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") && email.length() > 3;
    }
}
