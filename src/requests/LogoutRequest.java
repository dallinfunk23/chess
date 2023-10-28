package requests;

public class LogoutRequest {

    /**
     * User authToken
     */
    private String authToken;

    /**
     * Default constructor.
     */
    public LogoutRequest() {}

    /**
     * Explicit constructor
     * @param authToken User authToken
     */
    public LogoutRequest(String authToken) {
        this.authToken = authToken;
    }

    /// Getter ///

    public String getAuthToken() {return authToken;}
}
