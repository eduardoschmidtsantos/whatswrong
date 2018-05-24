package validation;

public abstract class CustomValidation<T> implements Validation<T> {

    @Override
    public abstract boolean isInvalid(T value);

}
