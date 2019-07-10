package com.example.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        List <Integer> lol = new ArrayList<>();

        lol.add(1);
        lol.add(22);
        lol.add(22);
        lol.add(22);
        lol.add(333);
        lol.add(333);
        lol.add(4444);
        lol.add(4444);
        lol.add(55555);
        lol.add(666666);
        lol.add(7777777);
        lol.add(88888888);





        Optional<Integer> l =  lol.stream().max(Integer::compareTo);

        int  l1 = l.get();
        System.out.println(l);
        System.out.println(l1);

/*

        for (Integer s : l) {
            System.out.println(s);
        }
*/


    }
}
