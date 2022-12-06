package com.oracle.hj20221201.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oracle.hj20221201.dao.MainDao;
import com.oracle.hj20221201.dto.Notice;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {
	private final MainDao md;

	@Override
	public List<Notice> noticeList(Notice note) {
		System.out.println("MainServiceImpl noticeList Start..." );
		List<Notice> noteList = null;
		noteList = md.noteList(note);
		System.out.println("MainServiceImpl noteList.size()--->"+noteList.size());
		return noteList;
	}

}
