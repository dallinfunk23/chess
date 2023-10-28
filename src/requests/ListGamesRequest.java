package requests;

public class ListGamesRequest {

    /**
     * User authToken
     */
    private String authToken;

    /**
     * Default constructor.
     */
    public ListGamesRequest() {}

    /**
     * Creates explicit constructor
     * @param authToken User authToken
     */
    public ListGamesRequest(String authToken) {
        this.authToken = authToken;
    }

    /// Getter and setter ///

    /**
     * Sets value of the authToken
     * @param authToken User authToken
     */
    public void setAuthToken(String authToken) {this.authToken = authToken;}


    /**
     * Returns value of authToken
     * @return Value of authToken
     */
    public String getAuthToken() {return authToken;}
}
