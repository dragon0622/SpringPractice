package com.estsoft.hispring;

import com.estsoft.hispring.domain.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

class PersonTest {
    @Test
    public void test() {
        Person person = new Person();
        person.setName("name");
        person.setAge(20);

        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getAge = " + person.getAge());
    }

}