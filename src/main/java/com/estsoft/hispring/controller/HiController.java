package com.estsoft.hispring.controller;

import com.estsoft.hispring.service.HiService;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {

    private final HiService service;

    public HiController(HiService service)
    {
        this.service = service;
    }


    @GetMapping("/hi")      //localhost:8080/hi 요청이 왔을때 method 호출
    public String hi(@RequestParam(value = "name", defaultValue = "world!") String name){
        return ("Hello " + name);
    }




    @PostMapping("/hi")
    public String testPost(@RequestBody String value){
       service.parseProfile(value);
       return value;
    }
}
