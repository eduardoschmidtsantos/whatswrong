package com.whatswrong.validation;

public interface Validator<T> {
    void validate(T value);
}
