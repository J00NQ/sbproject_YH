package com.jojoldu.book.springboot.web.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return new StringBuilder(message).reverse().toString();
    }
}
