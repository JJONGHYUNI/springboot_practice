package com.jojoldu.book.springboot.web;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)//junit 내장된 실행자 외에 springrunner 스프링 실행자 사용
@WebMvcTest(controllers = HelloController.class) //web에 집중할 수 있는 어노테이션 선언 시 , @controller,@controlleradvice 사용가능
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 빈을 주입받음
    private MockMvc mvc; //웹 api를 테스트할 때 사용 , 스프링 MVC테스트의 시작점 , HTTP,GET,POST 등에 대한 API테스트 가능

    @Test
    public void hello() throws Exception{
        String hello = "hello";
        mvc.perform(get("/hello")); // MockMvc를 통해 /hello 주소로 http get요청 ,
        mvc.perform(get("/hello"))
                .andExpect(status().isOk()) //http 상태 검증
                .andExpect(content().string(hello)); //응답 본문의 내용을 검증 , 여기서는 hello가 맞는지 검증
    }
}
