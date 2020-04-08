package com.corpse2.example.web.dto;

import com.corpse2.example.domain.posts.Posts;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class PostsResponseDto implements Serializable {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}