package com.whatswrong.demo;

import com.whatswrong.validation.Rules;
import com.whatswrong.validation.Condiction;
import com.whatswrong.validation.Validations;
import com.whatswrong.validation.Validator;

public class DemoValidator implements Validator<Demo> {

    public static final int MAX_LENGTH = 100;

    @Override
    public void validate(Demo demo) {
        Validations.start()
            .add(Rules.isTrue(demo.getBoolean(), "NEEDS TO BE TRUE"))
            .add(Rules.isFalse(false, "NEEDS TO BE FALSE"))
            .add(Rules.notNull(demo.getWord(), "NEEDS TO BE NOT NULL"))
            .add(Rules.notEmpty(demo.getWord(), "NEEDS TO BE NOT EMPTY"))
            .add(Rules.maxLength(demo.getWord(), MAX_LENGTH, "NEEDS TO BE MAX LENGTH" + MAX_LENGTH))
            .add(Rules.greaterThan(demo.getNumber(), MAX_LENGTH, "NEEDS TO BE GREATER THEN" + MAX_LENGTH))
            .add(Condiction.create(demo.getNumber() == null || demo.getNumber() <= 0).validate(Rules.notNull(demo.getObject(), "CONDICTIONAL")))
            .add(Rules.custom(demo, (object) -> demo.getNumber() == null || demo.getNumber() <= 0, "CUSTOM"))
            .evaluateAndThrows();
    }

}