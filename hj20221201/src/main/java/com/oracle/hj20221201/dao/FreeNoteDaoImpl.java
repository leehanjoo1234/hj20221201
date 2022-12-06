package com.oracle.hj20221201.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.oracle.hj20221201.dto.NoticeCateGory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class FreeNoteDaoImpl implements FreeNoteDao {
	private final SqlSession session;

	@Override
	public List<NoticeCateGory> NoticeCateGory() {
		List<NoticeCateGory> NoticeCateGory = null;
		System.out.println("FreeNoteDaoImpl NoticeCateGory Start...");
		try {
			NoticeCateGory = session.selectList("NoticeCateGory");
			System.out.println("FreeNoteDaoImpl NoticeCateGory.size()--> "+NoticeCateGory.size());
		} catch (Exception e) {
			System.out.println("FreeNoteDaoImpl NoticeCateGory e.getMessage()"+e.getMessage());
		}
		
		return NoticeCateGory;
	}
}
