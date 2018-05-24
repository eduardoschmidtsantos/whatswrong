package validation;

import exception.ValidationException;
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
        List<String> messages = evaluate();
        if (!messages.isEmpty()) {
            throw new ValidationException(messages);
        }
    }

}
