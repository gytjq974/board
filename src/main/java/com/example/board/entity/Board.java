package com.example.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long boardId;

    @Column
    String boardNm;
}
