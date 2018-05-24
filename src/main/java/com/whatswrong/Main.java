package com.whatswrong;

import com.whatswrong.demo.Demo;
import com.whatswrong.demo.DemoService;

public class Main {

 public static void main(String[] args){
     Demo demo = new Demo();

     DemoService demoService = new DemoService();

     demoService.save(demo, "");
 }

}
