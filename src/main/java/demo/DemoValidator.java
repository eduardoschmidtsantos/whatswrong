package demo;

import validation.Rules;
import validation.ValidationCondiction;
import validation.Validations;
import validation.Validator;

public class DemoValidator implements Validator<Demo> {

    public static final int MAX_LENGTH = 100;

    @Override
    public void validate(Demo demo) {
        Validations.start()
            .add(Rules.notNull(demo.getWord(), "NOT NULL"))
            .add(Rules.notEmpty(demo.getWord(), "NOT EMPTY"))
            .add(Rules.maxLength(demo.getWord(), MAX_LENGTH, "MAX LENGTH"))
            .add(Rules.greaterThan(demo.getNumber(), MAX_LENGTH, "GREATER THEN"))
            .add(ValidationCondiction.create(demo.getNumber() > 0).validate(Rules.notNull(demo.getObject(), "CONDICTIONAL")))
            .add(Rules.custom(demo, (object) -> demo.getNumber() > 0, "CUSTOM"))
            .evaluateAndThrows();
    }

}