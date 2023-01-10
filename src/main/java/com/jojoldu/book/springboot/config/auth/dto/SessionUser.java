package com.jojoldu.book.springboot.config.auth.dto;

import com.jojoldu.book.springboot.domain.user.User;
import lombok.Getter;
import java.io.Serializable;

@Getter
public class SessionUser implements Serializable { //직렬화 추가 없으면 로그인시 500에러 (세션 저장소)
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name=user.getName();
        this.email=user.getEmail();
        this.picture=user.getPicture();
    }
}
