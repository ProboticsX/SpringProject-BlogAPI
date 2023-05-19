package com.springboot.blog.payload;

import com.springboot.blog.entity.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CommentDto {
    private long id;
    private String name;
    private String email;
    private String body;
}
