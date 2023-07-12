package com.example.practice2.domain.presistence;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne(targetEntity = Board.class)
    private User User;

    private String Title;

    private String Content;
}
