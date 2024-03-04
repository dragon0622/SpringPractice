package com.estsoft.hispring.service;

import com.estsoft.hispring.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class HiService {
    public void parseProfile(@RequestBody String value){
        //json -> java obj

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            Person person = objectMapper.readValue(value, Person.class);
            System.out.println("Person = " + person);
        } catch (JsonProcessingException e){{
            System.out.println(e.getMessage());}
        }
}
}
