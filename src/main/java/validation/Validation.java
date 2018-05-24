package validation;

public interface Validation<T> {

    boolean isInvalid(T value);

}
