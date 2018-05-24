package validation;

import java.util.Collection;

public class CollectionNotEmptyValidation implements Validation<Collection<?>> {

    @Override
    public boolean isInvalid(Collection<?> value) {
        return value == null || value.isEmpty();
    }

}
