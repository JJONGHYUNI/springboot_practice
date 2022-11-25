package com.jojoldu.book.springboot.web.dto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;// junit assertThat에 비한 장점은 추가 라이브러리 필요 x , 자동완성이 지원이 더 확실
public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); //assertThat은 검증메소드 ,검증하고 싶은 대상을 메소드 인자로 받음 ,isEqualTo와 함께 사용
        assertThat(dto.getAmount()).isEqualTo(amount); // assertj의 동등 비교 메소드 , assertThat에 있는 값과 비교해서 같을 때만 성공
    }
}
