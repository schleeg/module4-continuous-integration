package edu.canisius.cyb600.module4.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWord {
    @RequestMapping("/")
    public String helloworld(){
        return "Hello World";
    }
}
