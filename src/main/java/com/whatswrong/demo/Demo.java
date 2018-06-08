package com.whatswrong.demo;

import com.whatswrong.annotations.Validate;

import java.util.List;

@Validate(validator = DemoValidator.class)
public class Demo {

    private Integer number;
    private String word;
    private Object object;
    private List<Object> objects;
    private Boolean bool;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    public Boolean getBoolean() {
        return this.bool;
    }

    public void setBoolean(Boolean bool) {
        this.bool = bool;
    }
}
