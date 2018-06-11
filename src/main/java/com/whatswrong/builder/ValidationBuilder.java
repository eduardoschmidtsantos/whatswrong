package com.whatswrong.builder;

import com.whatswrong.exception.ValidationException;
import com.whatswrong.validation.ValidationRule;

import java.lang.Exception;
import java.lang.NoSuchMethodException;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ValidationBuilder {

    private List<ValidationRule> rules = new ArrayList();

    public ValidationBuilder add(ValidationRule rule) {
        rules.add(rule);
        return this;
    }

    public ValidationBuilder add(List<ValidationRule> rule) {
        rules.addAll(rule);
        return this;
    }

    public List<String> evaluate() {
        List<String> messages = new ArrayList<>();
        for (ValidationRule rule : rules) {
            if (rule.getValidation().isInvalid(rule.getValue())) {
                messages.add(rule.getMessage());
            }
        }
        return messages;
    }

    public void evaluateAndThrows() {
        evaluateAndThrows(ValidationException.class);
    }

    public void evaluateAndThrows(Class<? extends RuntimeException> exception) {
        List<String> messages = evaluate();
        if (!messages.isEmpty()) {
            try {
                throw exception.getConstructor(String.class).newInstance(String.valueOf(messages));
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("Invalid Exception");
            }
        }
    }

}
