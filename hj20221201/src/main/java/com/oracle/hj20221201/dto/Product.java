package com.oracle.hj20221201.dto;

import lombok.Data;

@Data
public class Product {
	private Long	 pNum;  	//상품번호
	private Long 	 cateNum;   //상품카테고리
	private String   pName;     //상품이름
	private String 	 pPrice;    //상품가격
	private String   pStock;    //상품재고
	private String   pDate;     //상품등록일
	private Long     pHit;      //상품 추천수
}
