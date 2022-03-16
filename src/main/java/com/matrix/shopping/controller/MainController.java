package com.matrix.shopping.controller;

import com.matrix.shopping.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String surname) {
        return "Hello " + surname;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/save")
    public void save(@RequestBody Product product) {
        System.out.println(product);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Product product) {
        System.out.println(product);
    }

    @PatchMapping("/")
    public String change() {
        return "x";
    }

    @DeleteMapping("/")
    public void delete() {

    }
}
