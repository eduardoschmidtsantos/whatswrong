package com.whatswrong.validation;

import com.whatswrong.annotations.ValidatorAnnotationExecutor;
import com.whatswrong.builder.ValidationBuilder;

public class Validations {

    private Validations() {
    }

    public static ValidationBuilder start() {
        return new ValidationBuilder();
    }

    public static void validate(Object object) {
        ValidatorAnnotationExecutor.validate(object);
    }
}
