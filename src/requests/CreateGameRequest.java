package requests;

public class CreateGameRequest {

    /**
     * User authToken
     */
    private String authToken;

    /**
     * Name of game
     */
    private String gameName;

    /**
     * Default constructor.
     */
    public CreateGameRequest() {}

    /**
     * Explicit constructor
     * @param authToken AuthToken of user
     * @param gameName Name of the game
     */
    public CreateGameRequest(String authToken, String gameName) {
        this.authToken = authToken;
        this.gameName = gameName;
    }

    /// Getters and setters ///

    /**
     * Set value of the authToken
     * @param authToken User specific authToken
     */
    public void setAuthToken(String authToken) {this.authToken = authToken;}


    /**
     * Get value of user authToken
     * @return Value of user authToken
     */
    public String getAuthToken() {return authToken;}


    /**
     * Set name of the game
     * @param gameName
     */
    public void setGameName(String gameName) {this.gameName = gameName;}


    /**
     * Get name of game
     * @return The name of the game
     */
    public String getGameName() {return gameName;}
}
