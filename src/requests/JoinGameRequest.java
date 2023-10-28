package requests;

import chess.*;
import dataAccess.DataAccessException;

/**
 * Represents the request data required for a user to join a game.
 */
public class JoinGameRequest {

    /**
     * AuthToken of user
     */
    private String authToken;
    /**
     * The unique ID of the game.
     */
    private int gameId;
    /**
     * The color of the user.
     */
    private String playerColor;

    /**
     * Default constructor.
     */
    public JoinGameRequest() { }

    /**
     * JoinGameRequest Explicit Constructor.
     * @param gameId The unique ID of the game.
     * @param authToken The username of the user.
     * @param color Color of user
     */
    public JoinGameRequest(int gameId, String authToken, String color) {
        this.gameId = gameId;
        this.authToken = authToken;
        this.playerColor = color;
    }

    ///   Getters and setters   ///

    /**
     * Retrieves the game ID.
     * @return The game ID.
     */
    public int getGameId() {return gameId;}

    /**
     * Sets the game ID.
     * @param gameId The game ID to be set.
     */
    public void setGameId(int gameId) {this.gameId = gameId;}

    /**
     * Retrieves the username.
     * @return The username.
     */
    public String getAuthToken() {return authToken;}

    /**
     * Sets the username.
     * @param username The username to be set.
     */
    public void setAuthToken(String username) {this.authToken = authToken;}

    /**
     * Set color for the user.
     * @param color of the user
     */
    public void setPlayerColor(String color) {this.playerColor = color;}

    /**
     * Return the color of the user.
     * @return color
     */
    public String getPlayerColor() {return playerColor;}
}