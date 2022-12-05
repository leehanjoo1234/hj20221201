package com.oracle.hj20221201.dto;

import lombok.Data;

@Data
public class Notice {
	private Long   notNum;     //글번호
	private Long   id;         //회원번호
	private String title;      //글제목
	private String content;    //글내용
	private Long   notCaNum;   //글말머리
	private String notDate;    //작성일
	private Long   notView;    //조회수
	private Long   notHit;     //추천수
}
