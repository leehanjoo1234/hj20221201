package com.oracle.hj20221201.dto;

import lombok.Data;

@Data
public class Member {
	private Long    id; 		 //회원번호
	private String  userName; 	 //회원아이디
	private String  passWord;    //비밀번호
	private String  name;        //회원이름
	private String  callNum;     //전화번호
	private String  proImg;      //프로필사진
	private String  address;     //주소
}
