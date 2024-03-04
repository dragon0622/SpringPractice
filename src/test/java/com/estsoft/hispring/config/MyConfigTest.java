package com.estsoft.hispring.config;


import com.estsoft.hispring.controller.HiController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyConfigTest {

    @Test
    void configTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
        HiController hiController1 = (HiController) ac.getBean("hiController");
        HiController hiController2 = (HiController) ac.getBean("hiController");

        assert(hiController1 == hiController2);

        String[] beans = ac.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
