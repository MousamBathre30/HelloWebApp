package com.example.hello_rest_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    // Get Request
    @GetMapping
    public String getHello(){
        return "Hello from mousam";
    }

    // Post Request
    @PostMapping
    public String postHello(){
        return "Hello from BridgeLabz ! (post request)";
    }

    // Put request
    @PutMapping
    public String putHello(){
        return "Hello from Bridge LAbz (put request)";
    }

    // Delete request
    @DeleteMapping
    public String deleteHello(){
        return "Hello from BridgeLabz (Delete Request)";
    }
// uc1
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello" + name + "from bridgeLabz";
    }
    // uc2

    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello " + name + " From BridgeLabz";
    }
    // uc3

}
