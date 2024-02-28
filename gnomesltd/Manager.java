package gnomesltd;

//  The Manager class represents a manager in the company, extending the Employee class
// with additional manager-specific fields for username and password.
public class Manager extends Employee {
    // Username for the manager to use in the system.
    private String username;
    // Password for the manager, ideally should be stored securely.
    private String password;

    // Constructs a Manager instance with the specified name, email, username, and password.
    public Manager(String name, String email, String username, String password) {
        super(name, email);
        this.username = username;
        this.password = password;
    }

    // Retrieves the username of the manager.
    public String getUsername() {
        return username;
    }

    // Sets the username of this manager.
    public void setUsername(String username) {
        this.username = username;
    }

    // Retrieves the password of the manager.
    public String getPassword() {
        return password;
    }

    // Sets the password of this manager.
    public void setPassword(String password) {
        this.password = password;
    }
}
