package responses;

public class LogoutResponse {

    /**
     * Message for failure
     */
    private String message;

    /**
     * Default constructor
     */
    public LogoutResponse() {}

    /**
     * Explicit constructor
     * @param message Failure message
     */
    public LogoutResponse(String message) {
        this.message = message;
    }

    /// Getters and setters ///

    /**
     * Get value of message
     * @return Failure message
     */
    public String getMessage() {return message;}
}
