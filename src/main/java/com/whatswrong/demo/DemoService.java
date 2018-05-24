package com.whatswrong.demo;

import com.whatswrong.annotations.Valid;
import com.whatswrong.validation.Validations;

public class DemoService {


    public void save(@Valid Demo demo, String name){
        System.out.println("hello!");


    }

}
