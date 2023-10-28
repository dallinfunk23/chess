package requests;

/**
 * Represents the request data required for registering a user.
 */
public class RegisterRequest {
    /**
     * The username of the user.
     */
    private String username;
    /**
     * The password of the user.
     */
    private String password;

    /**
     * User email
     */
    private String email;

    /**
     * Default constructor.
     */
    public RegisterRequest() { }

    /**
     * Constructs a new RegisterRequest with the given parameters.
     * @param username The username of the user.
     * @param password The password of the user.
     */
    public RegisterRequest(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Getters and setters

    /**
     * Retrieves the username of a user.
     * @return The username.
     */
    public String getUsername() {return username;}

    /**
     * Sets the username of a user.
     * @param username The username to be set.
     */
    public void setUsername(String username) {this.username = username;}

    /**
     * Retrieves the password of a user.
     * @return The password.
     */
    public String getPassword() {return password;}

    /**
     * Sets the password of a user.
     * @param password The password to be set.
     */
    public void setPassword(String password) {this.password = password;}

    /**
     * Set value for users email
     * @param email User email
     */
    public void setEmail(String email) {this.email = email;}

    /**
     * Get user email
     * @return User email
     */
    public String getEmail() {return email;}
}