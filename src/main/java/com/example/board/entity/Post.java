package com.example.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long postId;
    @Column
    Long boardId;
    @Column
    String title;
    @Column
    String content;
}
