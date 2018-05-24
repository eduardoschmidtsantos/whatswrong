package validation;

import validation.ValidationBuilder;

public class Validations {

    private Validations() {}

    public static ValidationBuilder start() {
        return new ValidationBuilder();
    }

}
