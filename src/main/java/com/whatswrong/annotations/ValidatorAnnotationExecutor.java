package com.whatswrong.annotations;

import com.whatswrong.annotations.Validate;
import com.whatswrong.validation.Validator;

public class ValidatorAnnotationExecutor {

    public static void validate(Object object){
        boolean hasValidator = object.getClass().isAnnotationPresent(Validate.class);
        String message = String.format("%s has not a valid validator.", object.getClass().getSimpleName());
        if (!hasValidator) {
            throw new UnsupportedOperationException(message);
        }
        Class<? extends Validator> validator = object.getClass().getAnnotation(Validate.class).validator();
        Validator validatorInstance = null;
        try {
            validatorInstance = validator.newInstance();
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(message);
        } catch (IllegalAccessException e) {
            throw new UnsupportedOperationException(message);
        }
        validatorInstance.validate(object);
    }

}
