package com.whatswrong.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardo on 09/12/16.
 */
public class Condiction {

    List<ValidationRule> rules = new ArrayList<>();
    boolean condiction;

    public Condiction(boolean condiction){
        this.condiction = condiction;
    }

    public List<ValidationRule> validate(ValidationRule validationRule) {
        if(condiction){
           rules.add(validationRule);
        }
        return rules;
    }

    public List<ValidationRule> validate(List<ValidationRule> validationRule) {
        if(condiction){
            rules.addAll(validationRule);
        }
        return rules;
    }

    public static Condiction create(boolean condiction){
        return new Condiction(condiction);
    }

}
