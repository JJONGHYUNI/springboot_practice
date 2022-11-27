package com.jojoldu.book.springboot.domain.posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter // 클래스 내 모든 필드의 Getter 메소드를 자동 생성
@NoArgsConstructor //기본 생성자 자동 추가 , public Posts(){}와 같은 효과
@Entity  //테이블과 링크될 클래스임을 명시 , 카멜 케이스 이름을 -> 언더스코어 네이밍으로 매칭 ,Setter 메소드는 만들지 않는다.
public class Posts {

    @Id //해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성 규칙 , 스프링 부트 2.0에서는 GenerationType.IDENTITY 옵션 추가해야만 auto_increment 됨
    private  Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 됨 . 사용하는 이유 : 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스를 생성 , 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
}
