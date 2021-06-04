package com.koreait.spring.board;

import com.koreait.spring.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDomain> selBoardList();
    BoardDomain selBoard(BoardDTO param);
    int insBoard(UserEntity param);
}
