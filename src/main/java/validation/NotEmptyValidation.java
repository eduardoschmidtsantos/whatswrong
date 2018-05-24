package validation;

public class NotEmptyValidation implements Validation<String> {

    @Override
    public boolean isInvalid(String value) {
        return value == null || value.trim().isEmpty();
    }

}
