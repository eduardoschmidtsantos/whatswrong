package com.whatswrong.validation;

public class IsFalseValidation implements Validation<Boolean> {

    @Override
    public boolean isInvalid(Boolean isFalse) { return isFalse != null && isFalse; }
}
