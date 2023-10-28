package responses;

import requests.CreateGameRequest;

public class CreateGameResponse {

    /**
     * ID for the game
     */
    private int gameID;

    /**
     * Success message
     */
    private String message;

    /**
     * Default constructor.
     */
    public CreateGameResponse() {}

    /**
     * Explicit constructor
     * @param gameID ID given for the game
     * @param message Message for success or failure
     */
    public CreateGameResponse(int gameID, String message) {
        this.gameID = gameID;
        this.message = message;
    }

    /// Getters and setters ///

    /**
     * Set value of the gameID
     * @param gameID Game specific gameID
     */
    public void setAuthToken(int gameID) {this.gameID = gameID;}


    /**
     * Get value of user gameID
     * @return Value of user gameID
     */
    public int getAuthToken() {return gameID;}


    /**
     * Set message for success
     * @param message The message
     */
    public void setMessage(String message) {this.message = message;}


    /**
     * Get success/failure message
     * @return The message
     */
    public String getMessage() {return message;}
}
