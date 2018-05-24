package validation;

public class MaxLengthValidation implements Validation<String> {

    private Integer maxLength;

    public MaxLengthValidation(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean isInvalid(String value) {
        return value != null && value.length() > maxLength;
    }

}
