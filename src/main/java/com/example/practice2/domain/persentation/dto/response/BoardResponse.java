package com.example.practice2.domain.persentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardResponse {
    private int Id;

    private String name;

    private String Title;

    private String Content;

}
