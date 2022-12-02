package com.oracle.hj20221201.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MainDaoImpl implements MainDao {
	private final SqlSession session;

}
