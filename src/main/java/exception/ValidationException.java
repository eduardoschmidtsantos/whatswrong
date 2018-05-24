package exception;

import java.util.Arrays;
import java.util.List;

public class ValidationException extends RuntimeException {

    private List<String> messages;

    public ValidationException(List<String> messages) {
        this.messages = messages;
    }

    public ValidationException(String message) {
        this.messages = Arrays.asList(message);
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public String getMessage() {
        return String.valueOf(messages);
    }

}