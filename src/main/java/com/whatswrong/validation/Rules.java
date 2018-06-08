package com.whatswrong.validation;

import java.util.Collection;

public class Rules {

    private Rules() {}

    public static ValidationRule notNull(Object value, String message) {
        return new ValidationRule(value, new NotNullValidation(), message);
    }

    public static ValidationRule notEmpty(String value, String message) {
        return new ValidationRule(value, new NotEmptyValidation(), message);
    }

    public static ValidationRule notEmpty(Collection<?> value, String message) {
        return new ValidationRule(value, new CollectionNotEmptyValidation(), message);
    }

    public static ValidationRule maxLength(String value, Integer maxLength, String message) {
        return new ValidationRule(value, new MaxLengthValidation(maxLength), message);
    }

    public static ValidationRule greaterThan(Integer value, Integer minValue, String message) {
        return new ValidationRule(value, new IntegerGreaterThanValidation(minValue), message);
    }

    public static ValidationRule isTrue(Boolean value, String message) {
        return new ValidationRule(value, new IsTrueValidation(), message);
    }

    public static ValidationRule isFalse(Boolean value, String message) {
        return new ValidationRule(!value, new IsFalseValidation(), message);
    }

    public static ValidationRule custom(Object value, Validation validation, String message) {
        return new ValidationRule(value, validation, message);
    }
}
