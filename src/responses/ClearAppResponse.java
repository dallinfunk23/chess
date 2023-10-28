package responses;

public class ClearAppResponse {

    /**
     * Indicates if the operation was successful.
     */
    private boolean success;

    /**
     * A message providing details or an error description.
     */
    private String message;

    /**
     * Default constructor.
     */
    public ClearAppResponse() {}

    /**
     * Constructs a new ClearAppResponse
     * @param success Indicates if the clear operation was successful
     * @param message Provides details if an error occurs
     */
    public ClearAppResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Getters and setters //

    /**
     * Checks if the operation was successful
     * @return A boolean indicating whether the operation was successful or not.
     */
    public boolean isSuccess() {return success;}


    /**
     * Sets the success status of the operation.
     * @param success A boolean indicating the success status to be set.
     */
    public void setSuccess(boolean success) {this.success = success;}


    /**
     * Retrieves the message associated with the operation.
     * @return The message.
     */
    public String getMessage() {return message;}


    /**
     * Sets the message associated with the operation.
     * @param message The message to be set.
     */
    public void setMessage(String message) {this.message = message;}
}
