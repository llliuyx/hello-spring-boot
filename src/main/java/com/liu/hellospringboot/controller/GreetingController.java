package com.liu.hellospringboot.controller;

import com.liu.hellospringboot.utils.Response;
import com.liu.hellospringboot.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/json")
    public Response json(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting g = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return new Response<Greeting>(Response.CODE_OK, g);
    }

    @GetMapping("/json/{name}")
    public Response pathVariable(@PathVariable String name) {
        Greeting g = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return new Response<Greeting>(Response.CODE_OK, g);
    }
}
