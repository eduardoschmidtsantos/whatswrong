package com.whatswrong.validation;

public class IntegerGreaterThanValidation implements Validation<Integer> {

    private Integer minValue;

    public IntegerGreaterThanValidation(Integer minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean isInvalid(Integer value) {
        return value != null && value <= minValue;
    }

}
