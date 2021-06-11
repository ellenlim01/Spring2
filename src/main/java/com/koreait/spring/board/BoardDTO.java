package com.koreait.spring.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
    private int iboard;
    private int iuser;
    private int selType;//0이 기본 리스트, 1:좋아요 리스트
    private int startIdx;
    private int recordCnt;
    private int searchType;
    private String searchText;
}
