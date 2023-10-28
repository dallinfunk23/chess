package responses;

/**
 * Represents the result of a login request.
 */
public class LoginResponse {
    /**
     * The authentication token for the logged-in user.
     */
    private String authToken;
    /**
     * The username of the logged-in user.
     */
    private String username;
    /**
     * The error message.
     */
    private String message;

    /**
     * Default constructor.
     */
    public LoginResponse() { }

    /**
     * Constructs a new LoginResponse indicating success.
     * @param authToken The authentication token for the logged-in user.
     * @param username The username of the logged-in user.
     */
    public LoginResponse(String authToken, String username) {
        this.authToken = authToken;
        this.username = username;
    }

    /**
     * Constructs a new LoginResponse indicating an error.
     * @param message The error message.
     */
    public LoginResponse(String message) {this.message = message;}
}