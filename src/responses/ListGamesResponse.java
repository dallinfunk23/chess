package responses;

import requests.ListGamesRequest;
import models.Game;
import java.util.List;

public class ListGamesResponse {

    /**
     * List of games
     */
    private List<Game> games;

    /**
     * Failure message
     */
    private String message;

    /**
     * Success of request, default to true
     */
    private boolean success = true;

    /**
     * Default constructor
     */
    public ListGamesResponse() {}

    /**
     * Constructor for successful responses
     * @param games A list of games
     */
    public ListGamesResponse(List<Game> games) {
        this.games = games;
    }

    /**
     * Constructor for failed responses
     * @param message The message for failure
     */
    public ListGamesResponse(String message) {
        this.message = message;
    }

    /// Getters and setters ///

    /**
     * Set value for games
     * @param games List of games
     */
    public void setGames(List<Game> games) {this.games = games;}

    /**
     * Return the list of games
     * @return List of games
     */
    public List<Game> getGames() {return games;}

    /**
     * Set value of message
     * @param message Failure message
     */
    public void setMessage(String message) {this.message = message;}

    /**
     * Return failure message
     * @return The message
     */
    public String getMessage() {return message;}

    /**
     * Set value of success
     * @param success Success of message
     */
    public void setSuccess(Boolean success) {this.success = success;}

    /**
     * Get value of success
     * @return Value of success
     */
    public boolean getSuccess() {return success;}
}
