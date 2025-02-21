package com.example.hello_rest_api.controllerparam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello" + name + "from bridgeLabz";
    }
    // uc2



}
