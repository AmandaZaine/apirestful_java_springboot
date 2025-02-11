package com.amandazaine.controller;

import com.amandazaine.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    //Mock para id
    //A classe 'AtomicLong' fornece uma maneira segura de atualizar um valor long de forma atômica em ambientes concorrentes (ambiente multithread).
    //A classe 'LongAdder' pode ser uma alternativa melhor, pois reduz o nível de contenção entre threads.
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
