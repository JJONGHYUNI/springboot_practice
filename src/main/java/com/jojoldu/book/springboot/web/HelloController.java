package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON을 반환하는 컨트롤러
public class HelloController {

    @GetMapping("/hello") //HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줌
    public String hello(){
        return "hello";
    }
}
