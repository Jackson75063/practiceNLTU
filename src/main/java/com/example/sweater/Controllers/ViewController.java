package com.example.sweater.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    void kek(){
        System.out.println("kek");
    }

//    @GetMapping("/index")
//    public String mainPage(){
//
//        return "index";
//    }

  /*  @GetMapping("/")
    public String onLOad(){

        kek();
        return "index";
    }*/


    @GetMapping("/prod")
    public String product(){

        return "MyTestFile";
    }

    @GetMapping("/test")
    public String onTest(){

        kek();
        return  "test";
    }

    @GetMapping("/login")
    public String onTest1(){

        kek();
        return  "login";
    }

    @GetMapping("/hello")
    public String onTest2(){

        kek();
        return  "hello";
    }

    @GetMapping("/javatest")
    public String java(){

        return  "javatest";
    }

    @GetMapping("/cshtest")
    public String cSh(){

        return  "cshtest";
    }

    @GetMapping("/cpptest")
    public String cpp(){

        kek();
        return  "cpptest";
    }

}
