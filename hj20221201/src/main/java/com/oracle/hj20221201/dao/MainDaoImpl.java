package com.oracle.hj20221201.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.hj20221201.dto.Notice;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MainDaoImpl implements MainDao {
	private final SqlSession session;

	@Override
	public List<Notice> noteList(Notice note) {
		List<Notice> noteList = null;
		System.out.println("MainDaoImpl noteList Start...");
		try {
			noteList = session.selectList("mainNoteList" , note);
			System.out.println("MainDaoImpl noteList.size()-->" + noteList.size() );
		} catch (Exception e) {
			System.out.println("MainDaoImpl noteList e.getMessage()->"+e.getMessage());
		}
		return noteList;
	}

}
