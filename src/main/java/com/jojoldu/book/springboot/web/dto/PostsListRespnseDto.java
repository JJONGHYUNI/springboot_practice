package com.jojoldu.book.springboot.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class PostsListRespnseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListRespnseDto(Posts entity){
        this.id = entity.getId();
        this.title= entity.getTitle();
        this.author=entity.getAuthor();
        this.modifiedDate=entity.getModifiedDate();
    }
}
