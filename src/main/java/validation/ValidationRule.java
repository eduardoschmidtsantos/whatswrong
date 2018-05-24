package validation;

import validation.Validation;

public class ValidationRule<T> {

    private T value;
    private Validation<T> validation;
    private String message;

    public ValidationRule(T value, Validation<T> validation, String message) {
        this.value = value;
        this.validation = validation;
        this.message = message;
    }

    public T getValue() {
        return value;
    }

    public Validation<T> getValidation() {
        return validation;
    }

    public String getMessage() {
        return message;
    }

}
