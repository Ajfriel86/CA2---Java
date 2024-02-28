package gnomesltd;

import java.util.Scanner;

public class MenuSystem {
    // Fields for the company, manager, and scanner for input
    private Company company;
    private Manager manager;
    private Scanner scanner;

    // Constructor initializes the company, manager, and scanner objects
    public MenuSystem(Company company, Manager manager) {
        this.company = company;
        this.manager = manager;
        this.scanner = new Scanner(System.in);
    }

    // The main method to run the menu system
    public static void main(String[] args) {
        // Creating company and manager objects and starting the menu system
        Company company = new Company("Gnómes Ltd");
        Manager manager = new Manager("Manager Name", "manager@example.com", "Gnomeo", "smurf");
        MenuSystem menu = new MenuSystem(company, manager);
        menu.start();
    }

    // Start method to display the main menu and handle user input
    public void start() {
        while (true) {
             // Display the main menu options
            System.out.println("\n=== Gnómes Ltd Management System ===");
            System.out.println("1. Log in as Manager");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice and act accordingly
            int choice = Integer.parseInt(scanner.nextLine());

            // Switch statement to handle user input
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Private method for manager login
    private void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Check credentials and display the appropriate message
        if (manager.getUsername().equals(username) && manager.getPassword().equals(password)) {
            System.out.println("Login successful.");
            showManagerMenu();
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }

    // Method to display the manager's menu and handle choices
    private void showManagerMenu() {
        while (true) {
            System.out.println("\n--- Manager Menu ---");
            System.out.println("1. View Current Staff");
            System.out.println("2. Add New Staff");
            System.out.println("3. Remove Staff");
            System.out.println("4. Logout");

            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            // Switch statment to handle manage input
            switch (choice) {
                case 1:
                    company.listEmployees(0, true);
                    break;
                case 2:
                    addNewStaff();
                    break;
                case 3:
                    listAndRemoveStaff();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to add a new staff member with input validation
    private void addNewStaff() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        Employee newEmployee = new Employee(name, email);
        company.addNewStaff(newEmployee);
    }

    // Method to list all current staff and remove a selected one
    private void listAndRemoveStaff() {
        // List all staff members with their employee numbers
        company.listEmployees(0, true); 
        System.out.print("Enter employee number to remove: ");
        int empNum = Integer.parseInt(scanner.nextLine());
        // Remove the selected employee
        company.removeStaff(empNum);
    }
}
