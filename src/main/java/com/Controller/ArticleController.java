package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/")
    public String callBack(){
        System.out.println("消费端");
        return restTemplate.getForObject("http://eureka-client-user-service/",String.class);
    }
}
