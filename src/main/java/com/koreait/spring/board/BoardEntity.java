package com.koreait.spring.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnt;
    private String iuser;
    private String regdt;
}