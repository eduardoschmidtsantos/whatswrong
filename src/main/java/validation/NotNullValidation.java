package validation;

public class NotNullValidation implements Validation<Object> {

    @Override
    public boolean isInvalid(Object value) {
        return value == null;
    }

}
