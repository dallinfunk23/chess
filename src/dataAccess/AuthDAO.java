package dataAccess;

import models.AuthToken;

import java.util.List;

/**
 * Responsible for handling authentication-related data operations.
 */
public class AuthDAO {

    /**
     * Default constructor.
     */
    public AuthDAO() {

    }

    /**
     * Inserts a new token for a user.
     * @param token  The user's authentication token.
     * @param userId The user ID for the associated user.
     * @throws DataAccessException if there's an error in the data access operation.
     */
    public void insertToken(String token, String userId) throws DataAccessException {

    }

    /**
     * Removes a token, typically during logout.
     * @param token The authentication token to be removed.
     * @throws DataAccessException if there's an error in the data access operation.
     */
    public void deleteToken(String token) throws DataAccessException {

    }

    /**
     * Validates if a given token is still valid.
     * @param token The authentication token to be validated.
     * @return true if the token is valid, false otherwise.
     * @throws DataAccessException if there's an error in the data access operation.
     */
    public boolean validateToken(String token) throws DataAccessException {
        return false;
    }


    /**
     * Clears all data from the database.
     * @throws DataAccessException if there's an error in the data access operation.
     */
    public void clear() throws DataAccessException {

    }
}