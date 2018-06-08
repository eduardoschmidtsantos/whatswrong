package com.whatswrong.validation;

public class IsTrueValidation implements Validation<Boolean> {

    @Override
    public boolean isInvalid(Boolean isTrue) { return isTrue == null || !isTrue; }
}
