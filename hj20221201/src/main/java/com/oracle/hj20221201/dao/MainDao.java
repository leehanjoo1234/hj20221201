package com.oracle.hj20221201.dao;

import java.util.List;

import com.oracle.hj20221201.dto.Notice;

public interface MainDao {

	List<Notice>      noteList(Notice note);  //자유게시판 리스트 조회

}
