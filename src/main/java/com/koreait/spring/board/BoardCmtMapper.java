package com.koreait.spring.board;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardCmtMapper {
    int insBoardCmt(BoardCmtEntity param);
    List<BoardCmtDomain> selBoardCmtList(BoardCmtEntity param);
    int updBoardCmt(BoardCmtEntity param);
    int delBoardCmt(BoardCmtEntity param);
    //interface이기 때문에 public 적어주지 않아도 자동으로 들어감
}
